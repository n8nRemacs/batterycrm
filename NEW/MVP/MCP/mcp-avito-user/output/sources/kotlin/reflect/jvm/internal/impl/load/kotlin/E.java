package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;
import kotlin.reflect.jvm.internal.impl.descriptors.a0;
import kotlin.reflect.jvm.internal.impl.types.O;

/* compiled from: methodSignatureMapping.kt */
@s0
/* loaded from: classes8.dex */
public final class E {
    /* JADX WARN: Removed duplicated region for block: B:37:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x r3, int r4) {
        /*
            r0 = 1
            r1 = r4 & 1
            r2 = 0
            if (r1 == 0) goto L8
            r1 = r0
            goto L9
        L8:
            r1 = r2
        L9:
            r4 = r4 & 2
            if (r4 == 0) goto Le
            goto Lf
        Le:
            r0 = r2
        Lf:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            if (r0 == 0) goto L28
            boolean r0 = r3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42881j
            if (r0 == 0) goto L1d
            java.lang.String r0 = "<init>"
            goto L25
        L1d:
            kotlin.reflect.jvm.internal.impl.name.f r0 = r3.getName()
            java.lang.String r0 = r0.b()
        L25:
            r4.append(r0)
        L28:
            java.lang.String r0 = "("
            r4.append(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.X r0 = r3.H()
            if (r0 == 0) goto L3e
            kotlin.reflect.jvm.internal.impl.types.O r0 = r0.getType()
            kotlin.reflect.jvm.internal.impl.load.kotlin.u r0 = c(r0)
            r4.append(r0)
        L3e:
            java.util.List r0 = r3.g()
            java.util.Iterator r0 = r0.iterator()
        L46:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L5e
            java.lang.Object r2 = r0.next()
            kotlin.reflect.jvm.internal.impl.descriptors.k0 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.k0) r2
            kotlin.reflect.jvm.internal.impl.types.O r2 = r2.getType()
            kotlin.reflect.jvm.internal.impl.load.kotlin.u r2 = c(r2)
            r4.append(r2)
            goto L46
        L5e:
            java.lang.String r0 = ")"
            r4.append(r0)
            if (r1 == 0) goto La1
            boolean r0 = r3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42881j
            if (r0 == 0) goto L6a
            goto L88
        L6a:
            kotlin.reflect.jvm.internal.impl.types.O r0 = r3.getReturnType()
            if (r0 == 0) goto L9a
            kotlin.reflect.jvm.internal.impl.name.f r1 = kotlin.reflect.jvm.internal.impl.builtins.k.f407311f
            kotlin.reflect.jvm.internal.impl.name.d r1 = kotlin.reflect.jvm.internal.impl.builtins.n.a.f407379e
            boolean r0 = kotlin.reflect.jvm.internal.impl.builtins.k.C(r0, r1)
            if (r0 == 0) goto L8e
            kotlin.reflect.jvm.internal.impl.types.O r0 = r3.getReturnType()
            boolean r0 = kotlin.reflect.jvm.internal.impl.types.G0.f(r0)
            if (r0 != 0) goto L8e
            boolean r0 = r3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.V
            if (r0 != 0) goto L8e
        L88:
            java.lang.String r3 = "V"
            r4.append(r3)
            goto La1
        L8e:
            kotlin.reflect.jvm.internal.impl.types.O r3 = r3.getReturnType()
            kotlin.reflect.jvm.internal.impl.load.kotlin.u r3 = c(r3)
            r4.append(r3)
            goto La1
        L9a:
            r3 = 143(0x8f, float:2.0E-43)
            kotlin.reflect.jvm.internal.impl.builtins.k.a(r3)
            r3 = 0
            throw r3
        La1:
            java.lang.String r3 = r4.toString()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.kotlin.E.a(kotlin.reflect.jvm.internal.impl.descriptors.x, int):java.lang.String");
    }

    @Y61.l
    public static final String b(@Y61.k InterfaceC42848a interfaceC42848a) {
        H h12 = H.f408434a;
        if (kotlin.reflect.jvm.internal.impl.resolve.j.o(interfaceC42848a)) {
            return null;
        }
        InterfaceC42882k interfaceC42882kF = interfaceC42848a.f();
        InterfaceC42851d interfaceC42851d = interfaceC42882kF instanceof InterfaceC42851d ? (InterfaceC42851d) interfaceC42882kF : null;
        if (interfaceC42851d == null || interfaceC42851d.getName().f409253c) {
            return null;
        }
        InterfaceC42848a interfaceC42848aN0 = interfaceC42848a.n0();
        a0 a0Var = interfaceC42848aN0 instanceof a0 ? (a0) interfaceC42848aN0 : null;
        if (a0Var == null) {
            return null;
        }
        return D.a(h12, interfaceC42851d, a(a0Var, 3));
    }

    @Y61.k
    public static final u c(@Y61.k O o12) {
        return (u) C42933k.b(o12, w.f408559a, K.f408436k, J.f408435a, kotlin.reflect.jvm.internal.impl.utils.e.f410354b);
    }
}
