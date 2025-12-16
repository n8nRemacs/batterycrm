package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import k51.InterfaceC42514C;
import k51.InterfaceC42516a;
import kotlin.collections.C42756l;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.H;

/* compiled from: ReflectJavaWildcardType.kt */
@s0
/* loaded from: classes8.dex */
public final class K extends H implements InterfaceC42514C {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final WildcardType f407833b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C42784z0 f407834c = C42784z0.f406748b;

    public K(@Y61.k WildcardType wildcardType) {
        this.f407833b = wildcardType;
    }

    @Override // k51.InterfaceC42519d
    @Y61.k
    public final Collection<InterfaceC42516a> getAnnotations() {
        return this.f407834c;
    }

    @Override // k51.InterfaceC42514C
    public final H h() {
        WildcardType wildcardType = this.f407833b;
        Type[] upperBounds = wildcardType.getUpperBounds();
        Type[] lowerBounds = wildcardType.getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            throw new UnsupportedOperationException("Wildcard types with many bounds are not yet supported: " + wildcardType);
        }
        int length = lowerBounds.length;
        H.a aVar = H.f407827a;
        if (length == 1) {
            Type type = (Type) C42756l.Z(lowerBounds);
            aVar.getClass();
            return H.a.a(type);
        }
        if (upperBounds.length == 1) {
            Type type2 = (Type) C42756l.Z(upperBounds);
            if (!L.f(type2, Object.class)) {
                aVar.getClass();
                return H.a.a(type2);
            }
        }
        return null;
    }

    @Override // k51.InterfaceC42514C
    public final boolean i() {
        return !L.f(this.f407833b.getUpperBounds().length == 0 ? null : r0[0], Object.class);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.H
    public final Type p() {
        return this.f407833b;
    }
}
