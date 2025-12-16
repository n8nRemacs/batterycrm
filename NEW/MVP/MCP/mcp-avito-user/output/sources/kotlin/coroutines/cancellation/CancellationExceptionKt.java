package kotlin.coroutines.cancellation;

import java.util.concurrent.CancellationException;
import kotlin.InterfaceC42733c0;
import kotlin.Metadata;
import kotlin.internal.f;
import kotlin.jvm.internal.s0;

/* compiled from: CancellationException.kt */
@s0
@Metadata(d1 = {"\u0000 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a(\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0087\b¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001e\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0087\b¢\u0006\u0004\b\u0006\u0010\b*\u001a\b\u0007\u0010\u0006\"\u00020\u00042\u00020\u0004B\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b¨\u0006\f"}, d2 = {"", "message", "", "cause", "Ljava/util/concurrent/CancellationException;", "Lkotlin/coroutines/cancellation/CancellationException;", "CancellationException", "(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/util/concurrent/CancellationException;", "(Ljava/lang/Throwable;)Ljava/util/concurrent/CancellationException;", "Lkotlin/c0;", "version", "1.4", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CancellationExceptionKt {
    @InterfaceC42733c0
    @f
    private static final CancellationException CancellationException(String str, Throwable th2) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th2);
        return cancellationException;
    }

    @InterfaceC42733c0
    @f
    private static final CancellationException CancellationException(Throwable th2) {
        CancellationException cancellationException = new CancellationException(th2 != null ? th2.toString() : null);
        cancellationException.initCause(th2);
        return cancellationException;
    }

    @InterfaceC42733c0
    public static /* synthetic */ void CancellationException$annotations() {
    }
}
