package com.google.crypto.tink.jwt;

import aZ0.j;

@j
/* loaded from: classes6.dex */
public interface JwtMac {
    String computeMacAndEncode(RawJwt rawJwt);

    VerifiedJwt verifyMacAndDecode(String str, JwtValidator jwtValidator);
}
