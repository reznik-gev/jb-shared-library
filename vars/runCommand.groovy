def call(String command = "echo hello"){
    script {
        if (isUnix()) {
            sh command
        }
        else {
            bat command
        }
    }
}
