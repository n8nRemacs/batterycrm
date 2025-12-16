package com.yandex.mobile.ads.impl;

import android.media.MediaCodec;

/* loaded from: classes8.dex */
public final class um {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    public byte[] f390585a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    public byte[] f390586b;

    /* renamed from: c, reason: collision with root package name */
    public int f390587c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    public int[] f390588d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    public int[] f390589e;

    /* renamed from: f, reason: collision with root package name */
    public int f390590f;

    /* renamed from: g, reason: collision with root package name */
    public int f390591g;

    /* renamed from: h, reason: collision with root package name */
    public int f390592h;

    /* renamed from: i, reason: collision with root package name */
    private final MediaCodec.CryptoInfo f390593i;

    /* renamed from: j, reason: collision with root package name */
    @j.P
    private final a f390594j;

    @j.X
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final MediaCodec.CryptoInfo f390595a;

        /* renamed from: b, reason: collision with root package name */
        private final MediaCodec.CryptoInfo.Pattern f390596b;

        public /* synthetic */ a(MediaCodec.CryptoInfo cryptoInfo, int i12) {
            this(cryptoInfo);
        }

        public static void a(a aVar, int i12, int i13) {
            aVar.f390596b.set(i12, i13);
            aVar.f390595a.setPattern(aVar.f390596b);
        }

        private a(MediaCodec.CryptoInfo cryptoInfo) {
            this.f390595a = cryptoInfo;
            this.f390596b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }
    }

    public um() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f390593i = cryptoInfo;
        this.f390594j = pc1.f388768a >= 24 ? new a(cryptoInfo, 0) : null;
    }

    public final void a(int i12, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i13, int i14, int i15) {
        this.f390590f = i12;
        this.f390588d = iArr;
        this.f390589e = iArr2;
        this.f390586b = bArr;
        this.f390585a = bArr2;
        this.f390587c = i13;
        this.f390591g = i14;
        this.f390592h = i15;
        MediaCodec.CryptoInfo cryptoInfo = this.f390593i;
        cryptoInfo.numSubSamples = i12;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i13;
        if (pc1.f388768a >= 24) {
            a aVar = this.f390594j;
            aVar.getClass();
            a.a(aVar, i14, i15);
        }
    }

    public final MediaCodec.CryptoInfo a() {
        return this.f390593i;
    }

    public final void a(int i12) {
        if (i12 == 0) {
            return;
        }
        if (this.f390588d == null) {
            int[] iArr = new int[1];
            this.f390588d = iArr;
            this.f390593i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f390588d;
        iArr2[0] = iArr2[0] + i12;
    }
}
