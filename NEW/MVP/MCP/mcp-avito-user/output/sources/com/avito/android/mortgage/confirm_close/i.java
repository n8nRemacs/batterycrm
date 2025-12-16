package com.avito.android.mortgage.confirm_close;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.C20646z1;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.K;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22078i;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.U;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.draw.o;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.n;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.C22543x1;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.akita.compose.component.button.m;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: ConfirmCloseScreen.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_mortgage_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class i {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@k String str, @k String str2, @k Y41.a aVar, @k String str3, @k Y41.a aVar2, @l v vVar, @l A a12, int i12) {
        boolean z12;
        boolean z13;
        B bE2 = a12.E(559941952);
        int i13 = i12 | (bE2.B(str) ? 4 : 2) | (bE2.B(str2) ? 32 : 16) | (bE2.B(str3) ? 2048 : 1024);
        if ((i13 & 374491) == 74898 && bE2.c()) {
            bE2.f();
        } else {
            v vVarA = C20646z1.a(vVar, IntrinsicSize.f28333b);
            InterfaceC22215f.f39074a.getClass();
            androidx.compose.ui.i iVar = InterfaceC22215f.a.f39076b;
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(iVar, false);
            int i14 = bE2.f37888Q;
            O1 o1S = bE2.S();
            v vVarC = n.c(bE2, vVarA);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar3 = InterfaceC22413h.a.f40791b;
            InterfaceC22078i<?> interfaceC22078i = bE2.f37890b;
            if (interfaceC22078i == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar3);
            } else {
                bE2.d();
            }
            p<InterfaceC22413h, InterfaceC22365i0, G0> pVar = InterfaceC22413h.a.f40796g;
            R3.b(pVar, bE2, interfaceC22365i0D);
            p<InterfaceC22413h, U, G0> pVar2 = InterfaceC22413h.a.f40795f;
            R3.b(pVar2, bE2, o1S);
            p<InterfaceC22413h, Integer, G0> pVar3 = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar3);
            }
            p<InterfaceC22413h, v, G0> pVar4 = InterfaceC22413h.a.f40793d;
            R3.b(pVar4, bE2, vVarC);
            C20644z c20644z = C20644z.f28804a;
            bE2.C(-976608008);
            bE2.C(2063036140);
            if (((Boolean) bE2.o(C22543x1.f41638a)).booleanValue()) {
                bE2.C(421109671);
                C20585k c20585k = C20585k.f28659a;
                h.a aVar4 = androidx.compose.ui.unit.h.f42849c;
                c20585k.getClass();
                C20585k.j jVarG = C20585k.g(44);
                v.a aVar5 = v.f42878y1;
                I iA2 = H.a(jVarG, InterfaceC22215f.a.f39088n, bE2, 6);
                int i15 = bE2.f37888Q;
                O1 o1S2 = bE2.S();
                v vVarC2 = n.c(bE2, aVar5);
                if (interfaceC22078i == null) {
                    C22190v.b();
                    throw null;
                }
                bE2.A();
                if (bE2.f37887P) {
                    bE2.b(aVar3);
                } else {
                    bE2.d();
                }
                R3.b(pVar, bE2, iA2);
                R3.b(pVar2, bE2, o1S2);
                if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i15))) {
                    AK.c.y(i15, bE2, i15, pVar3);
                }
                R3.b(pVar4, bE2, vVarC2);
                K k12 = K.f28344a;
                com.akita.compose.theme.re23.b.f63983a.getClass();
                com.akita.compose.foundation.ui.p.b(str, com.akita.compose.theme.re23.b.f63988f.f65240k, C20588k2.d(aVar5, 1.0f), false, 0L, null, 0, 0, false, null, bE2, (i13 & 14) | 384, 1016);
                C20568f2 c20568f2A = C20563e2.a(C20585k.g(6), InterfaceC22215f.a.f39085k, bE2, 6);
                int i16 = bE2.f37888Q;
                O1 o1S3 = bE2.S();
                v vVarC3 = n.c(bE2, aVar5);
                if (interfaceC22078i == null) {
                    C22190v.b();
                    throw null;
                }
                bE2.A();
                if (bE2.f37887P) {
                    bE2.b(aVar3);
                } else {
                    bE2.d();
                }
                R3.b(pVar, bE2, c20568f2A);
                R3.b(pVar2, bE2, o1S3);
                if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i16))) {
                    AK.c.y(i16, bE2, i16, pVar3);
                }
                R3.b(pVar4, bE2, vVarC3);
                C20576h2 c20576h2 = C20576h2.f28641a;
                m.c(str2, aVar, com.akita.compose.theme.re23.b.c(bE2).f2(), c20576h2.a(aVar5, 1.0f, true), null, null, null, false, false, null, bE2, ((i13 >> 3) & WebSocketProtocol.PAYLOAD_SHORT) | 512, 1008);
                z12 = true;
                m.c(str3, aVar2, com.akita.compose.theme.re23.b.c(bE2).M(), c20576h2.a(aVar5, 1.0f, true), null, null, null, false, false, null, bE2, ((i13 >> 9) & WebSocketProtocol.PAYLOAD_SHORT) | 512, 1008);
                z13 = false;
                androidx.compose.foundation.H.A(bE2, true, true, false);
            } else {
                bE2.C(420357239);
                com.avito.android.analytics.screens.compose.a aVar6 = (com.avito.android.analytics.screens.compose.a) bE2.o(com.avito.android.analytics.screens.compose.c.f90576a);
                aVar6.l();
                v.a aVar7 = v.f42878y1;
                v vVarD = o.d(aVar7, new h(aVar6));
                InterfaceC22365i0 interfaceC22365i0D2 = C20632w.d(iVar, false);
                int i17 = bE2.f37888Q;
                O1 o1S4 = bE2.S();
                v vVarC4 = n.c(bE2, vVarD);
                if (interfaceC22078i == null) {
                    C22190v.b();
                    throw null;
                }
                bE2.A();
                if (bE2.f37887P) {
                    bE2.b(aVar3);
                } else {
                    bE2.d();
                }
                R3.b(pVar, bE2, interfaceC22365i0D2);
                R3.b(pVar2, bE2, o1S4);
                if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i17))) {
                    AK.c.y(i17, bE2, i17, pVar3);
                }
                R3.b(pVar4, bE2, vVarC4);
                C20585k c20585k2 = C20585k.f28659a;
                h.a aVar8 = androidx.compose.ui.unit.h.f42849c;
                c20585k2.getClass();
                I iA3 = H.a(C20585k.g(44), InterfaceC22215f.a.f39088n, bE2, 6);
                int i18 = bE2.f37888Q;
                O1 o1S5 = bE2.S();
                v vVarC5 = n.c(bE2, aVar7);
                if (interfaceC22078i == null) {
                    C22190v.b();
                    throw null;
                }
                bE2.A();
                if (bE2.f37887P) {
                    bE2.b(aVar3);
                } else {
                    bE2.d();
                }
                R3.b(pVar, bE2, iA3);
                R3.b(pVar2, bE2, o1S5);
                if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i18))) {
                    AK.c.y(i18, bE2, i18, pVar3);
                }
                R3.b(pVar4, bE2, vVarC5);
                K k13 = K.f28344a;
                com.akita.compose.theme.re23.b.f63983a.getClass();
                com.akita.compose.foundation.ui.p.b(str, com.akita.compose.theme.re23.b.f63988f.f65240k, C20588k2.d(aVar7, 1.0f), false, 0L, null, 0, 0, false, null, bE2, (i13 & 14) | 384, 1016);
                C20568f2 c20568f2A2 = C20563e2.a(C20585k.g(6), InterfaceC22215f.a.f39085k, bE2, 6);
                int i19 = bE2.f37888Q;
                O1 o1S6 = bE2.S();
                v vVarC6 = n.c(bE2, aVar7);
                if (interfaceC22078i == null) {
                    C22190v.b();
                    throw null;
                }
                bE2.A();
                if (bE2.f37887P) {
                    bE2.b(aVar3);
                } else {
                    bE2.d();
                }
                R3.b(pVar, bE2, c20568f2A2);
                R3.b(pVar2, bE2, o1S6);
                if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i19))) {
                    AK.c.y(i19, bE2, i19, pVar3);
                }
                R3.b(pVar4, bE2, vVarC6);
                C20576h2 c20576h22 = C20576h2.f28641a;
                m.c(str2, aVar, com.akita.compose.theme.re23.b.c(bE2).f2(), c20576h22.a(aVar7, 1.0f, true), null, null, null, false, false, null, bE2, ((i13 >> 3) & WebSocketProtocol.PAYLOAD_SHORT) | 512, 1008);
                z12 = true;
                m.c(str3, aVar2, com.akita.compose.theme.re23.b.c(bE2).M(), c20576h22.a(aVar7, 1.0f, true), null, null, null, false, false, null, bE2, ((i13 >> 9) & WebSocketProtocol.PAYLOAD_SHORT) | 512, 1008);
                androidx.compose.foundation.H.B(bE2, true, true, true, false);
                z13 = false;
            }
            androidx.compose.foundation.H.A(bE2, z13, z13, z12);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new g(str, str2, aVar, str3, aVar2, vVar, i12);
        }
    }
}
