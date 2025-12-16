package androidx.media3.extractor.ts;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseArray;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.J;
import androidx.media3.extractor.AbstractC23186e;
import androidx.media3.extractor.C23191j;
import androidx.media3.extractor.H;
import androidx.media3.extractor.ts.D;
import androidx.media3.extractor.ts.u;
import j.P;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* compiled from: PsExtractor.java */
@J
/* loaded from: classes.dex */
public final class w implements androidx.media3.extractor.p {

    /* renamed from: e, reason: collision with root package name */
    public boolean f51824e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f51825f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f51826g;

    /* renamed from: h, reason: collision with root package name */
    public long f51827h;

    /* renamed from: i, reason: collision with root package name */
    @P
    public u f51828i;

    /* renamed from: j, reason: collision with root package name */
    public androidx.media3.extractor.r f51829j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f51830k;

    /* renamed from: a, reason: collision with root package name */
    public final androidx.media3.common.util.G f51820a = new androidx.media3.common.util.G(0);

    /* renamed from: c, reason: collision with root package name */
    public final androidx.media3.common.util.z f51822c = new androidx.media3.common.util.z(4096);

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray<a> f51821b = new SparseArray<>();

    /* renamed from: d, reason: collision with root package name */
    public final v f51823d = new v();

    /* compiled from: PsExtractor.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final j f51831a;

        /* renamed from: b, reason: collision with root package name */
        public final androidx.media3.common.util.G f51832b;

        /* renamed from: c, reason: collision with root package name */
        public final androidx.media3.common.util.y f51833c = new androidx.media3.common.util.y(new byte[64], 64);

        /* renamed from: d, reason: collision with root package name */
        public boolean f51834d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f51835e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f51836f;

        /* renamed from: g, reason: collision with root package name */
        public long f51837g;

        public a(j jVar, androidx.media3.common.util.G g12) {
            this.f51831a = jVar;
            this.f51832b = g12;
        }
    }

    @Override // androidx.media3.extractor.p
    public final void a(long j12, long j13) {
        long j14;
        androidx.media3.common.util.G g12 = this.f51820a;
        synchronized (g12) {
            j14 = g12.f47883b;
        }
        boolean z12 = j14 == -9223372036854775807L;
        if (!z12) {
            long jC2 = g12.c();
            z12 = (jC2 == -9223372036854775807L || jC2 == 0 || jC2 == j13) ? false : true;
        }
        if (z12) {
            g12.d(j13);
        }
        u uVar = this.f51828i;
        if (uVar != null) {
            uVar.c(j13);
        }
        int i12 = 0;
        while (true) {
            SparseArray<a> sparseArray = this.f51821b;
            if (i12 >= sparseArray.size()) {
                return;
            }
            a aVarValueAt = sparseArray.valueAt(i12);
            aVarValueAt.f51836f = false;
            aVarValueAt.f51831a.a();
            i12++;
        }
    }

    @Override // androidx.media3.extractor.p
    public final boolean b(androidx.media3.extractor.q qVar) throws EOFException, InterruptedIOException {
        byte[] bArr = new byte[14];
        C23191j c23191j = (C23191j) qVar;
        c23191j.a(bArr, 0, 14, false);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        c23191j.k(bArr[13] & 7, false);
        c23191j.a(bArr, 0, 3, false);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }

    @Override // androidx.media3.extractor.p
    public final int h(androidx.media3.extractor.q qVar, androidx.media3.extractor.F f12) throws EOFException, InterruptedIOException {
        int i12;
        j jVar;
        long j12;
        j kVar;
        long jC2;
        C23110a.h(this.f51829j);
        long j13 = ((C23191j) qVar).f50582c;
        int i13 = (j13 > (-1L) ? 1 : (j13 == (-1L) ? 0 : -1));
        int i14 = 1;
        long j14 = -9223372036854775807L;
        v vVar = this.f51823d;
        if (i13 != 0 && !vVar.f51814c) {
            boolean z12 = vVar.f51816e;
            androidx.media3.common.util.z zVar = vVar.f51813b;
            if (!z12) {
                C23191j c23191j = (C23191j) qVar;
                long j15 = c23191j.f50582c;
                int iMin = (int) Math.min(20000L, j15);
                long j16 = j15 - iMin;
                if (c23191j.f50583d != j16) {
                    f12.f50372a = j16;
                } else {
                    zVar.C(iMin);
                    c23191j.f50585f = 0;
                    c23191j.a(zVar.f47962a, 0, iMin, false);
                    int i15 = zVar.f47963b;
                    int i16 = zVar.f47964c - 4;
                    while (true) {
                        if (i16 < i15) {
                            break;
                        }
                        if (v.b(i16, zVar.f47962a) == 442) {
                            zVar.F(i16 + 4);
                            long jC3 = v.c(zVar);
                            if (jC3 != -9223372036854775807L) {
                                j14 = jC3;
                                break;
                            }
                        }
                        i16--;
                    }
                    vVar.f51818g = j14;
                    vVar.f51816e = true;
                    i14 = 0;
                }
            } else {
                if (vVar.f51818g == -9223372036854775807L) {
                    vVar.a((C23191j) qVar);
                    return 0;
                }
                if (vVar.f51815d) {
                    long j17 = vVar.f51817f;
                    if (j17 == -9223372036854775807L) {
                        vVar.a((C23191j) qVar);
                        return 0;
                    }
                    androidx.media3.common.util.G g12 = vVar.f51812a;
                    long jB2 = g12.b(vVar.f51818g) - g12.b(j17);
                    vVar.f51819h = jB2;
                    if (jB2 < 0) {
                        androidx.media3.common.util.s.g();
                        vVar.f51819h = -9223372036854775807L;
                    }
                    vVar.a((C23191j) qVar);
                    return 0;
                }
                C23191j c23191j2 = (C23191j) qVar;
                int iMin2 = (int) Math.min(20000L, c23191j2.f50582c);
                long j18 = 0;
                if (c23191j2.f50583d != j18) {
                    f12.f50372a = j18;
                } else {
                    zVar.C(iMin2);
                    c23191j2.f50585f = 0;
                    c23191j2.a(zVar.f47962a, 0, iMin2, false);
                    int i17 = zVar.f47963b;
                    int i18 = zVar.f47964c;
                    while (true) {
                        if (i17 >= i18 - 3) {
                            jC2 = -9223372036854775807L;
                            break;
                        }
                        if (v.b(i17, zVar.f47962a) == 442) {
                            zVar.F(i17 + 4);
                            jC2 = v.c(zVar);
                            if (jC2 != -9223372036854775807L) {
                                break;
                            }
                        }
                        i17++;
                    }
                    vVar.f51817f = jC2;
                    vVar.f51815d = true;
                    i14 = 0;
                }
            }
            return i14;
        }
        if (this.f51830k) {
            i12 = i13;
            jVar = null;
            j12 = j13;
        } else {
            this.f51830k = true;
            long j19 = vVar.f51819h;
            if (j19 != -9223372036854775807L) {
                jVar = null;
                i12 = i13;
                j12 = j13;
                u uVar = new u(new AbstractC23186e.b(), new u.b(vVar.f51812a, null), j19, j19 + 1, 0L, j13, 188L, 1000);
                this.f51828i = uVar;
                this.f51829j.e(uVar.f50498a);
            } else {
                i12 = i13;
                jVar = null;
                j12 = j13;
                this.f51829j.e(new H.b(j19));
            }
        }
        u uVar2 = this.f51828i;
        if (uVar2 != null && uVar2.f50500c != null) {
            return uVar2.a((C23191j) qVar, f12);
        }
        C23191j c23191j3 = (C23191j) qVar;
        c23191j3.f50585f = 0;
        long jG2 = i12 != 0 ? j12 - c23191j3.g() : -1L;
        if (jG2 != -1 && jG2 < 4) {
            return -1;
        }
        androidx.media3.common.util.z zVar2 = this.f51822c;
        if (!c23191j3.a(zVar2.f47962a, 0, 4, true)) {
            return -1;
        }
        zVar2.F(0);
        int iG2 = zVar2.g();
        if (iG2 == 441) {
            return -1;
        }
        if (iG2 == 442) {
            c23191j3.a(zVar2.f47962a, 0, 10, false);
            zVar2.F(9);
            c23191j3.i((zVar2.u() & 7) + 14);
            return 0;
        }
        if (iG2 == 443) {
            c23191j3.a(zVar2.f47962a, 0, 2, false);
            zVar2.F(0);
            c23191j3.i(zVar2.z() + 6);
            return 0;
        }
        if (((iG2 & (-256)) >> 8) != 1) {
            c23191j3.i(1);
            return 0;
        }
        int i19 = iG2 & 255;
        SparseArray<a> sparseArray = this.f51821b;
        a aVar = sparseArray.get(i19);
        if (!this.f51824e) {
            if (aVar == null) {
                if (i19 == 189) {
                    kVar = new C23198b();
                    this.f51825f = true;
                    this.f51827h = c23191j3.f50583d;
                } else if ((iG2 & 224) == 192) {
                    kVar = new q();
                    this.f51825f = true;
                    this.f51827h = c23191j3.f50583d;
                } else if ((iG2 & 240) == 224) {
                    kVar = new k();
                    this.f51826g = true;
                    this.f51827h = c23191j3.f50583d;
                } else {
                    kVar = jVar;
                }
                if (kVar != null) {
                    kVar.e(this.f51829j, new D.e(i19, 256));
                    aVar = new a(kVar, this.f51820a);
                    sparseArray.put(i19, aVar);
                }
            }
            if (c23191j3.f50583d > ((this.f51825f && this.f51826g) ? this.f51827h + PlaybackStateCompat.ACTION_PLAY_FROM_URI : PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED)) {
                this.f51824e = true;
                this.f51829j.b();
            }
        }
        c23191j3.a(zVar2.f47962a, 0, 2, false);
        zVar2.F(0);
        int iZ2 = zVar2.z() + 6;
        if (aVar == null) {
            c23191j3.i(iZ2);
            return 0;
        }
        zVar2.C(iZ2);
        c23191j3.d(zVar2.f47962a, 0, iZ2, false);
        zVar2.F(6);
        androidx.media3.common.util.y yVar = aVar.f51833c;
        zVar2.e(0, 3, yVar.f47955a);
        yVar.l(0);
        yVar.n(8);
        aVar.f51834d = yVar.f();
        aVar.f51835e = yVar.f();
        yVar.n(6);
        zVar2.e(0, yVar.g(8), yVar.f47955a);
        yVar.l(0);
        aVar.f51837g = 0L;
        if (aVar.f51834d) {
            yVar.n(4);
            yVar.n(1);
            yVar.n(1);
            long jG3 = (yVar.g(3) << 30) | (yVar.g(15) << 15) | yVar.g(15);
            yVar.n(1);
            boolean z13 = aVar.f51836f;
            androidx.media3.common.util.G g13 = aVar.f51832b;
            if (!z13 && aVar.f51835e) {
                yVar.n(4);
                yVar.n(1);
                yVar.n(1);
                yVar.n(1);
                g13.b((yVar.g(3) << 30) | (yVar.g(15) << 15) | yVar.g(15));
                aVar.f51836f = true;
            }
            aVar.f51837g = g13.b(jG3);
        }
        long j22 = aVar.f51837g;
        j jVar2 = aVar.f51831a;
        jVar2.d(4, j22);
        jVar2.c(zVar2);
        jVar2.b();
        zVar2.E(zVar2.f47962a.length);
        return 0;
    }

    @Override // androidx.media3.extractor.p
    public final void i(androidx.media3.extractor.r rVar) {
        this.f51829j = rVar;
    }

    @Override // androidx.media3.extractor.p
    public final void release() {
    }
}
