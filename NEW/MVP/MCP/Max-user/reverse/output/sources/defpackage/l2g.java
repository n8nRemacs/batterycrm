package defpackage;

/* loaded from: classes.dex */
public abstract class l2g implements Runnable {
    public long submissionTime;
    public p2g taskContext;

    public l2g(long j, p2g p2gVar) {
        this.submissionTime = j;
        this.taskContext = p2gVar;
    }

    public final int getMode$kotlinx_coroutines_core() {
        return ((l16) this.taskContext).b;
    }
}
