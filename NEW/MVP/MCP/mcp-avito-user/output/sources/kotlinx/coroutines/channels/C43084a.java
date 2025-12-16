package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlinx.coroutines.C43311x0;

/* compiled from: Actor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/channels/a;", "E", "Lkotlinx/coroutines/channels/x;", "Lkotlinx/coroutines/channels/c;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.coroutines.channels.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
class C43084a<E> extends C43124x<E> implements InterfaceC43088c<E> {
    @Override // kotlinx.coroutines.V0
    public final boolean k0(@Y61.k Throwable th2) {
        kotlinx.coroutines.P.a(this.f410748d, th2);
        return true;
    }

    @Override // kotlinx.coroutines.V0
    public final void u0(@Y61.l Throwable th2) {
        if (th2 != null) {
            cancellationExceptionA = th2 instanceof CancellationException ? (CancellationException) th2 : null;
            if (cancellationExceptionA == null) {
                cancellationExceptionA = C43311x0.a(getClass().getSimpleName().concat(" was cancelled"), th2);
            }
        }
        this.f411033e.m(cancellationExceptionA);
    }
}
