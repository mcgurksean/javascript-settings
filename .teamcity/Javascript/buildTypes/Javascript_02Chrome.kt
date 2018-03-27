package Javascript.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Javascript_02Chrome : BuildType({
    template(Javascript.buildTypes.Javascript_Template)
    uuid = "7a52feb4-ad1f-43cc-b84f-4c2558e4536c"
    extId = "Javascript_02Chrome"
    name = "02. Chrome"

    params {
        param("Browser", "Chrome")
    }

    dependencies {
        dependency(Javascript.buildTypes.Javascript_01FastTests) {
            snapshot {
            }
        }
    }
})
