package kotlinx.coroutines.flow.internal;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: FlowExceptions.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/flow/internal/AbortFlowException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AbortFlowException extends CancellationException {

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final transient Object f411440b;

    public AbortFlowException(@Y61.k Object obj) {
        super("Flow was aborted, no more elements needed");
        this.f411440b = obj;
    }

    @Override // java.lang.Throwable
    @Y61.k
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
