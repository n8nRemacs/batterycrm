package com.akita.compose.component.banner;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.layout.T1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22078i;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22137p;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.U;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.graphics.h1;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.n;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.v;
import com.akita.compose.component.button.t;
import com.akita.compose.foundation.modifier.f;
import com.akita.compose.foundation.p;
import com.akita.compose.foundation.r;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: Banner.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"banner_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g {
    @InterfaceC22132o
    @InterfaceC22137p
    public static final void a(@l Y41.a aVar, @l C22096n c22096n, @k h hVar, @l v vVar, @l T1 t12, @l h1 h1Var, @l p pVar, @l Y41.a aVar2, @l r rVar, @l r rVar2, @l t tVar, @l A a12, int i12) {
        int i13;
        int i14;
        T1 t13;
        p pVar2;
        h1 h1Var2;
        r rVar3;
        r rVar4;
        t tVar2;
        int i15;
        T1 t14;
        h1 h1Var3;
        p pVar3;
        r rVar5;
        r rVar6;
        B bE2 = a12.E(-1419864825);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B("Banner title") ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.B("This is a large multiline banner content to check how it works works works works works works works works works works works works works works") ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i13 |= bE2.B("Banner button") ? 256 : 128;
        }
        if ((i12 & 7168) == 0) {
            i13 |= bE2.u(aVar) ? 2048 : 1024;
        }
        if ((57344 & i12) == 0) {
            i13 |= bE2.u(c22096n) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((458752 & i12) == 0) {
            i13 |= bE2.B(hVar) ? 131072 : AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
        }
        if ((i12 & 3670016) == 0) {
            i13 |= bE2.B(vVar) ? 1048576 : 524288;
        }
        if ((29360128 & i12) == 0) {
            i13 |= 4194304;
        }
        if ((234881024 & i12) == 0) {
            i13 |= 33554432;
        }
        if ((1879048192 & i12) == 0) {
            i13 |= 268435456;
        }
        int i16 = (bE2.u(aVar2) ? 4 : 2) | 1168;
        if ((1533916891 & i13) == 306783378 && (i16 & 5851) == 1170 && bE2.c()) {
            bE2.f();
            t14 = t12;
            h1Var3 = h1Var;
            pVar3 = pVar;
            rVar5 = rVar;
            rVar6 = rVar2;
            tVar2 = tVar;
        } else {
            bE2.y0();
            if ((i12 & 1) == 0 || bE2.g0()) {
                T1 t15 = hVar.f60463a;
                h1 h1Var4 = hVar.f60464b;
                p pVar4 = hVar.f60465c;
                i14 = i16 & (-8177);
                t13 = t15;
                pVar2 = pVar4;
                h1Var2 = h1Var4;
                rVar3 = hVar.f60466d;
                rVar4 = hVar.f60467e;
                tVar2 = hVar.f60468f;
                i15 = i13 & (-2143289345);
            } else {
                bE2.f();
                t13 = t12;
                h1Var2 = h1Var;
                pVar2 = pVar;
                rVar3 = rVar;
                rVar4 = rVar2;
                tVar2 = tVar;
                i15 = i13 & (-2143289345);
                i14 = i16 & (-8177);
            }
            bE2.Y();
            C22096n c22096nC = androidx.compose.runtime.internal.r.c(-1519514169, new a(hVar, aVar, rVar3, rVar4, tVar2, c22096n), bE2);
            f.a aVar3 = com.akita.compose.foundation.modifier.f.f63621c;
            int i17 = i15 >> 15;
            c(hVar, vVar, t13, h1Var2, pVar2, 0.0f, aVar2, c22096nC, bE2, (i17 & 112) | (i17 & 14) | 12582920 | ((i14 << 18) & 3670016), 32);
            t14 = t13;
            h1Var3 = h1Var2;
            pVar3 = pVar2;
            rVar5 = rVar3;
            rVar6 = rVar4;
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new b(aVar, c22096n, hVar, vVar, t14, h1Var3, pVar3, aVar2, rVar5, rVar6, tVar2, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22137p
    public static final void b(com.akita.compose.component.close_button.c cVar, T1 t12, Y41.a aVar, T1 t13, v vVar, C22096n c22096n, A a12, int i12) {
        int i13;
        B bE2 = a12.E(325301246);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(cVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.B(t12) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i13 |= bE2.u(aVar) ? 256 : 128;
        }
        if ((i12 & 7168) == 0) {
            i13 |= bE2.B(t13) ? 2048 : 1024;
        }
        if ((57344 & i12) == 0) {
            i13 |= bE2.B(vVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((458752 & i12) == 0) {
            i13 |= bE2.u(c22096n) ? 131072 : AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
        }
        if ((374491 & i13) == 74898 && bE2.c()) {
            bE2.f();
        } else {
            InterfaceC22215f.f39074a.getClass();
            androidx.compose.ui.i iVar = InterfaceC22215f.a.f39076b;
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(iVar, false);
            int i14 = bE2.f37888Q;
            O1 o1S = bE2.S();
            v vVarC = n.c(bE2, vVar);
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
            Y41.p<InterfaceC22413h, U, G0> pVar2 = InterfaceC22413h.a.f40795f;
            R3.b(pVar2, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, G0> pVar3 = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar3);
            }
            Y41.p<InterfaceC22413h, v, G0> pVar4 = InterfaceC22413h.a.f40793d;
            R3.b(pVar4, bE2, vVarC);
            C20644z c20644z = C20644z.f28804a;
            v.a aVar3 = v.f42878y1;
            v vVarH = R1.h(aVar3, t13);
            InterfaceC22365i0 interfaceC22365i0D2 = C20632w.d(iVar, false);
            int i15 = bE2.f37888Q;
            O1 o1S2 = bE2.S();
            v vVarC2 = n.c(bE2, vVarH);
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
            R3.b(pVar, bE2, interfaceC22365i0D2);
            R3.b(pVar2, bE2, o1S2);
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i15))) {
                AK.c.y(i15, bE2, i15, pVar3);
            }
            R3.b(pVar4, bE2, vVarC2);
            H.v((i13 >> 15) & 14, c22096n, bE2, true);
            if (aVar != null) {
                com.akita.compose.component.close_button.b.a(aVar, cVar, R1.h(c20644z.d(aVar3, InterfaceC22215f.a.f39078d), t12), false, null, null, bE2, ((i13 >> 6) & 14) | ((i13 << 3) & 112), 56);
            }
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new d(cVar, t12, aVar, t13, vVar, c22096n, i12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fa  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22137p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(@Y61.k com.akita.compose.component.banner.h r19, @Y61.l androidx.compose.ui.v r20, @Y61.l androidx.compose.foundation.layout.T1 r21, @Y61.l androidx.compose.ui.graphics.h1 r22, @Y61.l com.akita.compose.foundation.p r23, float r24, @Y61.l Y41.a r25, @Y61.k androidx.compose.runtime.internal.C22096n r26, @Y61.l androidx.compose.runtime.A r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.akita.compose.component.banner.g.c(com.akita.compose.component.banner.h, androidx.compose.ui.v, androidx.compose.foundation.layout.T1, androidx.compose.ui.graphics.h1, com.akita.compose.foundation.p, float, Y41.a, androidx.compose.runtime.internal.n, androidx.compose.runtime.A, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x01a2  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(@Y61.l Y41.a r27, @Y61.k com.akita.compose.component.banner.h r28, @Y61.l androidx.compose.ui.v r29, @Y61.l com.akita.compose.foundation.r r30, @Y61.l com.akita.compose.foundation.r r31, @Y61.l com.akita.compose.component.button.t r32, @Y61.l androidx.compose.runtime.A r33, int r34) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.akita.compose.component.banner.g.d(Y41.a, com.akita.compose.component.banner.h, androidx.compose.ui.v, com.akita.compose.foundation.r, com.akita.compose.foundation.r, com.akita.compose.component.button.t, androidx.compose.runtime.A, int):void");
    }
}
