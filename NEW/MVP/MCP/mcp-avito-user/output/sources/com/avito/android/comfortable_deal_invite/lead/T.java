package com.avito.android.comfortable_deal_invite.lead;

import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.C20529i0;
import androidx.compose.foundation.a2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20608p2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.InterfaceC20640y;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.text.C20973n1;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22078i;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.graphics.f1;
import androidx.compose.ui.i;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.InterfaceC22489j2;
import androidx.compose.ui.platform.Q0;
import androidx.compose.ui.text.C22602e;
import androidx.compose.ui.text.X;
import androidx.compose.ui.text.e0;
import androidx.compose.ui.text.font.C22605a0;
import androidx.compose.ui.text.font.Z;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.akita.compose.component.chips.ChipsDisplayType;
import com.akita.compose.component.input.InputState;
import com.avito.android.R;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Size;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.util.C35829k2;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import zq.C50611c;

/* compiled from: ComfortableDealInviteScreen.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_comfortable-deal-invite_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class T {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final UniversalImage f123626a = new UniversalImage(new Image(P0.g(new kotlin.Q(new Size(220, 160), Uri.parse("https://avito.st/static/ims/0a9331af-58c2-4fbf-9e4e-7d09f5533f60_success_common_220x160.png")), new kotlin.Q(new Size(330, 240), Uri.parse("https://avito.st/static/ims/0a9331af-58c2-4fbf-9e4e-7d09f5533f60_success_common_330x240.png")), new kotlin.Q(new Size(440, 320), Uri.parse("https://avito.st/static/ims/0a9331af-58c2-4fbf-9e4e-7d09f5533f60_success_common_440x320.png")), new kotlin.Q(new Size(660, 480), Uri.parse("https://avito.st/static/ims/0a9331af-58c2-4fbf-9e4e-7d09f5533f60_success_common_660x480.png")), new kotlin.Q(new Size(880, 640), Uri.parse("https://avito.st/static/ims/0a9331af-58c2-4fbf-9e4e-7d09f5533f60_success_common_880x640.png")))), null);

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k C50611c c50611c, @Y61.k InterfaceC43160i interfaceC43160i, @Y61.k Y41.p pVar, @Y61.k Y41.l lVar, @Y61.k Y41.a aVar, @Y61.k Y41.l lVar2, @Y61.k Y41.l lVar3, @Y61.k Y41.l lVar4, @Y61.k Y41.l lVar5, @Y61.k Y41.l lVar6, @Y61.k Y41.l lVar7, @Y61.k Y41.l lVar8, @Y61.k Y41.l lVar9, @Y61.k Y41.l lVar10, @Y61.k Y41.a aVar2, @Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B b12;
        androidx.compose.runtime.B bE2 = a12.E(990940173);
        v.a aVar3 = androidx.compose.ui.v.f42878y1;
        com.akita.compose.component.toast_bar.u uVarA = com.akita.compose.component.toast_bar.w.a(bE2);
        String strC = u0.i.c(bE2, R.string.comfortable_deal_invite_checking_toast_loading_title);
        com.akita.compose.theme.re23.b.f63983a.getClass();
        com.akita.compose.component.toast_bar.J f66804a = com.akita.compose.theme.re23.b.u(bE2).getF66804a();
        String strC2 = u0.i.c(bE2, R.string.comfortable_deal_invite_checking_toast_error_title);
        com.akita.compose.component.toast_bar.J f66806c = com.akita.compose.theme.re23.b.u(bE2).getF66806c();
        androidx.compose.ui.focus.r rVar = (androidx.compose.ui.focus.r) bE2.o(Q0.f41200i);
        InterfaceC22489j2 interfaceC22489j2 = (InterfaceC22489j2) bE2.o(Q0.f41207p);
        C22187u0.g(new Object[]{interfaceC43160i, pVar, aVar, uVarA}, new J(interfaceC43160i, pVar, aVar, uVarA, f66804a, strC, f66806c, strC2, null), bE2);
        if (c50611c.f444281c) {
            b12 = bE2;
        } else {
            b12 = bE2;
            com.akita.compose.component.scaffold.g.a(aVar3, androidx.compose.runtime.internal.r.c(1712325582, new K(c50611c, aVar), bE2), androidx.compose.runtime.internal.r.c(-1011406931, new M(c50611c, aVar2, interfaceC22489j2, rVar), bE2), uVarA, null, null, null, androidx.compose.runtime.internal.r.c(974334437, new O(c50611c, interfaceC22489j2, rVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7, lVar8, lVar9, lVar10, lVar), b12), b12, 12583344, 112);
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new P(c50611c, interfaceC43160i, pVar, lVar, aVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7, lVar8, lVar9, lVar10, aVar2, aVar3, i12);
        }
    }

    public static final void b(InterfaceC20640y interfaceC20640y, androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(-819783332);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(interfaceC20640y) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i13 & 11) == 2 && bE2.c()) {
            bE2.f();
        } else {
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            C20608p2.a(bE2, C20529i0.a(interfaceC20640y.b(androidx.compose.ui.v.f42878y1), 1, com.akita.compose.theme.re23.b.f63984b.f63880R0.c(bE2), androidx.compose.foundation.shape.o.a(12)));
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new r(interfaceC20640y, i12);
        }
    }

    public static final void c(C50611c c50611c, InterfaceC22489j2 interfaceC22489j2, androidx.compose.ui.focus.r rVar, Y41.l lVar, Y41.l lVar2, Y41.l lVar3, Y41.l lVar4, Y41.l lVar5, Y41.l lVar6, Y41.l lVar7, Y41.l lVar8, Y41.l lVar9, Y41.l lVar10, androidx.compose.ui.v vVar, androidx.compose.runtime.A a12, int i12, int i13) {
        androidx.compose.runtime.B bE2 = a12.E(1400667563);
        androidx.compose.ui.v vVarB = a2.b(vVar.d0(C20588k2.f28682c), a2.a(bE2), true, true);
        float f12 = 20;
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        float f13 = 16;
        androidx.compose.ui.v vVarK = R1.k(f13, 0.0f, 2, R1.m(vVarB, 0.0f, f12, 0.0f, f13, 5));
        C20585k.f28659a.getClass();
        C20585k.l lVar11 = C20585k.f28662d;
        InterfaceC22215f.f39074a.getClass();
        androidx.compose.foundation.layout.I iA2 = androidx.compose.foundation.layout.H.a(lVar11, InterfaceC22215f.a.f39088n, bE2, 0);
        int i14 = bE2.f37888Q;
        O1 o1S = bE2.S();
        androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarK);
        InterfaceC22413h.f40789C1.getClass();
        Y41.a<InterfaceC22413h> aVar2 = InterfaceC22413h.a.f40791b;
        if (bE2.f37890b == null) {
            C22190v.b();
            throw null;
        }
        bE2.A();
        if (bE2.f37887P) {
            bE2.b(aVar2);
        } else {
            bE2.d();
        }
        R3.b(InterfaceC22413h.a.f40796g, bE2, iA2);
        R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
        Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i14))) {
            AK.c.y(i14, bE2, i14, pVar);
        }
        R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
        androidx.compose.foundation.layout.K k12 = androidx.compose.foundation.layout.K.f28344a;
        String strC = u0.i.c(bE2, R.string.comfortable_deal_invite_content_title);
        com.akita.compose.theme.re23.b.f63983a.getClass();
        com.akita.compose.theme.re23.i iVar = com.akita.compose.theme.re23.b.f63988f;
        com.akita.compose.foundation.ui.p.b(strC, iVar.f65232c, null, false, 0L, null, 0, 0, false, null, bE2, 0, 1020);
        String strC2 = u0.i.c(bE2, R.string.comfortable_deal_invite_content_description);
        v.a aVar3 = androidx.compose.ui.v.f42878y1;
        com.akita.compose.foundation.ui.p.b(strC2, iVar.f65240k, R1.m(aVar3, 0.0f, 8, 0.0f, 0.0f, 13), false, 0L, null, 0, 0, false, null, bE2, 384, 1016);
        float f14 = 24;
        com.akita.compose.foundation.ui.p.b(u0.i.c(bE2, R.string.comfortable_deal_invite_content_link_input_title), iVar.f65239j, R1.m(aVar3, 0.0f, f14, 0.0f, 0.0f, 13), false, 0L, null, 0, 0, false, null, bE2, 384, 1016);
        String str = c50611c.f444284f;
        com.akita.compose.component.input.v f66388c = com.akita.compose.theme.re23.b.l(bE2).getF66388c();
        float f15 = 12;
        androidx.compose.ui.v vVarM = R1.m(aVar3, 0.0f, f15, 0.0f, 0.0f, 13);
        String strC3 = u0.i.c(bE2, R.string.comfortable_deal_invite_content_link_input_hint);
        PrintableText printableText = c50611c.f444285g;
        com.akita.compose.component.input.u.a(str, f66388c, lVar, vVarM, strC3, false, printableText != null ? InputState.f61669c : InputState.f61668b, null, new C20973n1(new z(interfaceC22489j2, rVar), null, null, null, null, null, 62, null), null, 1, false, 0, null, true, false, false, null, null, null, null, bE2, ((i12 >> 3) & 896) | 3072, 196656, 0, 8353184);
        bE2.C(-1342801451);
        if (printableText != null) {
            com.akita.compose.foundation.ui.p.b(printableText.k0((Context) bE2.o(AndroidCompositionLocals_androidKt.f41069b)), iVar.f65244o, R1.m(aVar3, 0.0f, 6, 0.0f, 0.0f, 13), false, com.akita.compose.theme.re23.b.f63984b.f63880R0.c(bE2), null, 0, 0, false, null, bE2, 384, 1000);
        }
        bE2.X(false);
        com.akita.compose.foundation.ui.p.b(u0.i.c(bE2, R.string.comfortable_deal_invite_content_commission_input_title), iVar.f65239j, R1.m(aVar3, 0.0f, f12, 0.0f, 0.0f, 13), false, 0L, null, 0, 0, false, null, bE2, 384, 1016);
        com.akita.compose.component.input.v f66388c2 = com.akita.compose.theme.re23.b.l(bE2).getF66388c();
        androidx.compose.ui.v vVarM2 = R1.m(aVar3, 0.0f, f15, 0.0f, 0.0f, 13);
        String strC4 = u0.i.c(bE2, R.string.comfortable_deal_invite_content_commission_input_hint);
        boolean z12 = c50611c.f444287i;
        com.akita.compose.component.input.u.a(c50611c.f444286h, f66388c2, lVar2, vVarM2, strC4, false, z12 ? InputState.f61669c : InputState.f61668b, null, new C20973n1(new A(interfaceC22489j2, rVar), null, null, null, null, null, 62, null), null, 1, false, 0, null, true, false, false, null, null, null, null, bE2, ((i12 >> 6) & 896) | 3072, 196656, 0, 8353184);
        bE2.C(-1342761587);
        if (z12) {
            com.akita.compose.foundation.ui.p.b(u0.i.c(bE2, R.string.comfortable_deal_invite_content_empty_input_error), iVar.f65244o, R1.m(aVar3, 0.0f, 6, 0.0f, 0.0f, 13), false, com.akita.compose.theme.re23.b.f63984b.f63880R0.c(bE2), null, 0, 0, false, null, bE2, 384, 1000);
        }
        bE2.X(false);
        com.akita.compose.foundation.ui.p.b(u0.i.c(bE2, R.string.comfortable_deal_invite_content_contract_signed_title), iVar.f65239j, R1.m(aVar3, 0.0f, f12, 0.0f, 0.0f, 13), false, 0L, null, 0, 0, false, null, bE2, 384, 1016);
        String strC5 = u0.i.c(bE2, R.string.comfortable_deal_invite_content_contract_signed_yes);
        Boolean bool = Boolean.TRUE;
        Boolean bool2 = c50611c.f444288j;
        C29496a c29496a = new C29496a(strC5, kotlin.jvm.internal.L.f(bool2, bool), false, 4, null);
        String strC6 = u0.i.c(bE2, R.string.comfortable_deal_invite_content_contract_signed_no);
        Boolean bool3 = Boolean.FALSE;
        List listU = C42745f0.U(c29496a, new C29496a(strC6, kotlin.jvm.internal.L.f(bool2, bool3), false, 4, null));
        float f16 = 6;
        com.akita.compose.component.chips.y yVarB = com.akita.compose.component.chips.y.b(com.akita.compose.theme.re23.b.d(bE2).getF66004M(), f16, null, null, 30);
        ChipsDisplayType chipsDisplayType = ChipsDisplayType.f60863d;
        com.akita.compose.component.chips.d.b(listU, yVarB, chipsDisplayType, new B(lVar3, interfaceC22489j2, rVar), R1.m(aVar3, 0.0f, f15, 0.0f, 0.0f, 13), androidx.compose.runtime.internal.r.c(-1620395662, new C(c50611c), bE2), null, bE2, 221632, 64);
        com.akita.compose.foundation.ui.p.b(u0.i.c(bE2, R.string.comfortable_deal_invite_content_minor_owners_title), iVar.f65239j, R1.m(aVar3, 0.0f, f12, 0.0f, 0.0f, 13), false, 0L, null, 0, 0, false, null, bE2, 384, 1016);
        String strC7 = u0.i.c(bE2, R.string.comfortable_deal_invite_content_minor_owners_yes);
        Boolean bool4 = c50611c.f444290l;
        com.akita.compose.component.chips.d.b(C42745f0.U(new C29496a(strC7, kotlin.jvm.internal.L.f(bool4, bool), false, 4, null), new C29496a(u0.i.c(bE2, R.string.comfortable_deal_invite_content_minor_owners_no), kotlin.jvm.internal.L.f(bool4, bool3), false, 4, null)), com.akita.compose.component.chips.y.b(com.akita.compose.theme.re23.b.d(bE2).getF66004M(), f16, null, null, 30), chipsDisplayType, new D(lVar4, interfaceC22489j2, rVar), R1.m(aVar3, 0.0f, f15, 0.0f, 0.0f, 13), androidx.compose.runtime.internal.r.c(680448411, new E(c50611c), bE2), null, bE2, 221632, 64);
        com.akita.compose.foundation.ui.p.b(u0.i.c(bE2, R.string.comfortable_deal_invite_content_restrictions_title), iVar.f65239j, R1.m(aVar3, 0.0f, f12, 0.0f, 0.0f, 13), false, 0L, null, 0, 0, false, null, bE2, 384, 1016);
        String strC8 = u0.i.c(bE2, R.string.comfortable_deal_invite_content_restrictions_yes);
        Boolean bool5 = c50611c.f444292n;
        com.akita.compose.component.chips.d.b(C42745f0.U(new C29496a(strC8, kotlin.jvm.internal.L.f(bool5, bool), false, 4, null), new C29496a(u0.i.c(bE2, R.string.comfortable_deal_invite_content_restrictions_no), kotlin.jvm.internal.L.f(bool5, bool3), false, 4, null)), com.akita.compose.component.chips.y.b(com.akita.compose.theme.re23.b.d(bE2).getF66004M(), f16, null, null, 30), chipsDisplayType, new F(lVar5, interfaceC22489j2, rVar), R1.m(aVar3, 0.0f, f15, 0.0f, 0.0f, 13), androidx.compose.runtime.internal.r.c(-1787019846, new G(c50611c), bE2), null, bE2, 221632, 64);
        com.akita.compose.foundation.ui.p.b(u0.i.c(bE2, R.string.comfortable_deal_invite_content_responsible_agent_input_title), iVar.f65239j, R1.m(aVar3, 0.0f, f12, 0.0f, 0.0f, 13), false, 0L, null, 0, 0, false, null, bE2, 384, 1016);
        com.akita.compose.component.input.v f66388c3 = com.akita.compose.theme.re23.b.l(bE2).getF66388c();
        androidx.compose.ui.v vVarM3 = R1.m(aVar3, 0.0f, f15, 0.0f, 0.0f, 13);
        String strC9 = u0.i.c(bE2, R.string.comfortable_deal_invite_content_responsible_agent_input_hint);
        boolean z13 = c50611c.f444295q;
        com.akita.compose.component.input.u.a(c50611c.f444294p, f66388c3, lVar6, vVarM3, strC9, false, z13 ? InputState.f61669c : InputState.f61668b, null, new C20973n1(new H(interfaceC22489j2, rVar), null, null, null, null, null, 62, null), null, 1, false, 0, null, true, false, false, null, null, null, null, bE2, ((i12 >> 18) & 896) | 3072, 196656, 0, 8353184);
        bE2.C(-1342594258);
        if (z13) {
            com.akita.compose.foundation.ui.p.b(u0.i.c(bE2, R.string.comfortable_deal_invite_content_empty_input_error), iVar.f65244o, R1.m(aVar3, 0.0f, f16, 0.0f, 0.0f, 13), false, com.akita.compose.theme.re23.b.f63984b.f63880R0.c(bE2), null, 0, 0, false, null, bE2, 384, 1000);
        }
        bE2.X(false);
        com.akita.compose.foundation.ui.p.b(u0.i.c(bE2, R.string.comfortable_deal_invite_content_comment_input_title), iVar.f65239j, R1.m(aVar3, 0.0f, f12, 0.0f, 0.0f, 13), false, 0L, null, 0, 0, false, null, bE2, 384, 1016);
        com.akita.compose.component.input.u.b(c50611c.f444296r, com.akita.compose.theme.re23.b.l(bE2).getF66388c(), lVar7, R1.m(aVar3, 0.0f, f15, 0.0f, 0.0f, 13), u0.i.c(bE2, R.string.comfortable_deal_invite_content_comment_input_hint), false, InputState.f61668b, false, null, new C20973n1(new C29513s(interfaceC22489j2, rVar), null, null, null, null, null, 62, null), null, 5, false, 0, null, null, null, null, bE2, ((i12 >> 21) & 896) | 1575936, 48, 259488);
        com.akita.compose.component.list_item.m.d(u0.i.c(bE2, R.string.comfortable_deal_invite_content_call_confirm), com.akita.compose.theme.re23.b.m(bE2).getF66432c(), R1.m(aVar3, 0.0f, f14, 0.0f, 0.0f, 13), null, androidx.compose.runtime.internal.r.c(1862759251, new C29515u(c50611c, lVar8, interfaceC22489j2, rVar), bE2), null, bE2, 24960, 40);
        String strC10 = u0.i.c(bE2, R.string.comfortable_deal_invite_content_terms_confirm_first_part);
        String strC11 = u0.i.c(bE2, R.string.comfortable_deal_invite_content_terms_confirm_second_part);
        String strC12 = u0.i.c(bE2, R.string.comfortable_deal_invite_content_terms_confirm_link);
        C22602e.b bVar = new C22602e.b(0, 1, null);
        bVar.f(strC10);
        bVar.f(" ");
        androidx.compose.ui.text.style.j.f42684b.getClass();
        int iL2 = bVar.l(new e0(0L, 0L, (androidx.compose.ui.text.font.e0) null, (Z) null, (C22605a0) null, (androidx.compose.ui.text.font.E) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.n) null, (z0.f) null, 0L, androidx.compose.ui.text.style.j.f42686d, (f1) null, (X) null, (androidx.compose.ui.graphics.drawscope.j) null, 61439, (C42822w) null));
        try {
            bVar.j("CLICKABLE_TAG", strC12);
            bVar.f(strC11);
            bVar.g();
            G0 g02 = G0.f406611a;
            bVar.h(iL2);
            com.akita.compose.component.list_item.m.c(com.akita.compose.theme.re23.b.m(bE2).getF66432c(), null, null, androidx.compose.runtime.internal.r.c(582830365, new w(c50611c, lVar9, interfaceC22489j2, rVar), bE2), null, androidx.compose.runtime.internal.r.c(-452205221, new y(lVar10, bVar.m()), bE2), bE2, 199680, 22);
            bE2.X(true);
            C22039c2 c22039c2Z = bE2.Z();
            if (c22039c2Z != null) {
                c22039c2Z.f38184d = new I(c50611c, interfaceC22489j2, rVar, lVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7, lVar8, lVar9, lVar10, vVar, i12, i13);
            }
        } catch (Throwable th2) {
            bVar.h(iL2);
            throw th2;
        }
    }

    public static final void d(androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(2027846777);
        if (i12 == 0 && bE2.c()) {
            bE2.f();
        } else {
            v.a aVar = androidx.compose.ui.v.f42878y1;
            FillElement fillElement = C20588k2.f28682c;
            aVar.getClass();
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(new androidx.compose.ui.i(0.0f, -0.3f), false);
            int i13 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, fillElement);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar2 = InterfaceC22413h.a.f40791b;
            InterfaceC22078i<?> interfaceC22078i = bE2.f37890b;
            if (interfaceC22078i == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar2);
            } else {
                bE2.d();
            }
            Y41.p<InterfaceC22413h, InterfaceC22365i0, G0> pVar = InterfaceC22413h.a.f40796g;
            R3.b(pVar, bE2, interfaceC22365i0D);
            Y41.p<InterfaceC22413h, androidx.compose.runtime.U, G0> pVar2 = InterfaceC22413h.a.f40795f;
            R3.b(pVar2, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, G0> pVar3 = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i13))) {
                AK.c.y(i13, bE2, i13, pVar3);
            }
            Y41.p<InterfaceC22413h, androidx.compose.ui.v, G0> pVar4 = InterfaceC22413h.a.f40793d;
            R3.b(pVar4, bE2, vVarC);
            C20644z c20644z = C20644z.f28804a;
            h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
            androidx.compose.ui.v vVarI = R1.i(aVar, 26);
            InterfaceC22215f.f39074a.getClass();
            i.a aVar4 = InterfaceC22215f.a.f39089o;
            C20585k.f28659a.getClass();
            androidx.compose.foundation.layout.I iA2 = androidx.compose.foundation.layout.H.a(C20585k.f28662d, aVar4, bE2, 48);
            int i14 = bE2.f37888Q;
            O1 o1S2 = bE2.S();
            androidx.compose.ui.v vVarC2 = androidx.compose.ui.n.c(bE2, vVarI);
            if (interfaceC22078i == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar2);
            } else {
                bE2.d();
            }
            R3.b(pVar, bE2, iA2);
            R3.b(pVar2, bE2, o1S2);
            if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar3);
            }
            R3.b(pVar4, bE2, vVarC2);
            androidx.compose.foundation.layout.K k12 = androidx.compose.foundation.layout.K.f28344a;
            Image imageDependsOnThemeOrDefault = UniversalImageKt.getImageDependsOnThemeOrDefault(f123626a, com.avito.android.lib.util.darkTheme.c.b((Context) bE2.o(AndroidCompositionLocals_androidKt.f41069b)));
            bE2.C(-1737965549);
            if (imageDependsOnThemeOrDefault != null) {
                androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) bE2.o(Q0.f41199h);
                float f12 = 220;
                float f13 = 160;
                coil.compose.v.b(C35829k2.b(imageDependsOnThemeOrDefault, kotlin.math.b.b(dVar.M0(f12)), kotlin.math.b.b(dVar.M0(f13)), 0.0f, 1, 44).c(Q.f123624b), null, C20588k2.q(aVar, f12, f13), null, null, null, bE2, 440, 4088);
            }
            bE2.X(false);
            String strC = u0.i.c(bE2, R.string.comfortable_deal_invite_final_success_title);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.i iVar = com.akita.compose.theme.re23.b.f63988f;
            com.akita.compose.foundation.r rVar = iVar.f65232c;
            androidx.compose.ui.v vVarM = R1.m(aVar, 0.0f, 16, 0.0f, 0.0f, 13);
            androidx.compose.ui.text.style.i.f42675b.getClass();
            int i15 = androidx.compose.ui.text.style.i.f42678e;
            com.akita.compose.foundation.ui.p.b(strC, rVar, vVarM, false, 0L, androidx.compose.ui.text.style.i.a(i15), 0, 0, false, null, bE2, 384, 984);
            com.akita.compose.foundation.ui.p.b(u0.i.c(bE2, R.string.comfortable_deal_invite_final_success_description), iVar.f65240k, R1.m(aVar, 0.0f, 6, 0.0f, 0.0f, 13), false, 0L, androidx.compose.ui.text.style.i.a(i15), 0, 0, false, null, bE2, 384, 984);
            bE2.X(true);
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new S(i12);
        }
    }
}
