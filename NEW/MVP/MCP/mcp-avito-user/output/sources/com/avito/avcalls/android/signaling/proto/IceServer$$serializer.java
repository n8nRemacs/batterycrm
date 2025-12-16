package com.avito.avcalls.android.signaling.proto;

import Y61.k;
import java.util.List;
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
import kotlinx.serialization.internal.V0;

/* compiled from: IceConfig.kt */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/avito/avcalls/android/signaling/proto/IceServer.$serializer", "Lkotlinx/serialization/internal/N;", "Lcom/avito/avcalls/android/signaling/proto/IceServer;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/avito/avcalls/android/signaling/proto/IceServer;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/avito/avcalls/android/signaling/proto/IceServer;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes5.dex */
public final class IceServer$$serializer implements N<IceServer> {

    @k
    public static final IceServer$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        IceServer$$serializer iceServer$$serializer = new IceServer$$serializer();
        INSTANCE = iceServer$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.avito.avcalls.android.signaling.proto.IceServer", iceServer$$serializer, 3);
        pluginGeneratedSerialDescriptor.j("urls", false);
        pluginGeneratedSerialDescriptor.j("credential", true);
        pluginGeneratedSerialDescriptor.j("username", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private IceServer$$serializer() {
    }

    @Override // kotlinx.serialization.internal.N
    @k
    public KSerializer<?>[] childSerializers() {
        KSerializer<?> kSerializer = IceServer.f332099d[0];
        V0 v02 = V0.f412822a;
        return new KSerializer[]{kSerializer, L51.a.a(v02), L51.a.a(v02)};
    }

    @Override // kotlinx.serialization.InterfaceC43386e
    @k
    public IceServer deserialize(@k Decoder decoder) {
        SerialDescriptor f412706c = getF412706c();
        c cVarC = decoder.c(f412706c);
        KSerializer<Object>[] kSerializerArr = IceServer.f332099d;
        int i12 = 0;
        List list = null;
        String str = null;
        String str2 = null;
        boolean z12 = true;
        while (z12) {
            int iJ2 = cVarC.j(f412706c);
            if (iJ2 == -1) {
                z12 = false;
            } else if (iJ2 == 0) {
                list = (List) cVarC.v(f412706c, 0, kSerializerArr[0], list);
                i12 |= 1;
            } else if (iJ2 == 1) {
                str = (String) cVarC.f(f412706c, 1, V0.f412822a, str);
                i12 |= 2;
            } else {
                if (iJ2 != 2) {
                    throw new UnknownFieldException(iJ2);
                }
                str2 = (String) cVarC.f(f412706c, 2, V0.f412822a, str2);
                i12 |= 4;
            }
        }
        cVarC.d(f412706c);
        return new IceServer(i12, list, str, str2, (P0) null);
    }

    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
    @k
    /* renamed from: getDescriptor */
    public SerialDescriptor getF412706c() {
        return descriptor;
    }

    @Override // kotlinx.serialization.x
    public void serialize(@k Encoder encoder, @k IceServer value) {
        SerialDescriptor f412706c = getF412706c();
        d dVarC = encoder.c(f412706c);
        dVarC.F(f412706c, 0, IceServer.f332099d[0], value.f332100a);
        boolean zU2 = dVarC.u();
        String str = value.f332101b;
        if (zU2 || str != null) {
            dVarC.p(f412706c, 1, V0.f412822a, str);
        }
        boolean zU3 = dVarC.u();
        String str2 = value.f332102c;
        if (zU3 || str2 != null) {
            dVarC.p(f412706c, 2, V0.f412822a, str2);
        }
        dVarC.d(f412706c);
    }

    @Override // kotlinx.serialization.internal.N
    @k
    public KSerializer<?>[] typeParametersSerializers() {
        return G0.f412773a;
    }
}
