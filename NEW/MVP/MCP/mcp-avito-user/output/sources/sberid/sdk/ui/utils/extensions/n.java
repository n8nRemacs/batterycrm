package sberid.sdk.ui.utils.extensions;

import androidx.compose.animation.core.C20281g0;
import androidx.compose.animation.core.C20293k0;
import androidx.compose.animation.core.C20310q;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.graphics.C22322z0;
import androidx.compose.ui.graphics.J;
import androidx.compose.ui.graphics.T;
import androidx.compose.ui.graphics.V;
import androidx.compose.ui.graphics.p1;
import androidx.compose.ui.layout.C22392w0;
import androidx.compose.ui.platform.C22535v1;
import androidx.compose.ui.unit.u;
import androidx.compose.ui.v;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002¨\u0006\u0004²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0003\u001a\u00020\u00028\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/unit/u;", "size", "", "startOffsetX", "SberIdSDK_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class n {

    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/v;", "invoke", "(Landroidx/compose/ui/v;Landroidx/compose/runtime/A;I)Landroidx/compose/ui/v;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.q<v, A, Integer, v> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f437908l = new a();

        public a() {
            super(3);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.q
        public final v invoke(v vVar, A a12, Integer num) {
            v vVar2 = vVar;
            A a13 = a12;
            num.intValue();
            a13.I(1742881763);
            a13.I(-492369756);
            Object objT = a13.t();
            A.f37866a.getClass();
            Object obj = A.a.f37868b;
            if (objT == obj) {
                u.f42871b.getClass();
                objT = C22126m3.g(u.a(0L));
                a13.H(objT);
            }
            a13.O();
            InterfaceC22204y1 interfaceC22204y1 = (InterfaceC22204y1) objT;
            C20281g0.a aVarA = C20293k0.a(C20293k0.c("transitionOfShimmerEffect", a13, 0), (-2) * ((int) (((u) interfaceC22204y1.getF42167b()).f42872a >> 32)), 2 * ((int) (((u) interfaceC22204y1.getF42167b()).f42872a >> 32)), C20310q.a(C20310q.e(2000, 0, null, 6), null, 0L, 6), "transitionOfShimmerEffect", a13, 28680, 0);
            J.a aVar = J.f39287a;
            T.a aVar2 = T.f39320b;
            a13.I(1102299913);
            long jD2 = ic1.d.a(a13) ? V.d(4282006074L) : V.d(4292929518L);
            a13.O();
            T tA2 = T.a(jD2);
            a13.I(-2086209815);
            long jD3 = ic1.d.a(a13) ? V.d(4280163870L) : V.d(4294967295L);
            a13.O();
            T tA3 = T.a(jD3);
            a13.I(1102299913);
            long jD4 = ic1.d.a(a13) ? V.d(4282006074L) : V.d(4292929518L);
            a13.O();
            List listU = C42745f0.U(tA2, tA3, T.a(jD4));
            long jA2 = l0.h.a(((Number) aVarA.getF42167b()).floatValue(), 0.0f);
            long jA3 = l0.h.a(((Number) aVarA.getF42167b()).floatValue() + ((int) (((u) interfaceC22204y1.getF42167b()).f42872a >> 32)), (int) (((u) interfaceC22204y1.getF42167b()).f42872a & 4294967295L));
            p1.f39721b.getClass();
            aVar.getClass();
            v vVarA = androidx.compose.foundation.A.a(vVar2, new C22322z0(listU, null, jA2, jA3, 0, null));
            a13.I(1157296644);
            boolean zB2 = a13.B(interfaceC22204y1);
            Object objT2 = a13.t();
            if (zB2 || objT2 == obj) {
                objT2 = new m(interfaceC22204y1);
                a13.H(objT2);
            }
            a13.O();
            v vVarA2 = C22392w0.a(vVarA, (Y41.l) objT2);
            a13.O();
            return vVarA2;
        }
    }

    @Y61.k
    public static final v a(@Y61.k v vVar) {
        return androidx.compose.ui.n.a(vVar, C22535v1.f41625a, a.f437908l);
    }
}
