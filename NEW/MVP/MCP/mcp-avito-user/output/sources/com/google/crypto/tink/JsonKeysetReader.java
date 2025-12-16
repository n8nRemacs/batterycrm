package com.google.crypto.tink;

import aZ0.InterfaceC19845a;
import aZ0.l;
import com.adjust.sdk.Constants;
import com.google.crypto.tink.internal.JsonParser;
import com.google.crypto.tink.proto.EncryptedKeyset;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.proto.Keyset;
import com.google.crypto.tink.proto.KeysetInfo;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.subtle.Base64;
import com.google.gson.JsonParseException;
import com.google.gson.f;
import com.google.gson.i;
import com.google.gson.internal.x;
import com.google.gson.k;
import j.X;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.file.Path;

/* loaded from: classes6.dex */
public final class JsonKeysetReader implements KeysetReader {
    private static final long MAX_KEY_ID = 4294967295L;
    private static final long MIN_KEY_ID = -2147483648L;
    private static final Charset UTF_8 = Charset.forName(Constants.ENCODING);
    private final InputStream inputStream;
    private boolean urlSafeBase64 = false;

    private JsonKeysetReader(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    private EncryptedKeyset encryptedKeysetFromJson(k kVar) {
        validateEncryptedKeyset(kVar);
        byte[] bArrUrlSafeDecode = this.urlSafeBase64 ? Base64.urlSafeDecode(kVar.D("encryptedKeyset").s()) : Base64.decode(kVar.D("encryptedKeyset").s());
        return kVar.f362194b.containsKey("keysetInfo") ? EncryptedKeyset.newBuilder().setEncryptedKeyset(ByteString.copyFrom(bArrUrlSafeDecode)).setKeysetInfo(keysetInfoFromJson(kVar.I("keysetInfo"))).build() : EncryptedKeyset.newBuilder().setEncryptedKeyset(ByteString.copyFrom(bArrUrlSafeDecode)).build();
    }

    private static int getKeyId(i iVar) throws IOException {
        try {
            long parsedNumberAsLongOrThrow = JsonParser.getParsedNumberAsLongOrThrow(iVar);
            if (parsedNumberAsLongOrThrow > MAX_KEY_ID || parsedNumberAsLongOrThrow < MIN_KEY_ID) {
                throw new IOException("invalid key id");
            }
            return (int) iVar.l();
        } catch (NumberFormatException e12) {
            throw new IOException(e12);
        }
    }

    private static KeyData.KeyMaterialType getKeyMaterialType(String str) {
        str.getClass();
        switch (str) {
            case "REMOTE":
                return KeyData.KeyMaterialType.REMOTE;
            case "SYMMETRIC":
                return KeyData.KeyMaterialType.SYMMETRIC;
            case "ASYMMETRIC_PRIVATE":
                return KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE;
            case "ASYMMETRIC_PUBLIC":
                return KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC;
            default:
                throw new JsonParseException("unknown key material type: ".concat(str));
        }
    }

    private static OutputPrefixType getOutputPrefixType(String str) {
        str.getClass();
        switch (str) {
            case "LEGACY":
                return OutputPrefixType.LEGACY;
            case "RAW":
                return OutputPrefixType.RAW;
            case "TINK":
                return OutputPrefixType.TINK;
            case "CRUNCHY":
                return OutputPrefixType.CRUNCHY;
            default:
                throw new JsonParseException("unknown output prefix type: ".concat(str));
        }
    }

    private static KeyStatusType getStatus(String str) {
        str.getClass();
        switch (str) {
            case "ENABLED":
                return KeyStatusType.ENABLED;
            case "DESTROYED":
                return KeyStatusType.DESTROYED;
            case "DISABLED":
                return KeyStatusType.DISABLED;
            default:
                throw new JsonParseException("unknown status: ".concat(str));
        }
    }

    private KeyData keyDataFromJson(k kVar) {
        validateKeyData(kVar);
        return KeyData.newBuilder().setTypeUrl(kVar.D("typeUrl").s()).setValue(ByteString.copyFrom(this.urlSafeBase64 ? Base64.urlSafeDecode(kVar.D("value").s()) : Base64.decode(kVar.D("value").s()))).setKeyMaterialType(getKeyMaterialType(kVar.D("keyMaterialType").s())).build();
    }

    private Keyset.Key keyFromJson(k kVar) {
        validateKey(kVar);
        return Keyset.Key.newBuilder().setStatus(getStatus(kVar.D("status").s())).setKeyId(getKeyId(kVar.D("keyId"))).setOutputPrefixType(getOutputPrefixType(kVar.D("outputPrefixType").s())).setKeyData(keyDataFromJson(kVar.I("keyData"))).build();
    }

    private static KeysetInfo.KeyInfo keyInfoFromJson(k kVar) {
        return KeysetInfo.KeyInfo.newBuilder().setStatus(getStatus(kVar.D("status").s())).setKeyId(getKeyId(kVar.D("keyId"))).setOutputPrefixType(getOutputPrefixType(kVar.D("outputPrefixType").s())).setTypeUrl(kVar.D("typeUrl").s()).build();
    }

    private Keyset keysetFromJson(k kVar) {
        validateKeyset(kVar);
        Keyset.Builder builderNewBuilder = Keyset.newBuilder();
        if (kVar.f362194b.containsKey("primaryKeyId")) {
            builderNewBuilder.setPrimaryKeyId(getKeyId(kVar.D("primaryKeyId")));
        }
        f fVarE = kVar.E("key");
        for (int i12 = 0; i12 < fVarE.f362000b.size(); i12++) {
            builderNewBuilder.addKey(keyFromJson(fVarE.w(i12).i()));
        }
        return builderNewBuilder.build();
    }

    private static KeysetInfo keysetInfoFromJson(k kVar) {
        KeysetInfo.Builder builderNewBuilder = KeysetInfo.newBuilder();
        if (kVar.f362194b.containsKey("primaryKeyId")) {
            builderNewBuilder.setPrimaryKeyId(getKeyId(kVar.D("primaryKeyId")));
        }
        if (kVar.f362194b.containsKey("keyInfo")) {
            f fVarE = kVar.E("keyInfo");
            for (int i12 = 0; i12 < fVarE.f362000b.size(); i12++) {
                builderNewBuilder.addKeyInfo(keyInfoFromJson(fVarE.w(i12).i()));
            }
        }
        return builderNewBuilder.build();
    }

    private static void validateEncryptedKeyset(k kVar) {
        if (!kVar.f362194b.containsKey("encryptedKeyset")) {
            throw new JsonParseException("invalid encrypted keyset");
        }
    }

    private static void validateKey(k kVar) {
        if (kVar.f362194b.containsKey("keyData")) {
            x<String, i> xVar = kVar.f362194b;
            if (xVar.containsKey("status") && xVar.containsKey("keyId") && xVar.containsKey("outputPrefixType")) {
                return;
            }
        }
        throw new JsonParseException("invalid key");
    }

    private static void validateKeyData(k kVar) {
        if (kVar.f362194b.containsKey("typeUrl")) {
            x<String, i> xVar = kVar.f362194b;
            if (xVar.containsKey("value") && xVar.containsKey("keyMaterialType")) {
                return;
            }
        }
        throw new JsonParseException("invalid keyData");
    }

    private static void validateKeyset(k kVar) {
        if (!kVar.f362194b.containsKey("key") || kVar.E("key").f362000b.size() == 0) {
            throw new JsonParseException("invalid keyset");
        }
    }

    public static JsonKeysetReader withBytes(byte[] bArr) {
        return new JsonKeysetReader(new ByteArrayInputStream(bArr));
    }

    @l
    @Deprecated
    public static JsonKeysetReader withFile(File file) {
        return withInputStream(new FileInputStream(file));
    }

    public static JsonKeysetReader withInputStream(InputStream inputStream) {
        return new JsonKeysetReader(inputStream);
    }

    @l
    @Deprecated
    public static JsonKeysetReader withJsonObject(Object obj) {
        return withString(obj.toString());
    }

    @l
    @Deprecated
    public static JsonKeysetReader withPath(String str) {
        return withInputStream(new FileInputStream(new File(str)));
    }

    public static JsonKeysetReader withString(String str) {
        return new JsonKeysetReader(new ByteArrayInputStream(str.getBytes(UTF_8)));
    }

    @Override // com.google.crypto.tink.KeysetReader
    public Keyset read() throws IOException {
        try {
            try {
                return keysetFromJson(JsonParser.parse(new String(Util.readAll(this.inputStream), UTF_8)).i());
            } finally {
                InputStream inputStream = this.inputStream;
                if (inputStream != null) {
                    inputStream.close();
                }
            }
        } catch (JsonParseException | IllegalStateException e12) {
            throw new IOException(e12);
        }
    }

    @Override // com.google.crypto.tink.KeysetReader
    public EncryptedKeyset readEncrypted() throws IOException {
        try {
            try {
                return encryptedKeysetFromJson(JsonParser.parse(new String(Util.readAll(this.inputStream), UTF_8)).i());
            } finally {
                InputStream inputStream = this.inputStream;
                if (inputStream != null) {
                    inputStream.close();
                }
            }
        } catch (JsonParseException | IllegalStateException e12) {
            throw new IOException(e12);
        }
    }

    @InterfaceC19845a
    public JsonKeysetReader withUrlSafeBase64() {
        this.urlSafeBase64 = true;
        return this;
    }

    @l
    @X
    @Deprecated
    public static JsonKeysetReader withPath(Path path) {
        return withInputStream(new FileInputStream(path.toFile()));
    }
}
