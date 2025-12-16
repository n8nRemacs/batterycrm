package com.yandex.metrica.impl.ob;

import android.annotation.SuppressLint;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.yandex.metrica.impl.ob.wm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39228wm {

    /* renamed from: a, reason: collision with root package name */
    private final String f382152a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f382153b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f382154c;

    public C39228wm(String str, byte[] bArr, byte[] bArr2) {
        this.f382152a = str;
        this.f382153b = bArr;
        this.f382154c = bArr2;
    }

    @SuppressLint({"TrulyRandom"})
    public byte[] a(byte[] bArr) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        SecretKeySpec secretKeySpec = new SecretKeySpec(this.f382153b, "AES");
        Cipher cipher = Cipher.getInstance(this.f382152a);
        cipher.init(1, secretKeySpec, new IvParameterSpec(this.f382154c));
        return cipher.doFinal(bArr);
    }

    public byte[] a(byte[] bArr, int i12, int i13) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        SecretKeySpec secretKeySpec = new SecretKeySpec(this.f382153b, "AES");
        Cipher cipher = Cipher.getInstance(this.f382152a);
        cipher.init(2, secretKeySpec, new IvParameterSpec(this.f382154c));
        return cipher.doFinal(bArr, i12, i13);
    }
}
