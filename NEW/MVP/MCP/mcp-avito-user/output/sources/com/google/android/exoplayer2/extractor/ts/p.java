package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.I;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.audio.C36503a;
import com.google.android.exoplayer2.extractor.ts.D;
import com.google.android.exoplayer2.util.C36585a;
import j.P;
import java.util.Collections;

/* compiled from: LatmReader.java */
/* loaded from: classes6.dex */
public final class p implements j {

    /* renamed from: a, reason: collision with root package name */
    @P
    public final String f345253a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.exoplayer2.util.F f345254b;

    /* renamed from: c, reason: collision with root package name */
    public final com.google.android.exoplayer2.util.E f345255c;

    /* renamed from: d, reason: collision with root package name */
    public com.google.android.exoplayer2.extractor.A f345256d;

    /* renamed from: e, reason: collision with root package name */
    public String f345257e;

    /* renamed from: f, reason: collision with root package name */
    public I f345258f;

    /* renamed from: g, reason: collision with root package name */
    public int f345259g;

    /* renamed from: h, reason: collision with root package name */
    public int f345260h;

    /* renamed from: i, reason: collision with root package name */
    public int f345261i;

    /* renamed from: j, reason: collision with root package name */
    public int f345262j;

    /* renamed from: k, reason: collision with root package name */
    public long f345263k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f345264l;

    /* renamed from: m, reason: collision with root package name */
    public int f345265m;

    /* renamed from: n, reason: collision with root package name */
    public int f345266n;

    /* renamed from: o, reason: collision with root package name */
    public int f345267o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f345268p;

    /* renamed from: q, reason: collision with root package name */
    public long f345269q;

    /* renamed from: r, reason: collision with root package name */
    public int f345270r;

    /* renamed from: s, reason: collision with root package name */
    public long f345271s;

    /* renamed from: t, reason: collision with root package name */
    public int f345272t;

    /* renamed from: u, reason: collision with root package name */
    @P
    public String f345273u;

    public p(@P String str) {
        this.f345253a = str;
        com.google.android.exoplayer2.util.F f12 = new com.google.android.exoplayer2.util.F(1024);
        this.f345254b = f12;
        byte[] bArr = f12.f348070a;
        this.f345255c = new com.google.android.exoplayer2.util.E(bArr, bArr.length);
        this.f345263k = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.j
    public final void a() {
        this.f345259g = 0;
        this.f345263k = -9223372036854775807L;
        this.f345264l = false;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.j
    public final void c(com.google.android.exoplayer2.util.F f12) throws ParserException {
        int iG2;
        boolean zF2;
        C36585a.e(this.f345256d);
        while (f12.a() > 0) {
            int i12 = this.f345259g;
            if (i12 != 0) {
                if (i12 != 1) {
                    com.google.android.exoplayer2.util.F f13 = this.f345254b;
                    com.google.android.exoplayer2.util.E e12 = this.f345255c;
                    if (i12 == 2) {
                        int iR2 = ((this.f345262j & (-225)) << 8) | f12.r();
                        this.f345261i = iR2;
                        if (iR2 > f13.f348070a.length) {
                            f13.y(iR2);
                            byte[] bArr = f13.f348070a;
                            e12.j(bArr.length, bArr);
                        }
                        this.f345260h = 0;
                        this.f345259g = 3;
                    } else {
                        if (i12 != 3) {
                            throw new IllegalStateException();
                        }
                        int iMin = Math.min(f12.a(), this.f345261i - this.f345260h);
                        f12.c(this.f345260h, iMin, e12.f348059a);
                        int i13 = this.f345260h + iMin;
                        this.f345260h = i13;
                        if (i13 == this.f345261i) {
                            e12.k(0);
                            if (e12.f()) {
                                if (this.f345264l) {
                                }
                                this.f345259g = 0;
                            } else {
                                this.f345264l = true;
                                int iG3 = e12.g(1);
                                int iG4 = iG3 == 1 ? e12.g(1) : 0;
                                this.f345265m = iG4;
                                if (iG4 != 0) {
                                    throw ParserException.a(null, null);
                                }
                                if (iG3 == 1) {
                                    e12.g((e12.g(2) + 1) * 8);
                                }
                                if (!e12.f()) {
                                    throw ParserException.a(null, null);
                                }
                                this.f345266n = e12.g(6);
                                int iG5 = e12.g(4);
                                int iG6 = e12.g(3);
                                if (iG5 != 0 || iG6 != 0) {
                                    throw ParserException.a(null, null);
                                }
                                if (iG3 == 0) {
                                    int iE2 = e12.e();
                                    int iB2 = e12.b();
                                    C36503a.c cVarB = C36503a.b(e12, true);
                                    this.f345273u = cVarB.f343953c;
                                    this.f345270r = cVarB.f343951a;
                                    this.f345272t = cVarB.f343952b;
                                    int iB3 = iB2 - e12.b();
                                    e12.k(iE2);
                                    byte[] bArr2 = new byte[(iB3 + 7) / 8];
                                    e12.h(iB3, bArr2);
                                    I.b bVar = new I.b();
                                    bVar.f343494a = this.f345257e;
                                    bVar.f343504k = "audio/mp4a-latm";
                                    bVar.f343501h = this.f345273u;
                                    bVar.f343517x = this.f345272t;
                                    bVar.f343518y = this.f345270r;
                                    bVar.f343506m = Collections.singletonList(bArr2);
                                    bVar.f343496c = this.f345253a;
                                    I iA2 = bVar.a();
                                    if (!iA2.equals(this.f345258f)) {
                                        this.f345258f = iA2;
                                        this.f345271s = 1024000000 / iA2.f343458A;
                                        this.f345256d.a(iA2);
                                    }
                                } else {
                                    int iB4 = e12.b();
                                    C36503a.c cVarB2 = C36503a.b(e12, true);
                                    this.f345273u = cVarB2.f343953c;
                                    this.f345270r = cVarB2.f343951a;
                                    this.f345272t = cVarB2.f343952b;
                                    e12.m(e12.g((e12.g(2) + 1) * 8) - (iB4 - e12.b()));
                                }
                                int iG7 = e12.g(3);
                                this.f345267o = iG7;
                                if (iG7 == 0) {
                                    e12.m(8);
                                } else if (iG7 == 1) {
                                    e12.m(9);
                                } else if (iG7 == 3 || iG7 == 4 || iG7 == 5) {
                                    e12.m(6);
                                } else {
                                    if (iG7 != 6 && iG7 != 7) {
                                        throw new IllegalStateException();
                                    }
                                    e12.m(1);
                                }
                                boolean zF3 = e12.f();
                                this.f345268p = zF3;
                                this.f345269q = 0L;
                                if (zF3) {
                                    if (iG3 == 1) {
                                        this.f345269q = e12.g((e12.g(2) + 1) * 8);
                                    } else {
                                        do {
                                            zF2 = e12.f();
                                            this.f345269q = (this.f345269q << 8) + e12.g(8);
                                        } while (zF2);
                                    }
                                }
                                if (e12.f()) {
                                    e12.m(8);
                                }
                            }
                            if (this.f345265m != 0) {
                                throw ParserException.a(null, null);
                            }
                            if (this.f345266n != 0) {
                                throw ParserException.a(null, null);
                            }
                            if (this.f345267o != 0) {
                                throw ParserException.a(null, null);
                            }
                            int i14 = 0;
                            do {
                                iG2 = e12.g(8);
                                i14 += iG2;
                            } while (iG2 == 255);
                            int iE3 = e12.e();
                            if ((iE3 & 7) == 0) {
                                f13.B(iE3 >> 3);
                            } else {
                                e12.h(i14 * 8, f13.f348070a);
                                f13.B(0);
                            }
                            this.f345256d.c(i14, f13);
                            long j12 = this.f345263k;
                            if (j12 != -9223372036854775807L) {
                                this.f345256d.f(j12, 1, i14, 0, null);
                                this.f345263k += this.f345271s;
                            }
                            if (this.f345268p) {
                                e12.m((int) this.f345269q);
                            }
                            this.f345259g = 0;
                        } else {
                            continue;
                        }
                    }
                } else {
                    int iR3 = f12.r();
                    if ((iR3 & 224) == 224) {
                        this.f345262j = iR3;
                        this.f345259g = 2;
                    } else if (iR3 != 86) {
                        this.f345259g = 0;
                    }
                }
            } else if (f12.r() == 86) {
                this.f345259g = 1;
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.j
    public final void d(int i12, long j12) {
        if (j12 != -9223372036854775807L) {
            this.f345263k = j12;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ts.j
    public final void e(com.google.android.exoplayer2.extractor.l lVar, D.e eVar) {
        eVar.a();
        eVar.b();
        this.f345256d = lVar.c(eVar.f345039d, 1);
        eVar.b();
        this.f345257e = eVar.f345040e;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.j
    public final void b() {
    }
}
