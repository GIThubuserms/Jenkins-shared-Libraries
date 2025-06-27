def call(String imagename){
  sh "sudo docker build -t ${imagename} ."
}
