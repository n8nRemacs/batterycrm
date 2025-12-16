package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.builtins.n;

/* compiled from: TypeSubstitutor.java */
/* loaded from: classes8.dex */
final class D0 implements Y41.l<kotlin.reflect.jvm.internal.impl.name.c, Boolean> {
    @Override // Y41.l
    public final Boolean invoke(@Y61.k kotlin.reflect.jvm.internal.impl.name.c cVar) {
        if (cVar != null) {
            return Boolean.valueOf(!r2.equals(n.a.f407400z));
        }
        throw new IllegalArgumentException("Argument for @NotNull parameter 'name' of kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1.invoke must not be null");
    }
}
