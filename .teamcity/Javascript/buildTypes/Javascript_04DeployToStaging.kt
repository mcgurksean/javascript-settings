package Javascript.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Javascript_04DeployToStaging : BuildType({
    uuid = "a3715ff7-89c5-492e-a499-b09caba32ade"
    extId = "Javascript_04DeployToStaging"
    name = "04. Deploy to staging"

    vcs {
        root(Javascript.vcsRoots.Javascript_HttpsGithubComG0t4teamcityCourseCards)

    }

    dependencies {
        dependency(Javascript.buildTypes.Javascript_02Chrome) {
            snapshot {
            }
        }
        dependency(Javascript.buildTypes.Javascript_03Firefox) {
            snapshot {
            }
        }
    }
})
