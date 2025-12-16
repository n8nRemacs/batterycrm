package com.avito.avcalls.android.stats;

import Y61.k;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.avcalls.android.stats.StatsReport;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.G0;
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
import kotlinx.serialization.internal.N;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.j1;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import shark.AndroidResourceIdNames;

/* compiled from: StatsReport.kt */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/avito/avcalls/android/stats/StatsReport.InboundRtpAudioStats.$serializer", "Lkotlinx/serialization/internal/N;", "Lcom/avito/avcalls/android/stats/StatsReport$InboundRtpAudioStats;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/avito/avcalls/android/stats/StatsReport$InboundRtpAudioStats;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/avito/avcalls/android/stats/StatsReport$InboundRtpAudioStats;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes5.dex */
public final class StatsReport$InboundRtpAudioStats$$serializer implements N<StatsReport.InboundRtpAudioStats> {

    @k
    public static final StatsReport$InboundRtpAudioStats$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        StatsReport$InboundRtpAudioStats$$serializer statsReport$InboundRtpAudioStats$$serializer = new StatsReport$InboundRtpAudioStats$$serializer();
        INSTANCE = statsReport$InboundRtpAudioStats$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.avito.avcalls.android.stats.StatsReport.InboundRtpAudioStats", statsReport$InboundRtpAudioStats$$serializer, 36);
        pluginGeneratedSerialDescriptor.j("codec", false);
        pluginGeneratedSerialDescriptor.j("ssrc", false);
        pluginGeneratedSerialDescriptor.j("packetsReceived", false);
        pluginGeneratedSerialDescriptor.j("packetsLost", false);
        pluginGeneratedSerialDescriptor.j("packetsDiscarded", false);
        pluginGeneratedSerialDescriptor.j("bytesReceived", false);
        pluginGeneratedSerialDescriptor.j("headerBytesReceived", false);
        pluginGeneratedSerialDescriptor.j("fecPacketsReceived", false);
        pluginGeneratedSerialDescriptor.j("fecPacketsDiscarded", false);
        pluginGeneratedSerialDescriptor.j("fecBytesReceived", false);
        pluginGeneratedSerialDescriptor.j("fecSsrc", false);
        pluginGeneratedSerialDescriptor.j("retransmittedPacketsReceived", false);
        pluginGeneratedSerialDescriptor.j("retransmittedBytesReceived", false);
        pluginGeneratedSerialDescriptor.j("rtxSsrc", false);
        pluginGeneratedSerialDescriptor.j("totalSamplesDuration", false);
        pluginGeneratedSerialDescriptor.j("totalSamplesReceived", false);
        pluginGeneratedSerialDescriptor.j("concealedSamples", false);
        pluginGeneratedSerialDescriptor.j("silentConcealedSamples", false);
        pluginGeneratedSerialDescriptor.j("removedSamplesForAcceleration", false);
        pluginGeneratedSerialDescriptor.j("insertedSamplesForDeceleration", false);
        pluginGeneratedSerialDescriptor.j("delayedPacketOutageSamples", false);
        pluginGeneratedSerialDescriptor.j("jitterBufferEmittedCount", false);
        pluginGeneratedSerialDescriptor.j("concealmentEvents", false);
        pluginGeneratedSerialDescriptor.j("totalAudioEnergy", false);
        pluginGeneratedSerialDescriptor.j("audioLevel", false);
        pluginGeneratedSerialDescriptor.j("jitter", false);
        pluginGeneratedSerialDescriptor.j("jitterBufferDelay", false);
        pluginGeneratedSerialDescriptor.j("jitterBufferTargetDelay", false);
        pluginGeneratedSerialDescriptor.j("jitterBufferMinimumDelay", false);
        pluginGeneratedSerialDescriptor.j("jitterBufferFlushes", false);
        pluginGeneratedSerialDescriptor.j("relativePacketArrivalDelay", false);
        pluginGeneratedSerialDescriptor.j("interruptionCount", false);
        pluginGeneratedSerialDescriptor.j("totalInterruptionDuration", false);
        pluginGeneratedSerialDescriptor.j("totalProcessingDelay", false);
        pluginGeneratedSerialDescriptor.j("nackCount", false);
        pluginGeneratedSerialDescriptor.j("remote", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private StatsReport$InboundRtpAudioStats$$serializer() {
    }

    @Override // kotlinx.serialization.internal.N
    @k
    public KSerializer<?>[] childSerializers() {
        KSerializer<?> kSerializerA = L51.a.a(StatsReport$Codec$$serializer.INSTANCE);
        j1 j1Var = j1.f412874a;
        KSerializer<?> kSerializerA2 = L51.a.a(j1Var);
        KSerializer<?> kSerializerA3 = L51.a.a(j1Var);
        KSerializer<?> kSerializerA4 = L51.a.a(C43412k0.f412877a);
        KSerializer<?> kSerializerA5 = L51.a.a(j1Var);
        KSerializer<?> kSerializerA6 = L51.a.a(j1Var);
        KSerializer<?> kSerializerA7 = L51.a.a(j1Var);
        KSerializer<?> kSerializerA8 = L51.a.a(j1Var);
        KSerializer<?> kSerializerA9 = L51.a.a(j1Var);
        KSerializer<?> kSerializerA10 = L51.a.a(j1Var);
        KSerializer<?> kSerializerA11 = L51.a.a(j1Var);
        KSerializer<?> kSerializerA12 = L51.a.a(j1Var);
        KSerializer<?> kSerializerA13 = L51.a.a(j1Var);
        KSerializer<?> kSerializerA14 = L51.a.a(j1Var);
        F f12 = F.f412769a;
        return new KSerializer[]{kSerializerA, kSerializerA2, kSerializerA3, kSerializerA4, kSerializerA5, kSerializerA6, kSerializerA7, kSerializerA8, kSerializerA9, kSerializerA10, kSerializerA11, kSerializerA12, kSerializerA13, kSerializerA14, L51.a.a(f12), L51.a.a(j1Var), L51.a.a(j1Var), L51.a.a(j1Var), L51.a.a(j1Var), L51.a.a(j1Var), L51.a.a(j1Var), L51.a.a(j1Var), L51.a.a(j1Var), L51.a.a(f12), L51.a.a(f12), L51.a.a(f12), L51.a.a(f12), L51.a.a(f12), L51.a.a(f12), L51.a.a(j1Var), L51.a.a(f12), L51.a.a(j1Var), L51.a.a(f12), L51.a.a(f12), L51.a.a(j1Var), L51.a.a(StatsReport$RemoteOutboundRtpStats$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.InterfaceC43386e
    @k
    public StatsReport.InboundRtpAudioStats deserialize(@k Decoder decoder) {
        StatsReport.Codec codec;
        w0 w0Var;
        Double d12;
        w0 w0Var2;
        StatsReport.RemoteOutboundRtpStats remoteOutboundRtpStats;
        Double d13;
        int i12;
        SerialDescriptor f412706c = getF332717a();
        kotlinx.serialization.encoding.c cVarC = decoder.c(f412706c);
        Long l12 = null;
        w0 w0Var3 = null;
        Double d14 = null;
        w0 w0Var4 = null;
        StatsReport.RemoteOutboundRtpStats remoteOutboundRtpStats2 = null;
        Double d15 = null;
        w0 w0Var5 = null;
        w0 w0Var6 = null;
        StatsReport.Codec codec2 = null;
        w0 w0Var7 = null;
        w0 w0Var8 = null;
        w0 w0Var9 = null;
        w0 w0Var10 = null;
        w0 w0Var11 = null;
        w0 w0Var12 = null;
        w0 w0Var13 = null;
        w0 w0Var14 = null;
        w0 w0Var15 = null;
        w0 w0Var16 = null;
        Double d16 = null;
        w0 w0Var17 = null;
        w0 w0Var18 = null;
        w0 w0Var19 = null;
        w0 w0Var20 = null;
        w0 w0Var21 = null;
        w0 w0Var22 = null;
        w0 w0Var23 = null;
        Double d17 = null;
        Double d18 = null;
        Double d19 = null;
        Double d22 = null;
        Double d23 = null;
        Double d24 = null;
        w0 w0Var24 = null;
        Double d25 = null;
        w0 w0Var25 = null;
        int i13 = 0;
        int i14 = 0;
        boolean z12 = true;
        while (z12) {
            int iJ2 = cVarC.j(f412706c);
            switch (iJ2) {
                case -1:
                    Double d26 = d14;
                    G0 g02 = G0.f406611a;
                    z12 = false;
                    w0Var3 = w0Var3;
                    d15 = d15;
                    d14 = d26;
                    w0Var4 = w0Var4;
                    codec = codec2;
                    remoteOutboundRtpStats2 = remoteOutboundRtpStats2;
                    codec2 = codec;
                case 0:
                    Double d27 = d14;
                    StatsReport.RemoteOutboundRtpStats remoteOutboundRtpStats3 = remoteOutboundRtpStats2;
                    StatsReport.Codec codec3 = (StatsReport.Codec) cVarC.f(f412706c, 0, StatsReport$Codec$$serializer.INSTANCE, codec2);
                    i13 |= 1;
                    G0 g03 = G0.f406611a;
                    w0Var13 = w0Var13;
                    w0Var3 = w0Var3;
                    d15 = d15;
                    w0Var4 = w0Var4;
                    remoteOutboundRtpStats2 = remoteOutboundRtpStats3;
                    codec = codec3;
                    d14 = d27;
                    codec2 = codec;
                case 1:
                    Double d28 = d14;
                    codec = codec2;
                    w0 w0Var26 = (w0) cVarC.f(f412706c, 1, j1.f412874a, w0Var7);
                    i13 |= 2;
                    G0 g04 = G0.f406611a;
                    w0Var7 = w0Var26;
                    w0Var3 = w0Var3;
                    d15 = d15;
                    d14 = d28;
                    w0Var4 = w0Var4;
                    remoteOutboundRtpStats2 = remoteOutboundRtpStats2;
                    codec2 = codec;
                case 2:
                    Double d29 = d14;
                    codec = codec2;
                    w0 w0Var27 = (w0) cVarC.f(f412706c, 2, j1.f412874a, w0Var8);
                    i13 |= 4;
                    G0 g05 = G0.f406611a;
                    w0Var8 = w0Var27;
                    w0Var3 = w0Var3;
                    d15 = d15;
                    d14 = d29;
                    w0Var4 = w0Var4;
                    remoteOutboundRtpStats2 = remoteOutboundRtpStats2;
                    codec2 = codec;
                case 3:
                    w0Var = w0Var3;
                    d12 = d14;
                    w0Var2 = w0Var4;
                    remoteOutboundRtpStats = remoteOutboundRtpStats2;
                    d13 = d15;
                    codec = codec2;
                    Long l13 = (Long) cVarC.f(f412706c, 3, C43412k0.f412877a, l12);
                    i13 |= 8;
                    G0 g06 = G0.f406611a;
                    l12 = l13;
                    w0Var3 = w0Var;
                    d15 = d13;
                    d14 = d12;
                    w0Var4 = w0Var2;
                    remoteOutboundRtpStats2 = remoteOutboundRtpStats;
                    codec2 = codec;
                case 4:
                    w0Var = w0Var3;
                    d12 = d14;
                    w0Var2 = w0Var4;
                    remoteOutboundRtpStats = remoteOutboundRtpStats2;
                    d13 = d15;
                    codec = codec2;
                    w0 w0Var28 = (w0) cVarC.f(f412706c, 4, j1.f412874a, w0Var6);
                    i13 |= 16;
                    G0 g07 = G0.f406611a;
                    w0Var6 = w0Var28;
                    w0Var3 = w0Var;
                    d15 = d13;
                    d14 = d12;
                    w0Var4 = w0Var2;
                    remoteOutboundRtpStats2 = remoteOutboundRtpStats;
                    codec2 = codec;
                case 5:
                    w0Var = w0Var3;
                    d12 = d14;
                    w0Var2 = w0Var4;
                    remoteOutboundRtpStats = remoteOutboundRtpStats2;
                    d13 = d15;
                    codec = codec2;
                    w0 w0Var29 = (w0) cVarC.f(f412706c, 5, j1.f412874a, w0Var5);
                    i13 |= 32;
                    G0 g08 = G0.f406611a;
                    w0Var5 = w0Var29;
                    w0Var3 = w0Var;
                    d15 = d13;
                    d14 = d12;
                    w0Var4 = w0Var2;
                    remoteOutboundRtpStats2 = remoteOutboundRtpStats;
                    codec2 = codec;
                case 6:
                    w0Var = w0Var3;
                    d12 = d14;
                    w0Var2 = w0Var4;
                    remoteOutboundRtpStats = remoteOutboundRtpStats2;
                    d13 = d15;
                    codec = codec2;
                    w0 w0Var30 = (w0) cVarC.f(f412706c, 6, j1.f412874a, w0Var9);
                    i13 |= 64;
                    G0 g09 = G0.f406611a;
                    w0Var9 = w0Var30;
                    w0Var14 = w0Var14;
                    w0Var3 = w0Var;
                    d15 = d13;
                    d14 = d12;
                    w0Var4 = w0Var2;
                    remoteOutboundRtpStats2 = remoteOutboundRtpStats;
                    codec2 = codec;
                case 7:
                    w0Var = w0Var3;
                    d12 = d14;
                    w0Var2 = w0Var4;
                    remoteOutboundRtpStats = remoteOutboundRtpStats2;
                    d13 = d15;
                    codec = codec2;
                    w0 w0Var31 = (w0) cVarC.f(f412706c, 7, j1.f412874a, w0Var10);
                    i13 |= 128;
                    G0 g010 = G0.f406611a;
                    w0Var10 = w0Var31;
                    w0Var15 = w0Var15;
                    w0Var3 = w0Var;
                    d15 = d13;
                    d14 = d12;
                    w0Var4 = w0Var2;
                    remoteOutboundRtpStats2 = remoteOutboundRtpStats;
                    codec2 = codec;
                case 8:
                    w0Var = w0Var3;
                    d12 = d14;
                    w0Var2 = w0Var4;
                    remoteOutboundRtpStats = remoteOutboundRtpStats2;
                    d13 = d15;
                    codec = codec2;
                    w0 w0Var32 = (w0) cVarC.f(f412706c, 8, j1.f412874a, w0Var11);
                    i13 |= 256;
                    G0 g011 = G0.f406611a;
                    w0Var11 = w0Var32;
                    w0Var18 = w0Var18;
                    w0Var3 = w0Var;
                    d15 = d13;
                    d14 = d12;
                    w0Var4 = w0Var2;
                    remoteOutboundRtpStats2 = remoteOutboundRtpStats;
                    codec2 = codec;
                case 9:
                    w0Var = w0Var3;
                    d12 = d14;
                    w0Var2 = w0Var4;
                    remoteOutboundRtpStats = remoteOutboundRtpStats2;
                    d13 = d15;
                    codec = codec2;
                    w0 w0Var33 = (w0) cVarC.f(f412706c, 9, j1.f412874a, w0Var12);
                    i13 |= 512;
                    G0 g012 = G0.f406611a;
                    w0Var12 = w0Var33;
                    w0Var16 = w0Var16;
                    w0Var3 = w0Var;
                    d15 = d13;
                    d14 = d12;
                    w0Var4 = w0Var2;
                    remoteOutboundRtpStats2 = remoteOutboundRtpStats;
                    codec2 = codec;
                case 10:
                    w0Var = w0Var3;
                    d12 = d14;
                    w0Var2 = w0Var4;
                    remoteOutboundRtpStats = remoteOutboundRtpStats2;
                    d13 = d15;
                    codec = codec2;
                    w0 w0Var34 = (w0) cVarC.f(f412706c, 10, j1.f412874a, w0Var13);
                    i13 |= 1024;
                    G0 g013 = G0.f406611a;
                    w0Var13 = w0Var34;
                    d16 = d16;
                    w0Var3 = w0Var;
                    d15 = d13;
                    d14 = d12;
                    w0Var4 = w0Var2;
                    remoteOutboundRtpStats2 = remoteOutboundRtpStats;
                    codec2 = codec;
                case 11:
                    w0Var = w0Var3;
                    d12 = d14;
                    w0Var2 = w0Var4;
                    remoteOutboundRtpStats = remoteOutboundRtpStats2;
                    d13 = d15;
                    codec = codec2;
                    w0 w0Var35 = (w0) cVarC.f(f412706c, 11, j1.f412874a, w0Var14);
                    i13 |= 2048;
                    G0 g014 = G0.f406611a;
                    w0Var14 = w0Var35;
                    w0Var17 = w0Var17;
                    w0Var3 = w0Var;
                    d15 = d13;
                    d14 = d12;
                    w0Var4 = w0Var2;
                    remoteOutboundRtpStats2 = remoteOutboundRtpStats;
                    codec2 = codec;
                case 12:
                    d12 = d14;
                    w0Var2 = w0Var4;
                    remoteOutboundRtpStats = remoteOutboundRtpStats2;
                    d13 = d15;
                    codec = codec2;
                    w0Var = w0Var3;
                    w0 w0Var36 = (w0) cVarC.f(f412706c, 12, j1.f412874a, w0Var15);
                    i13 |= 4096;
                    G0 g015 = G0.f406611a;
                    w0Var15 = w0Var36;
                    w0Var3 = w0Var;
                    d15 = d13;
                    d14 = d12;
                    w0Var4 = w0Var2;
                    remoteOutboundRtpStats2 = remoteOutboundRtpStats;
                    codec2 = codec;
                case 13:
                    d12 = d14;
                    w0Var2 = w0Var4;
                    remoteOutboundRtpStats = remoteOutboundRtpStats2;
                    d13 = d15;
                    codec = codec2;
                    w0 w0Var37 = (w0) cVarC.f(f412706c, 13, j1.f412874a, w0Var16);
                    i13 |= 8192;
                    G0 g016 = G0.f406611a;
                    w0Var16 = w0Var37;
                    w0Var19 = w0Var19;
                    d15 = d13;
                    d14 = d12;
                    w0Var4 = w0Var2;
                    remoteOutboundRtpStats2 = remoteOutboundRtpStats;
                    codec2 = codec;
                case 14:
                    d12 = d14;
                    w0Var2 = w0Var4;
                    remoteOutboundRtpStats = remoteOutboundRtpStats2;
                    d13 = d15;
                    codec = codec2;
                    Double d32 = (Double) cVarC.f(f412706c, 14, F.f412769a, d16);
                    i13 |= Http2.INITIAL_MAX_FRAME_SIZE;
                    G0 g017 = G0.f406611a;
                    d16 = d32;
                    w0Var20 = w0Var20;
                    d15 = d13;
                    d14 = d12;
                    w0Var4 = w0Var2;
                    remoteOutboundRtpStats2 = remoteOutboundRtpStats;
                    codec2 = codec;
                case 15:
                    d12 = d14;
                    w0Var2 = w0Var4;
                    remoteOutboundRtpStats = remoteOutboundRtpStats2;
                    d13 = d15;
                    codec = codec2;
                    w0 w0Var38 = (w0) cVarC.f(f412706c, 15, j1.f412874a, w0Var17);
                    i13 |= 32768;
                    G0 g018 = G0.f406611a;
                    w0Var17 = w0Var38;
                    w0Var21 = w0Var21;
                    d15 = d13;
                    d14 = d12;
                    w0Var4 = w0Var2;
                    remoteOutboundRtpStats2 = remoteOutboundRtpStats;
                    codec2 = codec;
                case 16:
                    d12 = d14;
                    w0Var2 = w0Var4;
                    remoteOutboundRtpStats = remoteOutboundRtpStats2;
                    d13 = d15;
                    codec = codec2;
                    w0 w0Var39 = (w0) cVarC.f(f412706c, 16, j1.f412874a, w0Var18);
                    i13 |= AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
                    G0 g019 = G0.f406611a;
                    w0Var18 = w0Var39;
                    w0Var22 = w0Var22;
                    d15 = d13;
                    d14 = d12;
                    w0Var4 = w0Var2;
                    remoteOutboundRtpStats2 = remoteOutboundRtpStats;
                    codec2 = codec;
                case 17:
                    d12 = d14;
                    w0Var2 = w0Var4;
                    remoteOutboundRtpStats = remoteOutboundRtpStats2;
                    d13 = d15;
                    codec = codec2;
                    w0Var3 = (w0) cVarC.f(f412706c, 17, j1.f412874a, w0Var3);
                    i13 |= 131072;
                    G0 g020 = G0.f406611a;
                    d15 = d13;
                    d14 = d12;
                    w0Var4 = w0Var2;
                    remoteOutboundRtpStats2 = remoteOutboundRtpStats;
                    codec2 = codec;
                case 18:
                    d12 = d14;
                    w0Var2 = w0Var4;
                    remoteOutboundRtpStats = remoteOutboundRtpStats2;
                    d13 = d15;
                    codec = codec2;
                    w0 w0Var40 = (w0) cVarC.f(f412706c, 18, j1.f412874a, w0Var19);
                    i13 |= 262144;
                    G0 g021 = G0.f406611a;
                    w0Var19 = w0Var40;
                    w0Var23 = w0Var23;
                    d15 = d13;
                    d14 = d12;
                    w0Var4 = w0Var2;
                    remoteOutboundRtpStats2 = remoteOutboundRtpStats;
                    codec2 = codec;
                case 19:
                    d12 = d14;
                    w0Var2 = w0Var4;
                    remoteOutboundRtpStats = remoteOutboundRtpStats2;
                    d13 = d15;
                    codec = codec2;
                    w0 w0Var41 = (w0) cVarC.f(f412706c, 19, j1.f412874a, w0Var20);
                    i13 |= 524288;
                    G0 g022 = G0.f406611a;
                    w0Var20 = w0Var41;
                    d17 = d17;
                    d15 = d13;
                    d14 = d12;
                    w0Var4 = w0Var2;
                    remoteOutboundRtpStats2 = remoteOutboundRtpStats;
                    codec2 = codec;
                case 20:
                    d12 = d14;
                    w0Var2 = w0Var4;
                    remoteOutboundRtpStats = remoteOutboundRtpStats2;
                    d13 = d15;
                    codec = codec2;
                    w0 w0Var42 = (w0) cVarC.f(f412706c, 20, j1.f412874a, w0Var21);
                    i13 |= 1048576;
                    G0 g023 = G0.f406611a;
                    w0Var21 = w0Var42;
                    d18 = d18;
                    d15 = d13;
                    d14 = d12;
                    w0Var4 = w0Var2;
                    remoteOutboundRtpStats2 = remoteOutboundRtpStats;
                    codec2 = codec;
                case 21:
                    d12 = d14;
                    w0Var2 = w0Var4;
                    remoteOutboundRtpStats = remoteOutboundRtpStats2;
                    d13 = d15;
                    codec = codec2;
                    w0 w0Var43 = (w0) cVarC.f(f412706c, 21, j1.f412874a, w0Var22);
                    i13 |= 2097152;
                    G0 g024 = G0.f406611a;
                    w0Var22 = w0Var43;
                    d19 = d19;
                    d15 = d13;
                    d14 = d12;
                    w0Var4 = w0Var2;
                    remoteOutboundRtpStats2 = remoteOutboundRtpStats;
                    codec2 = codec;
                case 22:
                    d12 = d14;
                    w0Var2 = w0Var4;
                    remoteOutboundRtpStats = remoteOutboundRtpStats2;
                    d13 = d15;
                    codec = codec2;
                    w0 w0Var44 = (w0) cVarC.f(f412706c, 22, j1.f412874a, w0Var23);
                    i13 |= 4194304;
                    G0 g025 = G0.f406611a;
                    w0Var23 = w0Var44;
                    d22 = d22;
                    d15 = d13;
                    d14 = d12;
                    w0Var4 = w0Var2;
                    remoteOutboundRtpStats2 = remoteOutboundRtpStats;
                    codec2 = codec;
                case 23:
                    d12 = d14;
                    w0Var2 = w0Var4;
                    remoteOutboundRtpStats = remoteOutboundRtpStats2;
                    d13 = d15;
                    codec = codec2;
                    Double d33 = (Double) cVarC.f(f412706c, 23, F.f412769a, d17);
                    i13 |= 8388608;
                    G0 g026 = G0.f406611a;
                    d17 = d33;
                    d23 = d23;
                    d15 = d13;
                    d14 = d12;
                    w0Var4 = w0Var2;
                    remoteOutboundRtpStats2 = remoteOutboundRtpStats;
                    codec2 = codec;
                case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                    d12 = d14;
                    w0Var2 = w0Var4;
                    remoteOutboundRtpStats = remoteOutboundRtpStats2;
                    d13 = d15;
                    codec = codec2;
                    Double d34 = (Double) cVarC.f(f412706c, 24, F.f412769a, d18);
                    i13 |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
                    G0 g027 = G0.f406611a;
                    d18 = d34;
                    d24 = d24;
                    d15 = d13;
                    d14 = d12;
                    w0Var4 = w0Var2;
                    remoteOutboundRtpStats2 = remoteOutboundRtpStats;
                    codec2 = codec;
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                    d12 = d14;
                    w0Var2 = w0Var4;
                    remoteOutboundRtpStats = remoteOutboundRtpStats2;
                    d13 = d15;
                    codec = codec2;
                    Double d35 = (Double) cVarC.f(f412706c, 25, F.f412769a, d19);
                    i13 |= 33554432;
                    G0 g028 = G0.f406611a;
                    d19 = d35;
                    w0Var24 = w0Var24;
                    d15 = d13;
                    d14 = d12;
                    w0Var4 = w0Var2;
                    remoteOutboundRtpStats2 = remoteOutboundRtpStats;
                    codec2 = codec;
                case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                    d12 = d14;
                    w0Var2 = w0Var4;
                    remoteOutboundRtpStats = remoteOutboundRtpStats2;
                    d13 = d15;
                    codec = codec2;
                    Double d36 = (Double) cVarC.f(f412706c, 26, F.f412769a, d22);
                    i13 |= 67108864;
                    G0 g029 = G0.f406611a;
                    d22 = d36;
                    d25 = d25;
                    d15 = d13;
                    d14 = d12;
                    w0Var4 = w0Var2;
                    remoteOutboundRtpStats2 = remoteOutboundRtpStats;
                    codec2 = codec;
                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                    d12 = d14;
                    w0Var2 = w0Var4;
                    remoteOutboundRtpStats = remoteOutboundRtpStats2;
                    d13 = d15;
                    codec = codec2;
                    Double d37 = (Double) cVarC.f(f412706c, 27, F.f412769a, d23);
                    i13 |= 134217728;
                    G0 g030 = G0.f406611a;
                    d23 = d37;
                    w0Var25 = w0Var25;
                    d15 = d13;
                    d14 = d12;
                    w0Var4 = w0Var2;
                    remoteOutboundRtpStats2 = remoteOutboundRtpStats;
                    codec2 = codec;
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                    d12 = d14;
                    w0Var2 = w0Var4;
                    remoteOutboundRtpStats = remoteOutboundRtpStats2;
                    codec = codec2;
                    d13 = d15;
                    Double d38 = (Double) cVarC.f(f412706c, 28, F.f412769a, d24);
                    i13 |= 268435456;
                    G0 g031 = G0.f406611a;
                    d24 = d38;
                    d15 = d13;
                    d14 = d12;
                    w0Var4 = w0Var2;
                    remoteOutboundRtpStats2 = remoteOutboundRtpStats;
                    codec2 = codec;
                case AvailableCode.HMS_IS_SPOOF /* 29 */:
                    w0Var2 = w0Var4;
                    remoteOutboundRtpStats = remoteOutboundRtpStats2;
                    codec = codec2;
                    d12 = d14;
                    w0 w0Var45 = (w0) cVarC.f(f412706c, 29, j1.f412874a, w0Var24);
                    i13 |= 536870912;
                    G0 g032 = G0.f406611a;
                    w0Var24 = w0Var45;
                    d14 = d12;
                    w0Var4 = w0Var2;
                    remoteOutboundRtpStats2 = remoteOutboundRtpStats;
                    codec2 = codec;
                case 30:
                    remoteOutboundRtpStats = remoteOutboundRtpStats2;
                    codec = codec2;
                    w0Var2 = w0Var4;
                    Double d39 = (Double) cVarC.f(f412706c, 30, F.f412769a, d25);
                    i13 |= 1073741824;
                    G0 g033 = G0.f406611a;
                    d25 = d39;
                    w0Var4 = w0Var2;
                    remoteOutboundRtpStats2 = remoteOutboundRtpStats;
                    codec2 = codec;
                case 31:
                    codec = codec2;
                    remoteOutboundRtpStats = remoteOutboundRtpStats2;
                    w0 w0Var46 = (w0) cVarC.f(f412706c, 31, j1.f412874a, w0Var25);
                    i13 |= BeduinInputModel.MIN_TEXT_VERSION;
                    G0 g034 = G0.f406611a;
                    w0Var25 = w0Var46;
                    remoteOutboundRtpStats2 = remoteOutboundRtpStats;
                    codec2 = codec;
                case 32:
                    codec = codec2;
                    Double d42 = (Double) cVarC.f(f412706c, 32, F.f412769a, d15);
                    i14 |= 1;
                    G0 g035 = G0.f406611a;
                    d15 = d42;
                    codec2 = codec;
                case 33:
                    codec = codec2;
                    d14 = (Double) cVarC.f(f412706c, 33, F.f412769a, d14);
                    i12 = 2;
                    i14 |= i12;
                    G0 g036 = G0.f406611a;
                    codec2 = codec;
                case 34:
                    codec = codec2;
                    w0Var4 = (w0) cVarC.f(f412706c, 34, j1.f412874a, w0Var4);
                    i12 = 4;
                    i14 |= i12;
                    G0 g0362 = G0.f406611a;
                    codec2 = codec;
                case 35:
                    codec = codec2;
                    remoteOutboundRtpStats2 = (StatsReport.RemoteOutboundRtpStats) cVarC.f(f412706c, 35, StatsReport$RemoteOutboundRtpStats$$serializer.INSTANCE, remoteOutboundRtpStats2);
                    i12 = 8;
                    i14 |= i12;
                    G0 g03622 = G0.f406611a;
                    codec2 = codec;
                default:
                    throw new UnknownFieldException(iJ2);
            }
        }
        Double d43 = d15;
        w0 w0Var47 = w0Var9;
        w0 w0Var48 = w0Var10;
        w0 w0Var49 = w0Var11;
        w0 w0Var50 = w0Var12;
        w0 w0Var51 = w0Var13;
        w0 w0Var52 = w0Var14;
        w0 w0Var53 = w0Var15;
        w0 w0Var54 = w0Var16;
        Double d44 = d16;
        w0 w0Var55 = w0Var17;
        w0 w0Var56 = w0Var19;
        w0 w0Var57 = w0Var20;
        w0 w0Var58 = w0Var21;
        w0 w0Var59 = w0Var22;
        w0 w0Var60 = w0Var23;
        Double d45 = d17;
        Double d46 = d18;
        Double d47 = d19;
        Double d48 = d22;
        Double d49 = d23;
        Double d52 = d24;
        w0 w0Var61 = w0Var24;
        Double d53 = d25;
        w0 w0Var62 = w0Var25;
        cVarC.d(f412706c);
        return new StatsReport.InboundRtpAudioStats(i13, i14, codec2, w0Var7, w0Var8, l12, w0Var6, w0Var5, w0Var47, w0Var48, w0Var49, w0Var50, w0Var51, w0Var52, w0Var53, w0Var54, d44, w0Var55, w0Var18, w0Var3, w0Var56, w0Var57, w0Var58, w0Var59, w0Var60, d45, d46, d47, d48, d49, d52, w0Var61, d53, w0Var62, d43, d14, w0Var4, remoteOutboundRtpStats2, null, null);
    }

    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
    @k
    /* renamed from: getDescriptor */
    public SerialDescriptor getF332717a() {
        return descriptor;
    }

    @Override // kotlinx.serialization.x
    public void serialize(@k Encoder encoder, @k StatsReport.InboundRtpAudioStats value) {
        SerialDescriptor f412706c = getF332717a();
        kotlinx.serialization.encoding.d dVarC = encoder.c(f412706c);
        StatsReport.InboundRtpAudioStats.Companion companion = StatsReport.InboundRtpAudioStats.INSTANCE;
        dVarC.p(f412706c, 0, StatsReport$Codec$$serializer.INSTANCE, value.f332250a);
        j1 j1Var = j1.f412874a;
        dVarC.p(f412706c, 1, j1Var, value.f332251b);
        dVarC.p(f412706c, 2, j1Var, value.f332252c);
        dVarC.p(f412706c, 3, C43412k0.f412877a, value.f332253d);
        dVarC.p(f412706c, 4, j1Var, value.f332254e);
        dVarC.p(f412706c, 5, j1Var, value.f332255f);
        dVarC.p(f412706c, 6, j1Var, value.f332256g);
        dVarC.p(f412706c, 7, j1Var, value.f332257h);
        dVarC.p(f412706c, 8, j1Var, value.f332258i);
        dVarC.p(f412706c, 9, j1Var, value.f332259j);
        dVarC.p(f412706c, 10, j1Var, value.f332260k);
        dVarC.p(f412706c, 11, j1Var, value.f332261l);
        dVarC.p(f412706c, 12, j1Var, value.f332262m);
        dVarC.p(f412706c, 13, j1Var, value.f332263n);
        F f12 = F.f412769a;
        dVarC.p(f412706c, 14, f12, value.f332264o);
        dVarC.p(f412706c, 15, j1Var, value.f332265p);
        dVarC.p(f412706c, 16, j1Var, value.f332266q);
        dVarC.p(f412706c, 17, j1Var, value.f332267r);
        dVarC.p(f412706c, 18, j1Var, value.f332268s);
        dVarC.p(f412706c, 19, j1Var, value.f332269t);
        dVarC.p(f412706c, 20, j1Var, value.f332270u);
        dVarC.p(f412706c, 21, j1Var, value.f332271v);
        dVarC.p(f412706c, 22, j1Var, value.f332272w);
        dVarC.p(f412706c, 23, f12, value.f332273x);
        dVarC.p(f412706c, 24, f12, value.f332274y);
        dVarC.p(f412706c, 25, f12, value.f332275z);
        dVarC.p(f412706c, 26, f12, value.f332240A);
        dVarC.p(f412706c, 27, f12, value.f332241B);
        dVarC.p(f412706c, 28, f12, value.f332242C);
        dVarC.p(f412706c, 29, j1Var, value.f332243D);
        dVarC.p(f412706c, 30, f12, value.f332244E);
        dVarC.p(f412706c, 31, j1Var, value.f332245F);
        dVarC.p(f412706c, 32, f12, value.f332246G);
        dVarC.p(f412706c, 33, f12, value.f332247H);
        dVarC.p(f412706c, 34, j1Var, value.f332248I);
        dVarC.p(f412706c, 35, StatsReport$RemoteOutboundRtpStats$$serializer.INSTANCE, value.f332249J);
        dVarC.d(f412706c);
    }

    @Override // kotlinx.serialization.internal.N
    @k
    public KSerializer<?>[] typeParametersSerializers() {
        return kotlinx.serialization.internal.G0.f412773a;
    }
}
