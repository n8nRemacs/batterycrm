package com.avito.avcalls.android.rtc;

import com.avito.avcalls.android.logger.AvCallsLoggingConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import org.webrtc.DefaultVideoDecoderFactory;
import org.webrtc.DefaultVideoEncoderFactory;
import org.webrtc.EglBase;
import org.webrtc.Logging;
import org.webrtc.PeerConnectionFactory;

/* compiled from: PeerConnectionFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/avcalls/android/rtc/w;", "", "Companion", "a", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class w {

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final wQ0.e f331979a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final PeerConnectionFactory f331980b;

    /* compiled from: PeerConnectionFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/avcalls/android/rtc/w$a;", "", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.avcalls.android.rtc.w$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        public static void a(@Y61.l y yVar, @Y61.l com.avito.avcalls.android.logger.h hVar) {
            Logging.Severity severity;
            PeerConnectionFactory.InitializationOptions.Builder builder = PeerConnectionFactory.InitializationOptions.builder(yVar.f331983a);
            if (hVar != null) {
                AvCallsLoggingConfiguration.RtcSeverity rtcSeverity = AvCallsLoggingConfiguration.RtcSeverity.f331722b;
                severity = Logging.Severity.LS_INFO;
            } else {
                severity = null;
            }
            PeerConnectionFactory.initialize(builder.setInjectableLogger(hVar, severity).createInitializationOptions());
        }

        public Companion() {
        }
    }

    public w(boolean z12, @Y61.k wQ0.e eVar) {
        this.f331979a = eVar;
        PeerConnectionFactory.Builder builder = PeerConnectionFactory.builder();
        builder.setOptions(new PeerConnectionFactory.Options());
        if (z12) {
            EglBase eglBaseA = com.avito.avcalls.android.video.g.f332484a.a();
            builder.setVideoEncoderFactory(new DefaultVideoEncoderFactory(eglBaseA.getEglBaseContext(), true, false));
            builder.setVideoDecoderFactory(new DefaultVideoDecoderFactory(eglBaseA.getEglBaseContext()));
        }
        this.f331980b = builder.createPeerConnectionFactory();
    }
}
