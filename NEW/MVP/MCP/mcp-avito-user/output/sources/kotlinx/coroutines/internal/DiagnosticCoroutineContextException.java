package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.s0;

/* compiled from: CoroutineExceptionHandlerImpl.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/internal/DiagnosticCoroutineContextException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DiagnosticCoroutineContextException extends RuntimeException {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final transient CoroutineContext f411861b;

    public DiagnosticCoroutineContextException(@Y61.k CoroutineContext coroutineContext) {
        this.f411861b = coroutineContext;
    }

    @Override // java.lang.Throwable
    @Y61.k
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    @Y61.k
    public final String getLocalizedMessage() {
        return this.f411861b.toString();
    }
}
