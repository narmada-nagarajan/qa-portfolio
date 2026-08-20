# Test Case Document: Login Functionality

**Application Under Test:** Sample E-Commerce Web App (SauceDemo)
**Module:** User Authentication
**Prepared by:** Narmada Nagarajan
**Test Environment:** Web (Chrome, Firefox)

| Test Case ID | Test Scenario | Test Steps | Test Data | Expected Result | Priority |
|---|---|---|---|---|---|
| TC_LOGIN_001 | Verify successful login with valid credentials | 1. Navigate to login page<br>2. Enter valid username<br>3. Enter valid password<br>4. Click Login button | Username: `standard_user`<br>Password: `secret_sauce` | User is redirected to the products/dashboard page | High |
| TC_LOGIN_002 | Verify login fails with invalid password | 1. Navigate to login page<br>2. Enter valid username<br>3. Enter incorrect password<br>4. Click Login button | Username: `standard_user`<br>Password: `wrong_pass` | Error message displayed: "Username and password do not match" | High |
| TC_LOGIN_003 | Verify login fails with blank username | 1. Navigate to login page<br>2. Leave username field blank<br>3. Enter valid password<br>4. Click Login button | Username: *(blank)*<br>Password: `secret_sauce` | Error message displayed: "Username is required" | Medium |
| TC_LOGIN_004 | Verify login fails with blank password | 1. Navigate to login page<br>2. Enter valid username<br>3. Leave password field blank<br>4. Click Login button | Username: `standard_user`<br>Password: *(blank)* | Error message displayed: "Password is required" | Medium |
| TC_LOGIN_005 | Verify locked-out user cannot log in | 1. Navigate to login page<br>2. Enter locked-out username<br>3. Enter valid password<br>4. Click Login button | Username: `locked_out_user`<br>Password: `secret_sauce` | Error message displayed: "Sorry, this user has been locked out" | High |
| TC_LOGIN_006 | Verify password field masks input | 1. Navigate to login page<br>2. Enter password in password field | Password: `secret_sauce` | Characters are masked (displayed as dots/asterisks) | Low |
| TC_LOGIN_007 | Verify login page UI elements are present | 1. Navigate to login page | N/A | Username field, password field, and Login button are visible | Low |

## Notes
- This is a sample test case document created for portfolio purposes, based on the public SauceDemo practice site (saucedemo.com).
- Test data shown here is publicly published sample/demo data for the practice site, not confidential client information.
- In real project work, test cases followed the same structure documented in HP ALM / Qtest, mapped to requirement IDs via a traceability matrix.
