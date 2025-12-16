package com.avito.android.iac_dialer_ui.pub.finished_call_screens.fallback_screen;

import Y61.l;
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

/* compiled from: IacUIFinishedFallbackScreen.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_iac-dialer-ui_public"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class i {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k j jVar, @Y61.k Y41.a aVar, @Y61.k Y41.a aVar2, @Y61.k Y41.a aVar3, @Y61.k Y41.a aVar4, @Y61.k Y41.a aVar5, @l v.a aVar6, @l A a12, int i12) {
        int i13;
        v.a aVar7;
        B bE2 = a12.E(-395557697);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(jVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
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
        if (((i13 | 1572864) & 2995931) == 599186 && bE2.c()) {
            bE2.f();
            aVar7 = aVar6;
        } else {
            v.a aVar8 = v.f42878y1;
            com.akita.compose.theme.re23.c.a(false, r.c(-1525492732, new b(aVar8, aVar2, jVar, aVar, aVar5, aVar3, aVar4), bE2), bE2, 48, 1);
            aVar7 = aVar8;
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new c(jVar, aVar, aVar2, aVar3, aVar4, aVar5, aVar7, i12);
        }
    }
}
