package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.reflect.jvm.internal.impl.types.O;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import u51.InterfaceC48806h;

/* compiled from: OverridingUtilTypeSystemContext.kt */
/* loaded from: classes8.dex */
public final class u extends TypeCheckerState {
    @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState
    public final boolean b(@Y61.k InterfaceC48806h interfaceC48806h, @Y61.k InterfaceC48806h interfaceC48806h2) {
        if (!(interfaceC48806h instanceof O)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (interfaceC48806h2 instanceof O) {
            throw null;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }
}
