package com.avito.android.select.new_districts.compose;

import androidx.compose.foundation.C20806p1;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.graphics.U;
import androidx.compose.ui.i;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.select.new_districts.mvi.entity.ui.DistrictChip;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SelectedDistrictsChips.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class J extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ DistrictChip f265706l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(DistrictChip districtChip) {
        super(2);
        this.f265706l = districtChip;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            v.a aVar = androidx.compose.ui.v.f42878y1;
            h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
            androidx.compose.ui.v vVarM = R1.m(aVar, 10, 0.0f, 14, 0.0f, 10);
            InterfaceC22215f.f39074a.getClass();
            i.b bVar = InterfaceC22215f.a.f39086l;
            C20585k.f28659a.getClass();
            C20568f2 c20568f2A = C20563e2.a(C20585k.f28660b, bVar, a13, 48);
            int f37888q = a13.getF37888Q();
            O1 o1Y = a13.y();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(a13, vVarM);
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
            R3.b(InterfaceC22413h.a.f40796g, a13, c20568f2A);
            R3.b(InterfaceC22413h.a.f40795f, a13, o1Y);
            Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (a13.getF37887P() || !kotlin.jvm.internal.L.f(a13.t(), Integer.valueOf(f37888q))) {
                androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, a13, vVarC);
            C20576h2 c20576h2 = C20576h2.f28641a;
            float f12 = 4;
            androidx.compose.ui.v vVarM2 = R1.m(aVar, f12, 0.0f, 0.0f, 0.0f, 14);
            DistrictChip districtChip = this.f265706l;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.foundation.ui.p.b(districtChip.f265832b, com.akita.compose.theme.re23.b.f63988f.f65241l, vVarM2, false, 0L, null, 0, 0, false, null, a13, 384, 1016);
            androidx.compose.ui.v vVarO = C20588k2.o(R1.m(aVar, f12, 0.0f, 0.0f, 0.0f, 14), 20);
            com.akita.compose.theme.re23.b.f63985c.getClass();
            C20806p1.a(u0.e.a(com.akita.compose.theme.re23.e.f64220N3, 0, a13), null, vVarO, null, null, 0.0f, U.a.a(androidx.compose.ui.graphics.U.f39332b, com.akita.compose.theme.re23.b.f63984b.f63938l.c(a13)), a13, 440, 56);
            a13.z();
        }
        return G0.f406611a;
    }
}
