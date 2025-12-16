package androidx.compose.runtime;

import kotlin.Metadata;

/* compiled from: Effects.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/X;", "Landroidx/compose/runtime/B2;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.X
/* loaded from: classes.dex */
public final class X implements B2 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final kotlinx.coroutines.T f38164b;

    public X(@Y61.k kotlinx.coroutines.T t12) {
        this.f38164b = t12;
    }

    @Override // androidx.compose.runtime.B2
    public final void b() {
        kotlinx.coroutines.T t12 = this.f38164b;
        if (t12 instanceof D2) {
            ((D2) t12).f();
        } else {
            kotlinx.coroutines.U.b(t12, new T0());
        }
    }

    @Override // androidx.compose.runtime.B2
    public final void e() {
        kotlinx.coroutines.T t12 = this.f38164b;
        if (t12 instanceof D2) {
            ((D2) t12).f();
        } else {
            kotlinx.coroutines.U.b(t12, new T0());
        }
    }

    @Override // androidx.compose.runtime.B2
    public final void c() {
    }
}
