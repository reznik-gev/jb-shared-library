def call(String command = "echo hello"){
    script {
        if (isUnix()) {
            echo "running command '${command}' in 'sh'"
            sh command
        }
        else {
            echo "running command '${command}' in 'bat'"
            bat command
        }
    }
}
