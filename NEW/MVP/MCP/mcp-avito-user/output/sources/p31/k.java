package p31;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.view.C23404y0;
import androidx.view.M0;
import androidx.view.T0;
import kotlin.G0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import u31.AbstractC48787b;

/* loaded from: classes8.dex */
public final class k extends N implements Y41.q {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C23404y0 f428174l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(C23404y0 c23404y0) {
        super(3);
        this.f428174l = c23404y0;
    }

    @Override // Y41.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        A a12 = (A) obj2;
        ((Number) obj3).intValue();
        a12.I(-1614864554);
        androidx.view.viewmodel.compose.a.f46897a.getClass();
        T0 t0A = androidx.view.viewmodel.compose.a.a(a12);
        if (t0A == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        M0 m0A = org.koin.androidx.viewmodel.b.a(m0.f406844a.b(u31.f.class), t0A.getF42820b(), null, j71.d.a(t0A, a12), (org.koin.core.scope.a) a12.o(org.koin.compose.g.f421440a));
        a12.O();
        InterfaceC22204y1 interfaceC22204y1B = C22126m3.b(((u31.f) m0A).f439764K, a12);
        AbstractC48787b.a(interfaceC22204y1B, a12, 0);
        C22187u0.d(new j(interfaceC22204y1B, this.f428174l, null), a12, interfaceC22204y1B.getF42167b());
        return G0.f406611a;
    }
}
