package androidx.compose.runtime;

import kotlin.Metadata;

/* compiled from: ValueHolders.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/r0;", "T", "Landroidx/compose/runtime/T3;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.runtime.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* data */ class C22147r0<T> implements T3<T> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1<T> f38552a;

    public C22147r0(@Y61.k InterfaceC22204y1<T> interfaceC22204y1) {
        this.f38552a = interfaceC22204y1;
    }

    @Override // androidx.compose.runtime.T3
    public final T a(@Y61.k O1 o12) {
        return this.f38552a.getF42167b();
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C22147r0) && kotlin.jvm.internal.L.f(this.f38552a, ((C22147r0) obj).f38552a);
    }

    public final int hashCode() {
        return this.f38552a.hashCode();
    }

    @Y61.k
    public final String toString() {
        return "DynamicValueHolder(state=" + this.f38552a + ')';
    }
}
