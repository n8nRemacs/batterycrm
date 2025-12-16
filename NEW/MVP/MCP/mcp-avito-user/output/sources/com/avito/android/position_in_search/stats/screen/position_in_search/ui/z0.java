package com.avito.android.position_in_search.stats.screen.position_in_search.ui;

import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.layout.S0;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22196w1;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.U2;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.C22392w0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import c90.c;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SearchPositionCompetitors.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0004²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002"}, d2 = {"", "screenWidth", "", "isSuccessLoad", "_avito_position-in-search_stats_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class z0 {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k c.C2034c c2034c, @Y61.k Y41.l lVar, @Y61.l androidx.compose.ui.v vVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(1751641099);
        androidx.compose.ui.graphics.painter.e eVarA = u0.e.a(R.drawable.position_in_search_image_placeholder, 0, bE2);
        bE2.C(1517068963);
        Object objT = bE2.t();
        androidx.compose.runtime.A.f37866a.getClass();
        A.a.C1651a c1651a = A.a.f37868b;
        if (objT == c1651a) {
            objT = U2.a(0);
            bE2.H(objT);
        }
        InterfaceC22196w1 interfaceC22196w1 = (InterfaceC22196w1) objT;
        bE2.X(false);
        float f12 = 12;
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        float fA2 = (com.avito.android.position_in_search.stats.screen.position_in_search.util.a.a(bE2, interfaceC22196w1.e()) - f12) / 2;
        bE2.C(1517076717);
        Object objT2 = bE2.t();
        if (objT2 == c1651a) {
            objT2 = new v0(interfaceC22196w1);
            bE2.H(objT2);
        }
        bE2.X(false);
        androidx.compose.ui.v vVarA = C22392w0.a(vVar, (Y41.l) objT2);
        C20585k.f28659a.getClass();
        C20585k.l lVar2 = C20585k.f28662d;
        InterfaceC22215f.f39074a.getClass();
        androidx.compose.foundation.layout.I iA2 = androidx.compose.foundation.layout.H.a(lVar2, InterfaceC22215f.a.f39088n, bE2, 0);
        int i13 = bE2.f37888Q;
        O1 o1S = bE2.S();
        androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarA);
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
        if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i13))) {
            AK.c.y(i13, bE2, i13, pVar);
        }
        R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
        androidx.compose.foundation.layout.K k12 = androidx.compose.foundation.layout.K.f28344a;
        com.akita.compose.theme.re23.b.f63983a.getClass();
        com.akita.compose.foundation.r rVar = com.akita.compose.theme.re23.b.f63988f.f65234e;
        v.a aVar3 = androidx.compose.ui.v.f42878y1;
        com.akita.compose.foundation.ui.p.b(c2034c.f57724a, rVar, C22501m2.a(aVar3, "competitors_title"), false, 0L, null, 0, 0, false, null, bE2, 384, 1016);
        com.avito.android.lib.compose.design.component.attributedtext.a.b(c2034c.f57725b, R1.m(aVar3, 0.0f, 4, 0.0f, 0.0f, 13), R.attr.textM20, null, new w0(c2034c, lVar), 0, bE2, 56, 40);
        float f13 = 24;
        S0.d(R1.m(C20588k2.d(aVar3, 1.0f), 0.0f, f13, 0.0f, 0.0f, 13), C20585k.g(f12), C20585k.g(f13), null, 2, 0, androidx.compose.runtime.internal.r.c(1564557478, new x0(c2034c, fA2, eVarA, lVar), bE2), bE2, 1597878, 40);
        bE2.X(true);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new y0(c2034c, lVar, vVar, i12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(c90.c.C2034c.a r42, float r43, androidx.compose.ui.graphics.painter.e r44, Y41.l r45, androidx.compose.runtime.A r46, int r47) {
        /*
            Method dump skipped, instructions count: 980
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.position_in_search.stats.screen.position_in_search.ui.z0.b(c90.c$c$a, float, androidx.compose.ui.graphics.painter.e, Y41.l, androidx.compose.runtime.A, int):void");
    }
}
