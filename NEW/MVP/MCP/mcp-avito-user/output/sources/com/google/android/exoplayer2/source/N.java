package com.google.android.exoplayer2.source;

/* compiled from: SequenceableLoader.java */
/* loaded from: classes6.dex */
public interface N {

    /* compiled from: SequenceableLoader.java */
    public interface a<T extends N> {
        void g(T t12);
    }

    boolean continueLoading(long j12);

    long getBufferedPositionUs();

    long getNextLoadPositionUs();

    boolean isLoading();

    void reevaluateBuffer(long j12);
}
