package androidx.compose.runtime;

import kotlin.Metadata;

/* compiled from: ValueHolders.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/K3;", "T", "Landroidx/compose/runtime/T3;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class K3<T> implements T3<T> {

    /* renamed from: a, reason: collision with root package name */
    public final T f38011a;

    public K3(T t12) {
        this.f38011a = t12;
    }

    @Override // androidx.compose.runtime.T3
    public final T a(@Y61.k O1 o12) {
        return this.f38011a;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof K3) && kotlin.jvm.internal.L.f(this.f38011a, ((K3) obj).f38011a);
    }

    public final int hashCode() {
        T t12 = this.f38011a;
        if (t12 == null) {
            return 0;
        }
        return t12.hashCode();
    }

    @Y61.k
    public final String toString() {
        return androidx.compose.foundation.H.n(new StringBuilder("StaticValueHolder(value="), this.f38011a, ')');
    }
}
