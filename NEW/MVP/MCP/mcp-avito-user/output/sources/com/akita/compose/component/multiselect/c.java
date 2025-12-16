package com.akita.compose.component.multiselect;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.animation.C20355i0;
import androidx.compose.foundation.C20529i0;
import androidx.compose.foundation.C21086w0;
import androidx.compose.foundation.H;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.layout.S0;
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
import androidx.compose.runtime.internal.r;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.graphics.T;
import androidx.compose.ui.graphics.h1;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.n;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.v;
import com.akita.compose.component.input.InputState;
import com.akita.compose.component.input.v;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: Multiselect.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"multiselect_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c {
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@k Y41.a aVar, @k Y41.a aVar2, @k g gVar, @l v vVar, @l String str, boolean z12, boolean z13, @k Y41.l lVar, @l A a12, int i12) {
        int i13;
        B bE2 = a12.E(122301334);
        if ((i12 & 14) == 0) {
            i13 = i12 | (bE2.u(aVar) ? 4 : 2);
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.u(aVar2) ? 32 : 16;
        }
        int i14 = i13 | (bE2.B(gVar) ? 256 : 128);
        if ((i12 & 57344) == 0) {
            i14 |= bE2.B(str) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        int i15 = i14 | (bE2.j(z12) ? 131072 : AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) | (bE2.j(z13) ? 1048576 : 524288);
        if ((i12 & 29360128) == 0) {
            i15 |= bE2.u(lVar) ? 8388608 : 4194304;
        }
        int i16 = i15;
        if ((i16 & 23967451) == 4793490 && bE2.c()) {
            bE2.f();
        } else {
            f fVar = new f();
            lVar.invoke(fVar);
            InputState inputState = z13 ? InputState.f61669c : InputState.f61668b;
            ArrayList arrayList = fVar.f62173a;
            if (arrayList == null || !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((Boolean) ((Q) it.next()).f406620c).booleanValue()) {
                        bE2.C(-194918655);
                        com.akita.compose.component.input.v vVar2 = gVar.f62177a;
                        v vVarB = C20588k2.b(0.0f, vVar2.f61844q, 1, vVar);
                        v.a.C2090a c2090a = v.a.f61852e;
                        long j12 = ((T) vVar2.f61839l.a(z12, inputState, bE2).getF42167b()).f39331a;
                        h1 h1Var = vVar2.f61840m;
                        androidx.compose.ui.v vVarC = C21086w0.c(androidx.compose.ui.draw.k.a(C20529i0.a(androidx.compose.foundation.A.b(vVarB, j12, h1Var), vVar2.f61843p, ((T) vVar2.f61842o.a(z12, inputState, bE2).getF42167b()).f39331a, h1Var), h1Var), z12, null, null, aVar, 6);
                        C20585k.f28659a.getClass();
                        C20585k.C1589k c1589k = C20585k.f28660b;
                        InterfaceC22215f.f39074a.getClass();
                        C20568f2 c20568f2A = C20563e2.a(c1589k, InterfaceC22215f.a.f39085k, bE2, 0);
                        int i17 = bE2.f37888Q;
                        O1 o1S = bE2.S();
                        androidx.compose.ui.v vVarC2 = n.c(bE2, vVarC);
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
                        R3.b(pVar, bE2, c20568f2A);
                        p<InterfaceC22413h, U, G0> pVar2 = InterfaceC22413h.a.f40795f;
                        R3.b(pVar2, bE2, o1S);
                        p<InterfaceC22413h, Integer, G0> pVar3 = InterfaceC22413h.a.f40799j;
                        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i17))) {
                            AK.c.y(i17, bE2, i17, pVar3);
                        }
                        p<InterfaceC22413h, androidx.compose.ui.v, G0> pVar4 = InterfaceC22413h.a.f40793d;
                        R3.b(pVar4, bE2, vVarC2);
                        C20576h2 c20576h2 = C20576h2.f28641a;
                        C20585k.j jVarG = C20585k.g(gVar.f62178b);
                        v.a aVar4 = androidx.compose.ui.v.f42878y1;
                        S0.d(R1.h(C20355i0.a(c20576h2.a(aVar4, 1.0f, true)), gVar.f62179c), jVarG, jVarG, null, 0, 0, r.c(1782098563, new a(fVar, gVar, z12), bE2), bE2, 1572864, 56);
                        androidx.compose.ui.v vVarP = C20588k2.p(vVar2.f61838k, aVar4);
                        InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39080f, false);
                        int i18 = bE2.f37888Q;
                        O1 o1S2 = bE2.S();
                        androidx.compose.ui.v vVarC3 = n.c(bE2, vVarP);
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
                        R3.b(pVar, bE2, interfaceC22365i0D);
                        R3.b(pVar2, bE2, o1S2);
                        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i18))) {
                            AK.c.y(i18, bE2, i18, pVar3);
                        }
                        R3.b(pVar4, bE2, vVarC3);
                        C20644z c20644z = C20644z.f28804a;
                        com.akita.compose.component.close_button.b.a(aVar2, vVar2.f61849v, null, z12, gVar.f62180d, null, bE2, ((i16 >> 3) & 14) | ((i16 >> 6) & 7168), 36);
                        H.A(bE2, true, true, false);
                    }
                }
                bE2.C(-194926645);
                com.akita.compose.component.base_select.e.a("", aVar, gVar.f62177a, vVar, str, z12, inputState, bE2, ((i16 << 3) & 112) | 3078 | (i16 & 57344) | (i16 & 458752), 64);
                bE2.X(false);
            } else {
                bE2.C(-194926645);
                com.akita.compose.component.base_select.e.a("", aVar, gVar.f62177a, vVar, str, z12, inputState, bE2, ((i16 << 3) & 112) | 3078 | (i16 & 57344) | (i16 & 458752), 64);
                bE2.X(false);
            }
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new b(aVar, aVar2, gVar, vVar, str, z12, z13, lVar, i12);
        }
    }
}
