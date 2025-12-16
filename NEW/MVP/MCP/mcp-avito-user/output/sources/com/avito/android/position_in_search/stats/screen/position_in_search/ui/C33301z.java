package com.avito.android.position_in_search.stats.screen.position_in_search.ui;

import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.i;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import c90.InterfaceC26960a;
import c90.c;
import com.avito.android.position_in_search.stats.screen.position_in_search.domain.model.ActionButton;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;

/* compiled from: PositionInSearchFooter.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/J;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/J;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.position_in_search.stats.screen.position_in_search.ui.z, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C33301z extends kotlin.jvm.internal.N implements Y41.q<androidx.compose.foundation.layout.J, androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c.d f221752l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC26960a, G0> f221753m;

    /* compiled from: PositionInSearchFooter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.position_in_search.stats.screen.position_in_search.ui.z$a */
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[ActionButton.Style.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ActionButton.Style style = ActionButton.Style.f221440b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C33301z(c.d dVar, Y41.l<? super InterfaceC26960a, G0> lVar) {
        super(3);
        this.f221752l = dVar;
        this.f221753m = lVar;
    }

    @Override // Y41.q
    public final G0 invoke(androidx.compose.foundation.layout.J j12, androidx.compose.runtime.A a12, Integer num) {
        com.akita.compose.component.button.t tVarF2;
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 81) == 16 && a13.c()) {
            a13.f();
        } else {
            v.a aVar = androidx.compose.ui.v.f42878y1;
            androidx.compose.ui.v vVarD = C20588k2.d(aVar, 1.0f);
            C20585k.f28659a.getClass();
            C20585k.l lVar = C20585k.f28662d;
            InterfaceC22215f.f39074a.getClass();
            i.a aVar2 = InterfaceC22215f.a.f39088n;
            androidx.compose.foundation.layout.I iA2 = androidx.compose.foundation.layout.H.a(lVar, aVar2, a13, 0);
            int f37888q = a13.getF37888Q();
            O1 o1Y = a13.y();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(a13, vVarD);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar3 = InterfaceC22413h.a.f40791b;
            if (a13.F() == null) {
                C22190v.b();
                throw null;
            }
            a13.A();
            if (a13.getF37887P()) {
                a13.b(aVar3);
            } else {
                a13.d();
            }
            Y41.p<InterfaceC22413h, InterfaceC22365i0, G0> pVar = InterfaceC22413h.a.f40796g;
            R3.b(pVar, a13, iA2);
            Y41.p<InterfaceC22413h, androidx.compose.runtime.U, G0> pVar2 = InterfaceC22413h.a.f40795f;
            R3.b(pVar2, a13, o1Y);
            Y41.p<InterfaceC22413h, Integer, G0> pVar3 = InterfaceC22413h.a.f40799j;
            if (a13.getF37887P() || !kotlin.jvm.internal.L.f(a13.t(), Integer.valueOf(f37888q))) {
                androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar3);
            }
            Y41.p<InterfaceC22413h, androidx.compose.ui.v, G0> pVar4 = InterfaceC22413h.a.f40793d;
            R3.b(pVar4, a13, vVarC);
            androidx.compose.foundation.layout.K k12 = androidx.compose.foundation.layout.K.f28344a;
            androidx.compose.ui.v vVarD2 = C20588k2.d(aVar, 1.0f);
            float f12 = 6;
            h.a aVar4 = androidx.compose.ui.unit.h.f42849c;
            androidx.compose.ui.v vVarM = R1.m(vVarD2, f12, f12, 0.0f, 0.0f, 12);
            C20568f2 c20568f2A = C20563e2.a(C20585k.f28660b, InterfaceC22215f.a.f39086l, a13, 48);
            int f37888q2 = a13.getF37888Q();
            O1 o1Y2 = a13.y();
            androidx.compose.ui.v vVarC2 = androidx.compose.ui.n.c(a13, vVarM);
            if (a13.F() == null) {
                C22190v.b();
                throw null;
            }
            a13.A();
            if (a13.getF37887P()) {
                a13.b(aVar3);
            } else {
                a13.d();
            }
            R3.b(pVar, a13, c20568f2A);
            R3.b(pVar2, a13, o1Y2);
            if (a13.getF37887P() || !kotlin.jvm.internal.L.f(a13.t(), Integer.valueOf(f37888q2))) {
                androidx.appcompat.app.r.B(f37888q2, a13, f37888q2, pVar3);
            }
            R3.b(pVar4, a13, vVarC2);
            C20576h2 c20576h2 = C20576h2.f28641a;
            c.d dVar = this.f221752l;
            B.b(dVar.f57736a, a13, 8);
            androidx.compose.ui.v vVarM2 = R1.m(C20588k2.d(aVar, 1.0f), 8, 0.0f, 0.0f, 0.0f, 14);
            androidx.compose.foundation.layout.I iA3 = androidx.compose.foundation.layout.H.a(lVar, aVar2, a13, 0);
            int f37888q3 = a13.getF37888Q();
            O1 o1Y3 = a13.y();
            androidx.compose.ui.v vVarC3 = androidx.compose.ui.n.c(a13, vVarM2);
            if (a13.F() == null) {
                C22190v.b();
                throw null;
            }
            a13.A();
            if (a13.getF37887P()) {
                a13.b(aVar3);
            } else {
                a13.d();
            }
            R3.b(pVar, a13, iA3);
            R3.b(pVar2, a13, o1Y3);
            if (a13.getF37887P() || !kotlin.jvm.internal.L.f(a13.t(), Integer.valueOf(f37888q3))) {
                androidx.appcompat.app.r.B(f37888q3, a13, f37888q3, pVar3);
            }
            R3.b(pVar4, a13, vVarC3);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.i iVar = com.akita.compose.theme.re23.b.f63988f;
            com.akita.compose.foundation.r rVar = iVar.f65242m;
            androidx.compose.ui.v vVarA = C22501m2.a(aVar, "footer_price");
            androidx.compose.ui.text.style.s.f42720b.getClass();
            int i12 = androidx.compose.ui.text.style.s.f42722d;
            com.akita.compose.foundation.ui.p.b(dVar.f57737b, rVar, vVarA, false, 0L, null, 1, i12, false, null, a13, 14156160, 824);
            com.akita.compose.foundation.ui.p.b(dVar.f57738c, iVar.f65245p, C22501m2.a(aVar, "footer_title"), false, 0L, null, 1, i12, false, null, a13, 14156160, 824);
            a13.z();
            a13.z();
            a13.C(1163883173);
            ArrayList arrayList = dVar.f57739d;
            if (!arrayList.isEmpty()) {
                float f13 = 1.0f;
                androidx.compose.ui.v vVarM3 = R1.m(C20588k2.d(aVar, 1.0f), 0.0f, 12, 0.0f, 0.0f, 13);
                C20568f2 c20568f2A2 = C20563e2.a(C20585k.g(f12), InterfaceC22215f.a.f39085k, a13, 6);
                int f37888q4 = a13.getF37888Q();
                O1 o1Y4 = a13.y();
                androidx.compose.ui.v vVarC4 = androidx.compose.ui.n.c(a13, vVarM3);
                if (a13.F() == null) {
                    C22190v.b();
                    throw null;
                }
                a13.A();
                if (a13.getF37887P()) {
                    a13.b(aVar3);
                } else {
                    a13.d();
                }
                R3.b(pVar, a13, c20568f2A2);
                R3.b(pVar2, a13, o1Y4);
                if (a13.getF37887P() || !kotlin.jvm.internal.L.f(a13.t(), Integer.valueOf(f37888q4))) {
                    androidx.appcompat.app.r.B(f37888q4, a13, f37888q4, pVar3);
                }
                R3.b(pVar4, a13, vVarC4);
                a13.C(456683630);
                int i13 = 0;
                for (Object obj : arrayList) {
                    int i14 = i13 + 1;
                    if (i13 < 0) {
                        C42745f0.H0();
                        throw null;
                    }
                    ActionButton actionButton = (ActionButton) obj;
                    String str = actionButton.f221437a;
                    C33300y c33300y = new C33300y(this.f221753m, actionButton);
                    int iOrdinal = actionButton.f221439c.ordinal();
                    if (iOrdinal == 0) {
                        a13.C(1148856557);
                        com.akita.compose.theme.re23.b.f63983a.getClass();
                        tVarF2 = com.akita.compose.theme.re23.b.c(a13).f2();
                        a13.h();
                    } else {
                        if (iOrdinal != 1) {
                            a13.C(1148724577);
                            a13.h();
                            throw new NoWhenBranchMatchedException();
                        }
                        a13.C(1148859567);
                        com.akita.compose.theme.re23.b.f63983a.getClass();
                        tVarF2 = com.akita.compose.theme.re23.b.c(a13).M();
                        a13.h();
                    }
                    com.akita.compose.component.button.m.c(str, c33300y, tVarF2, com.avito.android.bxcontent.mvi.entity.f.d(i13, c20576h2.a(androidx.compose.ui.v.f42878y1, f13, true), "footer_button"), null, null, null, false, false, null, a13, 512, 1008);
                    f13 = f13;
                    i13 = i14;
                }
                a13.h();
                a13.z();
            }
            a13.h();
            a13.z();
        }
        return G0.f406611a;
    }
}
