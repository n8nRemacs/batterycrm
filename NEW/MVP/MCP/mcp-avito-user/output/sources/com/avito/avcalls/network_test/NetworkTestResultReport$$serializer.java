package com.avito.avcalls.network_test;

import com.avito.android.remote.model.Navigation;
import com.avito.avcalls.network_test.NetworkTestResultReport;
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

/* compiled from: NetworkTestResultReport.kt */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/avito/avcalls/network_test/NetworkTestResultReport.$serializer", "Lkotlinx/serialization/internal/N;", "Lcom/avito/avcalls/network_test/NetworkTestResultReport;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/avito/avcalls/network_test/NetworkTestResultReport;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/avito/avcalls/network_test/NetworkTestResultReport;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes5.dex */
public final class NetworkTestResultReport$$serializer implements N<NetworkTestResultReport> {

    @Y61.k
    public static final NetworkTestResultReport$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        NetworkTestResultReport$$serializer networkTestResultReport$$serializer = new NetworkTestResultReport$$serializer();
        INSTANCE = networkTestResultReport$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.avito.avcalls.network_test.NetworkTestResultReport", networkTestResultReport$$serializer, 2);
        pluginGeneratedSerialDescriptor.j(Navigation.CONFIG, false);
        pluginGeneratedSerialDescriptor.j("packets", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private NetworkTestResultReport$$serializer() {
    }

    @Override // kotlinx.serialization.internal.N
    @Y61.k
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{NetworkTestResultReport$Config$$serializer.INSTANCE, NetworkTestResultReport$PacketsStat$$serializer.INSTANCE};
    }

    @Override // kotlinx.serialization.InterfaceC43386e
    @Y61.k
    public NetworkTestResultReport deserialize(@Y61.k Decoder decoder) {
        SerialDescriptor f332717a = getF332717a();
        kotlinx.serialization.encoding.c cVarC = decoder.c(f332717a);
        boolean z12 = true;
        int i12 = 0;
        NetworkTestResultReport.Config config = null;
        NetworkTestResultReport.PacketsStat packetsStat = null;
        while (z12) {
            int iJ2 = cVarC.j(f332717a);
            if (iJ2 == -1) {
                z12 = false;
            } else if (iJ2 == 0) {
                config = (NetworkTestResultReport.Config) cVarC.v(f332717a, 0, NetworkTestResultReport$Config$$serializer.INSTANCE, config);
                i12 |= 1;
            } else {
                if (iJ2 != 1) {
                    throw new UnknownFieldException(iJ2);
                }
                packetsStat = (NetworkTestResultReport.PacketsStat) cVarC.v(f332717a, 1, NetworkTestResultReport$PacketsStat$$serializer.INSTANCE, packetsStat);
                i12 |= 2;
            }
        }
        cVarC.d(f332717a);
        return new NetworkTestResultReport(i12, config, packetsStat, null);
    }

    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
    @Y61.k
    /* renamed from: getDescriptor */
    public SerialDescriptor getF332717a() {
        return descriptor;
    }

    @Override // kotlinx.serialization.x
    public void serialize(@Y61.k Encoder encoder, @Y61.k NetworkTestResultReport value) {
        SerialDescriptor f332717a = getF332717a();
        kotlinx.serialization.encoding.d dVarC = encoder.c(f332717a);
        NetworkTestResultReport.Companion companion = NetworkTestResultReport.INSTANCE;
        dVarC.F(f332717a, 0, NetworkTestResultReport$Config$$serializer.INSTANCE, value.f332961a);
        dVarC.F(f332717a, 1, NetworkTestResultReport$PacketsStat$$serializer.INSTANCE, value.f332962b);
        dVarC.d(f332717a);
    }

    @Override // kotlinx.serialization.internal.N
    @Y61.k
    public KSerializer<?>[] typeParametersSerializers() {
        return G0.f412773a;
    }
}
