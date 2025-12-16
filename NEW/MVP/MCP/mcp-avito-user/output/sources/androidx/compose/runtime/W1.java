package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* compiled from: ProduceState.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/W1;", "T", "Landroidx/compose/runtime/U1;", "Landroidx/compose/runtime/y1;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class W1<T> implements U1<T>, InterfaceC22204y1<T> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final CoroutineContext f38162b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<T> f38163c;

    public W1(@Y61.k InterfaceC22204y1<T> interfaceC22204y1, @Y61.k CoroutineContext coroutineContext) {
        this.f38162b = coroutineContext;
        this.f38163c = interfaceC22204y1;
    }

    @Override // kotlinx.coroutines.T
    @Y61.k
    /* renamed from: getCoroutineContext, reason: from getter */
    public final CoroutineContext getF38162b() {
        return this.f38162b;
    }

    @Override // androidx.compose.runtime.I3
    /* renamed from: getValue */
    public final T getF42167b() {
        return this.f38163c.getF42167b();
    }

    @Override // androidx.compose.runtime.InterfaceC22204y1
    public final void setValue(T t12) {
        this.f38163c.setValue(t12);
    }
}
