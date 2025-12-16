package com.avito.android.iac_dialer.impl_module.audio.ringtone;

import androidx.appcompat.app.r;
import com.adjust.sdk.Constants;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42756l;

/* compiled from: IacRingingModeProvider.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_iac-dialer_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class h {
    public static final void a(String str, Q[] qArr, Object obj) {
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b bVar = com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a;
        StringBuilder sbZ = r.z(str, " (");
        sbZ.append(C42756l.P(qArr, ", ", null, null, g.f165871l, 30));
        sbZ.append(") = ");
        sbZ.append(obj);
        bVar.a("IacRingingModeProvider", sbZ.toString(), null);
    }

    public static final String b(int i12) {
        return i12 != 0 ? i12 != 1 ? i12 != 2 ? r.p("unknown (", i12, ')') : Constants.NORMAL : "vibrate" : "silent";
    }
}
