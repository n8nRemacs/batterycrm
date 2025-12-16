package com.avito.android.str_cancellation_settings.composables;

import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import kotlin.Metadata;

/* compiled from: StrCancellationSettingsErrorContent.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_str-cancellation-settings_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class t0 {
    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(int i12, @Y61.k Y41.a aVar, @Y61.l androidx.compose.runtime.A a12, @Y61.l androidx.compose.ui.v vVar) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(1170799507);
        if ((i12 & 14) == 0) {
            i13 = (bE2.u(aVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i13 & 91) == 18 && bE2.c()) {
            bE2.f();
        } else {
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.foundation.ui.n.a(vVar, null, 0.0f, com.akita.compose.theme.re23.b.f63984b.f63851H1, null, androidx.compose.runtime.internal.r.c(398611151, new q0(aVar), bE2), bE2, 1572870, 54);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new r0(i12, aVar, vVar);
        }
    }
}
