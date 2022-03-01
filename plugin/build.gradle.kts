plugins {
  groovy
  `java-library`
}

dependencies {
  implementation("org.ow2.asm:asm:6.0")
  implementation("org.ow2.asm:asm-util:6.0")
  implementation("org.jdom:jdom2:2.0.5")
  implementation("jaxen:jaxen:1.1.6")
  implementation("com.squareup:javapoet:1.11.1")
  implementation("com.android.tools.build:gradle:3.0.1")
  implementation(project(":api"))
//  implementation(Libs.SAMPLE_API)
}