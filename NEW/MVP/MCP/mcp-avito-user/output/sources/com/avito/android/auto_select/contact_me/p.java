package com.avito.android.auto_select.contact_me;

import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.C21086w0;
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
import androidx.compose.ui.graphics.Y0;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.layout.InterfaceC22374n;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.C22543x1;
import androidx.compose.ui.platform.Q0;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import c3.C26932a;
import com.avito.android.R;
import com.avito.android.auto_select.contact_me.model.AutoSelectContactMeContact;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.util.C35829k2;
import gf.C40672c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: AutoSelectContactMeScreen.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_auto-select_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class p {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(AutoSelectContactMeContact autoSelectContactMeContact, Y41.l lVar, Y41.l lVar2, A a12, int i12) {
        Y41.p<InterfaceC22413h, U, G0> pVar;
        Y41.p<InterfaceC22413h, Integer, G0> pVar2;
        Y41.p<InterfaceC22413h, InterfaceC22365i0, G0> pVar3;
        Y41.a<InterfaceC22413h> aVar;
        B bE2 = a12.E(944040279);
        v.a aVar2 = v.f42878y1;
        com.akita.compose.foundation.p pVarA = C26932a.a(autoSelectContactMeContact.f95993d);
        if (pVarA == null) {
            C22039c2 c22039c2Z = bE2.Z();
            if (c22039c2Z != null) {
                c22039c2Z.f38184d = new l(autoSelectContactMeContact, lVar, lVar2, aVar2, i12);
                return;
            }
            return;
        }
        Context context = (Context) bE2.o(AndroidCompositionLocals_androidKt.f41069b);
        androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) bE2.o(Q0.f41199h);
        Image imageDependsOnTheme = UniversalImageKt.getImageDependsOnTheme(autoSelectContactMeContact.f95994e, com.avito.android.lib.util.darkTheme.c.b(context));
        float f12 = 36;
        h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
        Uri uriC = C35829k2.b(imageDependsOnTheme, kotlin.math.b.b(dVar.M0(f12)), kotlin.math.b.b(dVar.M0(f12)), 0.0f, 1, 44).c(m.f95986b);
        float f13 = 16;
        v vVarJ = R1.j(C21086w0.c(androidx.compose.foundation.A.b(androidx.compose.ui.draw.k.a(C20588k2.d(C20588k2.h(80, 0.0f, 2, aVar2), 1.0f), androidx.compose.foundation.shape.o.a(20)), pVarA.c(bE2), Y0.f39346a), false, null, null, new g(lVar, autoSelectContactMeContact), 7), 12, f13);
        C20585k.f28659a.getClass();
        C20585k.C1589k c1589k = C20585k.f28660b;
        InterfaceC22215f.f39074a.getClass();
        C20568f2 c20568f2A = C20563e2.a(c1589k, InterfaceC22215f.a.f39085k, bE2, 0);
        int i13 = bE2.f37888Q;
        O1 o1S = bE2.S();
        v vVarC = androidx.compose.ui.n.c(bE2, vVarJ);
        InterfaceC22413h.f40789C1.getClass();
        Y41.a<InterfaceC22413h> aVar4 = InterfaceC22413h.a.f40791b;
        InterfaceC22078i<?> interfaceC22078i = bE2.f37890b;
        if (interfaceC22078i == null) {
            C22190v.b();
            throw null;
        }
        bE2.A();
        if (bE2.f37887P) {
            bE2.b(aVar4);
        } else {
            bE2.d();
        }
        Y41.p<InterfaceC22413h, InterfaceC22365i0, G0> pVar4 = InterfaceC22413h.a.f40796g;
        R3.b(pVar4, bE2, c20568f2A);
        Y41.p<InterfaceC22413h, U, G0> pVar5 = InterfaceC22413h.a.f40795f;
        R3.b(pVar5, bE2, o1S);
        Y41.p<InterfaceC22413h, Integer, G0> pVar6 = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i13))) {
            AK.c.y(i13, bE2, i13, pVar6);
        }
        Y41.p<InterfaceC22413h, v, G0> pVar7 = InterfaceC22413h.a.f40793d;
        R3.b(pVar7, bE2, vVarC);
        C20576h2 c20576h2 = C20576h2.f28641a;
        bE2.C(1634407555);
        if (uriC == null) {
            pVar = pVar5;
            pVar2 = pVar6;
            pVar3 = pVar4;
            aVar = aVar4;
        } else {
            v vVarO = C20588k2.o(aVar2, f12);
            InterfaceC22374n.f40491a.getClass();
            pVar = pVar5;
            pVar2 = pVar6;
            pVar3 = pVar4;
            aVar = aVar4;
            coil.compose.v.b(uriC, null, vVarO, null, InterfaceC22374n.a.f40494c, null, bE2, 1573304, 4024);
            G0 g02 = G0.f406611a;
        }
        bE2.X(false);
        com.akita.compose.foundation.ui.g.b(f13, null, bE2, 6, 2);
        v vVarA = c20576h2.a(aVar2, 1.0f, true);
        I iA2 = H.a(C20585k.f28662d, InterfaceC22215f.a.f39088n, bE2, 0);
        int i14 = bE2.f37888Q;
        O1 o1S2 = bE2.S();
        v vVarC2 = androidx.compose.ui.n.c(bE2, vVarA);
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
        R3.b(pVar3, bE2, iA2);
        R3.b(pVar, bE2, o1S2);
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
            AK.c.y(i14, bE2, i14, pVar2);
        }
        R3.b(pVar7, bE2, vVarC2);
        K k12 = K.f28344a;
        com.avito.android.lib.compose.design.component.attributedtext.a.b(autoSelectContactMeContact.f95991b, null, R.attr.textH60, h.f95972l, null, 0, bE2, 3080, 50);
        com.akita.compose.foundation.ui.g.a(2, null, bE2, 6);
        com.avito.android.lib.compose.design.component.attributedtext.a.b(autoSelectContactMeContact.f95992c, null, R.attr.textXs10, i.f95973l, new j(lVar2, autoSelectContactMeContact), 0, bE2, 3080, 34);
        bE2.X(true);
        float f14 = 4;
        com.akita.compose.foundation.ui.g.b(f14, null, bE2, 6, 2);
        if (autoSelectContactMeContact.f95996g) {
            bE2.C(-871905922);
            v vVarC3 = c20576h2.c(R1.m(aVar2, 0.0f, 0.0f, f14, 0.0f, 11), InterfaceC22215f.a.f39086l);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.b.f63985c.getClass();
            com.akita.compose.foundation.ui.e.a(u0.e.a(com.akita.compose.theme.re23.e.f64527f0, 0, bE2), null, vVarC3, com.akita.compose.theme.re23.b.f63984b.f63903Z, bE2, 56, 0);
            bE2.X(false);
        } else {
            bE2.C(-871561357);
            com.akita.compose.foundation.ui.g.b(24, null, bE2, 6, 2);
            bE2.X(false);
        }
        bE2.X(true);
        C22039c2 c22039c2Z2 = bE2.Z();
        if (c22039c2Z2 != null) {
            c22039c2Z2.f38184d = new k(autoSelectContactMeContact, lVar, lVar2, aVar2, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void b(@Y61.k C40672c c40672c, @Y61.k Y41.l lVar, @Y61.k Y41.l lVar2, @Y61.l v.a aVar, @Y61.l A a12, int i12) {
        boolean z12;
        v.a aVar2;
        B bE2 = a12.E(374699482);
        int i13 = i12 | (bE2.B(c40672c) ? 4 : 2) | (bE2.u(lVar) ? 32 : 16) | (bE2.u(lVar2) ? 256 : 128) | 3072;
        if ((i13 & 5851) == 1170 && bE2.c()) {
            bE2.f();
            aVar2 = aVar;
        } else {
            v.a aVar3 = v.f42878y1;
            com.avito.android.analytics.screens.mvi.r perfTrackerParams = c40672c.getPerfTrackerParams();
            bE2.C(-976608008);
            bE2.C(2063036140);
            boolean zBooleanValue = ((Boolean) bE2.o(C22543x1.f41638a)).booleanValue();
            InterfaceC22078i<?> interfaceC22078i = bE2.f37890b;
            List<AutoSelectContactMeContact> list = c40672c.f396675c;
            if (zBooleanValue) {
                bE2.C(421109671);
                h.a aVar4 = androidx.compose.ui.unit.h.f42849c;
                v vVarJ = R1.j(C20588k2.d(aVar3, 1.0f), 16, 12);
                C20585k.f28659a.getClass();
                C20585k.j jVarG = C20585k.g(4);
                InterfaceC22215f.f39074a.getClass();
                I iA2 = H.a(jVarG, InterfaceC22215f.a.f39088n, bE2, 6);
                int i14 = bE2.f37888Q;
                O1 o1S = bE2.S();
                v vVarC = androidx.compose.ui.n.c(bE2, vVarJ);
                InterfaceC22413h.f40789C1.getClass();
                Y41.a<InterfaceC22413h> aVar5 = InterfaceC22413h.a.f40791b;
                if (interfaceC22078i == null) {
                    C22190v.b();
                    throw null;
                }
                bE2.A();
                if (bE2.f37887P) {
                    bE2.b(aVar5);
                } else {
                    bE2.d();
                }
                R3.b(InterfaceC22413h.a.f40796g, bE2, iA2);
                R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
                Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
                if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
                    AK.c.y(i14, bE2, i14, pVar);
                }
                R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
                K k12 = K.f28344a;
                bE2.C(-1197182757);
                List<AutoSelectContactMeContact> list2 = list;
                ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    a((AutoSelectContactMeContact) it.next(), lVar, lVar2, bE2, (i13 & 112) | 8 | (i13 & 896));
                    arrayList.add(G0.f406611a);
                }
                z12 = false;
                androidx.compose.foundation.H.A(bE2, false, true, false);
            } else {
                bE2.C(420357239);
                com.avito.android.analytics.screens.compose.a aVar6 = (com.avito.android.analytics.screens.compose.a) bE2.o(com.avito.android.analytics.screens.compose.c.f90576a);
                if (perfTrackerParams != null) {
                    aVar6.m(perfTrackerParams.f90666a);
                }
                aVar6.l();
                v vVarD = androidx.compose.ui.draw.o.d(aVar3, new n(perfTrackerParams, aVar6));
                InterfaceC22215f.f39074a.getClass();
                InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
                int i15 = bE2.f37888Q;
                O1 o1S2 = bE2.S();
                v vVarC2 = androidx.compose.ui.n.c(bE2, vVarD);
                InterfaceC22413h.f40789C1.getClass();
                Y41.a<InterfaceC22413h> aVar7 = InterfaceC22413h.a.f40791b;
                if (interfaceC22078i == null) {
                    C22190v.b();
                    throw null;
                }
                bE2.A();
                if (bE2.f37887P) {
                    bE2.b(aVar7);
                } else {
                    bE2.d();
                }
                Y41.p<InterfaceC22413h, InterfaceC22365i0, G0> pVar2 = InterfaceC22413h.a.f40796g;
                R3.b(pVar2, bE2, interfaceC22365i0D);
                Y41.p<InterfaceC22413h, U, G0> pVar3 = InterfaceC22413h.a.f40795f;
                R3.b(pVar3, bE2, o1S2);
                Y41.p<InterfaceC22413h, Integer, G0> pVar4 = InterfaceC22413h.a.f40799j;
                if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i15))) {
                    AK.c.y(i15, bE2, i15, pVar4);
                }
                Y41.p<InterfaceC22413h, v, G0> pVar5 = InterfaceC22413h.a.f40793d;
                R3.b(pVar5, bE2, vVarC2);
                C20644z c20644z = C20644z.f28804a;
                h.a aVar8 = androidx.compose.ui.unit.h.f42849c;
                v vVarJ2 = R1.j(C20588k2.d(aVar3, 1.0f), 16, 12);
                C20585k.f28659a.getClass();
                I iA3 = H.a(C20585k.g(4), InterfaceC22215f.a.f39088n, bE2, 6);
                int i16 = bE2.f37888Q;
                O1 o1S3 = bE2.S();
                v vVarC3 = androidx.compose.ui.n.c(bE2, vVarJ2);
                if (interfaceC22078i == null) {
                    C22190v.b();
                    throw null;
                }
                bE2.A();
                if (bE2.f37887P) {
                    bE2.b(aVar7);
                } else {
                    bE2.d();
                }
                R3.b(pVar2, bE2, iA3);
                R3.b(pVar3, bE2, o1S3);
                if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i16))) {
                    AK.c.y(i16, bE2, i16, pVar4);
                }
                R3.b(pVar5, bE2, vVarC3);
                K k13 = K.f28344a;
                bE2.C(-1197182757);
                List<AutoSelectContactMeContact> list3 = list;
                ArrayList arrayList2 = new ArrayList(C42745f0.q(list3, 10));
                Iterator<T> it2 = list3.iterator();
                while (it2.hasNext()) {
                    a((AutoSelectContactMeContact) it2.next(), lVar, lVar2, bE2, (i13 & 112) | 8 | (i13 & 896));
                    arrayList2.add(G0.f406611a);
                }
                androidx.compose.foundation.H.B(bE2, false, true, true, false);
                z12 = false;
            }
            bE2.X(z12);
            bE2.X(z12);
            aVar2 = aVar3;
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new o(c40672c, lVar, lVar2, aVar2, i12);
        }
    }
}
