package com.avito.android.iac_dialer_ui.pub.util;

import Y61.k;
import Y61.l;
import android.text.format.DateUtils;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22137p;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.r;
import androidx.compose.ui.v;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import okhttp3.internal.http2.Http2;

/* compiled from: LiveCallTimer.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_iac-dialer-ui_public"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f {
    @InterfaceC22132o
    @InterfaceC22137p
    public static final void a(@l Long l12, @l Long l13, @k Y41.a aVar, @l v.a aVar2, @k C22096n c22096n, @l A a12, int i12) {
        int i13;
        v.a aVar3;
        B bE2 = a12.E(-2117994113);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(l12) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.B(l13) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i13 |= bE2.u(aVar) ? 256 : 128;
        }
        int i14 = i13 | 3072;
        if ((57344 & i12) == 0) {
            i14 |= bE2.u(c22096n) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((46811 & i14) == 9362 && bE2.c()) {
            bE2.f();
            aVar3 = aVar2;
        } else {
            aVar3 = v.f42878y1;
            if (l12 != null && l12.longValue() > 0) {
                if (l13 == null || l13.longValue() <= 0) {
                    bE2.C(-1228785566);
                    i.a(aVar, 200L, aVar3, r.c(435261386, new d(l12, c22096n), bE2), bE2, ((i14 >> 6) & 14) | 3120 | ((i14 >> 3) & 896));
                    bE2.X(false);
                } else {
                    bE2.C(-1228954578);
                    c22096n.invoke(DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(l13.longValue() - l12.longValue())), aVar3, bE2, Integer.valueOf((i14 >> 6) & 1008));
                    bE2.X(false);
                }
            }
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new e(l12, l13, aVar, aVar3, c22096n, i12);
        }
    }
}
