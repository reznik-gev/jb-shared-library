def call(string dockerfilePath = "Dockerfile") {
  runCommand("docker build -t myapp -f ${dockerfilePath} ."}
}
