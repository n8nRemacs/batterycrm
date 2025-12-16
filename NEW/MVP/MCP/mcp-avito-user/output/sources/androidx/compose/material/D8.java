package androidx.compose.material;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22187u0;
import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.l0;

/* compiled from: Slider.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/F;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/F;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class D8 extends kotlin.jvm.internal.N implements Y41.q<androidx.compose.foundation.layout.F, androidx.compose.runtime.A, Integer, kotlin.G0> {
    public D8() {
        throw null;
    }

    @Override // Y41.q
    public final kotlin.G0 invoke(androidx.compose.foundation.layout.F f12, androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.foundation.layout.F f13 = f12;
        androidx.compose.runtime.A a13 = a12;
        int iIntValue = num.intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= a13.B(f13) ? 4 : 2;
        }
        if (!a13.p(iIntValue & 1, (iIntValue & 19) != 18)) {
            a13.f();
            return kotlin.G0.f406611a;
        }
        a13.o(androidx.compose.ui.platform.Q0.f41205n);
        LayoutDirection layoutDirection = LayoutDirection.f42838b;
        float fJ2 = C22712b.j(f13.getF28270b());
        l0.e eVar = new l0.e();
        l0.e eVar2 = new l0.e();
        androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) a13.o(androidx.compose.ui.platform.Q0.f41199h);
        float f14 = I8.f32762a;
        eVar.f406839b = Math.max(fJ2 - dVar.M0(f14), 0.0f);
        eVar2.f406839b = Math.min(dVar.M0(f14), eVar.f406839b);
        Object objT = a13.t();
        androidx.compose.runtime.A.f37866a.getClass();
        if (objT == A.a.f37868b) {
            objT = C22187u0.h(EmptyCoroutineContext.INSTANCE, a13);
            a13.H(objT);
        }
        a13.t();
        throw null;
    }
}
