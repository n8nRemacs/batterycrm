package com.avito.avcalls.signaling.proto;

import Y61.k;
import com.avito.avcalls.rtc.connecting.IceCandidate;
import com.avito.avcalls.rtc.connecting.Sdp;
import com.avito.avcalls.rtc.connecting.Sdp$$serializer;
import com.avito.avcalls.signaling.proto.VoipMessage;
import java.util.List;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.c;
import kotlinx.serialization.encoding.d;
import kotlinx.serialization.internal.C43407i;
import kotlinx.serialization.internal.G0;
import kotlinx.serialization.internal.N;
import kotlinx.serialization.internal.P0;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.V0;

/* compiled from: VoipMessage.kt */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/avito/avcalls/signaling/proto/VoipMessage.$serializer", "Lkotlinx/serialization/internal/N;", "Lcom/avito/avcalls/signaling/proto/VoipMessage;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/avito/avcalls/signaling/proto/VoipMessage;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/avito/avcalls/signaling/proto/VoipMessage;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes5.dex */
public final class VoipMessage$$serializer implements N<VoipMessage> {

    @k
    public static final VoipMessage$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        VoipMessage$$serializer voipMessage$$serializer = new VoipMessage$$serializer();
        INSTANCE = voipMessage$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.avito.avcalls.signaling.proto.VoipMessage", voipMessage$$serializer, 7);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j("sdp", true);
        pluginGeneratedSerialDescriptor.j("candidates", true);
        pluginGeneratedSerialDescriptor.j("mediaSender", true);
        pluginGeneratedSerialDescriptor.j("reason", true);
        pluginGeneratedSerialDescriptor.j("fastConnect", true);
        pluginGeneratedSerialDescriptor.j("optionsUpdate", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private VoipMessage$$serializer() {
    }

    @Override // kotlinx.serialization.internal.N
    @k
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = VoipMessage.f333346h;
        return new KSerializer[]{kSerializerArr[0], L51.a.a(Sdp$$serializer.INSTANCE), kSerializerArr[2], L51.a.a(VoipMessage$MediaSender$$serializer.INSTANCE), V0.f412822a, C43407i.f412866a, L51.a.a(OptionsUpdate$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.InterfaceC43386e
    @k
    public VoipMessage deserialize(@k Decoder decoder) {
        SerialDescriptor f412706c = getF332717a();
        c cVarC = decoder.c(f412706c);
        KSerializer<Object>[] kSerializerArr = VoipMessage.f333346h;
        int i12 = 0;
        boolean zD2 = false;
        VoipMessage.MessageType messageType = null;
        Sdp sdp = null;
        List list = null;
        VoipMessage.MediaSender mediaSender = null;
        String strS = null;
        OptionsUpdate optionsUpdate = null;
        boolean z12 = true;
        while (z12) {
            int iJ2 = cVarC.j(f412706c);
            switch (iJ2) {
                case -1:
                    z12 = false;
                    break;
                case 0:
                    messageType = (VoipMessage.MessageType) cVarC.v(f412706c, 0, kSerializerArr[0], messageType);
                    i12 |= 1;
                    break;
                case 1:
                    sdp = (Sdp) cVarC.f(f412706c, 1, Sdp$$serializer.INSTANCE, sdp);
                    i12 |= 2;
                    break;
                case 2:
                    list = (List) cVarC.v(f412706c, 2, kSerializerArr[2], list);
                    i12 |= 4;
                    break;
                case 3:
                    mediaSender = (VoipMessage.MediaSender) cVarC.f(f412706c, 3, VoipMessage$MediaSender$$serializer.INSTANCE, mediaSender);
                    i12 |= 8;
                    break;
                case 4:
                    strS = cVarC.s(f412706c, 4);
                    i12 |= 16;
                    break;
                case 5:
                    zD2 = cVarC.D(f412706c, 5);
                    i12 |= 32;
                    break;
                case 6:
                    optionsUpdate = (OptionsUpdate) cVarC.f(f412706c, 6, OptionsUpdate$$serializer.INSTANCE, optionsUpdate);
                    i12 |= 64;
                    break;
                default:
                    throw new UnknownFieldException(iJ2);
            }
        }
        cVarC.d(f412706c);
        return new VoipMessage(i12, messageType, sdp, list, mediaSender, strS, zD2, optionsUpdate, (P0) null);
    }

    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
    @k
    /* renamed from: getDescriptor */
    public SerialDescriptor getF332717a() {
        return descriptor;
    }

    @Override // kotlinx.serialization.x
    public void serialize(@k Encoder encoder, @k VoipMessage value) {
        SerialDescriptor f412706c = getF332717a();
        d dVarC = encoder.c(f412706c);
        KSerializer<Object>[] kSerializerArr = VoipMessage.f333346h;
        dVarC.F(f412706c, 0, kSerializerArr[0], value.f333347a);
        boolean zU2 = dVarC.u();
        Sdp sdp = value.f333348b;
        if (zU2 || sdp != null) {
            dVarC.p(f412706c, 1, Sdp$$serializer.INSTANCE, sdp);
        }
        boolean zU3 = dVarC.u();
        List<IceCandidate> list = value.f333349c;
        if (zU3 || !L.f(list, C42784z0.f406748b)) {
            dVarC.F(f412706c, 2, kSerializerArr[2], list);
        }
        boolean zU4 = dVarC.u();
        VoipMessage.MediaSender mediaSender = value.f333350d;
        if (zU4 || mediaSender != null) {
            dVarC.p(f412706c, 3, VoipMessage$MediaSender$$serializer.INSTANCE, mediaSender);
        }
        boolean zU5 = dVarC.u();
        String str = value.f333351e;
        if (zU5 || !L.f(str, "")) {
            dVarC.l(f412706c, 4, str);
        }
        boolean zU6 = dVarC.u();
        boolean z12 = value.f333352f;
        if (zU6 || z12) {
            dVarC.k(f412706c, 5, z12);
        }
        boolean zU7 = dVarC.u();
        OptionsUpdate optionsUpdate = value.f333353g;
        if (zU7 || optionsUpdate != null) {
            dVarC.p(f412706c, 6, OptionsUpdate$$serializer.INSTANCE, optionsUpdate);
        }
        dVarC.d(f412706c);
    }

    @Override // kotlinx.serialization.internal.N
    @k
    public KSerializer<?>[] typeParametersSerializers() {
        return G0.f412773a;
    }
}
