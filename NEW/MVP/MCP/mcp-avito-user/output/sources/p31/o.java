package p31;

import android.content.Context;
import android.net.Uri;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.graphics.T;
import androidx.compose.ui.graphics.V;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.view.M0;
import androidx.view.T0;
import kotlin.G0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;

/* loaded from: classes8.dex */
public final class o extends N implements Y41.q {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ N f428181l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o(Y41.a aVar) {
        super(3);
        this.f428181l = (N) aVar;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // Y41.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int iIntValue;
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
        if (objT == A.a.f37868b) {
            objT = (A31.b) interfaceC22204y1B.getF42167b();
            a12.H(objT);
        }
        a12.O();
        A31.b bVar = (A31.b) objT;
        Context context = (Context) a12.o(AndroidCompositionLocals_androidKt.f41069b);
        Integer num = bVar.f80b;
        a12.I(1659363486);
        if (num == null) {
            T.a aVar = T.f39320b;
            a12.I(1887578889);
            long jD2 = V.d(4294309365L);
            a12.O();
            iIntValue = V.j(jD2);
        } else {
            iIntValue = num.intValue();
        }
        int i12 = iIntValue;
        a12.O();
        Uri uri = Uri.parse(bVar.f79a);
        C22187u0.d(new n(context, uri, i12, this.f428181l, null), a12, uri);
        return G0.f406611a;
    }
}
