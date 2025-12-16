package com.akita.compose.component.list_item;

import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22137p;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.text.C22602e;
import kotlin.Metadata;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: ListItemSwitcher.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"list-item_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class w {
    @InterfaceC22132o
    @InterfaceC22137p
    public static final void a(@Y61.k C22602e c22602e, boolean z12, @Y61.k s sVar, @Y61.l androidx.compose.ui.v vVar, boolean z13, @Y61.l Y41.p pVar, @Y61.l Y41.p pVar2, @Y61.l A a12, int i12) {
        int i13;
        B bE2 = a12.E(-2037345836);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(c22602e) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.j(z12) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i13 |= bE2.B(sVar) ? 256 : 128;
        }
        if ((i12 & 7168) == 0) {
            i13 |= bE2.B(vVar) ? 2048 : 1024;
        }
        if ((57344 & i12) == 0) {
            i13 |= bE2.j(z13) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((458752 & i12) == 0) {
            i13 |= bE2.u(pVar) ? 131072 : AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
        }
        if ((3670016 & i12) == 0) {
            i13 |= bE2.u(pVar2) ? 1048576 : 524288;
        }
        if ((2995931 & i13) == 599186 && bE2.c()) {
            bE2.f();
        } else {
            C22096n c22096nC = androidx.compose.runtime.internal.r.c(-52853201, new v(z12, sVar), bE2);
            int i14 = i13 >> 3;
            m.b(c22602e, sVar, vVar, pVar, z13 ? c22096nC : pVar2, z13 ? pVar2 : c22096nC, bE2, (i13 & 14) | (i14 & 112) | (i14 & 896) | ((i13 >> 6) & 7168), 0);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new u(c22602e, z12, sVar, vVar, z13, pVar, pVar2, i12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22137p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(@Y61.k java.lang.String r20, boolean r21, @Y61.k com.akita.compose.component.list_item.s r22, @Y61.l androidx.compose.ui.v r23, boolean r24, @Y61.l androidx.compose.runtime.internal.C22096n r25, @Y61.l androidx.compose.runtime.internal.C22096n r26, @Y61.l androidx.compose.runtime.A r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.akita.compose.component.list_item.w.b(java.lang.String, boolean, com.akita.compose.component.list_item.s, androidx.compose.ui.v, boolean, androidx.compose.runtime.internal.n, androidx.compose.runtime.internal.n, androidx.compose.runtime.A, int, int):void");
    }
}
