package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.l0;
import com.google.android.exoplayer2.source.N;

/* compiled from: MediaPeriod.java */
/* renamed from: com.google.android.exoplayer2.source.w, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC36559w extends N {

    /* compiled from: MediaPeriod.java */
    /* renamed from: com.google.android.exoplayer2.source.w$a */
    public interface a extends N.a<InterfaceC36559w> {
        void c(InterfaceC36559w interfaceC36559w);
    }

    long d(long j12, l0 l0Var);

    void discardBuffer(long j12, boolean z12);

    void e(a aVar, long j12);

    long f(com.google.android.exoplayer2.trackselection.k[] kVarArr, boolean[] zArr, M[] mArr, boolean[] zArr2, long j12);

    W getTrackGroups();

    void maybeThrowPrepareError();

    long readDiscontinuity();

    long seekToUs(long j12);
}
