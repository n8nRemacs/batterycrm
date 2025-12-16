package androidx.compose.material.pullrefresh;

import androidx.compose.material.InterfaceC21154e4;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22128n0;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.platform.Q0;
import androidx.compose.ui.unit.h;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;

/* compiled from: PullRefreshState.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class v {
    @InterfaceC22132o
    @InterfaceC21154e4
    @Y61.k
    public static final t a(boolean z12, @Y61.k Y41.a aVar, @Y61.l A a12) {
        b bVar = b.f33923a;
        bVar.getClass();
        float f12 = b.f33924b;
        bVar.getClass();
        float f13 = b.f33925c;
        h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
        if (Float.compare(f12, 0) <= 0) {
            throw new IllegalArgumentException("The refresh trigger must be greater than zero!");
        }
        Object objT = a12.t();
        A.f37866a.getClass();
        Object obj = A.a.f37868b;
        if (objT == obj) {
            objT = C22187u0.h(EmptyCoroutineContext.INSTANCE, a12);
            a12.H(objT);
        }
        T t12 = (T) objT;
        InterfaceC22204y1 interfaceC22204y1M = C22126m3.m(aVar, a12);
        l0.e eVar = new l0.e();
        l0.e eVar2 = new l0.e();
        androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) a12.o(Q0.f41199h);
        eVar.f406839b = dVar.M0(f12);
        eVar2.f406839b = dVar.M0(f13);
        boolean zB2 = a12.B(t12);
        Object objT2 = a12.t();
        if (zB2 || objT2 == obj) {
            objT2 = new t(t12, interfaceC22204y1M, eVar2.f406839b, eVar.f406839b);
            a12.H(objT2);
        }
        t tVar = (t) objT2;
        boolean zU2 = a12.u(tVar) | a12.j(z12) | a12.k(eVar.f406839b) | a12.k(eVar2.f406839b);
        Object objT3 = a12.t();
        if (zU2 || objT3 == obj) {
            objT3 = new u(tVar, z12, eVar, eVar2);
            a12.H(objT3);
        }
        C22128n0 c22128n0 = C22187u0.f38775a;
        a12.w((Y41.a) objT3);
        return tVar;
    }
}
