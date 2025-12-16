package com.avito.android.publish.slots.network_stores_fake_door_slot;

import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.lazy.C20650b;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.publish.slots.network_stores_fake_door_slot.h;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: NetworkStoresFakeDoorSlotScreen.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_publish_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class C {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k h hVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        v.a aVar;
        boolean z12;
        androidx.compose.runtime.B bE2 = a12.E(-1457372849);
        v.a aVar2 = androidx.compose.ui.v.f42878y1;
        C20585k.f28659a.getClass();
        C20585k.l lVar = C20585k.f28662d;
        InterfaceC22215f.f39074a.getClass();
        I iA2 = H.a(lVar, InterfaceC22215f.a.f39088n, bE2, 0);
        int i13 = bE2.f37888Q;
        O1 o1S = bE2.S();
        androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, aVar2);
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
        R3.b(InterfaceC22413h.a.f40796g, bE2, iA2);
        R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
        Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i13))) {
            AK.c.y(i13, bE2, i13, pVar);
        }
        R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
        K k12 = K.f28344a;
        bE2.C(1704618973);
        String str = hVar.f244621c;
        if (str == null) {
            aVar = aVar2;
            z12 = false;
        } else {
            float f12 = 16;
            h.a aVar4 = androidx.compose.ui.unit.h.f42849c;
            androidx.compose.ui.v vVarM = R1.m(aVar2, f12, 14, f12, 0.0f, 8);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.foundation.r rVar = com.akita.compose.theme.re23.b.f63988f.f65233d;
            androidx.compose.ui.text.style.i.f42675b.getClass();
            aVar = aVar2;
            com.akita.compose.foundation.ui.p.b(str, rVar, vVarM, false, 0L, androidx.compose.ui.text.style.i.a(androidx.compose.ui.text.style.i.f42680g), 0, 0, false, null, bE2, 0, 984);
            z12 = false;
        }
        bE2.X(z12);
        h.a aVar5 = androidx.compose.ui.unit.h.f42849c;
        com.akita.compose.foundation.ui.g.a(16, null, bE2, 6);
        bE2.C(1704630914);
        List<h.a> list = hVar.f244622d;
        if (list != null) {
            C20650b.a(null, null, null, false, null, null, null, false, null, new u(list), bE2, 0, 511);
        }
        bE2.X(z12);
        com.akita.compose.foundation.ui.g.a(14, null, bE2, 6);
        bE2.C(1704684722);
        List<h.b> list2 = hVar.f244623e;
        if (list2 != null) {
            C20650b.c(aVar, null, null, false, C20585k.g(6), null, null, false, null, new z(list2), bE2, 24582, 494);
        }
        C22039c2 c22039c2N = com.avito.android.actions_sheet.a.n(bE2, z12, true);
        if (c22039c2N != null) {
            c22039c2N.f38184d = new A(hVar, aVar, i12);
        }
    }
}
