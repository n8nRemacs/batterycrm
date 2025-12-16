package com.avito.avcalls.android.stats;

import Y61.k;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.avcalls.android.stats.StatsReport;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.C43407i;
import kotlinx.serialization.internal.G0;
import kotlinx.serialization.internal.N;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.V0;
import kotlinx.serialization.internal.Y;

/* compiled from: StatsReport.kt */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/avito/avcalls/android/stats/StatsReport.IceCandidateStats.$serializer", "Lkotlinx/serialization/internal/N;", "Lcom/avito/avcalls/android/stats/StatsReport$IceCandidateStats;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/avito/avcalls/android/stats/StatsReport$IceCandidateStats;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/avito/avcalls/android/stats/StatsReport$IceCandidateStats;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes5.dex */
public final class StatsReport$IceCandidateStats$$serializer implements N<StatsReport.IceCandidateStats> {

    @k
    public static final StatsReport$IceCandidateStats$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        StatsReport$IceCandidateStats$$serializer statsReport$IceCandidateStats$$serializer = new StatsReport$IceCandidateStats$$serializer();
        INSTANCE = statsReport$IceCandidateStats$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.avito.avcalls.android.stats.StatsReport.IceCandidateStats", statsReport$IceCandidateStats$$serializer, 12);
        pluginGeneratedSerialDescriptor.j("networkType", false);
        pluginGeneratedSerialDescriptor.j("networkAdapterType", false);
        pluginGeneratedSerialDescriptor.j("ip", false);
        pluginGeneratedSerialDescriptor.j(AddressParameter.TYPE, false);
        pluginGeneratedSerialDescriptor.j("port", false);
        pluginGeneratedSerialDescriptor.j("relatedAddress", false);
        pluginGeneratedSerialDescriptor.j("relatedPort", false);
        pluginGeneratedSerialDescriptor.j("relayProtocol", false);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j("protocol", false);
        pluginGeneratedSerialDescriptor.j("tcpType", false);
        pluginGeneratedSerialDescriptor.j("vpn", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private StatsReport$IceCandidateStats$$serializer() {
    }

    @Override // kotlinx.serialization.internal.N
    @k
    public KSerializer<?>[] childSerializers() {
        V0 v02 = V0.f412822a;
        KSerializer<?> kSerializerA = L51.a.a(v02);
        KSerializer<?> kSerializerA2 = L51.a.a(v02);
        KSerializer<?> kSerializerA3 = L51.a.a(v02);
        KSerializer<?> kSerializerA4 = L51.a.a(v02);
        Y y12 = Y.f412835a;
        return new KSerializer[]{kSerializerA, kSerializerA2, kSerializerA3, kSerializerA4, L51.a.a(y12), L51.a.a(v02), L51.a.a(y12), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(C43407i.f412866a)};
    }

    @Override // kotlinx.serialization.InterfaceC43386e
    @k
    public StatsReport.IceCandidateStats deserialize(@k Decoder decoder) {
        String str;
        Boolean bool;
        SerialDescriptor f332717a = getF332717a();
        kotlinx.serialization.encoding.c cVarC = decoder.c(f332717a);
        String str2 = null;
        Boolean bool2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Integer num = null;
        String str8 = null;
        Integer num2 = null;
        String str9 = null;
        String str10 = null;
        int i12 = 0;
        boolean z12 = true;
        while (z12) {
            int iJ2 = cVarC.j(f332717a);
            switch (iJ2) {
                case -1:
                    bool = bool2;
                    z12 = false;
                    str4 = str4;
                    bool2 = bool;
                case 0:
                    bool = bool2;
                    i12 |= 1;
                    str4 = (String) cVarC.f(f332717a, 0, V0.f412822a, str4);
                    bool2 = bool;
                case 1:
                    str = str4;
                    str5 = (String) cVarC.f(f332717a, 1, V0.f412822a, str5);
                    i12 |= 2;
                    str4 = str;
                case 2:
                    str = str4;
                    str6 = (String) cVarC.f(f332717a, 2, V0.f412822a, str6);
                    i12 |= 4;
                    str4 = str;
                case 3:
                    str = str4;
                    str7 = (String) cVarC.f(f332717a, 3, V0.f412822a, str7);
                    i12 |= 8;
                    str4 = str;
                case 4:
                    str = str4;
                    num = (Integer) cVarC.f(f332717a, 4, Y.f412835a, num);
                    i12 |= 16;
                    str4 = str;
                case 5:
                    str = str4;
                    str8 = (String) cVarC.f(f332717a, 5, V0.f412822a, str8);
                    i12 |= 32;
                    str4 = str;
                case 6:
                    str = str4;
                    num2 = (Integer) cVarC.f(f332717a, 6, Y.f412835a, num2);
                    i12 |= 64;
                    str4 = str;
                case 7:
                    str = str4;
                    str9 = (String) cVarC.f(f332717a, 7, V0.f412822a, str9);
                    i12 |= 128;
                    str4 = str;
                case 8:
                    str = str4;
                    str10 = (String) cVarC.f(f332717a, 8, V0.f412822a, str10);
                    i12 |= 256;
                    str4 = str;
                case 9:
                    str = str4;
                    str2 = (String) cVarC.f(f332717a, 9, V0.f412822a, str2);
                    i12 |= 512;
                    str4 = str;
                case 10:
                    str = str4;
                    str3 = (String) cVarC.f(f332717a, 10, V0.f412822a, str3);
                    i12 |= 1024;
                    str4 = str;
                case 11:
                    str = str4;
                    bool2 = (Boolean) cVarC.f(f332717a, 11, C43407i.f412866a, bool2);
                    i12 |= 2048;
                    str4 = str;
                default:
                    throw new UnknownFieldException(iJ2);
            }
        }
        cVarC.d(f332717a);
        return new StatsReport.IceCandidateStats(i12, str4, str5, str6, str7, num, str8, num2, str9, str10, str2, str3, bool2, null);
    }

    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
    @k
    /* renamed from: getDescriptor */
    public SerialDescriptor getF332717a() {
        return descriptor;
    }

    @Override // kotlinx.serialization.x
    public void serialize(@k Encoder encoder, @k StatsReport.IceCandidateStats value) {
        SerialDescriptor f332717a = getF332717a();
        kotlinx.serialization.encoding.d dVarC = encoder.c(f332717a);
        StatsReport.IceCandidateStats.Companion companion = StatsReport.IceCandidateStats.INSTANCE;
        V0 v02 = V0.f412822a;
        dVarC.p(f332717a, 0, v02, value.f332228a);
        dVarC.p(f332717a, 1, v02, value.f332229b);
        dVarC.p(f332717a, 2, v02, value.f332230c);
        dVarC.p(f332717a, 3, v02, value.f332231d);
        Y y12 = Y.f412835a;
        dVarC.p(f332717a, 4, y12, value.f332232e);
        dVarC.p(f332717a, 5, v02, value.f332233f);
        dVarC.p(f332717a, 6, y12, value.f332234g);
        dVarC.p(f332717a, 7, v02, value.f332235h);
        dVarC.p(f332717a, 8, v02, value.f332236i);
        dVarC.p(f332717a, 9, v02, value.f332237j);
        dVarC.p(f332717a, 10, v02, value.f332238k);
        dVarC.p(f332717a, 11, C43407i.f412866a, value.f332239l);
        dVarC.d(f332717a);
    }

    @Override // kotlinx.serialization.internal.N
    @k
    public KSerializer<?>[] typeParametersSerializers() {
        return G0.f412773a;
    }
}
