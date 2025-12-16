package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.Internal;

/* loaded from: classes6.dex */
public enum JwtRsaSsaPkcs1Algorithm implements Internal.EnumLite {
    RS_UNKNOWN(0),
    RS256(1),
    RS384(2),
    RS512(3),
    UNRECOGNIZED(-1);

    public static final int RS256_VALUE = 1;
    public static final int RS384_VALUE = 2;
    public static final int RS512_VALUE = 3;
    public static final int RS_UNKNOWN_VALUE = 0;
    private static final Internal.EnumLiteMap<JwtRsaSsaPkcs1Algorithm> internalValueMap = new Internal.EnumLiteMap<JwtRsaSsaPkcs1Algorithm>() { // from class: com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm.1
        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap
        public JwtRsaSsaPkcs1Algorithm findValueByNumber(int i12) {
            return JwtRsaSsaPkcs1Algorithm.forNumber(i12);
        }
    };
    private final int value;

    public static final class JwtRsaSsaPkcs1AlgorithmVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new JwtRsaSsaPkcs1AlgorithmVerifier();

        private JwtRsaSsaPkcs1AlgorithmVerifier() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i12) {
            return JwtRsaSsaPkcs1Algorithm.forNumber(i12) != null;
        }
    }

    JwtRsaSsaPkcs1Algorithm(int i12) {
        this.value = i12;
    }

    public static JwtRsaSsaPkcs1Algorithm forNumber(int i12) {
        if (i12 == 0) {
            return RS_UNKNOWN;
        }
        if (i12 == 1) {
            return RS256;
        }
        if (i12 == 2) {
            return RS384;
        }
        if (i12 != 3) {
            return null;
        }
        return RS512;
    }

    public static Internal.EnumLiteMap<JwtRsaSsaPkcs1Algorithm> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return JwtRsaSsaPkcs1AlgorithmVerifier.INSTANCE;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static JwtRsaSsaPkcs1Algorithm valueOf(int i12) {
        return forNumber(i12);
    }
}
