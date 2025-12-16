package com.google.android.exoplayer2.trackselection;

import android.os.SystemClock;
import com.google.android.exoplayer2.I;
import com.google.android.exoplayer2.source.V;
import com.google.android.exoplayer2.util.C36585a;
import com.google.android.exoplayer2.util.U;
import j.P;
import java.util.Arrays;
import java.util.List;

/* compiled from: BaseTrackSelection.java */
/* loaded from: classes6.dex */
public abstract class b implements k {

    /* renamed from: a, reason: collision with root package name */
    public final V f347158a;

    /* renamed from: b, reason: collision with root package name */
    public final int f347159b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f347160c;

    /* renamed from: d, reason: collision with root package name */
    public final I[] f347161d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f347162e;

    /* renamed from: f, reason: collision with root package name */
    public int f347163f;

    public b(V v12, int[] iArr) {
        int i12 = 0;
        C36585a.d(iArr.length > 0);
        v12.getClass();
        this.f347158a = v12;
        int length = iArr.length;
        this.f347159b = length;
        this.f347161d = new I[length];
        for (int i13 = 0; i13 < iArr.length; i13++) {
            this.f347161d[i13] = v12.f346151e[iArr[i13]];
        }
        Arrays.sort(this.f347161d, new d(5));
        this.f347160c = new int[this.f347159b];
        while (true) {
            int i14 = this.f347159b;
            if (i12 >= i14) {
                this.f347162e = new long[i14];
                return;
            } else {
                this.f347160c[i12] = v12.a(this.f347161d[i12]);
                i12++;
            }
        }
    }

    @Override // com.google.android.exoplayer2.trackselection.o
    public final int b(int i12) {
        return this.f347160c[i12];
    }

    @Override // com.google.android.exoplayer2.trackselection.k
    public final I c() {
        return this.f347161d[a()];
    }

    @Override // com.google.android.exoplayer2.trackselection.o
    public final I d(int i12) {
        return this.f347161d[i12];
    }

    public final boolean equals(@P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f347158a == bVar.f347158a && Arrays.equals(this.f347160c, bVar.f347160c);
    }

    @Override // com.google.android.exoplayer2.trackselection.o
    public final int h(int i12) {
        for (int i13 = 0; i13 < this.f347159b; i13++) {
            if (this.f347160c[i13] == i12) {
                return i13;
            }
        }
        return -1;
    }

    public final int hashCode() {
        if (this.f347163f == 0) {
            this.f347163f = Arrays.hashCode(this.f347160c) + (System.identityHashCode(this.f347158a) * 31);
        }
        return this.f347163f;
    }

    @Override // com.google.android.exoplayer2.trackselection.o
    public final V i() {
        return this.f347158a;
    }

    @Override // com.google.android.exoplayer2.trackselection.o
    public final int length() {
        return this.f347160c.length;
    }

    @Override // com.google.android.exoplayer2.trackselection.k
    public int m(long j12, List<? extends com.google.android.exoplayer2.source.chunk.m> list) {
        return list.size();
    }

    @Override // com.google.android.exoplayer2.trackselection.k
    public final int o() {
        return this.f347160c[a()];
    }

    @Override // com.google.android.exoplayer2.trackselection.k
    public final boolean p(int i12, long j12) {
        return this.f347162e[i12] > j12;
    }

    @Override // com.google.android.exoplayer2.trackselection.k
    public final boolean q(int i12, long j12) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zP2 = p(i12, jElapsedRealtime);
        int i13 = 0;
        while (i13 < this.f347159b && !zP2) {
            zP2 = (i13 == i12 || p(i13, jElapsedRealtime)) ? false : true;
            i13++;
        }
        if (!zP2) {
            return false;
        }
        long[] jArr = this.f347162e;
        long j13 = jArr[i12];
        int i14 = U.f348106a;
        long j14 = jElapsedRealtime + j12;
        if (((j12 ^ j14) & (jElapsedRealtime ^ j14)) < 0) {
            j14 = Long.MAX_VALUE;
        }
        jArr[i12] = Math.max(j13, j14);
        return true;
    }

    @Override // com.google.android.exoplayer2.trackselection.k
    public void N() {
    }

    @Override // com.google.android.exoplayer2.trackselection.k
    public void j() {
    }

    @Override // com.google.android.exoplayer2.trackselection.k
    public void e(float f12) {
    }
}
