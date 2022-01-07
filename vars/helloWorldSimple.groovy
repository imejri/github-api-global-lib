def call(String name, String dayOfWeek) {
  sh "echo Hello World ${name}. It is ${dayOfWeek}."
  sh "echo ${env.WORKSPACE}"
  echo "*****************"
  sh "echo ${BUILD_FOLDER}"
  echo "*****************"
}
