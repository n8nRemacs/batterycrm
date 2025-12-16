package com.google.crypto.tink.jwt;

import aZ0.j;
import java.util.Optional;

@j
/* loaded from: classes6.dex */
public interface JwtPublicKeyVerifyInternal {
    VerifiedJwt verifyAndDecodeWithKid(String str, JwtValidator jwtValidator, Optional<String> optional);
}
