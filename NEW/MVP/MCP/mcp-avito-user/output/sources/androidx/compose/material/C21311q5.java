package androidx.compose.material;

import kotlin.Metadata;

/* compiled from: ListItem.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.material.q5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21311q5 {
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(java.util.List r8, androidx.compose.ui.v r9, androidx.compose.runtime.internal.C22096n r10, androidx.compose.runtime.A r11, int r12) {
        /*
            r0 = 1631148337(0x61395931, float:2.1369216E20)
            androidx.compose.runtime.B r11 = r11.E(r0)
            r0 = r12 & 6
            if (r0 != 0) goto L16
            boolean r0 = r11.u(r8)
            if (r0 == 0) goto L13
            r0 = 4
            goto L14
        L13:
            r0 = 2
        L14:
            r0 = r0 | r12
            goto L17
        L16:
            r0 = r12
        L17:
            r1 = r12 & 48
            if (r1 != 0) goto L27
            boolean r1 = r11.B(r9)
            if (r1 == 0) goto L24
            r1 = 32
            goto L26
        L24:
            r1 = 16
        L26:
            r0 = r0 | r1
        L27:
            r1 = r12 & 384(0x180, float:5.38E-43)
            if (r1 != 0) goto L37
            boolean r1 = r11.u(r10)
            if (r1 == 0) goto L34
            r1 = 256(0x100, float:3.59E-43)
            goto L36
        L34:
            r1 = 128(0x80, float:1.8E-43)
        L36:
            r0 = r0 | r1
        L37:
            r1 = r0 & 147(0x93, float:2.06E-43)
            r2 = 146(0x92, float:2.05E-43)
            r3 = 1
            if (r1 == r2) goto L40
            r1 = r3
            goto L41
        L40:
            r1 = 0
        L41:
            r2 = r0 & 1
            boolean r1 = r11.p(r2, r1)
            if (r1 == 0) goto Lc9
            boolean r1 = r11.u(r8)
            java.lang.Object r2 = r11.t()
            if (r1 != 0) goto L5c
            androidx.compose.runtime.A$a r1 = androidx.compose.runtime.A.f37866a
            r1.getClass()
            androidx.compose.runtime.A$a$a r1 = androidx.compose.runtime.A.a.f37868b
            if (r2 != r1) goto L64
        L5c:
            androidx.compose.material.i5 r2 = new androidx.compose.material.i5
            r2.<init>(r8)
            r11.H(r2)
        L64:
            androidx.compose.ui.layout.i0 r2 = (androidx.compose.ui.layout.InterfaceC22365i0) r2
            int r1 = r0 >> 6
            r1 = r1 & 14
            r0 = r0 & 112(0x70, float:1.57E-43)
            r0 = r0 | r1
            int r1 = r11.f37888Q
            androidx.compose.runtime.O1 r4 = r11.S()
            androidx.compose.ui.v r5 = androidx.compose.ui.n.c(r11, r9)
            androidx.compose.ui.node.h$a r6 = androidx.compose.ui.node.InterfaceC22413h.f40789C1
            r6.getClass()
            Y41.a<androidx.compose.ui.node.h> r6 = androidx.compose.ui.node.InterfaceC22413h.a.f40791b
            int r0 = r0 << 6
            r0 = r0 & 896(0x380, float:1.256E-42)
            r0 = r0 | 6
            androidx.compose.runtime.i<?> r7 = r11.f37890b
            if (r7 == 0) goto Lc4
            r11.A()
            boolean r7 = r11.f37887P
            if (r7 == 0) goto L93
            r11.b(r6)
            goto L96
        L93:
            r11.d()
        L96:
            Y41.p<androidx.compose.ui.node.h, androidx.compose.ui.layout.i0, kotlin.G0> r6 = androidx.compose.ui.node.InterfaceC22413h.a.f40796g
            androidx.compose.runtime.R3.b(r6, r11, r2)
            Y41.p<androidx.compose.ui.node.h, androidx.compose.runtime.U, kotlin.G0> r2 = androidx.compose.ui.node.InterfaceC22413h.a.f40795f
            androidx.compose.runtime.R3.b(r2, r11, r4)
            Y41.p<androidx.compose.ui.node.h, java.lang.Integer, kotlin.G0> r2 = androidx.compose.ui.node.InterfaceC22413h.a.f40799j
            boolean r4 = r11.f37887P
            if (r4 != 0) goto Lb4
            java.lang.Object r4 = r11.t()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            boolean r4 = kotlin.jvm.internal.L.f(r4, r6)
            if (r4 != 0) goto Lb7
        Lb4:
            AK.c.y(r1, r11, r1, r2)
        Lb7:
            Y41.p<androidx.compose.ui.node.h, androidx.compose.ui.v, kotlin.G0> r1 = androidx.compose.ui.node.InterfaceC22413h.a.f40793d
            androidx.compose.runtime.R3.b(r1, r11, r5)
            int r0 = r0 >> 6
            r0 = r0 & 14
            androidx.compose.foundation.H.v(r0, r10, r11, r3)
            goto Lcc
        Lc4:
            androidx.compose.runtime.C22190v.b()
            r8 = 0
            throw r8
        Lc9:
            r11.f()
        Lcc:
            androidx.compose.runtime.c2 r11 = r11.Z()
            if (r11 == 0) goto Ld9
            androidx.compose.material.j5 r0 = new androidx.compose.material.j5
            r0.<init>(r8, r9, r10, r12)
            r11.f38184d = r0
        Ld9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.C21311q5.a(java.util.List, androidx.compose.ui.v, androidx.compose.runtime.internal.n, androidx.compose.runtime.A, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(float r8, androidx.compose.ui.v r9, androidx.compose.runtime.internal.C22096n r10, androidx.compose.runtime.A r11, int r12, int r13) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.C21311q5.b(float, androidx.compose.ui.v, androidx.compose.runtime.internal.n, androidx.compose.runtime.A, int, int):void");
    }
}
