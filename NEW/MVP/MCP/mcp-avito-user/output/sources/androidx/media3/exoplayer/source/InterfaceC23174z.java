package androidx.media3.exoplayer.source;

import androidx.media3.exoplayer.g0;
import androidx.media3.exoplayer.source.Q;

/* compiled from: MediaPeriod.java */
@androidx.media3.common.util.J
/* renamed from: androidx.media3.exoplayer.source.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC23174z extends Q {

    /* compiled from: MediaPeriod.java */
    /* renamed from: androidx.media3.exoplayer.source.z$a */
    public interface a extends Q.a<InterfaceC23174z> {
        void e(InterfaceC23174z interfaceC23174z);
    }

    long d(androidx.media3.exoplayer.trackselection.k[] kVarArr, boolean[] zArr, P[] pArr, boolean[] zArr2, long j12);

    void discardBuffer(long j12, boolean z12);

    void f(a aVar, long j12);

    Y getTrackGroups();

    long i(long j12, g0 g0Var);

    void maybeThrowPrepareError();

    long readDiscontinuity();

    long seekToUs(long j12);
}
