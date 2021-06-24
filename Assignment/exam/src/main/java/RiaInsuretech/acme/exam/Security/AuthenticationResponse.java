package RiaInsuretech.acme.exam.Security;

import java.io.Serializable;

public class AuthenticationResponse implements Serializable {
    private final String Jwt;

    public AuthenticationResponse(String jwt) {
        Jwt = jwt;
    }

    public String getJwt() {
        return Jwt;
    }

}
