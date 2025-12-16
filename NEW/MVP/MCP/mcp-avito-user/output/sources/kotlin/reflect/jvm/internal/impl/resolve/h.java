package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;
import kotlin.reflect.jvm.internal.impl.descriptors.K;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.types.checker.g;
import kotlin.reflect.jvm.internal.impl.types.checker.i;

/* compiled from: DescriptorEquivalenceForOverrides.kt */
/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final h f409624a = new h();

    public static b0 e(InterfaceC42848a interfaceC42848a) {
        while (interfaceC42848a instanceof CallableMemberDescriptor) {
            CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) interfaceC42848a;
            if (callableMemberDescriptor.getKind() != CallableMemberDescriptor.Kind.f407409c) {
                break;
            }
            interfaceC42848a = (CallableMemberDescriptor) C42745f0.v0(callableMemberDescriptor.p());
            if (interfaceC42848a == null) {
                return null;
            }
        }
        return interfaceC42848a.e();
    }

    public final boolean a(@Y61.l InterfaceC42882k interfaceC42882k, @Y61.l InterfaceC42882k interfaceC42882k2, boolean z12) {
        if ((interfaceC42882k instanceof InterfaceC42851d) && (interfaceC42882k2 instanceof InterfaceC42851d)) {
            return L.f(((InterfaceC42851d) interfaceC42882k).l(), ((InterfaceC42851d) interfaceC42882k2).l());
        }
        if ((interfaceC42882k instanceof g0) && (interfaceC42882k2 instanceof g0)) {
            return b((g0) interfaceC42882k, (g0) interfaceC42882k2, z12, g.f409623l);
        }
        if (!(interfaceC42882k instanceof InterfaceC42848a) || !(interfaceC42882k2 instanceof InterfaceC42848a)) {
            return ((interfaceC42882k instanceof K) && (interfaceC42882k2 instanceof K)) ? L.f(((K) interfaceC42882k).d(), ((K) interfaceC42882k2).d()) : L.f(interfaceC42882k, interfaceC42882k2);
        }
        InterfaceC42848a interfaceC42848a = (InterfaceC42848a) interfaceC42882k;
        InterfaceC42848a interfaceC42848a2 = (InterfaceC42848a) interfaceC42882k2;
        i.a aVar = i.a.f410099a;
        boolean z13 = true;
        if (!interfaceC42848a.equals(interfaceC42848a2)) {
            if (!L.f(interfaceC42848a.getName(), interfaceC42848a2.getName()) || (((interfaceC42848a instanceof kotlin.reflect.jvm.internal.impl.descriptors.B) && (interfaceC42848a2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.B) && ((kotlin.reflect.jvm.internal.impl.descriptors.B) interfaceC42848a).O() != ((kotlin.reflect.jvm.internal.impl.descriptors.B) interfaceC42848a2).O()) || ((L.f(interfaceC42848a.f(), interfaceC42848a2.f()) && (!z12 || !L.f(e(interfaceC42848a), e(interfaceC42848a2)))) || j.o(interfaceC42848a) || j.o(interfaceC42848a2) || !d(interfaceC42848a, interfaceC42848a2, e.f409620l, z12)))) {
                return false;
            }
            OverridingUtil overridingUtil = new OverridingUtil(new d(interfaceC42848a, interfaceC42848a2, z12), aVar, g.a.f410098a);
            OverridingUtil.OverrideCompatibilityInfo.Result resultC = overridingUtil.m(interfaceC42848a, interfaceC42848a2, null, true).c();
            OverridingUtil.OverrideCompatibilityInfo.Result result = OverridingUtil.OverrideCompatibilityInfo.Result.f409567b;
            if (resultC != result || overridingUtil.m(interfaceC42848a2, interfaceC42848a, null, true).c() != result) {
                z13 = false;
            }
        }
        return z13;
    }

    @X41.j
    public final boolean b(@Y61.k g0 g0Var, @Y61.k g0 g0Var2, boolean z12, @Y61.k Y41.p<? super InterfaceC42882k, ? super InterfaceC42882k, Boolean> pVar) {
        if (g0Var.equals(g0Var2)) {
            return true;
        }
        return !L.f(g0Var.f(), g0Var2.f()) && d(g0Var, g0Var2, pVar, z12) && g0Var.getIndex() == g0Var2.getIndex();
    }

    public final boolean d(InterfaceC42882k interfaceC42882k, InterfaceC42882k interfaceC42882k2, Y41.p<? super InterfaceC42882k, ? super InterfaceC42882k, Boolean> pVar, boolean z12) {
        InterfaceC42882k interfaceC42882kF = interfaceC42882k.f();
        InterfaceC42882k interfaceC42882kF2 = interfaceC42882k2.f();
        return ((interfaceC42882kF instanceof CallableMemberDescriptor) || (interfaceC42882kF2 instanceof CallableMemberDescriptor)) ? pVar.invoke(interfaceC42882kF, interfaceC42882kF2).booleanValue() : a(interfaceC42882kF, interfaceC42882kF2, z12);
    }
}
