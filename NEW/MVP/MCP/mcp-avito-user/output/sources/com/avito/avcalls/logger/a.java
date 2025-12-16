package com.avito.avcalls.logger;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;

/* compiled from: AvCallsLoggingConfiguration.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/logger/a;", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f332944a;

    public a(boolean z12) {
        LogSeverity logSeverity = LogSeverity.f332936c;
        LogSeverity logSeverity2 = LogSeverity.f332936c;
        this.f332944a = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        aVar.getClass();
        LogSeverity logSeverity = LogSeverity.f332936c;
        LogSeverity logSeverity2 = LogSeverity.f332936c;
        return this.f332944a == aVar.f332944a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f332944a) + ((LogSeverity.f332937d.hashCode() + (LogSeverity.f332936c.hashCode() * 31)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AvCallsLoggingConfiguration(sdkSeverity=");
        sb2.append(LogSeverity.f332936c);
        sb2.append(", rtcSeverity=");
        sb2.append(LogSeverity.f332937d);
        sb2.append(", useAsyncLogSender=");
        return r.x(sb2, this.f332944a, ')');
    }
}
