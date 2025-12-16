package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes8.dex */
public final class c9 {

    /* renamed from: a, reason: collision with root package name */
    private final String f384203a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f384204b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f384205c;

    public c9(@j.N String str, @j.N byte[] bArr, @j.N byte[] bArr2) {
        this.f384203a = str;
        this.f384204b = bArr;
        this.f384205c = bArr2;
    }

    @j.N
    @SuppressLint({"TrulyRandom"})
    public final byte[] a(@j.N byte[] bArr) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        SecretKeySpec secretKeySpec = new SecretKeySpec(this.f384204b, "AES");
        Cipher cipher = Cipher.getInstance(this.f384203a);
        cipher.init(1, secretKeySpec, new IvParameterSpec(this.f384205c));
        return cipher.doFinal(bArr);
    }
}
