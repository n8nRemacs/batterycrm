package com.avito.android.screens.bbip_private_v2.ui.compose.dialog;

import Y41.p;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22196w1;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.U2;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.i;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.akita.compose.component.button.t;
import com.akita.compose.foundation.r;
import com.avito.android.screens.bbip_private_v2.mvi.entity.BbipPrivateV2State;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: BbipPrivateV2DurationPickerSheet.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "selectedValue", "_avito_bbip_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k BbipPrivateV2State.e.a aVar, int i12, @Y61.k Y41.l lVar, @Y61.l v.a aVar2, @Y61.l A a12, int i13) {
        int i14;
        int i15;
        v.a aVar3;
        B bE2 = a12.E(-336709503);
        if ((i13 & 14) == 0) {
            i15 = (bE2.B(aVar) ? 4 : 2) | i13;
            i14 = i12;
        } else {
            i14 = i12;
            i15 = i13;
        }
        int i16 = i15 | (bE2.m(i14) ? 32 : 16);
        if ((i13 & 896) == 0) {
            i16 |= bE2.u(lVar) ? 256 : 128;
        }
        int i17 = i16 | 3072;
        if ((i17 & 5851) == 1170 && bE2.c()) {
            bE2.f();
            aVar3 = aVar2;
        } else {
            v.a aVar4 = v.f42878y1;
            List listM0 = C42745f0.M0(new kotlin.ranges.l(aVar.f261073c, aVar.f261074d, 1));
            bE2.C(-1498548201);
            Object objT = bE2.t();
            A.f37866a.getClass();
            if (objT == A.a.f37868b) {
                Integer numValueOf = Integer.valueOf(i12);
                if (!listM0.contains(Integer.valueOf(i12))) {
                    numValueOf = null;
                }
                objT = U2.a((numValueOf == null && (numValueOf = (Integer) C42745f0.G(listM0)) == null) ? 0 : numValueOf.intValue());
                bE2.H(objT);
            }
            InterfaceC22196w1 interfaceC22196w1 = (InterfaceC22196w1) objT;
            bE2.X(false);
            List list = listM0;
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).intValue()));
            }
            v vVarD = C20588k2.d(aVar4, 1.0f);
            float f12 = 14;
            h.a aVar5 = androidx.compose.ui.unit.h.f42849c;
            v vVarK = R1.k(0.0f, f12, 1, vVarD);
            C20585k c20585k = C20585k.f28659a;
            InterfaceC22215f.f39074a.getClass();
            i.b bVar = InterfaceC22215f.a.f39086l;
            c20585k.getClass();
            I iA2 = H.a(C20585k.i(24, bVar), InterfaceC22215f.a.f39089o, bE2, 54);
            int i18 = bE2.f37888Q;
            O1 o1S = bE2.S();
            v vVarC = androidx.compose.ui.n.c(bE2, vVarK);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar6 = InterfaceC22413h.a.f40791b;
            if (bE2.f37890b == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar6);
            } else {
                bE2.d();
            }
            R3.b(InterfaceC22413h.a.f40796g, bE2, iA2);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i18))) {
                AK.c.y(i18, bE2, i18, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            K k12 = K.f28344a;
            String str = aVar.f261075e;
            if (str == null) {
                str = "";
            }
            com.akita.compose.theme.re23.b.f63983a.getClass();
            r rVar = com.akita.compose.theme.re23.b.f63988f.f65239j;
            v.a aVar7 = v.f42878y1;
            com.akita.compose.foundation.ui.p.b(str, rVar, C22501m2.a(R1.k(16, 0.0f, 2, R1.m(aVar7, 0.0f, 0.0f, 0.0f, f12, 7)), "BBIP_PRIVATE_V2_DURATION_PICKER_SHEET_TITLE_TEST_TAG"), false, 0L, null, 0, 0, false, null, bE2, 384, 1016);
            o.a(arrayList, String.valueOf(interfaceC22196w1.e()), new a(listM0, interfaceC22196w1), C22501m2.a(R1.k(32, 0.0f, 2, aVar7), "BBIP_PRIVATE_V2_DURATION_PICKER_SHEET_WHEEL_TEST_TAG"), bE2, 3080);
            String str2 = aVar.f261076f;
            String str3 = str2 == null ? "" : str2;
            t tVarF2 = com.akita.compose.theme.re23.b.c(bE2).f2();
            v vVarA = C22501m2.a(R1.k(10, 0.0f, 2, C20588k2.d(aVar7, 1.0f)), "BBIP_PRIVATE_V2_DURATION_PICKER_SHEET_BUTTON_TEST_TAG");
            bE2.C(1312683014);
            boolean z12 = (i17 & 896) == 256;
            Object objT2 = bE2.t();
            if (z12 || objT2 == A.a.f37868b) {
                objT2 = new b(lVar, interfaceC22196w1);
                bE2.H(objT2);
            }
            bE2.X(false);
            com.akita.compose.component.button.m.c(str3, (Y41.a) objT2, tVarF2, vVarA, null, null, null, aVar.f261072b, false, null, bE2, 3584, 880);
            bE2.X(true);
            aVar3 = aVar4;
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new c(aVar, i12, lVar, aVar3, i13);
        }
    }
}
