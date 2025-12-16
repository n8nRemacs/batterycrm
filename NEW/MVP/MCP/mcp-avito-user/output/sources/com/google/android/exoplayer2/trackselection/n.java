package com.google.android.exoplayer2.trackselection;

import android.os.SystemClock;
import com.google.android.exoplayer2.trackselection.k;
import j.P;
import java.util.List;
import java.util.Random;

/* compiled from: RandomTrackSelection.java */
/* loaded from: classes6.dex */
public final class n extends b {

    /* renamed from: g, reason: collision with root package name */
    public int f347276g;

    /* compiled from: RandomTrackSelection.java */
    public static final class a implements k.b {
        public a() {
            new Random();
        }
    }

    @Override // com.google.android.exoplayer2.trackselection.k
    public final int a() {
        return this.f347276g;
    }

    @Override // com.google.android.exoplayer2.trackselection.k
    public final void n(long j12, long j13, long j14, List<? extends com.google.android.exoplayer2.source.chunk.m> list, com.google.android.exoplayer2.source.chunk.n[] nVarArr) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        for (int i12 = 0; i12 < this.f347159b; i12++) {
            p(i12, jElapsedRealtime);
        }
        throw null;
    }

    @Override // com.google.android.exoplayer2.trackselection.k
    @P
    public final Object r() {
        return null;
    }

    @Override // com.google.android.exoplayer2.trackselection.k
    public final int s() {
        return 3;
    }
}
