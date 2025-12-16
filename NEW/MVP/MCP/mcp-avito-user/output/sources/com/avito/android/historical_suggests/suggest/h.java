package com.avito.android.historical_suggests.suggest;

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
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import okhttp3.internal.ws.WebSocketProtocol;
import uI.C48904e;
import vI.C49218c;

/* compiled from: HistoricalSuggestsScreen.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_historical-suggests_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h {
    /* JADX WARN: Removed duplicated region for block: B:36:0x0091  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(java.lang.String r36, java.lang.String r37, boolean r38, boolean r39, Y41.a r40, androidx.compose.ui.v.a r41, androidx.compose.runtime.A r42, int r43) {
        /*
            Method dump skipped, instructions count: 750
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.historical_suggests.suggest.h.a(java.lang.String, java.lang.String, boolean, boolean, Y41.a, androidx.compose.ui.v$a, androidx.compose.runtime.A, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01e7  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(uI.C48904e r27, uI.C48901b r28, Y41.l r29, androidx.compose.ui.v r30, androidx.compose.runtime.A r31, int r32) {
        /*
            Method dump skipped, instructions count: 541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.historical_suggests.suggest.h.b(uI.e, uI.b, Y41.l, androidx.compose.ui.v, androidx.compose.runtime.A, int):void");
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void c(String str, Y41.a aVar, v.a aVar2, A a12, int i12) {
        B b12;
        v.a aVar3;
        B bE2 = a12.E(2037930556);
        int i13 = (bE2.B(str) ? 4 : 2) | i12 | (bE2.u(aVar) ? 32 : 16) | 384;
        if ((i13 & 731) == 146 && bE2.c()) {
            bE2.f();
            aVar3 = aVar2;
            b12 = bE2;
        } else {
            v.a aVar4 = v.f42878y1;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            b12 = bE2;
            com.akita.compose.component.button.m.c(str, aVar, com.akita.compose.theme.re23.b.c(bE2).g0(), aVar4, null, null, null, false, false, null, bE2, (i13 & WebSocketProtocol.PAYLOAD_SHORT) | 3584, 1008);
            aVar3 = aVar4;
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new f(str, aVar, aVar3, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void d(@Y61.k C49218c c49218c, @Y61.k Y41.l lVar, @Y61.l v.a aVar, @Y61.l A a12, int i12) {
        v.a aVar2;
        B bE2 = a12.E(1593495703);
        int i13 = (bE2.B(c49218c) ? 4 : 2) | i12 | (bE2.u(lVar) ? 32 : 16) | 384;
        if ((i13 & 731) == 146 && bE2.c()) {
            bE2.f();
            aVar2 = aVar;
        } else {
            aVar2 = v.f42878y1;
            if (c49218c.f440665g) {
                h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
                v vVarA = C22501m2.a(R1.j(C20588k2.d(aVar2, 1.0f), 16, 12), "suggestions_block_test_tag");
                C20585k.f28659a.getClass();
                C20585k.l lVar2 = C20585k.f28662d;
                InterfaceC22215f.f39074a.getClass();
                I iA2 = H.a(lVar2, InterfaceC22215f.a.f39088n, bE2, 0);
                int i14 = bE2.f37888Q;
                O1 o1S = bE2.S();
                v vVarC = androidx.compose.ui.n.c(bE2, vVarA);
                InterfaceC22413h.f40789C1.getClass();
                Y41.a<InterfaceC22413h> aVar4 = InterfaceC22413h.a.f40791b;
                if (bE2.f37890b == null) {
                    C22190v.b();
                    throw null;
                }
                bE2.A();
                if (bE2.f37887P) {
                    bE2.b(aVar4);
                } else {
                    bE2.d();
                }
                R3.b(InterfaceC22413h.a.f40796g, bE2, iA2);
                R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
                Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
                if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
                    AK.c.y(i14, bE2, i14, pVar);
                }
                R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
                K k12 = K.f28344a;
                bE2.C(-1108977227);
                List<C48904e> list = c49218c.f440660b;
                if (list != null) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        b((C48904e) it.next(), c49218c.f440661c, lVar, R1.m(v.f42878y1, 0.0f, 0.0f, 0.0f, 24, 7), bE2, ((i13 << 3) & 896) | 3072);
                    }
                }
                bE2.X(false);
                bE2.X(true);
            }
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new g(c49218c, lVar, aVar2, i12);
        }
    }
}
