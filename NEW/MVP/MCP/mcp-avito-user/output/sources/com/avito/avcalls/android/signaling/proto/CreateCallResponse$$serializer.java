package com.avito.avcalls.android.signaling.proto;

import Y61.k;
import com.adjust.sdk.Constants;
import com.avito.avcalls.android.call.models.CallMetaInfo;
import com.avito.avcalls.android.signaling.proto.CreateCallResponse;
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
import kotlinx.serialization.internal.P0;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* compiled from: CreateCall.kt */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/avito/avcalls/android/signaling/proto/CreateCallResponse.$serializer", "Lkotlinx/serialization/internal/N;", "Lcom/avito/avcalls/android/signaling/proto/CreateCallResponse;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/avito/avcalls/android/signaling/proto/CreateCallResponse;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/avito/avcalls/android/signaling/proto/CreateCallResponse;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes5.dex */
public final class CreateCallResponse$$serializer implements N<CreateCallResponse> {

    @k
    public static final CreateCallResponse$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        CreateCallResponse$$serializer createCallResponse$$serializer = new CreateCallResponse$$serializer();
        INSTANCE = createCallResponse$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.avito.avcalls.android.signaling.proto.CreateCallResponse", createCallResponse$$serializer, 3);
        pluginGeneratedSerialDescriptor.j("iceConfig", true);
        pluginGeneratedSerialDescriptor.j("options", true);
        pluginGeneratedSerialDescriptor.j(Constants.REFERRER_API_META, false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CreateCallResponse$$serializer() {
    }

    @Override // kotlinx.serialization.internal.N
    @k
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{L51.a.a(IceConfig$$serializer.INSTANCE), L51.a.a(OptionsUpdate$$serializer.INSTANCE), CreateCallResponse.f332080d[2]};
    }

    @Override // kotlinx.serialization.InterfaceC43386e
    @k
    public CreateCallResponse deserialize(@k Decoder decoder) {
        SerialDescriptor f332717a = getF332717a();
        c cVarC = decoder.c(f332717a);
        KSerializer<Object>[] kSerializerArr = CreateCallResponse.f332080d;
        int i12 = 0;
        IceConfig iceConfig = null;
        OptionsUpdate optionsUpdate = null;
        CallMetaInfo callMetaInfo = null;
        boolean z12 = true;
        while (z12) {
            int iJ2 = cVarC.j(f332717a);
            if (iJ2 == -1) {
                z12 = false;
            } else if (iJ2 == 0) {
                iceConfig = (IceConfig) cVarC.f(f332717a, 0, IceConfig$$serializer.INSTANCE, iceConfig);
                i12 |= 1;
            } else if (iJ2 == 1) {
                optionsUpdate = (OptionsUpdate) cVarC.f(f332717a, 1, OptionsUpdate$$serializer.INSTANCE, optionsUpdate);
                i12 |= 2;
            } else {
                if (iJ2 != 2) {
                    throw new UnknownFieldException(iJ2);
                }
                callMetaInfo = (CallMetaInfo) cVarC.v(f332717a, 2, kSerializerArr[2], callMetaInfo);
                i12 |= 4;
            }
        }
        cVarC.d(f332717a);
        return new CreateCallResponse(i12, iceConfig, optionsUpdate, callMetaInfo, (P0) null);
    }

    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
    @k
    /* renamed from: getDescriptor */
    public SerialDescriptor getF332717a() {
        return descriptor;
    }

    @Override // kotlinx.serialization.x
    public void serialize(@k Encoder encoder, @k CreateCallResponse value) {
        SerialDescriptor f332717a = getF332717a();
        d dVarC = encoder.c(f332717a);
        CreateCallResponse.Companion companion = CreateCallResponse.INSTANCE;
        boolean zU2 = dVarC.u();
        IceConfig iceConfig = value.f332081a;
        if (zU2 || iceConfig != null) {
            dVarC.p(f332717a, 0, IceConfig$$serializer.INSTANCE, iceConfig);
        }
        boolean zU3 = dVarC.u();
        OptionsUpdate optionsUpdate = value.f332082b;
        if (zU3 || optionsUpdate != null) {
            dVarC.p(f332717a, 1, OptionsUpdate$$serializer.INSTANCE, optionsUpdate);
        }
        dVarC.F(f332717a, 2, CreateCallResponse.f332080d[2], value.f332083c);
        dVarC.d(f332717a);
    }

    @Override // kotlinx.serialization.internal.N
    @k
    public KSerializer<?>[] typeParametersSerializers() {
        return G0.f412773a;
    }
}
