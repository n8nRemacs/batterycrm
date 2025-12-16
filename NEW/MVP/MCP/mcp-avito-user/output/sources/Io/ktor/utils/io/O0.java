package io.ktor.utils.io;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;

/* compiled from: ByteChannelSequentialJVM.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "cause", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes8.dex */
final class O0 extends kotlin.jvm.internal.N implements Y41.l<Throwable, kotlin.G0> {
    @Override // Y41.l
    public final kotlin.G0 invoke(Throwable th2) {
        Throwable cause = th2;
        null.attachedJob = null;
        if (cause == null) {
            return kotlin.G0.f406611a;
        }
        while ((cause instanceof CancellationException) && !cause.equals(cause.getCause()) && (cause = cause.getCause()) != null) {
        }
        throw null;
    }
}
