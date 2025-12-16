package com.avito.android.installments.fakedoor;

import Y41.p;
import androidx.appcompat.app.r;
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
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.U;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.i;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.n;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import c3.C26932a;
import com.avito.android.R;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: InstallmentsFakedoorScreen.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class i extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SN.d f172555l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(SN.d dVar) {
        super(2);
        this.f172555l = dVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) throws Throwable {
        Integer numD;
        SN.d dVar;
        C20576h2 c20576h2;
        Throwable th2;
        com.akita.compose.foundation.p pVarA;
        String colorKey;
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            v.a aVar = v.f42878y1;
            h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
            v vVarJ = R1.j(C20588k2.w(aVar, null, 3), 14, 10);
            InterfaceC22215f.f39074a.getClass();
            i.b bVar = InterfaceC22215f.a.f39086l;
            C20585k.f28659a.getClass();
            C20568f2 c20568f2A = C20563e2.a(C20585k.f28666h, bVar, a13, 54);
            int f37888q = a13.getF37888Q();
            O1 o1Y = a13.y();
            v vVarC = n.c(a13, vVarJ);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar3 = InterfaceC22413h.a.f40791b;
            if (a13.F() == null) {
                C22190v.b();
                throw null;
            }
            a13.A();
            if (a13.getF37887P()) {
                a13.b(aVar3);
            } else {
                a13.d();
            }
            p<InterfaceC22413h, InterfaceC22365i0, G0> pVar = InterfaceC22413h.a.f40796g;
            R3.b(pVar, a13, c20568f2A);
            p<InterfaceC22413h, U, G0> pVar2 = InterfaceC22413h.a.f40795f;
            R3.b(pVar2, a13, o1Y);
            p<InterfaceC22413h, Integer, G0> pVar3 = InterfaceC22413h.a.f40799j;
            if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q))) {
                r.B(f37888q, a13, f37888q, pVar3);
            }
            p<InterfaceC22413h, v, G0> pVar4 = InterfaceC22413h.a.f40793d;
            R3.b(pVar4, a13, vVarC);
            C20576h2 c20576h22 = C20576h2.f28641a;
            C20568f2 c20568f2A2 = C20563e2.a(C20585k.f28660b, bVar, a13, 48);
            int f37888q2 = a13.getF37888Q();
            O1 o1Y2 = a13.y();
            v vVarC2 = n.c(a13, aVar);
            if (a13.F() == null) {
                C22190v.b();
                throw null;
            }
            a13.A();
            if (a13.getF37887P()) {
                a13.b(aVar3);
            } else {
                a13.d();
            }
            R3.b(pVar, a13, c20568f2A2);
            R3.b(pVar2, a13, o1Y2);
            if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q2))) {
                r.B(f37888q2, a13, f37888q2, pVar3);
            }
            R3.b(pVar4, a13, vVarC2);
            SN.d dVar2 = this.f172555l;
            String name = dVar2.f14948d.getName();
            if (name != null) {
                com.akita.compose.theme.re23.b.f63983a.getClass();
                com.akita.compose.theme.re23.b.f63985c.getClass();
                numD = com.akita.compose.theme.re23.e.d(name);
            } else {
                numD = null;
            }
            a13.C(2070175959);
            if (numD != null) {
                UniversalColor color = dVar2.f14948d.getColor();
                if (color == null || (colorKey = color.getColorKey()) == null || (pVarA = C26932a.a(colorKey)) == null) {
                    com.akita.compose.theme.re23.b.f63983a.getClass();
                    pVarA = com.akita.compose.theme.re23.b.f63984b.f63938l;
                }
                com.akita.compose.foundation.p pVar5 = pVarA;
                v vVarO = C20588k2.o(aVar, 44);
                com.akita.compose.theme.re23.b.f63983a.getClass();
                float f12 = 12;
                v vVarB = androidx.compose.foundation.A.b(vVarO, com.akita.compose.theme.re23.b.f63984b.f63851H1.c(a13), o.a(f12));
                InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39080f, false);
                int f37888q3 = a13.getF37888Q();
                O1 o1Y3 = a13.y();
                v vVarC3 = n.c(a13, vVarB);
                if (a13.F() == null) {
                    C22190v.b();
                    throw null;
                }
                a13.A();
                if (a13.getF37887P()) {
                    a13.b(aVar3);
                } else {
                    a13.d();
                }
                R3.b(pVar, a13, interfaceC22365i0D);
                R3.b(pVar2, a13, o1Y3);
                if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q3))) {
                    r.B(f37888q3, a13, f37888q3, pVar3);
                }
                R3.b(pVar4, a13, vVarC3);
                C20644z c20644z = C20644z.f28804a;
                dVar = dVar2;
                c20576h2 = c20576h22;
                com.akita.compose.foundation.ui.e.a(u0.e.a(numD.intValue(), 0, a13), null, null, pVar5, a13, 56, 4);
                a13.z();
                th2 = null;
                com.akita.compose.foundation.ui.g.b(f12, null, a13, 6, 2);
            } else {
                dVar = dVar2;
                c20576h2 = c20576h22;
                th2 = null;
            }
            a13.h();
            v vVarA = c20576h2.a(aVar, 1.0f, true);
            I iA2 = H.a(C20585k.f28662d, InterfaceC22215f.a.f39088n, a13, 0);
            int f37888q4 = a13.getF37888Q();
            O1 o1Y4 = a13.y();
            v vVarC4 = n.c(a13, vVarA);
            if (a13.F() == null) {
                Throwable th3 = th2;
                C22190v.b();
                throw th3;
            }
            a13.A();
            if (a13.getF37887P()) {
                a13.b(aVar3);
            } else {
                a13.d();
            }
            R3.b(pVar, a13, iA2);
            R3.b(pVar2, a13, o1Y4);
            if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q4))) {
                r.B(f37888q4, a13, f37888q4, pVar3);
            }
            R3.b(pVar4, a13, vVarC4);
            K k12 = K.f28344a;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            SN.d dVar3 = dVar;
            com.akita.compose.foundation.ui.p.b(dVar3.f14945a, com.akita.compose.theme.re23.b.f63988f.f65241l, null, false, 0L, null, 0, 0, false, null, a13, 0, 1020);
            float f13 = 2;
            com.akita.compose.foundation.ui.g.a(f13, null, a13, 6);
            a13.C(-1532724926);
            AttributedText attributedText = dVar3.f14946b;
            if (attributedText != null) {
                com.avito.android.lib.compose.design.component.attributedtext.a.b(attributedText, C20588k2.d(aVar, 1.0f), R.attr.textS20, null, null, 0, a13, 56, 56);
            }
            a13.h();
            com.akita.compose.foundation.ui.g.a(f13, null, a13, 6);
            a13.z();
            com.akita.compose.foundation.ui.g.b(12, null, a13, 6, 2);
            com.akita.compose.theme.re23.b.f63985c.getClass();
            com.akita.compose.foundation.ui.e.a(u0.e.a(com.akita.compose.theme.re23.e.f64527f0, 0, a13), "", null, com.akita.compose.theme.re23.b.f63984b.f63938l, a13, 56, 4);
            a13.z();
            a13.z();
        }
        return G0.f406611a;
    }
}
