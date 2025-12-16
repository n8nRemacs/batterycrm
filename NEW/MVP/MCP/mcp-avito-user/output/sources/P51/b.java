package p51;

import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.builtins.n;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.resolve.k;
import kotlin.reflect.jvm.internal.impl.types.O;

/* compiled from: inlineClassManglingRules.kt */
@s0
/* loaded from: classes8.dex */
public final class b {
    public static final boolean a(O o12) {
        InterfaceC42853f interfaceC42853fB = o12.H0().b();
        if (interfaceC42853fB == null || ((!k.b(interfaceC42853fB) || !k.e(interfaceC42853fB) || kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.g((InterfaceC42851d) interfaceC42853fB).equals(n.f407335h)) && !k.f(o12))) {
            InterfaceC42853f interfaceC42853fB2 = o12.H0().b();
            g0 g0Var = interfaceC42853fB2 instanceof g0 ? (g0) interfaceC42853fB2 : null;
            if (g0Var == null || !a(kotlin.reflect.jvm.internal.impl.types.typeUtil.a.f(g0Var))) {
                return false;
            }
        }
        return true;
    }
}
