package kotlin.reflect.jvm.internal.impl.types;

import java.util.Collections;
import java.util.Set;
import kotlin.collections.b1;

/* compiled from: ErasureTypeAttributes.kt */
@kotlin.jvm.internal.s0
/* loaded from: classes8.dex */
public class F {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final TypeUsage f410016a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Set<kotlin.reflect.jvm.internal.impl.descriptors.g0> f410017b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Y f410018c;

    /* JADX WARN: Multi-variable type inference failed */
    public F(@Y61.k TypeUsage typeUsage, @Y61.l Set<? extends kotlin.reflect.jvm.internal.impl.descriptors.g0> set, @Y61.l Y y12) {
        this.f410016a = typeUsage;
        this.f410017b = set;
        this.f410018c = y12;
    }

    @Y61.l
    public Y a() {
        return this.f410018c;
    }

    @Y61.k
    public TypeUsage b() {
        return this.f410016a;
    }

    @Y61.l
    public Set<kotlin.reflect.jvm.internal.impl.descriptors.g0> c() {
        return this.f410017b;
    }

    @Y61.k
    public F d(@Y61.k kotlin.reflect.jvm.internal.impl.descriptors.g0 g0Var) {
        TypeUsage typeUsageB = b();
        Set<kotlin.reflect.jvm.internal.impl.descriptors.g0> setC = c();
        return new F(typeUsageB, setC != null ? b1.i(setC, g0Var) : Collections.singleton(g0Var), a());
    }

    public boolean equals(@Y61.l Object obj) {
        if (!(obj instanceof F)) {
            return false;
        }
        F f12 = (F) obj;
        return kotlin.jvm.internal.L.f(f12.a(), a()) && f12.b() == b();
    }

    public int hashCode() {
        Y yA2 = a();
        int iHashCode = yA2 != null ? yA2.hashCode() : 0;
        return b().hashCode() + (iHashCode * 31) + iHashCode;
    }
}
