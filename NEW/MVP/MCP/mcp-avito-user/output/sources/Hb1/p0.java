package Hb1;

import androidx.compose.runtime.C22039c2;
import androidx.compose.ui.platform.C22535v1;
import gc1.C40657a;
import gc1.InterfaceC40658b;
import w2.AbstractC49426b;

/* loaded from: classes9.dex */
public abstract class p0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(int r19, int r20, androidx.compose.runtime.A r21, androidx.compose.ui.v r22, Y41.l r23, Y41.p r24, gc1.InterfaceC40658b.e r25) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Hb1.p0.a(int, int, androidx.compose.runtime.A, androidx.compose.ui.v, Y41.l, Y41.p, gc1.b$e):void");
    }

    public static final void b(int i12, androidx.compose.runtime.A a12, androidx.compose.ui.v vVar, Y41.l lVar, Y41.p pVar, InterfaceC40658b.e eVar) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(-1034470918);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(eVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.u(pVar) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i13 |= bE2.B(vVar) ? 256 : 128;
        }
        if ((i12 & 7168) == 0) {
            i13 |= bE2.u(lVar) ? 2048 : 1024;
        }
        if ((i13 & 5851) == 1170 && bE2.c()) {
            bE2.f();
        } else {
            C40657a c40657a = eVar.f396526i;
            boolean z12 = (c40657a == null || pVar == null) ? false : true;
            I81.e.a(androidx.compose.ui.n.a(vVar, C22535v1.f41625a, new j0(pVar, eVar, c40657a)), 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.r.b(bE2, -379236312, new l0(z12 ? AbstractC49426b.f441183Z : AbstractC49426b.f441187b0, z12, eVar.f396522e, eVar.f396519b, lVar, eVar.f396518a, eVar.f396520c, eVar.f396523f)), bE2, 100663296, 254);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z == null) {
            return;
        }
        c22039c2Z.f38184d = new n0(i12, vVar, lVar, pVar, eVar);
    }
}
