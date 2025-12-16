package androidx.compose.foundation.text.selection;

import androidx.compose.animation.core.C20321u;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.platform.C22535v1;
import kotlin.Metadata;

/* compiled from: SelectionManager.android.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/v;", "invoke", "(Landroidx/compose/ui/v;Landroidx/compose/runtime/A;I)Landroidx/compose/ui/v;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class U0 extends kotlin.jvm.internal.N implements Y41.q<androidx.compose.ui.v, androidx.compose.runtime.A, Integer, androidx.compose.ui.v> {
    @Override // Y41.q
    public final androidx.compose.ui.v invoke(androidx.compose.ui.v vVar, androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.ui.v vVar2 = vVar;
        androidx.compose.runtime.A a13 = a12;
        num.intValue();
        a13.C(-1914520728);
        androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) a13.o(androidx.compose.ui.platform.Q0.f41199h);
        Object objT = a13.t();
        androidx.compose.runtime.A.f37866a.getClass();
        A.a.C1651a c1651a = A.a.f37868b;
        if (objT == c1651a) {
            androidx.compose.ui.unit.u.f42871b.getClass();
            objT = C22126m3.g(androidx.compose.ui.unit.u.a(0L));
            a13.H(objT);
        }
        InterfaceC22204y1 interfaceC22204y1 = (InterfaceC22204y1) objT;
        boolean zU2 = a13.u(null);
        Object objT2 = a13.t();
        if (zU2 || objT2 == c1651a) {
            objT2 = new Q0(null, interfaceC22204y1);
            a13.H(objT2);
        }
        Y41.a aVar = (Y41.a) objT2;
        boolean zB2 = a13.B(dVar);
        Object objT3 = a13.t();
        if (zB2 || objT3 == c1651a) {
            objT3 = new T0(dVar, interfaceC22204y1);
            a13.H(objT3);
        }
        C20321u c20321u = C21031p0.f32100a;
        androidx.compose.ui.v vVarA = androidx.compose.ui.n.a(vVar2, C22535v1.f41625a, new C21034r0(aVar, (Y41.l) objT3));
        a13.h();
        return vVarA;
    }
}
