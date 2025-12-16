package com.avito.avcalls.android.signaling.proto;

import Y61.k;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.huawei.hms.api.FailedBinderCallBack;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.c;
import kotlinx.serialization.encoding.d;
import kotlinx.serialization.internal.C43412k0;
import kotlinx.serialization.internal.G0;
import kotlinx.serialization.internal.N;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.V0;

/* compiled from: Ping.kt */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/avito/avcalls/android/signaling/proto/PingRequest.$serializer", "Lkotlinx/serialization/internal/N;", "Lcom/avito/avcalls/android/signaling/proto/PingRequest;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/avito/avcalls/android/signaling/proto/PingRequest;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/avito/avcalls/android/signaling/proto/PingRequest;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes5.dex */
public final class PingRequest$$serializer implements N<PingRequest> {

    @k
    public static final PingRequest$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        PingRequest$$serializer pingRequest$$serializer = new PingRequest$$serializer();
        INSTANCE = pingRequest$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.avito.avcalls.android.signaling.proto.PingRequest", pingRequest$$serializer, 3);
        pluginGeneratedSerialDescriptor.j("sqn", false);
        pluginGeneratedSerialDescriptor.j(FailedBinderCallBack.CALLER_ID, false);
        pluginGeneratedSerialDescriptor.j(InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PingRequest$$serializer() {
    }

    @Override // kotlinx.serialization.internal.N
    @k
    public KSerializer<?>[] childSerializers() {
        V0 v02 = V0.f412822a;
        return new KSerializer[]{C43412k0.f412877a, v02, v02};
    }

    @Override // kotlinx.serialization.InterfaceC43386e
    @k
    public PingRequest deserialize(@k Decoder decoder) {
        SerialDescriptor f412706c = getF412706c();
        c cVarC = decoder.c(f412706c);
        int i12 = 0;
        long jP2 = 0;
        String strS = null;
        String strS2 = null;
        boolean z12 = true;
        while (z12) {
            int iJ2 = cVarC.j(f412706c);
            if (iJ2 == -1) {
                z12 = false;
            } else if (iJ2 == 0) {
                jP2 = cVarC.p(f412706c, 0);
                i12 |= 1;
            } else if (iJ2 == 1) {
                strS = cVarC.s(f412706c, 1);
                i12 |= 2;
            } else {
                if (iJ2 != 2) {
                    throw new UnknownFieldException(iJ2);
                }
                strS2 = cVarC.s(f412706c, 2);
                i12 |= 4;
            }
        }
        cVarC.d(f412706c);
        return new PingRequest(i12, jP2, strS, strS2, null);
    }

    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
    @k
    /* renamed from: getDescriptor */
    public SerialDescriptor getF412706c() {
        return descriptor;
    }

    @Override // kotlinx.serialization.x
    public void serialize(@k Encoder encoder, @k PingRequest value) {
        SerialDescriptor f412706c = getF412706c();
        d dVarC = encoder.c(f412706c);
        dVarC.o(f412706c, 0, value.f332121a);
        dVarC.l(f412706c, 1, value.f332122b);
        dVarC.l(f412706c, 2, value.f332123c);
        dVarC.d(f412706c);
    }

    @Override // kotlinx.serialization.internal.N
    @k
    public KSerializer<?>[] typeParametersSerializers() {
        return G0.f412773a;
    }
}
