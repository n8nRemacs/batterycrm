package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.L;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.descriptors.U;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;

/* compiled from: FieldOverridabilityCondition.kt */
/* loaded from: classes8.dex */
public final class p implements ExternalOverridabilityCondition {
    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    @Y61.k
    public final ExternalOverridabilityCondition.Contract a() {
        return ExternalOverridabilityCondition.Contract.f409553d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    @Y61.k
    public final ExternalOverridabilityCondition.Result b(@Y61.k InterfaceC42848a interfaceC42848a, @Y61.k InterfaceC42848a interfaceC42848a2, @Y61.l InterfaceC42851d interfaceC42851d) {
        boolean z12 = interfaceC42848a2 instanceof U;
        ExternalOverridabilityCondition.Result result = ExternalOverridabilityCondition.Result.f409557d;
        if (!z12 || !(interfaceC42848a instanceof U)) {
            return result;
        }
        U u12 = (U) interfaceC42848a2;
        U u13 = (U) interfaceC42848a;
        return !L.f(u12.getName(), u13.getName()) ? result : (kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c.a(u12) && kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c.a(u13)) ? ExternalOverridabilityCondition.Result.f409555b : (kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c.a(u12) || kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.c.a(u13)) ? ExternalOverridabilityCondition.Result.f409556c : result;
    }
}
