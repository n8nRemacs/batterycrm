package com.google.android.exoplayer2.extractor.mp3;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.audio.u;
import com.google.android.exoplayer2.extractor.A;
import com.google.android.exoplayer2.extractor.i;
import com.google.android.exoplayer2.extractor.j;
import com.google.android.exoplayer2.extractor.k;
import com.google.android.exoplayer2.extractor.l;
import com.google.android.exoplayer2.extractor.t;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.F;
import j.P;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: Mp3Extractor.java */
/* loaded from: classes6.dex */
public final class d implements j {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f344707t = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f344708a;

    /* renamed from: b, reason: collision with root package name */
    public final F f344709b;

    /* renamed from: c, reason: collision with root package name */
    public final u.a f344710c;

    /* renamed from: d, reason: collision with root package name */
    public final t f344711d;

    /* renamed from: e, reason: collision with root package name */
    public final com.google.android.exoplayer2.extractor.u f344712e;

    /* renamed from: f, reason: collision with root package name */
    public final i f344713f;

    /* renamed from: g, reason: collision with root package name */
    public l f344714g;

    /* renamed from: h, reason: collision with root package name */
    public A f344715h;

    /* renamed from: i, reason: collision with root package name */
    public A f344716i;

    /* renamed from: j, reason: collision with root package name */
    public int f344717j;

    /* renamed from: k, reason: collision with root package name */
    @P
    public Metadata f344718k;

    /* renamed from: l, reason: collision with root package name */
    public long f344719l;

    /* renamed from: m, reason: collision with root package name */
    public long f344720m;

    /* renamed from: n, reason: collision with root package name */
    public long f344721n;

    /* renamed from: o, reason: collision with root package name */
    public int f344722o;

    /* renamed from: p, reason: collision with root package name */
    public e f344723p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f344724q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f344725r;

    /* renamed from: s, reason: collision with root package name */
    public long f344726s;

    /* compiled from: Mp3Extractor.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public d() {
        this(0);
    }

    @Override // com.google.android.exoplayer2.extractor.j
    public final void a(long j12, long j13) {
        this.f344717j = 0;
        this.f344719l = -9223372036854775807L;
        this.f344720m = 0L;
        this.f344722o = 0;
        this.f344726s = j13;
        e eVar = this.f344723p;
        if (!(eVar instanceof b) || ((b) eVar).a(j13)) {
            return;
        }
        this.f344725r = true;
        this.f344716i = this.f344713f;
    }

    @Override // com.google.android.exoplayer2.extractor.j
    public final void b(l lVar) {
        this.f344714g = lVar;
        A aC2 = lVar.c(0, 1);
        this.f344715h = aC2;
        this.f344716i = aC2;
        this.f344714g.b();
    }

    public final com.google.android.exoplayer2.extractor.mp3.a c(com.google.android.exoplayer2.extractor.f fVar, boolean z12) {
        F f12 = this.f344709b;
        fVar.a(f12.f348070a, 0, 4, false);
        f12.B(0);
        int iD2 = f12.d();
        u.a aVar = this.f344710c;
        aVar.a(iD2);
        return new com.google.android.exoplayer2.extractor.mp3.a(aVar.f344100f, aVar.f344097c, fVar.f344494c, fVar.f344495d, z12);
    }

    public final boolean d(com.google.android.exoplayer2.extractor.f fVar) {
        e eVar = this.f344723p;
        if (eVar != null) {
            long jC2 = eVar.c();
            if (jC2 != -1 && fVar.g() > jC2 - 4) {
                return true;
            }
        }
        try {
            return !fVar.a(this.f344709b.f348070a, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    public final boolean e(com.google.android.exoplayer2.extractor.f fVar, boolean z12) throws ParserException, EOFException, InterruptedIOException {
        int iG2;
        int i12;
        int iA2;
        int i13 = z12 ? 32768 : 131072;
        fVar.f344497f = 0;
        if (fVar.f344495d == 0) {
            Metadata metadataA = this.f344712e.a(fVar, null);
            this.f344718k = metadataA;
            if (metadataA != null) {
                this.f344711d.b(metadataA);
            }
            iG2 = (int) fVar.g();
            if (!z12) {
                fVar.i(iG2);
            }
            i12 = 0;
        } else {
            iG2 = 0;
            i12 = 0;
        }
        int i14 = i12;
        int i15 = i14;
        while (true) {
            if (!d(fVar)) {
                F f12 = this.f344709b;
                f12.B(0);
                int iD2 = f12.d();
                if ((i12 == 0 || ((-128000) & iD2) == (i12 & (-128000))) && (iA2 = u.a(iD2)) != -1) {
                    i14++;
                    if (i14 != 1) {
                        if (i14 == 4) {
                            break;
                        }
                    } else {
                        this.f344710c.a(iD2);
                        i12 = iD2;
                    }
                    fVar.l(iA2 - 4, false);
                } else {
                    int i16 = i15 + 1;
                    if (i15 == i13) {
                        if (z12) {
                            return false;
                        }
                        throw ParserException.a("Searched too many bytes.", null);
                    }
                    if (z12) {
                        fVar.f344497f = 0;
                        fVar.l(iG2 + i16, false);
                    } else {
                        fVar.i(1);
                    }
                    i14 = 0;
                    i15 = i16;
                    i12 = 0;
                }
            } else if (i14 <= 0) {
                throw new EOFException();
            }
        }
        if (z12) {
            fVar.i(iG2 + i15);
        } else {
            fVar.f344497f = 0;
        }
        this.f344717j = i12;
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.j
    public final boolean h(k kVar) {
        return e((com.google.android.exoplayer2.extractor.f) kVar, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0261 A[LOOP:2: B:114:0x025f->B:115:0x0261, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    @Override // com.google.android.exoplayer2.extractor.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(com.google.android.exoplayer2.extractor.k r37, com.google.android.exoplayer2.extractor.w r38) throws com.google.android.exoplayer2.ParserException, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 1054
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mp3.d.i(com.google.android.exoplayer2.extractor.k, com.google.android.exoplayer2.extractor.w):int");
    }

    public d(int i12) {
        this(-9223372036854775807L);
    }

    public d(long j12) {
        this.f344708a = j12;
        this.f344709b = new F(10);
        this.f344710c = new u.a();
        this.f344711d = new t();
        this.f344719l = -9223372036854775807L;
        this.f344712e = new com.google.android.exoplayer2.extractor.u();
        i iVar = new i();
        this.f344713f = iVar;
        this.f344716i = iVar;
    }

    @Override // com.google.android.exoplayer2.extractor.j
    public final void release() {
    }
}
