package com.akita.compose.component.navbar;

import androidx.compose.foundation.layout.T1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22137p;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.graphics.Y0;
import androidx.compose.ui.graphics.h1;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;

/* compiled from: NavBar.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"navbar_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class t {
    @InterfaceC22132o
    @InterfaceC22137p
    public static final void a(androidx.compose.ui.v vVar, C22096n c22096n, Y41.q qVar, com.akita.compose.foundation.p pVar, com.akita.compose.foundation.p pVar2, h1 h1Var, T1 t12, C22096n c22096n2, A a12, int i12) {
        int i13;
        h1 h1Var2;
        h1 h1Var3;
        B bE2 = a12.E(1316083604);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(vVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.u(c22096n) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i13 |= bE2.u(qVar) ? 256 : 128;
        }
        if ((i12 & 7168) == 0) {
            i13 |= bE2.B(pVar) ? 2048 : 1024;
        }
        if ((i12 & 57344) == 0) {
            i13 |= bE2.B(pVar2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        int i14 = i13 | 196608;
        if ((3670016 & i12) == 0) {
            i14 |= bE2.B(t12) ? 1048576 : 524288;
        }
        if ((29360128 & i12) == 0) {
            i14 |= bE2.u(c22096n2) ? 8388608 : 4194304;
        }
        if ((23967451 & i14) == 4793490 && bE2.c()) {
            bE2.f();
            h1Var3 = h1Var;
        } else {
            bE2.y0();
            if ((i12 & 1) == 0 || bE2.g0()) {
                h1Var2 = Y0.f39346a;
            } else {
                bE2.f();
                h1Var2 = h1Var;
            }
            bE2.Y();
            int i15 = i14 >> 9;
            com.akita.compose.component.navbar.internal.f.a(pVar, pVar2, t12, h1Var2, vVar, androidx.compose.runtime.internal.r.c(-709889006, new q(c22096n, qVar, c22096n2), bE2), bE2, 196608 | (i15 & 14) | (i15 & 112) | ((i14 >> 12) & 896) | ((i14 >> 6) & 7168) | ((i14 << 12) & 57344));
            h1Var3 = h1Var2;
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new r(vVar, c22096n, qVar, pVar, pVar2, h1Var3, t12, c22096n2, i12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22137p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(@Y61.l androidx.compose.ui.v r16, @Y61.l com.akita.compose.component.navbar.u r17, int r18, @Y61.l Y41.a r19, @Y61.l androidx.compose.runtime.internal.C22096n r20, @Y61.l androidx.compose.runtime.A r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.akita.compose.component.navbar.t.b(androidx.compose.ui.v, com.akita.compose.component.navbar.u, int, Y41.a, androidx.compose.runtime.internal.n, androidx.compose.runtime.A, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012e  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22137p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(@Y61.l androidx.compose.ui.v r19, @Y61.l com.akita.compose.component.navbar.u r20, @Y61.l Y41.a r21, int r22, @Y61.l Y41.q r23, @Y61.l androidx.compose.runtime.internal.C22096n r24, @Y61.l androidx.compose.runtime.A r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.akita.compose.component.navbar.t.c(androidx.compose.ui.v, com.akita.compose.component.navbar.u, Y41.a, int, Y41.q, androidx.compose.runtime.internal.n, androidx.compose.runtime.A, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x010a  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22137p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(@Y61.k java.lang.String r18, @Y61.l androidx.compose.ui.v r19, @Y61.l com.akita.compose.component.navbar.u r20, int r21, @Y61.l Y41.a r22, @Y61.l androidx.compose.runtime.internal.C22096n r23, @Y61.l androidx.compose.runtime.A r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.akita.compose.component.navbar.t.d(java.lang.String, androidx.compose.ui.v, com.akita.compose.component.navbar.u, int, Y41.a, androidx.compose.runtime.internal.n, androidx.compose.runtime.A, int, int):void");
    }
}
