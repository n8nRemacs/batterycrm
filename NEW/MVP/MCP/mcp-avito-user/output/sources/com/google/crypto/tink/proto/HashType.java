package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.Internal;

/* loaded from: classes6.dex */
public enum HashType implements Internal.EnumLite {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);

    public static final int SHA1_VALUE = 1;
    public static final int SHA224_VALUE = 5;
    public static final int SHA256_VALUE = 3;
    public static final int SHA384_VALUE = 2;
    public static final int SHA512_VALUE = 4;
    public static final int UNKNOWN_HASH_VALUE = 0;
    private static final Internal.EnumLiteMap<HashType> internalValueMap = new Internal.EnumLiteMap<HashType>() { // from class: com.google.crypto.tink.proto.HashType.1
        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap
        public HashType findValueByNumber(int i12) {
            return HashType.forNumber(i12);
        }
    };
    private final int value;

    public static final class HashTypeVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new HashTypeVerifier();

        private HashTypeVerifier() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i12) {
            return HashType.forNumber(i12) != null;
        }
    }

    HashType(int i12) {
        this.value = i12;
    }

    public static HashType forNumber(int i12) {
        if (i12 == 0) {
            return UNKNOWN_HASH;
        }
        if (i12 == 1) {
            return SHA1;
        }
        if (i12 == 2) {
            return SHA384;
        }
        if (i12 == 3) {
            return SHA256;
        }
        if (i12 == 4) {
            return SHA512;
        }
        if (i12 != 5) {
            return null;
        }
        return SHA224;
    }

    public static Internal.EnumLiteMap<HashType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return HashTypeVerifier.INSTANCE;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static HashType valueOf(int i12) {
        return forNumber(i12);
    }
}
