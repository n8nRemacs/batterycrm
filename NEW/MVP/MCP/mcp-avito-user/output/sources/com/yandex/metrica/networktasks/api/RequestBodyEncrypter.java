package com.yandex.metrica.networktasks.api;

/* loaded from: classes7.dex */
public interface RequestBodyEncrypter {
    byte[] encrypt(byte[] bArr);

    RequestBodyEncryptionMode getEncryptionMode();
}
