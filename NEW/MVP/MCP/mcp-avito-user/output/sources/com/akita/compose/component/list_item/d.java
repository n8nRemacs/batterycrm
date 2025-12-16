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

/* compiled from: ListItemCheckbox.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"list-item_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d {
    @InterfaceC22132o
    @InterfaceC22137p
    public static final void a(@Y61.k C22602e c22602e, boolean z12, @Y61.k s sVar, @Y61.l androidx.compose.ui.v vVar, @Y61.l C22096n c22096n, @Y61.l C22096n c22096n2, @Y61.l A a12, int i12) {
        int i13;
        B bE2 = a12.E(-1777926860);
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
            i13 |= bE2.u(c22096n) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((i12 & 458752) == 0) {
            i13 |= bE2.u(c22096n2) ? 131072 : AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
        }
        if ((374491 & i13) == 74898 && bE2.c()) {
            bE2.f();
        } else {
            int i14 = i13 >> 3;
            m.b(c22602e, sVar, vVar, c22096n, androidx.compose.runtime.internal.r.c(913349270, new b(z12, sVar), bE2), c22096n2, bE2, (i13 & 14) | 24576 | (i14 & 112) | (i14 & 896) | (i14 & 7168) | (i13 & 458752), 0);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new c(c22602e, z12, sVar, vVar, c22096n, c22096n2, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22137p
    public static final void b(boolean z12, @Y61.k s sVar, @Y61.l androidx.compose.ui.v vVar, @Y61.l C22096n c22096n, @Y61.l C22096n c22096n2, @Y61.l A a12, int i12) {
        B bE2 = a12.E(60166880);
        int i13 = (bE2.j(z12) ? 32 : 16) | i12 | (bE2.B(sVar) ? 256 : 128) | (bE2.B(vVar) ? 2048 : 1024) | (bE2.u(c22096n) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bE2.u(c22096n2) ? 131072 : AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR);
        if ((374491 & i13) == 74898 && bE2.c()) {
            bE2.f();
        } else {
            a(new C22602e("List item checkbox", null, 2, null), z12, sVar, vVar, c22096n, c22096n2, bE2, i13 & 524272);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new a(z12, sVar, vVar, c22096n, c22096n2, i12);
        }
    }
}
