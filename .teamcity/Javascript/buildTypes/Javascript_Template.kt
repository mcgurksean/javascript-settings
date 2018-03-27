package Javascript.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script

object Javascript_Template : Template({
    uuid = "79fef0a9-099f-4566-87e8-332f92c1a2a5"
    extId = "Javascript_Template"
    name = "Template"

    vcs {
        root(Javascript.vcsRoots.Javascript_HttpsGithubComG0t4teamcityCourseCards)

    }

    steps {
        script {
            name = "Restore NPM Packages"
            id = "RUNNER_8"
            scriptContent = "npm install"
        }
        script {
            name = "Browser Tests"
            id = "RUNNER_9"
            scriptContent = "npm test -- --single-run --browsers %Browser% --colors false"
        }
    }
})
