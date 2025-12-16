package p31;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.view.M0;
import androidx.view.T0;
import kotlin.G0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import sberid.sdk.ui.base_components.android.ComposeWebViewKt;

/* loaded from: classes8.dex */
public final class m extends N implements Y41.q {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ N f428176l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m(Y41.a aVar) {
        super(3);
        this.f428176l = (N) aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v8, types: [Y41.a, java.lang.Object, kotlin.jvm.internal.N] */
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
        M0 m0A = org.koin.androidx.viewmodel.b.a(m0.f406844a.b(A31.e.class), t0A.getF42820b(), null, j71.d.a(t0A, a12), (org.koin.core.scope.a) a12.o(org.koin.compose.g.f421440a));
        a12.O();
        InterfaceC22204y1 interfaceC22204y1B = C22126m3.b(((A31.e) m0A).f86K, a12);
        a12.I(-492369756);
        Object objT = a12.t();
        A.f37866a.getClass();
        Object obj4 = A.a.f37868b;
        if (objT == obj4) {
            objT = (A31.b) interfaceC22204y1B.getF42167b();
            a12.H(objT);
        }
        a12.O();
        String str = ((A31.b) objT).f79a;
        a12.I(1157296644);
        ?? r62 = this.f428176l;
        boolean zB2 = a12.B(r62);
        Object objT2 = a12.t();
        if (zB2 || objT2 == obj4) {
            objT2 = new l(r62);
            a12.H(objT2);
        }
        a12.O();
        ComposeWebViewKt.ComposeWebView(str, (Y41.a) objT2, a12, 0, 0);
        return G0.f406611a;
    }
}
