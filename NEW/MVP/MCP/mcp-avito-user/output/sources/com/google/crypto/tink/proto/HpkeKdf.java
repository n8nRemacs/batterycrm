package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.Internal;

/* loaded from: classes6.dex */
public enum HpkeKdf implements Internal.EnumLite {
    KDF_UNKNOWN(0),
    HKDF_SHA256(1),
    HKDF_SHA384(2),
    HKDF_SHA512(3),
    UNRECOGNIZED(-1);

    public static final int HKDF_SHA256_VALUE = 1;
    public static final int HKDF_SHA384_VALUE = 2;
    public static final int HKDF_SHA512_VALUE = 3;
    public static final int KDF_UNKNOWN_VALUE = 0;
    private static final Internal.EnumLiteMap<HpkeKdf> internalValueMap = new Internal.EnumLiteMap<HpkeKdf>() { // from class: com.google.crypto.tink.proto.HpkeKdf.1
        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap
        public HpkeKdf findValueByNumber(int i12) {
            return HpkeKdf.forNumber(i12);
        }
    };
    private final int value;

    public static final class HpkeKdfVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new HpkeKdfVerifier();

        private HpkeKdfVerifier() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i12) {
            return HpkeKdf.forNumber(i12) != null;
        }
    }

    HpkeKdf(int i12) {
        this.value = i12;
    }

    public static HpkeKdf forNumber(int i12) {
        if (i12 == 0) {
            return KDF_UNKNOWN;
        }
        if (i12 == 1) {
            return HKDF_SHA256;
        }
        if (i12 == 2) {
            return HKDF_SHA384;
        }
        if (i12 != 3) {
            return null;
        }
        return HKDF_SHA512;
    }

    public static Internal.EnumLiteMap<HpkeKdf> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return HpkeKdfVerifier.INSTANCE;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static HpkeKdf valueOf(int i12) {
        return forNumber(i12);
    }
}
