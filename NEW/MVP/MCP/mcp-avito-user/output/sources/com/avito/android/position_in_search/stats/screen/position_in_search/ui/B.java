package com.avito.android.position_in_search.stats.screen.position_in_search.ui;

import android.net.Uri;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.graphics.Y0;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.layout.InterfaceC22374n;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import c90.c;
import com.avito.android.R;
import com.avito.android.remote.model.Image;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PositionInSearchFooter.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_position-in-search_stats_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class B {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k c.d dVar, @Y61.k Y41.l lVar, @Y61.l androidx.compose.ui.v vVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(417195903);
        com.akita.compose.component.floating_container.b.a(C22501m2.a(vVar, "footer_container"), null, null, null, null, androidx.compose.runtime.internal.r.c(-1000088412, new C33301z(dVar, lVar), bE2), bE2, 196608, 30);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new A(dVar, lVar, vVar, i12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(Image image, androidx.compose.runtime.A a12, int i12) {
        boolean z12;
        androidx.compose.runtime.B bE2 = a12.E(-827303078);
        androidx.compose.ui.graphics.painter.e eVarA = u0.e.a(R.drawable.position_in_search_footer_image_placeholder, 0, bE2);
        bE2.C(-1047139102);
        Object objT = bE2.t();
        androidx.compose.runtime.A.f37866a.getClass();
        A.a.C1651a c1651a = A.a.f37868b;
        if (objT == c1651a) {
            objT = C22126m3.g(Boolean.FALSE);
            bE2.H(objT);
        }
        InterfaceC22204y1 interfaceC22204y1 = (InterfaceC22204y1) objT;
        bE2.X(false);
        float f12 = 40;
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        v.a aVar2 = androidx.compose.ui.v.f42878y1;
        androidx.compose.ui.v vVarO = C20588k2.o(aVar2, f12);
        InterfaceC22215f.f39074a.getClass();
        InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
        int i13 = bE2.f37888Q;
        O1 o1S = bE2.S();
        androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarO);
        InterfaceC22413h.f40789C1.getClass();
        Y41.a<InterfaceC22413h> aVar3 = InterfaceC22413h.a.f40791b;
        if (bE2.f37890b == null) {
            C22190v.b();
            throw null;
        }
        bE2.A();
        if (bE2.f37887P) {
            bE2.b(aVar3);
        } else {
            bE2.d();
        }
        R3.b(InterfaceC22413h.a.f40796g, bE2, interfaceC22365i0D);
        R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
        Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i13))) {
            AK.c.y(i13, bE2, i13, pVar);
        }
        R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
        C20644z c20644z = C20644z.f28804a;
        Uri uriB = com.avito.android.position_in_search.stats.screen.position_in_search.util.a.b(image, f12, f12, bE2, 440);
        float f13 = 10;
        androidx.compose.ui.v vVarA = C22501m2.a(androidx.compose.ui.draw.k.a(C20588k2.o(aVar2, f12), androidx.compose.foundation.shape.o.a(f13)), "footer_image");
        bE2.C(287332028);
        Object objT2 = bE2.t();
        if (objT2 == c1651a) {
            objT2 = new C33296u(interfaceC22204y1);
            bE2.H(objT2);
        }
        Y41.l lVar = (Y41.l) objT2;
        Object objI = com.akita.compose.component.accordion.s.i(287333787, bE2, false);
        if (objI == c1651a) {
            objI = new C33297v(interfaceC22204y1);
            bE2.H(objI);
        }
        Y41.l lVar2 = (Y41.l) objI;
        Object objI2 = com.akita.compose.component.accordion.s.i(287335452, bE2, false);
        if (objI2 == c1651a) {
            objI2 = new C33298w(interfaceC22204y1);
            bE2.H(objI2);
        }
        bE2.X(false);
        InterfaceC22374n.f40491a.getClass();
        coil.compose.v.a(uriB, null, vVarA, eVarA, eVarA, null, lVar, lVar2, (Y41.l) objI2, null, InterfaceC22374n.a.f40493b, null, bE2, 114855992, 6, 64032);
        bE2.C(287338746);
        if (((Boolean) interfaceC22204y1.getF42167b()).booleanValue()) {
            androidx.compose.ui.v vVarA2 = androidx.compose.ui.draw.k.a(c20644z.b(aVar2), androidx.compose.foundation.shape.o.a(f13));
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.b.f63987e.getClass();
            com.akita.compose.theme.re23.semantic.b.f65954b.d().getClass();
            z12 = false;
            C20632w.a(androidx.compose.foundation.A.b(vVarA2, X2.f.f18543b.c(bE2), Y0.f39346a), bE2, 0);
        } else {
            z12 = false;
        }
        C22039c2 c22039c2N = com.avito.android.actions_sheet.a.n(bE2, z12, true);
        if (c22039c2N != null) {
            c22039c2N.f38184d = new C33299x(i12, image);
        }
    }
}
