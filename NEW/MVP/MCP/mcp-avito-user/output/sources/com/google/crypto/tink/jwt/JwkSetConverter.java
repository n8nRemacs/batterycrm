package com.google.crypto.tink.jwt;

import AK.c;
import I41.h;
import aZ0.l;
import androidx.appcompat.app.r;
import androidx.compose.ui.graphics.colorspace.e;
import com.google.crypto.tink.Key;
import com.google.crypto.tink.KeyStatus;
import com.google.crypto.tink.KeysetHandle;
import com.google.crypto.tink.internal.LegacyProtoKey;
import com.google.crypto.tink.internal.ProtoKeySerialization;
import com.google.crypto.tink.proto.JwtEcdsaAlgorithm;
import com.google.crypto.tink.proto.JwtEcdsaPublicKey;
import com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm;
import com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey;
import com.google.crypto.tink.proto.JwtRsaSsaPssAlgorithm;
import com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.subtle.Base64;
import com.google.crypto.tink.tinkkey.KeyAccess;
import com.google.gson.f;
import com.google.gson.i;
import com.google.gson.internal.x;
import com.google.gson.k;
import com.google.gson.m;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Optional;

/* loaded from: classes6.dex */
public final class JwkSetConverter {
    private static final String JWT_ECDSA_PUBLIC_KEY_URL = "type.googleapis.com/google.crypto.tink.JwtEcdsaPublicKey";
    private static final String JWT_RSA_SSA_PKCS1_PUBLIC_KEY_URL = "type.googleapis.com/google.crypto.tink.JwtRsaSsaPkcs1PublicKey";
    private static final String JWT_RSA_SSA_PSS_PUBLIC_KEY_URL = "type.googleapis.com/google.crypto.tink.JwtRsaSsaPssPublicKey";

    /* renamed from: com.google.crypto.tink.jwt.JwkSetConverter$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$JwtEcdsaAlgorithm;
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$JwtRsaSsaPkcs1Algorithm;
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$JwtRsaSsaPssAlgorithm;

        static {
            int[] iArr = new int[JwtRsaSsaPssAlgorithm.values().length];
            $SwitchMap$com$google$crypto$tink$proto$JwtRsaSsaPssAlgorithm = iArr;
            try {
                iArr[JwtRsaSsaPssAlgorithm.PS256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$JwtRsaSsaPssAlgorithm[JwtRsaSsaPssAlgorithm.PS384.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$JwtRsaSsaPssAlgorithm[JwtRsaSsaPssAlgorithm.PS512.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[JwtRsaSsaPkcs1Algorithm.values().length];
            $SwitchMap$com$google$crypto$tink$proto$JwtRsaSsaPkcs1Algorithm = iArr2;
            try {
                iArr2[JwtRsaSsaPkcs1Algorithm.RS256.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$JwtRsaSsaPkcs1Algorithm[JwtRsaSsaPkcs1Algorithm.RS384.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$JwtRsaSsaPkcs1Algorithm[JwtRsaSsaPkcs1Algorithm.RS512.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[JwtEcdsaAlgorithm.values().length];
            $SwitchMap$com$google$crypto$tink$proto$JwtEcdsaAlgorithm = iArr3;
            try {
                iArr3[JwtEcdsaAlgorithm.ES256.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$JwtEcdsaAlgorithm[JwtEcdsaAlgorithm.ES384.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$JwtEcdsaAlgorithm[JwtEcdsaAlgorithm.ES512.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    private JwkSetConverter() {
    }

    private static k convertJwtEcdsaKey(ProtoKeySerialization protoKeySerialization) throws GeneralSecurityException {
        String str;
        String str2;
        try {
            JwtEcdsaPublicKey from = JwtEcdsaPublicKey.parseFrom(protoKeySerialization.getValue(), ExtensionRegistryLite.getEmptyRegistry());
            int i12 = AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$JwtEcdsaAlgorithm[from.getAlgorithm().ordinal()];
            if (i12 == 1) {
                str = "ES256";
                str2 = "P-256";
            } else if (i12 == 2) {
                str = "ES384";
                str2 = "P-384";
            } else {
                if (i12 != 3) {
                    throw new GeneralSecurityException("unknown algorithm");
                }
                str = "ES512";
                str2 = "P-521";
            }
            k kVar = new k();
            kVar.y("kty", "EC");
            kVar.y("crv", str2);
            kVar.y("x", Base64.urlSafeEncode(from.getX().toByteArray()));
            kVar.y("y", Base64.urlSafeEncode(from.getY().toByteArray()));
            kVar.y("use", "sig");
            kVar.y("alg", str);
            f fVar = new f();
            fVar.v("verify");
            kVar.t("key_ops", fVar);
            Optional<String> kid = getKid(protoKeySerialization.getIdRequirementOrNull());
            if (kid.isPresent()) {
                kVar.y("kid", kid.get());
            } else if (from.hasCustomKid()) {
                kVar.y("kid", from.getCustomKid().getValue());
            }
            return kVar;
        } catch (InvalidProtocolBufferException e12) {
            throw new GeneralSecurityException("failed to parse value as JwtEcdsaPublicKey proto", e12);
        }
    }

    private static k convertJwtRsaSsaPkcs1(ProtoKeySerialization protoKeySerialization) throws GeneralSecurityException {
        String str;
        try {
            JwtRsaSsaPkcs1PublicKey from = JwtRsaSsaPkcs1PublicKey.parseFrom(protoKeySerialization.getValue(), ExtensionRegistryLite.getEmptyRegistry());
            int i12 = AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$JwtRsaSsaPkcs1Algorithm[from.getAlgorithm().ordinal()];
            if (i12 == 1) {
                str = "RS256";
            } else if (i12 == 2) {
                str = "RS384";
            } else {
                if (i12 != 3) {
                    throw new GeneralSecurityException("unknown algorithm");
                }
                str = "RS512";
            }
            k kVar = new k();
            kVar.y("kty", "RSA");
            kVar.y("n", Base64.urlSafeEncode(from.getN().toByteArray()));
            kVar.y("e", Base64.urlSafeEncode(from.getE().toByteArray()));
            kVar.y("use", "sig");
            kVar.y("alg", str);
            f fVar = new f();
            fVar.v("verify");
            kVar.t("key_ops", fVar);
            Optional<String> kid = getKid(protoKeySerialization.getIdRequirementOrNull());
            if (kid.isPresent()) {
                kVar.y("kid", kid.get());
            } else if (from.hasCustomKid()) {
                kVar.y("kid", from.getCustomKid().getValue());
            }
            return kVar;
        } catch (InvalidProtocolBufferException e12) {
            throw new GeneralSecurityException("failed to parse value as JwtRsaSsaPkcs1PublicKey proto", e12);
        }
    }

    private static k convertJwtRsaSsaPss(ProtoKeySerialization protoKeySerialization) throws GeneralSecurityException {
        String str;
        try {
            JwtRsaSsaPssPublicKey from = JwtRsaSsaPssPublicKey.parseFrom(protoKeySerialization.getValue(), ExtensionRegistryLite.getEmptyRegistry());
            int i12 = AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$JwtRsaSsaPssAlgorithm[from.getAlgorithm().ordinal()];
            if (i12 == 1) {
                str = "PS256";
            } else if (i12 == 2) {
                str = "PS384";
            } else {
                if (i12 != 3) {
                    throw new GeneralSecurityException("unknown algorithm");
                }
                str = "PS512";
            }
            k kVar = new k();
            kVar.y("kty", "RSA");
            kVar.y("n", Base64.urlSafeEncode(from.getN().toByteArray()));
            kVar.y("e", Base64.urlSafeEncode(from.getE().toByteArray()));
            kVar.y("use", "sig");
            kVar.y("alg", str);
            f fVar = new f();
            fVar.v("verify");
            kVar.t("key_ops", fVar);
            Optional<String> kid = getKid(protoKeySerialization.getIdRequirementOrNull());
            if (kid.isPresent()) {
                kVar.y("kid", kid.get());
            } else if (from.hasCustomKid()) {
                kVar.y("kid", from.getCustomKid().getValue());
            }
            return kVar;
        } catch (InvalidProtocolBufferException e12) {
            throw new GeneralSecurityException("failed to parse value as JwtRsaSsaPssPublicKey proto", e12);
        }
    }

    private static ProtoKeySerialization convertToEcdsaKey(k kVar) throws GeneralSecurityException {
        JwtEcdsaAlgorithm jwtEcdsaAlgorithm;
        String stringItem = getStringItem(kVar, "alg");
        stringItem.getClass();
        switch (stringItem) {
            case "ES256":
                expectStringItem(kVar, "crv", "P-256");
                jwtEcdsaAlgorithm = JwtEcdsaAlgorithm.ES256;
                break;
            case "ES384":
                expectStringItem(kVar, "crv", "P-384");
                jwtEcdsaAlgorithm = JwtEcdsaAlgorithm.ES384;
                break;
            case "ES512":
                expectStringItem(kVar, "crv", "P-521");
                jwtEcdsaAlgorithm = JwtEcdsaAlgorithm.ES512;
                break;
            default:
                throw new GeneralSecurityException("Unknown Ecdsa Algorithm: " + getStringItem(kVar, "alg"));
        }
        if (kVar.f362194b.containsKey("d")) {
            throw new UnsupportedOperationException("importing ECDSA private keys is not implemented");
        }
        expectStringItem(kVar, "kty", "EC");
        validateUseIsSig(kVar);
        validateKeyOpsIsVerify(kVar);
        JwtEcdsaPublicKey.Builder y12 = JwtEcdsaPublicKey.newBuilder().setVersion(0).setAlgorithm(jwtEcdsaAlgorithm).setX(ByteString.copyFrom(Base64.urlSafeDecode(getStringItem(kVar, "x")))).setY(ByteString.copyFrom(Base64.urlSafeDecode(getStringItem(kVar, "y"))));
        if (kVar.f362194b.containsKey("kid")) {
            y12.setCustomKid(JwtEcdsaPublicKey.CustomKid.newBuilder().setValue(getStringItem(kVar, "kid")).build());
        }
        return ProtoKeySerialization.create(JWT_ECDSA_PUBLIC_KEY_URL, y12.build().toByteString(), KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC, OutputPrefixType.RAW, null);
    }

    private static ProtoKeySerialization convertToRsaSsaPkcs1Key(k kVar) throws GeneralSecurityException {
        JwtRsaSsaPkcs1Algorithm jwtRsaSsaPkcs1Algorithm;
        String stringItem = getStringItem(kVar, "alg");
        stringItem.getClass();
        switch (stringItem) {
            case "RS256":
                jwtRsaSsaPkcs1Algorithm = JwtRsaSsaPkcs1Algorithm.RS256;
                break;
            case "RS384":
                jwtRsaSsaPkcs1Algorithm = JwtRsaSsaPkcs1Algorithm.RS384;
                break;
            case "RS512":
                jwtRsaSsaPkcs1Algorithm = JwtRsaSsaPkcs1Algorithm.RS512;
                break;
            default:
                throw new GeneralSecurityException("Unknown Rsa Algorithm: " + getStringItem(kVar, "alg"));
        }
        if (!kVar.f362194b.containsKey("p")) {
            x<String, i> xVar = kVar.f362194b;
            if (!xVar.containsKey("q") && !xVar.containsKey("dp") && !xVar.containsKey("dq") && !xVar.containsKey("d") && !xVar.containsKey("qi")) {
                expectStringItem(kVar, "kty", "RSA");
                validateUseIsSig(kVar);
                validateKeyOpsIsVerify(kVar);
                JwtRsaSsaPkcs1PublicKey.Builder n12 = JwtRsaSsaPkcs1PublicKey.newBuilder().setVersion(0).setAlgorithm(jwtRsaSsaPkcs1Algorithm).setE(ByteString.copyFrom(Base64.urlSafeDecode(getStringItem(kVar, "e")))).setN(ByteString.copyFrom(Base64.urlSafeDecode(getStringItem(kVar, "n"))));
                if (xVar.containsKey("kid")) {
                    n12.setCustomKid(JwtRsaSsaPkcs1PublicKey.CustomKid.newBuilder().setValue(getStringItem(kVar, "kid")).build());
                }
                return ProtoKeySerialization.create(JWT_RSA_SSA_PKCS1_PUBLIC_KEY_URL, n12.build().toByteString(), KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC, OutputPrefixType.RAW, null);
            }
        }
        throw new UnsupportedOperationException("importing RSA private keys is not implemented");
    }

    private static ProtoKeySerialization convertToRsaSsaPssKey(k kVar) throws GeneralSecurityException {
        JwtRsaSsaPssAlgorithm jwtRsaSsaPssAlgorithm;
        String stringItem = getStringItem(kVar, "alg");
        stringItem.getClass();
        switch (stringItem) {
            case "PS256":
                jwtRsaSsaPssAlgorithm = JwtRsaSsaPssAlgorithm.PS256;
                break;
            case "PS384":
                jwtRsaSsaPssAlgorithm = JwtRsaSsaPssAlgorithm.PS384;
                break;
            case "PS512":
                jwtRsaSsaPssAlgorithm = JwtRsaSsaPssAlgorithm.PS512;
                break;
            default:
                throw new GeneralSecurityException("Unknown Rsa Algorithm: " + getStringItem(kVar, "alg"));
        }
        if (!kVar.f362194b.containsKey("p")) {
            x<String, i> xVar = kVar.f362194b;
            if (!xVar.containsKey("q") && !xVar.containsKey("dq") && !xVar.containsKey("dq") && !xVar.containsKey("d") && !xVar.containsKey("qi")) {
                expectStringItem(kVar, "kty", "RSA");
                validateUseIsSig(kVar);
                validateKeyOpsIsVerify(kVar);
                JwtRsaSsaPssPublicKey.Builder n12 = JwtRsaSsaPssPublicKey.newBuilder().setVersion(0).setAlgorithm(jwtRsaSsaPssAlgorithm).setE(ByteString.copyFrom(Base64.urlSafeDecode(getStringItem(kVar, "e")))).setN(ByteString.copyFrom(Base64.urlSafeDecode(getStringItem(kVar, "n"))));
                if (xVar.containsKey("kid")) {
                    n12.setCustomKid(JwtRsaSsaPssPublicKey.CustomKid.newBuilder().setValue(getStringItem(kVar, "kid")).build());
                }
                return ProtoKeySerialization.create(JWT_RSA_SSA_PSS_PUBLIC_KEY_URL, n12.build().toByteString(), KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC, OutputPrefixType.RAW, null);
            }
        }
        throw new UnsupportedOperationException("importing RSA private keys is not implemented");
    }

    private static void expectStringItem(k kVar, String str, String str2) throws GeneralSecurityException {
        String stringItem = getStringItem(kVar, str);
        if (!stringItem.equals(str2)) {
            throw new GeneralSecurityException(e.n("unexpected ", str, " value: ", stringItem));
        }
    }

    @l
    @Deprecated
    public static String fromKeysetHandle(KeysetHandle keysetHandle, KeyAccess keyAccess) {
        return fromPublicKeysetHandle(keysetHandle);
    }

    public static String fromPublicKeysetHandle(KeysetHandle keysetHandle) throws GeneralSecurityException {
        f fVar = new f();
        for (int i12 = 0; i12 < keysetHandle.size(); i12++) {
            KeysetHandle.Entry at2 = keysetHandle.getAt(i12);
            if (at2.getStatus() == KeyStatus.ENABLED) {
                Key key = at2.getKey();
                if (!(key instanceof LegacyProtoKey)) {
                    throw new GeneralSecurityException("only LegacyProtoKey is currently supported");
                }
                ProtoKeySerialization serialization = ((LegacyProtoKey) key).getSerialization(null);
                if (serialization.getOutputPrefixType() != OutputPrefixType.RAW && serialization.getOutputPrefixType() != OutputPrefixType.TINK) {
                    throw new GeneralSecurityException("only OutputPrefixType RAW and TINK are supported");
                }
                if (serialization.getKeyMaterialType() != KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC) {
                    throw new GeneralSecurityException("only public keys can be converted");
                }
                String typeUrl = serialization.getTypeUrl();
                typeUrl.getClass();
                switch (typeUrl) {
                    case "type.googleapis.com/google.crypto.tink.JwtEcdsaPublicKey":
                        fVar.t(convertJwtEcdsaKey(serialization));
                        break;
                    case "type.googleapis.com/google.crypto.tink.JwtRsaSsaPkcs1PublicKey":
                        fVar.t(convertJwtRsaSsaPkcs1(serialization));
                        break;
                    case "type.googleapis.com/google.crypto.tink.JwtRsaSsaPssPublicKey":
                        fVar.t(convertJwtRsaSsaPss(serialization));
                        break;
                    default:
                        throw new GeneralSecurityException(c.k("key type ", serialization.getTypeUrl(), " is not supported"));
                }
            }
        }
        k kVar = new k();
        kVar.t("keys", fVar);
        return kVar.toString();
    }

    private static Optional<String> getKid(@h Integer num) {
        return num == null ? Optional.empty() : Optional.of(Base64.urlSafeEncode(ByteBuffer.allocate(4).putInt(num.intValue()).array()));
    }

    private static String getStringItem(k kVar, String str) throws GeneralSecurityException {
        if (!kVar.f362194b.containsKey(str)) {
            throw new GeneralSecurityException(r.q(str, " not found"));
        }
        i iVarD = kVar.D(str);
        iVarD.getClass();
        if ((iVarD instanceof m) && (kVar.D(str).j().f362195b instanceof String)) {
            return kVar.D(str).s();
        }
        throw new GeneralSecurityException(r.q(str, " is not a string"));
    }

    @l
    @Deprecated
    public static KeysetHandle toKeysetHandle(String str, KeyAccess keyAccess) {
        return toPublicKeysetHandle(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0073 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.crypto.tink.KeysetHandle toPublicKeysetHandle(java.lang.String r8) throws java.security.GeneralSecurityException {
        /*
            r0 = 2
            r1 = 0
            com.google.gson.stream.a r2 = new com.google.gson.stream.a     // Catch: java.lang.StackOverflowError -> Lc6 com.google.gson.JsonParseException -> Lc8 java.lang.IllegalStateException -> Lca
            java.io.StringReader r3 = new java.io.StringReader     // Catch: java.lang.StackOverflowError -> Lc6 com.google.gson.JsonParseException -> Lc8 java.lang.IllegalStateException -> Lca
            r3.<init>(r8)     // Catch: java.lang.StackOverflowError -> Lc6 com.google.gson.JsonParseException -> Lc8 java.lang.IllegalStateException -> Lca
            r2.<init>(r3)     // Catch: java.lang.StackOverflowError -> Lc6 com.google.gson.JsonParseException -> Lc8 java.lang.IllegalStateException -> Lca
            r2.f362208c = r1     // Catch: java.lang.StackOverflowError -> Lc6 com.google.gson.JsonParseException -> Lc8 java.lang.IllegalStateException -> Lca
            com.google.gson.i r8 = com.google.gson.internal.C.a(r2)     // Catch: java.lang.StackOverflowError -> Lc6 com.google.gson.JsonParseException -> Lc8 java.lang.IllegalStateException -> Lca
            com.google.gson.k r8 = r8.i()     // Catch: java.lang.StackOverflowError -> Lc6 com.google.gson.JsonParseException -> Lc8 java.lang.IllegalStateException -> Lca
            com.google.crypto.tink.KeysetHandle$Builder r2 = com.google.crypto.tink.KeysetHandle.newBuilder()
            java.lang.String r3 = "keys"
            com.google.gson.i r8 = r8.D(r3)
            com.google.gson.f r8 = r8.h()
            java.util.ArrayList r8 = r8.f362000b
            java.util.Iterator r8 = r8.iterator()
        L2a:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto Lac
            java.lang.Object r3 = r8.next()
            com.google.gson.i r3 = (com.google.gson.i) r3
            com.google.gson.k r3 = r3.i()
            java.lang.String r4 = "alg"
            java.lang.String r5 = getStringItem(r3, r4)
            java.lang.String r5 = r5.substring(r1, r0)
            r5.getClass()
            r6 = -1
            int r7 = r5.hashCode()
            switch(r7) {
                case 2222: goto L66;
                case 2563: goto L5b;
                case 2625: goto L50;
                default: goto L4f;
            }
        L4f:
            goto L70
        L50:
            java.lang.String r7 = "RS"
            boolean r5 = r5.equals(r7)
            if (r5 != 0) goto L59
            goto L70
        L59:
            r6 = r0
            goto L70
        L5b:
            java.lang.String r7 = "PS"
            boolean r5 = r5.equals(r7)
            if (r5 != 0) goto L64
            goto L70
        L64:
            r6 = 1
            goto L70
        L66:
            java.lang.String r7 = "ES"
            boolean r5 = r5.equals(r7)
            if (r5 != 0) goto L6f
            goto L70
        L6f:
            r6 = r1
        L70:
            switch(r6) {
                case 0: goto L95;
                case 1: goto L90;
                case 2: goto L8b;
                default: goto L73;
            }
        L73:
            java.security.GeneralSecurityException r8 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "unexpected alg value: "
            r0.<init>(r1)
            java.lang.String r1 = getStringItem(r3, r4)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        L8b:
            com.google.crypto.tink.internal.ProtoKeySerialization r3 = convertToRsaSsaPkcs1Key(r3)
            goto L99
        L90:
            com.google.crypto.tink.internal.ProtoKeySerialization r3 = convertToRsaSsaPssKey(r3)
            goto L99
        L95:
            com.google.crypto.tink.internal.ProtoKeySerialization r3 = convertToEcdsaKey(r3)
        L99:
            com.google.crypto.tink.internal.LegacyProtoKey r4 = new com.google.crypto.tink.internal.LegacyProtoKey
            r5 = 0
            r4.<init>(r3, r5)
            com.google.crypto.tink.KeysetHandle$Builder$Entry r3 = com.google.crypto.tink.KeysetHandle.importKey(r4)
            com.google.crypto.tink.KeysetHandle$Builder$Entry r3 = r3.withRandomId()
            r2.addEntry(r3)
            goto L2a
        Lac:
            int r8 = r2.size()
            if (r8 <= 0) goto Lbe
            com.google.crypto.tink.KeysetHandle$Builder$Entry r8 = r2.getAt(r1)
            r8.makePrimary()
            com.google.crypto.tink.KeysetHandle r8 = r2.build()
            return r8
        Lbe:
            java.security.GeneralSecurityException r8 = new java.security.GeneralSecurityException
            java.lang.String r0 = "empty keyset"
            r8.<init>(r0)
            throw r8
        Lc6:
            r8 = move-exception
            goto Lcb
        Lc8:
            r8 = move-exception
            goto Lcb
        Lca:
            r8 = move-exception
        Lcb:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "JWK set is invalid JSON"
            r0.<init>(r1, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.jwt.JwkSetConverter.toPublicKeysetHandle(java.lang.String):com.google.crypto.tink.KeysetHandle");
    }

    private static void validateKeyOpsIsVerify(k kVar) throws GeneralSecurityException {
        if (kVar.f362194b.containsKey("key_ops")) {
            i iVarD = kVar.D("key_ops");
            iVarD.getClass();
            if (!(iVarD instanceof f)) {
                throw new GeneralSecurityException("key_ops is not an array");
            }
            f fVarH = kVar.D("key_ops").h();
            if (fVarH.f362000b.size() != 1) {
                throw new GeneralSecurityException("key_ops must contain exactly one element");
            }
            i iVarW = fVarH.w(0);
            iVarW.getClass();
            if (!(iVarW instanceof m) || !(fVarH.w(0).j().f362195b instanceof String)) {
                throw new GeneralSecurityException("key_ops is not a string");
            }
            if (fVarH.w(0).s().equals("verify")) {
                return;
            }
            throw new GeneralSecurityException("unexpected keyOps value: " + fVarH.w(0).s());
        }
    }

    private static void validateUseIsSig(k kVar) throws GeneralSecurityException {
        if (kVar.f362194b.containsKey("use")) {
            expectStringItem(kVar, "use", "sig");
        }
    }
}
