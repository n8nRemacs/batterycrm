package androidx.compose.ui.input.pointer;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;

/* compiled from: SuspendingPointerInputFilter.jvm.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerEventTimeoutCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PointerEventTimeoutCancellationException extends CancellationException {
    public PointerEventTimeoutCancellationException(long j12) {
        super(androidx.compose.ui.graphics.colorspace.e.i(j12, "Timed out waiting for ", " ms"));
    }

    @Override // java.lang.Throwable
    @Y61.k
    public final Throwable fillInStackTrace() {
        setStackTrace(a0.f40200a);
        return this;
    }
}
