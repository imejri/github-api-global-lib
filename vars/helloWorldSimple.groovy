
//def call(String name, String dayOfWeek) {
  def call() {
  //sh "echo Hello World ${name}. It is ${dayOfWeek}."
  def BUILD_FOLDER='/infra/build/'
  sh "echo the biuild directory is ${BUILD_FOLDER}"
  sh "echo ${env.WORKSPACE}"
  sh "echo the build run in ${NODE_NAME}"
  echo "*****************"
  sh "echo ${BUILD_FOLDER}"
  echo "*****************"
}
