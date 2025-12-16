package com.avito.android.iac_dialer_ui.pub.finished_call_screens.feedback_screen;

import Y41.p;
import androidx.appcompat.app.r;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.U;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.graphics.Y0;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.R;
import com.avito.android.iac_dialer_ui.pub.call_screen.content.e0;
import com.avito.android.iac_dialer_ui.pub.finished_call_screens.feedback_screen.feedback_bottom_sheet.IacUIFeedbackBottomSheetState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.channels.C43108m;

/* compiled from: IacUIFinishedFeedbackScreen.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class h extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ v f167622l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ n f167623m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C43108m f167624n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ N f167625o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Integer, G0> f167626p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ N f167627q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Integer, G0> f167628r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ N f167629s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h(v vVar, n nVar, C43108m c43108m, Y41.l lVar, Y41.l lVar2, Y41.l lVar3, Y41.l lVar4, Y41.a aVar) {
        super(2);
        this.f167622l = vVar;
        this.f167623m = nVar;
        this.f167624n = c43108m;
        this.f167625o = (N) lVar;
        this.f167626p = lVar2;
        this.f167627q = (N) lVar3;
        this.f167628r = lVar4;
        this.f167629s = (N) aVar;
    }

    /* JADX WARN: Type inference failed for: r1v17, types: [Y41.a, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r3v10, types: [Y41.l, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r5v8, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            v vVarD0 = this.f167622l.d0(C20588k2.f28682c);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.b.f63987e.getClass();
            com.akita.compose.theme.re23.semantic.b.f65954b.c().getClass();
            v vVarA = C22501m2.a(androidx.compose.foundation.A.b(vVarD0, X2.b.f18125d.c(a13), Y0.f39346a), "IacUIFinishedFeedbackScreenTestTags.ROOT");
            C20585k.f28659a.getClass();
            C20585k.l lVar = C20585k.f28662d;
            InterfaceC22215f.f39074a.getClass();
            I iA2 = H.a(lVar, InterfaceC22215f.a.f39088n, a13, 0);
            int f37888q = a13.getF37888Q();
            O1 o1Y = a13.y();
            v vVarC = androidx.compose.ui.n.c(a13, vVarA);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar = InterfaceC22413h.a.f40791b;
            if (a13.F() == null) {
                C22190v.b();
                throw null;
            }
            a13.A();
            if (a13.getF37887P()) {
                a13.b(aVar);
            } else {
                a13.d();
            }
            p<InterfaceC22413h, InterfaceC22365i0, G0> pVar = InterfaceC22413h.a.f40796g;
            R3.b(pVar, a13, iA2);
            p<InterfaceC22413h, U, G0> pVar2 = InterfaceC22413h.a.f40795f;
            R3.b(pVar2, a13, o1Y);
            p<InterfaceC22413h, Integer, G0> pVar3 = InterfaceC22413h.a.f40799j;
            if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q))) {
                r.B(f37888q, a13, f37888q, pVar3);
            }
            p<InterfaceC22413h, v, G0> pVar4 = InterfaceC22413h.a.f40793d;
            R3.b(pVar4, a13, vVarC);
            K k12 = K.f28344a;
            v.a aVar2 = v.f42878y1;
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
            int f37888q2 = a13.getF37888Q();
            O1 o1Y2 = a13.y();
            v vVarC2 = androidx.compose.ui.n.c(a13, aVar2);
            if (a13.F() == null) {
                C22190v.b();
                throw null;
            }
            a13.A();
            if (a13.getF37887P()) {
                a13.b(aVar);
            } else {
                a13.d();
            }
            R3.b(pVar, a13, interfaceC22365i0D);
            R3.b(pVar2, a13, o1Y2);
            if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q2))) {
                r.B(f37888q2, a13, f37888q2, pVar3);
            }
            R3.b(pVar4, a13, vVarC2);
            C20644z c20644z = C20644z.f28804a;
            n nVar = this.f167623m;
            com.avito.android.iac_dialer_ui.pub.common_ui.n.a(nVar.f167641a, e0.a(aVar2), a13, 0, 0);
            h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
            com.akita.compose.component.close_button.b.a(this.f167629s, com.akita.compose.theme.re23.b.e(a13).getF66093g(), R1.m(c20644z.d(C22501m2.a(aVar2, "IacUIFinishedFeedbackScreenTestTags.CLOSE_BUTTON"), InterfaceC22215f.a.f39081g), 0.0f, 0.0f, 24, 0.0f, 11), false, null, null, a13, 0, 56);
            a13.z();
            com.akita.compose.foundation.ui.g.a(40, null, a13, 6);
            com.avito.android.iac_dialer_ui.pub.common_ui.j.a(nVar.f167642b, g.f167621l, e0.a(aVar2), a13, 48, 0);
            com.akita.compose.foundation.ui.g.a(120, null, a13, 6);
            v vVarA2 = e0.a(aVar2);
            String strC = u0.i.c(a13, R.string.iac_dialer_ui_public___finished_feedback___rating_header);
            androidx.compose.ui.text.style.i.f42675b.getClass();
            com.akita.compose.foundation.ui.p.b(strC, com.akita.compose.theme.re23.b.f63988f.f65234e, vVarA2, false, 0L, androidx.compose.ui.text.style.i.a(androidx.compose.ui.text.style.i.f42678e), 0, 0, false, null, a13, 0, 984);
            com.akita.compose.foundation.ui.g.a(18, null, a13, 6);
            boolean z12 = nVar.f167644d;
            Integer num2 = nVar.f167643c;
            com.avito.android.iac_dialer_ui.pub.finished_call_screens.feedback_screen.rating.g.b(new com.avito.android.iac_dialer_ui.pub.finished_call_screens.feedback_screen.rating.i(z12, num2), this.f167628r, e0.a(aVar2), "IacUIFinishedFeedbackScreenTestTags.SCREEN_RATING_PREFIX", a13, 3072, 0);
            a13.z();
            com.avito.android.iac_dialer_ui.pub.finished_call_screens.feedback_screen.feedback_bottom_sheet.A.a(new IacUIFeedbackBottomSheetState(num2, z12, nVar.f167645e, nVar.f167646f), this.f167624n, this.f167625o, this.f167626p, this.f167627q, a13, 72);
        }
        return G0.f406611a;
    }
}
