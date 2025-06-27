def call(String imagename,String port, String containername){
  sh "docker run -d -p ${port}:${port} --name ${containername} ${imagename}:latest"
}
