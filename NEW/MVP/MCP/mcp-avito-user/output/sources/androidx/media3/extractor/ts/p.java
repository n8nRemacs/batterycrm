package androidx.media3.extractor.ts;

import androidx.media3.common.C23108t;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.J;
import androidx.media3.extractor.C23182a;
import androidx.media3.extractor.ts.D;
import j.P;
import java.util.Collections;

/* compiled from: LatmReader.java */
@J
/* loaded from: classes.dex */
public final class p implements j {

    /* renamed from: a, reason: collision with root package name */
    @P
    public final String f51757a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.media3.common.util.z f51758b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.media3.common.util.y f51759c;

    /* renamed from: d, reason: collision with root package name */
    public androidx.media3.extractor.J f51760d;

    /* renamed from: e, reason: collision with root package name */
    public String f51761e;

    /* renamed from: f, reason: collision with root package name */
    public C23108t f51762f;

    /* renamed from: g, reason: collision with root package name */
    public int f51763g;

    /* renamed from: h, reason: collision with root package name */
    public int f51764h;

    /* renamed from: i, reason: collision with root package name */
    public int f51765i;

    /* renamed from: j, reason: collision with root package name */
    public int f51766j;

    /* renamed from: k, reason: collision with root package name */
    public long f51767k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f51768l;

    /* renamed from: m, reason: collision with root package name */
    public int f51769m;

    /* renamed from: n, reason: collision with root package name */
    public int f51770n;

    /* renamed from: o, reason: collision with root package name */
    public int f51771o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f51772p;

    /* renamed from: q, reason: collision with root package name */
    public long f51773q;

    /* renamed from: r, reason: collision with root package name */
    public int f51774r;

    /* renamed from: s, reason: collision with root package name */
    public long f51775s;

    /* renamed from: t, reason: collision with root package name */
    public int f51776t;

    /* renamed from: u, reason: collision with root package name */
    @P
    public String f51777u;

    public p(@P String str) {
        this.f51757a = str;
        androidx.media3.common.util.z zVar = new androidx.media3.common.util.z(1024);
        this.f51758b = zVar;
        byte[] bArr = zVar.f47962a;
        this.f51759c = new androidx.media3.common.util.y(bArr, bArr.length);
        this.f51767k = -9223372036854775807L;
    }

    @Override // androidx.media3.extractor.ts.j
    public final void a() {
        this.f51763g = 0;
        this.f51767k = -9223372036854775807L;
        this.f51768l = false;
    }

    @Override // androidx.media3.extractor.ts.j
    public final void c(androidx.media3.common.util.z zVar) throws ParserException {
        int iG2;
        boolean zF2;
        C23110a.h(this.f51760d);
        while (zVar.a() > 0) {
            int i12 = this.f51763g;
            if (i12 != 0) {
                if (i12 != 1) {
                    androidx.media3.common.util.z zVar2 = this.f51758b;
                    androidx.media3.common.util.y yVar = this.f51759c;
                    if (i12 == 2) {
                        int iU2 = ((this.f51766j & (-225)) << 8) | zVar.u();
                        this.f51765i = iU2;
                        if (iU2 > zVar2.f47962a.length) {
                            zVar2.C(iU2);
                            byte[] bArr = zVar2.f47962a;
                            yVar.getClass();
                            yVar.j(bArr.length, bArr);
                        }
                        this.f51764h = 0;
                        this.f51763g = 3;
                    } else {
                        if (i12 != 3) {
                            throw new IllegalStateException();
                        }
                        int iMin = Math.min(zVar.a(), this.f51765i - this.f51764h);
                        zVar.e(this.f51764h, iMin, yVar.f47955a);
                        int i13 = this.f51764h + iMin;
                        this.f51764h = i13;
                        if (i13 == this.f51765i) {
                            yVar.l(0);
                            if (yVar.f()) {
                                if (this.f51768l) {
                                }
                                this.f51763g = 0;
                            } else {
                                this.f51768l = true;
                                int iG3 = yVar.g(1);
                                int iG4 = iG3 == 1 ? yVar.g(1) : 0;
                                this.f51769m = iG4;
                                if (iG4 != 0) {
                                    throw ParserException.a(null, null);
                                }
                                if (iG3 == 1) {
                                    yVar.g((yVar.g(2) + 1) * 8);
                                }
                                if (!yVar.f()) {
                                    throw ParserException.a(null, null);
                                }
                                this.f51770n = yVar.g(6);
                                int iG5 = yVar.g(4);
                                int iG6 = yVar.g(3);
                                if (iG5 != 0 || iG6 != 0) {
                                    throw ParserException.a(null, null);
                                }
                                if (iG3 == 0) {
                                    int iE2 = yVar.e();
                                    int iB2 = yVar.b();
                                    C23182a.c cVarB = C23182a.b(yVar, true);
                                    this.f51777u = cVarB.f50408c;
                                    this.f51774r = cVarB.f50406a;
                                    this.f51776t = cVarB.f50407b;
                                    int iB3 = iB2 - yVar.b();
                                    yVar.l(iE2);
                                    byte[] bArr2 = new byte[(iB3 + 7) / 8];
                                    yVar.h(iB3, bArr2);
                                    C23108t.b bVar = new C23108t.b();
                                    bVar.f47777a = this.f51761e;
                                    bVar.f47787k = "audio/mp4a-latm";
                                    bVar.f47784h = this.f51777u;
                                    bVar.f47800x = this.f51776t;
                                    bVar.f47801y = this.f51774r;
                                    bVar.f47789m = Collections.singletonList(bArr2);
                                    bVar.f47779c = this.f51757a;
                                    C23108t c23108tA = bVar.a();
                                    if (!c23108tA.equals(this.f51762f)) {
                                        this.f51762f = c23108tA;
                                        this.f51775s = 1024000000 / c23108tA.f47737A;
                                        this.f51760d.b(c23108tA);
                                    }
                                } else {
                                    int iB4 = yVar.b();
                                    C23182a.c cVarB2 = C23182a.b(yVar, true);
                                    this.f51777u = cVarB2.f50408c;
                                    this.f51774r = cVarB2.f50406a;
                                    this.f51776t = cVarB2.f50407b;
                                    yVar.n(yVar.g((yVar.g(2) + 1) * 8) - (iB4 - yVar.b()));
                                }
                                int iG7 = yVar.g(3);
                                this.f51771o = iG7;
                                if (iG7 == 0) {
                                    yVar.n(8);
                                } else if (iG7 == 1) {
                                    yVar.n(9);
                                } else if (iG7 == 3 || iG7 == 4 || iG7 == 5) {
                                    yVar.n(6);
                                } else {
                                    if (iG7 != 6 && iG7 != 7) {
                                        throw new IllegalStateException();
                                    }
                                    yVar.n(1);
                                }
                                boolean zF3 = yVar.f();
                                this.f51772p = zF3;
                                this.f51773q = 0L;
                                if (zF3) {
                                    if (iG3 == 1) {
                                        this.f51773q = yVar.g((yVar.g(2) + 1) * 8);
                                    } else {
                                        do {
                                            zF2 = yVar.f();
                                            this.f51773q = (this.f51773q << 8) + yVar.g(8);
                                        } while (zF2);
                                    }
                                }
                                if (yVar.f()) {
                                    yVar.n(8);
                                }
                            }
                            if (this.f51769m != 0) {
                                throw ParserException.a(null, null);
                            }
                            if (this.f51770n != 0) {
                                throw ParserException.a(null, null);
                            }
                            if (this.f51771o != 0) {
                                throw ParserException.a(null, null);
                            }
                            int i14 = 0;
                            do {
                                iG2 = yVar.g(8);
                                i14 += iG2;
                            } while (iG2 == 255);
                            int iE3 = yVar.e();
                            if ((iE3 & 7) == 0) {
                                zVar2.F(iE3 >> 3);
                            } else {
                                yVar.h(i14 * 8, zVar2.f47962a);
                                zVar2.F(0);
                            }
                            this.f51760d.e(i14, zVar2);
                            long j12 = this.f51767k;
                            if (j12 != -9223372036854775807L) {
                                this.f51760d.f(j12, 1, i14, 0, null);
                                this.f51767k += this.f51775s;
                            }
                            if (this.f51772p) {
                                yVar.n((int) this.f51773q);
                            }
                            this.f51763g = 0;
                        } else {
                            continue;
                        }
                    }
                } else {
                    int iU3 = zVar.u();
                    if ((iU3 & 224) == 224) {
                        this.f51766j = iU3;
                        this.f51763g = 2;
                    } else if (iU3 != 86) {
                        this.f51763g = 0;
                    }
                }
            } else if (zVar.u() == 86) {
                this.f51763g = 1;
            }
        }
    }

    @Override // androidx.media3.extractor.ts.j
    public final void d(int i12, long j12) {
        if (j12 != -9223372036854775807L) {
            this.f51767k = j12;
        }
    }

    @Override // androidx.media3.extractor.ts.j
    public final void e(androidx.media3.extractor.r rVar, D.e eVar) {
        eVar.a();
        eVar.b();
        this.f51760d = rVar.c(eVar.f51541d, 1);
        eVar.b();
        this.f51761e = eVar.f51542e;
    }

    @Override // androidx.media3.extractor.ts.j
    public final void b() {
    }
}
