package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;
import kotlin.reflect.jvm.internal.impl.types.q0;

/* compiled from: utils.kt */
@s0
/* loaded from: classes8.dex */
public final class F {
    public static final String a(q0 q0Var) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("type: " + q0Var);
        sb2.append('\n');
        sb2.append("hashCode: " + q0Var.hashCode());
        sb2.append('\n');
        sb2.append("javaClass: " + q0Var.getClass().getCanonicalName());
        sb2.append('\n');
        for (InterfaceC42882k interfaceC42882kB = q0Var.b(); interfaceC42882kB != null; interfaceC42882kB = interfaceC42882kB.f()) {
            sb2.append("fqName: ".concat(kotlin.reflect.jvm.internal.impl.renderer.b.f409469b.x(interfaceC42882kB)));
            sb2.append('\n');
            sb2.append("javaClass: " + interfaceC42882kB.getClass().getCanonicalName());
            sb2.append('\n');
        }
        return sb2.toString();
    }
}
