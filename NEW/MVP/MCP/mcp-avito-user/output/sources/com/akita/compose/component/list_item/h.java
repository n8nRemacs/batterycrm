package com.akita.compose.component.list_item;

import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22137p;
import androidx.compose.ui.text.C22602e;
import kotlin.Metadata;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: ListItemCheckmark.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"list-item_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h {
    @InterfaceC22132o
    @InterfaceC22137p
    public static final void a(@Y61.k C22602e c22602e, boolean z12, @Y61.k s sVar, @Y61.l androidx.compose.ui.v vVar, @Y61.l Y41.p pVar, @Y61.l Y41.p pVar2, @Y61.l A a12, int i12) {
        int i13;
        B bE2 = a12.E(934312214);
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
        if ((i12 & 57344) == 0) {
            i13 |= bE2.u(pVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((458752 & i12) == 0) {
            i13 |= bE2.u(pVar2) ? 131072 : AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
        }
        if ((374491 & i13) == 74898 && bE2.c()) {
            bE2.f();
        } else {
            int i14 = (i13 & 14) | 196608;
            int i15 = i13 >> 3;
            m.b(c22602e, sVar, vVar, pVar, pVar2, androidx.compose.runtime.internal.r.c(-1815031815, new f(z12, sVar), bE2), bE2, i14 | (i15 & 112) | (i15 & 896) | (i15 & 7168) | (i15 & 57344), 0);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new g(c22602e, z12, sVar, vVar, pVar, pVar2, i12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22137p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(@Y61.k java.lang.String r18, boolean r19, @Y61.k com.akita.compose.component.list_item.s r20, @Y61.l androidx.compose.ui.v r21, @Y61.l androidx.compose.runtime.internal.C22096n r22, @Y61.l androidx.compose.runtime.internal.C22096n r23, @Y61.l androidx.compose.runtime.A r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.akita.compose.component.list_item.h.b(java.lang.String, boolean, com.akita.compose.component.list_item.s, androidx.compose.ui.v, androidx.compose.runtime.internal.n, androidx.compose.runtime.internal.n, androidx.compose.runtime.A, int, int):void");
    }
}
