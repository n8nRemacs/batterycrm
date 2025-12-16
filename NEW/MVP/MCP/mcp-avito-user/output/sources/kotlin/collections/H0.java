package kotlin.collections;

import kotlin.Metadata;

/* compiled from: IndexedValue.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/collections/H0;", "T", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class H0<T> {

    /* renamed from: a, reason: collision with root package name */
    public final int f406643a;

    /* renamed from: b, reason: collision with root package name */
    public final T f406644b;

    public H0(int i12, T t12) {
        this.f406643a = i12;
        this.f406644b = t12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H0)) {
            return false;
        }
        H0 h02 = (H0) obj;
        return this.f406643a == h02.f406643a && kotlin.jvm.internal.L.f(this.f406644b, h02.f406644b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f406643a) * 31;
        T t12 = this.f406644b;
        return iHashCode + (t12 == null ? 0 : t12.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IndexedValue(index=");
        sb2.append(this.f406643a);
        sb2.append(", value=");
        return androidx.compose.foundation.H.n(sb2, this.f406644b, ')');
    }
}
