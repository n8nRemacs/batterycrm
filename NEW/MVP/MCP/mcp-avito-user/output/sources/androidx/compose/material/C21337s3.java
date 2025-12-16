package androidx.compose.material;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: Drawer.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/F;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/F;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.material.s3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21337s3 extends kotlin.jvm.internal.N implements Y41.q<androidx.compose.foundation.layout.F, androidx.compose.runtime.A, Integer, kotlin.G0> {
    public C21337s3() {
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
        C22712b.i(f13.getF28270b());
        C22712b.j(f13.getF28270b());
        C22712b.i(f13.getF28270b());
        androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) a13.o(androidx.compose.ui.platform.Q0.f41199h);
        v.a aVar = androidx.compose.ui.v.f42878y1;
        C20588k2.s(aVar, 0.0f, 0.0f, dVar.J(C22712b.j(f13.getF28270b())), dVar.J(C22712b.i(f13.getF28270b())), 3);
        a13.o(androidx.compose.ui.platform.Q0.f41205n);
        LayoutDirection layoutDirection = LayoutDirection.f42838b;
        aVar.getClass();
        throw null;
    }
}
