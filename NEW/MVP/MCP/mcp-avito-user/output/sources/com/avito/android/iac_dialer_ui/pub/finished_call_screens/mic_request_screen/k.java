package com.avito.android.iac_dialer_ui.pub.finished_call_screens.mic_request_screen;

import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.internal.r;
import androidx.compose.ui.v;
import kotlin.Metadata;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: IacUIFinishedMicRequestScreen.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_iac-dialer-ui_public"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class k {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k l lVar, @Y61.k Y41.a aVar, @Y61.k Y41.a aVar2, @Y61.k Y41.a aVar3, @Y61.k Y41.a aVar4, @Y61.k Y41.a aVar5, @Y61.k Y41.a aVar6, @Y61.l v.a aVar7, @Y61.l A a12, int i12) {
        v.a aVar8;
        B bE2 = a12.E(-878138996);
        int i13 = (bE2.B(lVar) ? 4 : 2) | i12;
        if ((i12 & 896) == 0) {
            i13 |= bE2.u(aVar2) ? 256 : 128;
        }
        if ((i12 & 7168) == 0) {
            i13 |= bE2.u(aVar3) ? 2048 : 1024;
        }
        if ((57344 & i12) == 0) {
            i13 |= bE2.u(aVar4) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((458752 & i12) == 0) {
            i13 |= bE2.u(aVar5) ? 131072 : AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
        }
        if ((3670016 & i12) == 0) {
            i13 |= bE2.u(aVar6) ? 1048576 : 524288;
        }
        if (((i13 | 12582912) & 23967451) == 4793490 && bE2.c()) {
            bE2.f();
            aVar8 = aVar7;
        } else {
            v.a aVar9 = v.f42878y1;
            com.akita.compose.theme.re23.c.a(false, r.c(1721795111, new h(aVar9, lVar, aVar, aVar2, aVar3, aVar4, aVar5, aVar6), bE2), bE2, 48, 1);
            aVar8 = aVar9;
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new i(lVar, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar8, i12);
        }
    }
}
