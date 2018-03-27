package Javascript.vcsRoots

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.vcs.GitVcsRoot

object Javascript_HttpsGithubComMcgurkseanJavascriptSettingsGit : GitVcsRoot({
    uuid = "0f964bca-be5a-41b9-947d-65deafc96556"
    extId = "Javascript_HttpsGithubComMcgurkseanJavascriptSettingsGit"
    name = "https://github.com/mcgurksean/javascript-settings.git"
    url = "https://github.com/mcgurksean/javascript-settings.git"
    authMethod = password {
        userName = "mcgurksean"
        password = "zxx2338469c4dd99d93775d03cbe80d301b"
    }
})
