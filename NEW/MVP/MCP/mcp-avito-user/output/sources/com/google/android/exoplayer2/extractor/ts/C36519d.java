package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.I;
import com.google.android.exoplayer2.audio.C36505c;
import com.google.android.exoplayer2.extractor.ts.D;
import com.google.android.exoplayer2.util.C36585a;
import j.P;

/* compiled from: Ac4Reader.java */
/* renamed from: com.google.android.exoplayer2.extractor.ts.d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36519d implements j {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.exoplayer2.util.E f345061a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.exoplayer2.util.F f345062b;

    /* renamed from: c, reason: collision with root package name */
    @P
    public final String f345063c;

    /* renamed from: d, reason: collision with root package name */
    public String f345064d;

    /* renamed from: e, reason: collision with root package name */
    public com.google.android.exoplayer2.extractor.A f345065e;

    /* renamed from: f, reason: collision with root package name */
    public int f345066f;

    /* renamed from: g, reason: collision with root package name */
    public int f345067g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f345068h;

    /* renamed from: i, reason: collision with root package name */
    public long f345069i;

    /* renamed from: j, reason: collision with root package name */
    public I f345070j;

    /* renamed from: k, reason: collision with root package name */
    public int f345071k;

    /* renamed from: l, reason: collision with root package name */
    public long f345072l;

    public C36519d() {
        this(null);
    }

    @Override // com.google.android.exoplayer2.extractor.ts.j
    public final void a() {
        this.f345066f = 0;
        this.f345067g = 0;
        this.f345068h = false;
        this.f345072l = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.j
    public final void c(com.google.android.exoplayer2.util.F f12) {
        C36585a.e(this.f345065e);
        while (f12.a() > 0) {
            int i12 = this.f345066f;
            com.google.android.exoplayer2.util.F f13 = this.f345062b;
            if (i12 == 0) {
                while (f12.a() > 0) {
                    if (this.f345068h) {
                        int iR2 = f12.r();
                        this.f345068h = iR2 == 172;
                        if (iR2 == 64 || iR2 == 65) {
                            boolean z12 = iR2 == 65;
                            this.f345066f = 1;
                            byte[] bArr = f13.f348070a;
                            bArr[0] = -84;
                            bArr[1] = (byte) (z12 ? 65 : 64);
                            this.f345067g = 2;
                        }
                    } else {
                        this.f345068h = f12.r() == 172;
                    }
                }
            } else if (i12 == 1) {
                byte[] bArr2 = f13.f348070a;
                int iMin = Math.min(f12.a(), 16 - this.f345067g);
                f12.c(this.f345067g, iMin, bArr2);
                int i13 = this.f345067g + iMin;
                this.f345067g = i13;
                if (i13 == 16) {
                    com.google.android.exoplayer2.util.E e12 = this.f345061a;
                    e12.k(0);
                    C36505c.b bVarB = C36505c.b(e12);
                    I i14 = this.f345070j;
                    int i15 = bVarB.f343966a;
                    int i16 = bVarB.f343967b;
                    if (i14 == null || i16 != i14.f343489z || i15 != i14.f343458A || !"audio/ac4".equals(i14.f343476m)) {
                        I.b bVar = new I.b();
                        bVar.f343494a = this.f345064d;
                        bVar.f343504k = "audio/ac4";
                        bVar.f343517x = i16;
                        bVar.f343518y = i15;
                        bVar.f343496c = this.f345063c;
                        I iA2 = bVar.a();
                        this.f345070j = iA2;
                        this.f345065e.a(iA2);
                    }
                    this.f345071k = bVarB.f343968c;
                    this.f345069i = (bVarB.f343969d * 1000000) / this.f345070j.f343458A;
                    f13.B(0);
                    this.f345065e.c(16, f13);
                    this.f345066f = 2;
                }
            } else if (i12 == 2) {
                int iMin2 = Math.min(f12.a(), this.f345071k - this.f345067g);
                this.f345065e.c(iMin2, f12);
                int i17 = this.f345067g + iMin2;
                this.f345067g = i17;
                int i18 = this.f345071k;
                if (i17 == i18) {
                    long j12 = this.f345072l;
                    if (j12 != -9223372036854775807L) {
                        this.f345065e.f(j12, 1, i18, 0, null);
                        this.f345072l += this.f345069i;
                    }
                    this.f345066f = 0;
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.j
    public final void d(int i12, long j12) {
        if (j12 != -9223372036854775807L) {
            this.f345072l = j12;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.j
    public final void e(com.google.android.exoplayer2.extractor.l lVar, D.e eVar) {
        eVar.a();
        eVar.b();
        this.f345064d = eVar.f345040e;
        eVar.b();
        this.f345065e = lVar.c(eVar.f345039d, 1);
    }

    public C36519d(@P String str) {
        byte[] bArr = new byte[16];
        this.f345061a = new com.google.android.exoplayer2.util.E(bArr, 16);
        this.f345062b = new com.google.android.exoplayer2.util.F(bArr);
        this.f345066f = 0;
        this.f345067g = 0;
        this.f345068h = false;
        this.f345072l = -9223372036854775807L;
        this.f345063c = str;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.j
    public final void b() {
    }
}
