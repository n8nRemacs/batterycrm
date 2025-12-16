package com.avito.avcalls.android.rtc;

import androidx.compose.runtime.C22026a;
import com.avito.avcalls.android.logger.g;
import kotlin.Metadata;
import org.webrtc.RtpSender;

/* compiled from: RtpSender.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/android/rtc/A;", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final RtpSender f331868a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f331869b;

    public A(@Y61.k RtpSender rtpSender, @Y61.k String str) {
        this.f331868a = rtpSender;
        this.f331869b = str;
    }

    public final void a(@Y61.l f fVar) {
        g.Companion companion = com.avito.avcalls.android.logger.g.INSTANCE;
        companion.getClass();
        g.Companion.c(C22026a.c(new StringBuilder("RtpSender("), this.f331869b, ')'), "setTrack(" + fVar + ')');
        this.f331868a.setTrack(fVar != null ? fVar.a() : null, false);
    }
}
