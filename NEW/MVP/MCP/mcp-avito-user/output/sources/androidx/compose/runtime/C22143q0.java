package androidx.compose.runtime;

import kotlin.Metadata;

/* compiled from: CompositionLocal.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/q0;", "T", "Landroidx/compose/runtime/X1;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.runtime.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22143q0<T> extends X1<T> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22116k3<T> f38522b;

    public C22143q0(@Y61.k Y41.a aVar, @Y61.k InterfaceC22116k3 interfaceC22116k3) {
        super(aVar, null);
        this.f38522b = interfaceC22116k3;
    }

    @Override // androidx.compose.runtime.X1
    @Y61.k
    public final Y1<T> b(T t12) {
        return new Y1<>(this, t12, t12 == null, this.f38522b, null, true);
    }
}
