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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/avito/avcalls/android/stats/StatsReport.OutboundRtpVideoSourceStats.$serializer", "Lkotlinx/serialization/internal/N;", "Lcom/avito/avcalls/android/stats/StatsReport$OutboundRtpVideoSourceStats;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/avito/avcalls/android/stats/StatsReport$OutboundRtpVideoSourceStats;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/avito/avcalls/android/stats/StatsReport$OutboundRtpVideoSourceStats;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes5.dex */
public final class StatsReport$OutboundRtpVideoSourceStats$$serializer implements N<StatsReport.OutboundRtpVideoSourceStats> {

    @k
    public static final StatsReport$OutboundRtpVideoSourceStats$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        StatsReport$OutboundRtpVideoSourceStats$$serializer statsReport$OutboundRtpVideoSourceStats$$serializer = new StatsReport$OutboundRtpVideoSourceStats$$serializer();
        INSTANCE = statsReport$OutboundRtpVideoSourceStats$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.avito.avcalls.android.stats.StatsReport.OutboundRtpVideoSourceStats", statsReport$OutboundRtpVideoSourceStats$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("width", false);
        pluginGeneratedSerialDescriptor.j("height", false);
        pluginGeneratedSerialDescriptor.j("framesPerSecond", false);
        pluginGeneratedSerialDescriptor.j("frames", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private StatsReport$OutboundRtpVideoSourceStats$$serializer() {
    }

    @Override // kotlinx.serialization.internal.N
    @k
    public KSerializer<?>[] childSerializers() {
        j1 j1Var = j1.f412874a;
        return new KSerializer[]{L51.a.a(j1Var), L51.a.a(j1Var), L51.a.a(F.f412769a), L51.a.a(j1Var)};
    }

    @Override // kotlinx.serialization.InterfaceC43386e
    @k
    public StatsReport.OutboundRtpVideoSourceStats deserialize(@k Decoder decoder) {
        SerialDescriptor f412706c = getF332717a();
        kotlinx.serialization.encoding.c cVarC = decoder.c(f412706c);
        int i12 = 0;
        w0 w0Var = null;
        w0 w0Var2 = null;
        Double d12 = null;
        w0 w0Var3 = null;
        boolean z12 = true;
        while (z12) {
            int iJ2 = cVarC.j(f412706c);
            if (iJ2 == -1) {
                z12 = false;
            } else if (iJ2 == 0) {
                w0Var = (w0) cVarC.f(f412706c, 0, j1.f412874a, w0Var);
                i12 |= 1;
            } else if (iJ2 == 1) {
                w0Var2 = (w0) cVarC.f(f412706c, 1, j1.f412874a, w0Var2);
                i12 |= 2;
            } else if (iJ2 == 2) {
                d12 = (Double) cVarC.f(f412706c, 2, F.f412769a, d12);
                i12 |= 4;
            } else {
                if (iJ2 != 3) {
                    throw new UnknownFieldException(iJ2);
                }
                w0Var3 = (w0) cVarC.f(f412706c, 3, j1.f412874a, w0Var3);
                i12 |= 8;
            }
        }
        cVarC.d(f412706c);
        return new StatsReport.OutboundRtpVideoSourceStats(i12, w0Var, w0Var2, d12, w0Var3, null, null);
    }

    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
    @k
    /* renamed from: getDescriptor */
    public SerialDescriptor getF332717a() {
        return descriptor;
    }

    @Override // kotlinx.serialization.x
    public void serialize(@k Encoder encoder, @k StatsReport.OutboundRtpVideoSourceStats value) {
        SerialDescriptor f412706c = getF332717a();
        kotlinx.serialization.encoding.d dVarC = encoder.c(f412706c);
        StatsReport.OutboundRtpVideoSourceStats.Companion companion = StatsReport.OutboundRtpVideoSourceStats.INSTANCE;
        j1 j1Var = j1.f412874a;
        dVarC.p(f412706c, 0, j1Var, value.f332337a);
        dVarC.p(f412706c, 1, j1Var, value.f332338b);
        dVarC.p(f412706c, 2, F.f412769a, value.f332339c);
        dVarC.p(f412706c, 3, j1Var, value.f332340d);
        dVarC.d(f412706c);
    }

    @Override // kotlinx.serialization.internal.N
    @k
    public KSerializer<?>[] typeParametersSerializers() {
        return G0.f412773a;
    }
}
