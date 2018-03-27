package Javascript.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*

object Javascript_01FastTests : BuildType({
    template(Javascript.buildTypes.Javascript_Template)
    uuid = "d7434f2e-2cff-43c4-891f-2f16a22a23f7"
    extId = "Javascript_01FastTests"
    name = "01. Fast Tests"

    params {
        param("Browser", "PhantomJS")
    }
})
