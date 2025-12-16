package com.google.android.exoplayer2.extractor.ts;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseArray;
import com.google.android.exoplayer2.extractor.AbstractC36511a;
import com.google.android.exoplayer2.extractor.ts.D;
import com.google.android.exoplayer2.extractor.ts.u;
import com.google.android.exoplayer2.extractor.y;
import com.google.android.exoplayer2.util.C36585a;
import com.google.android.exoplayer2.util.O;
import j.P;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* compiled from: PsExtractor.java */
/* loaded from: classes6.dex */
public final class w implements com.google.android.exoplayer2.extractor.j {

    /* renamed from: e, reason: collision with root package name */
    public boolean f345320e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f345321f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f345322g;

    /* renamed from: h, reason: collision with root package name */
    public long f345323h;

    /* renamed from: i, reason: collision with root package name */
    @P
    public u f345324i;

    /* renamed from: j, reason: collision with root package name */
    public com.google.android.exoplayer2.extractor.l f345325j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f345326k;

    /* renamed from: a, reason: collision with root package name */
    public final O f345316a = new O(0);

    /* renamed from: c, reason: collision with root package name */
    public final com.google.android.exoplayer2.util.F f345318c = new com.google.android.exoplayer2.util.F(4096);

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray<a> f345317b = new SparseArray<>();

    /* renamed from: d, reason: collision with root package name */
    public final v f345319d = new v();

    /* compiled from: PsExtractor.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final j f345327a;

        /* renamed from: b, reason: collision with root package name */
        public final O f345328b;

        /* renamed from: c, reason: collision with root package name */
        public final com.google.android.exoplayer2.util.E f345329c = new com.google.android.exoplayer2.util.E(new byte[64], 64);

        /* renamed from: d, reason: collision with root package name */
        public boolean f345330d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f345331e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f345332f;

        /* renamed from: g, reason: collision with root package name */
        public long f345333g;

        public a(j jVar, O o12) {
            this.f345327a = jVar;
            this.f345328b = o12;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.j
    public final void a(long j12, long j13) {
        long j14;
        O o12 = this.f345316a;
        synchronized (o12) {
            j14 = o12.f348100b;
        }
        boolean z12 = j14 == -9223372036854775807L;
        if (!z12) {
            long jC2 = o12.c();
            z12 = (jC2 == -9223372036854775807L || jC2 == 0 || jC2 == j13) ? false : true;
        }
        if (z12) {
            o12.d(j13);
        }
        u uVar = this.f345324i;
        if (uVar != null) {
            uVar.c(j13);
        }
        int i12 = 0;
        while (true) {
            SparseArray<a> sparseArray = this.f345317b;
            if (i12 >= sparseArray.size()) {
                return;
            }
            a aVarValueAt = sparseArray.valueAt(i12);
            aVarValueAt.f345332f = false;
            aVarValueAt.f345327a.a();
            i12++;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.j
    public final void b(com.google.android.exoplayer2.extractor.l lVar) {
        this.f345325j = lVar;
    }

    @Override // com.google.android.exoplayer2.extractor.j
    public final boolean h(com.google.android.exoplayer2.extractor.k kVar) throws EOFException, InterruptedIOException {
        byte[] bArr = new byte[14];
        com.google.android.exoplayer2.extractor.f fVar = (com.google.android.exoplayer2.extractor.f) kVar;
        fVar.a(bArr, 0, 14, false);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        fVar.l(bArr[13] & 7, false);
        fVar.a(bArr, 0, 3, false);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }

    @Override // com.google.android.exoplayer2.extractor.j
    public final int i(com.google.android.exoplayer2.extractor.k kVar, com.google.android.exoplayer2.extractor.w wVar) throws EOFException, InterruptedIOException {
        int i12;
        j jVar;
        long j12;
        j kVar2;
        long jC2;
        C36585a.e(this.f345325j);
        long j13 = ((com.google.android.exoplayer2.extractor.f) kVar).f344494c;
        int i13 = (j13 > (-1L) ? 1 : (j13 == (-1L) ? 0 : -1));
        int i14 = 1;
        long j14 = -9223372036854775807L;
        v vVar = this.f345319d;
        if (i13 != 0 && !vVar.f345310c) {
            boolean z12 = vVar.f345312e;
            com.google.android.exoplayer2.util.F f12 = vVar.f345309b;
            if (!z12) {
                com.google.android.exoplayer2.extractor.f fVar = (com.google.android.exoplayer2.extractor.f) kVar;
                long j15 = fVar.f344494c;
                int iMin = (int) Math.min(20000L, j15);
                long j16 = j15 - iMin;
                if (fVar.f344495d != j16) {
                    wVar.f345347a = j16;
                } else {
                    f12.y(iMin);
                    fVar.f344497f = 0;
                    fVar.a(f12.f348070a, 0, iMin, false);
                    int i15 = f12.f348071b;
                    int i16 = f12.f348072c - 4;
                    while (true) {
                        if (i16 < i15) {
                            break;
                        }
                        if (v.b(i16, f12.f348070a) == 442) {
                            f12.B(i16 + 4);
                            long jC3 = v.c(f12);
                            if (jC3 != -9223372036854775807L) {
                                j14 = jC3;
                                break;
                            }
                        }
                        i16--;
                    }
                    vVar.f345314g = j14;
                    vVar.f345312e = true;
                    i14 = 0;
                }
            } else {
                if (vVar.f345314g == -9223372036854775807L) {
                    vVar.a((com.google.android.exoplayer2.extractor.f) kVar);
                    return 0;
                }
                if (vVar.f345311d) {
                    long j17 = vVar.f345313f;
                    if (j17 == -9223372036854775807L) {
                        vVar.a((com.google.android.exoplayer2.extractor.f) kVar);
                        return 0;
                    }
                    O o12 = vVar.f345308a;
                    long jB2 = o12.b(vVar.f345314g) - o12.b(j17);
                    vVar.f345315h = jB2;
                    if (jB2 < 0) {
                        vVar.f345315h = -9223372036854775807L;
                    }
                    vVar.a((com.google.android.exoplayer2.extractor.f) kVar);
                    return 0;
                }
                com.google.android.exoplayer2.extractor.f fVar2 = (com.google.android.exoplayer2.extractor.f) kVar;
                int iMin2 = (int) Math.min(20000L, fVar2.f344494c);
                long j18 = 0;
                if (fVar2.f344495d != j18) {
                    wVar.f345347a = j18;
                } else {
                    f12.y(iMin2);
                    fVar2.f344497f = 0;
                    fVar2.a(f12.f348070a, 0, iMin2, false);
                    int i17 = f12.f348071b;
                    int i18 = f12.f348072c;
                    while (true) {
                        if (i17 >= i18 - 3) {
                            jC2 = -9223372036854775807L;
                            break;
                        }
                        if (v.b(i17, f12.f348070a) == 442) {
                            f12.B(i17 + 4);
                            jC2 = v.c(f12);
                            if (jC2 != -9223372036854775807L) {
                                break;
                            }
                        }
                        i17++;
                    }
                    vVar.f345313f = jC2;
                    vVar.f345311d = true;
                    i14 = 0;
                }
            }
            return i14;
        }
        if (this.f345326k) {
            i12 = i13;
            jVar = null;
            j12 = j13;
        } else {
            this.f345326k = true;
            long j19 = vVar.f345315h;
            if (j19 != -9223372036854775807L) {
                jVar = null;
                i12 = i13;
                j12 = j13;
                u uVar = new u(new AbstractC36511a.b(), new u.b(vVar.f345308a, null), j19, j19 + 1, 0L, j13, 188L, 1000);
                this.f345324i = uVar;
                this.f345325j.i(uVar.f344396a);
            } else {
                i12 = i13;
                jVar = null;
                j12 = j13;
                this.f345325j.i(new y.b(j19));
            }
        }
        u uVar2 = this.f345324i;
        if (uVar2 != null && uVar2.f344398c != null) {
            return uVar2.a((com.google.android.exoplayer2.extractor.f) kVar, wVar);
        }
        com.google.android.exoplayer2.extractor.f fVar3 = (com.google.android.exoplayer2.extractor.f) kVar;
        fVar3.f344497f = 0;
        long jG2 = i12 != 0 ? j12 - fVar3.g() : -1L;
        if (jG2 != -1 && jG2 < 4) {
            return -1;
        }
        com.google.android.exoplayer2.util.F f13 = this.f345318c;
        if (!fVar3.a(f13.f348070a, 0, 4, true)) {
            return -1;
        }
        f13.B(0);
        int iD2 = f13.d();
        if (iD2 == 441) {
            return -1;
        }
        if (iD2 == 442) {
            fVar3.a(f13.f348070a, 0, 10, false);
            f13.B(9);
            fVar3.i((f13.r() & 7) + 14);
            return 0;
        }
        if (iD2 == 443) {
            fVar3.a(f13.f348070a, 0, 2, false);
            f13.B(0);
            fVar3.i(f13.w() + 6);
            return 0;
        }
        if (((iD2 & (-256)) >> 8) != 1) {
            fVar3.i(1);
            return 0;
        }
        int i19 = iD2 & 255;
        SparseArray<a> sparseArray = this.f345317b;
        a aVar = sparseArray.get(i19);
        if (!this.f345320e) {
            if (aVar == null) {
                if (i19 == 189) {
                    kVar2 = new C36517b();
                    this.f345321f = true;
                    this.f345323h = fVar3.f344495d;
                } else if ((iD2 & 224) == 192) {
                    kVar2 = new q();
                    this.f345321f = true;
                    this.f345323h = fVar3.f344495d;
                } else if ((iD2 & 240) == 224) {
                    kVar2 = new k();
                    this.f345322g = true;
                    this.f345323h = fVar3.f344495d;
                } else {
                    kVar2 = jVar;
                }
                if (kVar2 != null) {
                    kVar2.e(this.f345325j, new D.e(i19, 256));
                    aVar = new a(kVar2, this.f345316a);
                    sparseArray.put(i19, aVar);
                }
            }
            if (fVar3.f344495d > ((this.f345321f && this.f345322g) ? this.f345323h + PlaybackStateCompat.ACTION_PLAY_FROM_URI : PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED)) {
                this.f345320e = true;
                this.f345325j.b();
            }
        }
        fVar3.a(f13.f348070a, 0, 2, false);
        f13.B(0);
        int iW2 = f13.w() + 6;
        if (aVar == null) {
            fVar3.i(iW2);
            return 0;
        }
        f13.y(iW2);
        fVar3.d(f13.f348070a, 0, iW2, false);
        f13.B(6);
        com.google.android.exoplayer2.util.E e12 = aVar.f345329c;
        f13.c(0, 3, e12.f348059a);
        e12.k(0);
        e12.m(8);
        aVar.f345330d = e12.f();
        aVar.f345331e = e12.f();
        e12.m(6);
        f13.c(0, e12.g(8), e12.f348059a);
        e12.k(0);
        aVar.f345333g = 0L;
        if (aVar.f345330d) {
            e12.m(4);
            e12.m(1);
            e12.m(1);
            long jG3 = (e12.g(3) << 30) | (e12.g(15) << 15) | e12.g(15);
            e12.m(1);
            boolean z13 = aVar.f345332f;
            O o13 = aVar.f345328b;
            if (!z13 && aVar.f345331e) {
                e12.m(4);
                e12.m(1);
                e12.m(1);
                e12.m(1);
                o13.b((e12.g(3) << 30) | (e12.g(15) << 15) | e12.g(15));
                aVar.f345332f = true;
            }
            aVar.f345333g = o13.b(jG3);
        }
        long j22 = aVar.f345333g;
        j jVar2 = aVar.f345327a;
        jVar2.d(4, j22);
        jVar2.c(f13);
        jVar2.b();
        f13.A(f13.f348070a.length);
        return 0;
    }

    @Override // com.google.android.exoplayer2.extractor.j
    public final void release() {
    }
}
