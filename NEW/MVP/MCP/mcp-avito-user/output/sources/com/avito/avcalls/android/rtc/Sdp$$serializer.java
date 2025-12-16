package com.avito.avcalls.android.rtc;

import com.avito.avcalls.android.rtc.Sdp;
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
import kotlinx.serialization.internal.V0;

/* compiled from: Sdp.kt */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/avito/avcalls/android/rtc/Sdp.$serializer", "Lkotlinx/serialization/internal/N;", "Lcom/avito/avcalls/android/rtc/Sdp;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/avito/avcalls/android/rtc/Sdp;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/avito/avcalls/android/rtc/Sdp;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes5.dex */
public final class Sdp$$serializer implements N<Sdp> {

    @Y61.k
    public static final Sdp$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        Sdp$$serializer sdp$$serializer = new Sdp$$serializer();
        INSTANCE = sdp$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.avito.avcalls.android.rtc.Sdp", sdp$$serializer, 2);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j("text", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Sdp$$serializer() {
    }

    @Override // kotlinx.serialization.internal.N
    @Y61.k
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{Sdp$Type$$serializer.INSTANCE, V0.f412822a};
    }

    @Override // kotlinx.serialization.InterfaceC43386e
    @Y61.k
    public Sdp deserialize(@Y61.k Decoder decoder) {
        SerialDescriptor f412706c = getF412706c();
        kotlinx.serialization.encoding.c cVarC = decoder.c(f412706c);
        boolean z12 = true;
        int i12 = 0;
        Sdp.Type type = null;
        String strS = null;
        while (z12) {
            int iJ2 = cVarC.j(f412706c);
            if (iJ2 == -1) {
                z12 = false;
            } else if (iJ2 == 0) {
                type = (Sdp.Type) cVarC.v(f412706c, 0, Sdp$Type$$serializer.INSTANCE, type);
                i12 |= 1;
            } else {
                if (iJ2 != 1) {
                    throw new UnknownFieldException(iJ2);
                }
                strS = cVarC.s(f412706c, 1);
                i12 |= 2;
            }
        }
        cVarC.d(f412706c);
        return new Sdp(i12, type, strS, null);
    }

    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
    @Y61.k
    /* renamed from: getDescriptor */
    public SerialDescriptor getF412706c() {
        return descriptor;
    }

    @Override // kotlinx.serialization.x
    public void serialize(@Y61.k Encoder encoder, @Y61.k Sdp value) {
        SerialDescriptor f412706c = getF412706c();
        kotlinx.serialization.encoding.d dVarC = encoder.c(f412706c);
        Sdp.Companion companion = Sdp.INSTANCE;
        dVarC.F(f412706c, 0, Sdp$Type$$serializer.INSTANCE, value.f331883a);
        dVarC.l(f412706c, 1, value.f331884b);
        dVarC.d(f412706c);
    }

    @Override // kotlinx.serialization.internal.N
    @Y61.k
    public KSerializer<?>[] typeParametersSerializers() {
        return G0.f412773a;
    }
}
