package com.google.android.exoplayer2.trackselection;

import android.os.SystemClock;
import com.google.android.exoplayer2.I;
import com.google.android.exoplayer2.source.V;
import com.google.android.exoplayer2.trackselection.k;
import com.google.android.exoplayer2.upstream.InterfaceC36574d;
import com.google.android.exoplayer2.util.InterfaceC36589e;
import com.google.android.exoplayer2.util.L;
import com.google.android.exoplayer2.util.U;
import com.google.common.collect.AbstractC37401r1;
import com.google.common.collect.W1;
import j.InterfaceC42153i;
import j.P;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AdaptiveTrackSelection.java */
/* loaded from: classes6.dex */
public class a extends com.google.android.exoplayer2.trackselection.b {

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC36574d f347133g;

    /* renamed from: h, reason: collision with root package name */
    public final long f347134h;

    /* renamed from: i, reason: collision with root package name */
    public final long f347135i;

    /* renamed from: j, reason: collision with root package name */
    public final long f347136j;

    /* renamed from: k, reason: collision with root package name */
    public final int f347137k;

    /* renamed from: l, reason: collision with root package name */
    public final int f347138l;

    /* renamed from: m, reason: collision with root package name */
    public final float f347139m;

    /* renamed from: n, reason: collision with root package name */
    public final float f347140n;

    /* renamed from: o, reason: collision with root package name */
    public final AbstractC37401r1<C10606a> f347141o;

    /* renamed from: p, reason: collision with root package name */
    public final L f347142p;

    /* renamed from: q, reason: collision with root package name */
    public float f347143q;

    /* renamed from: r, reason: collision with root package name */
    public int f347144r;

    /* renamed from: s, reason: collision with root package name */
    public int f347145s;

    /* renamed from: t, reason: collision with root package name */
    public long f347146t;

    /* renamed from: u, reason: collision with root package name */
    @P
    public com.google.android.exoplayer2.source.chunk.m f347147u;

    /* compiled from: AdaptiveTrackSelection.java */
    /* renamed from: com.google.android.exoplayer2.trackselection.a$a, reason: collision with other inner class name */
    public static final class C10606a {

        /* renamed from: a, reason: collision with root package name */
        public final long f347148a;

        /* renamed from: b, reason: collision with root package name */
        public final long f347149b;

        public C10606a(long j12, long j13) {
            this.f347148a = j12;
            this.f347149b = j13;
        }

        public final boolean equals(@P Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10606a)) {
                return false;
            }
            C10606a c10606a = (C10606a) obj;
            return this.f347148a == c10606a.f347148a && this.f347149b == c10606a.f347149b;
        }

        public final int hashCode() {
            return (((int) this.f347148a) * 31) + ((int) this.f347149b);
        }
    }

    /* compiled from: AdaptiveTrackSelection.java */
    public static class b implements k.b {

        /* renamed from: a, reason: collision with root package name */
        public final int f347150a;

        /* renamed from: b, reason: collision with root package name */
        public final int f347151b;

        /* renamed from: c, reason: collision with root package name */
        public final int f347152c;

        /* renamed from: d, reason: collision with root package name */
        public final int f347153d;

        /* renamed from: e, reason: collision with root package name */
        public final int f347154e;

        /* renamed from: f, reason: collision with root package name */
        public final float f347155f;

        /* renamed from: g, reason: collision with root package name */
        public final float f347156g;

        /* renamed from: h, reason: collision with root package name */
        public final L f347157h;

        public b() {
            L l12 = InterfaceC36589e.f348123a;
            this.f347150a = 10000;
            this.f347151b = 25000;
            this.f347152c = 25000;
            this.f347153d = 1279;
            this.f347154e = 719;
            this.f347155f = 0.7f;
            this.f347156g = 0.75f;
            this.f347157h = l12;
        }
    }

    public a(V v12, int[] iArr, InterfaceC36574d interfaceC36574d, long j12, long j13, long j14, int i12, int i13, float f12, float f13, AbstractC37401r1 abstractC37401r1, L l12) {
        super(v12, iArr);
        long j15 = j14 < j12 ? j12 : j14;
        this.f347133g = interfaceC36574d;
        this.f347134h = j12 * 1000;
        this.f347135i = j13 * 1000;
        this.f347136j = j15 * 1000;
        this.f347137k = i12;
        this.f347138l = i13;
        this.f347139m = f12;
        this.f347140n = f13;
        this.f347141o = AbstractC37401r1.v(abstractC37401r1);
        this.f347142p = l12;
        this.f347143q = 1.0f;
        this.f347145s = 0;
        this.f347146t = -9223372036854775807L;
    }

    public static void t(ArrayList arrayList, long[] jArr) {
        long j12 = 0;
        for (long j13 : jArr) {
            j12 += j13;
        }
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            AbstractC37401r1.a aVar = (AbstractC37401r1.a) arrayList.get(i12);
            if (aVar != null) {
                aVar.g(new C10606a(j12, jArr[i12]));
            }
        }
    }

    public static long v(List list) {
        if (list.isEmpty()) {
            return -9223372036854775807L;
        }
        com.google.android.exoplayer2.source.chunk.m mVar = (com.google.android.exoplayer2.source.chunk.m) W1.d(list);
        long j12 = mVar.f346224g;
        if (j12 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j13 = mVar.f346225h;
        if (j13 != -9223372036854775807L) {
            return j13 - j12;
        }
        return -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.trackselection.b, com.google.android.exoplayer2.trackselection.k
    @InterfaceC42153i
    public final void N() {
        this.f347147u = null;
    }

    @Override // com.google.android.exoplayer2.trackselection.k
    public final int a() {
        return this.f347144r;
    }

    @Override // com.google.android.exoplayer2.trackselection.b, com.google.android.exoplayer2.trackselection.k
    public final void e(float f12) {
        this.f347143q = f12;
    }

    @Override // com.google.android.exoplayer2.trackselection.b, com.google.android.exoplayer2.trackselection.k
    @InterfaceC42153i
    public final void j() {
        this.f347146t = -9223372036854775807L;
        this.f347147u = null;
    }

    @Override // com.google.android.exoplayer2.trackselection.b, com.google.android.exoplayer2.trackselection.k
    public final int m(long j12, List<? extends com.google.android.exoplayer2.source.chunk.m> list) {
        int i12;
        int i13;
        this.f347142p.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j13 = this.f347146t;
        if (j13 != -9223372036854775807L && jElapsedRealtime - j13 < 1000 && (list.isEmpty() || ((com.google.android.exoplayer2.source.chunk.m) W1.d(list)).equals(this.f347147u))) {
            return list.size();
        }
        this.f347146t = jElapsedRealtime;
        this.f347147u = list.isEmpty() ? null : (com.google.android.exoplayer2.source.chunk.m) W1.d(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long jX2 = U.x(list.get(size - 1).f346224g - j12, this.f347143q);
        long j14 = this.f347136j;
        if (jX2 < j14) {
            return size;
        }
        I i14 = this.f347161d[u(jElapsedRealtime, v(list))];
        for (int i15 = 0; i15 < size; i15++) {
            com.google.android.exoplayer2.source.chunk.m mVar = list.get(i15);
            I i16 = mVar.f346221d;
            if (U.x(mVar.f346224g - j12, this.f347143q) >= j14 && i16.f343472i < i14.f343472i && (i12 = i16.f343482s) != -1 && i12 <= this.f347138l && (i13 = i16.f343481r) != -1 && i13 <= this.f347137k && i12 < i14.f343482s) {
                return i15;
            }
        }
        return size;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    @Override // com.google.android.exoplayer2.trackselection.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(long r14, long r16, long r18, java.util.List<? extends com.google.android.exoplayer2.source.chunk.m> r20, com.google.android.exoplayer2.source.chunk.n[] r21) {
        /*
            r13 = this;
            r0 = r13
            r1 = r21
            com.google.android.exoplayer2.util.L r2 = r0.f347142p
            r2.getClass()
            long r2 = android.os.SystemClock.elapsedRealtime()
            int r4 = r0.f347144r
            int r5 = r1.length
            r6 = 0
            if (r4 >= r5) goto L28
            r4 = r1[r4]
            boolean r4 = r4.next()
            if (r4 == 0) goto L28
            int r4 = r0.f347144r
            r1 = r1[r4]
            long r4 = r1.b()
            long r7 = r1.a()
        L26:
            long r4 = r4 - r7
            goto L44
        L28:
            int r4 = r1.length
            r5 = r6
        L2a:
            if (r5 >= r4) goto L40
            r7 = r1[r5]
            boolean r8 = r7.next()
            if (r8 == 0) goto L3d
            long r4 = r7.b()
            long r7 = r7.a()
            goto L26
        L3d:
            int r5 = r5 + 1
            goto L2a
        L40:
            long r4 = v(r20)
        L44:
            int r1 = r0.f347145s
            if (r1 != 0) goto L52
            r1 = 1
            r0.f347145s = r1
            int r1 = r13.u(r2, r4)
            r0.f347144r = r1
            return
        L52:
            int r7 = r0.f347144r
            boolean r8 = r20.isEmpty()
            com.google.android.exoplayer2.I[] r9 = r0.f347161d
            r10 = -1
            if (r8 == 0) goto L5f
        L5d:
            r6 = r10
            goto L73
        L5f:
            java.lang.Object r8 = com.google.common.collect.W1.d(r20)
            com.google.android.exoplayer2.source.chunk.m r8 = (com.google.android.exoplayer2.source.chunk.m) r8
            com.google.android.exoplayer2.I r8 = r8.f346221d
        L67:
            int r11 = r0.f347159b
            if (r6 >= r11) goto L5d
            r11 = r9[r6]
            if (r11 != r8) goto L70
            goto L73
        L70:
            int r6 = r6 + 1
            goto L67
        L73:
            if (r6 == r10) goto L7e
            java.lang.Object r1 = com.google.common.collect.W1.d(r20)
            com.google.android.exoplayer2.source.chunk.m r1 = (com.google.android.exoplayer2.source.chunk.m) r1
            int r1 = r1.f346222e
            r7 = r6
        L7e:
            int r6 = r13.u(r2, r4)
            boolean r2 = r13.p(r7, r2)
            if (r2 != 0) goto Lbe
            r2 = r9[r7]
            r3 = r9[r6]
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r10 = (r18 > r8 ? 1 : (r18 == r8 ? 0 : -1))
            long r11 = r0.f347134h
            if (r10 != 0) goto L98
            goto Laa
        L98:
            int r8 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r8 == 0) goto L9f
            long r4 = r18 - r4
            goto La1
        L9f:
            r4 = r18
        La1:
            float r4 = (float) r4
            float r5 = r0.f347140n
            float r4 = r4 * r5
            long r4 = (long) r4
            long r11 = java.lang.Math.min(r4, r11)
        Laa:
            int r3 = r3.f343472i
            int r2 = r2.f343472i
            if (r3 <= r2) goto Lb5
            int r4 = (r16 > r11 ? 1 : (r16 == r11 ? 0 : -1))
            if (r4 >= 0) goto Lb5
            goto Lbd
        Lb5:
            if (r3 >= r2) goto Lbe
            long r2 = r0.f347135i
            int r2 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
            if (r2 < 0) goto Lbe
        Lbd:
            r6 = r7
        Lbe:
            if (r6 != r7) goto Lc1
            goto Lc2
        Lc1:
            r1 = 3
        Lc2:
            r0.f347145s = r1
            r0.f347144r = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.trackselection.a.n(long, long, long, java.util.List, com.google.android.exoplayer2.source.chunk.n[]):void");
    }

    @Override // com.google.android.exoplayer2.trackselection.k
    @P
    public final Object r() {
        return null;
    }

    @Override // com.google.android.exoplayer2.trackselection.k
    public final int s() {
        return this.f347145s;
    }

    public final int u(long j12, long j13) {
        long jA2 = (long) (((long) (this.f347133g.a() * this.f347139m)) / this.f347143q);
        AbstractC37401r1<C10606a> abstractC37401r1 = this.f347141o;
        if (!abstractC37401r1.isEmpty()) {
            int i12 = 1;
            while (i12 < abstractC37401r1.size() - 1 && abstractC37401r1.get(i12).f347148a < jA2) {
                i12++;
            }
            C10606a c10606a = abstractC37401r1.get(i12 - 1);
            C10606a c10606a2 = abstractC37401r1.get(i12);
            long j14 = c10606a.f347148a;
            float f12 = (jA2 - j14) / (c10606a2.f347148a - j14);
            long j15 = c10606a2.f347149b;
            jA2 = ((long) (f12 * (j15 - r0))) + c10606a.f347149b;
        }
        int i13 = 0;
        for (int i14 = 0; i14 < this.f347159b; i14++) {
            if (j12 == Long.MIN_VALUE || !p(i14, j12)) {
                if (d(i14).f343472i <= jA2) {
                    return i14;
                }
                i13 = i14;
            }
        }
        return i13;
    }
}
