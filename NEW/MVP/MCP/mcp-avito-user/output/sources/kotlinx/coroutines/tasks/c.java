package kotlinx.coroutines.tasks;

import Y41.p;
import Y61.k;
import Y61.l;
import java.util.concurrent.CancellationException;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.sequences.InterfaceC43030m;
import kotlinx.coroutines.B0;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.InterfaceC43076a0;
import kotlinx.coroutines.InterfaceC43268o0;
import kotlinx.coroutines.InterfaceC43308w;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.V0;

/* compiled from: Tasks.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/tasks/c;", "Lkotlinx/coroutines/a0;", "kotlinx-coroutines-play-services"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class c implements InterfaceC43076a0<Object> {
    @Override // kotlinx.coroutines.N0
    @l
    public final Object A(@k Continuation<? super G0> continuation) {
        throw null;
    }

    @Override // kotlinx.coroutines.InterfaceC43076a0
    @l
    public final Object F(@k Continuation<? super Object> continuation) {
        throw null;
    }

    @Override // kotlinx.coroutines.N0
    @I0
    @k
    public final CancellationException J() {
        throw null;
    }

    @Override // kotlinx.coroutines.N0
    @I0
    @k
    public final InterfaceC43308w L(@k V0 v02) {
        throw null;
    }

    @Override // kotlinx.coroutines.N0
    @I0
    @k
    public final InterfaceC43268o0 Q(boolean z12, boolean z13, @k Y41.l<? super Throwable, G0> lVar) {
        throw null;
    }

    @Override // kotlinx.coroutines.N0
    public final void c(@l CancellationException cancellationException) {
        throw null;
    }

    @Override // kotlinx.coroutines.N0
    public final boolean c0() {
        throw null;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final <R> R fold(R r12, @k p<? super R, ? super CoroutineContext.Element, ? extends R> pVar) {
        throw null;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @l
    public final <E extends CoroutineContext.Element> E get(@k CoroutineContext.Key<E> key) {
        throw null;
    }

    @Override // kotlinx.coroutines.N0
    @k
    public final InterfaceC43030m<N0> getChildren() {
        throw null;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    @k
    public final CoroutineContext.Key<?> getKey() {
        throw null;
    }

    @Override // kotlinx.coroutines.N0
    @l
    public final N0 getParent() {
        throw null;
    }

    @Override // kotlinx.coroutines.InterfaceC43076a0
    @B0
    public final Object i() {
        throw null;
    }

    @Override // kotlinx.coroutines.N0
    public final boolean isActive() {
        throw null;
    }

    @Override // kotlinx.coroutines.N0
    public final boolean isCancelled() {
        throw null;
    }

    @Override // kotlinx.coroutines.N0
    @k
    public final InterfaceC43268o0 k(@k Y41.l<? super Throwable, G0> lVar) {
        throw null;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @k
    public final CoroutineContext minusKey(@k CoroutineContext.Key<?> key) {
        throw null;
    }

    @Override // kotlin.coroutines.CoroutineContext
    @k
    public final CoroutineContext plus(@k CoroutineContext coroutineContext) {
        throw null;
    }

    @Override // kotlinx.coroutines.N0
    public final boolean start() {
        throw null;
    }
}
