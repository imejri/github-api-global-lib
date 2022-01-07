
def call(String name, String dayOfWeek) {
  sh "echo Hello World ${name}. It is ${dayOfWeek}."
  def BUILD_FOLDER='/infra/build/'
  sh "echo ${env.WORKSPACE}"
  echo "*****************"
  sh "echo ${BUILD_FOLDER}"
  echo "*****************"
}
