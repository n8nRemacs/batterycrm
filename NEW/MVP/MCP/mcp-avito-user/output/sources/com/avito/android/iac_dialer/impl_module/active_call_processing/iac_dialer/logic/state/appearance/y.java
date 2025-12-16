package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.notifications_settings.NotificationsSettings;
import kotlin.Metadata;
import org.webrtc.MediaStreamTrack;

/* compiled from: CallInit.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/y;", "LJK/f;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/CallInit;", "<init>", "()V", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class y extends JK.f<CallInit> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final y f165543b = new y();

    @Override // JK.f
    public final void a(StringBuilder sb2, String str, CallInit callInit, CallInit callInit2) {
        CallInit callInit3 = callInit;
        CallInit callInit4 = callInit2;
        JK.f.b(sb2, str, callInit3, callInit4, "telecom", s.f165537l);
        JK.f.b(sb2, str, callInit3, callInit4, "isRealTelecomImpl", t.f165538l);
        JK.f.b(sb2, str, callInit3, callInit4, NotificationsSettings.Section.SECTION_PAID_SERVICES, u.f165539l);
        JK.f.b(sb2, str, callInit3, callInit4, "payloadSent", v.f165540l);
        JK.f.b(sb2, str, callInit3, callInit4, "avCalls", w.f165541l);
        JK.f.b(sb2, str, callInit3, callInit4, MediaStreamTrack.AUDIO_TRACK_KIND, x.f165542l);
    }

    public final boolean equals(@Y61.l Object obj) {
        return this == obj || (obj instanceof y);
    }

    public final int hashCode() {
        return 1639514121;
    }

    @Y61.k
    public final String toString() {
        return "CallInitDiffPrinter";
    }
}
