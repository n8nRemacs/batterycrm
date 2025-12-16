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
import kotlinx.serialization.internal.G0;
import kotlinx.serialization.internal.N;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.V0;
import kotlinx.serialization.internal.j1;

/* compiled from: StatsReport.kt */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/avito/avcalls/android/stats/StatsReport.TransportStats.$serializer", "Lkotlinx/serialization/internal/N;", "Lcom/avito/avcalls/android/stats/StatsReport$TransportStats;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/avito/avcalls/android/stats/StatsReport$TransportStats;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/avito/avcalls/android/stats/StatsReport$TransportStats;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes5.dex */
public final class StatsReport$TransportStats$$serializer implements N<StatsReport.TransportStats> {

    @k
    public static final StatsReport$TransportStats$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        StatsReport$TransportStats$$serializer statsReport$TransportStats$$serializer = new StatsReport$TransportStats$$serializer();
        INSTANCE = statsReport$TransportStats$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.avito.avcalls.android.stats.StatsReport.TransportStats", statsReport$TransportStats$$serializer, 10);
        pluginGeneratedSerialDescriptor.j("bytesSent", false);
        pluginGeneratedSerialDescriptor.j("packetsSent", false);
        pluginGeneratedSerialDescriptor.j("bytesReceived", false);
        pluginGeneratedSerialDescriptor.j("packetsReceived", false);
        pluginGeneratedSerialDescriptor.j("selectedCandidatePairChanges", false);
        pluginGeneratedSerialDescriptor.j("dtlsState", false);
        pluginGeneratedSerialDescriptor.j("dtlsRole", false);
        pluginGeneratedSerialDescriptor.j("iceState", false);
        pluginGeneratedSerialDescriptor.j("iceRole", false);
        pluginGeneratedSerialDescriptor.j("selectedCandidatePair", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private StatsReport$TransportStats$$serializer() {
    }

    @Override // kotlinx.serialization.internal.N
    @k
    public KSerializer<?>[] childSerializers() {
        j1 j1Var = j1.f412874a;
        KSerializer<?> kSerializerA = L51.a.a(j1Var);
        KSerializer<?> kSerializerA2 = L51.a.a(j1Var);
        KSerializer<?> kSerializerA3 = L51.a.a(j1Var);
        KSerializer<?> kSerializerA4 = L51.a.a(j1Var);
        KSerializer<?> kSerializerA5 = L51.a.a(j1Var);
        V0 v02 = V0.f412822a;
        return new KSerializer[]{kSerializerA, kSerializerA2, kSerializerA3, kSerializerA4, kSerializerA5, L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(StatsReport$SelectedCandidatePairStats$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.InterfaceC43386e
    @k
    public StatsReport.TransportStats deserialize(@k Decoder decoder) {
        SerialDescriptor f412706c = getF332717a();
        kotlinx.serialization.encoding.c cVarC = decoder.c(f412706c);
        StatsReport.SelectedCandidatePairStats selectedCandidatePairStats = null;
        w0 w0Var = null;
        w0 w0Var2 = null;
        w0 w0Var3 = null;
        w0 w0Var4 = null;
        w0 w0Var5 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        boolean z12 = true;
        int i12 = 0;
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
                    w0Var4 = (w0) cVarC.f(f412706c, 3, j1.f412874a, w0Var4);
                    i12 |= 8;
                    break;
                case 4:
                    w0Var5 = (w0) cVarC.f(f412706c, 4, j1.f412874a, w0Var5);
                    i12 |= 16;
                    break;
                case 5:
                    str = (String) cVarC.f(f412706c, 5, V0.f412822a, str);
                    i12 |= 32;
                    break;
                case 6:
                    str2 = (String) cVarC.f(f412706c, 6, V0.f412822a, str2);
                    i12 |= 64;
                    break;
                case 7:
                    str3 = (String) cVarC.f(f412706c, 7, V0.f412822a, str3);
                    i12 |= 128;
                    break;
                case 8:
                    str4 = (String) cVarC.f(f412706c, 8, V0.f412822a, str4);
                    i12 |= 256;
                    break;
                case 9:
                    selectedCandidatePairStats = (StatsReport.SelectedCandidatePairStats) cVarC.f(f412706c, 9, StatsReport$SelectedCandidatePairStats$$serializer.INSTANCE, selectedCandidatePairStats);
                    i12 |= 512;
                    break;
                default:
                    throw new UnknownFieldException(iJ2);
            }
        }
        cVarC.d(f412706c);
        return new StatsReport.TransportStats(i12, w0Var, w0Var2, w0Var3, w0Var4, w0Var5, str, str2, str3, str4, selectedCandidatePairStats, null, null);
    }

    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
    @k
    /* renamed from: getDescriptor */
    public SerialDescriptor getF332717a() {
        return descriptor;
    }

    @Override // kotlinx.serialization.x
    public void serialize(@k Encoder encoder, @k StatsReport.TransportStats value) {
        SerialDescriptor f412706c = getF332717a();
        kotlinx.serialization.encoding.d dVarC = encoder.c(f412706c);
        StatsReport.TransportStats.Companion companion = StatsReport.TransportStats.INSTANCE;
        j1 j1Var = j1.f412874a;
        dVarC.p(f412706c, 0, j1Var, value.f332403a);
        dVarC.p(f412706c, 1, j1Var, value.f332404b);
        dVarC.p(f412706c, 2, j1Var, value.f332405c);
        dVarC.p(f412706c, 3, j1Var, value.f332406d);
        dVarC.p(f412706c, 4, j1Var, value.f332407e);
        V0 v02 = V0.f412822a;
        dVarC.p(f412706c, 5, v02, value.f332408f);
        dVarC.p(f412706c, 6, v02, value.f332409g);
        dVarC.p(f412706c, 7, v02, value.f332410h);
        dVarC.p(f412706c, 8, v02, value.f332411i);
        dVarC.p(f412706c, 9, StatsReport$SelectedCandidatePairStats$$serializer.INSTANCE, value.f332412j);
        dVarC.d(f412706c);
    }

    @Override // kotlinx.serialization.internal.N
    @k
    public KSerializer<?>[] typeParametersSerializers() {
        return G0.f412773a;
    }
}
