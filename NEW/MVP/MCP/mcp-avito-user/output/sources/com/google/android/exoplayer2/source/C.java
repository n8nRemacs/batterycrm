package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.l0;
import com.google.android.exoplayer2.source.InterfaceC36559w;
import com.google.android.exoplayer2.util.C36585a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;

/* compiled from: MergingMediaPeriod.java */
/* loaded from: classes6.dex */
final class C implements InterfaceC36559w, InterfaceC36559w.a {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC36559w[] f345907b;

    /* renamed from: c, reason: collision with root package name */
    public final IdentityHashMap<M, Integer> f345908c;

    /* renamed from: d, reason: collision with root package name */
    public final C36547j f345909d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList<InterfaceC36559w> f345910e = new ArrayList<>();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap<V, V> f345911f = new HashMap<>();

    /* renamed from: g, reason: collision with root package name */
    @j.P
    public InterfaceC36559w.a f345912g;

    /* renamed from: h, reason: collision with root package name */
    @j.P
    public W f345913h;

    /* renamed from: i, reason: collision with root package name */
    public InterfaceC36559w[] f345914i;

    /* renamed from: j, reason: collision with root package name */
    public N f345915j;

    /* compiled from: MergingMediaPeriod.java */
    public static final class a implements com.google.android.exoplayer2.trackselection.k {

        /* renamed from: a, reason: collision with root package name */
        public final com.google.android.exoplayer2.trackselection.k f345916a;

        /* renamed from: b, reason: collision with root package name */
        public final V f345917b;

        public a(com.google.android.exoplayer2.trackselection.k kVar, V v12) {
            this.f345916a = kVar;
            this.f345917b = v12;
        }

        @Override // com.google.android.exoplayer2.trackselection.k
        public final void N() {
            this.f345916a.N();
        }

        @Override // com.google.android.exoplayer2.trackselection.k
        public final int a() {
            return this.f345916a.a();
        }

        @Override // com.google.android.exoplayer2.trackselection.o
        public final int b(int i12) {
            return this.f345916a.b(i12);
        }

        @Override // com.google.android.exoplayer2.trackselection.k
        public final com.google.android.exoplayer2.I c() {
            return this.f345916a.c();
        }

        @Override // com.google.android.exoplayer2.trackselection.o
        public final com.google.android.exoplayer2.I d(int i12) {
            return this.f345916a.d(i12);
        }

        @Override // com.google.android.exoplayer2.trackselection.k
        public final void e(float f12) {
            this.f345916a.e(f12);
        }

        public final boolean equals(@j.P Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f345916a.equals(aVar.f345916a) && this.f345917b.equals(aVar.f345917b);
        }

        @Override // com.google.android.exoplayer2.trackselection.k
        public final void f(boolean z12) {
            this.f345916a.f(z12);
        }

        @Override // com.google.android.exoplayer2.trackselection.k
        public final void g() {
            this.f345916a.g();
        }

        @Override // com.google.android.exoplayer2.trackselection.o
        public final int h(int i12) {
            return this.f345916a.h(i12);
        }

        public final int hashCode() {
            return this.f345916a.hashCode() + ((this.f345917b.hashCode() + 527) * 31);
        }

        @Override // com.google.android.exoplayer2.trackselection.o
        public final V i() {
            return this.f345917b;
        }

        @Override // com.google.android.exoplayer2.trackselection.k
        public final void j() {
            this.f345916a.j();
        }

        @Override // com.google.android.exoplayer2.trackselection.k
        public final void k() {
            this.f345916a.k();
        }

        @Override // com.google.android.exoplayer2.trackselection.k
        public final boolean l(long j12, com.google.android.exoplayer2.source.chunk.e eVar, List<? extends com.google.android.exoplayer2.source.chunk.m> list) {
            return this.f345916a.l(j12, eVar, list);
        }

        @Override // com.google.android.exoplayer2.trackselection.o
        public final int length() {
            return this.f345916a.length();
        }

        @Override // com.google.android.exoplayer2.trackselection.k
        public final int m(long j12, List<? extends com.google.android.exoplayer2.source.chunk.m> list) {
            return this.f345916a.m(j12, list);
        }

        @Override // com.google.android.exoplayer2.trackselection.k
        public final void n(long j12, long j13, long j14, List<? extends com.google.android.exoplayer2.source.chunk.m> list, com.google.android.exoplayer2.source.chunk.n[] nVarArr) {
            this.f345916a.n(j12, j13, j14, list, nVarArr);
        }

        @Override // com.google.android.exoplayer2.trackselection.k
        public final int o() {
            return this.f345916a.o();
        }

        @Override // com.google.android.exoplayer2.trackselection.k
        public final boolean p(int i12, long j12) {
            return this.f345916a.p(i12, j12);
        }

        @Override // com.google.android.exoplayer2.trackselection.k
        public final boolean q(int i12, long j12) {
            return this.f345916a.q(i12, j12);
        }

        @Override // com.google.android.exoplayer2.trackselection.k
        @j.P
        public final Object r() {
            return this.f345916a.r();
        }

        @Override // com.google.android.exoplayer2.trackselection.k
        public final int s() {
            return this.f345916a.s();
        }
    }

    /* compiled from: MergingMediaPeriod.java */
    public static final class b implements InterfaceC36559w, InterfaceC36559w.a {

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC36559w f345918b;

        /* renamed from: c, reason: collision with root package name */
        public final long f345919c;

        /* renamed from: d, reason: collision with root package name */
        public InterfaceC36559w.a f345920d;

        public b(InterfaceC36559w interfaceC36559w, long j12) {
            this.f345918b = interfaceC36559w;
            this.f345919c = j12;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC36559w.a
        public final void c(InterfaceC36559w interfaceC36559w) {
            InterfaceC36559w.a aVar = this.f345920d;
            aVar.getClass();
            aVar.c(this);
        }

        @Override // com.google.android.exoplayer2.source.N
        public final boolean continueLoading(long j12) {
            return this.f345918b.continueLoading(j12 - this.f345919c);
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC36559w
        public final long d(long j12, l0 l0Var) {
            long j13 = this.f345919c;
            return this.f345918b.d(j12 - j13, l0Var) + j13;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC36559w
        public final void discardBuffer(long j12, boolean z12) {
            this.f345918b.discardBuffer(j12 - this.f345919c, z12);
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC36559w
        public final void e(InterfaceC36559w.a aVar, long j12) {
            this.f345920d = aVar;
            this.f345918b.e(this, j12 - this.f345919c);
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC36559w
        public final long f(com.google.android.exoplayer2.trackselection.k[] kVarArr, boolean[] zArr, M[] mArr, boolean[] zArr2, long j12) {
            M[] mArr2 = new M[mArr.length];
            int i12 = 0;
            while (true) {
                M m12 = null;
                if (i12 >= mArr.length) {
                    break;
                }
                c cVar = (c) mArr[i12];
                if (cVar != null) {
                    m12 = cVar.f345921b;
                }
                mArr2[i12] = m12;
                i12++;
            }
            long j13 = this.f345919c;
            long jF2 = this.f345918b.f(kVarArr, zArr, mArr2, zArr2, j12 - j13);
            for (int i13 = 0; i13 < mArr.length; i13++) {
                M m13 = mArr2[i13];
                if (m13 == null) {
                    mArr[i13] = null;
                } else {
                    M m14 = mArr[i13];
                    if (m14 == null || ((c) m14).f345921b != m13) {
                        mArr[i13] = new c(m13, j13);
                    }
                }
            }
            return jF2 + j13;
        }

        @Override // com.google.android.exoplayer2.source.N.a
        public final void g(N n12) {
            InterfaceC36559w.a aVar = this.f345920d;
            aVar.getClass();
            aVar.g(this);
        }

        @Override // com.google.android.exoplayer2.source.N
        public final long getBufferedPositionUs() {
            long bufferedPositionUs = this.f345918b.getBufferedPositionUs();
            if (bufferedPositionUs == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            return this.f345919c + bufferedPositionUs;
        }

        @Override // com.google.android.exoplayer2.source.N
        public final long getNextLoadPositionUs() {
            long nextLoadPositionUs = this.f345918b.getNextLoadPositionUs();
            if (nextLoadPositionUs == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            return this.f345919c + nextLoadPositionUs;
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC36559w
        public final W getTrackGroups() {
            return this.f345918b.getTrackGroups();
        }

        @Override // com.google.android.exoplayer2.source.N
        public final boolean isLoading() {
            return this.f345918b.isLoading();
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC36559w
        public final void maybeThrowPrepareError() {
            this.f345918b.maybeThrowPrepareError();
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC36559w
        public final long readDiscontinuity() {
            long discontinuity = this.f345918b.readDiscontinuity();
            if (discontinuity == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.f345919c + discontinuity;
        }

        @Override // com.google.android.exoplayer2.source.N
        public final void reevaluateBuffer(long j12) {
            this.f345918b.reevaluateBuffer(j12 - this.f345919c);
        }

        @Override // com.google.android.exoplayer2.source.InterfaceC36559w
        public final long seekToUs(long j12) {
            long j13 = this.f345919c;
            return this.f345918b.seekToUs(j12 - j13) + j13;
        }
    }

    /* compiled from: MergingMediaPeriod.java */
    public static final class c implements M {

        /* renamed from: b, reason: collision with root package name */
        public final M f345921b;

        /* renamed from: c, reason: collision with root package name */
        public final long f345922c;

        public c(M m12, long j12) {
            this.f345921b = m12;
            this.f345922c = j12;
        }

        @Override // com.google.android.exoplayer2.source.M
        public final int b(long j12) {
            return this.f345921b.b(j12 - this.f345922c);
        }

        @Override // com.google.android.exoplayer2.source.M
        public final void c() {
            this.f345921b.c();
        }

        @Override // com.google.android.exoplayer2.source.M
        public final int g(com.google.android.exoplayer2.J j12, DecoderInputBuffer decoderInputBuffer, int i12) {
            int iG2 = this.f345921b.g(j12, decoderInputBuffer, i12);
            if (iG2 == -4) {
                decoderInputBuffer.f344207f = Math.max(0L, decoderInputBuffer.f344207f + this.f345922c);
            }
            return iG2;
        }

        @Override // com.google.android.exoplayer2.source.M
        public final boolean n() {
            return this.f345921b.n();
        }
    }

    public C(C36547j c36547j, long[] jArr, InterfaceC36559w... interfaceC36559wArr) {
        this.f345909d = c36547j;
        this.f345907b = interfaceC36559wArr;
        c36547j.getClass();
        this.f345915j = new C36543f(new N[0]);
        this.f345908c = new IdentityHashMap<>();
        this.f345914i = new InterfaceC36559w[0];
        for (int i12 = 0; i12 < interfaceC36559wArr.length; i12++) {
            long j12 = jArr[i12];
            if (j12 != 0) {
                this.f345907b[i12] = new b(interfaceC36559wArr[i12], j12);
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC36559w.a
    public final void c(InterfaceC36559w interfaceC36559w) {
        ArrayList<InterfaceC36559w> arrayList = this.f345910e;
        arrayList.remove(interfaceC36559w);
        if (arrayList.isEmpty()) {
            InterfaceC36559w[] interfaceC36559wArr = this.f345907b;
            int i12 = 0;
            for (InterfaceC36559w interfaceC36559w2 : interfaceC36559wArr) {
                i12 += interfaceC36559w2.getTrackGroups().f346155b;
            }
            V[] vArr = new V[i12];
            int i13 = 0;
            for (int i14 = 0; i14 < interfaceC36559wArr.length; i14++) {
                W trackGroups = interfaceC36559wArr[i14].getTrackGroups();
                int i15 = trackGroups.f346155b;
                int i16 = 0;
                while (i16 < i15) {
                    V vA2 = trackGroups.a(i16);
                    V v12 = new V(i14 + ":" + vA2.f346149c, vA2.f346151e);
                    this.f345911f.put(v12, vA2);
                    vArr[i13] = v12;
                    i16++;
                    i13++;
                }
            }
            this.f345913h = new W(vArr);
            InterfaceC36559w.a aVar = this.f345912g;
            aVar.getClass();
            aVar.c(this);
        }
    }

    @Override // com.google.android.exoplayer2.source.N
    public final boolean continueLoading(long j12) {
        ArrayList<InterfaceC36559w> arrayList = this.f345910e;
        if (arrayList.isEmpty()) {
            return this.f345915j.continueLoading(j12);
        }
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            arrayList.get(i12).continueLoading(j12);
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC36559w
    public final long d(long j12, l0 l0Var) {
        InterfaceC36559w[] interfaceC36559wArr = this.f345914i;
        return (interfaceC36559wArr.length > 0 ? interfaceC36559wArr[0] : this.f345907b[0]).d(j12, l0Var);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC36559w
    public final void discardBuffer(long j12, boolean z12) {
        for (InterfaceC36559w interfaceC36559w : this.f345914i) {
            interfaceC36559w.discardBuffer(j12, z12);
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC36559w
    public final void e(InterfaceC36559w.a aVar, long j12) {
        this.f345912g = aVar;
        ArrayList<InterfaceC36559w> arrayList = this.f345910e;
        InterfaceC36559w[] interfaceC36559wArr = this.f345907b;
        Collections.addAll(arrayList, interfaceC36559wArr);
        for (InterfaceC36559w interfaceC36559w : interfaceC36559wArr) {
            interfaceC36559w.e(this, j12);
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC36559w
    public final long f(com.google.android.exoplayer2.trackselection.k[] kVarArr, boolean[] zArr, M[] mArr, boolean[] zArr2, long j12) {
        HashMap<V, V> map;
        IdentityHashMap<M, Integer> identityHashMap;
        InterfaceC36559w[] interfaceC36559wArr;
        HashMap<V, V> map2;
        ArrayList arrayList;
        int[] iArr = new int[kVarArr.length];
        int[] iArr2 = new int[kVarArr.length];
        int i12 = 0;
        while (true) {
            int length = kVarArr.length;
            map = this.f345911f;
            identityHashMap = this.f345908c;
            interfaceC36559wArr = this.f345907b;
            if (i12 >= length) {
                break;
            }
            M m12 = mArr[i12];
            Integer num = m12 == null ? null : identityHashMap.get(m12);
            iArr[i12] = num == null ? -1 : num.intValue();
            iArr2[i12] = -1;
            com.google.android.exoplayer2.trackselection.k kVar = kVarArr[i12];
            if (kVar != null) {
                V v12 = map.get(kVar.i());
                v12.getClass();
                int i13 = 0;
                while (true) {
                    if (i13 >= interfaceC36559wArr.length) {
                        break;
                    }
                    if (interfaceC36559wArr[i13].getTrackGroups().b(v12) != -1) {
                        iArr2[i12] = i13;
                        break;
                    }
                    i13++;
                }
            }
            i12++;
        }
        identityHashMap.clear();
        int length2 = kVarArr.length;
        M[] mArr2 = new M[length2];
        M[] mArr3 = new M[kVarArr.length];
        com.google.android.exoplayer2.trackselection.k[] kVarArr2 = new com.google.android.exoplayer2.trackselection.k[kVarArr.length];
        ArrayList arrayList2 = new ArrayList(interfaceC36559wArr.length);
        long j13 = j12;
        int i14 = 0;
        while (i14 < interfaceC36559wArr.length) {
            int i15 = 0;
            while (i15 < kVarArr.length) {
                mArr3[i15] = iArr[i15] == i14 ? mArr[i15] : null;
                if (iArr2[i15] == i14) {
                    com.google.android.exoplayer2.trackselection.k kVar2 = kVarArr[i15];
                    kVar2.getClass();
                    arrayList = arrayList2;
                    V v13 = map.get(kVar2.i());
                    v13.getClass();
                    map2 = map;
                    kVarArr2[i15] = new a(kVar2, v13);
                } else {
                    map2 = map;
                    arrayList = arrayList2;
                    kVarArr2[i15] = null;
                }
                i15++;
                arrayList2 = arrayList;
                map = map2;
            }
            HashMap<V, V> map3 = map;
            ArrayList arrayList3 = arrayList2;
            int i16 = i14;
            com.google.android.exoplayer2.trackselection.k[] kVarArr3 = kVarArr2;
            long jF2 = interfaceC36559wArr[i14].f(kVarArr2, zArr, mArr3, zArr2, j13);
            if (i16 == 0) {
                j13 = jF2;
            } else if (jF2 != j13) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z12 = false;
            for (int i17 = 0; i17 < kVarArr.length; i17++) {
                if (iArr2[i17] == i16) {
                    M m13 = mArr3[i17];
                    m13.getClass();
                    mArr2[i17] = mArr3[i17];
                    identityHashMap.put(m13, Integer.valueOf(i16));
                    z12 = true;
                } else if (iArr[i17] == i16) {
                    C36585a.d(mArr3[i17] == null);
                }
            }
            if (z12) {
                arrayList3.add(interfaceC36559wArr[i16]);
            }
            i14 = i16 + 1;
            arrayList2 = arrayList3;
            kVarArr2 = kVarArr3;
            map = map3;
        }
        System.arraycopy(mArr2, 0, mArr, 0, length2);
        InterfaceC36559w[] interfaceC36559wArr2 = (InterfaceC36559w[]) arrayList2.toArray(new InterfaceC36559w[0]);
        this.f345914i = interfaceC36559wArr2;
        this.f345909d.getClass();
        this.f345915j = new C36543f(interfaceC36559wArr2);
        return j13;
    }

    @Override // com.google.android.exoplayer2.source.N.a
    public final void g(N n12) {
        InterfaceC36559w.a aVar = this.f345912g;
        aVar.getClass();
        aVar.g(this);
    }

    @Override // com.google.android.exoplayer2.source.N
    public final long getBufferedPositionUs() {
        return this.f345915j.getBufferedPositionUs();
    }

    @Override // com.google.android.exoplayer2.source.N
    public final long getNextLoadPositionUs() {
        return this.f345915j.getNextLoadPositionUs();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC36559w
    public final W getTrackGroups() {
        W w12 = this.f345913h;
        w12.getClass();
        return w12;
    }

    @Override // com.google.android.exoplayer2.source.N
    public final boolean isLoading() {
        return this.f345915j.isLoading();
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC36559w
    public final void maybeThrowPrepareError() {
        for (InterfaceC36559w interfaceC36559w : this.f345907b) {
            interfaceC36559w.maybeThrowPrepareError();
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC36559w
    public final long readDiscontinuity() {
        long j12 = -9223372036854775807L;
        for (InterfaceC36559w interfaceC36559w : this.f345914i) {
            long discontinuity = interfaceC36559w.readDiscontinuity();
            if (discontinuity == -9223372036854775807L) {
                if (j12 != -9223372036854775807L && interfaceC36559w.seekToUs(j12) != j12) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j12 == -9223372036854775807L) {
                for (InterfaceC36559w interfaceC36559w2 : this.f345914i) {
                    if (interfaceC36559w2 == interfaceC36559w) {
                        break;
                    }
                    if (interfaceC36559w2.seekToUs(discontinuity) != discontinuity) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j12 = discontinuity;
            } else if (discontinuity != j12) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j12;
    }

    @Override // com.google.android.exoplayer2.source.N
    public final void reevaluateBuffer(long j12) {
        this.f345915j.reevaluateBuffer(j12);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC36559w
    public final long seekToUs(long j12) {
        long jSeekToUs = this.f345914i[0].seekToUs(j12);
        int i12 = 1;
        while (true) {
            InterfaceC36559w[] interfaceC36559wArr = this.f345914i;
            if (i12 >= interfaceC36559wArr.length) {
                return jSeekToUs;
            }
            if (interfaceC36559wArr[i12].seekToUs(jSeekToUs) != jSeekToUs) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i12++;
        }
    }
}
