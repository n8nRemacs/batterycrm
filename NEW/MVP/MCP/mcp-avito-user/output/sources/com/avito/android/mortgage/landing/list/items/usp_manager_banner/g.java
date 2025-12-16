package com.avito.android.mortgage.landing.list.items.usp_manager_banner;

import Y41.p;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22078i;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.U;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.i;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.lib.util.q;
import com.avito.android.mortgage.api.model.landing.LandingManagerUspItem;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.util.C35829k2;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: UspManagerBannerItemScreen.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_mortgage_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class g {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(LandingManagerUspItem landingManagerUspItem, v vVar, A a12, int i12) {
        B bE2 = a12.E(936481660);
        if ((((bE2.B(landingManagerUspItem) ? 4 : 2) | i12) & 91) == 18 && bE2.c()) {
            bE2.f();
        } else {
            InterfaceC22215f.f39074a.getClass();
            i.b bVar = InterfaceC22215f.a.f39085k;
            C20585k c20585k = C20585k.f28659a;
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            c20585k.getClass();
            C20568f2 c20568f2A = C20563e2.a(C20585k.g(8), bVar, bE2, 54);
            int i13 = bE2.f37888Q;
            O1 o1S = bE2.S();
            v vVarC = androidx.compose.ui.n.c(bE2, vVar);
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
            p<InterfaceC22413h, InterfaceC22365i0, G0> pVar = InterfaceC22413h.a.f40796g;
            R3.b(pVar, bE2, c20568f2A);
            p<InterfaceC22413h, U, G0> pVar2 = InterfaceC22413h.a.f40795f;
            R3.b(pVar2, bE2, o1S);
            p<InterfaceC22413h, Integer, G0> pVar3 = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i13))) {
                AK.c.y(i13, bE2, i13, pVar3);
            }
            p<InterfaceC22413h, v, G0> pVar4 = InterfaceC22413h.a.f40793d;
            R3.b(pVar4, bE2, vVarC);
            C20576h2 c20576h2 = C20576h2.f28641a;
            v.a aVar3 = v.f42878y1;
            v vVarO = C20588k2.o(aVar3, 20);
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
            int i14 = bE2.f37888Q;
            O1 o1S2 = bE2.S();
            v vVarC2 = androidx.compose.ui.n.c(bE2, vVarO);
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
            R3.b(pVar, bE2, interfaceC22365i0D);
            R3.b(pVar2, bE2, o1S2);
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar3);
            }
            R3.b(pVar4, bE2, vVarC2);
            C20644z c20644z = C20644z.f28804a;
            Integer numA = q.a(landingManagerUspItem.getIconName());
            bE2.C(1821837426);
            Drawable drawableH = numA == null ? null : C35835l0.h(numA.intValue(), (Context) bE2.o(AndroidCompositionLocals_androidKt.f41069b));
            bE2.X(false);
            bE2.C(1821839288);
            if (drawableH != null) {
                com.akita.compose.foundation.ui.e.a(com.google.accompanist.drawablepainter.c.b(drawableH, bE2), null, c20644z.d(aVar3, InterfaceC22215f.a.f39080f), null, bE2, 56, 8);
            }
            bE2.X(false);
            bE2.X(true);
            String text = landingManagerUspItem.getText();
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.foundation.ui.p.b(text, com.akita.compose.theme.re23.b.f63988f.f65241l, null, false, 0L, null, 0, 0, false, null, bE2, 0, 1020);
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new c(landingManagerUspItem, vVar, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void b(List list, v vVar, A a12, int i12) {
        B bE2 = a12.E(-515797304);
        C20585k c20585k = C20585k.f28659a;
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        c20585k.getClass();
        C20585k.j jVarG = C20585k.g(16);
        InterfaceC22215f.f39074a.getClass();
        I iA2 = H.a(jVarG, InterfaceC22215f.a.f39088n, bE2, 6);
        int i13 = bE2.f37888Q;
        O1 o1S = bE2.S();
        v vVarC = androidx.compose.ui.n.c(bE2, vVar);
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
        p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i13))) {
            AK.c.y(i13, bE2, i13, pVar);
        }
        R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
        K k12 = K.f28344a;
        bE2.C(1677936992);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a((LandingManagerUspItem) it.next(), C20588k2.d(v.f42878y1, 1.0f), bE2, 48);
        }
        C22039c2 c22039c2N = com.avito.android.actions_sheet.a.n(bE2, false, true);
        if (c22039c2N != null) {
            c22039c2N.f38184d = new d(list, vVar, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void c(@Y61.k UspManagerBannerItem uspManagerBannerItem, @Y61.k Y41.l lVar, @Y61.l A a12, int i12) {
        p<InterfaceC22413h, Integer, G0> pVar;
        p<InterfaceC22413h, U, G0> pVar2;
        p<InterfaceC22413h, InterfaceC22365i0, G0> pVar3;
        InterfaceC22078i<?> interfaceC22078i;
        p<InterfaceC22413h, v, G0> pVar4;
        Y41.a<InterfaceC22413h> aVar;
        v.a aVar2;
        B bE2 = a12.E(-333531847);
        v.a aVar3 = v.f42878y1;
        C20585k c20585k = C20585k.f28659a;
        h.a aVar4 = androidx.compose.ui.unit.h.f42849c;
        c20585k.getClass();
        C20585k.j jVarG = C20585k.g(20);
        v vVarD = C20588k2.d(aVar3, 1.0f);
        InterfaceC22215f.f39074a.getClass();
        i.a aVar5 = InterfaceC22215f.a.f39088n;
        I iA2 = H.a(jVarG, aVar5, bE2, 6);
        int i13 = bE2.f37888Q;
        O1 o1S = bE2.S();
        v vVarC = androidx.compose.ui.n.c(bE2, vVarD);
        InterfaceC22413h.f40789C1.getClass();
        Y41.a<InterfaceC22413h> aVar6 = InterfaceC22413h.a.f40791b;
        InterfaceC22078i<?> interfaceC22078i2 = bE2.f37890b;
        if (interfaceC22078i2 == null) {
            C22190v.b();
            throw null;
        }
        bE2.A();
        if (bE2.f37887P) {
            bE2.b(aVar6);
        } else {
            bE2.d();
        }
        p<InterfaceC22413h, InterfaceC22365i0, G0> pVar5 = InterfaceC22413h.a.f40796g;
        R3.b(pVar5, bE2, iA2);
        p<InterfaceC22413h, U, G0> pVar6 = InterfaceC22413h.a.f40795f;
        R3.b(pVar6, bE2, o1S);
        p<InterfaceC22413h, Integer, G0> pVar7 = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i13))) {
            AK.c.y(i13, bE2, i13, pVar7);
        }
        p<InterfaceC22413h, v, G0> pVar8 = InterfaceC22413h.a.f40793d;
        R3.b(pVar8, bE2, vVarC);
        K k12 = K.f28344a;
        Context context = (Context) bE2.o(AndroidCompositionLocals_androidKt.f41069b);
        Uri uriD = C35829k2.b(UniversalImageKt.getImageDependsOnThemeOrDefault(uspManagerBannerItem.f200030c, com.avito.android.lib.util.darkTheme.c.b(context)), C35835l0.i(context).widthPixels, D6.i(148, context), 0.0f, 0, 60).d();
        bE2.C(660935275);
        if (uriD != null) {
            pVar = pVar7;
            pVar2 = pVar6;
            pVar3 = pVar5;
            interfaceC22078i = interfaceC22078i2;
            pVar4 = pVar8;
            aVar = aVar6;
            coil.compose.v.b(uriD, uspManagerBannerItem.f200031d, C20588k2.d(aVar3, 1.0f), null, null, null, bE2, 392, 4088);
        } else {
            pVar = pVar7;
            pVar2 = pVar6;
            pVar3 = pVar5;
            interfaceC22078i = interfaceC22078i2;
            pVar4 = pVar8;
            aVar = aVar6;
        }
        bE2.X(false);
        float f12 = 16;
        v vVarK = R1.k(f12, 0.0f, 2, C20588k2.d(aVar3, 1.0f));
        I iA3 = H.a(C20585k.f28662d, aVar5, bE2, 0);
        int i14 = bE2.f37888Q;
        O1 o1S2 = bE2.S();
        v vVarC2 = androidx.compose.ui.n.c(bE2, vVarK);
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
        R3.b(pVar3, bE2, iA3);
        R3.b(pVar2, bE2, o1S2);
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
            AK.c.y(i14, bE2, i14, pVar);
        }
        R3.b(pVar4, bE2, vVarC2);
        com.akita.compose.theme.re23.b.f63983a.getClass();
        com.akita.compose.foundation.ui.p.b(uspManagerBannerItem.f200031d, com.akita.compose.theme.re23.b.f63988f.f65233d, null, false, 0L, null, 0, 0, false, null, bE2, 0, 1020);
        com.akita.compose.foundation.ui.g.a(f12, null, bE2, 6);
        b(uspManagerBannerItem.f200032e, C20588k2.d(aVar3, 1.0f), bE2, 56);
        bE2.C(1515374266);
        UspManagerBannerAction uspManagerBannerAction = uspManagerBannerItem.f200033f;
        if (uspManagerBannerAction != null) {
            com.akita.compose.foundation.ui.g.a(24, null, bE2, 6);
            aVar2 = aVar3;
            com.akita.compose.component.button.m.c(uspManagerBannerAction.f200027b, new e(lVar, uspManagerBannerItem), com.akita.compose.theme.re23.b.c(bE2).M(), C20588k2.d(aVar3, 1.0f), null, null, null, false, uspManagerBannerItem.f200034g, null, bE2, 3584, 752);
        } else {
            aVar2 = aVar3;
        }
        bE2.X(false);
        bE2.X(true);
        bE2.X(true);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new f(uspManagerBannerItem, lVar, aVar2, i12);
        }
    }
}
