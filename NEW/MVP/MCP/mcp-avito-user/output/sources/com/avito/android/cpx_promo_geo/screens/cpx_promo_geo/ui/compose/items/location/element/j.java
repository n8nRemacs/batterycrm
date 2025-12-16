package com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.ui.compose.items.location.element;

import Y41.p;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22137p;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;
import ts.C48709c;

/* compiled from: CpxPromoGeoSlider.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_cpx-promo-geo_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class j {
    @InterfaceC22132o
    @InterfaceC22137p
    public static final void a(@Y61.k C20644z c20644z, @Y61.k C48709c.x xVar, @Y61.l p pVar, @Y61.k Y41.l lVar, boolean z12, @Y61.l A a12, int i12) {
        int i13;
        B bE2 = a12.E(1573314361);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(c20644z) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.B(xVar) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i13 |= bE2.u(pVar) ? 256 : 128;
        }
        if ((i12 & 7168) == 0) {
            i13 |= bE2.u(lVar) ? 2048 : 1024;
        }
        if ((57344 & i12) == 0) {
            i13 |= bE2.j(z12) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((i12 & 458752) == 0) {
            i13 |= bE2.B("CPX_PROMO_GEO_MERGED_LOCATION_SETTING_SLIDER_TEST_TAG") ? 131072 : AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
        }
        if ((374491 & i13) == 74898 && bE2.c()) {
            bE2.f();
        } else {
            int i14 = i13 << 3;
            int i15 = (i13 & 14) | 24624 | (i14 & 896) | (i14 & 7168);
            int i16 = i13 << 6;
            c(c20644z, null, xVar, pVar, null, lVar, z12, "CPX_PROMO_GEO_MERGED_LOCATION_SETTING_SLIDER_TEST_TAG", bE2, (458752 & i16) | i15 | (3670016 & i16) | (i16 & 29360128));
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new f(c20644z, xVar, pVar, lVar, z12, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22137p
    public static final void b(@Y61.k C20644z c20644z, long j12, @Y61.k C48709c.x xVar, @Y61.l p pVar, @Y61.k p pVar2, boolean z12, @Y61.k String str, @Y61.l A a12, int i12) {
        int i13;
        B bE2 = a12.E(1240706516);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(c20644z) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.n(j12) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i13 |= bE2.B(xVar) ? 256 : 128;
        }
        if ((i12 & 7168) == 0) {
            i13 |= bE2.u(pVar) ? 2048 : 1024;
        }
        if ((i12 & 57344) == 0) {
            i13 |= bE2.u(pVar2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((458752 & i12) == 0) {
            i13 |= bE2.j(z12) ? 131072 : AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
        }
        if ((i12 & 3670016) == 0) {
            i13 |= bE2.B(str) ? 1048576 : 524288;
        }
        if ((2995931 & i13) == 599186 && bE2.c()) {
            bE2.f();
        } else {
            int i14 = (57344 & i13) | 196608 | (i13 & 14) | (i13 & 112) | (i13 & 896) | (i13 & 7168);
            int i15 = i13 << 3;
            c(c20644z, Long.valueOf(j12), xVar, pVar, pVar2, null, z12, str, bE2, i14 | (3670016 & i15) | (i15 & 29360128));
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new g(c20644z, j12, xVar, pVar, pVar2, z12, str, i12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x01a4  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22137p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(androidx.compose.foundation.layout.C20644z r23, java.lang.Long r24, ts.C48709c.x r25, Y41.p r26, Y41.p r27, Y41.l r28, boolean r29, java.lang.String r30, androidx.compose.runtime.A r31, int r32) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.ui.compose.items.location.element.j.c(androidx.compose.foundation.layout.z, java.lang.Long, ts.c$x, Y41.p, Y41.p, Y41.l, boolean, java.lang.String, androidx.compose.runtime.A, int):void");
    }
}
