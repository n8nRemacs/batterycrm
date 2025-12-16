package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.L;
import kotlin.reflect.jvm.internal.impl.descriptors.E;
import kotlin.reflect.jvm.internal.impl.types.O;

/* compiled from: constantValues.kt */
/* loaded from: classes8.dex */
public abstract class g<T> {

    /* renamed from: a, reason: collision with root package name */
    public final T f409586a;

    public g(T t12) {
        this.f409586a = t12;
    }

    @Y61.k
    public abstract O a(@Y61.k E e12);

    public T b() {
        return this.f409586a;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this != obj) {
            T tB2 = b();
            g gVar = obj instanceof g ? (g) obj : null;
            if (!L.f(tB2, gVar != null ? gVar.b() : null)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        T tB2 = b();
        if (tB2 != null) {
            return tB2.hashCode();
        }
        return 0;
    }

    @Y61.k
    public String toString() {
        return String.valueOf(b());
    }
}
