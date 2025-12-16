package kotlin.reflect.jvm.internal.impl.types;

import java.util.HashSet;
import kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC42966b;
import u51.InterfaceC48806h;

/* compiled from: expandedTypeUtils.kt */
/* loaded from: classes8.dex */
public final class G {
    public static final InterfaceC48806h a(kotlin.reflect.jvm.internal.impl.types.checker.u uVar, InterfaceC48806h interfaceC48806h, HashSet hashSet) {
        InterfaceC48806h interfaceC48806hA;
        InterfaceC48806h interfaceC48806hP0;
        q0 q0VarU = uVar.U(interfaceC48806h);
        if (!hashSet.add(q0VarU)) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.g0 g0VarS = InterfaceC42966b.a.s(q0VarU);
        if (g0VarS != null) {
            if (!(g0VarS instanceof kotlin.reflect.jvm.internal.impl.descriptors.g0)) {
                StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb2.append(g0VarS);
                sb2.append(", ");
                throw new IllegalArgumentException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(kotlin.jvm.internal.m0.f406844a, g0VarS.getClass(), sb2).toString());
            }
            InterfaceC48806h interfaceC48806hF = kotlin.reflect.jvm.internal.impl.types.typeUtil.a.f(g0VarS);
            interfaceC48806hA = a(uVar, interfaceC48806hF, hashSet);
            if (interfaceC48806hA == null) {
                return null;
            }
            boolean z12 = InterfaceC42966b.a.C(uVar.U(interfaceC48806hF)) || ((interfaceC48806hF instanceof u51.i) && InterfaceC42966b.a.I((u51.i) interfaceC48806hF));
            if ((interfaceC48806hA instanceof u51.i) && InterfaceC42966b.a.I((u51.i) interfaceC48806hA) && InterfaceC42966b.a.H(interfaceC48806h) && z12) {
                interfaceC48806hP0 = uVar.p0(interfaceC48806hF);
            } else if (!InterfaceC42966b.a.H(interfaceC48806hA) && (interfaceC48806h instanceof u51.i) && InterfaceC42966b.a.F((u51.i) interfaceC48806h)) {
                interfaceC48806hP0 = uVar.p0(interfaceC48806hA);
            }
            return interfaceC48806hP0;
        }
        if (!InterfaceC42966b.a.C(q0VarU)) {
            return interfaceC48806h;
        }
        if (!(interfaceC48806h instanceof O)) {
            StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb3.append(interfaceC48806h);
            sb3.append(", ");
            throw new IllegalArgumentException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(kotlin.jvm.internal.m0.f406844a, interfaceC48806h.getClass(), sb3).toString());
        }
        Y yG2 = kotlin.reflect.jvm.internal.impl.resolve.k.g((O) interfaceC48806h);
        if (yG2 == null || (interfaceC48806hA = a(uVar, yG2, hashSet)) == null) {
            return null;
        }
        if (InterfaceC42966b.a.H(interfaceC48806h)) {
            return InterfaceC42966b.a.H(interfaceC48806hA) ? interfaceC48806h : ((interfaceC48806hA instanceof u51.i) && InterfaceC42966b.a.I((u51.i) interfaceC48806hA)) ? interfaceC48806h : uVar.p0(interfaceC48806hA);
        }
        return interfaceC48806hA;
    }
}
