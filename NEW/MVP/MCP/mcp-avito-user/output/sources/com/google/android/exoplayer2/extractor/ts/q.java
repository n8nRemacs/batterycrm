package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.I;
import com.google.android.exoplayer2.audio.u;
import com.google.android.exoplayer2.extractor.ts.D;
import com.google.android.exoplayer2.util.C36585a;
import j.P;

/* compiled from: MpegAudioReader.java */
/* loaded from: classes6.dex */
public final class q implements j {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.exoplayer2.util.F f345274a;

    /* renamed from: b, reason: collision with root package name */
    public final u.a f345275b;

    /* renamed from: c, reason: collision with root package name */
    @P
    public final String f345276c;

    /* renamed from: d, reason: collision with root package name */
    public com.google.android.exoplayer2.extractor.A f345277d;

    /* renamed from: e, reason: collision with root package name */
    public String f345278e;

    /* renamed from: f, reason: collision with root package name */
    public int f345279f;

    /* renamed from: g, reason: collision with root package name */
    public int f345280g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f345281h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f345282i;

    /* renamed from: j, reason: collision with root package name */
    public long f345283j;

    /* renamed from: k, reason: collision with root package name */
    public int f345284k;

    /* renamed from: l, reason: collision with root package name */
    public long f345285l;

    public q() {
        this(null);
    }

    @Override // com.google.android.exoplayer2.extractor.ts.j
    public final void a() {
        this.f345279f = 0;
        this.f345280g = 0;
        this.f345282i = false;
        this.f345285l = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.j
    public final void c(com.google.android.exoplayer2.util.F f12) {
        C36585a.e(this.f345277d);
        while (f12.a() > 0) {
            int i12 = this.f345279f;
            com.google.android.exoplayer2.util.F f13 = this.f345274a;
            if (i12 == 0) {
                byte[] bArr = f12.f348070a;
                int i13 = f12.f348071b;
                int i14 = f12.f348072c;
                while (true) {
                    if (i13 >= i14) {
                        f12.B(i14);
                        break;
                    }
                    byte b12 = bArr[i13];
                    boolean z12 = (b12 & 255) == 255;
                    boolean z13 = this.f345282i && (b12 & 224) == 224;
                    this.f345282i = z12;
                    if (z13) {
                        f12.B(i13 + 1);
                        this.f345282i = false;
                        f13.f348070a[1] = bArr[i13];
                        this.f345280g = 2;
                        this.f345279f = 1;
                        break;
                    }
                    i13++;
                }
            } else if (i12 == 1) {
                int iMin = Math.min(f12.a(), 4 - this.f345280g);
                f12.c(this.f345280g, iMin, f13.f348070a);
                int i15 = this.f345280g + iMin;
                this.f345280g = i15;
                if (i15 >= 4) {
                    f13.B(0);
                    int iD2 = f13.d();
                    u.a aVar = this.f345275b;
                    if (aVar.a(iD2)) {
                        this.f345284k = aVar.f344097c;
                        if (!this.f345281h) {
                            this.f345283j = (aVar.f344101g * 1000000) / aVar.f344098d;
                            I.b bVar = new I.b();
                            bVar.f343494a = this.f345278e;
                            bVar.f343504k = aVar.f344096b;
                            bVar.f343505l = 4096;
                            bVar.f343517x = aVar.f344099e;
                            bVar.f343518y = aVar.f344098d;
                            bVar.f343496c = this.f345276c;
                            this.f345277d.a(bVar.a());
                            this.f345281h = true;
                        }
                        f13.B(0);
                        this.f345277d.c(4, f13);
                        this.f345279f = 2;
                    } else {
                        this.f345280g = 0;
                        this.f345279f = 1;
                    }
                }
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException();
                }
                int iMin2 = Math.min(f12.a(), this.f345284k - this.f345280g);
                this.f345277d.c(iMin2, f12);
                int i16 = this.f345280g + iMin2;
                this.f345280g = i16;
                int i17 = this.f345284k;
                if (i16 >= i17) {
                    long j12 = this.f345285l;
                    if (j12 != -9223372036854775807L) {
                        this.f345277d.f(j12, 1, i17, 0, null);
                        this.f345285l += this.f345283j;
                    }
                    this.f345280g = 0;
                    this.f345279f = 0;
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.j
    public final void d(int i12, long j12) {
        if (j12 != -9223372036854775807L) {
            this.f345285l = j12;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.j
    public final void e(com.google.android.exoplayer2.extractor.l lVar, D.e eVar) {
        eVar.a();
        eVar.b();
        this.f345278e = eVar.f345040e;
        eVar.b();
        this.f345277d = lVar.c(eVar.f345039d, 1);
    }

    public q(@P String str) {
        this.f345279f = 0;
        com.google.android.exoplayer2.util.F f12 = new com.google.android.exoplayer2.util.F(4);
        this.f345274a = f12;
        f12.f348070a[0] = -1;
        this.f345275b = new u.a();
        this.f345285l = -9223372036854775807L;
        this.f345276c = str;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.j
    public final void b() {
    }
}
