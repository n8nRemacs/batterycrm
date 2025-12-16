package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.params;

import androidx.compose.runtime.internal.P;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import kotlin.Metadata;

/* compiled from: CallParams.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/params/i;", "LJK/f;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/params/CallParams;", "<init>", "()V", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class i extends JK.f<CallParams> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final i f165613b = new i();

    @Override // JK.f
    public final void a(StringBuilder sb2, String str, CallParams callParams, CallParams callParams2) {
        CallParams callParams3 = callParams;
        CallParams callParams4 = callParams2;
        JK.f.c(sb2, str, p.f165620b, callParams3, callParams4, CrashHianalyticsData.TIME, a.f165605l);
        JK.f.b(sb2, str, callParams3, callParams4, "wasScreenStarted", b.f165606l);
        JK.f.b(sb2, str, callParams3, callParams4, "hideControlsInVideo", c.f165607l);
        JK.f.b(sb2, str, callParams3, callParams4, "hideVpnToast", d.f165608l);
        JK.f.b(sb2, str, callParams3, callParams4, "dtmfOpened", e.f165609l);
        JK.f.b(sb2, str, callParams3, callParams4, "customParams", f.f165610l);
        JK.f.b(sb2, str, callParams3, callParams4, "analyticsExtraParams", g.f165611l);
        JK.f.b(sb2, str, callParams3, callParams4, "muteRingtone", h.f165612l);
    }

    public final boolean equals(@Y61.l Object obj) {
        return this == obj || (obj instanceof i);
    }

    public final int hashCode() {
        return 1029642869;
    }

    @Y61.k
    public final String toString() {
        return "CallParamsDiffPrinter";
    }
}
