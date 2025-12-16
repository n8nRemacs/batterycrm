package com.avito.android.comfortable_deal.common.view;

import androidx.compose.animation.core.C20283h;
import androidx.compose.foundation.C21086w0;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.I3;
import androidx.compose.runtime.InterfaceC22078i;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.U;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.v;
import com.avito.android.remote.model.SearchParamsConverterKt;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ExpandableText.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002¨\u0006\u0004²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0003\u001a\u00020\u00028\nX\u008a\u0084\u0002"}, d2 = {"", SearchParamsConverterKt.EXPANDED, "", "rotationAngle", "_avito_comfortable-deal_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class j {
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(int i12, int i13, @Y61.l androidx.compose.runtime.A a12, @Y61.l androidx.compose.ui.v vVar, @Y61.k String str) {
        int i14;
        InterfaceC22204y1 interfaceC22204y1;
        androidx.compose.runtime.B b12;
        int i15;
        androidx.compose.runtime.B bE2 = a12.E(-1708728949);
        if ((i13 & 14) == 0) {
            i14 = (bE2.B(str) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 112) == 0) {
            i14 |= bE2.B(vVar) ? 32 : 16;
        }
        int i16 = i14 | 384;
        if ((i16 & 731) == 146 && bE2.c()) {
            bE2.f();
            i15 = i12;
            b12 = bE2;
        } else {
            bE2.C(182146375);
            Object objT = bE2.t();
            androidx.compose.runtime.A.f37866a.getClass();
            A.a.C1651a c1651a = A.a.f37868b;
            if (objT == c1651a) {
                objT = C22126m3.g(Boolean.FALSE);
                bE2.H(objT);
            }
            InterfaceC22204y1 interfaceC22204y12 = (InterfaceC22204y1) objT;
            bE2.X(false);
            I3 i3B = C20283h.b(((Boolean) interfaceC22204y12.getF42167b()).booleanValue() ? 0.0f : 180.0f, null, null, bE2, 0, 30);
            int i17 = ((Boolean) interfaceC22204y12.getF42167b()).booleanValue() ? Integer.MAX_VALUE : 2;
            androidx.compose.ui.v vVarA = C22501m2.a(vVar, "ExpandableContentTag");
            InterfaceC22215f.f39074a.getClass();
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
            int i18 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarA);
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
            R3.b(pVar, bE2, interfaceC22365i0D);
            Y41.p<InterfaceC22413h, U, G0> pVar2 = InterfaceC22413h.a.f40795f;
            R3.b(pVar2, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, G0> pVar3 = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i18))) {
                AK.c.y(i18, bE2, i18, pVar3);
            }
            Y41.p<InterfaceC22413h, androidx.compose.ui.v, G0> pVar4 = InterfaceC22413h.a.f40793d;
            R3.b(pVar4, bE2, vVarC);
            C20644z c20644z = C20644z.f28804a;
            v.a aVar2 = androidx.compose.ui.v.f42878y1;
            androidx.compose.ui.v vVarK = R1.k(16, 0.0f, 2, aVar2);
            C20585k.f28659a.getClass();
            I iA2 = H.a(C20585k.f28662d, InterfaceC22215f.a.f39088n, bE2, 0);
            int i19 = bE2.f37888Q;
            O1 o1S2 = bE2.S();
            androidx.compose.ui.v vVarC2 = androidx.compose.ui.n.c(bE2, vVarK);
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
            R3.b(pVar, bE2, iA2);
            R3.b(pVar2, bE2, o1S2);
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i19))) {
                AK.c.y(i19, bE2, i19, pVar3);
            }
            R3.b(pVar4, bE2, vVarC2);
            K k12 = K.f28344a;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.i iVar = com.akita.compose.theme.re23.b.f63988f;
            com.akita.compose.foundation.r rVar = iVar.f65240k;
            com.akita.compose.theme.re23.a aVar3 = com.akita.compose.theme.re23.b.f63984b;
            long jC2 = aVar3.f63938l.c(bE2);
            androidx.compose.ui.text.style.s.f42720b.getClass();
            com.akita.compose.foundation.ui.p.b(str, rVar, C22501m2.a(aVar2, "ExpandableTextTag"), false, jC2, null, i17, androidx.compose.ui.text.style.s.f42722d, false, null, bE2, (i16 & 14) | 12583296, 808);
            bE2.C(-1643274678);
            Object objT2 = bE2.t();
            if (objT2 == c1651a) {
                objT2 = androidx.compose.foundation.interaction.l.a();
                bE2.H(objT2);
            }
            androidx.compose.foundation.interaction.m mVar = (androidx.compose.foundation.interaction.m) objT2;
            Object objI = com.akita.compose.component.accordion.s.i(-1643272677, bE2, false);
            if (objI == c1651a) {
                interfaceC22204y1 = interfaceC22204y12;
                objI = new h(interfaceC22204y1);
                bE2.H(objI);
            } else {
                interfaceC22204y1 = interfaceC22204y12;
            }
            bE2.X(false);
            androidx.compose.ui.v vVarA2 = C22501m2.a(C21086w0.b(aVar2, mVar, null, false, null, (Y41.a) objI, 28), "ExpandableButtonTag");
            C20568f2 c20568f2A = C20563e2.a(C20585k.f28660b, InterfaceC22215f.a.f39085k, bE2, 0);
            int i22 = bE2.f37888Q;
            O1 o1S3 = bE2.S();
            androidx.compose.ui.v vVarC3 = androidx.compose.ui.n.c(bE2, vVarA2);
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
            R3.b(pVar, bE2, c20568f2A);
            R3.b(pVar2, bE2, o1S3);
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i22))) {
                AK.c.y(i22, bE2, i22, pVar3);
            }
            R3.b(pVar4, bE2, vVarC3);
            com.akita.compose.foundation.ui.p.b(((Boolean) interfaceC22204y1.getF42167b()).booleanValue() ? "Свернуть" : "Развернуть", iVar.f65241l, C20576h2.f28641a.a(aVar2, 1.0f, false), false, aVar3.f63918e0.c(bE2), null, 0, 0, false, null, bE2, 0, 1000);
            com.akita.compose.theme.re23.b.f63985c.getClass();
            b12 = bE2;
            com.akita.compose.foundation.ui.e.a(u0.e.a(com.akita.compose.theme.re23.e.f64352V, 0, b12), null, androidx.compose.ui.draw.u.a(R1.m(aVar2, 0.0f, 3, 0.0f, 0.0f, 13), ((Number) i3B.getF42167b()).floatValue()), aVar3.f63918e0, b12, 56, 0);
            androidx.compose.foundation.H.A(b12, true, true, true);
            i15 = 2;
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new i(i15, i13, vVar, str);
        }
    }
}
