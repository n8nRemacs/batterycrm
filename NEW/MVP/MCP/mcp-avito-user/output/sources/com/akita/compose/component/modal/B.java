package com.akita.compose.component.modal;

import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.foundation.layout.R1;
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
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import androidx.compose.ui.window.H;
import com.akita.compose.foundation.modifier.e;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: Modal.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"modal_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public static final float f61981a;

    /* compiled from: Modal.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[ModalButtonsOrientation.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ModalButtonsOrientation modalButtonsOrientation = ModalButtonsOrientation.f62005b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        f61981a = 10;
    }

    @InterfaceC22132o
    @InterfaceC22137p
    public static final void a(float f12, com.akita.compose.foundation.p pVar, float f13, boolean z12, boolean z13, com.akita.compose.component.close_button.c cVar, Y41.a aVar, com.akita.compose.foundation.modifier.e eVar, com.akita.compose.foundation.modifier.e eVar2, Y41.q qVar, androidx.compose.ui.v vVar, C22096n c22096n, androidx.compose.runtime.A a12, int i12, int i13) {
        int i14;
        int i15;
        androidx.compose.runtime.B bE2 = a12.E(811506339);
        if ((i12 & 14) == 0) {
            i14 = (bE2.k(f12) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        if ((i12 & 112) == 0) {
            i14 |= bE2.B(pVar) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i14 |= bE2.k(f13) ? 256 : 128;
        }
        if ((i12 & 7168) == 0) {
            i14 |= bE2.j(z12) ? 2048 : 1024;
        }
        if ((57344 & i12) == 0) {
            i14 |= bE2.j(z13) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((i12 & 458752) == 0) {
            i14 |= bE2.B(cVar) ? 131072 : AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
        }
        if ((i12 & 3670016) == 0) {
            i14 |= bE2.u(aVar) ? 1048576 : 524288;
        }
        if ((i12 & 29360128) == 0) {
            i14 |= bE2.B(eVar) ? 8388608 : 4194304;
        }
        if ((i12 & 234881024) == 0) {
            i14 |= bE2.B(eVar2) ? 67108864 : 33554432;
        }
        if ((i12 & 1879048192) == 0) {
            i14 |= bE2.u(qVar) ? 536870912 : 268435456;
        }
        if ((i13 & 14) == 0) {
            i15 = i13 | (bE2.B(vVar) ? 4 : 2);
        } else {
            i15 = i13;
        }
        if ((i13 & 112) == 0) {
            i15 |= bE2.u(c22096n) ? 32 : 16;
        }
        if ((i14 & 1533916891) == 306783378 && (i15 & 91) == 18 && bE2.c()) {
            bE2.f();
        } else {
            androidx.compose.foundation.shape.n nVarA = androidx.compose.foundation.shape.o.a(f13);
            int i16 = i14 >> 3;
            androidx.compose.ui.v vVarB = androidx.compose.foundation.A.b(com.akita.compose.foundation.modifier.d.a(R1.i(C20588k2.d(C20588k2.v(0.0f, f12, 1, vVar), 1.0f), f61981a), eVar, eVar2, f13), pVar.c(bE2), nVarA);
            InterfaceC22215f.f39074a.getClass();
            androidx.compose.ui.i iVar = InterfaceC22215f.a.f39076b;
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(iVar, false);
            int i17 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarB);
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
            Y41.p<InterfaceC22413h, InterfaceC22365i0, G0> pVar2 = InterfaceC22413h.a.f40796g;
            R3.b(pVar2, bE2, interfaceC22365i0D);
            Y41.p<InterfaceC22413h, U, G0> pVar3 = InterfaceC22413h.a.f40795f;
            R3.b(pVar3, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, G0> pVar4 = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i17))) {
                AK.c.y(i17, bE2, i17, pVar4);
            }
            Y41.p<InterfaceC22413h, androidx.compose.ui.v, G0> pVar5 = InterfaceC22413h.a.f40793d;
            R3.b(pVar5, bE2, vVarC);
            C20644z c20644z = C20644z.f28804a;
            v.a aVar3 = androidx.compose.ui.v.f42878y1;
            androidx.compose.ui.v vVarB2 = c20644z.b(aVar3);
            int i18 = i15;
            int i19 = i14 >> 18;
            int i22 = i14;
            int i23 = (i19 & 7168) | 48;
            InterfaceC22365i0 interfaceC22365i0D2 = C20632w.d(InterfaceC22215f.a.f39080f, false);
            int i24 = bE2.f37888Q;
            O1 o1S2 = bE2.S();
            androidx.compose.ui.v vVarC2 = androidx.compose.ui.n.c(bE2, vVarB2);
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
            R3.b(pVar2, bE2, interfaceC22365i0D2);
            R3.b(pVar3, bE2, o1S2);
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i24))) {
                AK.c.y(i24, bE2, i24, pVar4);
            }
            R3.b(pVar5, bE2, vVarC2);
            qVar.invoke(c20644z, bE2, Integer.valueOf(((i23 >> 6) & 112) | 6));
            bE2.X(true);
            androidx.compose.ui.v vVarA = androidx.compose.ui.draw.k.a(C20588k2.d(aVar3, 1.0f), nVarA);
            InterfaceC22365i0 interfaceC22365i0D3 = C20632w.d(iVar, false);
            int i25 = bE2.f37888Q;
            O1 o1S3 = bE2.S();
            androidx.compose.ui.v vVarC3 = androidx.compose.ui.n.c(bE2, vVarA);
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
            R3.b(pVar2, bE2, interfaceC22365i0D3);
            R3.b(pVar3, bE2, o1S3);
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i25))) {
                AK.c.y(i25, bE2, i25, pVar4);
            }
            R3.b(pVar5, bE2, vVarC3);
            c22096n.invoke(c20644z, bE2, Integer.valueOf((i18 & 112) | 6));
            bE2.X(true);
            if (z12) {
                h.a aVar4 = androidx.compose.ui.unit.h.f42849c;
                com.akita.compose.component.close_button.b.a(aVar, cVar, R1.i(c20644z.d(aVar3, InterfaceC22215f.a.f39078d), 20), z13, null, null, bE2, (i19 & 14) | ((i22 >> 12) & 112) | (i16 & 7168), 48);
            }
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C27350d(f12, pVar, f13, z12, z13, cVar, aVar, eVar, eVar2, qVar, vVar, c22096n, i12, i13);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x011b  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22137p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(@Y61.k Y41.a r28, @Y61.l androidx.compose.ui.v.a r29, @Y61.l com.akita.compose.component.modal.C r30, @Y61.l androidx.compose.runtime.internal.C22096n r31, @Y61.l com.akita.compose.component.modal.ModalButtonsOrientation r32, @Y61.l androidx.compose.runtime.internal.C22096n r33, @Y61.l androidx.compose.runtime.internal.C22096n r34, @Y61.l java.lang.String r35, @Y61.l java.lang.String r36, @Y61.l androidx.compose.runtime.internal.C22096n r37, @Y61.l androidx.compose.runtime.internal.C22096n r38, @Y61.l androidx.compose.runtime.internal.C22096n r39, boolean r40, boolean r41, @Y61.l androidx.compose.ui.window.H r42, @Y61.l androidx.compose.runtime.A r43, int r44, int r45) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.akita.compose.component.modal.B.b(Y41.a, androidx.compose.ui.v$a, com.akita.compose.component.modal.C, androidx.compose.runtime.internal.n, com.akita.compose.component.modal.ModalButtonsOrientation, androidx.compose.runtime.internal.n, androidx.compose.runtime.internal.n, java.lang.String, java.lang.String, androidx.compose.runtime.internal.n, androidx.compose.runtime.internal.n, androidx.compose.runtime.internal.n, boolean, boolean, androidx.compose.ui.window.H, androidx.compose.runtime.A, int, int):void");
    }

    @InterfaceC22132o
    @InterfaceC22137p
    public static final void c(@Y61.k Y41.a aVar, @Y61.l v.a aVar2, @Y61.l C c12, boolean z12, boolean z13, @Y61.l H h12, @Y61.l C22096n c22096n, @Y61.k C22096n c22096n2, @Y61.l androidx.compose.runtime.A a12, int i12, int i13) {
        int i14;
        boolean z14;
        H h13;
        int i15;
        H h14;
        boolean z15;
        C22096n c22096n3;
        boolean z16;
        v.a aVar3;
        C c13;
        int i16;
        v.a aVar4;
        C c14;
        boolean z17;
        boolean z18;
        H h15;
        C22096n c22096n4;
        androidx.compose.runtime.B bE2 = a12.E(1874545742);
        if ((i12 & 14) == 0) {
            i14 = (bE2.u(aVar) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        int i17 = i14 | 176;
        if ((i12 & 7168) == 0) {
            if ((i13 & 8) == 0) {
                z14 = z12;
                int i18 = bE2.j(z14) ? 2048 : 1024;
                i17 |= i18;
            } else {
                z14 = z12;
            }
            i17 |= i18;
        } else {
            z14 = z12;
        }
        int i19 = i17 | 24576;
        int i22 = i13 & 32;
        if (i22 != 0) {
            i15 = i17 | 221184;
            h13 = h12;
        } else {
            h13 = h12;
            i15 = i19 | (bE2.B(h13) ? 131072 : AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR);
        }
        int i23 = i15 | 1572864;
        if ((23967451 & i23) == 4793490 && bE2.c()) {
            bE2.f();
            aVar4 = aVar2;
            c14 = c12;
            z18 = z13;
            c22096n4 = c22096n;
            h15 = h13;
            z17 = z14;
        } else {
            bE2.y0();
            if ((i12 & 1) == 0 || bE2.g0()) {
                v.a aVar5 = androidx.compose.ui.v.f42878y1;
                C c15 = (C) bE2.o(D.f62003a);
                int i24 = i23 & (-897);
                if ((i13 & 8) != 0) {
                    z14 = c15.f61999q;
                    i24 = i23 & (-8065);
                }
                if (i22 != 0) {
                    h13 = new H(false, false, false, 7, (C42822w) null);
                }
                C27347a.f62009a.getClass();
                h14 = h13;
                z15 = z14;
                c22096n3 = C27347a.f62016h;
                z16 = true;
                aVar3 = aVar5;
                c13 = c15;
                i16 = i24;
            } else {
                bE2.f();
                int i25 = i23 & (-897);
                if ((i13 & 8) != 0) {
                    i25 = i23 & (-8065);
                }
                aVar3 = aVar2;
                c13 = c12;
                z16 = z13;
                c22096n3 = c22096n;
                h14 = h13;
                z15 = z14;
                i16 = i25;
            }
            bE2.Y();
            e(aVar, h14, androidx.compose.runtime.internal.r.c(803104654, new k(c13, z15, z16, aVar, c22096n3, aVar3, c22096n2), bE2), bE2, (i16 & 14) | 384 | ((i16 >> 12) & 112));
            aVar4 = aVar3;
            c14 = c13;
            z17 = z15;
            z18 = z16;
            h15 = h14;
            c22096n4 = c22096n3;
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new l(aVar, aVar4, c14, z17, z18, h15, c22096n4, c22096n2, i12, i13);
        }
    }

    @InterfaceC22132o
    @InterfaceC22137p
    public static final void d(@Y61.k Y41.a aVar, @Y61.l androidx.compose.ui.v vVar, @Y61.l C c12, @Y61.l C22096n c22096n, @Y61.l C22096n c22096n2, @Y61.l C22096n c22096n3, @Y61.l C22096n c22096n4, @Y61.l C22096n c22096n5, @Y61.l C22096n c22096n6, boolean z12, boolean z13, @Y61.l H h12, @Y61.l androidx.compose.runtime.A a12, int i12) {
        int i13;
        int i14;
        C c13;
        C22096n c22096n7;
        C22096n c22096n8;
        C22096n c22096n9;
        C22096n c22096n10;
        C22096n c22096n11;
        boolean z14;
        H h13;
        H h14;
        C c14;
        C22096n c22096n12;
        C22096n c22096n13;
        C22096n c22096n14;
        C22096n c22096n15;
        ModalButtonsOrientation modalButtonsOrientation = ModalButtonsOrientation.f62005b;
        androidx.compose.runtime.B bE2 = a12.E(10813793);
        if ((i12 & 14) == 0) {
            i13 = (bE2.u(aVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.B(vVar) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i13 |= 128;
        }
        int i15 = i13 | 3072;
        if ((57344 & i12) == 0) {
            i15 |= bE2.B(modalButtonsOrientation) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((458752 & i12) == 0) {
            i15 |= AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
        }
        int i16 = 1572864 | i15;
        if ((29360128 & i12) == 0) {
            i16 |= bE2.u(c22096n4) ? 8388608 : 4194304;
        }
        int i17 = i16 | 905969664;
        if ((1533916891 & i17) == 306783378 && bE2.c()) {
            bE2.f();
            c14 = c12;
            c22096n12 = c22096n;
            c22096n13 = c22096n2;
            c22096n14 = c22096n3;
            c22096n15 = c22096n5;
            c22096n9 = c22096n6;
            z14 = z13;
            h14 = h12;
        } else {
            bE2.y0();
            if ((i12 & 1) == 0 || bE2.g0()) {
                C c15 = (C) bE2.o(D.f62003a);
                C27347a c27347a = C27347a.f62009a;
                c27347a.getClass();
                C22096n c22096n16 = C27347a.f62013e;
                C27349c c27349c = new C27349c();
                c22096n16.invoke(c27349c, bE2, Integer.valueOf((((i17 & (-897)) >> 6) & 112) | 8));
                List listM0 = C42745f0.M0(c27349c.f62038a);
                C22096n c22096nC = listM0.isEmpty() ? null : androidx.compose.runtime.internal.r.c(2105402225, new f(c15, listM0), bE2);
                c27347a.getClass();
                C22096n c22096n17 = C27347a.f62014f;
                C22096n c22096nC2 = androidx.compose.runtime.internal.r.c(16656695, new g(c22096n4, c22096n17), bE2);
                c27347a.getClass();
                i14 = i17 & (-459649);
                c13 = c15;
                c22096n7 = c22096n17;
                c22096n8 = c22096nC;
                c22096n9 = C27347a.f62015g;
                c22096n10 = c22096n16;
                c22096n11 = c22096nC2;
                z14 = true;
                h13 = new H(false, false, false, 7, (C42822w) null);
            } else {
                bE2.f();
                c13 = c12;
                c22096n10 = c22096n;
                c22096n8 = c22096n2;
                c22096n7 = c22096n3;
                c22096n11 = c22096n5;
                c22096n9 = c22096n6;
                z14 = z13;
                h13 = h12;
                i14 = i17 & (-459649);
            }
            bE2.Y();
            h14 = h13;
            e(aVar, h14, androidx.compose.runtime.internal.r.c(-900850527, new h(c13, aVar, z12, z14, c22096n8, c22096n9, vVar, c22096n11), bE2), bE2, (i14 & 14) | 432);
            c14 = c13;
            c22096n12 = c22096n10;
            c22096n13 = c22096n8;
            c22096n14 = c22096n7;
            c22096n15 = c22096n11;
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new i(aVar, vVar, c14, c22096n12, c22096n13, c22096n14, c22096n4, c22096n15, c22096n9, z12, z14, h14, i12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0066  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22137p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(Y41.a r10, androidx.compose.ui.window.H r11, androidx.compose.runtime.internal.C22096n r12, androidx.compose.runtime.A r13, int r14) {
        /*
            r0 = -430273482(0xffffffffe65a8c36, float:-2.5801558E23)
            androidx.compose.runtime.B r13 = r13.E(r0)
            r0 = r14 & 14
            if (r0 != 0) goto L16
            boolean r0 = r13.u(r10)
            if (r0 == 0) goto L13
            r0 = 4
            goto L14
        L13:
            r0 = 2
        L14:
            r0 = r0 | r14
            goto L17
        L16:
            r0 = r14
        L17:
            r1 = r14 & 112(0x70, float:1.57E-43)
            r2 = 32
            if (r1 != 0) goto L28
            boolean r1 = r13.B(r11)
            if (r1 == 0) goto L25
            r1 = r2
            goto L27
        L25:
            r1 = 16
        L27:
            r0 = r0 | r1
        L28:
            r1 = r14 & 896(0x380, float:1.256E-42)
            if (r1 != 0) goto L38
            boolean r1 = r13.u(r12)
            if (r1 == 0) goto L35
            r1 = 256(0x100, float:3.59E-43)
            goto L37
        L35:
            r1 = 128(0x80, float:1.8E-43)
        L37:
            r0 = r0 | r1
        L38:
            r1 = r0 & 731(0x2db, float:1.024E-42)
            r3 = 146(0x92, float:2.05E-43)
            if (r1 != r3) goto L49
            boolean r1 = r13.c()
            if (r1 != 0) goto L45
            goto L49
        L45:
            r13.f()
            goto L90
        L49:
            r1 = -1481557921(0xffffffffa7b1385f, float:-4.9188487E-15)
            r13.C(r1)
            r1 = r0 & 112(0x70, float:1.57E-43)
            r3 = 0
            if (r1 != r2) goto L56
            r1 = 1
            goto L57
        L56:
            r1 = r3
        L57:
            java.lang.Object r2 = r13.t()
            if (r1 != 0) goto L66
            androidx.compose.runtime.A$a r1 = androidx.compose.runtime.A.f37866a
            r1.getClass()
            androidx.compose.runtime.A$a$a r1 = androidx.compose.runtime.A.a.f37868b
            if (r2 != r1) goto L78
        L66:
            androidx.compose.ui.window.H r2 = new androidx.compose.ui.window.H
            boolean r5 = r11.f43023a
            r8 = 0
            boolean r9 = r11.f43027e
            boolean r6 = r11.f43024b
            androidx.compose.ui.window.SecureFlagPolicy r7 = r11.f43025c
            r4 = r2
            r4.<init>(r5, r6, r7, r8, r9)
            r13.H(r2)
        L78:
            androidx.compose.ui.window.H r2 = (androidx.compose.ui.window.H) r2
            r13.X(r3)
            com.akita.compose.component.modal.m r1 = new com.akita.compose.component.modal.m
            r1.<init>(r12)
            r3 = -1572524531(0xffffffffa2452e0d, float:-2.6722858E-18)
            androidx.compose.runtime.internal.n r1 = androidx.compose.runtime.internal.r.c(r3, r1, r13)
            r0 = r0 & 14
            r0 = r0 | 384(0x180, float:5.38E-43)
            androidx.compose.ui.window.C22724k.a(r10, r2, r1, r13, r0)
        L90:
            androidx.compose.runtime.c2 r13 = r13.Z()
            if (r13 == 0) goto L9d
            com.akita.compose.component.modal.n r0 = new com.akita.compose.component.modal.n
            r0.<init>(r10, r11, r12, r14)
            r13.f38184d = r0
        L9d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.akita.compose.component.modal.B.e(Y41.a, androidx.compose.ui.window.H, androidx.compose.runtime.internal.n, androidx.compose.runtime.A, int):void");
    }

    public static final void f(C c12, Y41.a aVar, boolean z12, boolean z13, Y41.p pVar, Y41.q qVar, androidx.compose.ui.v vVar, Y41.p pVar2, androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(-2111901286);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(c12) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.u(aVar) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i13 |= bE2.j(z12) ? 256 : 128;
        }
        if ((i12 & 7168) == 0) {
            i13 |= bE2.j(z13) ? 2048 : 1024;
        }
        if ((57344 & i12) == 0) {
            i13 |= bE2.u(pVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((458752 & i12) == 0) {
            i13 |= bE2.u(qVar) ? 131072 : AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
        }
        if ((i12 & 3670016) == 0) {
            i13 |= bE2.B(vVar) ? 1048576 : 524288;
        }
        if ((29360128 & i12) == 0) {
            i13 |= bE2.u(pVar2) ? 8388608 : 4194304;
        }
        if ((23967451 & i13) == 4793490 && bE2.c()) {
            bE2.f();
        } else {
            float f12 = c12.f61983a;
            C22096n c22096nC = androidx.compose.runtime.internal.r.c(-1102798715, new y(c12, pVar, pVar2), bE2);
            e.a aVar2 = com.akita.compose.foundation.modifier.e.f63615e;
            a(f12, c12.f61989g, c12.f61990h, z12, z13, c12.f61998p, aVar, c12.f62000r, c12.f62001s, qVar, vVar, c22096nC, bE2, (3670016 & (i13 << 15)) | ((i13 << 3) & 64512) | ((i13 << 12) & 1879048192), ((i13 >> 18) & 14) | 48);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new z(c12, aVar, z12, z13, pVar, qVar, vVar, pVar2, i12);
        }
    }

    public static final void g(C c12, List list, ModalButtonsOrientation modalButtonsOrientation, androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(31171525);
        int iOrdinal = modalButtonsOrientation.ordinal();
        float f12 = 1.0f;
        boolean z12 = true;
        InterfaceC22078i<?> interfaceC22078i = bE2.f37890b;
        if (iOrdinal == 0) {
            boolean z13 = true;
            bE2.C(1734685325);
            C20585k c20585k = C20585k.f28659a;
            float f13 = c12.f61995m;
            c20585k.getClass();
            C20585k.j jVarG = C20585k.g(f13);
            v.a aVar = androidx.compose.ui.v.f42878y1;
            InterfaceC22215f.f39074a.getClass();
            I iA2 = androidx.compose.foundation.layout.H.a(jVarG, InterfaceC22215f.a.f39088n, bE2, 0);
            int i13 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, aVar);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar2 = InterfaceC22413h.a.f40791b;
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
            R3.b(InterfaceC22413h.a.f40796g, bE2, iA2);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i13))) {
                AK.c.y(i13, bE2, i13, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            K k12 = K.f28344a;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C27348b c27348b = (C27348b) it.next();
                com.akita.compose.component.button.m.c(c27348b.f62030a, c27348b.f62031b, c27348b.f62032c, C20588k2.d(androidx.compose.ui.v.f42878y1, 1.0f), c27348b.f62033d, c27348b.f62034e, c27348b.f62035f, c27348b.f62036g, c27348b.f62037h, null, bE2, 3584, 512);
                z13 = z13;
            }
            bE2.X(z13);
            bE2.X(false);
        } else if (iOrdinal != 1) {
            bE2.C(1736102986);
            bE2.X(false);
        } else {
            bE2.C(1735428178);
            C20585k c20585k2 = C20585k.f28659a;
            float f14 = c12.f61995m;
            c20585k2.getClass();
            C20585k.j jVarG2 = C20585k.g(f14);
            v.a aVar3 = androidx.compose.ui.v.f42878y1;
            InterfaceC22215f.f39074a.getClass();
            C20568f2 c20568f2A = C20563e2.a(jVarG2, InterfaceC22215f.a.f39085k, bE2, 0);
            int i14 = bE2.f37888Q;
            O1 o1S2 = bE2.S();
            androidx.compose.ui.v vVarC2 = androidx.compose.ui.n.c(bE2, aVar3);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar4 = InterfaceC22413h.a.f40791b;
            if (interfaceC22078i == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar4);
            } else {
                bE2.d();
            }
            R3.b(InterfaceC22413h.a.f40796g, bE2, c20568f2A);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S2);
            Y41.p<InterfaceC22413h, Integer, G0> pVar2 = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar2);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC2);
            C20576h2 c20576h2 = C20576h2.f28641a;
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C27348b c27348b2 = (C27348b) it2.next();
                com.akita.compose.component.button.m.c(c27348b2.f62030a, c27348b2.f62031b, c27348b2.f62032c, c20576h2.a(androidx.compose.ui.v.f42878y1, f12, z12), c27348b2.f62033d, c27348b2.f62034e, c27348b2.f62035f, c27348b2.f62036g, c27348b2.f62037h, null, bE2, 512, 512);
                c20576h2 = c20576h2;
                z12 = true;
                f12 = 1.0f;
            }
            bE2.X(z12);
            bE2.X(false);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new A(c12, list, modalButtonsOrientation, i12);
        }
    }
}
