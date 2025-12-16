package com.avito.android.tariff_lf_publication.level.ui;

import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;
import wZ.C49580d;

/* compiled from: TariffLfPublicationLevelFooter.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_tariff-lf-publication_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class k {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.k C49580d c49580d, @Y61.k Y41.l lVar, boolean z12, @Y61.l v.a aVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        v.a aVar2;
        androidx.compose.runtime.B bE2 = a12.E(113996029);
        if (((i12 | (bE2.B(str) ? 4 : 2) | (bE2.B(str2) ? 32 : 16) | (bE2.B(str3) ? 256 : 128) | (bE2.u(lVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bE2.j(z12) ? 131072 : AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) | 1572864) & 2995931) == 599186 && bE2.c()) {
            bE2.f();
            aVar2 = aVar;
        } else {
            aVar2 = androidx.compose.ui.v.f42878y1;
            float f12 = 16;
            h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
            com.avito.android.mnz_common.compose.D.a(R1.d(f12, 22, f12, f12), aVar2, 0, androidx.compose.runtime.internal.r.c(308783707, new i(str, str2, str3, c49580d, lVar, z12), bE2), bE2, 3126, 4);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new j(str, str2, str3, c49580d, lVar, z12, aVar2, i12);
        }
    }
}
