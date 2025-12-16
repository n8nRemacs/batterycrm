package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x;
import kotlin.reflect.jvm.internal.impl.descriptors.T;
import kotlin.reflect.jvm.internal.impl.descriptors.U;
import kotlin.reflect.jvm.internal.impl.descriptors.a0;
import kotlin.reflect.jvm.internal.impl.types.Y;

/* compiled from: specialBuiltinMembers.kt */
@s0
@X41.i
/* loaded from: classes8.dex */
public final class J {

    /* compiled from: specialBuiltinMembers.kt */
    public static final class a extends N implements Y41.l<CallableMemberDescriptor, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f407954l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(CallableMemberDescriptor callableMemberDescriptor) {
            C42918k c42918k = C42918k.f408069a;
            CallableMemberDescriptor callableMemberDescriptorI = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.i(callableMemberDescriptor);
            c42918k.getClass();
            return Boolean.valueOf(C42918k.b(callableMemberDescriptorI));
        }
    }

    /* compiled from: specialBuiltinMembers.kt */
    public static final class b extends N implements Y41.l<CallableMemberDescriptor, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f407955l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(CallableMemberDescriptor callableMemberDescriptor) {
            a0 a0Var = (a0) callableMemberDescriptor;
            C42913f.f408060m.getClass();
            return Boolean.valueOf(kotlin.reflect.jvm.internal.impl.builtins.k.y(a0Var) && kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.b(a0Var, new C42912e(a0Var)) != null);
        }
    }

    /* compiled from: specialBuiltinMembers.kt */
    public static final class c extends N implements Y41.l<CallableMemberDescriptor, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f407956l = new c();

        public c() {
            super(1);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
        @Override // Y41.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Boolean invoke(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r3) {
            /*
                r2 = this;
                kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r3 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r3
                boolean r0 = kotlin.reflect.jvm.internal.impl.builtins.k.y(r3)
                if (r0 == 0) goto L4e
                kotlin.reflect.jvm.internal.impl.load.java.g r0 = kotlin.reflect.jvm.internal.impl.load.java.C42914g.f408061m
                kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$a r0 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.f407963a
                r0.getClass()
                kotlin.reflect.jvm.internal.impl.name.f r0 = r3.getName()
                java.util.Set<kotlin.reflect.jvm.internal.impl.name.f> r1 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.f407968f
                boolean r0 = r1.contains(r0)
                r1 = 0
                if (r0 != 0) goto L1d
                goto L4a
            L1d:
                kotlin.reflect.jvm.internal.impl.load.java.h r0 = kotlin.reflect.jvm.internal.impl.load.java.C42915h.f408063l
                kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r3 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.b(r3, r0)
                if (r3 == 0) goto L4a
                java.lang.String r3 = kotlin.reflect.jvm.internal.impl.load.kotlin.E.b(r3)
                if (r3 != 0) goto L2c
                goto L4a
            L2c:
                java.util.ArrayList r0 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.f407965c
                boolean r0 = r0.contains(r3)
                if (r0 == 0) goto L38
                kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$SpecialSignatureInfo r3 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.SpecialSignatureInfo.f407975b
            L36:
                r1 = r3
                goto L4a
            L38:
                java.util.LinkedHashMap r0 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.f407967e
                java.lang.Object r3 = kotlin.collections.P0.d(r0, r3)
                kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$TypeSafeBarrierDescription r3 = (kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.TypeSafeBarrierDescription) r3
                kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$TypeSafeBarrierDescription r0 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.TypeSafeBarrierDescription.f407980c
                if (r3 != r0) goto L47
                kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$SpecialSignatureInfo r3 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.SpecialSignatureInfo.f407977d
                goto L36
            L47:
                kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$SpecialSignatureInfo r3 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.SpecialSignatureInfo.f407976c
                goto L36
            L4a:
                if (r1 == 0) goto L4e
                r3 = 1
                goto L4f
            L4e:
                r3 = 0
            L4f:
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.J.c.invoke(java.lang.Object):java.lang.Object");
        }
    }

    @Y61.l
    public static final String a(@Y61.k InterfaceC42905x interfaceC42905x) {
        CallableMemberDescriptor callableMemberDescriptorB = kotlin.reflect.jvm.internal.impl.builtins.k.y(interfaceC42905x) ? b(interfaceC42905x) : null;
        if (callableMemberDescriptorB == null) {
            return null;
        }
        CallableMemberDescriptor callableMemberDescriptorI = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.i(callableMemberDescriptorB);
        if (callableMemberDescriptorI instanceof U) {
            C42918k.f408069a.getClass();
            return C42918k.a(callableMemberDescriptorI);
        }
        if (!(callableMemberDescriptorI instanceof a0)) {
            return null;
        }
        C42913f.f408060m.getClass();
        SpecialGenericSignatures.f407963a.getClass();
        LinkedHashMap linkedHashMap = SpecialGenericSignatures.f407972j;
        String strB = kotlin.reflect.jvm.internal.impl.load.kotlin.E.b((a0) callableMemberDescriptorI);
        kotlin.reflect.jvm.internal.impl.name.f fVar = strB == null ? null : (kotlin.reflect.jvm.internal.impl.name.f) linkedHashMap.get(strB);
        if (fVar != null) {
            return fVar.b();
        }
        return null;
    }

    @Y61.l
    public static final <T extends CallableMemberDescriptor> T b(@Y61.k T t12) {
        SpecialGenericSignatures.f407963a.getClass();
        if (!SpecialGenericSignatures.f407973k.contains(t12.getName())) {
            C42916i.f408064a.getClass();
            if (!C42916i.f408068e.contains(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.i(t12).getName())) {
                return null;
            }
        }
        if (t12 instanceof U ? true : t12 instanceof T) {
            return (T) kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.b(t12, a.f407954l);
        }
        if (t12 instanceof a0) {
            return (T) kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.b(t12, b.f407955l);
        }
        return null;
    }

    @Y61.l
    public static final <T extends CallableMemberDescriptor> T c(@Y61.k T t12) {
        T t13 = (T) b(t12);
        if (t13 != null) {
            return t13;
        }
        C42914g c42914g = C42914g.f408061m;
        kotlin.reflect.jvm.internal.impl.name.f name = t12.getName();
        c42914g.getClass();
        if (C42914g.b(name)) {
            return (T) kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.b(t12, c.f407956l);
        }
        return null;
    }

    public static final boolean d(@Y61.k InterfaceC42851d interfaceC42851d, @Y61.k CallableMemberDescriptor callableMemberDescriptor) {
        Y yQ2 = ((InterfaceC42851d) callableMemberDescriptor.f()).q();
        for (InterfaceC42851d interfaceC42851dJ = kotlin.reflect.jvm.internal.impl.resolve.j.j(interfaceC42851d); interfaceC42851dJ != null; interfaceC42851dJ = kotlin.reflect.jvm.internal.impl.resolve.j.j(interfaceC42851dJ)) {
            if (!(interfaceC42851dJ instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.c) && kotlin.reflect.jvm.internal.impl.types.checker.y.a(interfaceC42851dJ.q(), yQ2) != null) {
                return !kotlin.reflect.jvm.internal.impl.builtins.k.y(interfaceC42851dJ);
            }
        }
        return false;
    }
}
