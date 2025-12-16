package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import kotlin.jvm.internal.L;

/* compiled from: CapturedTypeApproximation.kt */
/* loaded from: classes8.dex */
public final class a<T> {

    /* renamed from: a, reason: collision with root package name */
    public final T f410249a;

    /* renamed from: b, reason: collision with root package name */
    public final T f410250b;

    public a(T t12, T t13) {
        this.f410249a = t12;
        this.f410250b = t13;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f410249a, aVar.f410249a) && L.f(this.f410250b, aVar.f410250b);
    }

    public final int hashCode() {
        T t12 = this.f410249a;
        int iHashCode = (t12 == null ? 0 : t12.hashCode()) * 31;
        T t13 = this.f410250b;
        return iHashCode + (t13 != null ? t13.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ApproximationBounds(lower=");
        sb2.append(this.f410249a);
        sb2.append(", upper=");
        return H.n(sb2, this.f410250b, ')');
    }
}
