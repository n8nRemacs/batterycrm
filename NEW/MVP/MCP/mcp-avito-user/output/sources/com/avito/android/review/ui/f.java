package com.avito.android.review.ui;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.C21086w0;
import androidx.compose.foundation.interaction.m;
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
import androidx.compose.foundation.shape.o;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22078i;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.U;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.draw.u;
import androidx.compose.ui.graphics.Y0;
import androidx.compose.ui.i;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.n;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.text.font.e0;
import androidx.compose.ui.text.style.s;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.unit.z;
import androidx.compose.ui.v;
import bn0.C25683a;
import com.adjust.sdk.network.ErrorCodes;
import com.akita.compose.foundation.r;
import com.avito.android.remote.model.SearchParamsConverterKt;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: ReivewComponent.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", SearchParamsConverterKt.EXPANDED, "_avito_comfortable-deal-reviews_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@k String str, @l v vVar, @l A a12, int i12) {
        v vVar2;
        B bE2 = a12.E(-1774262727);
        if ((((bE2.B(str) ? 4 : 2) | i12 | 48) & 91) == 18 && bE2.c()) {
            bE2.f();
            vVar2 = vVar;
        } else {
            v.a aVar = v.f42878y1;
            h.a aVar2 = h.f42849c;
            v vVarA = androidx.compose.ui.draw.k.a(C20588k2.o(aVar, 40), o.f30153a);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            v vVarB = androidx.compose.foundation.A.b(vVarA, com.akita.compose.theme.re23.b.f63984b.f63973w1.c(bE2), Y0.f39346a);
            InterfaceC22215f.f39074a.getClass();
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39080f, false);
            int i13 = bE2.f37888Q;
            O1 o1S = bE2.S();
            v vVarC = n.c(bE2, vVarB);
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
            p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i13))) {
                AK.c.y(i13, bE2, i13, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            C20644z c20644z = C20644z.f28804a;
            String strT0 = C43066x.t0(1, str);
            r rVar = com.akita.compose.theme.re23.b.f63988f.f65233d;
            long jE2 = z.e(26);
            e0.f42240c.getClass();
            com.akita.compose.foundation.ui.p.b(strT0, r.a(rVar, null, jE2, 0L, e0.f42241d, 0L, 0L, ErrorCodes.MALFORMED_URL_EXCEPTION), null, false, 0L, null, 0, 0, false, null, bE2, 0, 1020);
            bE2.X(true);
            vVar2 = aVar;
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new a(i12, vVar2, str);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void b(int i12, @l v.a aVar, @l A a12, int i13) {
        B bE2 = a12.E(-1354432508);
        if ((((bE2.m(i12) ? 4 : 2) | i13) & 11) == 2 && bE2.c()) {
            bE2.f();
        } else {
            aVar = v.f42878y1;
            C20585k.f28659a.getClass();
            C20585k.C1589k c1589k = C20585k.f28660b;
            InterfaceC22215f.f39074a.getClass();
            C20568f2 c20568f2A = C20563e2.a(c1589k, InterfaceC22215f.a.f39085k, bE2, 0);
            int i14 = bE2.f37888Q;
            O1 o1S = bE2.S();
            v vVarC = n.c(bE2, aVar);
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
            p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            C20576h2 c20576h2 = C20576h2.f28641a;
            bE2.C(1152193086);
            int i15 = 0;
            while (i15 < 5) {
                com.akita.compose.theme.re23.b.f63983a.getClass();
                com.akita.compose.theme.re23.b.f63985c.getClass();
                androidx.compose.ui.graphics.painter.e eVarA = u0.e.a(com.akita.compose.theme.re23.e.f64879zb, 0, bE2);
                h.a aVar3 = h.f42849c;
                com.akita.compose.foundation.ui.e.a(eVarA, null, R1.m(v.f42878y1, 0.0f, 3, 0.0f, 0.0f, 13), i15 < i12 ? com.akita.compose.theme.re23.b.f63984b.f63981z0 : com.akita.compose.theme.re23.b.f63984b.f63894W, bE2, 440, 0);
                i15++;
            }
            bE2.X(false);
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new b(i12, aVar, i13);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void c(@k C25683a c25683a, @l A a12, int i12) {
        p<InterfaceC22413h, Integer, G0> pVar;
        B bE2 = a12.E(-893658192);
        v.a aVar = v.f42878y1;
        C20585k.f28659a.getClass();
        C20585k.l lVar = C20585k.f28662d;
        InterfaceC22215f.f39074a.getClass();
        i.a aVar2 = InterfaceC22215f.a.f39088n;
        I iA2 = H.a(lVar, aVar2, bE2, 0);
        int i13 = bE2.f37888Q;
        O1 o1S = bE2.S();
        v vVarC = n.c(bE2, aVar);
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
        p<InterfaceC22413h, InterfaceC22365i0, G0> pVar2 = InterfaceC22413h.a.f40796g;
        R3.b(pVar2, bE2, iA2);
        p<InterfaceC22413h, U, G0> pVar3 = InterfaceC22413h.a.f40795f;
        R3.b(pVar3, bE2, o1S);
        p<InterfaceC22413h, Integer, G0> pVar4 = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i13))) {
            AK.c.y(i13, bE2, i13, pVar4);
        }
        p<InterfaceC22413h, v, G0> pVar5 = InterfaceC22413h.a.f40793d;
        R3.b(pVar5, bE2, vVarC);
        K k12 = K.f28344a;
        v vVarD = C20588k2.d(aVar, 1.0f);
        C20585k.C1589k c1589k = C20585k.f28660b;
        i.b bVar = InterfaceC22215f.a.f39085k;
        C20568f2 c20568f2A = C20563e2.a(c1589k, bVar, bE2, 6);
        int i14 = bE2.f37888Q;
        O1 o1S2 = bE2.S();
        v vVarC2 = n.c(bE2, vVarD);
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
        R3.b(pVar2, bE2, c20568f2A);
        R3.b(pVar3, bE2, o1S2);
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
            AK.c.y(i14, bE2, i14, pVar4);
        }
        R3.b(pVar5, bE2, vVarC2);
        C20576h2 c20576h2 = C20576h2.f28641a;
        a(c25683a.f57436a, null, bE2, 0);
        float f12 = 8;
        h.a aVar4 = h.f42849c;
        v vVarD2 = C20588k2.d(R1.m(aVar, f12, 0.0f, 0.0f, 0.0f, 14), 1.0f);
        I iA3 = H.a(lVar, aVar2, bE2, 0);
        int i15 = bE2.f37888Q;
        O1 o1S3 = bE2.S();
        v vVarC3 = n.c(bE2, vVarD2);
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
        R3.b(pVar2, bE2, iA3);
        R3.b(pVar3, bE2, o1S3);
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i15))) {
            pVar = pVar4;
            AK.c.y(i15, bE2, i15, pVar);
        } else {
            pVar = pVar4;
        }
        R3.b(pVar5, bE2, vVarC3);
        com.akita.compose.theme.re23.b.f63983a.getClass();
        com.akita.compose.theme.re23.i iVar = com.akita.compose.theme.re23.b.f63988f;
        r rVar = iVar.f65241l;
        v vVarD3 = C20588k2.d(aVar, 1.0f);
        com.akita.compose.theme.re23.a aVar5 = com.akita.compose.theme.re23.b.f63984b;
        p<InterfaceC22413h, Integer, G0> pVar6 = pVar;
        com.akita.compose.foundation.ui.p.b(c25683a.f57436a, rVar, vVarD3, false, aVar5.f63938l.c(bE2), null, 0, 0, false, null, bE2, 384, 1000);
        v vVarD4 = C20588k2.d(aVar, 1.0f);
        com.akita.compose.foundation.p pVar7 = aVar5.f63918e0;
        com.akita.compose.foundation.ui.p.b(c25683a.f57437b, iVar.f65244o, vVarD4, false, pVar7.c(bE2), null, 0, 0, false, null, bE2, 384, 1000);
        bE2.X(true);
        bE2.X(true);
        v vVarD5 = C20588k2.d(R1.m(aVar, 0.0f, f12, 0.0f, 0.0f, 13), 1.0f);
        C20568f2 c20568f2A2 = C20563e2.a(c1589k, bVar, bE2, 0);
        int i16 = bE2.f37888Q;
        O1 o1S4 = bE2.S();
        v vVarC4 = n.c(bE2, vVarD5);
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
        R3.b(pVar2, bE2, c20568f2A2);
        R3.b(pVar3, bE2, o1S4);
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i16))) {
            AK.c.y(i16, bE2, i16, pVar6);
        }
        R3.b(pVar5, bE2, vVarC4);
        b(c25683a.f57438c, null, bE2, 0);
        v vVarA = c20576h2.a(R1.m(aVar, 6, 0.0f, 0.0f, 0.0f, 14), 1.0f, false);
        long jC2 = pVar7.c(bE2);
        s.f42720b.getClass();
        com.akita.compose.foundation.ui.p.b(c25683a.f57439d, iVar.f65241l, vVarA, false, jC2, null, 1, s.f42722d, false, null, bE2, 14155776, 808);
        bE2.X(true);
        d(c25683a.f57440e, R1.m(C20588k2.d(aVar, 1.0f), 0.0f, 4, 0.0f, 0.0f, 13), bE2, 432);
        bE2.X(true);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new c(c25683a, aVar, i12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v20 */
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void d(@k String str, @l v vVar, @l A a12, int i12) {
        ?? r12;
        v.a aVar;
        v vVarD0;
        InterfaceC22204y1 interfaceC22204y1;
        B b12;
        B bE2 = a12.E(-395108694);
        int i13 = i12 | (bE2.B(str) ? 4 : 2);
        if ((i13 & 731) == 146 && bE2.c()) {
            bE2.f();
            b12 = bE2;
        } else {
            bE2.C(2059027926);
            Object objT = bE2.t();
            A.f37866a.getClass();
            A.a.C1651a c1651a = A.a.f37868b;
            if (objT == c1651a) {
                objT = C22126m3.g(Boolean.FALSE);
                bE2.H(objT);
            }
            InterfaceC22204y1 interfaceC22204y12 = (InterfaceC22204y1) objT;
            bE2.X(false);
            int i14 = ((Boolean) interfaceC22204y12.getF42167b()).booleanValue() ? Integer.MAX_VALUE : 3;
            InterfaceC22215f.f39074a.getClass();
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
            int i15 = bE2.f37888Q;
            O1 o1S = bE2.S();
            v vVarC = n.c(bE2, vVar);
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
            R3.b(pVar, bE2, interfaceC22365i0D);
            p<InterfaceC22413h, U, G0> pVar2 = InterfaceC22413h.a.f40795f;
            R3.b(pVar2, bE2, o1S);
            p<InterfaceC22413h, Integer, G0> pVar3 = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i15))) {
                AK.c.y(i15, bE2, i15, pVar3);
            }
            p<InterfaceC22413h, v, G0> pVar4 = InterfaceC22413h.a.f40793d;
            R3.b(pVar4, bE2, vVarC);
            C20644z c20644z = C20644z.f28804a;
            v.a aVar3 = v.f42878y1;
            C20585k.f28659a.getClass();
            I iA2 = H.a(C20585k.f28662d, InterfaceC22215f.a.f39088n, bE2, 0);
            int i16 = bE2.f37888Q;
            O1 o1S2 = bE2.S();
            v vVarC2 = n.c(bE2, aVar3);
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
            R3.b(pVar, bE2, iA2);
            R3.b(pVar2, bE2, o1S2);
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i16))) {
                AK.c.y(i16, bE2, i16, pVar3);
            }
            R3.b(pVar4, bE2, vVarC2);
            K k12 = K.f28344a;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.i iVar = com.akita.compose.theme.re23.b.f63988f;
            r rVar = iVar.f65240k;
            com.akita.compose.theme.re23.a aVar4 = com.akita.compose.theme.re23.b.f63984b;
            long jC2 = aVar4.f63938l.c(bE2);
            s.f42720b.getClass();
            B b13 = bE2;
            com.akita.compose.foundation.ui.p.b(str, rVar, null, false, jC2, null, i14, s.f42722d, false, null, bE2, (i13 & 14) | 12582912, 812);
            h.a aVar5 = h.f42849c;
            v vVarM = R1.m(aVar3, 0.0f, 4, 0.0f, 0.0f, 13);
            if (((Boolean) interfaceC22204y12.getF42167b()).booleanValue()) {
                r12 = 0;
                aVar = aVar3;
                vVarD0 = vVarM.d0(C20588k2.o(aVar, 0));
            } else {
                aVar = aVar3;
                vVarD0 = vVarM;
                r12 = 0;
            }
            b13.C(-331039559);
            Object objT2 = b13.t();
            if (objT2 == c1651a) {
                objT2 = androidx.compose.foundation.interaction.l.a();
                b13.H(objT2);
            }
            m mVar = (m) objT2;
            Object objI = com.akita.compose.component.accordion.s.i(-331037558, b13, r12);
            if (objI == c1651a) {
                interfaceC22204y1 = interfaceC22204y12;
                objI = new d(interfaceC22204y1);
                b13.H(objI);
            } else {
                interfaceC22204y1 = interfaceC22204y12;
            }
            b13.X(r12);
            v vVarB = C21086w0.b(vVarD0, mVar, null, false, null, (Y41.a) objI, 28);
            C20568f2 c20568f2A = C20563e2.a(C20585k.f28660b, InterfaceC22215f.a.f39085k, b13, r12);
            int i17 = b13.f37888Q;
            O1 o1S3 = b13.S();
            v vVarC3 = n.c(b13, vVarB);
            if (interfaceC22078i == null) {
                C22190v.b();
                throw null;
            }
            b13.A();
            if (b13.f37887P) {
                b13.b(aVar2);
            } else {
                b13.d();
            }
            R3.b(pVar, b13, c20568f2A);
            R3.b(pVar2, b13, o1S3);
            if (b13.f37887P || !L.f(b13.t(), Integer.valueOf(i17))) {
                AK.c.y(i17, b13, i17, pVar3);
            }
            R3.b(pVar4, b13, vVarC3);
            com.akita.compose.foundation.ui.p.b(((Boolean) interfaceC22204y1.getF42167b()).booleanValue() ? "Свернуть" : "Показать целиком", iVar.f65241l, C20576h2.f28641a.a(aVar, 1.0f, r12), false, aVar4.f63918e0.c(b13), null, 0, 0, false, null, b13, 0, 1000);
            com.akita.compose.theme.re23.b.f63985c.getClass();
            com.akita.compose.foundation.ui.e.a(u0.e.a(com.akita.compose.theme.re23.e.f64352V, r12, b13), null, u.a(R1.m(aVar, 0.0f, 3, 0.0f, 0.0f, 13), 180.0f), aVar4.f63918e0, b13, 440, 0);
            androidx.compose.foundation.H.A(b13, true, true, true);
            b12 = b13;
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new e(i12, vVar, str);
        }
    }
}
