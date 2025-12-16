package com.avito.android.tariff_lf_publication.level.ui;

import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.R;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: TariffLfPublicationLevelHeader.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_tariff-lf-publication_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class n {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k String str, @Y61.l AttributedText attributedText, @Y61.k Y41.l lVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        boolean z12;
        v.a aVar;
        androidx.compose.runtime.B b12;
        androidx.compose.runtime.B bE2 = a12.E(-1642680067);
        v.a aVar2 = androidx.compose.ui.v.f42878y1;
        float f12 = 16;
        h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
        float f13 = 12;
        androidx.compose.ui.v vVarM = R1.m(aVar2, f12, f13, f12, 0.0f, 8);
        C20585k.f28659a.getClass();
        C20585k.l lVar2 = C20585k.f28662d;
        InterfaceC22215f.f39074a.getClass();
        I iA2 = H.a(lVar2, InterfaceC22215f.a.f39088n, bE2, 0);
        int i13 = bE2.f37888Q;
        O1 o1S = bE2.S();
        androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarM);
        InterfaceC22413h.f40789C1.getClass();
        Y41.a<InterfaceC22413h> aVar4 = InterfaceC22413h.a.f40791b;
        if (bE2.f37890b == null) {
            C22190v.b();
            throw null;
        }
        bE2.A();
        if (bE2.f37887P) {
            bE2.b(aVar4);
        } else {
            bE2.d();
        }
        R3.b(InterfaceC22413h.a.f40796g, bE2, iA2);
        R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
        Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i13))) {
            AK.c.y(i13, bE2, i13, pVar);
        }
        R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
        K k12 = K.f28344a;
        com.akita.compose.theme.re23.b.f63983a.getClass();
        com.akita.compose.foundation.ui.p.b(str, com.akita.compose.theme.re23.b.f63988f.f65232c, C22501m2.a(aVar2, "header_title"), false, 0L, null, 0, 0, false, null, bE2, (i12 & 14) | 384, 1016);
        bE2.C(463344916);
        if (attributedText == null) {
            z12 = false;
            aVar = aVar2;
            b12 = bE2;
        } else {
            z12 = false;
            aVar = aVar2;
            b12 = bE2;
            com.avito.android.lib.compose.design.component.attributedtext.a.b(attributedText, C22501m2.a(R1.m(aVar2, 0.0f, f13, 0.0f, 0.0f, 13), "header_description"), R.attr.textM10, null, new l(lVar, attributedText), 0, bE2, 56, 40);
        }
        C22039c2 c22039c2N = com.avito.android.actions_sheet.a.n(b12, z12, true);
        if (c22039c2N != null) {
            c22039c2N.f38184d = new m(i12, lVar, aVar, attributedText, str);
        }
    }
}
