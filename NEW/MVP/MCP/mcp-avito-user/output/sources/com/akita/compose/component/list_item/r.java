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

/* compiled from: ListItemRadio.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"list-item_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class r {
    @InterfaceC22132o
    @InterfaceC22137p
    public static final void a(@Y61.k C22602e c22602e, boolean z12, @Y61.k s sVar, @Y61.l androidx.compose.ui.v vVar, @Y61.l Y41.p pVar, @Y61.l Y41.p pVar2, @Y61.l A a12, int i12) {
        int i13;
        B bE2 = a12.E(-339985450);
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
            i13 |= bE2.u(pVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((i12 & 458752) == 0) {
            i13 |= bE2.u(pVar2) ? 131072 : AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
        }
        if ((374491 & i13) == 74898 && bE2.c()) {
            bE2.f();
        } else {
            int i14 = i13 >> 3;
            m.b(c22602e, sVar, vVar, pVar, androidx.compose.runtime.internal.r.c(225970872, new p(z12, sVar), bE2), pVar2, bE2, (i13 & 14) | 24576 | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (i13 & 458752), 0);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new q(c22602e, z12, sVar, vVar, pVar, pVar2, i12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22137p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(@Y61.k java.lang.String r15, boolean r16, @Y61.k com.akita.compose.component.list_item.s r17, @Y61.l androidx.compose.ui.v r18, @Y61.l androidx.compose.runtime.internal.C22096n r19, @Y61.l androidx.compose.runtime.internal.C22096n r20, @Y61.l androidx.compose.runtime.A r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.akita.compose.component.list_item.r.b(java.lang.String, boolean, com.akita.compose.component.list_item.s, androidx.compose.ui.v, androidx.compose.runtime.internal.n, androidx.compose.runtime.internal.n, androidx.compose.runtime.A, int, int):void");
    }
}
