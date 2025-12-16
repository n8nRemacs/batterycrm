package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;

/* loaded from: classes8.dex */
public final class rg0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final String f389527a;

    /* renamed from: b, reason: collision with root package name */
    private final int f389528b;

    public rg0(int i12, @j.N String str) {
        this(i12, str, 0);
    }

    @SuppressLint({"TrulyRandom"})
    @j.P
    public final byte[] a(@j.N byte[] bArr) {
        try {
            byte[] bArrDecode = Base64.decode(this.f389527a, 0);
            if (bArrDecode != null) {
                SecureRandom secureRandom = new SecureRandom();
                byte[] bArr2 = new byte[16];
                byte[] bArr3 = new byte[16];
                secureRandom.nextBytes(bArr3);
                secureRandom.nextBytes(bArr2);
                return a(bArr, bArr3, bArr2, KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(bArrDecode)));
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    private rg0(int i12, String str, @j.N int i13) {
        this.f389527a = str;
        this.f389528b = i12;
    }

    @j.P
    private byte[] a(@j.N byte[] bArr, @j.N byte[] bArr2, @j.N byte[] bArr3, @j.N PublicKey publicKey) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(bArr2.length + bArr3.length);
            try {
                byteArrayOutputStream2.write(bArr2);
                byteArrayOutputStream2.write(bArr3);
                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                byteArrayOutputStream2.close();
                Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
                c9 c9Var = new c9("AES/CBC/PKCS5Padding", bArr2, bArr3);
                cipher.init(1, publicKey);
                byteArrayOutputStream = new ByteArrayOutputStream(bArr.length);
                try {
                    byteArrayOutputStream.write(ByteBuffer.allocate(4).putInt(this.f389528b).array());
                    byteArrayOutputStream.write(cipher.doFinal(byteArray));
                    byteArrayOutputStream.write(c9Var.a(bArr));
                    byte[] byteArray2 = byteArrayOutputStream.toByteArray();
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException unused) {
                    }
                    return byteArray2;
                } catch (Throwable unused2) {
                    if (byteArrayOutputStream != null) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    return null;
                }
            } finally {
            }
        } catch (Throwable unused4) {
            byteArrayOutputStream = null;
        }
    }
}
