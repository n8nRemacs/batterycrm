package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.extractor.ts.D;
import com.google.android.exoplayer2.util.C36585a;
import com.google.android.exoplayer2.util.O;
import j.P;

/* compiled from: PesReader.java */
/* loaded from: classes6.dex */
public final class t implements D {

    /* renamed from: a, reason: collision with root package name */
    public final j f345294a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.exoplayer2.util.E f345295b = new com.google.android.exoplayer2.util.E(new byte[10], 10);

    /* renamed from: c, reason: collision with root package name */
    public int f345296c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f345297d;

    /* renamed from: e, reason: collision with root package name */
    public O f345298e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f345299f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f345300g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f345301h;

    /* renamed from: i, reason: collision with root package name */
    public int f345302i;

    /* renamed from: j, reason: collision with root package name */
    public int f345303j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f345304k;

    /* renamed from: l, reason: collision with root package name */
    public long f345305l;

    public t(j jVar) {
        this.f345294a = jVar;
    }

    @Override // com.google.android.exoplayer2.extractor.ts.D
    public final void a() {
        this.f345296c = 0;
        this.f345297d = 0;
        this.f345301h = false;
        this.f345294a.a();
    }

    @Override // com.google.android.exoplayer2.extractor.ts.D
    public final void b(O o12, com.google.android.exoplayer2.extractor.l lVar, D.e eVar) {
        this.f345298e = o12;
        this.f345294a.e(lVar, eVar);
    }

    @Override // com.google.android.exoplayer2.extractor.ts.D
    public final void c(int i12, com.google.android.exoplayer2.util.F f12) {
        int i13;
        int i14;
        C36585a.e(this.f345298e);
        int i15 = i12 & 1;
        j jVar = this.f345294a;
        int i16 = 2;
        if (i15 != 0) {
            int i17 = this.f345296c;
            if (i17 != 0 && i17 != 1 && i17 != 2) {
                if (i17 != 3) {
                    throw new IllegalStateException();
                }
                jVar.b();
            }
            this.f345296c = 1;
            this.f345297d = 0;
        }
        int i18 = i12;
        while (f12.a() > 0) {
            int i19 = this.f345296c;
            if (i19 != 0) {
                com.google.android.exoplayer2.util.E e12 = this.f345295b;
                if (i19 != 1) {
                    if (i19 == i16) {
                        if (d(f12, e12.f348059a, Math.min(10, this.f345302i)) && d(f12, null, this.f345302i)) {
                            e12.k(0);
                            this.f345305l = -9223372036854775807L;
                            if (this.f345299f) {
                                e12.m(4);
                                e12.m(1);
                                e12.m(1);
                                long jG2 = (e12.g(3) << 30) | (e12.g(15) << 15) | e12.g(15);
                                e12.m(1);
                                if (!this.f345301h && this.f345300g) {
                                    e12.m(4);
                                    e12.m(1);
                                    e12.m(1);
                                    e12.m(1);
                                    this.f345298e.b((e12.g(15) << 15) | (e12.g(3) << 30) | e12.g(15));
                                    this.f345301h = true;
                                }
                                this.f345305l = this.f345298e.b(jG2);
                            }
                            i18 |= this.f345304k ? 4 : 0;
                            jVar.d(i18, this.f345305l);
                            this.f345296c = 3;
                            this.f345297d = 0;
                            i16 = 2;
                        }
                    } else {
                        if (i19 != 3) {
                            throw new IllegalStateException();
                        }
                        int iA2 = f12.a();
                        int i22 = this.f345303j;
                        int i23 = i22 == -1 ? 0 : iA2 - i22;
                        if (i23 > 0) {
                            iA2 -= i23;
                            f12.A(f12.f348071b + iA2);
                        }
                        jVar.c(f12);
                        int i24 = this.f345303j;
                        if (i24 != -1) {
                            int i25 = i24 - iA2;
                            this.f345303j = i25;
                            if (i25 == 0) {
                                jVar.b();
                                this.f345296c = 1;
                                this.f345297d = 0;
                            }
                        }
                    }
                    i13 = i16;
                } else if (d(f12, e12.f348059a, 9)) {
                    e12.k(0);
                    if (e12.g(24) != 1) {
                        this.f345303j = -1;
                        i14 = 0;
                        i13 = 2;
                    } else {
                        e12.m(8);
                        int iG2 = e12.g(16);
                        e12.m(5);
                        this.f345304k = e12.f();
                        i13 = 2;
                        e12.m(2);
                        this.f345299f = e12.f();
                        this.f345300g = e12.f();
                        e12.m(6);
                        int iG3 = e12.g(8);
                        this.f345302i = iG3;
                        if (iG2 == 0) {
                            this.f345303j = -1;
                        } else {
                            int i26 = (iG2 - 3) - iG3;
                            this.f345303j = i26;
                            if (i26 < 0) {
                                this.f345303j = -1;
                            }
                        }
                        i14 = 2;
                    }
                    this.f345296c = i14;
                    this.f345297d = 0;
                } else {
                    i13 = 2;
                }
            } else {
                i13 = i16;
                f12.C(f12.a());
            }
            i16 = i13;
        }
    }

    public final boolean d(com.google.android.exoplayer2.util.F f12, @P byte[] bArr, int i12) {
        int iMin = Math.min(f12.a(), i12 - this.f345297d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            f12.C(iMin);
        } else {
            f12.c(this.f345297d, iMin, bArr);
        }
        int i13 = this.f345297d + iMin;
        this.f345297d = i13;
        return i13 == i12;
    }
}
