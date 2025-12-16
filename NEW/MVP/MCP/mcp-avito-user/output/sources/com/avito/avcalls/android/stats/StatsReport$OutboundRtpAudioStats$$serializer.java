package com.avito.avcalls.android.stats;

import Y61.k;
import com.avito.android.remote.model.SearchParamsConverterKt;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/avito/avcalls/android/stats/StatsReport.OutboundRtpAudioStats.$serializer", "Lkotlinx/serialization/internal/N;", "Lcom/avito/avcalls/android/stats/StatsReport$OutboundRtpAudioStats;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/avito/avcalls/android/stats/StatsReport$OutboundRtpAudioStats;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/avito/avcalls/android/stats/StatsReport$OutboundRtpAudioStats;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes5.dex */
public final class StatsReport$OutboundRtpAudioStats$$serializer implements N<StatsReport.OutboundRtpAudioStats> {

    @k
    public static final StatsReport$OutboundRtpAudioStats$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        StatsReport$OutboundRtpAudioStats$$serializer statsReport$OutboundRtpAudioStats$$serializer = new StatsReport$OutboundRtpAudioStats$$serializer();
        INSTANCE = statsReport$OutboundRtpAudioStats$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.avito.avcalls.android.stats.StatsReport.OutboundRtpAudioStats", statsReport$OutboundRtpAudioStats$$serializer, 13);
        pluginGeneratedSerialDescriptor.j("codec", false);
        pluginGeneratedSerialDescriptor.j(SearchParamsConverterKt.SOURCE, false);
        pluginGeneratedSerialDescriptor.j("ssrc", false);
        pluginGeneratedSerialDescriptor.j("packetsSent", false);
        pluginGeneratedSerialDescriptor.j("rtxSsrc", false);
        pluginGeneratedSerialDescriptor.j("retransmittedPacketsSent", false);
        pluginGeneratedSerialDescriptor.j("bytesSent", false);
        pluginGeneratedSerialDescriptor.j("headerBytesSent", false);
        pluginGeneratedSerialDescriptor.j("retransmittedBytesSent", false);
        pluginGeneratedSerialDescriptor.j("targetBitrate", false);
        pluginGeneratedSerialDescriptor.j("nackCount", false);
        pluginGeneratedSerialDescriptor.j("totalPacketSendDelay", false);
        pluginGeneratedSerialDescriptor.j("remote", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private StatsReport$OutboundRtpAudioStats$$serializer() {
    }

    @Override // kotlinx.serialization.internal.N
    @k
    public KSerializer<?>[] childSerializers() {
        KSerializer<?> kSerializerA = L51.a.a(StatsReport$Codec$$serializer.INSTANCE);
        KSerializer<?> kSerializerA2 = L51.a.a(StatsReport$OutboundRtpAudioSourceStats$$serializer.INSTANCE);
        j1 j1Var = j1.f412874a;
        KSerializer<?> kSerializerA3 = L51.a.a(j1Var);
        KSerializer<?> kSerializerA4 = L51.a.a(j1Var);
        KSerializer<?> kSerializerA5 = L51.a.a(j1Var);
        KSerializer<?> kSerializerA6 = L51.a.a(j1Var);
        KSerializer<?> kSerializerA7 = L51.a.a(j1Var);
        KSerializer<?> kSerializerA8 = L51.a.a(j1Var);
        KSerializer<?> kSerializerA9 = L51.a.a(j1Var);
        F f12 = F.f412769a;
        return new KSerializer[]{kSerializerA, kSerializerA2, kSerializerA3, kSerializerA4, kSerializerA5, kSerializerA6, kSerializerA7, kSerializerA8, kSerializerA9, L51.a.a(f12), L51.a.a(j1Var), L51.a.a(f12), L51.a.a(StatsReport$RemoteInboundRtpStats$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.InterfaceC43386e
    @k
    public StatsReport.OutboundRtpAudioStats deserialize(@k Decoder decoder) {
        StatsReport.OutboundRtpAudioSourceStats outboundRtpAudioSourceStats;
        StatsReport.RemoteInboundRtpStats remoteInboundRtpStats;
        SerialDescriptor f412706c = getF332717a();
        kotlinx.serialization.encoding.c cVarC = decoder.c(f412706c);
        Double d12 = null;
        StatsReport.RemoteInboundRtpStats remoteInboundRtpStats2 = null;
        Double d13 = null;
        w0 w0Var = null;
        StatsReport.Codec codec = null;
        StatsReport.OutboundRtpAudioSourceStats outboundRtpAudioSourceStats2 = null;
        w0 w0Var2 = null;
        w0 w0Var3 = null;
        w0 w0Var4 = null;
        w0 w0Var5 = null;
        w0 w0Var6 = null;
        w0 w0Var7 = null;
        w0 w0Var8 = null;
        int i12 = 0;
        boolean z12 = true;
        while (z12) {
            StatsReport.Codec codec2 = codec;
            int iJ2 = cVarC.j(f412706c);
            switch (iJ2) {
                case -1:
                    remoteInboundRtpStats = remoteInboundRtpStats2;
                    codec = codec2;
                    z12 = false;
                    d13 = d13;
                    outboundRtpAudioSourceStats2 = outboundRtpAudioSourceStats2;
                    remoteInboundRtpStats2 = remoteInboundRtpStats;
                case 0:
                    remoteInboundRtpStats = remoteInboundRtpStats2;
                    codec = (StatsReport.Codec) cVarC.f(f412706c, 0, StatsReport$Codec$$serializer.INSTANCE, codec2);
                    i12 |= 1;
                    outboundRtpAudioSourceStats2 = outboundRtpAudioSourceStats2;
                    d13 = d13;
                    remoteInboundRtpStats2 = remoteInboundRtpStats;
                case 1:
                    remoteInboundRtpStats = remoteInboundRtpStats2;
                    i12 |= 2;
                    outboundRtpAudioSourceStats2 = (StatsReport.OutboundRtpAudioSourceStats) cVarC.f(f412706c, 1, StatsReport$OutboundRtpAudioSourceStats$$serializer.INSTANCE, outboundRtpAudioSourceStats2);
                    codec = codec2;
                    remoteInboundRtpStats2 = remoteInboundRtpStats;
                case 2:
                    outboundRtpAudioSourceStats = outboundRtpAudioSourceStats2;
                    w0Var2 = (w0) cVarC.f(f412706c, 2, j1.f412874a, w0Var2);
                    i12 |= 4;
                    codec = codec2;
                    outboundRtpAudioSourceStats2 = outboundRtpAudioSourceStats;
                case 3:
                    outboundRtpAudioSourceStats = outboundRtpAudioSourceStats2;
                    w0Var3 = (w0) cVarC.f(f412706c, 3, j1.f412874a, w0Var3);
                    i12 |= 8;
                    codec = codec2;
                    outboundRtpAudioSourceStats2 = outboundRtpAudioSourceStats;
                case 4:
                    outboundRtpAudioSourceStats = outboundRtpAudioSourceStats2;
                    w0Var4 = (w0) cVarC.f(f412706c, 4, j1.f412874a, w0Var4);
                    i12 |= 16;
                    codec = codec2;
                    outboundRtpAudioSourceStats2 = outboundRtpAudioSourceStats;
                case 5:
                    outboundRtpAudioSourceStats = outboundRtpAudioSourceStats2;
                    w0Var5 = (w0) cVarC.f(f412706c, 5, j1.f412874a, w0Var5);
                    i12 |= 32;
                    codec = codec2;
                    outboundRtpAudioSourceStats2 = outboundRtpAudioSourceStats;
                case 6:
                    outboundRtpAudioSourceStats = outboundRtpAudioSourceStats2;
                    w0Var6 = (w0) cVarC.f(f412706c, 6, j1.f412874a, w0Var6);
                    i12 |= 64;
                    codec = codec2;
                    outboundRtpAudioSourceStats2 = outboundRtpAudioSourceStats;
                case 7:
                    outboundRtpAudioSourceStats = outboundRtpAudioSourceStats2;
                    w0Var7 = (w0) cVarC.f(f412706c, 7, j1.f412874a, w0Var7);
                    i12 |= 128;
                    codec = codec2;
                    outboundRtpAudioSourceStats2 = outboundRtpAudioSourceStats;
                case 8:
                    outboundRtpAudioSourceStats = outboundRtpAudioSourceStats2;
                    w0Var8 = (w0) cVarC.f(f412706c, 8, j1.f412874a, w0Var8);
                    i12 |= 256;
                    codec = codec2;
                    outboundRtpAudioSourceStats2 = outboundRtpAudioSourceStats;
                case 9:
                    outboundRtpAudioSourceStats = outboundRtpAudioSourceStats2;
                    d12 = (Double) cVarC.f(f412706c, 9, F.f412769a, d12);
                    i12 |= 512;
                    codec = codec2;
                    outboundRtpAudioSourceStats2 = outboundRtpAudioSourceStats;
                case 10:
                    outboundRtpAudioSourceStats = outboundRtpAudioSourceStats2;
                    w0Var = (w0) cVarC.f(f412706c, 10, j1.f412874a, w0Var);
                    i12 |= 1024;
                    codec = codec2;
                    outboundRtpAudioSourceStats2 = outboundRtpAudioSourceStats;
                case 11:
                    outboundRtpAudioSourceStats = outboundRtpAudioSourceStats2;
                    d13 = (Double) cVarC.f(f412706c, 11, F.f412769a, d13);
                    i12 |= 2048;
                    codec = codec2;
                    outboundRtpAudioSourceStats2 = outboundRtpAudioSourceStats;
                case 12:
                    outboundRtpAudioSourceStats = outboundRtpAudioSourceStats2;
                    remoteInboundRtpStats2 = (StatsReport.RemoteInboundRtpStats) cVarC.f(f412706c, 12, StatsReport$RemoteInboundRtpStats$$serializer.INSTANCE, remoteInboundRtpStats2);
                    i12 |= 4096;
                    codec = codec2;
                    outboundRtpAudioSourceStats2 = outboundRtpAudioSourceStats;
                default:
                    throw new UnknownFieldException(iJ2);
            }
        }
        Double d14 = d13;
        cVarC.d(f412706c);
        return new StatsReport.OutboundRtpAudioStats(i12, codec, outboundRtpAudioSourceStats2, w0Var2, w0Var3, w0Var4, w0Var5, w0Var6, w0Var7, w0Var8, d12, w0Var, d14, remoteInboundRtpStats2, null, null);
    }

    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
    @k
    /* renamed from: getDescriptor */
    public SerialDescriptor getF332717a() {
        return descriptor;
    }

    @Override // kotlinx.serialization.x
    public void serialize(@k Encoder encoder, @k StatsReport.OutboundRtpAudioStats value) {
        SerialDescriptor f412706c = getF332717a();
        kotlinx.serialization.encoding.d dVarC = encoder.c(f412706c);
        StatsReport.OutboundRtpAudioStats.Companion companion = StatsReport.OutboundRtpAudioStats.INSTANCE;
        dVarC.p(f412706c, 0, StatsReport$Codec$$serializer.INSTANCE, value.f332324a);
        dVarC.p(f412706c, 1, StatsReport$OutboundRtpAudioSourceStats$$serializer.INSTANCE, value.f332325b);
        j1 j1Var = j1.f412874a;
        dVarC.p(f412706c, 2, j1Var, value.f332326c);
        dVarC.p(f412706c, 3, j1Var, value.f332327d);
        dVarC.p(f412706c, 4, j1Var, value.f332328e);
        dVarC.p(f412706c, 5, j1Var, value.f332329f);
        dVarC.p(f412706c, 6, j1Var, value.f332330g);
        dVarC.p(f412706c, 7, j1Var, value.f332331h);
        dVarC.p(f412706c, 8, j1Var, value.f332332i);
        F f12 = F.f412769a;
        dVarC.p(f412706c, 9, f12, value.f332333j);
        dVarC.p(f412706c, 10, j1Var, value.f332334k);
        dVarC.p(f412706c, 11, f12, value.f332335l);
        dVarC.p(f412706c, 12, StatsReport$RemoteInboundRtpStats$$serializer.INSTANCE, value.f332336m);
        dVarC.d(f412706c);
    }

    @Override // kotlinx.serialization.internal.N
    @k
    public KSerializer<?>[] typeParametersSerializers() {
        return G0.f412773a;
    }
}
