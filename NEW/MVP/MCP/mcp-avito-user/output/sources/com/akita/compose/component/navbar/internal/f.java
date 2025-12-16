package com.akita.compose.component.navbar.internal;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.layout.T1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22137p;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.r;
import androidx.compose.ui.graphics.h1;
import androidx.compose.ui.v;
import com.akita.compose.foundation.p;
import com.akita.compose.foundation.ui.n;
import kotlin.Metadata;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: NavBarLayout.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"navbar_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class f {
    @InterfaceC22132o
    @InterfaceC22137p
    public static final void a(@k p pVar, @k p pVar2, @k T1 t12, @k h1 h1Var, @l v vVar, @k C22096n c22096n, @l A a12, int i12) {
        int i13;
        B bE2 = a12.E(-126725977);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(pVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.B(pVar2) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i13 |= bE2.B(t12) ? 256 : 128;
        }
        if ((i12 & 7168) == 0) {
            i13 |= bE2.B(h1Var) ? 2048 : 1024;
        }
        if ((i12 & 57344) == 0) {
            i13 |= bE2.B(vVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((458752 & i12) == 0) {
            i13 |= bE2.u(c22096n) ? 131072 : AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
        }
        if ((374491 & i13) == 74898 && bE2.c()) {
            bE2.f();
        } else {
            int i14 = ((i13 >> 12) & 14) | 1572864 | ((i13 >> 6) & 112);
            int i15 = i13 << 9;
            n.a(vVar, h1Var, 0.0f, pVar, pVar2, r.c(-1525047325, new d(t12, c22096n), bE2), bE2, (i15 & 57344) | i14 | (i15 & 7168), 36);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new e(pVar, pVar2, t12, h1Var, vVar, c22096n, i12);
        }
    }
}
