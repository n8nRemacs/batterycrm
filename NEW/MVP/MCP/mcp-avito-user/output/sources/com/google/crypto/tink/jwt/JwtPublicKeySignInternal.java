package com.google.crypto.tink.jwt;

import aZ0.j;
import java.util.Optional;

@j
/* loaded from: classes6.dex */
public interface JwtPublicKeySignInternal {
    String signAndEncodeWithKid(RawJwt rawJwt, Optional<String> optional);
}
