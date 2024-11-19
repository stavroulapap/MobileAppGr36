package com.example.ul_project1
import org.junit.Assert.*
import org.junit.Test

class CredentialsManagerTest {

///////////////////for email

    @Test
    fun givenEmptyEmail_thenReturnFalse() {
        val credentialsManager = CredentialsManager()
        val email = ""
        val result = credentialsManager.isEmailValid(email)
        assertFalse(result)
    }

    @Test
    fun givenWrongEmailFormat_thenReturnFalse() {
        val credentialsManager = CredentialsManager()
        val email = "not an email"
        val result = credentialsManager.isEmailValid(email)
        assertFalse(result)
     }

    @Test
    fun givenProperEmailFormat_thenReturnTrue() {
        val credentialsManager = CredentialsManager()
        val email = "email@te.st"
        val result = credentialsManager.isEmailValid(email)
        assertTrue(result)
    }

////////////////for password

    @Test
    fun givenEmptyPassword_thenReturnError() {
        val credentialsManager = CredentialsManager()
        val emptyPassword = ""
        val result = credentialsManager.isPasswordValid(emptyPassword)
        assertFalse("Password is empty, should return false", result)
    }

    @Test
    fun givenNonEmptyPassword_thenReturnSuccess() {
        val credentialsManager = CredentialsManager()
        val nonEmptyPassword = "Abc123@#"
        val result = credentialsManager.isPasswordValid(nonEmptyPassword)
        assertTrue("Password is valid, should return true", result)
    }


    /////////////for login
    @Test
    fun givenWrongCredentials_thenReturnFalse() {
        val credentialsManager = CredentialsManager()
        val email = "Not an user"
        val password = "Not a password"
        val result = credentialsManager.login(email, password)
        assertFalse(result)
    }

    @Test
    fun givenFixedCredentials_thenReturnTrue() {
        val credentialsManager = CredentialsManager()
        //val email = "test@example.com"
        val email = "test"
        val password = "1234"
        val result = credentialsManager.login(email, password)
        assertTrue(result)
    }
}