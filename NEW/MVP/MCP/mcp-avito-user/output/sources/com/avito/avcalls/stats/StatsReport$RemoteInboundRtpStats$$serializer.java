package com.avito.avcalls.stats;

import Y61.k;
import com.avito.avcalls.stats.StatsReport;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.w0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.C43412k0;
import kotlinx.serialization.internal.F;
import kotlinx.serialization.internal.G0;
import kotlinx.serialization.internal.N;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.j1;

/* compiled from: StatsReport.kt */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/avito/avcalls/stats/StatsReport.RemoteInboundRtpStats.$serializer", "Lkotlinx/serialization/internal/N;", "Lcom/avito/avcalls/stats/StatsReport$RemoteInboundRtpStats;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/avito/avcalls/stats/StatsReport$RemoteInboundRtpStats;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/avito/avcalls/stats/StatsReport$RemoteInboundRtpStats;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes5.dex */
public final class StatsReport$RemoteInboundRtpStats$$serializer implements N<StatsReport.RemoteInboundRtpStats> {

    @k
    public static final StatsReport$RemoteInboundRtpStats$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        StatsReport$RemoteInboundRtpStats$$serializer statsReport$RemoteInboundRtpStats$$serializer = new StatsReport$RemoteInboundRtpStats$$serializer();
        INSTANCE = statsReport$RemoteInboundRtpStats$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.avito.avcalls.stats.StatsReport.RemoteInboundRtpStats", statsReport$RemoteInboundRtpStats$$serializer, 6);
        pluginGeneratedSerialDescriptor.j("jitter", false);
        pluginGeneratedSerialDescriptor.j("packetsLost", false);
        pluginGeneratedSerialDescriptor.j("roundTripTime", false);
        pluginGeneratedSerialDescriptor.j("fractionLost", false);
        pluginGeneratedSerialDescriptor.j("totalRoundTripTime", false);
        pluginGeneratedSerialDescriptor.j("roundTripTimeMeasurements", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private StatsReport$RemoteInboundRtpStats$$serializer() {
    }

    @Override // kotlinx.serialization.internal.N
    @k
    public KSerializer<?>[] childSerializers() {
        F f12 = F.f412769a;
        return new KSerializer[]{L51.a.a(f12), L51.a.a(C43412k0.f412877a), L51.a.a(f12), L51.a.a(f12), L51.a.a(f12), L51.a.a(j1.f412874a)};
    }

    @Override // kotlinx.serialization.InterfaceC43386e
    @k
    public StatsReport.RemoteInboundRtpStats deserialize(@k Decoder decoder) {
        SerialDescriptor f412706c = getF332717a();
        kotlinx.serialization.encoding.c cVarC = decoder.c(f412706c);
        int i12 = 0;
        Double d12 = null;
        Long l12 = null;
        Double d13 = null;
        Double d14 = null;
        Double d15 = null;
        w0 w0Var = null;
        boolean z12 = true;
        while (z12) {
            int iJ2 = cVarC.j(f412706c);
            switch (iJ2) {
                case -1:
                    z12 = false;
                    break;
                case 0:
                    d12 = (Double) cVarC.f(f412706c, 0, F.f412769a, d12);
                    i12 |= 1;
                    break;
                case 1:
                    l12 = (Long) cVarC.f(f412706c, 1, C43412k0.f412877a, l12);
                    i12 |= 2;
                    break;
                case 2:
                    d13 = (Double) cVarC.f(f412706c, 2, F.f412769a, d13);
                    i12 |= 4;
                    break;
                case 3:
                    d14 = (Double) cVarC.f(f412706c, 3, F.f412769a, d14);
                    i12 |= 8;
                    break;
                case 4:
                    d15 = (Double) cVarC.f(f412706c, 4, F.f412769a, d15);
                    i12 |= 16;
                    break;
                case 5:
                    w0Var = (w0) cVarC.f(f412706c, 5, j1.f412874a, w0Var);
                    i12 |= 32;
                    break;
                default:
                    throw new UnknownFieldException(iJ2);
            }
        }
        cVarC.d(f412706c);
        return new StatsReport.RemoteInboundRtpStats(i12, d12, l12, d13, d14, d15, w0Var, null, null);
    }

    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
    @k
    /* renamed from: getDescriptor */
    public SerialDescriptor getF332717a() {
        return descriptor;
    }

    @Override // kotlinx.serialization.x
    public void serialize(@k Encoder encoder, @k StatsReport.RemoteInboundRtpStats value) {
        SerialDescriptor f412706c = getF332717a();
        kotlinx.serialization.encoding.d dVarC = encoder.c(f412706c);
        StatsReport.RemoteInboundRtpStats.Companion companion = StatsReport.RemoteInboundRtpStats.INSTANCE;
        F f12 = F.f412769a;
        dVarC.p(f412706c, 0, f12, value.f333600a);
        dVarC.p(f412706c, 1, C43412k0.f412877a, value.f333601b);
        dVarC.p(f412706c, 2, f12, value.f333602c);
        dVarC.p(f412706c, 3, f12, value.f333603d);
        dVarC.p(f412706c, 4, f12, value.f333604e);
        dVarC.p(f412706c, 5, j1.f412874a, value.f333605f);
        dVarC.d(f412706c);
    }

    @Override // kotlinx.serialization.internal.N
    @k
    public KSerializer<?>[] typeParametersSerializers() {
        return G0.f412773a;
    }
}
