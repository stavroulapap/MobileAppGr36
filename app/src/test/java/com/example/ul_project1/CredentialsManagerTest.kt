package com.example.ul_project1
import org.junit.Assert.*
import org.junit.Test

class CredentialsManagerTest {

/////for email

    @Test
    //fun 'Given empty mail, then return false'(){
    fun givenEmptyEmail_thenReturnFalse() {
        val credentialsManager = CredentialsManager()
        val email=""

        val result=credentialsManager.isEmailValid(email)
        assertFalse(result)
    }



    @Test
    fun givenWrongEmailFormat_thenReturnFalse() {
        val credentialsManager = CredentialsManager()
        val email="not an email"

        val result=credentialsManager.isEmailValid(email)
        assertFalse(result)

    }

    @Test
    fun givenProperEmailFormat_thenReturnTrue() {
        val credentialsManager = CredentialsManager()
        val email="email@te.st"

        val result=credentialsManager.isEmailValid(email)
        assertTrue(result)
    }
}


///for password

////for login
@Test
fun givenWrongCredentials_thenReturnFalse(){
    val credentialsManager= CredentialsManager()
    val email="Not an user"
    val password="Not a password"

    val result=credentialsManager.login(email,password)
    assertFalse(result)


}

@Test
fun givenFixedCredentials_thenReturnTrue(){
    val credentialsManager= CredentialsManager()
    val email="Not an user"
    val password="Not a password"

    val result=credentialsManager.login(email,password)
    assertFalse(result)


}