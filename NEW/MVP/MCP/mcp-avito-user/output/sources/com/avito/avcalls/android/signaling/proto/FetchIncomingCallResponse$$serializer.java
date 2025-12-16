package com.avito.avcalls.android.signaling.proto;

import Y61.k;
import com.adjust.sdk.Constants;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.avcalls.android.call.models.CallMetaInfo;
import com.avito.avcalls.android.signaling.proto.FetchIncomingCallResponse;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.c;
import kotlinx.serialization.encoding.d;
import kotlinx.serialization.internal.G0;
import kotlinx.serialization.internal.N;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.V0;

/* compiled from: FetchIncomingCall.kt */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/avito/avcalls/android/signaling/proto/FetchIncomingCallResponse.$serializer", "Lkotlinx/serialization/internal/N;", "Lcom/avito/avcalls/android/signaling/proto/FetchIncomingCallResponse;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/avito/avcalls/android/signaling/proto/FetchIncomingCallResponse;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/avito/avcalls/android/signaling/proto/FetchIncomingCallResponse;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes5.dex */
public final class FetchIncomingCallResponse$$serializer implements N<FetchIncomingCallResponse> {

    @k
    public static final FetchIncomingCallResponse$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        FetchIncomingCallResponse$$serializer fetchIncomingCallResponse$$serializer = new FetchIncomingCallResponse$$serializer();
        INSTANCE = fetchIncomingCallResponse$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.avito.avcalls.android.signaling.proto.FetchIncomingCallResponse", fetchIncomingCallResponse$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("iceConfig", false);
        pluginGeneratedSerialDescriptor.j("msg", false);
        pluginGeneratedSerialDescriptor.j(InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, false);
        pluginGeneratedSerialDescriptor.j(Constants.REFERRER_API_META, false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private FetchIncomingCallResponse$$serializer() {
    }

    @Override // kotlinx.serialization.internal.N
    @k
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{IceConfig$$serializer.INSTANCE, VoipMessage$$serializer.INSTANCE, V0.f412822a, FetchIncomingCallResponse.f332092e[3]};
    }

    @Override // kotlinx.serialization.InterfaceC43386e
    @k
    public FetchIncomingCallResponse deserialize(@k Decoder decoder) {
        SerialDescriptor f332717a = getF332717a();
        c cVarC = decoder.c(f332717a);
        KSerializer<Object>[] kSerializerArr = FetchIncomingCallResponse.f332092e;
        int i12 = 0;
        IceConfig iceConfig = null;
        VoipMessage voipMessage = null;
        String strS = null;
        CallMetaInfo callMetaInfo = null;
        boolean z12 = true;
        while (z12) {
            int iJ2 = cVarC.j(f332717a);
            if (iJ2 == -1) {
                z12 = false;
            } else if (iJ2 == 0) {
                iceConfig = (IceConfig) cVarC.v(f332717a, 0, IceConfig$$serializer.INSTANCE, iceConfig);
                i12 |= 1;
            } else if (iJ2 == 1) {
                voipMessage = (VoipMessage) cVarC.v(f332717a, 1, VoipMessage$$serializer.INSTANCE, voipMessage);
                i12 |= 2;
            } else if (iJ2 == 2) {
                strS = cVarC.s(f332717a, 2);
                i12 |= 4;
            } else {
                if (iJ2 != 3) {
                    throw new UnknownFieldException(iJ2);
                }
                callMetaInfo = (CallMetaInfo) cVarC.v(f332717a, 3, kSerializerArr[3], callMetaInfo);
                i12 |= 8;
            }
        }
        cVarC.d(f332717a);
        return new FetchIncomingCallResponse(i12, iceConfig, voipMessage, strS, callMetaInfo, null);
    }

    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
    @k
    /* renamed from: getDescriptor */
    public SerialDescriptor getF332717a() {
        return descriptor;
    }

    @Override // kotlinx.serialization.x
    public void serialize(@k Encoder encoder, @k FetchIncomingCallResponse value) {
        SerialDescriptor f332717a = getF332717a();
        d dVarC = encoder.c(f332717a);
        FetchIncomingCallResponse.Companion companion = FetchIncomingCallResponse.INSTANCE;
        dVarC.F(f332717a, 0, IceConfig$$serializer.INSTANCE, value.f332093a);
        dVarC.F(f332717a, 1, VoipMessage$$serializer.INSTANCE, value.f332094b);
        dVarC.l(f332717a, 2, value.f332095c);
        dVarC.F(f332717a, 3, FetchIncomingCallResponse.f332092e[3], value.f332096d);
        dVarC.d(f332717a);
    }

    @Override // kotlinx.serialization.internal.N
    @k
    public KSerializer<?>[] typeParametersSerializers() {
        return G0.f412773a;
    }
}
