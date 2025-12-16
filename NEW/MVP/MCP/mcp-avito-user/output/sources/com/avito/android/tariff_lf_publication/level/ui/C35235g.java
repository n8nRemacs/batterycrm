package com.avito.android.tariff_lf_publication.level.ui;

import UD0.c;
import androidx.compose.foundation.C21086w0;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
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
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: TariffLfPublicationLevelFeature.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_tariff-lf-publication_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.tariff_lf_publication.level.ui.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35235g {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v8 */
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k c.b.a aVar, @Y61.k Y41.l lVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        int i13;
        boolean z12;
        boolean z13;
        androidx.compose.runtime.B bE2 = a12.E(1439072103);
        v.a aVar2 = androidx.compose.ui.v.f42878y1;
        float f12 = 16;
        h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
        androidx.compose.ui.v vVarC = C21086w0.c(R1.m(aVar2, f12, 10, f12, 0.0f, 8), aVar.f16295d != null, null, null, new C35233e(aVar, lVar), 6);
        C20585k.f28659a.getClass();
        C20585k.C1589k c1589k = C20585k.f28660b;
        InterfaceC22215f.f39074a.getClass();
        C20568f2 c20568f2A = C20563e2.a(c1589k, InterfaceC22215f.a.f39085k, bE2, 0);
        int i14 = bE2.f37888Q;
        O1 o1S = bE2.S();
        androidx.compose.ui.v vVarC2 = androidx.compose.ui.n.c(bE2, vVarC);
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
        R3.b(InterfaceC22413h.a.f40796g, bE2, c20568f2A);
        R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
        Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
            AK.c.y(i14, bE2, i14, pVar);
        }
        R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC2);
        C20576h2 c20576h2 = C20576h2.f28641a;
        bE2.C(349659069);
        String str = aVar.f16293b;
        if (str == null) {
            i13 = 0;
            z12 = true;
        } else {
            com.akita.compose.theme.re23.b.f63983a.getClass();
            i13 = 0;
            z12 = true;
            com.akita.compose.foundation.ui.o.a(str, com.akita.compose.theme.re23.b.f63988f.f65241l, C22501m2.a(R1.m(aVar2, 0.0f, 0.0f, 8, 0.0f, 11), "feature_status_icon"), null, bE2, 384, 8);
        }
        bE2.X(i13);
        com.akita.compose.theme.re23.b.f63983a.getClass();
        com.akita.compose.theme.re23.i iVar = com.akita.compose.theme.re23.b.f63988f;
        com.akita.compose.foundation.ui.p.d(aVar.f16292a, iVar.f65241l.d(new Object[i13], bE2), C22501m2.a(c20576h2.a(aVar2, 1.0f, z12), "feature_title"), 0L, null, 0, 0, false, null, bE2, 0, 504);
        bE2.C(349678508);
        String str2 = aVar.f16294c;
        if (str2 == null) {
            z13 = false;
        } else {
            com.akita.compose.foundation.r rVarA = com.akita.compose.foundation.r.a(iVar.f65241l, com.akita.compose.theme.re23.b.f63984b.f63903Z, 0L, 0L, null, 0L, 0L, 1022);
            z13 = false;
            com.akita.compose.foundation.ui.p.c(com.akita.compose.foundation.ui.o.b(str2, rVarA), rVarA.d(new Object[0], bE2), C22501m2.a(R1.m(aVar2, 8, 0.0f, 0.0f, 0.0f, 14), "feature_hint_icon"), 0L, null, 0, 0, false, null, bE2, 384, 504);
        }
        C22039c2 c22039c2N = com.avito.android.actions_sheet.a.n(bE2, z13, true);
        if (c22039c2N != null) {
            c22039c2N.f38184d = new C35234f(aVar, lVar, aVar2, i12);
        }
    }
}
