package okio;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import kotlin.Metadata;

/* compiled from: ForwardingTimeout.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/A;", "Lokio/i0;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public class A extends i0 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public i0 f420009b;

    public A(@Y61.k i0 i0Var) {
        this.f420009b = i0Var;
    }

    @Override // okio.i0
    public final void awaitSignal(@Y61.k Condition condition) throws InterruptedException, InterruptedIOException {
        this.f420009b.awaitSignal(condition);
    }

    @Override // okio.i0
    public final void cancel() {
        this.f420009b.cancel();
    }

    @Override // okio.i0
    @Y61.k
    public final i0 clearDeadline() {
        return this.f420009b.clearDeadline();
    }

    @Override // okio.i0
    @Y61.k
    public final i0 clearTimeout() {
        return this.f420009b.clearTimeout();
    }

    @Override // okio.i0
    public final long deadlineNanoTime() {
        return this.f420009b.deadlineNanoTime();
    }

    @Override // okio.i0
    /* renamed from: hasDeadline */
    public final boolean getHasDeadline() {
        return this.f420009b.getHasDeadline();
    }

    @Override // okio.i0
    public final void throwIfReached() throws InterruptedIOException {
        this.f420009b.throwIfReached();
    }

    @Override // okio.i0
    @Y61.k
    public final i0 timeout(long j12, @Y61.k TimeUnit timeUnit) {
        return this.f420009b.timeout(j12, timeUnit);
    }

    @Override // okio.i0
    /* renamed from: timeoutNanos */
    public final long getTimeoutNanos() {
        return this.f420009b.getTimeoutNanos();
    }

    @Override // okio.i0
    public final void waitUntilNotified(@Y61.k Object obj) throws InterruptedException, InterruptedIOException {
        this.f420009b.waitUntilNotified(obj);
    }

    @Override // okio.i0
    @Y61.k
    public final i0 deadlineNanoTime(long j12) {
        return this.f420009b.deadlineNanoTime(j12);
    }
}
