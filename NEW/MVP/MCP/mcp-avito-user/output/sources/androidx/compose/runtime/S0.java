package androidx.compose.runtime;

import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;

/* compiled from: ValueHolders.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/S0;", "T", "Landroidx/compose/runtime/T3;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class S0<T> implements T3<T> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f38149a;

    public S0(@Y61.k Y41.a<? extends T> aVar) {
        this.f38149a = C42727D.c(aVar);
    }

    @Override // androidx.compose.runtime.T3
    public final T a(@Y61.k O1 o12) {
        return (T) this.f38149a.getValue();
    }
}
