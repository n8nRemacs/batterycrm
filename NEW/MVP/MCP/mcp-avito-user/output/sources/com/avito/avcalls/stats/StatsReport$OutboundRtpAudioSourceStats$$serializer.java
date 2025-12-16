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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/avito/avcalls/stats/StatsReport.OutboundRtpAudioSourceStats.$serializer", "Lkotlinx/serialization/internal/N;", "Lcom/avito/avcalls/stats/StatsReport$OutboundRtpAudioSourceStats;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/avito/avcalls/stats/StatsReport$OutboundRtpAudioSourceStats;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/avito/avcalls/stats/StatsReport$OutboundRtpAudioSourceStats;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes5.dex */
public final class StatsReport$OutboundRtpAudioSourceStats$$serializer implements N<StatsReport.OutboundRtpAudioSourceStats> {

    @k
    public static final StatsReport$OutboundRtpAudioSourceStats$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        StatsReport$OutboundRtpAudioSourceStats$$serializer statsReport$OutboundRtpAudioSourceStats$$serializer = new StatsReport$OutboundRtpAudioSourceStats$$serializer();
        INSTANCE = statsReport$OutboundRtpAudioSourceStats$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.avito.avcalls.stats.StatsReport.OutboundRtpAudioSourceStats", statsReport$OutboundRtpAudioSourceStats$$serializer, 5);
        pluginGeneratedSerialDescriptor.j("audioLevel", false);
        pluginGeneratedSerialDescriptor.j("totalAudioEnergy", false);
        pluginGeneratedSerialDescriptor.j("totalSamplesDuration", false);
        pluginGeneratedSerialDescriptor.j("echoReturnLoss", false);
        pluginGeneratedSerialDescriptor.j("echoReturnLossEnhancement", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private StatsReport$OutboundRtpAudioSourceStats$$serializer() {
    }

    @Override // kotlinx.serialization.internal.N
    @k
    public KSerializer<?>[] childSerializers() {
        F f12 = F.f412769a;
        return new KSerializer[]{L51.a.a(f12), L51.a.a(f12), L51.a.a(f12), L51.a.a(f12), L51.a.a(f12)};
    }

    @Override // kotlinx.serialization.InterfaceC43386e
    @k
    public StatsReport.OutboundRtpAudioSourceStats deserialize(@k Decoder decoder) {
        SerialDescriptor f412706c = getF412706c();
        kotlinx.serialization.encoding.c cVarC = decoder.c(f412706c);
        int i12 = 0;
        Double d12 = null;
        Double d13 = null;
        Double d14 = null;
        Double d15 = null;
        Double d16 = null;
        boolean z12 = true;
        while (z12) {
            int iJ2 = cVarC.j(f412706c);
            if (iJ2 == -1) {
                z12 = false;
            } else if (iJ2 == 0) {
                d12 = (Double) cVarC.f(f412706c, 0, F.f412769a, d12);
                i12 |= 1;
            } else if (iJ2 == 1) {
                d13 = (Double) cVarC.f(f412706c, 1, F.f412769a, d13);
                i12 |= 2;
            } else if (iJ2 == 2) {
                d14 = (Double) cVarC.f(f412706c, 2, F.f412769a, d14);
                i12 |= 4;
            } else if (iJ2 == 3) {
                d15 = (Double) cVarC.f(f412706c, 3, F.f412769a, d15);
                i12 |= 8;
            } else {
                if (iJ2 != 4) {
                    throw new UnknownFieldException(iJ2);
                }
                d16 = (Double) cVarC.f(f412706c, 4, F.f412769a, d16);
                i12 |= 16;
            }
        }
        cVarC.d(f412706c);
        return new StatsReport.OutboundRtpAudioSourceStats(i12, d12, d13, d14, d15, d16, null);
    }

    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
    @k
    /* renamed from: getDescriptor */
    public SerialDescriptor getF412706c() {
        return descriptor;
    }

    @Override // kotlinx.serialization.x
    public void serialize(@k Encoder encoder, @k StatsReport.OutboundRtpAudioSourceStats value) {
        SerialDescriptor f412706c = getF412706c();
        kotlinx.serialization.encoding.d dVarC = encoder.c(f412706c);
        StatsReport.OutboundRtpAudioSourceStats.Companion companion = StatsReport.OutboundRtpAudioSourceStats.INSTANCE;
        F f12 = F.f412769a;
        dVarC.p(f412706c, 0, f12, value.f333547a);
        dVarC.p(f412706c, 1, f12, value.f333548b);
        dVarC.p(f412706c, 2, f12, value.f333549c);
        dVarC.p(f412706c, 3, f12, value.f333550d);
        dVarC.p(f412706c, 4, f12, value.f333551e);
        dVarC.d(f412706c);
    }

    @Override // kotlinx.serialization.internal.N
    @k
    public KSerializer<?>[] typeParametersSerializers() {
        return G0.f412773a;
    }
}
