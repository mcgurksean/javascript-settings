package Javascript.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Javascript_03Firefox : BuildType({
    template(Javascript.buildTypes.Javascript_Template)
    uuid = "d55dadea-b04f-41e9-947f-36d602d0c8f7"
    extId = "Javascript_03Firefox"
    name = "03. Firefox"

    params {
        param("Browser", "Firefox")
    }

    dependencies {
        dependency(Javascript.buildTypes.Javascript_01FastTests) {
            snapshot {
            }
        }
    }
})
