package com.avito.android.vas_performance.screens.stickers.edit.ui.compose.items;

import Y41.p;
import androidx.appcompat.app.r;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.U;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.i;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.R;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: StickersEditChangesBlock.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class a extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Image f320873l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f320874m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AttributedText f320875n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Image image, String str, AttributedText attributedText) {
        super(2);
        this.f320873l = image;
        this.f320874m = str;
        this.f320875n = attributedText;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        C20576h2 c20576h2;
        p<InterfaceC22413h, v, G0> pVar;
        p<InterfaceC22413h, Integer, G0> pVar2;
        p<InterfaceC22413h, U, G0> pVar3;
        p<InterfaceC22413h, InterfaceC22365i0, G0> pVar4;
        Y41.a<InterfaceC22413h> aVar;
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            InterfaceC22215f.f39074a.getClass();
            i.b bVar = InterfaceC22215f.a.f39085k;
            C20585k c20585k = C20585k.f28659a;
            h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
            c20585k.getClass();
            C20585k.j jVarG = C20585k.g(16);
            v.a aVar3 = v.f42878y1;
            C20568f2 c20568f2A = C20563e2.a(jVarG, bVar, a13, 54);
            int f37888q = a13.getF37888Q();
            O1 o1Y = a13.y();
            v vVarC = androidx.compose.ui.n.c(a13, aVar3);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar4 = InterfaceC22413h.a.f40791b;
            if (a13.F() == null) {
                C22190v.b();
                throw null;
            }
            a13.A();
            if (a13.getF37887P()) {
                a13.b(aVar4);
            } else {
                a13.d();
            }
            p<InterfaceC22413h, InterfaceC22365i0, G0> pVar5 = InterfaceC22413h.a.f40796g;
            R3.b(pVar5, a13, c20568f2A);
            p<InterfaceC22413h, U, G0> pVar6 = InterfaceC22413h.a.f40795f;
            R3.b(pVar6, a13, o1Y);
            p<InterfaceC22413h, Integer, G0> pVar7 = InterfaceC22413h.a.f40799j;
            if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q))) {
                r.B(f37888q, a13, f37888q, pVar7);
            }
            p<InterfaceC22413h, v, G0> pVar8 = InterfaceC22413h.a.f40793d;
            R3.b(pVar8, a13, vVarC);
            C20576h2 c20576h22 = C20576h2.f28641a;
            a13.C(1951257986);
            Image image = this.f320873l;
            if (image != null) {
                float f12 = 48;
                c20576h2 = c20576h22;
                pVar = pVar8;
                pVar2 = pVar7;
                pVar3 = pVar6;
                pVar4 = pVar5;
                aVar = aVar4;
                com.avito.android.mnz_common.compose.i.a(image, f12, f12, "StickersEditChangesBlockIconTestTag", C20588k2.o(aVar3, f12), com.avito.android.mnz_common.compose.i.c(a13), null, null, null, a13, 290232, 448);
            } else {
                c20576h2 = c20576h22;
                pVar = pVar8;
                pVar2 = pVar7;
                pVar3 = pVar6;
                pVar4 = pVar5;
                aVar = aVar4;
            }
            a13.h();
            C20585k.c cVar = C20585k.f28664f;
            v vVarA = c20576h2.a(aVar3, 1.0f, true);
            I iA2 = H.a(cVar, InterfaceC22215f.a.f39088n, a13, 6);
            int f37888q2 = a13.getF37888Q();
            O1 o1Y2 = a13.y();
            v vVarC2 = androidx.compose.ui.n.c(a13, vVarA);
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
            R3.b(pVar4, a13, iA2);
            R3.b(pVar3, a13, o1Y2);
            if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q2))) {
                r.B(f37888q2, a13, f37888q2, pVar2);
            }
            R3.b(pVar, a13, vVarC2);
            K k12 = K.f28344a;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.foundation.ui.p.b(this.f320874m, com.akita.compose.theme.re23.b.f63988f.f65236g, C22501m2.a(aVar3, "StickersEditChangesBlockTitleTestTag"), false, 0L, null, 0, 0, false, null, a13, 384, 1016);
            a13.C(1646206890);
            AttributedText attributedText = this.f320875n;
            if (attributedText != null) {
                com.akita.compose.foundation.ui.g.a(2, null, a13, 6);
                com.avito.android.lib.compose.design.component.attributedtext.a.b(attributedText, C22501m2.a(aVar3, "StickersEditChangesBlockDescriptionTestTag"), R.attr.textH25, null, null, 0, a13, 56, 56);
            }
            a13.h();
            a13.z();
            a13.z();
        }
        return G0.f406611a;
    }
}
