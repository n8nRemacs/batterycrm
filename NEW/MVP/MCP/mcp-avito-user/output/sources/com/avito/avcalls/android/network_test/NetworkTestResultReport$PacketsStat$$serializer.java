package com.avito.avcalls.android.network_test;

import com.avito.avcalls.android.network_test.NetworkTestResultReport;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.G0;
import kotlinx.serialization.internal.N;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.Y;

/* compiled from: NetworkTestResultReport.kt */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/avito/avcalls/android/network_test/NetworkTestResultReport.PacketsStat.$serializer", "Lkotlinx/serialization/internal/N;", "Lcom/avito/avcalls/android/network_test/NetworkTestResultReport$PacketsStat;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/avito/avcalls/android/network_test/NetworkTestResultReport$PacketsStat;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/avito/avcalls/android/network_test/NetworkTestResultReport$PacketsStat;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes5.dex */
public final class NetworkTestResultReport$PacketsStat$$serializer implements N<NetworkTestResultReport.PacketsStat> {

    @Y61.k
    public static final NetworkTestResultReport$PacketsStat$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        NetworkTestResultReport$PacketsStat$$serializer networkTestResultReport$PacketsStat$$serializer = new NetworkTestResultReport$PacketsStat$$serializer();
        INSTANCE = networkTestResultReport$PacketsStat$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.avito.avcalls.android.network_test.NetworkTestResultReport.PacketsStat", networkTestResultReport$PacketsStat$$serializer, 7);
        pluginGeneratedSerialDescriptor.j("sent", false);
        pluginGeneratedSerialDescriptor.j("lost", false);
        pluginGeneratedSerialDescriptor.j("outOfOrder", false);
        pluginGeneratedSerialDescriptor.j("duplicates", false);
        pluginGeneratedSerialDescriptor.j("rtt", false);
        pluginGeneratedSerialDescriptor.j("jitter", false);
        pluginGeneratedSerialDescriptor.j("burstLoss", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private NetworkTestResultReport$PacketsStat$$serializer() {
    }

    @Override // kotlinx.serialization.internal.N
    @Y61.k
    public KSerializer<?>[] childSerializers() {
        NetworkTestResultReport$IntWithPercent$$serializer networkTestResultReport$IntWithPercent$$serializer = NetworkTestResultReport$IntWithPercent$$serializer.INSTANCE;
        NetworkTestResultReport$Stats$$serializer networkTestResultReport$Stats$$serializer = NetworkTestResultReport$Stats$$serializer.INSTANCE;
        return new KSerializer[]{Y.f412835a, networkTestResultReport$IntWithPercent$$serializer, networkTestResultReport$IntWithPercent$$serializer, networkTestResultReport$IntWithPercent$$serializer, networkTestResultReport$Stats$$serializer, networkTestResultReport$Stats$$serializer, networkTestResultReport$Stats$$serializer};
    }

    @Override // kotlinx.serialization.InterfaceC43386e
    @Y61.k
    public NetworkTestResultReport.PacketsStat deserialize(@Y61.k Decoder decoder) {
        SerialDescriptor f332717a = getF332717a();
        kotlinx.serialization.encoding.c cVarC = decoder.c(f332717a);
        int i12 = 0;
        int iQ2 = 0;
        NetworkTestResultReport.IntWithPercent intWithPercent = null;
        NetworkTestResultReport.IntWithPercent intWithPercent2 = null;
        NetworkTestResultReport.IntWithPercent intWithPercent3 = null;
        NetworkTestResultReport.Stats stats = null;
        NetworkTestResultReport.Stats stats2 = null;
        NetworkTestResultReport.Stats stats3 = null;
        boolean z12 = true;
        while (z12) {
            int iJ2 = cVarC.j(f332717a);
            switch (iJ2) {
                case -1:
                    z12 = false;
                    break;
                case 0:
                    iQ2 = cVarC.q(f332717a, 0);
                    i12 |= 1;
                    break;
                case 1:
                    intWithPercent = (NetworkTestResultReport.IntWithPercent) cVarC.v(f332717a, 1, NetworkTestResultReport$IntWithPercent$$serializer.INSTANCE, intWithPercent);
                    i12 |= 2;
                    break;
                case 2:
                    intWithPercent2 = (NetworkTestResultReport.IntWithPercent) cVarC.v(f332717a, 2, NetworkTestResultReport$IntWithPercent$$serializer.INSTANCE, intWithPercent2);
                    i12 |= 4;
                    break;
                case 3:
                    intWithPercent3 = (NetworkTestResultReport.IntWithPercent) cVarC.v(f332717a, 3, NetworkTestResultReport$IntWithPercent$$serializer.INSTANCE, intWithPercent3);
                    i12 |= 8;
                    break;
                case 4:
                    stats = (NetworkTestResultReport.Stats) cVarC.v(f332717a, 4, NetworkTestResultReport$Stats$$serializer.INSTANCE, stats);
                    i12 |= 16;
                    break;
                case 5:
                    stats2 = (NetworkTestResultReport.Stats) cVarC.v(f332717a, 5, NetworkTestResultReport$Stats$$serializer.INSTANCE, stats2);
                    i12 |= 32;
                    break;
                case 6:
                    stats3 = (NetworkTestResultReport.Stats) cVarC.v(f332717a, 6, NetworkTestResultReport$Stats$$serializer.INSTANCE, stats3);
                    i12 |= 64;
                    break;
                default:
                    throw new UnknownFieldException(iJ2);
            }
        }
        cVarC.d(f332717a);
        return new NetworkTestResultReport.PacketsStat(i12, iQ2, intWithPercent, intWithPercent2, intWithPercent3, stats, stats2, stats3, null);
    }

    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
    @Y61.k
    /* renamed from: getDescriptor */
    public SerialDescriptor getF332717a() {
        return descriptor;
    }

    @Override // kotlinx.serialization.x
    public void serialize(@Y61.k Encoder encoder, @Y61.k NetworkTestResultReport.PacketsStat value) {
        SerialDescriptor f332717a = getF332717a();
        kotlinx.serialization.encoding.d dVarC = encoder.c(f332717a);
        dVarC.D(0, value.f331769a, f332717a);
        NetworkTestResultReport$IntWithPercent$$serializer networkTestResultReport$IntWithPercent$$serializer = NetworkTestResultReport$IntWithPercent$$serializer.INSTANCE;
        dVarC.F(f332717a, 1, networkTestResultReport$IntWithPercent$$serializer, value.f331770b);
        dVarC.F(f332717a, 2, networkTestResultReport$IntWithPercent$$serializer, value.f331771c);
        dVarC.F(f332717a, 3, networkTestResultReport$IntWithPercent$$serializer, value.f331772d);
        NetworkTestResultReport$Stats$$serializer networkTestResultReport$Stats$$serializer = NetworkTestResultReport$Stats$$serializer.INSTANCE;
        dVarC.F(f332717a, 4, networkTestResultReport$Stats$$serializer, value.f331773e);
        dVarC.F(f332717a, 5, networkTestResultReport$Stats$$serializer, value.f331774f);
        dVarC.F(f332717a, 6, networkTestResultReport$Stats$$serializer, value.f331775g);
        dVarC.d(f332717a);
    }

    @Override // kotlinx.serialization.internal.N
    @Y61.k
    public KSerializer<?>[] typeParametersSerializers() {
        return G0.f412773a;
    }
}
