package com.avito.android.services_portfolio.project.components;

import Y41.p;
import Y61.k;
import Y61.l;
import android.content.Context;
import androidx.compose.foundation.C21086w0;
import androidx.compose.foundation.interaction.m;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22078i;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22196w1;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.U;
import androidx.compose.runtime.U2;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.n;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.v;
import com.akita.compose.component.accordion.s;
import com.akita.compose.foundation.r;
import com.avito.android.R;
import com.avito.android.remote.model.SearchParamsConverterKt;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ExpandableText.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0004²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002"}, d2 = {"", "lineCount", "", SearchParamsConverterKt.EXPANDED, "_avito_services-portfolio_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e {
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(int i12, int i13, @l Y41.a aVar, @l A a12, @l v vVar, @k String str) {
        Y41.a aVar2;
        int i14;
        boolean z12;
        Y41.a aVar3;
        Y41.a aVar4;
        Y41.a aVar5;
        B bE2 = a12.E(-1227246696);
        int i15 = i12 | (bE2.B(str) ? 4 : 2);
        int i16 = i13 & 8;
        if (i16 != 0) {
            i14 = i15 | 3072;
            aVar2 = aVar;
        } else {
            aVar2 = aVar;
            i14 = i15 | (bE2.u(aVar2) ? 2048 : 1024);
        }
        int i17 = i14;
        if ((i17 & 5851) == 1170 && bE2.c()) {
            bE2.f();
            aVar4 = aVar2;
        } else {
            Y41.a aVar6 = i16 != 0 ? null : aVar2;
            bE2.C(-1896704759);
            Object objT = bE2.t();
            A.f37866a.getClass();
            A.a.C1651a c1651a = A.a.f37868b;
            if (objT == c1651a) {
                objT = U2.a(0);
                bE2.H(objT);
            }
            InterfaceC22196w1 interfaceC22196w1 = (InterfaceC22196w1) objT;
            Object objI = s.i(-1896703030, bE2, false);
            if (objI == c1651a) {
                objI = C22126m3.g(Boolean.FALSE);
                bE2.H(objI);
            }
            InterfaceC22204y1 interfaceC22204y1 = (InterfaceC22204y1) objI;
            bE2.X(false);
            int i18 = ((Boolean) interfaceC22204y1.getF42167b()).booleanValue() ? Integer.MAX_VALUE : 4;
            InterfaceC22215f.f39074a.getClass();
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
            int i19 = bE2.f37888Q;
            O1 o1S = bE2.S();
            v vVarC = n.c(bE2, vVar);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar7 = InterfaceC22413h.a.f40791b;
            InterfaceC22078i<?> interfaceC22078i = bE2.f37890b;
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
            p<InterfaceC22413h, InterfaceC22365i0, G0> pVar = InterfaceC22413h.a.f40796g;
            R3.b(pVar, bE2, interfaceC22365i0D);
            p<InterfaceC22413h, U, G0> pVar2 = InterfaceC22413h.a.f40795f;
            R3.b(pVar2, bE2, o1S);
            p<InterfaceC22413h, Integer, G0> pVar3 = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i19))) {
                AK.c.y(i19, bE2, i19, pVar3);
            }
            p<InterfaceC22413h, v, G0> pVar4 = InterfaceC22413h.a.f40793d;
            R3.b(pVar4, bE2, vVarC);
            C20644z c20644z = C20644z.f28804a;
            v.a aVar8 = v.f42878y1;
            C20585k.f28659a.getClass();
            I iA2 = H.a(C20585k.f28662d, InterfaceC22215f.a.f39088n, bE2, 0);
            int i22 = bE2.f37888Q;
            O1 o1S2 = bE2.S();
            Y41.a aVar9 = aVar6;
            v vVarC2 = n.c(bE2, aVar8);
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
            R3.b(pVar, bE2, iA2);
            R3.b(pVar2, bE2, o1S2);
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i22))) {
                AK.c.y(i22, bE2, i22, pVar3);
            }
            R3.b(pVar4, bE2, vVarC2);
            K k12 = K.f28344a;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.i iVar = com.akita.compose.theme.re23.b.f63988f;
            r rVar = iVar.f65240k;
            com.akita.compose.theme.re23.a aVar10 = com.akita.compose.theme.re23.b.f63984b;
            long jC2 = aVar10.f63938l.c(bE2);
            androidx.compose.ui.text.style.s.f42720b.getClass();
            int i23 = androidx.compose.ui.text.style.s.f42722d;
            bE2.C(-35996206);
            Object objT2 = bE2.t();
            if (objT2 == c1651a) {
                objT2 = new b(interfaceC22196w1);
                bE2.H(objT2);
            }
            bE2.X(false);
            com.akita.compose.foundation.ui.p.b(str, rVar, aVar8, false, jC2, null, i18, i23, false, (Y41.l) objT2, bE2, (i17 & 14) | 817889664, 296);
            bE2.C(-35991145);
            if (((Boolean) interfaceC22204y1.getF42167b()).booleanValue() || interfaceC22196w1.e() < 4) {
                z12 = true;
                aVar3 = aVar9;
            } else {
                bE2.C(-35984179);
                Object objT3 = bE2.t();
                if (objT3 == c1651a) {
                    objT3 = androidx.compose.foundation.interaction.l.a();
                    bE2.H(objT3);
                }
                m mVar = (m) objT3;
                bE2.X(false);
                bE2.C(-35981952);
                boolean z13 = (i17 & 7168) == 2048;
                Object objT4 = bE2.t();
                if (z13 || objT4 == c1651a) {
                    aVar5 = aVar9;
                    objT4 = new c(aVar5, interfaceC22204y1);
                    bE2.H(objT4);
                } else {
                    aVar5 = aVar9;
                }
                bE2.X(false);
                v vVarB = C21086w0.b(aVar8, mVar, null, false, null, (Y41.a) objT4, 28);
                C20568f2 c20568f2A = C20563e2.a(C20585k.f28660b, InterfaceC22215f.a.f39085k, bE2, 0);
                int i24 = bE2.f37888Q;
                O1 o1S3 = bE2.S();
                v vVarC3 = n.c(bE2, vVarB);
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
                R3.b(pVar, bE2, c20568f2A);
                R3.b(pVar2, bE2, o1S3);
                if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i24))) {
                    AK.c.y(i24, bE2, i24, pVar3);
                }
                R3.b(pVar4, bE2, vVarC3);
                aVar3 = aVar5;
                z12 = true;
                com.akita.compose.foundation.ui.p.b(((Context) bE2.o(AndroidCompositionLocals_androidKt.f41069b)).getString(R.string.services_portfolio_show_more), iVar.f65241l, C20576h2.f28641a.a(aVar8, 1.0f, false), false, aVar10.f63837D.c(bE2), null, 0, 0, false, null, bE2, 0, 1000);
                bE2.X(true);
            }
            androidx.compose.foundation.H.A(bE2, false, z12, z12);
            aVar4 = aVar3;
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new d(i12, i13, aVar4, vVar, str);
        }
    }
}
