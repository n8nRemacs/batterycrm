package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.C36584n;
import com.google.android.exoplayer2.upstream.InterfaceC36583m;
import com.google.android.exoplayer2.upstream.M;
import j.P;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: Aes128DataSource.java */
/* loaded from: classes6.dex */
class a implements InterfaceC36583m {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC36583m f346281a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f346282b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f346283c;

    /* renamed from: d, reason: collision with root package name */
    @P
    public CipherInputStream f346284d;

    public a(InterfaceC36583m interfaceC36583m, byte[] bArr, byte[] bArr2) {
        this.f346281a = interfaceC36583m;
        this.f346282b = bArr;
        this.f346283c = bArr2;
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36583m
    public final Map<String, List<String>> c() {
        return this.f346281a.c();
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36583m
    public final void close() {
        if (this.f346284d != null) {
            this.f346284d = null;
            this.f346281a.close();
        }
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36583m
    public final long e(com.google.android.exoplayer2.upstream.p pVar) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.f346282b, "AES"), new IvParameterSpec(this.f346283c));
                C36584n c36584n = new C36584n(this.f346281a, pVar);
                this.f346284d = new CipherInputStream(c36584n, cipher);
                c36584n.a();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e12) {
                throw new RuntimeException(e12);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e13) {
            throw new RuntimeException(e13);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36583m
    @P
    public final Uri getUri() {
        return this.f346281a.getUri();
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36583m
    public final void k(M m12) {
        m12.getClass();
        this.f346281a.k(m12);
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36580j
    public final int read(byte[] bArr, int i12, int i13) throws IOException {
        this.f346284d.getClass();
        int i14 = this.f346284d.read(bArr, i12, i13);
        if (i14 < 0) {
            return -1;
        }
        return i14;
    }
}
