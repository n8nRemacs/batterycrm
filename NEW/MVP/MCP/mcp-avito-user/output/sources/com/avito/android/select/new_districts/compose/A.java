package com.avito.android.select.new_districts.compose;

import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.lazy.C20650b;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22078i;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.R;
import com.avito.android.select.new_districts.mvi.entity.SelectDistrictViewState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SelectDistrictScreenContent.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "inputText", "_avito_select_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class A {
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k SelectDistrictViewState selectDistrictViewState, @Y61.k Y41.l lVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(-609939933);
        v.a aVar = androidx.compose.ui.v.f42878y1;
        bE2.C(955663991);
        Object objT = bE2.t();
        androidx.compose.runtime.A.f37866a.getClass();
        A.a.C1651a c1651a = A.a.f37868b;
        if (objT == c1651a) {
            objT = C22126m3.g("");
            bE2.H(objT);
        }
        InterfaceC22204y1 interfaceC22204y1 = (InterfaceC22204y1) objT;
        bE2.X(false);
        String str = (String) interfaceC22204y1.getF42167b();
        bE2.C(955666476);
        int i13 = (i12 & 112) ^ 48;
        boolean z12 = (i13 > 32 && bE2.B(lVar)) || (i12 & 48) == 32;
        Object objT2 = bE2.t();
        if (z12 || objT2 == c1651a) {
            objT2 = new C34624k(lVar, interfaceC22204y1, null);
            bE2.H(objT2);
        }
        bE2.X(false);
        C22187u0.e(lVar, str, (Y41.p) objT2, bE2);
        C22187u0.d(new C34625l(selectDistrictViewState, interfaceC22204y1, null), bE2, Boolean.valueOf(selectDistrictViewState.f265831h));
        FillElement fillElement = C20588k2.f28682c;
        aVar.getClass();
        InterfaceC22215f.f39074a.getClass();
        InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
        int i14 = bE2.f37888Q;
        O1 o1S = bE2.S();
        androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, fillElement);
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
        Y41.p<InterfaceC22413h, InterfaceC22365i0, G0> pVar = InterfaceC22413h.a.f40796g;
        R3.b(pVar, bE2, interfaceC22365i0D);
        Y41.p<InterfaceC22413h, androidx.compose.runtime.U, G0> pVar2 = InterfaceC22413h.a.f40795f;
        R3.b(pVar2, bE2, o1S);
        Y41.p<InterfaceC22413h, Integer, G0> pVar3 = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i14))) {
            AK.c.y(i14, bE2, i14, pVar3);
        }
        Y41.p<InterfaceC22413h, androidx.compose.ui.v, G0> pVar4 = InterfaceC22413h.a.f40793d;
        R3.b(pVar4, bE2, vVarC);
        C20644z c20644z = C20644z.f28804a;
        aVar.getClass();
        C20585k.f28659a.getClass();
        androidx.compose.foundation.layout.I iA2 = androidx.compose.foundation.layout.H.a(C20585k.f28662d, InterfaceC22215f.a.f39088n, bE2, 0);
        int i15 = bE2.f37888Q;
        O1 o1S2 = bE2.S();
        androidx.compose.ui.v vVarC2 = androidx.compose.ui.n.c(bE2, fillElement);
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
        if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i15))) {
            AK.c.y(i15, bE2, i15, pVar3);
        }
        R3.b(pVar4, bE2, vVarC2);
        androidx.compose.foundation.layout.K k12 = androidx.compose.foundation.layout.K.f28344a;
        float f12 = 16;
        h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
        androidx.compose.ui.v vVarJ = R1.j(aVar, f12, 8);
        String str2 = (String) interfaceC22204y1.getF42167b();
        com.akita.compose.theme.re23.b.f63983a.getClass();
        com.akita.compose.component.input.v f66398m = com.akita.compose.theme.re23.b.l(bE2).getF66398m();
        String strC = u0.i.c(bE2, R.string.select_district_input_hint);
        boolean z13 = selectDistrictViewState.f265830g.length() > 0;
        bE2.C(177403994);
        Object objT3 = bE2.t();
        if (objT3 == c1651a) {
            objT3 = new C34626m(interfaceC22204y1);
            bE2.H(objT3);
        }
        bE2.X(false);
        com.akita.compose.component.input.u.a(str2, f66398m, (Y41.l) objT3, vVarJ, strC, false, null, null, null, null, 0, false, 0, null, z13, false, false, null, null, null, null, bE2, 3456, 0, 0, 8355808);
        bE2.C(177417160);
        boolean z14 = (i13 > 32 && bE2.B(lVar)) || (i12 & 48) == 32;
        Object objT4 = bE2.t();
        if (z14 || objT4 == c1651a) {
            objT4 = new C34627n(lVar);
            bE2.H(objT4);
        }
        bE2.X(false);
        U.a(selectDistrictViewState.f265826c, selectDistrictViewState.f265827d, (Y41.l) objT4, bE2, 72);
        C20650b.a(R1.k(f12, 0.0f, 2, aVar), null, null, false, null, null, null, false, null, new x(selectDistrictViewState, lVar, k12), bE2, 6, 510);
        bE2.X(true);
        String strC2 = u0.i.c(bE2, R.string.select_district_confirm_button_title);
        androidx.compose.ui.v vVarD = c20644z.d(C22501m2.a(R1.i(C20588k2.d(aVar, 1.0f), f12), "apply_button"), InterfaceC22215f.a.f39083i);
        com.akita.compose.component.button.t tVarF2 = com.akita.compose.theme.re23.b.c(bE2).f2();
        bE2.C(1727205678);
        boolean z15 = (i13 > 32 && bE2.B(lVar)) || (i12 & 48) == 32;
        Object objT5 = bE2.t();
        if (z15 || objT5 == c1651a) {
            objT5 = new y(lVar);
            bE2.H(objT5);
        }
        bE2.X(false);
        com.akita.compose.component.button.m.c(strC2, (Y41.a) objT5, tVarF2, vVarD, null, null, null, false, false, null, bE2, 512, 1008);
        bE2.X(true);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new z(selectDistrictViewState, lVar, aVar, i12);
        }
    }
}
