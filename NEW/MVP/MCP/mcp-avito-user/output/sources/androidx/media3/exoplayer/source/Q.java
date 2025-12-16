package androidx.media3.exoplayer.source;

/* compiled from: SequenceableLoader.java */
@androidx.media3.common.util.J
/* loaded from: classes.dex */
public interface Q {

    /* compiled from: SequenceableLoader.java */
    public interface a<T extends Q> {
        void g(T t12);
    }

    boolean continueLoading(long j12);

    long getBufferedPositionUs();

    long getNextLoadPositionUs();

    boolean isLoading();

    void reevaluateBuffer(long j12);
}
