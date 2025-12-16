package com.avito.android.mortgage.consultation;

import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22137p;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: MortgageConsultationScreen.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_mortgage_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class B {
    /* JADX WARN: Removed duplicated region for block: B:135:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0739  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(XZ.d r45, Y41.a r46, Y41.l r47, Y41.l r48, Y41.l r49, Y41.l r50, Y41.a r51, androidx.compose.ui.v r52, androidx.compose.runtime.A r53, int r54) {
        /*
            Method dump skipped, instructions count: 1859
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.consultation.B.a(XZ.d, Y41.a, Y41.l, Y41.l, Y41.l, Y41.l, Y41.a, androidx.compose.ui.v, androidx.compose.runtime.A, int):void");
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void b(int i12, Y41.a aVar, androidx.compose.runtime.A a12, androidx.compose.ui.v vVar) {
        int i13;
        androidx.compose.runtime.B b12;
        androidx.compose.runtime.B bE2 = a12.E(970871214);
        if ((i12 & 14) == 0) {
            i13 = (bE2.u(aVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        int i14 = i13 | (bE2.B(vVar) ? 32 : 16);
        if ((i14 & 91) == 18 && bE2.c()) {
            bE2.f();
            b12 = bE2;
        } else {
            C32582a.f198530a.getClass();
            C22096n c22096n = C32582a.f198531b;
            String strC = u0.i.c(bE2, R.string.mortgage_consultation_loading_failed_title);
            String strC2 = u0.i.c(bE2, R.string.mortgage_consultation_loading_failed_subtitle);
            String strC3 = u0.i.c(bE2, R.string.mortgage_consultation_loading_failed_action);
            h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
            b12 = bE2;
            com.akita.compose.component.content_placeholder.b.a(c22096n, strC, strC2, strC3, aVar, C20588k2.d(C20588k2.h(482, 0.0f, 2, vVar), 1.0f), null, null, false, false, bE2, ((i14 << 12) & 57344) | 6, 960);
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new w(i12, aVar, vVar);
        }
    }

    @InterfaceC22132o
    @InterfaceC22137p
    public static final void c(String str, C22096n c22096n, v.a aVar, androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B b12;
        v.a aVar2;
        androidx.compose.runtime.B bE2 = a12.E(-1082183205);
        int i13 = i12 | (bE2.B(str) ? 4 : 2) | 384;
        if ((i13 & 731) == 146 && bE2.c()) {
            bE2.f();
            aVar2 = aVar;
            b12 = bE2;
        } else {
            v.a aVar3 = androidx.compose.ui.v.f42878y1;
            androidx.compose.ui.v vVarD = C20588k2.d(aVar3, 1.0f);
            C20585k c20585k = C20585k.f28659a;
            h.a aVar4 = androidx.compose.ui.unit.h.f42849c;
            c20585k.getClass();
            C20585k.j jVarG = C20585k.g(12);
            InterfaceC22215f.f39074a.getClass();
            I iA2 = H.a(jVarG, InterfaceC22215f.a.f39088n, bE2, 6);
            int i14 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarD);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar5 = InterfaceC22413h.a.f40791b;
            if (bE2.f37890b == null) {
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
            com.akita.compose.theme.re23.b.f63983a.getClass();
            b12 = bE2;
            com.akita.compose.foundation.ui.p.b(str, com.akita.compose.theme.re23.b.f63988f.f65239j, null, false, 0L, null, 0, 0, false, null, bE2, i13 & 14, 1020);
            androidx.compose.foundation.H.v(6, c22096n, b12, true);
            aVar2 = aVar3;
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new x(str, c22096n, aVar2, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void d(androidx.compose.ui.v vVar, androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(1216101448);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(vVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i13 & 11) == 2 && bE2.c()) {
            bE2.f();
        } else {
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            androidx.compose.ui.v vVarD = C20588k2.d(C20588k2.f(vVar, 482), 1.0f);
            InterfaceC22215f.f39074a.getClass();
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39080f, false);
            int i14 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarD);
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
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.component.spinner.b.a(com.akita.compose.theme.re23.b.r(bE2).getF66694c(), null, bE2, 0, 2);
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new y(vVar, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void e(@Y61.k XZ.d dVar, @Y61.k InterfaceC43160i interfaceC43160i, @Y61.k Y41.l lVar, @Y61.k Y41.l lVar2, @Y61.k Y41.a aVar, @Y61.k Y41.a aVar2, @Y61.k Y41.l lVar3, @Y61.k Y41.l lVar4, @Y61.k Y41.l lVar5, @Y61.k Y41.l lVar6, @Y61.k Y41.a aVar3, @Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(1686827057);
        v.a aVar4 = androidx.compose.ui.v.f42878y1;
        C22187u0.f(interfaceC43160i, lVar, lVar2, new z(interfaceC43160i, lVar2, lVar, null), bE2);
        boolean z12 = dVar.f18920i;
        if (z12) {
            bE2.C(1836520224);
            d(aVar4, bE2, 0);
            bE2.X(false);
        } else if (z12 || !dVar.f18918g.isEmpty()) {
            bE2.C(1836524552);
            a(dVar, aVar, lVar3, lVar4, lVar5, lVar6, aVar3, aVar4, bE2, 0);
            bE2.X(false);
        } else {
            bE2.C(1836522639);
            b(0, aVar2, bE2, aVar4);
            bE2.X(false);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new A(dVar, interfaceC43160i, lVar, lVar2, aVar, aVar2, lVar3, lVar4, lVar5, lVar6, aVar3, aVar4, i12);
        }
    }
}
