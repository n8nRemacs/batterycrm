package com.avito.android.advert.item.select.parameters_v3;

import android.net.Uri;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20608p2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22078i;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.U;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.graphics.Y0;
import androidx.compose.ui.i;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.Q0;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import c3.C26932a;
import com.avito.android.R;
import com.avito.android.advert.item.select.parameters_v3.y;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.util.C35829k2;
import java.util.List;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: AutoSelectParametersV3Screen.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_advert-details_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class x {

    /* compiled from: AutoSelectParametersV3Screen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements com.avito.android.deep_linking.links.w, kotlin.jvm.internal.D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.l f79623b;

        public a(Y41.l lVar) {
            this.f79623b = lVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof com.avito.android.deep_linking.links.w) && (obj instanceof kotlin.jvm.internal.D)) {
                return L.f(this.f79623b, ((kotlin.jvm.internal.D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f79623b;
        }

        public final int hashCode() {
            return this.f79623b.hashCode();
        }

        @Override // com.avito.android.deep_linking.links.w
        public final /* synthetic */ void i7(DeepLink deepLink) {
            this.f79623b.invoke(deepLink);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(y.a aVar, Y41.l lVar, androidx.compose.ui.v vVar, boolean z12, androidx.compose.runtime.A a12, int i12) {
        String strA;
        com.akita.compose.theme.re23.i iVar;
        C20585k.l lVar2;
        Y41.p<InterfaceC22413h, androidx.compose.ui.v, G0> pVar;
        v.a aVar2;
        Y41.p<InterfaceC22413h, Integer, G0> pVar2;
        Y41.p<InterfaceC22413h, U, G0> pVar3;
        Y41.p<InterfaceC22413h, InterfaceC22365i0, G0> pVar4;
        boolean z13;
        androidx.compose.runtime.B bE2 = a12.E(1028704068);
        com.akita.compose.theme.re23.b.f63983a.getClass();
        com.akita.compose.theme.re23.i iVar2 = com.akita.compose.theme.re23.b.f63988f;
        com.akita.compose.foundation.r rVar = iVar2.f65242m;
        C20585k.f28659a.getClass();
        C20585k.C1589k c1589k = C20585k.f28660b;
        InterfaceC22215f.f39074a.getClass();
        C20568f2 c20568f2A = C20563e2.a(c1589k, InterfaceC22215f.a.f39085k, bE2, 0);
        int i13 = bE2.f37888Q;
        O1 o1S = bE2.S();
        androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVar);
        InterfaceC22413h.f40789C1.getClass();
        Y41.a<InterfaceC22413h> aVar3 = InterfaceC22413h.a.f40791b;
        InterfaceC22078i<?> interfaceC22078i = bE2.f37890b;
        if (interfaceC22078i == null) {
            C22190v.b();
            throw null;
        }
        bE2.A();
        if (bE2.f37887P) {
            bE2.b(aVar3);
        } else {
            bE2.d();
        }
        Y41.p<InterfaceC22413h, InterfaceC22365i0, G0> pVar5 = InterfaceC22413h.a.f40796g;
        R3.b(pVar5, bE2, c20568f2A);
        Y41.p<InterfaceC22413h, U, G0> pVar6 = InterfaceC22413h.a.f40795f;
        R3.b(pVar6, bE2, o1S);
        Y41.p<InterfaceC22413h, Integer, G0> pVar7 = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i13))) {
            AK.c.y(i13, bE2, i13, pVar7);
        }
        Y41.p<InterfaceC22413h, androidx.compose.ui.v, G0> pVar8 = InterfaceC22413h.a.f40793d;
        R3.b(pVar8, bE2, vVarC);
        C20576h2 c20576h2 = C20576h2.f28641a;
        i.a aVar4 = InterfaceC22215f.a.f39089o;
        v.a aVar5 = androidx.compose.ui.v.f42878y1;
        C20585k.l lVar3 = C20585k.f28662d;
        I iA2 = H.a(lVar3, aVar4, bE2, 48);
        int i14 = bE2.f37888Q;
        O1 o1S2 = bE2.S();
        androidx.compose.ui.v vVarC2 = androidx.compose.ui.n.c(bE2, aVar5);
        if (interfaceC22078i == null) {
            C22190v.b();
            throw null;
        }
        bE2.A();
        if (bE2.f37887P) {
            bE2.b(aVar3);
        } else {
            bE2.d();
        }
        R3.b(pVar5, bE2, iA2);
        R3.b(pVar6, bE2, o1S2);
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
            AK.c.y(i14, bE2, i14, pVar7);
        }
        R3.b(pVar8, bE2, vVarC2);
        K k12 = K.f28344a;
        String str = aVar.f79629a;
        if (str != null) {
            com.akita.compose.theme.re23.g.f65049a.getClass();
            strA = com.akita.compose.theme.re23.g.a(str);
        } else {
            strA = null;
        }
        bE2.C(-915118888);
        if (strA == null) {
            pVar = pVar8;
            pVar2 = pVar7;
            pVar3 = pVar6;
            pVar4 = pVar5;
            iVar = iVar2;
            lVar2 = lVar3;
            z13 = false;
            aVar2 = aVar5;
        } else {
            h.a aVar6 = androidx.compose.ui.unit.h.f42849c;
            androidx.compose.ui.v vVarO = C20588k2.o(aVar5, 24);
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
            int i15 = bE2.f37888Q;
            O1 o1S3 = bE2.S();
            androidx.compose.ui.v vVarC3 = androidx.compose.ui.n.c(bE2, vVarO);
            if (interfaceC22078i == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            iVar = iVar2;
            if (bE2.f37887P) {
                bE2.b(aVar3);
            } else {
                bE2.d();
            }
            R3.b(pVar5, bE2, interfaceC22365i0D);
            R3.b(pVar6, bE2, o1S3);
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i15))) {
                AK.c.y(i15, bE2, i15, pVar7);
            }
            R3.b(pVar8, bE2, vVarC3);
            lVar2 = lVar3;
            pVar = pVar8;
            aVar2 = aVar5;
            pVar2 = pVar7;
            pVar3 = pVar6;
            pVar4 = pVar5;
            com.akita.compose.foundation.ui.o.a(strA, rVar, C20644z.f28804a.d(aVar5, InterfaceC22215f.a.f39080f), null, bE2, 0, 8);
            bE2.X(true);
            G0 g02 = G0.f406611a;
            z13 = false;
        }
        bE2.X(z13);
        h.a aVar7 = androidx.compose.ui.unit.h.f42849c;
        C20608p2.a(bE2, C20588k2.f(aVar2, 4));
        bE2.C(-915106253);
        if (z12) {
            androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) bE2.o(Q0.f41199h);
            long j12 = rVar.f63646c;
            androidx.compose.ui.unit.z.a(j12);
            C20608p2.a(bE2, androidx.compose.foundation.A.b(C20588k2.t(C20588k2.f(aVar2, dVar.E(androidx.compose.ui.unit.z.f(1095216660480L & j12, androidx.compose.ui.unit.y.d(j12) * 1.5f))), 2), com.akita.compose.theme.re23.b.f63984b.f63967u1.c(bE2), Y0.f39346a));
        }
        bE2.X(false);
        bE2.X(true);
        C20608p2.a(bE2, C20588k2.t(aVar2, 8));
        I iA3 = H.a(lVar2, InterfaceC22215f.a.f39088n, bE2, 0);
        int i16 = bE2.f37888Q;
        O1 o1S4 = bE2.S();
        androidx.compose.ui.v vVarC4 = androidx.compose.ui.n.c(bE2, aVar2);
        if (interfaceC22078i == null) {
            C22190v.b();
            throw null;
        }
        bE2.A();
        if (bE2.f37887P) {
            bE2.b(aVar3);
        } else {
            bE2.d();
        }
        R3.b(pVar4, bE2, iA3);
        R3.b(pVar3, bE2, o1S4);
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i16))) {
            AK.c.y(i16, bE2, i16, pVar2);
        }
        R3.b(pVar, bE2, vVarC4);
        com.akita.compose.foundation.ui.p.b(aVar.f79630b, iVar.f65242m, null, false, 0L, null, 0, 0, false, null, bE2, 0, 1020);
        com.avito.android.lib.compose.design.component.attributedtext.a.b(aVar.f79631c, null, R.attr.textS10, j.f79587l, new k(aVar, lVar), 0, bE2, 3080, 34);
        C22039c2 c22039c2N = com.avito.android.actions_sheet.a.n(bE2, true, true);
        if (c22039c2N != null) {
            c22039c2N.f38184d = new l(aVar, lVar, vVar, z12, i12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void b(@Y61.k InterfaceC22204y1 interfaceC22204y1, @Y61.k Y41.l lVar, @Y61.k Y41.l lVar2, @Y61.k Y41.p pVar, @Y61.l androidx.compose.ui.v vVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B b12;
        androidx.compose.ui.v vVar2;
        androidx.compose.runtime.B bE2 = a12.E(-915508446);
        int i13 = i12 | (bE2.B(interfaceC22204y1) ? 4 : 2) | (bE2.u(lVar) ? 32 : 16) | (bE2.u(lVar2) ? 256 : 128) | (bE2.u(pVar) ? 2048 : 1024) | 24576;
        if ((46811 & i13) == 9362 && bE2.c()) {
            bE2.f();
            vVar2 = vVar;
            b12 = bE2;
        } else {
            v.a aVar = androidx.compose.ui.v.f42878y1;
            y yVar = (y) interfaceC22204y1.getF42167b();
            if (yVar == null) {
                C22039c2 c22039c2Z = bE2.Z();
                if (c22039c2Z != null) {
                    c22039c2Z.f38184d = new r(interfaceC22204y1, lVar, lVar2, pVar, aVar, i12);
                    return;
                }
                return;
            }
            float f12 = 16;
            h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
            androidx.compose.ui.v vVarK = R1.k(f12, 0.0f, 2, aVar);
            C20585k.f28659a.getClass();
            C20585k.l lVar3 = C20585k.f28662d;
            InterfaceC22215f.f39074a.getClass();
            I iA2 = H.a(lVar3, InterfaceC22215f.a.f39088n, bE2, 0);
            int i14 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarK);
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
            Y41.p<InterfaceC22413h, Integer, G0> pVar2 = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar2);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            K k12 = K.f28344a;
            com.avito.android.lib.compose.design.component.attributedtext.a.b(yVar.f79624a, null, R.attr.textH30, m.f79595l, new n(yVar, lVar), 0, bE2, 3080, 34);
            float f13 = 4;
            com.avito.android.lib.compose.design.component.attributedtext.a.b(yVar.f79625b, R1.m(aVar, 0.0f, f13, 0.0f, 0.0f, 13), R.attr.textM10, o.f79598l, new p(yVar, lVar), 0, bE2, 3128, 32);
            C20608p2.a(bE2, C20588k2.f(aVar, f12));
            bE2.C(529638760);
            List<y.a> list = yVar.f79626c;
            int i15 = 0;
            for (Object obj : list) {
                int i16 = i15 + 1;
                if (i15 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                a((y.a) obj, lVar, R1.m(androidx.compose.ui.v.f42878y1, 0.0f, f13, 0.0f, 0.0f, 13), i15 != C42745f0.J(list), bE2, (i13 & 112) | 392);
                i15 = i16;
                yVar = yVar;
                i13 = i13;
            }
            y yVar2 = yVar;
            int i17 = i13;
            bE2.X(false);
            bE2.C(529651048);
            y.b bVar = yVar2.f79627d;
            if (bVar != null) {
                v.a aVar4 = androidx.compose.ui.v.f42878y1;
                C20608p2.a(bE2, C20588k2.f(aVar4, 20));
                c(lVar, bVar, C20588k2.d(aVar4, 1.0f), bE2, ((i17 >> 3) & 14) | 448);
            }
            bE2.X(false);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            int i18 = i17 >> 3;
            b12 = bE2;
            com.avito.android.advert.item.select.number_input.e.a(yVar2.f79628e, lVar2, pVar, lVar, com.akita.compose.theme.re23.b.l(bE2).getF66388c(), bE2, (i18 & 896) | (i18 & 112) | 8 | ((i17 << 6) & 7168), 16);
            b12.X(true);
            vVar2 = aVar;
        }
        C22039c2 c22039c2Z2 = b12.Z();
        if (c22039c2Z2 != null) {
            c22039c2Z2.f38184d = new q(interfaceC22204y1, lVar, lVar2, pVar, vVar2, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void c(Y41.l lVar, y.b bVar, androidx.compose.ui.v vVar, androidx.compose.runtime.A a12, int i12) {
        Y41.p<InterfaceC22413h, androidx.compose.ui.v, G0> pVar;
        Y41.p<InterfaceC22413h, Integer, G0> pVar2;
        Y41.p<InterfaceC22413h, U, G0> pVar3;
        Y41.p<InterfaceC22413h, InterfaceC22365i0, G0> pVar4;
        InterfaceC22078i<?> interfaceC22078i;
        androidx.compose.runtime.B bE2 = a12.E(-682646366);
        com.akita.compose.foundation.p pVarA = C26932a.a(bVar.f79635d);
        if (pVarA == null) {
            C22039c2 c22039c2Z = bE2.Z();
            if (c22039c2Z != null) {
                c22039c2Z.f38184d = new w(lVar, bVar, vVar, i12);
                return;
            }
            return;
        }
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        androidx.compose.ui.v vVarI = R1.i(androidx.compose.foundation.A.b(androidx.compose.ui.draw.k.a(vVar, androidx.compose.foundation.shape.o.a(20)), pVarA.c(bE2), Y0.f39346a), 12);
        InterfaceC22215f.f39074a.getClass();
        i.b bVar2 = InterfaceC22215f.a.f39086l;
        C20585k.f28659a.getClass();
        C20568f2 c20568f2A = C20563e2.a(C20585k.f28660b, bVar2, bE2, 48);
        int i13 = bE2.f37888Q;
        O1 o1S = bE2.S();
        androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarI);
        InterfaceC22413h.f40789C1.getClass();
        Y41.a<InterfaceC22413h> aVar2 = InterfaceC22413h.a.f40791b;
        InterfaceC22078i<?> interfaceC22078i2 = bE2.f37890b;
        if (interfaceC22078i2 == null) {
            C22190v.b();
            throw null;
        }
        bE2.A();
        if (bE2.f37887P) {
            bE2.b(aVar2);
        } else {
            bE2.d();
        }
        Y41.p<InterfaceC22413h, InterfaceC22365i0, G0> pVar5 = InterfaceC22413h.a.f40796g;
        R3.b(pVar5, bE2, c20568f2A);
        Y41.p<InterfaceC22413h, U, G0> pVar6 = InterfaceC22413h.a.f40795f;
        R3.b(pVar6, bE2, o1S);
        Y41.p<InterfaceC22413h, Integer, G0> pVar7 = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i13))) {
            AK.c.y(i13, bE2, i13, pVar7);
        }
        Y41.p<InterfaceC22413h, androidx.compose.ui.v, G0> pVar8 = InterfaceC22413h.a.f40793d;
        R3.b(pVar8, bE2, vVarC);
        C20576h2 c20576h2 = C20576h2.f28641a;
        androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) bE2.o(Q0.f41199h);
        float f12 = 46;
        Uri uriC = C35829k2.b(bVar.f79633b, kotlin.math.b.b(dVar.M0(f12)), kotlin.math.b.b(dVar.M0(f12)), 0.0f, 1, 44).c(u.f79614b);
        bE2.C(-1647785395);
        if (uriC == null) {
            pVar = pVar8;
            pVar2 = pVar7;
            pVar3 = pVar6;
            pVar4 = pVar5;
            interfaceC22078i = interfaceC22078i2;
        } else {
            pVar = pVar8;
            pVar2 = pVar7;
            pVar3 = pVar6;
            pVar4 = pVar5;
            interfaceC22078i = interfaceC22078i2;
            coil.compose.v.b(uriC, null, C20588k2.o(androidx.compose.ui.v.f42878y1, f12), null, null, null, bE2, 440, 4088);
        }
        bE2.X(false);
        v.a aVar3 = androidx.compose.ui.v.f42878y1;
        C20608p2.a(bE2, C20588k2.t(aVar3, 8));
        I iA2 = H.a(C20585k.f28662d, InterfaceC22215f.a.f39088n, bE2, 0);
        int i14 = bE2.f37888Q;
        O1 o1S2 = bE2.S();
        androidx.compose.ui.v vVarC2 = androidx.compose.ui.n.c(bE2, aVar3);
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
        R3.b(pVar4, bE2, iA2);
        R3.b(pVar3, bE2, o1S2);
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
            AK.c.y(i14, bE2, i14, pVar2);
        }
        R3.b(pVar, bE2, vVarC2);
        K k12 = K.f28344a;
        com.akita.compose.theme.re23.b.f63983a.getClass();
        com.akita.compose.foundation.ui.p.b(bVar.f79632a, com.akita.compose.theme.re23.b.f63988f.f65242m, null, false, 0L, null, 0, 0, false, null, bE2, 0, 1020);
        com.avito.android.lib.compose.design.component.attributedtext.a.b(bVar.f79634c, null, R.attr.textS10, s.f79611l, new t(bVar, lVar), 0, bE2, 3080, 34);
        C22039c2 c22039c2N = com.avito.android.actions_sheet.a.n(bE2, true, true);
        if (c22039c2N != null) {
            c22039c2N.f38184d = new v(lVar, bVar, vVar, i12);
        }
    }
}
