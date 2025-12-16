package com.avito.android.mortgage_category;

import O10.b;
import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22078i;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.U;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.graphics.Y0;
import androidx.compose.ui.i;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.layout.InterfaceC22374n;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.Q0;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.R;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.util.C35829k2;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: MortgageCategoryScreen.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_mortgage-category_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class A {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(String str, float f12, float f13, androidx.compose.ui.v vVar, androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(428678761);
        int i13 = (bE2.B(str) ? 4 : 2) | i12 | (bE2.k(f12) ? 32 : 16) | (bE2.k(f13) ? 256 : 128) | 3072;
        if ((i13 & 5851) == 1170 && bE2.c()) {
            bE2.f();
        } else {
            vVar = androidx.compose.ui.v.f42878y1;
            androidx.compose.ui.v vVarO = C20588k2.o(vVar, f12);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            long jC2 = com.akita.compose.theme.re23.b.f63984b.f63851H1.c(bE2);
            androidx.compose.foundation.shape.n nVar = androidx.compose.foundation.shape.o.f30153a;
            androidx.compose.ui.v vVarI = R1.i(androidx.compose.foundation.A.b(vVarO, jC2, nVar), f13);
            InterfaceC22215f.f39074a.getClass();
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
            int i14 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarI);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar = InterfaceC22413h.a.f40791b;
            if (bE2.f37890b == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar);
            } else {
                bE2.d();
            }
            R3.b(InterfaceC22413h.a.f40796g, bE2, interfaceC22365i0D);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            C20644z c20644z = C20644z.f28804a;
            String strC = u0.i.c(bE2, R.string.mortgage_category_bank_icon_description);
            InterfaceC22374n.f40491a.getClass();
            InterfaceC22374n.a.d dVar = InterfaceC22374n.a.f40496e;
            FillElement fillElement = C20588k2.f28682c;
            vVar.getClass();
            coil.compose.v.b(str, strC, androidx.compose.ui.draw.k.a(fillElement, nVar), null, dVar, null, bE2, (i13 & 14) | 1572864, 4024);
            bE2.X(true);
        }
        androidx.compose.ui.v vVar2 = vVar;
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new j(str, f12, f13, vVar2, i12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011a  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(java.util.List r20, androidx.compose.runtime.A r21, int r22) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage_category.A.b(java.util.List, androidx.compose.runtime.A, int):void");
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void c(float f12, float f13, float f14, List list, boolean z12, androidx.compose.runtime.A a12, int i12, int i13) {
        androidx.compose.runtime.B bE2 = a12.E(1559170356);
        v.a aVar = androidx.compose.ui.v.f42878y1;
        boolean z13 = (i13 & 32) != 0 ? false : z12;
        C20585k.f28659a.getClass();
        C20585k.j jVarG = C20585k.g(f12);
        InterfaceC22215f.f39074a.getClass();
        C20568f2 c20568f2A = C20563e2.a(jVarG, InterfaceC22215f.a.f39085k, bE2, 0);
        int i14 = bE2.f37888Q;
        O1 o1S = bE2.S();
        androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, aVar);
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
        R3.b(InterfaceC22413h.a.f40796g, bE2, c20568f2A);
        R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
        Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
            AK.c.y(i14, bE2, i14, pVar);
        }
        R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
        C20576h2 c20576h2 = C20576h2.f28641a;
        bE2.C(-1983117029);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a((String) it.next(), f13, f14, null, bE2, 0);
        }
        bE2.X(false);
        bE2.C(-1983111574);
        if (z13) {
            h(f13, f14, null, bE2, 0);
        }
        C22039c2 c22039c2N = com.avito.android.actions_sheet.a.n(bE2, false, true);
        if (c22039c2N != null) {
            c22039c2N.f38184d = new l(f12, f13, f14, list, aVar, z13, i12, i13);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void d(O10.b bVar, com.avito.android.analytics.screens.mvi.r rVar, Y41.a aVar, androidx.compose.ui.v vVar, androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(122518585);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(bVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.B(rVar) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i13 |= bE2.u(aVar) ? 256 : 128;
        }
        if ((i12 & 7168) == 0) {
            i13 |= bE2.B(vVar) ? 2048 : 1024;
        }
        if ((i13 & 5851) == 1170 && bE2.c()) {
            bE2.f();
        } else {
            com.akita.compose.component.scaffold.g.a(vVar, androidx.compose.runtime.internal.r.c(-1127641355, new o(bVar), bE2), androidx.compose.runtime.internal.r.c(-824753964, new p(bVar, aVar), bE2), null, null, null, null, androidx.compose.runtime.internal.r.c(1485452044, new r(rVar, bVar), bE2), bE2, ((i13 >> 9) & 14) | 12583344, 120);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new s(bVar, rVar, aVar, vVar, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void e(androidx.compose.ui.v vVar, androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(1786724199);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(vVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i13 & 11) == 2 && bE2.c()) {
            bE2.f();
        } else {
            androidx.compose.ui.v vVarD0 = vVar.d0(C20588k2.f28682c);
            InterfaceC22215f.f39074a.getClass();
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
            int i14 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarD0);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar = InterfaceC22413h.a.f40791b;
            if (bE2.f37890b == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar);
            } else {
                bE2.d();
            }
            R3.b(InterfaceC22413h.a.f40796g, bE2, interfaceC22365i0D);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            C20644z c20644z = C20644z.f28804a;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.component.spinner.b.a(com.akita.compose.theme.re23.b.r(bE2).getF66693b(), c20644z.d(androidx.compose.ui.v.f42878y1, InterfaceC22215f.a.f39080f), bE2, 0, 0);
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new t(vVar, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void f(int i12, Y41.a aVar, androidx.compose.runtime.A a12, androidx.compose.ui.v vVar) {
        int i13;
        androidx.compose.runtime.B b12;
        androidx.compose.runtime.B bE2 = a12.E(2066599774);
        if ((i12 & 14) == 0) {
            i13 = (bE2.u(aVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.B(vVar) ? 32 : 16;
        }
        if ((i13 & 91) == 18 && bE2.c()) {
            bE2.f();
            b12 = bE2;
        } else {
            String strC = u0.i.c(bE2, R.string.mortgage_category_screen_loading_failed_title);
            String strC2 = u0.i.c(bE2, R.string.mortgage_category_screen_loading_failed_subtitle);
            String strC3 = u0.i.c(bE2, R.string.mortgage_category_screen_loading_failed_action);
            com.akita.compose.component.content_placeholder.d dVar = (com.akita.compose.component.content_placeholder.d) bE2.o(com.akita.compose.component.content_placeholder.e.f61111a);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.component.content_placeholder.d dVarA = com.akita.compose.component.content_placeholder.d.a(dVar, com.akita.compose.theme.re23.b.f63984b.f63910b1, 0.0f, null, null, 16381);
            androidx.compose.ui.v vVarD0 = vVar.d0(C20588k2.f28682c);
            C32785a.f204870a.getClass();
            b12 = bE2;
            com.akita.compose.component.content_placeholder.b.a(C32785a.f204871b, strC, strC2, strC3, aVar, vVarD0, dVarA, null, false, false, bE2, ((i13 << 12) & 57344) | 6 | (com.akita.compose.component.content_placeholder.d.f61096o << 18), 896);
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new u(i12, aVar, vVar);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void g(@Y61.k P10.d dVar, @Y61.k InterfaceC43160i interfaceC43160i, @Y61.k Y41.l lVar, @Y61.k Y41.a aVar, @Y61.k Y41.a aVar2, @Y61.k Y41.a aVar3, @Y61.l androidx.compose.ui.v vVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(-348477833);
        C22187u0.f(interfaceC43160i, lVar, aVar, new v(aVar, lVar, null, interfaceC43160i), bE2);
        if (dVar.f12781e) {
            bE2.C(1730204671);
            e(vVar, bE2, 6);
            bE2.X(false);
        } else if (dVar.f12780d == null) {
            bE2.C(1730206836);
            f(48, aVar2, bE2, vVar);
            bE2.X(false);
        } else {
            bE2.C(1730209257);
            d(dVar.f12780d, dVar.getPerfTrackerParams(), aVar3, vVar, bE2, 3072);
            bE2.X(false);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new w(dVar, interfaceC43160i, lVar, aVar, aVar2, aVar3, vVar, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void h(float f12, float f13, androidx.compose.ui.v vVar, androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(-867745254);
        if ((i12 & 14) == 0) {
            i13 = (bE2.k(f12) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.k(f13) ? 32 : 16;
        }
        if (((i13 | 384) & 731) == 146 && bE2.c()) {
            bE2.f();
        } else {
            vVar = androidx.compose.ui.v.f42878y1;
            androidx.compose.ui.v vVarA = androidx.compose.ui.draw.k.a(R1.i(C20588k2.o(vVar, f12), f13), androidx.compose.foundation.shape.o.f30153a);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.a aVar = com.akita.compose.theme.re23.b.f63984b;
            androidx.compose.ui.v vVarB = androidx.compose.foundation.A.b(vVarA, aVar.f63973w1.c(bE2), Y0.f39346a);
            InterfaceC22215f.f39074a.getClass();
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
            int i14 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarB);
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
            R3.b(InterfaceC22413h.a.f40796g, bE2, interfaceC22365i0D);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            C20644z c20644z = C20644z.f28804a;
            com.akita.compose.theme.re23.b.f63985c.getClass();
            androidx.compose.ui.graphics.painter.e eVarA = u0.e.a(com.akita.compose.theme.re23.e.f64760sb, 0, bE2);
            String strC = u0.i.c(bE2, R.string.mortgage_category_bank_icon_plus_description);
            FillElement fillElement = C20588k2.f28682c;
            vVar.getClass();
            h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
            com.akita.compose.foundation.ui.e.a(eVarA, strC, R1.i(fillElement, 5), aVar.f63918e0, bE2, 392, 0);
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new z(f12, f13, i12, vVar);
        }
    }

    public static final void i(O10.c cVar, androidx.compose.ui.v vVar, androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(1286463243);
        com.akita.compose.theme.re23.b.f63983a.getClass();
        long jC2 = com.akita.compose.theme.re23.b.f63984b.f63973w1.c(bE2);
        float f12 = 16;
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        androidx.compose.ui.v vVarL = R1.l(androidx.compose.foundation.A.b(vVar, jC2, androidx.compose.foundation.shape.o.a(f12)), f12, 14, f12, f12);
        InterfaceC22215f.f39074a.getClass();
        InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
        int i13 = bE2.f37888Q;
        O1 o1S = bE2.S();
        androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarL);
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
        R3.b(InterfaceC22413h.a.f40796g, bE2, interfaceC22365i0D);
        R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
        Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i13))) {
            AK.c.y(i13, bE2, i13, pVar);
        }
        R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
        C20644z c20644z = C20644z.f28804a;
        com.avito.android.lib.compose.design.shared.stepsbar.d.c(null, cVar.f11915a, cVar.f11916b, 3, Float.valueOf(0.33f), true, false, 0.0f, true, 0.0f, null, bE2, 100887616, 1729);
        bE2.X(true);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new m(cVar, vVar, i12);
        }
    }

    public static final void j(b.a aVar, androidx.compose.ui.v vVar, androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(438024607);
        InterfaceC22215f.f39074a.getClass();
        i.a aVar2 = InterfaceC22215f.a.f39088n;
        C20585k.f28659a.getClass();
        I iA2 = H.a(C20585k.f28662d, aVar2, bE2, 48);
        int i13 = bE2.f37888Q;
        O1 o1S = bE2.S();
        androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVar);
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
        R3.b(InterfaceC22413h.a.f40796g, bE2, iA2);
        R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
        Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i13))) {
            AK.c.y(i13, bE2, i13, pVar);
        }
        R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
        K k12 = K.f28344a;
        Image imageDependsOnTheme = UniversalImageKt.getImageDependsOnTheme(aVar.f11901b, com.avito.android.lib.util.darkTheme.c.b((Context) bE2.o(AndroidCompositionLocals_androidKt.f41069b)));
        float f12 = 60;
        h.a aVar4 = androidx.compose.ui.unit.h.f42849c;
        Uri uriD = C35829k2.b(imageDependsOnTheme, kotlin.math.b.b(m(f12, bE2)), kotlin.math.b.b(m(f12, bE2)), 0.0f, 0, 60).d();
        bE2.C(1372796055);
        if (uriD != null) {
            coil.compose.v.b(uriD, aVar.f11902c, C20588k2.o(androidx.compose.ui.v.f42878y1, f12), null, null, null, bE2, 392, 4088);
            com.akita.compose.foundation.ui.g.a(12, null, bE2, 6);
        }
        bE2.X(false);
        com.akita.compose.theme.re23.b.f63983a.getClass();
        com.akita.compose.theme.re23.i iVar = com.akita.compose.theme.re23.b.f63988f;
        com.akita.compose.foundation.ui.p.b(aVar.f11902c, iVar.f65233d, null, false, 0L, null, 0, 0, false, null, bE2, 0, 1020);
        com.akita.compose.foundation.ui.g.a(8, null, bE2, 6);
        com.akita.compose.foundation.ui.p.b(aVar.f11903d, iVar.f65240k, null, false, 0L, null, 0, 0, false, null, bE2, 0, 1020);
        bE2.X(true);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new n(aVar, vVar, i12);
        }
    }

    public static final void k(b.C0773b c0773b, androidx.compose.ui.v vVar, androidx.compose.runtime.A a12, int i12) {
        Throwable th2;
        androidx.compose.runtime.B bE2 = a12.E(-1227005207);
        C20585k.f28659a.getClass();
        C20585k.l lVar = C20585k.f28662d;
        InterfaceC22215f.f39074a.getClass();
        I iA2 = H.a(lVar, InterfaceC22215f.a.f39088n, bE2, 0);
        int i13 = bE2.f37888Q;
        O1 o1S = bE2.S();
        androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVar);
        InterfaceC22413h.f40789C1.getClass();
        Y41.a<InterfaceC22413h> aVar = InterfaceC22413h.a.f40791b;
        InterfaceC22078i<?> interfaceC22078i = bE2.f37890b;
        if (interfaceC22078i == null) {
            C22190v.b();
            throw null;
        }
        bE2.A();
        if (bE2.f37887P) {
            bE2.b(aVar);
        } else {
            bE2.d();
        }
        Y41.p<InterfaceC22413h, InterfaceC22365i0, G0> pVar = InterfaceC22413h.a.f40796g;
        R3.b(pVar, bE2, iA2);
        Y41.p<InterfaceC22413h, U, G0> pVar2 = InterfaceC22413h.a.f40795f;
        R3.b(pVar2, bE2, o1S);
        Y41.p<InterfaceC22413h, Integer, G0> pVar3 = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i13))) {
            AK.c.y(i13, bE2, i13, pVar3);
        }
        Y41.p<InterfaceC22413h, androidx.compose.ui.v, G0> pVar4 = InterfaceC22413h.a.f40793d;
        R3.b(pVar4, bE2, vVarC);
        K k12 = K.f28344a;
        String str = c0773b.f11906b;
        com.akita.compose.theme.re23.b.f63983a.getClass();
        com.akita.compose.theme.re23.i iVar = com.akita.compose.theme.re23.b.f63988f;
        com.akita.compose.foundation.r rVar = iVar.f65236g;
        v.a aVar2 = androidx.compose.ui.v.f42878y1;
        h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
        com.akita.compose.foundation.ui.p.b(str, rVar, R1.m(aVar2, 0.0f, 0.0f, 0.0f, 2, 7), false, 0L, null, 0, 0, false, null, bE2, 384, 1016);
        bE2.C(-361052892);
        List<String> list = c0773b.f11907c;
        List<String> list2 = list;
        if (list2.isEmpty()) {
            th2 = null;
        } else {
            th2 = null;
            com.akita.compose.foundation.ui.g.a(14, null, bE2, 6);
        }
        bE2.X(false);
        C20585k.j jVarG = C20585k.g(13);
        i.b bVar = InterfaceC22215f.a.f39086l;
        androidx.compose.ui.v vVarD = C20588k2.d(aVar2, 1.0f);
        C20568f2 c20568f2A = C20563e2.a(jVarG, bVar, bE2, 54);
        int i14 = bE2.f37888Q;
        O1 o1S2 = bE2.S();
        androidx.compose.ui.v vVarC2 = androidx.compose.ui.n.c(bE2, vVarD);
        if (interfaceC22078i == null) {
            C22190v.b();
            throw th2;
        }
        bE2.A();
        if (bE2.f37887P) {
            bE2.b(aVar);
        } else {
            bE2.d();
        }
        R3.b(pVar, bE2, c20568f2A);
        R3.b(pVar2, bE2, o1S2);
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
            AK.c.y(i14, bE2, i14, pVar3);
        }
        R3.b(pVar4, bE2, vVarC2);
        C20576h2 c20576h2 = C20576h2.f28641a;
        bE2.C(1217627200);
        if (!list2.isEmpty()) {
            b(list, bE2, 8);
        }
        bE2.X(false);
        com.akita.compose.foundation.ui.p.b(c0773b.f11908d, iVar.f65241l, null, false, 0L, null, 0, 0, false, null, bE2, 0, 1020);
        C22039c2 c22039c2N = com.avito.android.actions_sheet.a.n(bE2, true, true);
        if (c22039c2N != null) {
            c22039c2N.f38184d = new x(c0773b, vVar, i12);
        }
    }

    public static final void l(b.c cVar, androidx.compose.ui.v vVar, androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(-959002753);
        InterfaceC22215f.f39074a.getClass();
        i.a aVar = InterfaceC22215f.a.f39088n;
        C20585k.f28659a.getClass();
        I iA2 = H.a(C20585k.f28662d, aVar, bE2, 48);
        int i13 = bE2.f37888Q;
        O1 o1S = bE2.S();
        androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVar);
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
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i13))) {
            AK.c.y(i13, bE2, i13, pVar);
        }
        R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
        K k12 = K.f28344a;
        Image imageDependsOnTheme = UniversalImageKt.getImageDependsOnTheme(cVar.f11911b, com.avito.android.lib.util.darkTheme.c.b((Context) bE2.o(AndroidCompositionLocals_androidKt.f41069b)));
        float f12 = 60;
        h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
        Uri uriD = C35829k2.b(imageDependsOnTheme, kotlin.math.b.b(m(f12, bE2)), kotlin.math.b.b(m(f12, bE2)), 0.0f, 0, 60).d();
        bE2.C(1590935542);
        if (uriD != null) {
            coil.compose.v.b(uriD, cVar.f11912c, C20588k2.o(androidx.compose.ui.v.f42878y1, f12), null, null, null, bE2, 392, 4088);
            com.akita.compose.foundation.ui.g.a(12, null, bE2, 6);
        }
        bE2.X(false);
        com.akita.compose.theme.re23.b.f63983a.getClass();
        com.akita.compose.theme.re23.i iVar = com.akita.compose.theme.re23.b.f63988f;
        com.akita.compose.foundation.ui.p.b(cVar.f11912c, iVar.f65233d, null, false, 0L, null, 0, 0, false, null, bE2, 0, 1020);
        com.akita.compose.foundation.ui.g.a(8, null, bE2, 6);
        com.akita.compose.foundation.ui.p.b(cVar.f11913d, iVar.f65240k, null, false, 0L, null, 0, 0, false, null, bE2, 0, 1020);
        bE2.X(true);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new y(cVar, vVar, i12);
        }
    }

    @InterfaceC22132o
    public static final float m(float f12, @Y61.l androidx.compose.runtime.A a12) {
        a12.C(1168162053);
        float fM02 = ((androidx.compose.ui.unit.d) a12.o(Q0.f41199h)).M0(f12);
        a12.h();
        return fM02;
    }
}
