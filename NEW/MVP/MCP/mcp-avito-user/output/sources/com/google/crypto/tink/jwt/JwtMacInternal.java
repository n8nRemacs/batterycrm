package com.google.crypto.tink.jwt;

import aZ0.j;
import java.util.Optional;

@j
/* loaded from: classes6.dex */
interface JwtMacInternal {
    String computeMacAndEncodeWithKid(RawJwt rawJwt, Optional<String> optional);

    VerifiedJwt verifyMacAndDecodeWithKid(String str, JwtValidator jwtValidator, Optional<String> optional);
}
