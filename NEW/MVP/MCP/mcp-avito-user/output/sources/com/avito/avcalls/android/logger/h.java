package com.avito.avcalls.android.logger;

import Y61.k;
import Y61.l;
import com.avito.avcalls.android.logger.AvCallsLoggingConfiguration;
import com.avito.avcalls.android.logger.a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import org.webrtc.Loggable;
import org.webrtc.Logging;
import zQ0.e;

/* compiled from: RtcLogListener.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/android/logger/h;", "Lorg/webrtc/Loggable;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class h implements Loggable {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f331755a;

    public h(@k f fVar) {
        AvCallsLoggingConfiguration.RtcSeverity rtcSeverity = AvCallsLoggingConfiguration.RtcSeverity.f331722b;
        this.f331755a = fVar;
    }

    @Override // org.webrtc.Loggable
    public final void onLogMessage(@l String str, @l Logging.Severity severity, @l String str2) {
        AvCallsLoggingConfiguration.RtcSeverity rtcSeverity;
        if (str == null) {
            return;
        }
        if (str2 == null) {
            str2 = "DEFAULT";
        }
        if (severity == null) {
            severity = Logging.Severity.LS_INFO;
        }
        int i12 = e.a.f444041a[severity.ordinal()];
        if (i12 == 1) {
            rtcSeverity = AvCallsLoggingConfiguration.RtcSeverity.f331725e;
        } else if (i12 == 2) {
            rtcSeverity = AvCallsLoggingConfiguration.RtcSeverity.f331723c;
        } else if (i12 == 3) {
            rtcSeverity = AvCallsLoggingConfiguration.RtcSeverity.f331726f;
        } else if (i12 == 4) {
            rtcSeverity = AvCallsLoggingConfiguration.RtcSeverity.f331722b;
        } else {
            if (i12 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            rtcSeverity = AvCallsLoggingConfiguration.RtcSeverity.f331724d;
        }
        this.f331755a.b(new a(str2, new a.AbstractC10309a.C10310a(rtcSeverity), str));
    }
}
