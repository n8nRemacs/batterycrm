package com.google.android.exoplayer2.decoder;

import android.media.MediaCodec;
import com.google.android.exoplayer2.util.U;
import j.P;
import j.X;

/* compiled from: CryptoInfo.java */
/* loaded from: classes6.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @P
    public byte[] f344211a;

    /* renamed from: b, reason: collision with root package name */
    @P
    public byte[] f344212b;

    /* renamed from: c, reason: collision with root package name */
    public int f344213c;

    /* renamed from: d, reason: collision with root package name */
    @P
    public int[] f344214d;

    /* renamed from: e, reason: collision with root package name */
    @P
    public int[] f344215e;

    /* renamed from: f, reason: collision with root package name */
    public int f344216f;

    /* renamed from: g, reason: collision with root package name */
    public int f344217g;

    /* renamed from: h, reason: collision with root package name */
    public int f344218h;

    /* renamed from: i, reason: collision with root package name */
    public final MediaCodec.CryptoInfo f344219i;

    /* renamed from: j, reason: collision with root package name */
    @P
    public final b f344220j;

    /* compiled from: CryptoInfo.java */
    @X
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final MediaCodec.CryptoInfo f344221a;

        /* renamed from: b, reason: collision with root package name */
        public final MediaCodec.CryptoInfo.Pattern f344222b = new MediaCodec.CryptoInfo.Pattern(0, 0);

        public b(MediaCodec.CryptoInfo cryptoInfo, a aVar) {
            this.f344221a = cryptoInfo;
        }
    }

    public d() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f344219i = cryptoInfo;
        this.f344220j = U.f348106a >= 24 ? new b(cryptoInfo, null) : null;
    }

    public final void a(int i12, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i13, int i14, int i15) {
        this.f344216f = i12;
        this.f344214d = iArr;
        this.f344215e = iArr2;
        this.f344212b = bArr;
        this.f344211a = bArr2;
        this.f344213c = i13;
        this.f344217g = i14;
        this.f344218h = i15;
        MediaCodec.CryptoInfo cryptoInfo = this.f344219i;
        cryptoInfo.numSubSamples = i12;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i13;
        if (U.f348106a >= 24) {
            b bVar = this.f344220j;
            bVar.getClass();
            MediaCodec.CryptoInfo.Pattern pattern = bVar.f344222b;
            pattern.set(i14, i15);
            bVar.f344221a.setPattern(pattern);
        }
    }
}
