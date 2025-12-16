package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.ts.D;
import com.google.android.exoplayer2.extractor.y;
import com.google.android.exoplayer2.util.C36585a;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: AdtsExtractor.java */
/* renamed from: com.google.android.exoplayer2.extractor.ts.e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36520e implements com.google.android.exoplayer2.extractor.j {

    /* renamed from: a, reason: collision with root package name */
    public final C36521f f345073a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.exoplayer2.util.F f345074b;

    /* renamed from: c, reason: collision with root package name */
    public final com.google.android.exoplayer2.util.F f345075c;

    /* renamed from: d, reason: collision with root package name */
    public final com.google.android.exoplayer2.util.E f345076d;

    /* renamed from: e, reason: collision with root package name */
    public com.google.android.exoplayer2.extractor.l f345077e;

    /* renamed from: f, reason: collision with root package name */
    public long f345078f;

    /* renamed from: g, reason: collision with root package name */
    public long f345079g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f345080h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f345081i;

    /* compiled from: AdtsExtractor.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.exoplayer2.extractor.ts.e$a */
    public @interface a {
    }

    public C36520e() {
        this(0);
    }

    @Override // com.google.android.exoplayer2.extractor.j
    public final void a(long j12, long j13) {
        this.f345080h = false;
        this.f345073a.a();
        this.f345078f = j13;
    }

    @Override // com.google.android.exoplayer2.extractor.j
    public final void b(com.google.android.exoplayer2.extractor.l lVar) {
        this.f345077e = lVar;
        this.f345073a.e(lVar, new D.e(0, 1));
        lVar.b();
    }

    @Override // com.google.android.exoplayer2.extractor.j
    public final boolean h(com.google.android.exoplayer2.extractor.k kVar) throws EOFException, InterruptedIOException {
        com.google.android.exoplayer2.extractor.f fVar = (com.google.android.exoplayer2.extractor.f) kVar;
        int i12 = 0;
        while (true) {
            com.google.android.exoplayer2.util.F f12 = this.f345075c;
            fVar.a(f12.f348070a, 0, 10, false);
            f12.B(0);
            if (f12.t() != 4801587) {
                break;
            }
            f12.C(3);
            int iQ2 = f12.q();
            i12 += iQ2 + 10;
            fVar.l(iQ2, false);
        }
        fVar.f344497f = 0;
        fVar.l(i12, false);
        if (this.f345079g == -1) {
            this.f345079g = i12;
        }
        int i13 = i12;
        int i14 = 0;
        int i15 = 0;
        do {
            com.google.android.exoplayer2.util.F f13 = this.f345075c;
            fVar.a(f13.f348070a, 0, 2, false);
            f13.B(0);
            if ((f13.w() & 65526) == 65520) {
                i14++;
                if (i14 >= 4 && i15 > 188) {
                    return true;
                }
                fVar.a(f13.f348070a, 0, 4, false);
                com.google.android.exoplayer2.util.E e12 = this.f345076d;
                e12.k(14);
                int iG2 = e12.g(13);
                if (iG2 <= 6) {
                    i13++;
                    fVar.f344497f = 0;
                    fVar.l(i13, false);
                } else {
                    fVar.l(iG2 - 6, false);
                    i15 += iG2;
                }
            } else {
                i13++;
                fVar.f344497f = 0;
                fVar.l(i13, false);
            }
            i14 = 0;
            i15 = 0;
        } while (i13 - i12 < 8192);
        return false;
    }

    @Override // com.google.android.exoplayer2.extractor.j
    public final int i(com.google.android.exoplayer2.extractor.k kVar, com.google.android.exoplayer2.extractor.w wVar) throws ParserException, EOFException, InterruptedIOException {
        C36585a.e(this.f345077e);
        long j12 = ((com.google.android.exoplayer2.extractor.f) kVar).f344494c;
        com.google.android.exoplayer2.util.F f12 = this.f345074b;
        int i12 = ((com.google.android.exoplayer2.extractor.f) kVar).read(f12.f348070a, 0, 2048);
        boolean z12 = i12 == -1;
        if (!this.f345081i) {
            this.f345077e.i(new y.b(-9223372036854775807L));
            this.f345081i = true;
        }
        if (z12) {
            return -1;
        }
        f12.B(0);
        f12.A(i12);
        boolean z13 = this.f345080h;
        C36521f c36521f = this.f345073a;
        if (!z13) {
            c36521f.d(4, this.f345078f);
            this.f345080h = true;
        }
        c36521f.c(f12);
        return 0;
    }

    public C36520e(int i12) {
        this.f345073a = new C36521f(true, null);
        this.f345074b = new com.google.android.exoplayer2.util.F(2048);
        this.f345079g = -1L;
        com.google.android.exoplayer2.util.F f12 = new com.google.android.exoplayer2.util.F(10);
        this.f345075c = f12;
        byte[] bArr = f12.f348070a;
        this.f345076d = new com.google.android.exoplayer2.util.E(bArr, bArr.length);
    }

    @Override // com.google.android.exoplayer2.extractor.j
    public final void release() {
    }
}
