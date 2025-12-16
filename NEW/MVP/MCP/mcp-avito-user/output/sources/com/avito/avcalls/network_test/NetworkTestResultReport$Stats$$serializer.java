package com.avito.avcalls.network_test;

import com.avito.avcalls.network_test.NetworkTestResultReport;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.F;
import kotlinx.serialization.internal.G0;
import kotlinx.serialization.internal.N;
import kotlinx.serialization.internal.P0;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.Y;

/* compiled from: NetworkTestResultReport.kt */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/avito/avcalls/network_test/NetworkTestResultReport.Stats.$serializer", "Lkotlinx/serialization/internal/N;", "Lcom/avito/avcalls/network_test/NetworkTestResultReport$Stats;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/avito/avcalls/network_test/NetworkTestResultReport$Stats;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/avito/avcalls/network_test/NetworkTestResultReport$Stats;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes5.dex */
public final class NetworkTestResultReport$Stats$$serializer implements N<NetworkTestResultReport.Stats> {

    @Y61.k
    public static final NetworkTestResultReport$Stats$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        NetworkTestResultReport$Stats$$serializer networkTestResultReport$Stats$$serializer = new NetworkTestResultReport$Stats$$serializer();
        INSTANCE = networkTestResultReport$Stats$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.avito.avcalls.network_test.NetworkTestResultReport.Stats", networkTestResultReport$Stats$$serializer, 7);
        pluginGeneratedSerialDescriptor.j("count", false);
        pluginGeneratedSerialDescriptor.j("max", true);
        pluginGeneratedSerialDescriptor.j("min", true);
        pluginGeneratedSerialDescriptor.j("avg", true);
        pluginGeneratedSerialDescriptor.j("p99", true);
        pluginGeneratedSerialDescriptor.j("p90", true);
        pluginGeneratedSerialDescriptor.j("p50", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private NetworkTestResultReport$Stats$$serializer() {
    }

    @Override // kotlinx.serialization.internal.N
    @Y61.k
    public KSerializer<?>[] childSerializers() {
        F f12 = F.f412769a;
        return new KSerializer[]{Y.f412835a, L51.a.a(f12), L51.a.a(f12), L51.a.a(f12), L51.a.a(f12), L51.a.a(f12), L51.a.a(f12)};
    }

    @Override // kotlinx.serialization.InterfaceC43386e
    @Y61.k
    public NetworkTestResultReport.Stats deserialize(@Y61.k Decoder decoder) {
        SerialDescriptor f412706c = getF412706c();
        kotlinx.serialization.encoding.c cVarC = decoder.c(f412706c);
        int i12 = 0;
        int iQ2 = 0;
        Double d12 = null;
        Double d13 = null;
        Double d14 = null;
        Double d15 = null;
        Double d16 = null;
        Double d17 = null;
        boolean z12 = true;
        while (z12) {
            int iJ2 = cVarC.j(f412706c);
            switch (iJ2) {
                case -1:
                    z12 = false;
                    break;
                case 0:
                    iQ2 = cVarC.q(f412706c, 0);
                    i12 |= 1;
                    break;
                case 1:
                    d12 = (Double) cVarC.f(f412706c, 1, F.f412769a, d12);
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
                    d16 = (Double) cVarC.f(f412706c, 5, F.f412769a, d16);
                    i12 |= 32;
                    break;
                case 6:
                    d17 = (Double) cVarC.f(f412706c, 6, F.f412769a, d17);
                    i12 |= 64;
                    break;
                default:
                    throw new UnknownFieldException(iJ2);
            }
        }
        cVarC.d(f412706c);
        return new NetworkTestResultReport.Stats(i12, iQ2, d12, d13, d14, d15, d16, d17, (P0) null);
    }

    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
    @Y61.k
    /* renamed from: getDescriptor */
    public SerialDescriptor getF412706c() {
        return descriptor;
    }

    @Override // kotlinx.serialization.x
    public void serialize(@Y61.k Encoder encoder, @Y61.k NetworkTestResultReport.Stats value) {
        SerialDescriptor f412706c = getF412706c();
        kotlinx.serialization.encoding.d dVarC = encoder.c(f412706c);
        dVarC.D(0, value.f332976a, f412706c);
        boolean zU2 = dVarC.u();
        Double d12 = value.f332977b;
        if (zU2 || d12 != null) {
            dVarC.p(f412706c, 1, F.f412769a, d12);
        }
        boolean zU3 = dVarC.u();
        Double d13 = value.f332978c;
        if (zU3 || d13 != null) {
            dVarC.p(f412706c, 2, F.f412769a, d13);
        }
        boolean zU4 = dVarC.u();
        Double d14 = value.f332979d;
        if (zU4 || d14 != null) {
            dVarC.p(f412706c, 3, F.f412769a, d14);
        }
        boolean zU5 = dVarC.u();
        Double d15 = value.f332980e;
        if (zU5 || d15 != null) {
            dVarC.p(f412706c, 4, F.f412769a, d15);
        }
        boolean zU6 = dVarC.u();
        Double d16 = value.f332981f;
        if (zU6 || d16 != null) {
            dVarC.p(f412706c, 5, F.f412769a, d16);
        }
        boolean zU7 = dVarC.u();
        Double d17 = value.f332982g;
        if (zU7 || d17 != null) {
            dVarC.p(f412706c, 6, F.f412769a, d17);
        }
        dVarC.d(f412706c);
    }

    @Override // kotlinx.serialization.internal.N
    @Y61.k
    public KSerializer<?>[] typeParametersSerializers() {
        return G0.f412773a;
    }
}
