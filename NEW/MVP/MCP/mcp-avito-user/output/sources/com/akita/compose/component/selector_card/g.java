package com.akita.compose.component.selector_card;

import Y41.q;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.C20529i0;
import androidx.compose.foundation.C20839s1;
import androidx.compose.foundation.InterfaceC20834q1;
import androidx.compose.foundation.interaction.m;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.T1;
import androidx.compose.foundation.shape.n;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22137p;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.semantics.i;
import androidx.compose.ui.v;
import com.akita.compose.foundation.p;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: SelectorCard.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"selector-card_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g {
    /* JADX WARN: Removed duplicated region for block: B:110:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0120 A[PHI: r3
  0x0120: PHI (r3v14 com.akita.compose.foundation.p) = (r3v9 com.akita.compose.foundation.p), (r3v15 com.akita.compose.foundation.p) binds: [B:82:0x012a, B:77:0x011e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0150  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22137p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(boolean r24, @Y61.l Y41.a r25, @Y61.k com.akita.compose.component.selector_card.h r26, @Y61.l androidx.compose.ui.v r27, boolean r28, @Y61.l com.akita.compose.component.selector_card.SelectorCardType r29, @Y61.l com.akita.compose.component.selector_card.SelectorCardState r30, @Y61.l androidx.compose.foundation.interaction.m r31, @Y61.k androidx.compose.runtime.internal.C22096n r32, @Y61.l androidx.compose.runtime.A r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.akita.compose.component.selector_card.g.a(boolean, Y41.a, com.akita.compose.component.selector_card.h, androidx.compose.ui.v, boolean, com.akita.compose.component.selector_card.SelectorCardType, com.akita.compose.component.selector_card.SelectorCardState, androidx.compose.foundation.interaction.m, androidx.compose.runtime.internal.n, androidx.compose.runtime.A, int, int):void");
    }

    @InterfaceC22132o
    @InterfaceC22137p
    public static final void b(boolean z12, @l Y41.a aVar, @l v vVar, @l SelectorCardState selectorCardState, @l m mVar, boolean z13, float f12, @l p pVar, @l p pVar2, @l n nVar, @l T1 t12, @l q qVar, @k C22096n c22096n, @l A a12, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        B b12;
        boolean z14;
        v vVarA;
        B b13;
        B bE2 = a12.E(-986862299);
        if ((i12 & 14) == 0) {
            i14 = i12 | (bE2.j(z12) ? 4 : 2);
        } else {
            i14 = i12;
        }
        if ((i12 & 112) == 0) {
            i14 |= bE2.u(aVar) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i14 |= bE2.B(vVar) ? 256 : 128;
        }
        if ((i12 & 7168) == 0) {
            i14 |= bE2.B(selectorCardState) ? 2048 : 1024;
        }
        if ((57344 & i12) == 0) {
            i14 |= bE2.B(mVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((i12 & 458752) == 0) {
            i14 |= bE2.j(z13) ? 131072 : AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
        }
        if ((i12 & 3670016) == 0) {
            i14 |= bE2.k(f12) ? 1048576 : 524288;
        }
        if ((i12 & 29360128) == 0) {
            i14 |= bE2.B(pVar) ? 8388608 : 4194304;
        }
        if ((i12 & 234881024) == 0) {
            i14 |= bE2.B(pVar2) ? 67108864 : 33554432;
        }
        if ((i12 & 1879048192) == 0) {
            i14 |= bE2.B(nVar) ? 536870912 : 268435456;
        }
        if ((i13 & 14) == 0) {
            i15 = i13 | (bE2.B(t12) ? 4 : 2);
        } else {
            i15 = i13;
        }
        if ((i13 & 112) == 0) {
            i15 |= bE2.u(qVar) ? 32 : 16;
        }
        if ((i13 & 896) == 0) {
            i15 |= bE2.u(c22096n) ? 256 : 128;
        }
        int i17 = i15;
        if ((i14 & 1533916891) == 306783378 && (i17 & 731) == 146 && bE2.c()) {
            bE2.f();
            b13 = bE2;
        } else {
            bE2.y0();
            if ((i12 & 1) != 0 && !bE2.g0()) {
                bE2.f();
            }
            bE2.Y();
            bE2.C(-291144406);
            if (aVar != null) {
                v.a aVar2 = v.f42878y1;
                boolean z15 = selectorCardState != SelectorCardState.f62622c;
                i.f41744b.getClass();
                b12 = bE2;
                i16 = i17;
                z14 = false;
                vVarA = androidx.compose.foundation.selection.c.a(aVar2, z12, mVar, (InterfaceC20834q1) bE2.o(C20839s1.f30098a), z15, i.a(i.f41745c), aVar);
            } else {
                i16 = i17;
                b12 = bE2;
                z14 = false;
                vVarA = v.f42878y1;
            }
            b12.X(z14);
            v vVarA2 = v.f42878y1;
            v vVarB = androidx.compose.foundation.A.b(vVarA2, pVar2.c(b12), nVar);
            b12.C(-291129112);
            if (z13 || selectorCardState == SelectorCardState.f62623d) {
                vVarA2 = C20529i0.a(vVarA2, f12, pVar.c(b12), nVar);
            }
            b12.X(z14);
            v vVarD0 = androidx.compose.ui.draw.k.a(vVarB.d0(vVarA2), nVar).d0(vVarA).d0(vVar);
            InterfaceC22215f.f39074a.getClass();
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, z14);
            int i18 = b12.f37888Q;
            O1 o1S = b12.S();
            v vVarC = androidx.compose.ui.n.c(b12, vVarD0);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar3 = InterfaceC22413h.a.f40791b;
            if (b12.f37890b == null) {
                C22190v.b();
                throw null;
            }
            b12.A();
            if (b12.f37887P) {
                b12.b(aVar3);
            } else {
                b12.d();
            }
            R3.b(InterfaceC22413h.a.f40796g, b12, interfaceC22365i0D);
            R3.b(InterfaceC22413h.a.f40795f, b12, o1S);
            Y41.p<InterfaceC22413h, Integer, G0> pVar3 = InterfaceC22413h.a.f40799j;
            if (b12.f37887P || !L.f(b12.t(), Integer.valueOf(i18))) {
                AK.c.y(i18, b12, i18, pVar3);
            }
            R3.b(InterfaceC22413h.a.f40793d, b12, vVarC);
            C20644z c20644z = C20644z.f28804a;
            int i19 = i16;
            b13 = b12;
            c22096n.invoke(c20644z, t12, b13, Integer.valueOf(((i16 << 3) & 112) | 6 | (i19 & 896)));
            qVar.invoke(c20644z, b13, Integer.valueOf((i19 & 112) | 6));
            b13.X(true);
        }
        C22039c2 c22039c2Z = b13.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new f(z12, aVar, vVar, selectorCardState, mVar, z13, f12, pVar, pVar2, nVar, t12, qVar, c22096n, i12, i13);
        }
    }
}
