package androidx.compose.runtime.snapshots;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.u1;

/* compiled from: SnapshotContextElement.jvm.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/snapshots/o;", "Landroidx/compose/runtime/snapshots/n;", "Lkotlinx/coroutines/u1;", "Landroidx/compose/runtime/snapshots/l;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.runtime.snapshots.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22170o implements InterfaceC22169n, u1<AbstractC22167l> {
    @Override // kotlinx.coroutines.u1
    public final AbstractC22167l R(CoroutineContext coroutineContext) {
        throw null;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final <R> R fold(R r12, @Y61.k Y41.p<? super R, ? super CoroutineContext.Element, ? extends R> pVar) {
        return (R) CoroutineContext.Element.DefaultImpls.fold(this, r12, pVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @Y61.l
    public final <E extends CoroutineContext.Element> E get(@Y61.k CoroutineContext.Key<E> key) {
        return (E) CoroutineContext.Element.DefaultImpls.get(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    @Y61.k
    public final CoroutineContext.Key<?> getKey() {
        return InterfaceC22169n.f38726x1;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @Y61.k
    public final CoroutineContext minusKey(@Y61.k CoroutineContext.Key<?> key) {
        return CoroutineContext.Element.DefaultImpls.minusKey(this, key);
    }

    @Override // kotlinx.coroutines.u1
    public final void o(Object obj) {
        throw null;
    }

    @Override // kotlin.coroutines.CoroutineContext
    @Y61.k
    public final CoroutineContext plus(@Y61.k CoroutineContext coroutineContext) {
        return CoroutineContext.Element.DefaultImpls.plus(this, coroutineContext);
    }
}
