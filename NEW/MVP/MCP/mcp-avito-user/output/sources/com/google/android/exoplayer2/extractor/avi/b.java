package com.google.android.exoplayer2.extractor.avi;

import com.google.android.exoplayer2.extractor.j;
import com.google.android.exoplayer2.extractor.k;
import com.google.android.exoplayer2.extractor.l;
import com.google.android.exoplayer2.extractor.y;
import com.google.android.exoplayer2.util.F;
import com.google.android.exoplayer2.util.U;
import j.P;

/* compiled from: AviExtractor.java */
/* loaded from: classes6.dex */
public final class b implements j {

    /* renamed from: c, reason: collision with root package name */
    public int f344438c;

    /* renamed from: e, reason: collision with root package name */
    public com.google.android.exoplayer2.extractor.avi.c f344440e;

    /* renamed from: h, reason: collision with root package name */
    public long f344443h;

    /* renamed from: i, reason: collision with root package name */
    @P
    public e f344444i;

    /* renamed from: m, reason: collision with root package name */
    public int f344448m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f344449n;

    /* renamed from: a, reason: collision with root package name */
    public final F f344436a = new F(12);

    /* renamed from: b, reason: collision with root package name */
    public final c f344437b = new c();

    /* renamed from: d, reason: collision with root package name */
    public l f344439d = new com.google.android.exoplayer2.extractor.h();

    /* renamed from: g, reason: collision with root package name */
    public e[] f344442g = new e[0];

    /* renamed from: k, reason: collision with root package name */
    public long f344446k = -1;

    /* renamed from: l, reason: collision with root package name */
    public long f344447l = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f344445j = -1;

    /* renamed from: f, reason: collision with root package name */
    public long f344441f = -9223372036854775807L;

    /* compiled from: AviExtractor.java */
    /* renamed from: com.google.android.exoplayer2.extractor.avi.b$b, reason: collision with other inner class name */
    public class C10576b implements y {

        /* renamed from: a, reason: collision with root package name */
        public final long f344450a;

        public C10576b(long j12) {
            this.f344450a = j12;
        }

        @Override // com.google.android.exoplayer2.extractor.y
        public final long d() {
            return this.f344450a;
        }

        @Override // com.google.android.exoplayer2.extractor.y
        public final y.a f(long j12) {
            b bVar = b.this;
            y.a aVarB = bVar.f344442g[0].b(j12);
            int i12 = 1;
            while (true) {
                e[] eVarArr = bVar.f344442g;
                if (i12 >= eVarArr.length) {
                    return aVarB;
                }
                y.a aVarB2 = eVarArr[i12].b(j12);
                if (aVarB2.f345389a.f345395b < aVarB.f345389a.f345395b) {
                    aVarB = aVarB2;
                }
                i12++;
            }
        }

        @Override // com.google.android.exoplayer2.extractor.y
        public final boolean g() {
            return true;
        }
    }

    /* compiled from: AviExtractor.java */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public int f344452a;

        /* renamed from: b, reason: collision with root package name */
        public int f344453b;

        /* renamed from: c, reason: collision with root package name */
        public int f344454c;

        public c() {
        }
    }

    @Override // com.google.android.exoplayer2.extractor.j
    public final void a(long j12, long j13) {
        this.f344443h = -1L;
        this.f344444i = null;
        for (e eVar : this.f344442g) {
            if (eVar.f344472j == 0) {
                eVar.f344470h = 0;
            } else {
                eVar.f344470h = eVar.f344474l[U.f(eVar.f344473k, j12, true)];
            }
        }
        if (j12 != 0) {
            this.f344438c = 6;
        } else if (this.f344442g.length == 0) {
            this.f344438c = 0;
        } else {
            this.f344438c = 3;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.j
    public final void b(l lVar) {
        this.f344438c = 0;
        this.f344439d = lVar;
        this.f344443h = -1L;
    }

    @Override // com.google.android.exoplayer2.extractor.j
    public final boolean h(k kVar) {
        F f12 = this.f344436a;
        ((com.google.android.exoplayer2.extractor.f) kVar).a(f12.f348070a, 0, 12, false);
        f12.B(0);
        if (f12.f() != 1179011410) {
            return false;
        }
        f12.C(4);
        return f12.f() == 541677121;
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010a  */
    @Override // com.google.android.exoplayer2.extractor.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(com.google.android.exoplayer2.extractor.k r26, com.google.android.exoplayer2.extractor.w r27) throws com.google.android.exoplayer2.ParserException, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 1066
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.avi.b.i(com.google.android.exoplayer2.extractor.k, com.google.android.exoplayer2.extractor.w):int");
    }

    @Override // com.google.android.exoplayer2.extractor.j
    public final void release() {
    }
}
