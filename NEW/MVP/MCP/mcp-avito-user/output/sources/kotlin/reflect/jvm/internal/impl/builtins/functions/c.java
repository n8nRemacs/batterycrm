package kotlin.reflect.jvm.internal.impl.builtins.functions;

import Y61.k;
import java.util.Collections;
import java.util.List;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.reflect.jvm.internal.impl.builtins.functions.d;
import kotlin.reflect.jvm.internal.impl.builtins.functions.e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.g;

/* compiled from: FunctionClassScope.kt */
/* loaded from: classes8.dex */
public final class c extends g {
    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.g
    @k
    public final List<InterfaceC42905x> h() {
        b bVar = (b) this.f409678b;
        e.a aVar = e.a.f407215c;
        e eVar = bVar.f407206i;
        if (L.f(eVar, aVar)) {
            d.f407212F.getClass();
            return Collections.singletonList(d.a.a(bVar, false));
        }
        if (!L.f(eVar, e.d.f407218c)) {
            return C42784z0.f406748b;
        }
        d.f407212F.getClass();
        return Collections.singletonList(d.a.a(bVar, true));
    }
}
