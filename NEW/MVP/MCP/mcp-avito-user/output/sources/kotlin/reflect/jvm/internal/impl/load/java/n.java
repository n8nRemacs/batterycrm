package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.collections.C42745f0;
import kotlin.collections.C42770s0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.descriptors.a0;
import kotlin.reflect.jvm.internal.impl.descriptors.k0;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.types.E0;
import kotlin.reflect.jvm.internal.impl.types.O;
import kotlin.sequences.C43026i;
import kotlin.sequences.C43033p;
import kotlin.sequences.o0;

/* compiled from: ErasedOverridabilityCondition.kt */
@s0
/* loaded from: classes8.dex */
public final class n implements ExternalOverridabilityCondition {

    /* compiled from: ErasedOverridabilityCondition.kt */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f408293a;

        static {
            int[] iArr = new int[OverridingUtil.OverrideCompatibilityInfo.Result.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f408293a = iArr;
        }
    }

    /* compiled from: ErasedOverridabilityCondition.kt */
    public static final class b extends N implements Y41.l<k0, O> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f408294l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final O invoke(k0 k0Var) {
            return k0Var.getType();
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    @Y61.k
    public final ExternalOverridabilityCondition.Contract a() {
        return ExternalOverridabilityCondition.Contract.f409552c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    @Y61.k
    public final ExternalOverridabilityCondition.Result b(@Y61.k InterfaceC42848a interfaceC42848a, @Y61.k InterfaceC42848a interfaceC42848a2, @Y61.l InterfaceC42851d interfaceC42851d) {
        boolean z12 = interfaceC42848a2 instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.e;
        ExternalOverridabilityCondition.Result result = ExternalOverridabilityCondition.Result.f409557d;
        if (!z12) {
            return result;
        }
        kotlin.reflect.jvm.internal.impl.load.java.descriptors.e eVar = (kotlin.reflect.jvm.internal.impl.load.java.descriptors.e) interfaceC42848a2;
        if (!eVar.getTypeParameters().isEmpty()) {
            return result;
        }
        OverridingUtil.OverrideCompatibilityInfo overrideCompatibilityInfoI = OverridingUtil.i(interfaceC42848a, interfaceC42848a2);
        if ((overrideCompatibilityInfoI != null ? overrideCompatibilityInfoI.c() : null) != null) {
            return result;
        }
        C43026i c43026iB = C43033p.B(new o0(new C42770s0(eVar.g()), b.f408294l), eVar.f407709h);
        kotlin.reflect.jvm.internal.impl.descriptors.impl.O o12 = eVar.f407711j;
        C43026i.b bVar = new C43026i.b(C43033p.z(c43026iB, C42745f0.V(o12 != null ? o12.getType() : null)));
        while (bVar.hasNext()) {
            O o13 = (O) bVar.next();
            if (!o13.F0().isEmpty() && !(o13.K0() instanceof kotlin.reflect.jvm.internal.impl.load.java.lazy.types.i)) {
                return result;
            }
        }
        InterfaceC42848a interfaceC42848aB = interfaceC42848a.b(E0.e(new kotlin.reflect.jvm.internal.impl.load.java.lazy.types.g(null, 1, null)));
        if (interfaceC42848aB == null) {
            return result;
        }
        if (interfaceC42848aB instanceof a0) {
            a0 a0Var = (a0) interfaceC42848aB;
            if (!a0Var.getTypeParameters().isEmpty()) {
                interfaceC42848aB = a0Var.m0().a(C42784z0.f406748b).build();
            }
        }
        return a.f408293a[OverridingUtil.f409560e.n(interfaceC42848aB, interfaceC42848a2, false).c().ordinal()] == 1 ? ExternalOverridabilityCondition.Result.f409555b : result;
    }
}
