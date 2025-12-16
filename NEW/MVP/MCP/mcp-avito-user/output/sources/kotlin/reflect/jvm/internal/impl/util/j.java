package kotlin.reflect.jvm.internal.impl.util;

import java.util.Collections;
import java.util.List;
import kotlin.collections.C42745f0;
import kotlin.reflect.jvm.internal.impl.builtins.l;
import kotlin.reflect.jvm.internal.impl.builtins.n;
import kotlin.reflect.jvm.internal.impl.descriptors.C42904w;
import kotlin.reflect.jvm.internal.impl.descriptors.E;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.k0;
import kotlin.reflect.jvm.internal.impl.types.C42974e0;
import kotlin.reflect.jvm.internal.impl.types.G0;
import kotlin.reflect.jvm.internal.impl.types.P;
import kotlin.reflect.jvm.internal.impl.types.Y;
import kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC42970f;
import kotlin.reflect.jvm.internal.impl.types.n0;
import kotlin.reflect.jvm.internal.impl.util.f;

/* compiled from: modifierChecks.kt */
/* loaded from: classes8.dex */
final class j implements f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final j f410290a = new j();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f410291b = "second parameter must be of type KProperty<*> or its supertype";

    @Override // kotlin.reflect.jvm.internal.impl.util.f
    public final boolean a(@Y61.k kotlin.reflect.jvm.internal.impl.load.java.descriptors.e eVar) {
        k0 k0Var = eVar.g().get(1);
        l.b bVar = kotlin.reflect.jvm.internal.impl.builtins.l.f407322d;
        int i12 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.f409615a;
        E eD2 = kotlin.reflect.jvm.internal.impl.resolve.j.d(k0Var);
        bVar.getClass();
        InterfaceC42851d interfaceC42851dA = C42904w.a(eD2, n.a.f407362R);
        Y yE2 = null;
        if (interfaceC42851dA != null) {
            n0.f410236c.getClass();
            n0 n0Var = n0.f410237d;
            List listSingletonList = Collections.singletonList(new C42974e0((g0) C42745f0.u0(interfaceC42851dA.l().getParameters())));
            P p12 = P.f410039a;
            yE2 = P.e(n0Var, interfaceC42851dA.l(), listSingletonList, false, null);
        }
        if (yE2 == null) {
            return false;
        }
        return InterfaceC42970f.f410097a.d(yE2, G0.h(k0Var.getType(), false));
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.f
    @Y61.l
    public final String b(@Y61.k kotlin.reflect.jvm.internal.impl.load.java.descriptors.e eVar) {
        return f.a.a(this, eVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.f
    @Y61.k
    public final String getDescription() {
        return f410291b;
    }
}
