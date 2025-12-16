package com.avito.android.publish.slots.network_stores_fake_door_slot;

import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.lazy.InterfaceC20793y;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.U;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.graphics.Y0;
import androidx.compose.ui.i;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.publish.slots.network_stores_fake_door_slot.h;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: LazyDsl.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "Landroidx/compose/foundation/lazy/y;", "", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/y;ILandroidx/compose/runtime/A;I)V", "androidx/compose/foundation/lazy/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
public final class t extends N implements Y41.r<InterfaceC20793y, Integer, androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List f244641l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(List list) {
        super(4);
        this.f244641l = list;
    }

    @Override // Y41.r
    public final G0 invoke(InterfaceC20793y interfaceC20793y, Integer num, androidx.compose.runtime.A a12, Integer num2) {
        int i12;
        String strA;
        InterfaceC20793y interfaceC20793y2 = interfaceC20793y;
        int iIntValue = num.intValue();
        androidx.compose.runtime.A a13 = a12;
        int iIntValue2 = num2.intValue();
        if ((iIntValue2 & 6) == 0) {
            i12 = (a13.B(interfaceC20793y2) ? 4 : 2) | iIntValue2;
        } else {
            i12 = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i12 |= a13.m(iIntValue) ? 32 : 16;
        }
        if (a13.p(i12 & 1, (i12 & 147) != 146)) {
            h.a aVar = (h.a) this.f244641l.get(iIntValue);
            a13.C(102089995);
            v.a aVar2 = androidx.compose.ui.v.f42878y1;
            androidx.compose.ui.v vVarD = C20588k2.d(aVar2, 1.0f);
            float f12 = 16;
            h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
            androidx.compose.ui.v vVarK = R1.k(f12, 0.0f, 2, vVarD);
            InterfaceC22215f.f39074a.getClass();
            i.b bVar = InterfaceC22215f.a.f39086l;
            C20585k.f28659a.getClass();
            C20568f2 c20568f2A = C20563e2.a(C20585k.f28660b, bVar, a13, 48);
            int f37888q = a13.getF37888Q();
            O1 o1Y = a13.y();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(a13, vVarK);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar4 = InterfaceC22413h.a.f40791b;
            if (a13.F() == null) {
                C22190v.b();
                throw null;
            }
            a13.A();
            if (a13.getF37887P()) {
                a13.b(aVar4);
            } else {
                a13.d();
            }
            Y41.p<InterfaceC22413h, InterfaceC22365i0, G0> pVar = InterfaceC22413h.a.f40796g;
            R3.b(pVar, a13, c20568f2A);
            Y41.p<InterfaceC22413h, U, G0> pVar2 = InterfaceC22413h.a.f40795f;
            R3.b(pVar2, a13, o1Y);
            Y41.p<InterfaceC22413h, Integer, G0> pVar3 = InterfaceC22413h.a.f40799j;
            if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q))) {
                androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar3);
            }
            Y41.p<InterfaceC22413h, androidx.compose.ui.v, G0> pVar4 = InterfaceC22413h.a.f40793d;
            R3.b(pVar4, a13, vVarC);
            C20576h2 c20576h2 = C20576h2.f28641a;
            androidx.compose.ui.v vVarA = androidx.compose.ui.draw.k.a(C20588k2.o(aVar2, 48), androidx.compose.foundation.shape.o.a(f12));
            com.akita.compose.theme.re23.b.f63983a.getClass();
            androidx.compose.ui.v vVarB = androidx.compose.foundation.A.b(vVarA, com.akita.compose.theme.re23.b.f63984b.f63842E1.c(a13), Y0.f39346a);
            I iA2 = H.a(C20585k.f28664f, InterfaceC22215f.a.f39089o, a13, 54);
            int f37888q2 = a13.getF37888Q();
            O1 o1Y2 = a13.y();
            androidx.compose.ui.v vVarC2 = androidx.compose.ui.n.c(a13, vVarB);
            if (a13.F() == null) {
                C22190v.b();
                throw null;
            }
            a13.A();
            if (a13.getF37887P()) {
                a13.b(aVar4);
            } else {
                a13.d();
            }
            R3.b(pVar, a13, iA2);
            R3.b(pVar2, a13, o1Y2);
            if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q2))) {
                androidx.appcompat.app.r.B(f37888q2, a13, f37888q2, pVar3);
            }
            R3.b(pVar4, a13, vVarC2);
            K k12 = K.f28344a;
            String str = aVar.f244626b;
            if (str != null) {
                com.akita.compose.theme.re23.g.f65049a.getClass();
                strA = com.akita.compose.theme.re23.g.a(str);
            } else {
                strA = null;
            }
            a13.C(1902501603);
            if (strA != null) {
                com.akita.compose.foundation.ui.o.a(strA, com.akita.compose.theme.re23.b.f63988f.f65241l, R1.m(aVar2, 0.0f, 2, 0.0f, 0.0f, 13), null, a13, 384, 8);
            }
            a13.h();
            a13.z();
            androidx.compose.ui.v vVarM = R1.m(aVar2, 8, 0.0f, 0.0f, 0.0f, 14);
            String str2 = aVar.f244625a;
            if (str2 == null) {
                str2 = "";
            }
            com.akita.compose.foundation.ui.p.b(str2, com.akita.compose.theme.re23.b.f63988f.f65241l, vVarM, false, 0L, null, 0, 0, false, null, a13, 384, 1016);
            a13.z();
            com.akita.compose.foundation.ui.g.a(14, null, a13, 6);
            a13.h();
        } else {
            a13.f();
        }
        return G0.f406611a;
    }
}
