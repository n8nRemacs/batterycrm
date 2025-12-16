package com.avito.android.iac_dialer_ui.pub.finished_call_screens.feedback_screen.feedback_bottom_sheet;

import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.InterfaceC22204y1;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.T;
import kotlinx.coroutines.channels.C43108m;

/* compiled from: IacUIFeedbackBottomSheet.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class y extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f167619l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(int i12) {
        super(2);
        this.f167619l = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f167619l | 1);
        IacUIFeedbackBottomSheetState iacUIFeedbackBottomSheetState = A.f167550a;
        B bE2 = a12.E(-970761444);
        if (iA2 == 0 && bE2.c()) {
            bE2.f();
        } else {
            C43108m c43108mA = kotlinx.coroutines.channels.A.a(Integer.MAX_VALUE, null, null, 6);
            bE2.C(-2111213375);
            Object objT = bE2.t();
            androidx.compose.runtime.A.f37866a.getClass();
            A.a.C1651a c1651a = A.a.f37868b;
            if (objT == c1651a) {
                objT = C22126m3.g(A.f167550a);
                bE2.H(objT);
            }
            InterfaceC22204y1 interfaceC22204y1 = (InterfaceC22204y1) objT;
            Object objI = com.akita.compose.component.accordion.s.i(-2111210369, bE2, false);
            if (objI == c1651a) {
                objI = C22126m3.g("");
                bE2.H(objI);
            }
            InterfaceC22204y1 interfaceC22204y12 = (InterfaceC22204y1) objI;
            bE2.X(false);
            Object objT2 = bE2.t();
            if (objT2 == c1651a) {
                objT2 = C22187u0.h(EmptyCoroutineContext.INSTANCE, bE2);
                bE2.H(objT2);
            }
            com.akita.compose.theme.re23.c.a(false, androidx.compose.runtime.internal.r.c(-1614594761, new x(c43108mA, interfaceC22204y1, interfaceC22204y12, (T) objT2), bE2), bE2, 48, 1);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new y(iA2);
        }
        return G0.f406611a;
    }
}
