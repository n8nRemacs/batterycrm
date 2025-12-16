package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Iterator;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x;
import kotlin.reflect.jvm.internal.impl.descriptors.k0;
import kotlin.reflect.jvm.internal.impl.load.kotlin.u;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;

/* compiled from: JavaIncompatibilityRulesOverridabilityCondition.kt */
/* loaded from: classes8.dex */
public final class v implements ExternalOverridabilityCondition {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final a f408412a = new a(null);

    /* compiled from: JavaIncompatibilityRulesOverridabilityCondition.kt */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public static boolean a(@Y61.k InterfaceC42848a interfaceC42848a, @Y61.k InterfaceC42848a interfaceC42848a2) {
            if ((interfaceC42848a2 instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.e) && (interfaceC42848a instanceof InterfaceC42905x)) {
                kotlin.reflect.jvm.internal.impl.load.java.descriptors.e eVar = (kotlin.reflect.jvm.internal.impl.load.java.descriptors.e) interfaceC42848a2;
                eVar.g().size();
                InterfaceC42905x interfaceC42905x = (InterfaceC42905x) interfaceC42848a;
                interfaceC42905x.g().size();
                Iterator it = C42745f0.T0(eVar.n0().g(), interfaceC42905x.n0().g()).iterator();
                while (it.hasNext()) {
                    Q q12 = (Q) it.next();
                    if ((b((InterfaceC42905x) interfaceC42848a2, (k0) q12.f406619b) instanceof u.d) != (b(interfaceC42905x, (k0) q12.f406620c) instanceof u.d)) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:51:0x00eb, code lost:
        
            if (kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.g(r2).equals(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.g(r0)) == false) goto L53;
         */
        /* JADX WARN: Removed duplicated region for block: B:34:0x009f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static kotlin.reflect.jvm.internal.impl.load.kotlin.u b(kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x r5, kotlin.reflect.jvm.internal.impl.descriptors.k0 r6) {
            /*
                r0 = 0
                r1 = 1
                if (r5 != 0) goto L6
                goto L9f
            L6:
                kotlin.reflect.jvm.internal.impl.name.f r2 = r5.getName()
                java.lang.String r2 = r2.b()
                java.lang.String r3 = "remove"
                boolean r2 = kotlin.jvm.internal.L.f(r2, r3)
                if (r2 == 0) goto L9f
                java.util.List r2 = r5.g()
                int r2 = r2.size()
                if (r2 != r1) goto L9f
                kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r2 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.i(r5)
                kotlin.reflect.jvm.internal.impl.descriptors.k r2 = r2.f()
                boolean r2 = r2 instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.c
                if (r2 != 0) goto L9f
                boolean r2 = kotlin.reflect.jvm.internal.impl.builtins.k.y(r5)
                if (r2 == 0) goto L34
                goto L9f
            L34:
                kotlin.reflect.jvm.internal.impl.descriptors.x r2 = r5.n0()
                java.util.List r2 = r2.g()
                java.lang.Object r2 = kotlin.collections.C42745f0.u0(r2)
                kotlin.reflect.jvm.internal.impl.descriptors.k0 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.k0) r2
                kotlin.reflect.jvm.internal.impl.types.O r2 = r2.getType()
                kotlin.reflect.jvm.internal.impl.load.kotlin.u r2 = kotlin.reflect.jvm.internal.impl.load.kotlin.E.c(r2)
                boolean r3 = r2 instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.u.d
                if (r3 == 0) goto L51
                kotlin.reflect.jvm.internal.impl.load.kotlin.u$d r2 = (kotlin.reflect.jvm.internal.impl.load.kotlin.u.d) r2
                goto L52
            L51:
                r2 = r0
            L52:
                if (r2 == 0) goto L57
                kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType r2 = r2.f408558j
                goto L58
            L57:
                r2 = r0
            L58:
                kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType r3 = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.INT
                if (r2 == r3) goto L5d
                goto L9f
            L5d:
                kotlin.reflect.jvm.internal.impl.descriptors.x r2 = kotlin.reflect.jvm.internal.impl.load.java.C42914g.a(r5)
                if (r2 != 0) goto L64
                goto L9f
            L64:
                kotlin.reflect.jvm.internal.impl.descriptors.x r3 = r2.n0()
                java.util.List r3 = r3.g()
                java.lang.Object r3 = kotlin.collections.C42745f0.u0(r3)
                kotlin.reflect.jvm.internal.impl.descriptors.k0 r3 = (kotlin.reflect.jvm.internal.impl.descriptors.k0) r3
                kotlin.reflect.jvm.internal.impl.types.O r3 = r3.getType()
                kotlin.reflect.jvm.internal.impl.load.kotlin.u r3 = kotlin.reflect.jvm.internal.impl.load.kotlin.E.c(r3)
                kotlin.reflect.jvm.internal.impl.descriptors.k r2 = r2.f()
                kotlin.reflect.jvm.internal.impl.name.d r2 = kotlin.reflect.jvm.internal.impl.resolve.j.g(r2)
                kotlin.reflect.jvm.internal.impl.name.c r4 = kotlin.reflect.jvm.internal.impl.builtins.n.a.f407355K
                kotlin.reflect.jvm.internal.impl.name.d r4 = r4.i()
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L9f
                boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.u.c
                if (r2 == 0) goto L9f
                kotlin.reflect.jvm.internal.impl.load.kotlin.u$c r3 = (kotlin.reflect.jvm.internal.impl.load.kotlin.u.c) r3
                java.lang.String r2 = r3.f408557j
                java.lang.String r3 = "java/lang/Object"
                boolean r2 = kotlin.jvm.internal.L.f(r2, r3)
                if (r2 == 0) goto L9f
                goto Led
            L9f:
                java.util.List r2 = r5.g()
                int r2 = r2.size()
                if (r2 == r1) goto Laa
                goto Lfa
            Laa:
                kotlin.reflect.jvm.internal.impl.descriptors.k r2 = r5.f()
                boolean r3 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
                if (r3 == 0) goto Lb5
                kotlin.reflect.jvm.internal.impl.descriptors.d r2 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d) r2
                goto Lb6
            Lb5:
                r2 = r0
            Lb6:
                if (r2 != 0) goto Lb9
                goto Lfa
            Lb9:
                java.util.List r5 = r5.g()
                java.lang.Object r5 = kotlin.collections.C42745f0.u0(r5)
                kotlin.reflect.jvm.internal.impl.descriptors.k0 r5 = (kotlin.reflect.jvm.internal.impl.descriptors.k0) r5
                kotlin.reflect.jvm.internal.impl.types.O r5 = r5.getType()
                kotlin.reflect.jvm.internal.impl.types.q0 r5 = r5.H0()
                kotlin.reflect.jvm.internal.impl.descriptors.f r5 = r5.b()
                boolean r3 = r5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
                if (r3 == 0) goto Ld6
                r0 = r5
                kotlin.reflect.jvm.internal.impl.descriptors.d r0 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d) r0
            Ld6:
                if (r0 != 0) goto Ld9
                goto Lfa
            Ld9:
                kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r5 = kotlin.reflect.jvm.internal.impl.builtins.k.s(r2)
                if (r5 == 0) goto Lfa
                kotlin.reflect.jvm.internal.impl.name.c r5 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.g(r2)
                kotlin.reflect.jvm.internal.impl.name.c r0 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.g(r0)
                boolean r5 = r5.equals(r0)
                if (r5 == 0) goto Lfa
            Led:
                kotlin.reflect.jvm.internal.impl.types.O r5 = r6.getType()
                kotlin.reflect.jvm.internal.impl.types.J0 r5 = kotlin.reflect.jvm.internal.impl.types.G0.h(r5, r1)
                kotlin.reflect.jvm.internal.impl.load.kotlin.u r5 = kotlin.reflect.jvm.internal.impl.load.kotlin.E.c(r5)
                goto L102
            Lfa:
                kotlin.reflect.jvm.internal.impl.types.O r5 = r6.getType()
                kotlin.reflect.jvm.internal.impl.load.kotlin.u r5 = kotlin.reflect.jvm.internal.impl.load.kotlin.E.c(r5)
            L102:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.v.a.b(kotlin.reflect.jvm.internal.impl.descriptors.x, kotlin.reflect.jvm.internal.impl.descriptors.k0):kotlin.reflect.jvm.internal.impl.load.kotlin.u");
        }

        public a() {
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    @Y61.k
    public final ExternalOverridabilityCondition.Contract a() {
        return ExternalOverridabilityCondition.Contract.f409551b;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result b(@Y61.k kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a r7, @Y61.k kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a r8, @Y61.l kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d r9) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
            kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result r1 = kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.f409556c
            if (r0 == 0) goto L96
            boolean r0 = r8 instanceof kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x
            if (r0 == 0) goto L96
            boolean r0 = kotlin.reflect.jvm.internal.impl.builtins.k.y(r8)
            if (r0 == 0) goto L12
            goto L96
        L12:
            kotlin.reflect.jvm.internal.impl.load.java.g r0 = kotlin.reflect.jvm.internal.impl.load.java.C42914g.f408061m
            r2 = r8
            kotlin.reflect.jvm.internal.impl.descriptors.x r2 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x) r2
            kotlin.reflect.jvm.internal.impl.name.f r3 = r2.getName()
            r0.getClass()
            boolean r0 = kotlin.reflect.jvm.internal.impl.load.java.C42914g.b(r3)
            if (r0 != 0) goto L36
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a r0 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.f407963a
            kotlin.reflect.jvm.internal.impl.name.f r3 = r2.getName()
            r0.getClass()
            java.util.ArrayList r0 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.f407973k
            boolean r0 = r0.contains(r3)
            if (r0 != 0) goto L36
            goto L96
        L36:
            r0 = r7
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r0 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r0
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r0 = kotlin.reflect.jvm.internal.impl.load.java.J.c(r0)
            boolean r3 = r7 instanceof kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x
            if (r3 == 0) goto L45
            r4 = r7
            kotlin.reflect.jvm.internal.impl.descriptors.x r4 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x) r4
            goto L46
        L45:
            r4 = 0
        L46:
            if (r4 == 0) goto L53
            boolean r5 = r2.E0()
            boolean r4 = r4.E0()
            if (r5 != r4) goto L53
            goto L5c
        L53:
            if (r0 == 0) goto L95
            boolean r4 = r2.E0()
            if (r4 != 0) goto L5c
            goto L95
        L5c:
            boolean r4 = r9 instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.c
            if (r4 == 0) goto L96
            kotlin.reflect.jvm.internal.impl.descriptors.x r4 = r2.A0()
            if (r4 == 0) goto L67
            goto L96
        L67:
            if (r0 == 0) goto L96
            boolean r9 = kotlin.reflect.jvm.internal.impl.load.java.J.d(r9, r0)
            if (r9 == 0) goto L70
            goto L96
        L70:
            boolean r9 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x
            if (r9 == 0) goto L95
            if (r3 == 0) goto L95
            kotlin.reflect.jvm.internal.impl.descriptors.x r0 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x) r0
            kotlin.reflect.jvm.internal.impl.descriptors.x r9 = kotlin.reflect.jvm.internal.impl.load.java.C42914g.a(r0)
            if (r9 == 0) goto L95
            r9 = 2
            java.lang.String r0 = kotlin.reflect.jvm.internal.impl.load.kotlin.E.a(r2, r9)
            r2 = r7
            kotlin.reflect.jvm.internal.impl.descriptors.x r2 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x) r2
            kotlin.reflect.jvm.internal.impl.descriptors.x r2 = r2.n0()
            java.lang.String r9 = kotlin.reflect.jvm.internal.impl.load.kotlin.E.a(r2, r9)
            boolean r9 = r0.equals(r9)
            if (r9 == 0) goto L95
            goto L96
        L95:
            return r1
        L96:
            kotlin.reflect.jvm.internal.impl.load.java.v$a r9 = kotlin.reflect.jvm.internal.impl.load.java.v.f408412a
            r9.getClass()
            boolean r7 = kotlin.reflect.jvm.internal.impl.load.java.v.a.a(r7, r8)
            if (r7 == 0) goto La2
            return r1
        La2:
            kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result r7 = kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.f409557d
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.v.b(kotlin.reflect.jvm.internal.impl.descriptors.a, kotlin.reflect.jvm.internal.impl.descriptors.a, kotlin.reflect.jvm.internal.impl.descriptors.d):kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result");
    }
}
