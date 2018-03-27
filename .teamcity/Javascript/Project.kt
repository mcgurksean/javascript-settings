package Javascript

import Javascript.buildTypes.*
import Javascript.vcsRoots.*
import Javascript.vcsRoots.Javascript_HttpsGithubComMcgurkseanJavascriptSettingsGit
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.VersionedSettings.*
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.versionedSettings

object Project : Project({
    uuid = "906dd0d0-349b-43ab-b4d8-72e5ad08702e"
    extId = "Javascript"
    parentId = "_Root"
    name = "Javascript"

    vcsRoot(Javascript_HttpsGithubComMcgurkseanJavascriptSettingsGit)
    vcsRoot(Javascript_HttpsGithubComG0t4teamcityCourseCards)

    buildType(Javascript_03Firefox)
    buildType(Javascript_01FastTests)
    buildType(Javascript_04DeployToStaging)
    buildType(Javascript_02Chrome)

    template(Javascript_Template)

    features {
        versionedSettings {
            id = "PROJECT_EXT_1"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.USE_CURRENT_SETTINGS
            rootExtId = Javascript_HttpsGithubComMcgurkseanJavascriptSettingsGit.extId
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
        }
    }
})
