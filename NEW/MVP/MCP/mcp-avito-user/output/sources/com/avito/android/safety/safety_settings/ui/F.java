package com.avito.android.safety.safety_settings.ui;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22196w1;
import androidx.compose.runtime.U2;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.v;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SafetySettingsSessionBottomSheet.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "columnHeight", "_avito_safety_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class F {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k List list, boolean z12, @Y61.k Y41.l lVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(-747823241);
        v.a aVar = androidx.compose.ui.v.f42878y1;
        bE2.C(64929183);
        Object objT = bE2.t();
        androidx.compose.runtime.A.f37866a.getClass();
        A.a.C1651a c1651a = A.a.f37868b;
        if (objT == c1651a) {
            objT = U2.a(0);
            bE2.H(objT);
        }
        InterfaceC22196w1 interfaceC22196w1 = (InterfaceC22196w1) objT;
        bE2.X(false);
        com.akita.compose.component.bottom_sheet.I iA2 = com.akita.compose.component.bottom_sheet.N.a(false, 0.0f, bE2, 0, 7);
        androidx.compose.ui.v vVarA = C22501m2.a(aVar, "sessionBottomSheetTag");
        bE2.C(64931756);
        boolean zB2 = bE2.B(lVar);
        Object objT2 = bE2.t();
        if (zB2 || objT2 == c1651a) {
            objT2 = new A(lVar);
            bE2.H(objT2);
        }
        bE2.X(false);
        com.akita.compose.component.bottom_sheet.H.a((Y41.a) objT2, vVarA, iA2, null, null, null, null, false, false, null, null, null, androidx.compose.runtime.internal.r.c(1115066967, new D(z12, interfaceC22196w1, list, lVar), bE2), bE2, 0, 384, 4088);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new E(list, z12, lVar, aVar, i12);
        }
    }
}
