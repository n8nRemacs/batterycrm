package com.avito.avcalls.android.stats;

import Y61.k;
import com.avito.avcalls.android.stats.StatsReport;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.w0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.F;
import kotlinx.serialization.internal.G0;
import kotlinx.serialization.internal.N;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.j1;

/* compiled from: StatsReport.kt */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/avito/avcalls/android/stats/StatsReport.RemoteOutboundRtpStats.$serializer", "Lkotlinx/serialization/internal/N;", "Lcom/avito/avcalls/android/stats/StatsReport$RemoteOutboundRtpStats;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/avito/avcalls/android/stats/StatsReport$RemoteOutboundRtpStats;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/avito/avcalls/android/stats/StatsReport$RemoteOutboundRtpStats;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes5.dex */
public final class StatsReport$RemoteOutboundRtpStats$$serializer implements N<StatsReport.RemoteOutboundRtpStats> {

    @k
    public static final StatsReport$RemoteOutboundRtpStats$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        StatsReport$RemoteOutboundRtpStats$$serializer statsReport$RemoteOutboundRtpStats$$serializer = new StatsReport$RemoteOutboundRtpStats$$serializer();
        INSTANCE = statsReport$RemoteOutboundRtpStats$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.avito.avcalls.android.stats.StatsReport.RemoteOutboundRtpStats", statsReport$RemoteOutboundRtpStats$$serializer, 6);
        pluginGeneratedSerialDescriptor.j("packetsSent", false);
        pluginGeneratedSerialDescriptor.j("bytesSent", false);
        pluginGeneratedSerialDescriptor.j("reportsSent", false);
        pluginGeneratedSerialDescriptor.j("roundTripTime", false);
        pluginGeneratedSerialDescriptor.j("roundTripTimeMeasurements", false);
        pluginGeneratedSerialDescriptor.j("totalRoundTripTime", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private StatsReport$RemoteOutboundRtpStats$$serializer() {
    }

    @Override // kotlinx.serialization.internal.N
    @k
    public KSerializer<?>[] childSerializers() {
        j1 j1Var = j1.f412874a;
        KSerializer<?> kSerializerA = L51.a.a(j1Var);
        KSerializer<?> kSerializerA2 = L51.a.a(j1Var);
        KSerializer<?> kSerializerA3 = L51.a.a(j1Var);
        F f12 = F.f412769a;
        return new KSerializer[]{kSerializerA, kSerializerA2, kSerializerA3, L51.a.a(f12), L51.a.a(j1Var), L51.a.a(f12)};
    }

    @Override // kotlinx.serialization.InterfaceC43386e
    @k
    public StatsReport.RemoteOutboundRtpStats deserialize(@k Decoder decoder) {
        SerialDescriptor f412706c = getF332717a();
        kotlinx.serialization.encoding.c cVarC = decoder.c(f412706c);
        int i12 = 0;
        w0 w0Var = null;
        w0 w0Var2 = null;
        w0 w0Var3 = null;
        Double d12 = null;
        w0 w0Var4 = null;
        Double d13 = null;
        boolean z12 = true;
        while (z12) {
            int iJ2 = cVarC.j(f412706c);
            switch (iJ2) {
                case -1:
                    z12 = false;
                    break;
                case 0:
                    w0Var = (w0) cVarC.f(f412706c, 0, j1.f412874a, w0Var);
                    i12 |= 1;
                    break;
                case 1:
                    w0Var2 = (w0) cVarC.f(f412706c, 1, j1.f412874a, w0Var2);
                    i12 |= 2;
                    break;
                case 2:
                    w0Var3 = (w0) cVarC.f(f412706c, 2, j1.f412874a, w0Var3);
                    i12 |= 4;
                    break;
                case 3:
                    d12 = (Double) cVarC.f(f412706c, 3, F.f412769a, d12);
                    i12 |= 8;
                    break;
                case 4:
                    w0Var4 = (w0) cVarC.f(f412706c, 4, j1.f412874a, w0Var4);
                    i12 |= 16;
                    break;
                case 5:
                    d13 = (Double) cVarC.f(f412706c, 5, F.f412769a, d13);
                    i12 |= 32;
                    break;
                default:
                    throw new UnknownFieldException(iJ2);
            }
        }
        cVarC.d(f412706c);
        return new StatsReport.RemoteOutboundRtpStats(i12, w0Var, w0Var2, w0Var3, d12, w0Var4, d13, null, null);
    }

    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
    @k
    /* renamed from: getDescriptor */
    public SerialDescriptor getF332717a() {
        return descriptor;
    }

    @Override // kotlinx.serialization.x
    public void serialize(@k Encoder encoder, @k StatsReport.RemoteOutboundRtpStats value) {
        SerialDescriptor f412706c = getF332717a();
        kotlinx.serialization.encoding.d dVarC = encoder.c(f412706c);
        StatsReport.RemoteOutboundRtpStats.Companion companion = StatsReport.RemoteOutboundRtpStats.INSTANCE;
        j1 j1Var = j1.f412874a;
        dVarC.p(f412706c, 0, j1Var, value.f332378a);
        dVarC.p(f412706c, 1, j1Var, value.f332379b);
        dVarC.p(f412706c, 2, j1Var, value.f332380c);
        F f12 = F.f412769a;
        dVarC.p(f412706c, 3, f12, value.f332381d);
        dVarC.p(f412706c, 4, j1Var, value.f332382e);
        dVarC.p(f412706c, 5, f12, value.f332383f);
        dVarC.d(f412706c);
    }

    @Override // kotlinx.serialization.internal.N
    @k
    public KSerializer<?>[] typeParametersSerializers() {
        return G0.f412773a;
    }
}
