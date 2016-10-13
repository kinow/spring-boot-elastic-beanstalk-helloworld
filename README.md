A Spring Boot application ready to be deployed to Elastic Beanstalk via the command line.

## Package

`mvn clean package`

## Deploy

`eb deploy nameof-env --profile name-of-profile`

The command will keep running until the environment has been updated and is in a Green (hopefully) state.

## AWS EB ebextensions

It contains an example with ebextensions as well. This way you can customize your environment.
