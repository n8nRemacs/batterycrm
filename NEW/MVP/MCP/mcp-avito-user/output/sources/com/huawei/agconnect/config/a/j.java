package com.huawei.agconnect.config.a;

import android.content.Context;
import androidx.appcompat.app.r;
import com.adjust.sdk.Constants;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes7.dex */
class j extends i {

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f363155c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f363156d;

    /* renamed from: e, reason: collision with root package name */
    public final SecretKeySpec f363157e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f363158f;

    public j(Context context, String str) {
        super(context, str);
        this.f363155c = new HashMap();
        this.f363156d = new Object();
        this.f363158f = true;
        try {
            String strA = super.a("/AD91D45E3E72DB6989DDCB13287E75061FABCB933D886E6C6ABEF0939B577138");
            String strA2 = super.a("/B314B3BF013DF5AC4134E880AF3D2B7C9FFBE8F0305EAC1C898145E2BCF1F21C");
            String strA3 = super.a("/C767BD8FDF53E53D059BE95B09E2A71056F5F180AECC62836B287ACA5793421B");
            String strA4 = super.a("/DCB3E6D4C2CF80F30D89CDBC412C964DA8381BB84668769391FBCC3E329AD0FD");
            if (strA == null || strA2 == null || strA3 == null || strA4 == null) {
                this.f363158f = false;
            } else {
                this.f363157e = h.a(f.b(strA), f.b(strA2), f.b(strA3), f.b(strA4));
            }
        } catch (NoSuchAlgorithmException | InvalidKeySpecException unused) {
            this.f363157e = null;
        }
    }

    public static byte[] b(SecretKeySpec secretKeySpec, byte[] bArr) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        if (secretKeySpec == null) {
            throw new NullPointerException("key or cipherText must not be null.");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 1, 17);
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(2, secretKeySpec, new IvParameterSpec(bArrCopyOfRange));
        return cipher.doFinal(bArr, bArrCopyOfRange.length + 1, (bArr.length - bArrCopyOfRange.length) - 1);
    }

    @Override // com.huawei.agconnect.config.a.i, com.huawei.agconnect.config.a.e
    public final String a(String str) throws UnsupportedEncodingException {
        if (!this.f363158f) {
            String strA = super.a(str);
            if (strA != null) {
                return strA;
            }
            return null;
        }
        if (this.f363157e == null) {
            return null;
        }
        synchronized (this.f363156d) {
            try {
                String str2 = (String) this.f363155c.get(str);
                if (str2 != null) {
                    return str2;
                }
                String strA2 = super.a(str);
                if (strA2 == null) {
                    return null;
                }
                try {
                    String str3 = new String(b(this.f363157e, f.b(strA2)), Constants.ENCODING);
                    this.f363155c.put(str, str3);
                    return str3;
                } catch (UnsupportedEncodingException | GeneralSecurityException unused) {
                    return null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SecurityResourcesReader{mKey=");
        sb2.append(this.f363157e.hashCode());
        sb2.append(", encrypt=");
        return r.x(sb2, this.f363158f, '}');
    }
}
