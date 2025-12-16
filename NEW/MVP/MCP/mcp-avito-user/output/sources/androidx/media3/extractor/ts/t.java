package androidx.media3.extractor.ts;

import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.J;
import androidx.media3.extractor.ts.D;
import j.P;

/* compiled from: PesReader.java */
@J
/* loaded from: classes.dex */
public final class t implements D {

    /* renamed from: a, reason: collision with root package name */
    public final j f51798a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.media3.common.util.y f51799b = new androidx.media3.common.util.y(new byte[10], 10);

    /* renamed from: c, reason: collision with root package name */
    public int f51800c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f51801d;

    /* renamed from: e, reason: collision with root package name */
    public androidx.media3.common.util.G f51802e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f51803f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f51804g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f51805h;

    /* renamed from: i, reason: collision with root package name */
    public int f51806i;

    /* renamed from: j, reason: collision with root package name */
    public int f51807j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f51808k;

    /* renamed from: l, reason: collision with root package name */
    public long f51809l;

    public t(j jVar) {
        this.f51798a = jVar;
    }

    @Override // androidx.media3.extractor.ts.D
    public final void a() {
        this.f51800c = 0;
        this.f51801d = 0;
        this.f51805h = false;
        this.f51798a.a();
    }

    @Override // androidx.media3.extractor.ts.D
    public final void b(androidx.media3.common.util.G g12, androidx.media3.extractor.r rVar, D.e eVar) {
        this.f51802e = g12;
        this.f51798a.e(rVar, eVar);
    }

    @Override // androidx.media3.extractor.ts.D
    public final void c(int i12, androidx.media3.common.util.z zVar) {
        int i13;
        int i14;
        int i15;
        int i16;
        C23110a.h(this.f51802e);
        int i17 = i12 & 1;
        j jVar = this.f51798a;
        int i18 = -1;
        int i19 = 3;
        int i22 = 2;
        if (i17 != 0) {
            int i23 = this.f51800c;
            if (i23 != 0 && i23 != 1) {
                if (i23 == 2) {
                    androidx.media3.common.util.s.g();
                } else {
                    if (i23 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.f51807j != -1) {
                        androidx.media3.common.util.s.g();
                    }
                    jVar.b();
                }
            }
            this.f51800c = 1;
            this.f51801d = 0;
        }
        int i24 = i12;
        while (zVar.a() > 0) {
            int i25 = this.f51800c;
            if (i25 != 0) {
                androidx.media3.common.util.y yVar = this.f51799b;
                if (i25 == 1) {
                    i14 = i19;
                    if (d(zVar, yVar.f47955a, 9)) {
                        yVar.l(0);
                        if (yVar.g(24) != 1) {
                            androidx.media3.common.util.s.g();
                            this.f51807j = -1;
                            i16 = 0;
                            i15 = 2;
                            i13 = -1;
                        } else {
                            yVar.n(8);
                            int iG2 = yVar.g(16);
                            yVar.n(5);
                            this.f51808k = yVar.f();
                            i15 = 2;
                            yVar.n(2);
                            this.f51803f = yVar.f();
                            this.f51804g = yVar.f();
                            yVar.n(6);
                            int iG3 = yVar.g(8);
                            this.f51806i = iG3;
                            if (iG2 == 0) {
                                i13 = -1;
                                this.f51807j = -1;
                            } else {
                                i13 = -1;
                                int i26 = (iG2 - 3) - iG3;
                                this.f51807j = i26;
                                if (i26 < 0) {
                                    androidx.media3.common.util.s.g();
                                    this.f51807j = -1;
                                }
                            }
                            i16 = 2;
                        }
                        this.f51800c = i16;
                        this.f51801d = 0;
                    } else {
                        i15 = 2;
                        i13 = -1;
                    }
                } else if (i25 == i22) {
                    if (d(zVar, yVar.f47955a, Math.min(10, this.f51806i)) && d(zVar, null, this.f51806i)) {
                        yVar.l(0);
                        this.f51809l = -9223372036854775807L;
                        if (this.f51803f) {
                            yVar.n(4);
                            yVar.n(1);
                            yVar.n(1);
                            long jG2 = (yVar.g(15) << 15) | (yVar.g(i19) << 30) | yVar.g(15);
                            yVar.n(1);
                            if (!this.f51805h && this.f51804g) {
                                yVar.n(4);
                                yVar.n(1);
                                yVar.n(1);
                                yVar.n(1);
                                this.f51802e.b((yVar.g(15) << 15) | (yVar.g(i19) << 30) | yVar.g(15));
                                this.f51805h = true;
                            }
                            this.f51809l = this.f51802e.b(jG2);
                        }
                        i24 |= this.f51808k ? 4 : 0;
                        jVar.d(i24, this.f51809l);
                        this.f51800c = 3;
                        this.f51801d = 0;
                        i19 = 3;
                        i18 = -1;
                        i22 = 2;
                    } else {
                        i14 = i19;
                        i15 = i22;
                        i13 = -1;
                    }
                } else {
                    if (i25 != i19) {
                        throw new IllegalStateException();
                    }
                    int iA2 = zVar.a();
                    int i27 = this.f51807j;
                    int i28 = i27 == i18 ? 0 : iA2 - i27;
                    if (i28 > 0) {
                        iA2 -= i28;
                        zVar.E(zVar.f47963b + iA2);
                    }
                    jVar.c(zVar);
                    int i29 = this.f51807j;
                    if (i29 != i18) {
                        int i32 = i29 - iA2;
                        this.f51807j = i32;
                        if (i32 == 0) {
                            jVar.b();
                            this.f51800c = 1;
                            this.f51801d = 0;
                        }
                    }
                    i13 = i18;
                    i14 = i19;
                    i15 = i22;
                }
            } else {
                i13 = i18;
                i14 = i19;
                i15 = i22;
                zVar.G(zVar.a());
            }
            i19 = i14;
            i22 = i15;
            i18 = i13;
        }
    }

    public final boolean d(androidx.media3.common.util.z zVar, @P byte[] bArr, int i12) {
        int iMin = Math.min(zVar.a(), i12 - this.f51801d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            zVar.G(iMin);
        } else {
            zVar.e(this.f51801d, iMin, bArr);
        }
        int i13 = this.f51801d + iMin;
        this.f51801d = i13;
        return i13 == i12;
    }
}
