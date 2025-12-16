package com.avito.avcalls.stats;

import Y61.k;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.avcalls.stats.StatsReport;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.w0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.C43407i;
import kotlinx.serialization.internal.F;
import kotlinx.serialization.internal.G0;
import kotlinx.serialization.internal.N;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.V0;
import kotlinx.serialization.internal.j1;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: StatsReport.kt */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/avito/avcalls/stats/StatsReport.SelectedCandidatePairStats.$serializer", "Lkotlinx/serialization/internal/N;", "Lcom/avito/avcalls/stats/StatsReport$SelectedCandidatePairStats;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/avito/avcalls/stats/StatsReport$SelectedCandidatePairStats;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/avito/avcalls/stats/StatsReport$SelectedCandidatePairStats;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes5.dex */
public final class StatsReport$SelectedCandidatePairStats$$serializer implements N<StatsReport.SelectedCandidatePairStats> {

    @k
    public static final StatsReport$SelectedCandidatePairStats$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        StatsReport$SelectedCandidatePairStats$$serializer statsReport$SelectedCandidatePairStats$$serializer = new StatsReport$SelectedCandidatePairStats$$serializer();
        INSTANCE = statsReport$SelectedCandidatePairStats$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.avito.avcalls.stats.StatsReport.SelectedCandidatePairStats", statsReport$SelectedCandidatePairStats$$serializer, 19);
        pluginGeneratedSerialDescriptor.j("localCandidate", false);
        pluginGeneratedSerialDescriptor.j("remoteCandidate", false);
        pluginGeneratedSerialDescriptor.j(VoiceInfo.STATE, false);
        pluginGeneratedSerialDescriptor.j("writable", false);
        pluginGeneratedSerialDescriptor.j("packetsSent", false);
        pluginGeneratedSerialDescriptor.j("packetsReceived", false);
        pluginGeneratedSerialDescriptor.j("bytesSent", false);
        pluginGeneratedSerialDescriptor.j("bytesReceived", false);
        pluginGeneratedSerialDescriptor.j("totalRoundTripTime", false);
        pluginGeneratedSerialDescriptor.j("currentRoundTripTime", false);
        pluginGeneratedSerialDescriptor.j("availableOutgoingBitrate", false);
        pluginGeneratedSerialDescriptor.j("availableIncomingBitrate", false);
        pluginGeneratedSerialDescriptor.j("requestsReceived", false);
        pluginGeneratedSerialDescriptor.j("requestsSent", false);
        pluginGeneratedSerialDescriptor.j("responsesReceived", false);
        pluginGeneratedSerialDescriptor.j("responsesSent", false);
        pluginGeneratedSerialDescriptor.j("consentRequestsSent", false);
        pluginGeneratedSerialDescriptor.j("packetsDiscardedOnSend", false);
        pluginGeneratedSerialDescriptor.j("bytesDiscardedOnSend", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private StatsReport$SelectedCandidatePairStats$$serializer() {
    }

    @Override // kotlinx.serialization.internal.N
    @k
    public KSerializer<?>[] childSerializers() {
        StatsReport$IceCandidateStats$$serializer statsReport$IceCandidateStats$$serializer = StatsReport$IceCandidateStats$$serializer.INSTANCE;
        KSerializer<?> kSerializerA = L51.a.a(statsReport$IceCandidateStats$$serializer);
        KSerializer<?> kSerializerA2 = L51.a.a(statsReport$IceCandidateStats$$serializer);
        KSerializer<?> kSerializerA3 = L51.a.a(V0.f412822a);
        KSerializer<?> kSerializerA4 = L51.a.a(C43407i.f412866a);
        j1 j1Var = j1.f412874a;
        KSerializer<?> kSerializerA5 = L51.a.a(j1Var);
        KSerializer<?> kSerializerA6 = L51.a.a(j1Var);
        KSerializer<?> kSerializerA7 = L51.a.a(j1Var);
        KSerializer<?> kSerializerA8 = L51.a.a(j1Var);
        F f12 = F.f412769a;
        return new KSerializer[]{kSerializerA, kSerializerA2, kSerializerA3, kSerializerA4, kSerializerA5, kSerializerA6, kSerializerA7, kSerializerA8, L51.a.a(f12), L51.a.a(f12), L51.a.a(f12), L51.a.a(f12), L51.a.a(j1Var), L51.a.a(j1Var), L51.a.a(j1Var), L51.a.a(j1Var), L51.a.a(j1Var), L51.a.a(j1Var), L51.a.a(j1Var)};
    }

    @Override // kotlinx.serialization.InterfaceC43386e
    @k
    public StatsReport.SelectedCandidatePairStats deserialize(@k Decoder decoder) {
        w0 w0Var;
        int i12;
        w0 w0Var2;
        w0 w0Var3;
        w0 w0Var4;
        w0 w0Var5;
        w0 w0Var6;
        StatsReport.IceCandidateStats iceCandidateStats;
        w0 w0Var7;
        Double d12;
        w0 w0Var8;
        w0 w0Var9;
        w0 w0Var10;
        w0 w0Var11;
        w0 w0Var12;
        Boolean bool;
        w0 w0Var13;
        w0 w0Var14;
        Double d13;
        SerialDescriptor f412706c = getF332717a();
        kotlinx.serialization.encoding.c cVarC = decoder.c(f412706c);
        Double d14 = null;
        w0 w0Var15 = null;
        Double d15 = null;
        Double d16 = null;
        w0 w0Var16 = null;
        w0 w0Var17 = null;
        w0 w0Var18 = null;
        w0 w0Var19 = null;
        w0 w0Var20 = null;
        w0 w0Var21 = null;
        w0 w0Var22 = null;
        w0 w0Var23 = null;
        Double d17 = null;
        StatsReport.IceCandidateStats iceCandidateStats2 = null;
        StatsReport.IceCandidateStats iceCandidateStats3 = null;
        String str = null;
        Boolean bool2 = null;
        w0 w0Var24 = null;
        w0 w0Var25 = null;
        int i13 = 0;
        boolean z12 = true;
        while (z12) {
            w0 w0Var26 = w0Var22;
            int iJ2 = cVarC.j(f412706c);
            switch (iJ2) {
                case -1:
                    w0Var2 = w0Var21;
                    w0Var3 = w0Var25;
                    w0Var4 = w0Var20;
                    w0Var5 = w0Var24;
                    StatsReport.IceCandidateStats iceCandidateStats4 = iceCandidateStats2;
                    w0Var6 = w0Var16;
                    iceCandidateStats = iceCandidateStats4;
                    w0Var22 = w0Var26;
                    z12 = false;
                    w0Var17 = w0Var17;
                    w0Var18 = w0Var18;
                    d15 = d15;
                    w0Var23 = w0Var23;
                    bool2 = bool2;
                    w0Var19 = w0Var19;
                    w0Var15 = w0Var15;
                    w0Var24 = w0Var5;
                    w0Var20 = w0Var4;
                    w0Var25 = w0Var3;
                    w0Var21 = w0Var2;
                    w0 w0Var27 = w0Var6;
                    iceCandidateStats2 = iceCandidateStats;
                    w0Var16 = w0Var27;
                case 0:
                    w0Var2 = w0Var21;
                    w0Var3 = w0Var25;
                    w0Var4 = w0Var20;
                    w0Var5 = w0Var24;
                    StatsReport.IceCandidateStats iceCandidateStats5 = iceCandidateStats2;
                    w0Var6 = w0Var16;
                    iceCandidateStats = (StatsReport.IceCandidateStats) cVarC.f(f412706c, 0, StatsReport$IceCandidateStats$$serializer.INSTANCE, iceCandidateStats5);
                    i13 |= 1;
                    w0Var23 = w0Var23;
                    w0Var22 = w0Var26;
                    w0Var17 = w0Var17;
                    w0Var18 = w0Var18;
                    d15 = d15;
                    w0Var15 = w0Var15;
                    bool2 = bool2;
                    w0Var19 = w0Var19;
                    w0Var24 = w0Var5;
                    w0Var20 = w0Var4;
                    w0Var25 = w0Var3;
                    w0Var21 = w0Var2;
                    w0 w0Var272 = w0Var6;
                    iceCandidateStats2 = iceCandidateStats;
                    w0Var16 = w0Var272;
                case 1:
                    w0Var7 = w0Var15;
                    d12 = d15;
                    w0Var8 = w0Var21;
                    w0Var9 = w0Var25;
                    w0Var10 = w0Var20;
                    w0Var11 = w0Var24;
                    w0Var12 = w0Var19;
                    bool = bool2;
                    w0Var13 = w0Var18;
                    iceCandidateStats3 = (StatsReport.IceCandidateStats) cVarC.f(f412706c, 1, StatsReport$IceCandidateStats$$serializer.INSTANCE, iceCandidateStats3);
                    i13 |= 2;
                    w0Var23 = w0Var23;
                    w0Var22 = w0Var26;
                    w0Var17 = w0Var17;
                    w0Var18 = w0Var13;
                    d15 = d12;
                    w0Var15 = w0Var7;
                    bool2 = bool;
                    w0Var19 = w0Var12;
                    w0Var24 = w0Var11;
                    w0Var20 = w0Var10;
                    w0Var25 = w0Var9;
                    w0Var21 = w0Var8;
                case 2:
                    w0Var7 = w0Var15;
                    d12 = d15;
                    w0Var8 = w0Var21;
                    w0Var9 = w0Var25;
                    w0Var10 = w0Var20;
                    w0Var11 = w0Var24;
                    w0Var12 = w0Var19;
                    bool = bool2;
                    w0Var13 = w0Var18;
                    str = (String) cVarC.f(f412706c, 2, V0.f412822a, str);
                    i13 |= 4;
                    w0Var23 = w0Var23;
                    w0Var22 = w0Var26;
                    w0Var18 = w0Var13;
                    d15 = d12;
                    w0Var15 = w0Var7;
                    bool2 = bool;
                    w0Var19 = w0Var12;
                    w0Var24 = w0Var11;
                    w0Var20 = w0Var10;
                    w0Var25 = w0Var9;
                    w0Var21 = w0Var8;
                case 3:
                    w0Var8 = w0Var21;
                    w0Var9 = w0Var25;
                    w0Var10 = w0Var20;
                    w0Var11 = w0Var24;
                    bool2 = (Boolean) cVarC.f(f412706c, 3, C43407i.f412866a, bool2);
                    i13 |= 8;
                    w0Var23 = w0Var23;
                    w0Var22 = w0Var26;
                    w0Var19 = w0Var19;
                    d15 = d15;
                    w0Var15 = w0Var15;
                    w0Var24 = w0Var11;
                    w0Var20 = w0Var10;
                    w0Var25 = w0Var9;
                    w0Var21 = w0Var8;
                case 4:
                    w0Var8 = w0Var21;
                    w0Var9 = w0Var25;
                    w0Var24 = (w0) cVarC.f(f412706c, 4, j1.f412874a, w0Var24);
                    i13 |= 16;
                    w0Var23 = w0Var23;
                    w0Var22 = w0Var26;
                    w0Var20 = w0Var20;
                    d15 = d15;
                    w0Var15 = w0Var15;
                    w0Var25 = w0Var9;
                    w0Var21 = w0Var8;
                case 5:
                    w0Var14 = w0Var15;
                    d13 = d15;
                    w0Var25 = (w0) cVarC.f(f412706c, 5, j1.f412874a, w0Var25);
                    i13 |= 32;
                    w0Var23 = w0Var23;
                    w0Var22 = w0Var26;
                    w0Var21 = w0Var21;
                    d15 = d13;
                    w0Var15 = w0Var14;
                case 6:
                    w0Var14 = w0Var15;
                    d13 = d15;
                    w0Var22 = (w0) cVarC.f(f412706c, 6, j1.f412874a, w0Var26);
                    i13 |= 64;
                    w0Var23 = w0Var23;
                    d15 = d13;
                    w0Var15 = w0Var14;
                case 7:
                    w0Var14 = w0Var15;
                    w0Var23 = (w0) cVarC.f(f412706c, 7, j1.f412874a, w0Var23);
                    i13 |= 128;
                    w0Var22 = w0Var26;
                    w0Var15 = w0Var14;
                case 8:
                    w0Var = w0Var23;
                    d17 = (Double) cVarC.f(f412706c, 8, F.f412769a, d17);
                    i13 |= 256;
                    w0Var22 = w0Var26;
                    w0Var23 = w0Var;
                case 9:
                    w0Var = w0Var23;
                    d14 = (Double) cVarC.f(f412706c, 9, F.f412769a, d14);
                    i13 |= 512;
                    w0Var22 = w0Var26;
                    w0Var23 = w0Var;
                case 10:
                    w0Var = w0Var23;
                    d16 = (Double) cVarC.f(f412706c, 10, F.f412769a, d16);
                    i13 |= 1024;
                    w0Var22 = w0Var26;
                    w0Var23 = w0Var;
                case 11:
                    w0Var = w0Var23;
                    d15 = (Double) cVarC.f(f412706c, 11, F.f412769a, d15);
                    i13 |= 2048;
                    w0Var22 = w0Var26;
                    w0Var23 = w0Var;
                case 12:
                    w0Var = w0Var23;
                    w0Var15 = (w0) cVarC.f(f412706c, 12, j1.f412874a, w0Var15);
                    i13 |= 4096;
                    w0Var22 = w0Var26;
                    w0Var23 = w0Var;
                case 13:
                    w0Var = w0Var23;
                    w0Var16 = (w0) cVarC.f(f412706c, 13, j1.f412874a, w0Var16);
                    i13 |= 8192;
                    w0Var22 = w0Var26;
                    w0Var23 = w0Var;
                case 14:
                    w0Var = w0Var23;
                    w0Var17 = (w0) cVarC.f(f412706c, 14, j1.f412874a, w0Var17);
                    i13 |= Http2.INITIAL_MAX_FRAME_SIZE;
                    w0Var22 = w0Var26;
                    w0Var23 = w0Var;
                case 15:
                    w0Var = w0Var23;
                    w0Var18 = (w0) cVarC.f(f412706c, 15, j1.f412874a, w0Var18);
                    i12 = 32768;
                    i13 |= i12;
                    w0Var22 = w0Var26;
                    w0Var23 = w0Var;
                case 16:
                    w0Var = w0Var23;
                    w0Var19 = (w0) cVarC.f(f412706c, 16, j1.f412874a, w0Var19);
                    i12 = AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
                    i13 |= i12;
                    w0Var22 = w0Var26;
                    w0Var23 = w0Var;
                case 17:
                    w0Var = w0Var23;
                    w0Var20 = (w0) cVarC.f(f412706c, 17, j1.f412874a, w0Var20);
                    i12 = 131072;
                    i13 |= i12;
                    w0Var22 = w0Var26;
                    w0Var23 = w0Var;
                case 18:
                    w0Var = w0Var23;
                    w0Var21 = (w0) cVarC.f(f412706c, 18, j1.f412874a, w0Var21);
                    i12 = 262144;
                    i13 |= i12;
                    w0Var22 = w0Var26;
                    w0Var23 = w0Var;
                default:
                    throw new UnknownFieldException(iJ2);
            }
        }
        Double d18 = d15;
        w0 w0Var28 = w0Var17;
        w0 w0Var29 = w0Var21;
        StatsReport.IceCandidateStats iceCandidateStats6 = iceCandidateStats3;
        w0 w0Var30 = w0Var25;
        w0 w0Var31 = w0Var20;
        w0 w0Var32 = w0Var24;
        w0 w0Var33 = w0Var19;
        Boolean bool3 = bool2;
        w0 w0Var34 = w0Var18;
        String str2 = str;
        StatsReport.IceCandidateStats iceCandidateStats7 = iceCandidateStats2;
        cVarC.d(f412706c);
        return new StatsReport.SelectedCandidatePairStats(i13, iceCandidateStats7, iceCandidateStats6, str2, bool3, w0Var32, w0Var30, w0Var22, w0Var23, d17, d14, d16, d18, w0Var15, w0Var16, w0Var28, w0Var34, w0Var33, w0Var31, w0Var29, null, null);
    }

    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
    @k
    /* renamed from: getDescriptor */
    public SerialDescriptor getF332717a() {
        return descriptor;
    }

    @Override // kotlinx.serialization.x
    public void serialize(@k Encoder encoder, @k StatsReport.SelectedCandidatePairStats value) {
        SerialDescriptor f412706c = getF332717a();
        kotlinx.serialization.encoding.d dVarC = encoder.c(f412706c);
        StatsReport.SelectedCandidatePairStats.Companion companion = StatsReport.SelectedCandidatePairStats.INSTANCE;
        StatsReport$IceCandidateStats$$serializer statsReport$IceCandidateStats$$serializer = StatsReport$IceCandidateStats$$serializer.INSTANCE;
        dVarC.p(f412706c, 0, statsReport$IceCandidateStats$$serializer, value.f333612a);
        dVarC.p(f412706c, 1, statsReport$IceCandidateStats$$serializer, value.f333613b);
        dVarC.p(f412706c, 2, V0.f412822a, value.f333614c);
        dVarC.p(f412706c, 3, C43407i.f412866a, value.f333615d);
        j1 j1Var = j1.f412874a;
        dVarC.p(f412706c, 4, j1Var, value.f333616e);
        dVarC.p(f412706c, 5, j1Var, value.f333617f);
        dVarC.p(f412706c, 6, j1Var, value.f333618g);
        dVarC.p(f412706c, 7, j1Var, value.f333619h);
        F f12 = F.f412769a;
        dVarC.p(f412706c, 8, f12, value.f333620i);
        dVarC.p(f412706c, 9, f12, value.f333621j);
        dVarC.p(f412706c, 10, f12, value.f333622k);
        dVarC.p(f412706c, 11, f12, value.f333623l);
        dVarC.p(f412706c, 12, j1Var, value.f333624m);
        dVarC.p(f412706c, 13, j1Var, value.f333625n);
        dVarC.p(f412706c, 14, j1Var, value.f333626o);
        dVarC.p(f412706c, 15, j1Var, value.f333627p);
        dVarC.p(f412706c, 16, j1Var, value.f333628q);
        dVarC.p(f412706c, 17, j1Var, value.f333629r);
        dVarC.p(f412706c, 18, j1Var, value.f333630s);
        dVarC.d(f412706c);
    }

    @Override // kotlinx.serialization.internal.N
    @k
    public KSerializer<?>[] typeParametersSerializers() {
        return G0.f412773a;
    }
}
