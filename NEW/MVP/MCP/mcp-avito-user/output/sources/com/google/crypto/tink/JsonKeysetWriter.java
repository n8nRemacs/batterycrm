package com.google.crypto.tink;

import aZ0.l;
import com.adjust.sdk.Constants;
import com.google.crypto.tink.proto.EncryptedKeyset;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.Keyset;
import com.google.crypto.tink.proto.KeysetInfo;
import com.google.crypto.tink.subtle.Base64;
import com.google.gson.JsonParseException;
import com.google.gson.f;
import com.google.gson.k;
import j.X;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class JsonKeysetWriter implements KeysetWriter {
    private static final Charset UTF_8 = Charset.forName(Constants.ENCODING);
    private final OutputStream outputStream;

    private JsonKeysetWriter(OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    private k toJson(Keyset keyset) {
        k kVar = new k();
        kVar.w(Long.valueOf(toUnsignedLong(keyset.getPrimaryKeyId())), "primaryKeyId");
        f fVar = new f();
        Iterator<Keyset.Key> it = keyset.getKeyList().iterator();
        while (it.hasNext()) {
            fVar.t(toJson(it.next()));
        }
        kVar.t("key", fVar);
        return kVar;
    }

    private long toUnsignedLong(int i12) {
        return i12 & 4294967295L;
    }

    @l
    @Deprecated
    public static KeysetWriter withFile(File file) {
        return withOutputStream(new FileOutputStream(file));
    }

    public static KeysetWriter withOutputStream(OutputStream outputStream) {
        return new JsonKeysetWriter(outputStream);
    }

    @l
    @Deprecated
    public static KeysetWriter withPath(String str) {
        return withOutputStream(new FileOutputStream(new File(str)));
    }

    @Override // com.google.crypto.tink.KeysetWriter
    public void write(Keyset keyset) throws IOException {
        try {
            try {
                OutputStream outputStream = this.outputStream;
                String string = toJson(keyset).toString();
                Charset charset = UTF_8;
                outputStream.write(string.getBytes(charset));
                this.outputStream.write(System.lineSeparator().getBytes(charset));
            } catch (JsonParseException e12) {
                throw new IOException(e12);
            }
        } finally {
            this.outputStream.close();
        }
    }

    @l
    @X
    @Deprecated
    public static KeysetWriter withPath(Path path) {
        return withOutputStream(new FileOutputStream(path.toFile()));
    }

    private k toJson(Keyset.Key key) {
        k kVar = new k();
        kVar.t("keyData", toJson(key.getKeyData()));
        kVar.y("status", key.getStatus().name());
        kVar.w(Long.valueOf(toUnsignedLong(key.getKeyId())), "keyId");
        kVar.y("outputPrefixType", key.getOutputPrefixType().name());
        return kVar;
    }

    @Override // com.google.crypto.tink.KeysetWriter
    public void write(EncryptedKeyset encryptedKeyset) throws IOException {
        OutputStream outputStream = this.outputStream;
        String string = toJson(encryptedKeyset).toString();
        Charset charset = UTF_8;
        outputStream.write(string.getBytes(charset));
        this.outputStream.write(System.lineSeparator().getBytes(charset));
        this.outputStream.close();
    }

    private k toJson(KeyData keyData) {
        k kVar = new k();
        kVar.y("typeUrl", keyData.getTypeUrl());
        kVar.y("value", Base64.encode(keyData.getValue().toByteArray()));
        kVar.y("keyMaterialType", keyData.getKeyMaterialType().name());
        return kVar;
    }

    private k toJson(EncryptedKeyset encryptedKeyset) {
        k kVar = new k();
        kVar.y("encryptedKeyset", Base64.encode(encryptedKeyset.getEncryptedKeyset().toByteArray()));
        kVar.t("keysetInfo", toJson(encryptedKeyset.getKeysetInfo()));
        return kVar;
    }

    private k toJson(KeysetInfo keysetInfo) {
        k kVar = new k();
        kVar.w(Long.valueOf(toUnsignedLong(keysetInfo.getPrimaryKeyId())), "primaryKeyId");
        f fVar = new f();
        Iterator<KeysetInfo.KeyInfo> it = keysetInfo.getKeyInfoList().iterator();
        while (it.hasNext()) {
            fVar.t(toJson(it.next()));
        }
        kVar.t("keyInfo", fVar);
        return kVar;
    }

    private k toJson(KeysetInfo.KeyInfo keyInfo) {
        k kVar = new k();
        kVar.y("typeUrl", keyInfo.getTypeUrl());
        kVar.y("status", keyInfo.getStatus().name());
        kVar.w(Long.valueOf(toUnsignedLong(keyInfo.getKeyId())), "keyId");
        kVar.y("outputPrefixType", keyInfo.getOutputPrefixType().name());
        return kVar;
    }
}
