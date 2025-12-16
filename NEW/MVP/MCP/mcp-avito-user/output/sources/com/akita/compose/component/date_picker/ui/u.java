package com.akita.compose.component.date_picker.ui;

import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20608p2;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.v;
import com.akita.compose.component.date_picker.F;
import com.akita.compose.component.date_picker.K;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: WeekDaysHeader.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"date-picker_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class u {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k K k12, @Y61.k F f12, @Y61.l v.a aVar, @Y61.l A a12, int i12) {
        B bE2 = a12.E(831405434);
        if ((((bE2.B(k12) ? 4 : 2) | i12 | 384) & 731) == 146 && bE2.c()) {
            bE2.f();
        } else {
            aVar = v.f42878y1;
            bE2.C(665198776);
            Object objT = bE2.t();
            A.f37866a.getClass();
            if (objT == A.a.f37868b) {
                objT = k12.f61177h.getF61414c();
                bE2.H(objT);
            }
            List list = (List) objT;
            bE2.X(false);
            F.a aVar2 = f12.f61127a;
            b(list, f12.f61131e, aVar2.f61155k, androidx.compose.ui.unit.l.d(aVar2.f61160p), aVar, bE2, 24584);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new s(k12, f12, aVar, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void b(@Y61.k List list, @Y61.k com.akita.compose.foundation.r rVar, @Y61.k com.akita.compose.foundation.p pVar, float f12, @Y61.l v vVar, @Y61.l A a12, int i12) {
        C20576h2 c20576h2;
        char c12;
        B bE2 = a12.E(269709393);
        v vVarD = C20588k2.d(vVar, 1.0f);
        C20585k.f28659a.getClass();
        C20585k.C1589k c1589k = C20585k.f28660b;
        InterfaceC22215f.f39074a.getClass();
        C20568f2 c20568f2A = C20563e2.a(c1589k, InterfaceC22215f.a.f39085k, bE2, 0);
        int i13 = bE2.f37888Q;
        O1 o1S = bE2.S();
        v vVarC = androidx.compose.ui.n.c(bE2, vVarD);
        InterfaceC22413h.f40789C1.getClass();
        Y41.a<InterfaceC22413h> aVar = InterfaceC22413h.a.f40791b;
        if (bE2.f37890b == null) {
            C22190v.b();
            throw null;
        }
        bE2.A();
        if (bE2.f37887P) {
            bE2.b(aVar);
        } else {
            bE2.d();
        }
        R3.b(InterfaceC22413h.a.f40796g, bE2, c20568f2A);
        R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
        Y41.p<InterfaceC22413h, Integer, G0> pVar2 = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i13))) {
            AK.c.y(i13, bE2, i13, pVar2);
        }
        R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
        C20576h2 c20576h22 = C20576h2.f28641a;
        int i14 = 0;
        for (Object obj : list) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                C42745f0.H0();
                throw null;
            }
            v.a aVar2 = v.f42878y1;
            v vVarT = C20588k2.t(aVar2, f12);
            long jC2 = pVar.c(bE2);
            androidx.compose.ui.text.style.i.f42675b.getClass();
            int i16 = i14;
            C20576h2 c20576h23 = c20576h22;
            com.akita.compose.foundation.ui.p.b((String) obj, rVar, vVarT, false, jC2, androidx.compose.ui.text.style.i.a(androidx.compose.ui.text.style.i.f42678e), 0, 0, false, null, bE2, i12 & 112, 968);
            bE2.C(332804205);
            if (i16 != list.size() - 1) {
                c20576h2 = c20576h23;
                c12 = 0;
                C20608p2.a(bE2, c20576h2.a(aVar2, 1.0f, true));
            } else {
                c20576h2 = c20576h23;
                c12 = 0;
            }
            bE2.X(false);
            c20576h22 = c20576h2;
            i14 = i15;
        }
        bE2.X(true);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new t(list, rVar, pVar, f12, vVar, i12);
        }
    }
}
