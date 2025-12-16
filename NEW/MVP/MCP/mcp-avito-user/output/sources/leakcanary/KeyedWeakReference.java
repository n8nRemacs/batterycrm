package leakcanary;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: KeyedWeakReference.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u001a\u0010\u0013¨\u0006\u001d"}, d2 = {"Lleakcanary/KeyedWeakReference;", "Ljava/lang/ref/WeakReference;", "", "referent", "", "key", "description", "", "watchUptimeMillis", "Ljava/lang/ref/ReferenceQueue;", "referenceQueue", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;JLjava/lang/ref/ReferenceQueue;)V", "Lkotlin/G0;", "clear", "()V", "retainedUptimeMillis", "J", "getRetainedUptimeMillis", "()J", "setRetainedUptimeMillis", "(J)V", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "getDescription", "getWatchUptimeMillis", "Companion", "a", "leakcanary-object-watcher"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final class KeyedWeakReference extends WeakReference<Object> {

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);
    private static volatile long heapDumpUptimeMillis;

    @Y61.k
    private final String description;

    @Y61.k
    private final String key;
    private volatile long retainedUptimeMillis;
    private final long watchUptimeMillis;

    /* compiled from: KeyedWeakReference.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lleakcanary/KeyedWeakReference$a;", "", "<init>", "()V", "leakcanary-object-watcher"}, k = 1, mv = {1, 4, 1})
    /* renamed from: leakcanary.KeyedWeakReference$a, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }
    }

    public KeyedWeakReference(@Y61.k Object obj, @Y61.k String str, @Y61.k String str2, long j12, @Y61.k ReferenceQueue<Object> referenceQueue) {
        super(obj, referenceQueue);
        this.key = str;
        this.description = str2;
        this.watchUptimeMillis = j12;
        this.retainedUptimeMillis = -1L;
    }

    public static final long getHeapDumpUptimeMillis() {
        return heapDumpUptimeMillis;
    }

    public static final void setHeapDumpUptimeMillis(long j12) {
        heapDumpUptimeMillis = j12;
    }

    @Override // java.lang.ref.Reference
    public void clear() {
        super.clear();
        this.retainedUptimeMillis = -1L;
    }

    @Y61.k
    public final String getDescription() {
        return this.description;
    }

    @Y61.k
    public final String getKey() {
        return this.key;
    }

    public final long getRetainedUptimeMillis() {
        return this.retainedUptimeMillis;
    }

    public final long getWatchUptimeMillis() {
        return this.watchUptimeMillis;
    }

    public final void setRetainedUptimeMillis(long j12) {
        this.retainedUptimeMillis = j12;
    }
}
