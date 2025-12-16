package com.avito.avcalls.stats;

import Y61.k;
import com.avito.avcalls.stats.StatsReport;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.F;
import kotlinx.serialization.internal.G0;
import kotlinx.serialization.internal.N;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* compiled from: StatsReport.kt */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/avito/avcalls/stats/StatsReport.$serializer", "Lkotlinx/serialization/internal/N;", "Lcom/avito/avcalls/stats/StatsReport;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/avito/avcalls/stats/StatsReport;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/avito/avcalls/stats/StatsReport;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes5.dex */
public final class StatsReport$$serializer implements N<StatsReport> {

    @k
    public static final StatsReport$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        StatsReport$$serializer statsReport$$serializer = new StatsReport$$serializer();
        INSTANCE = statsReport$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.avito.avcalls.stats.StatsReport", statsReport$$serializer, 7);
        pluginGeneratedSerialDescriptor.j("callDuration", false);
        pluginGeneratedSerialDescriptor.j("activeDuration", false);
        pluginGeneratedSerialDescriptor.j("transport", false);
        pluginGeneratedSerialDescriptor.j("outboundRtpAudio", false);
        pluginGeneratedSerialDescriptor.j("inboundRtpAudio", false);
        pluginGeneratedSerialDescriptor.j("outboundRtpVideo", false);
        pluginGeneratedSerialDescriptor.j("inboundRtpVideo", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private StatsReport$$serializer() {
    }

    @Override // kotlinx.serialization.internal.N
    @k
    public KSerializer<?>[] childSerializers() {
        F f12 = F.f412769a;
        return new KSerializer[]{L51.a.a(f12), L51.a.a(f12), L51.a.a(StatsReport$TransportStats$$serializer.INSTANCE), L51.a.a(StatsReport$OutboundRtpAudioStats$$serializer.INSTANCE), L51.a.a(StatsReport$InboundRtpAudioStats$$serializer.INSTANCE), L51.a.a(StatsReport$OutboundRtpVideoStats$$serializer.INSTANCE), L51.a.a(StatsReport$InboundRtpVideoStats$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.InterfaceC43386e
    @k
    public StatsReport deserialize(@k Decoder decoder) {
        SerialDescriptor f332717a = getF332717a();
        kotlinx.serialization.encoding.c cVarC = decoder.c(f332717a);
        int i12 = 0;
        Double d12 = null;
        Double d13 = null;
        StatsReport.TransportStats transportStats = null;
        StatsReport.OutboundRtpAudioStats outboundRtpAudioStats = null;
        StatsReport.InboundRtpAudioStats inboundRtpAudioStats = null;
        StatsReport.OutboundRtpVideoStats outboundRtpVideoStats = null;
        StatsReport.InboundRtpVideoStats inboundRtpVideoStats = null;
        boolean z12 = true;
        while (z12) {
            int iJ2 = cVarC.j(f332717a);
            switch (iJ2) {
                case -1:
                    z12 = false;
                    break;
                case 0:
                    d12 = (Double) cVarC.f(f332717a, 0, F.f412769a, d12);
                    i12 |= 1;
                    break;
                case 1:
                    d13 = (Double) cVarC.f(f332717a, 1, F.f412769a, d13);
                    i12 |= 2;
                    break;
                case 2:
                    transportStats = (StatsReport.TransportStats) cVarC.f(f332717a, 2, StatsReport$TransportStats$$serializer.INSTANCE, transportStats);
                    i12 |= 4;
                    break;
                case 3:
                    outboundRtpAudioStats = (StatsReport.OutboundRtpAudioStats) cVarC.f(f332717a, 3, StatsReport$OutboundRtpAudioStats$$serializer.INSTANCE, outboundRtpAudioStats);
                    i12 |= 8;
                    break;
                case 4:
                    inboundRtpAudioStats = (StatsReport.InboundRtpAudioStats) cVarC.f(f332717a, 4, StatsReport$InboundRtpAudioStats$$serializer.INSTANCE, inboundRtpAudioStats);
                    i12 |= 16;
                    break;
                case 5:
                    outboundRtpVideoStats = (StatsReport.OutboundRtpVideoStats) cVarC.f(f332717a, 5, StatsReport$OutboundRtpVideoStats$$serializer.INSTANCE, outboundRtpVideoStats);
                    i12 |= 32;
                    break;
                case 6:
                    inboundRtpVideoStats = (StatsReport.InboundRtpVideoStats) cVarC.f(f332717a, 6, StatsReport$InboundRtpVideoStats$$serializer.INSTANCE, inboundRtpVideoStats);
                    i12 |= 64;
                    break;
                default:
                    throw new UnknownFieldException(iJ2);
            }
        }
        cVarC.d(f332717a);
        return new StatsReport(i12, d12, d13, transportStats, outboundRtpAudioStats, inboundRtpAudioStats, outboundRtpVideoStats, inboundRtpVideoStats, null);
    }

    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
    @k
    /* renamed from: getDescriptor */
    public SerialDescriptor getF332717a() {
        return descriptor;
    }

    @Override // kotlinx.serialization.x
    public void serialize(@k Encoder encoder, @k StatsReport value) {
        SerialDescriptor f332717a = getF332717a();
        kotlinx.serialization.encoding.d dVarC = encoder.c(f332717a);
        StatsReport.Companion companion = StatsReport.INSTANCE;
        F f12 = F.f412769a;
        dVarC.p(f332717a, 0, f12, value.f333444a);
        dVarC.p(f332717a, 1, f12, value.f333445b);
        dVarC.p(f332717a, 2, StatsReport$TransportStats$$serializer.INSTANCE, value.f333446c);
        dVarC.p(f332717a, 3, StatsReport$OutboundRtpAudioStats$$serializer.INSTANCE, value.f333447d);
        dVarC.p(f332717a, 4, StatsReport$InboundRtpAudioStats$$serializer.INSTANCE, value.f333448e);
        dVarC.p(f332717a, 5, StatsReport$OutboundRtpVideoStats$$serializer.INSTANCE, value.f333449f);
        dVarC.p(f332717a, 6, StatsReport$InboundRtpVideoStats$$serializer.INSTANCE, value.f333450g);
        dVarC.d(f332717a);
    }

    @Override // kotlinx.serialization.internal.N
    @k
    public KSerializer<?>[] typeParametersSerializers() {
        return G0.f412773a;
    }
}
