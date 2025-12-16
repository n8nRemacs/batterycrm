package com.avito.android.iac_dialer_ui.pub.finished_call_screens.feedback_screen.feedback_bottom_sheet;

import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.channels.C43108m;

/* compiled from: IacUIFeedbackBottomSheet.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class x extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C43108m f167615l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<IacUIFeedbackBottomSheetState> f167616m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<String> f167617n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ T f167618o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(C43108m c43108m, InterfaceC22204y1 interfaceC22204y1, InterfaceC22204y1 interfaceC22204y12, T t12) {
        super(2);
        this.f167615l = c43108m;
        this.f167616m = interfaceC22204y1;
        this.f167617n = interfaceC22204y12;
        this.f167618o = t12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        InterfaceC22204y1<IacUIFeedbackBottomSheetState> interfaceC22204y1;
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            v.a aVar = androidx.compose.ui.v.f42878y1;
            FillElement fillElement = C20588k2.f28682c;
            aVar.getClass();
            C20585k.f28659a.getClass();
            C20585k.l lVar = C20585k.f28662d;
            InterfaceC22215f.f39074a.getClass();
            I iA2 = H.a(lVar, InterfaceC22215f.a.f39088n, a13, 0);
            int f37888q = a13.getF37888Q();
            O1 o1Y = a13.y();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(a13, fillElement);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar2 = InterfaceC22413h.a.f40791b;
            if (a13.F() == null) {
                C22190v.b();
                throw null;
            }
            a13.A();
            if (a13.getF37887P()) {
                a13.b(aVar2);
            } else {
                a13.d();
            }
            R3.b(InterfaceC22413h.a.f40796g, a13, iA2);
            R3.b(InterfaceC22413h.a.f40795f, a13, o1Y);
            Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q))) {
                androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, a13, vVarC);
            K k12 = K.f28344a;
            StringBuilder sb2 = new StringBuilder("selectedRating=");
            IacUIFeedbackBottomSheetState iacUIFeedbackBottomSheetState = A.f167550a;
            InterfaceC22204y1<IacUIFeedbackBottomSheetState> interfaceC22204y12 = this.f167616m;
            sb2.append(interfaceC22204y12.getF42167b().getSelectedRating());
            String string = sb2.toString();
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.i iVar = com.akita.compose.theme.re23.b.f63988f;
            com.akita.compose.foundation.ui.p.b(string, iVar.f65240k, null, false, 0L, null, 0, 0, false, null, a13, 0, 1020);
            float f12 = 16;
            h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
            com.akita.compose.foundation.ui.g.a(f12, null, a13, 6);
            com.akita.compose.foundation.ui.p.b("selectedProblem=" + interfaceC22204y12.getF42167b().getSelectedProblemIndex(), iVar.f65240k, null, false, 0L, null, 0, 0, false, null, a13, 0, 1020);
            com.akita.compose.foundation.ui.g.a(f12, null, a13, 6);
            StringBuilder sb3 = new StringBuilder("manualProblemText=");
            InterfaceC22204y1<String> interfaceC22204y13 = this.f167617n;
            sb3.append(interfaceC22204y13.getF42167b());
            com.akita.compose.foundation.ui.p.b(sb3.toString(), iVar.f65240k, null, false, 0L, null, 0, 0, false, null, a13, 0, 1020);
            com.akita.compose.foundation.ui.g.a(f12, null, a13, 6);
            com.akita.compose.component.button.t tVarF2 = com.akita.compose.theme.re23.b.c(a13).f2();
            C43108m c43108m = this.f167615l;
            T t12 = this.f167618o;
            com.akita.compose.component.button.m.c("Open bottom sheet", new r(t12, c43108m), tVarF2, null, null, null, null, false, false, null, a13, 518, 1016);
            com.akita.compose.foundation.ui.g.a(f12, null, a13, 6);
            com.akita.compose.component.button.m.c("Open bottom sheet and hide in 3 sec", new t(t12, c43108m), com.akita.compose.theme.re23.b.c(a13).f2(), null, null, null, null, false, false, null, a13, 518, 1016);
            a13.z();
            IacUIFeedbackBottomSheetState f42167b = interfaceC22204y12.getF42167b();
            a13.C(548605894);
            Object objT = a13.t();
            androidx.compose.runtime.A.f37866a.getClass();
            A.a.C1651a c1651a = A.a.f37868b;
            if (objT == c1651a) {
                objT = new u(interfaceC22204y13);
                a13.H(objT);
            }
            Y41.l lVar2 = (Y41.l) objT;
            a13.h();
            a13.C(548608170);
            Object objT2 = a13.t();
            if (objT2 == c1651a) {
                interfaceC22204y1 = interfaceC22204y12;
                objT2 = new v(interfaceC22204y1);
                a13.H(objT2);
            } else {
                interfaceC22204y1 = interfaceC22204y12;
            }
            Y41.l lVar3 = (Y41.l) objT2;
            a13.h();
            a13.C(548610608);
            Object objT3 = a13.t();
            if (objT3 == c1651a) {
                objT3 = new w(interfaceC22204y1);
                a13.H(objT3);
            }
            a13.h();
            A.a(f42167b, c43108m, lVar2, lVar3, (Y41.l) objT3, a13, 28104);
        }
        return G0.f406611a;
    }
}
