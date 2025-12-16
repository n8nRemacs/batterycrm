package com.google.android.exoplayer2;

import android.net.Uri;
import android.util.Pair;
import androidx.media3.common.C23088b;
import com.facebook.imageutils.JfifUtil;
import com.google.android.exoplayer2.O;
import com.google.android.exoplayer2.source.ads.a;
import com.google.android.exoplayer2.util.C36585a;

/* compiled from: Timeline.java */
/* loaded from: classes6.dex */
public abstract class s0 implements InterfaceC36525h {

    /* renamed from: b, reason: collision with root package name */
    public static final s0 f345869b = new a();

    /* compiled from: Timeline.java */
    public class a extends s0 {
        @Override // com.google.android.exoplayer2.s0
        public final int b(Object obj) {
            return -1;
        }

        @Override // com.google.android.exoplayer2.s0
        public final b f(int i12, b bVar, boolean z12) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.google.android.exoplayer2.s0
        public final int h() {
            return 0;
        }

        @Override // com.google.android.exoplayer2.s0
        public final Object l(int i12) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.google.android.exoplayer2.s0
        public final d m(int i12, d dVar, long j12) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.google.android.exoplayer2.s0
        public final int o() {
            return 0;
        }
    }

    /* compiled from: Timeline.java */
    public static final class b implements InterfaceC36525h {

        /* renamed from: b, reason: collision with root package name */
        @j.P
        public Integer f345870b;

        /* renamed from: c, reason: collision with root package name */
        @j.P
        public Object f345871c;

        /* renamed from: d, reason: collision with root package name */
        public int f345872d;

        /* renamed from: e, reason: collision with root package name */
        public long f345873e;

        /* renamed from: f, reason: collision with root package name */
        public long f345874f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f345875g;

        /* renamed from: h, reason: collision with root package name */
        public com.google.android.exoplayer2.source.ads.a f345876h = com.google.android.exoplayer2.source.ads.a.f346179h;

        public final long b(int i12, int i13) {
            a.b bVarA = this.f345876h.a(i12);
            if (bVarA.f346190c != -1) {
                return bVarA.f346193f[i13];
            }
            return -9223372036854775807L;
        }

        public final int c(long j12) {
            return this.f345876h.b(j12, this.f345873e);
        }

        public final long d(int i12) {
            return this.f345876h.a(i12).f346189b;
        }

        public final int e(int i12, int i13) {
            a.b bVarA = this.f345876h.a(i12);
            if (bVarA.f346190c != -1) {
                return bVarA.f346192e[i13];
            }
            return 0;
        }

        public final boolean equals(@j.P Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !b.class.equals(obj.getClass())) {
                return false;
            }
            b bVar = (b) obj;
            return com.google.android.exoplayer2.util.U.a(this.f345870b, bVar.f345870b) && com.google.android.exoplayer2.util.U.a(this.f345871c, bVar.f345871c) && this.f345872d == bVar.f345872d && this.f345873e == bVar.f345873e && this.f345874f == bVar.f345874f && this.f345875g == bVar.f345875g && com.google.android.exoplayer2.util.U.a(this.f345876h, bVar.f345876h);
        }

        public final int f(int i12) {
            return this.f345876h.a(i12).b(-1);
        }

        public final boolean g(int i12) {
            return this.f345876h.a(i12).f346195h;
        }

        public final void h(@j.P Integer num, @j.P Object obj, int i12, long j12, long j13, com.google.android.exoplayer2.source.ads.a aVar, boolean z12) {
            this.f345870b = num;
            this.f345871c = obj;
            this.f345872d = i12;
            this.f345873e = j12;
            this.f345874f = j13;
            this.f345876h = aVar;
            this.f345875g = z12;
        }

        public final int hashCode() {
            Integer num = this.f345870b;
            int iHashCode = (JfifUtil.MARKER_EOI + (num == null ? 0 : num.hashCode())) * 31;
            Object obj = this.f345871c;
            int iHashCode2 = (((iHashCode + (obj != null ? obj.hashCode() : 0)) * 31) + this.f345872d) * 31;
            long j12 = this.f345873e;
            int i12 = (iHashCode2 + ((int) (j12 ^ (j12 >>> 32)))) * 31;
            long j13 = this.f345874f;
            return this.f345876h.hashCode() + ((((i12 + ((int) (j13 ^ (j13 >>> 32)))) * 31) + (this.f345875g ? 1 : 0)) * 31);
        }
    }

    /* compiled from: Timeline.java */
    public static final class c extends s0 {
        @Override // com.google.android.exoplayer2.s0
        public final int a(boolean z12) {
            if (p()) {
                return -1;
            }
            if (z12) {
                throw null;
            }
            return 0;
        }

        @Override // com.google.android.exoplayer2.s0
        public final int b(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.android.exoplayer2.s0
        public final int c(boolean z12) {
            if (p()) {
                return -1;
            }
            if (z12) {
                throw null;
            }
            throw null;
        }

        @Override // com.google.android.exoplayer2.s0
        public final int e(int i12, int i13, boolean z12) {
            if (i13 == 1) {
                return i12;
            }
            if (i12 == c(z12)) {
                if (i13 == 2) {
                    return a(z12);
                }
                return -1;
            }
            if (z12) {
                throw null;
            }
            return i12 + 1;
        }

        @Override // com.google.android.exoplayer2.s0
        public final b f(int i12, b bVar, boolean z12) {
            throw null;
        }

        @Override // com.google.android.exoplayer2.s0
        public final int h() {
            throw null;
        }

        @Override // com.google.android.exoplayer2.s0
        public final int k(int i12, int i13, boolean z12) {
            if (i13 == 1) {
                return i12;
            }
            if (i12 == a(z12)) {
                if (i13 == 2) {
                    return c(z12);
                }
                return -1;
            }
            if (z12) {
                throw null;
            }
            return i12 - 1;
        }

        @Override // com.google.android.exoplayer2.s0
        public final Object l(int i12) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.android.exoplayer2.s0
        public final d m(int i12, d dVar, long j12) {
            throw null;
        }

        @Override // com.google.android.exoplayer2.s0
        public final int o() {
            throw null;
        }
    }

    /* compiled from: Timeline.java */
    public static final class d implements InterfaceC36525h {

        /* renamed from: s, reason: collision with root package name */
        public static final Object f345877s = new Object();

        /* renamed from: t, reason: collision with root package name */
        public static final Object f345878t = new Object();

        /* renamed from: u, reason: collision with root package name */
        public static final O f345879u;

        /* renamed from: c, reason: collision with root package name */
        @j.P
        @Deprecated
        public Object f345881c;

        /* renamed from: e, reason: collision with root package name */
        @j.P
        public com.google.android.exoplayer2.source.hls.k f345883e;

        /* renamed from: f, reason: collision with root package name */
        public long f345884f;

        /* renamed from: g, reason: collision with root package name */
        public long f345885g;

        /* renamed from: h, reason: collision with root package name */
        public long f345886h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f345887i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f345888j;

        /* renamed from: k, reason: collision with root package name */
        @Deprecated
        public boolean f345889k;

        /* renamed from: l, reason: collision with root package name */
        @j.P
        public O.g f345890l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f345891m;

        /* renamed from: n, reason: collision with root package name */
        public long f345892n;

        /* renamed from: o, reason: collision with root package name */
        public long f345893o;

        /* renamed from: p, reason: collision with root package name */
        public int f345894p;

        /* renamed from: q, reason: collision with root package name */
        public int f345895q;

        /* renamed from: r, reason: collision with root package name */
        public long f345896r;

        /* renamed from: b, reason: collision with root package name */
        public Object f345880b = f345877s;

        /* renamed from: d, reason: collision with root package name */
        public O f345882d = f345879u;

        static {
            O.c cVar = new O.c();
            cVar.f343534a = "com.google.android.exoplayer2.Timeline";
            cVar.f343535b = Uri.EMPTY;
            f345879u = cVar.a();
        }

        public final boolean a() {
            C36585a.d(this.f345889k == (this.f345890l != null));
            return this.f345890l != null;
        }

        public final void b(Object obj, @j.P O o12, @j.P com.google.android.exoplayer2.source.hls.k kVar, long j12, long j13, long j14, boolean z12, boolean z13, @j.P O.g gVar, long j15, long j16, int i12, int i13, long j17) {
            O.i iVar;
            this.f345880b = obj;
            this.f345882d = o12 != null ? o12 : f345879u;
            this.f345881c = (o12 == null || (iVar = o12.f343529c) == null) ? null : iVar.f343578h;
            this.f345883e = kVar;
            this.f345884f = j12;
            this.f345885g = j13;
            this.f345886h = j14;
            this.f345887i = z12;
            this.f345888j = z13;
            this.f345889k = gVar != null;
            this.f345890l = gVar;
            this.f345892n = j15;
            this.f345893o = j16;
            this.f345894p = i12;
            this.f345895q = i13;
            this.f345896r = j17;
            this.f345891m = false;
        }

        public final boolean equals(@j.P Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !d.class.equals(obj.getClass())) {
                return false;
            }
            d dVar = (d) obj;
            return com.google.android.exoplayer2.util.U.a(this.f345880b, dVar.f345880b) && com.google.android.exoplayer2.util.U.a(this.f345882d, dVar.f345882d) && com.google.android.exoplayer2.util.U.a(this.f345883e, dVar.f345883e) && com.google.android.exoplayer2.util.U.a(this.f345890l, dVar.f345890l) && this.f345884f == dVar.f345884f && this.f345885g == dVar.f345885g && this.f345886h == dVar.f345886h && this.f345887i == dVar.f345887i && this.f345888j == dVar.f345888j && this.f345891m == dVar.f345891m && this.f345892n == dVar.f345892n && this.f345893o == dVar.f345893o && this.f345894p == dVar.f345894p && this.f345895q == dVar.f345895q && this.f345896r == dVar.f345896r;
        }

        public final int hashCode() {
            int iHashCode = (this.f345882d.hashCode() + C23088b.a(JfifUtil.MARKER_EOI, 31, this.f345880b)) * 31;
            com.google.android.exoplayer2.source.hls.k kVar = this.f345883e;
            int iHashCode2 = (iHashCode + (kVar == null ? 0 : kVar.hashCode())) * 31;
            O.g gVar = this.f345890l;
            int iHashCode3 = (iHashCode2 + (gVar != null ? gVar.hashCode() : 0)) * 31;
            long j12 = this.f345884f;
            int i12 = (iHashCode3 + ((int) (j12 ^ (j12 >>> 32)))) * 31;
            long j13 = this.f345885g;
            int i13 = (i12 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
            long j14 = this.f345886h;
            int i14 = (((((((i13 + ((int) (j14 ^ (j14 >>> 32)))) * 31) + (this.f345887i ? 1 : 0)) * 31) + (this.f345888j ? 1 : 0)) * 31) + (this.f345891m ? 1 : 0)) * 31;
            long j15 = this.f345892n;
            int i15 = (i14 + ((int) (j15 ^ (j15 >>> 32)))) * 31;
            long j16 = this.f345893o;
            int i16 = (((((i15 + ((int) (j16 ^ (j16 >>> 32)))) * 31) + this.f345894p) * 31) + this.f345895q) * 31;
            long j17 = this.f345896r;
            return i16 + ((int) (j17 ^ (j17 >>> 32)));
        }
    }

    public int a(boolean z12) {
        return p() ? -1 : 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z12) {
        if (p()) {
            return -1;
        }
        return o() - 1;
    }

    public final int d(int i12, b bVar, d dVar, int i13, boolean z12) {
        int i14 = f(i12, bVar, false).f345872d;
        if (m(i14, dVar, 0L).f345895q != i12) {
            return i12 + 1;
        }
        int iE2 = e(i14, i13, z12);
        if (iE2 == -1) {
            return -1;
        }
        return m(iE2, dVar, 0L).f345894p;
    }

    public int e(int i12, int i13, boolean z12) {
        if (i13 == 0) {
            if (i12 == c(z12)) {
                return -1;
            }
            return i12 + 1;
        }
        if (i13 == 1) {
            return i12;
        }
        if (i13 == 2) {
            return i12 == c(z12) ? a(z12) : i12 + 1;
        }
        throw new IllegalStateException();
    }

    public final boolean equals(@j.P Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        if (s0Var.o() != o() || s0Var.h() != h()) {
            return false;
        }
        d dVar = new d();
        b bVar = new b();
        d dVar2 = new d();
        b bVar2 = new b();
        for (int i12 = 0; i12 < o(); i12++) {
            if (!m(i12, dVar, 0L).equals(s0Var.m(i12, dVar2, 0L))) {
                return false;
            }
        }
        for (int i13 = 0; i13 < h(); i13++) {
            if (!f(i13, bVar, true).equals(s0Var.f(i13, bVar2, true))) {
                return false;
            }
        }
        return true;
    }

    public abstract b f(int i12, b bVar, boolean z12);

    public b g(Object obj, b bVar) {
        return f(b(obj), bVar, true);
    }

    public abstract int h();

    public final int hashCode() {
        d dVar = new d();
        b bVar = new b();
        int iO2 = o() + JfifUtil.MARKER_EOI;
        for (int i12 = 0; i12 < o(); i12++) {
            iO2 = (iO2 * 31) + m(i12, dVar, 0L).hashCode();
        }
        int iH2 = h() + (iO2 * 31);
        for (int i13 = 0; i13 < h(); i13++) {
            iH2 = (iH2 * 31) + f(i13, bVar, true).hashCode();
        }
        return iH2;
    }

    public final Pair<Object, Long> i(d dVar, b bVar, int i12, long j12) {
        Pair<Object, Long> pairJ = j(dVar, bVar, i12, j12, 0L);
        pairJ.getClass();
        return pairJ;
    }

    @j.P
    public final Pair<Object, Long> j(d dVar, b bVar, int i12, long j12, long j13) {
        C36585a.c(i12, o());
        m(i12, dVar, j13);
        if (j12 == -9223372036854775807L) {
            j12 = dVar.f345892n;
            if (j12 == -9223372036854775807L) {
                return null;
            }
        }
        int i13 = dVar.f345894p;
        f(i13, bVar, false);
        while (i13 < dVar.f345895q && bVar.f345874f != j12) {
            int i14 = i13 + 1;
            if (f(i14, bVar, false).f345874f > j12) {
                break;
            }
            i13 = i14;
        }
        f(i13, bVar, true);
        long jMin = j12 - bVar.f345874f;
        long j14 = bVar.f345873e;
        if (j14 != -9223372036854775807L) {
            jMin = Math.min(jMin, j14 - 1);
        }
        long jMax = Math.max(0L, jMin);
        Object obj = bVar.f345871c;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    public int k(int i12, int i13, boolean z12) {
        if (i13 == 0) {
            if (i12 == a(z12)) {
                return -1;
            }
            return i12 - 1;
        }
        if (i13 == 1) {
            return i12;
        }
        if (i13 == 2) {
            return i12 == a(z12) ? c(z12) : i12 - 1;
        }
        throw new IllegalStateException();
    }

    public abstract Object l(int i12);

    public abstract d m(int i12, d dVar, long j12);

    public final void n(int i12, d dVar) {
        m(i12, dVar, 0L);
    }

    public abstract int o();

    public final boolean p() {
        return o() == 0;
    }
}
