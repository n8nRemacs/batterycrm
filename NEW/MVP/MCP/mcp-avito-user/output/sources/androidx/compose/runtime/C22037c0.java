package androidx.compose.runtime;

import kotlin.Metadata;

/* compiled from: ValueHolders.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/c0;", "T", "Landroidx/compose/runtime/T3;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.runtime.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* data */ class C22037c0<T> implements T3<T> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final kotlin.jvm.internal.N f38179a;

    /* JADX WARN: Multi-variable type inference failed */
    public C22037c0(@Y61.k Y41.l<? super P, ? extends T> lVar) {
        this.f38179a = (kotlin.jvm.internal.N) lVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // androidx.compose.runtime.T3
    public final T a(@Y61.k O1 o12) {
        return (T) this.f38179a.invoke(o12);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C22037c0) && kotlin.jvm.internal.L.f(this.f38179a, ((C22037c0) obj).f38179a);
    }

    public final int hashCode() {
        return this.f38179a.hashCode();
    }

    @Y61.k
    public final String toString() {
        return C22026a.d(new StringBuilder("ComputedValueHolder(compute="), this.f38179a, ')');
    }
}
