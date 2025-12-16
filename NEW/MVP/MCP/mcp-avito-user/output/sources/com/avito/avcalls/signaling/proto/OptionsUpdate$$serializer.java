package com.avito.avcalls.signaling.proto;

import Y61.k;
import com.avito.avcalls.signaling.proto.OptionsUpdate;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
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
import kotlinx.serialization.internal.Y;

/* compiled from: OptionsUpdate.kt */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/avito/avcalls/signaling/proto/OptionsUpdate.$serializer", "Lkotlinx/serialization/internal/N;", "Lcom/avito/avcalls/signaling/proto/OptionsUpdate;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/avito/avcalls/signaling/proto/OptionsUpdate;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/avito/avcalls/signaling/proto/OptionsUpdate;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes5.dex */
public final class OptionsUpdate$$serializer implements N<OptionsUpdate> {

    @k
    public static final OptionsUpdate$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        OptionsUpdate$$serializer optionsUpdate$$serializer = new OptionsUpdate$$serializer();
        INSTANCE = optionsUpdate$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.avito.avcalls.signaling.proto.OptionsUpdate", optionsUpdate$$serializer, 3);
        pluginGeneratedSerialDescriptor.j("videoTxAllowed", true);
        pluginGeneratedSerialDescriptor.j("defaultCamera", true);
        pluginGeneratedSerialDescriptor.j("defaultCameraEnabled", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private OptionsUpdate$$serializer() {
    }

    @Override // kotlinx.serialization.internal.N
    @k
    public KSerializer<?>[] childSerializers() {
        C43407i c43407i = C43407i.f412866a;
        return new KSerializer[]{L51.a.a(c43407i), L51.a.a(Y.f412835a), L51.a.a(c43407i)};
    }

    @Override // kotlinx.serialization.InterfaceC43386e
    @k
    public OptionsUpdate deserialize(@k Decoder decoder) {
        SerialDescriptor f412706c = getF412706c();
        c cVarC = decoder.c(f412706c);
        int i12 = 0;
        Boolean bool = null;
        Integer num = null;
        Boolean bool2 = null;
        boolean z12 = true;
        while (z12) {
            int iJ2 = cVarC.j(f412706c);
            if (iJ2 == -1) {
                z12 = false;
            } else if (iJ2 == 0) {
                bool = (Boolean) cVarC.f(f412706c, 0, C43407i.f412866a, bool);
                i12 |= 1;
            } else if (iJ2 == 1) {
                num = (Integer) cVarC.f(f412706c, 1, Y.f412835a, num);
                i12 |= 2;
            } else {
                if (iJ2 != 2) {
                    throw new UnknownFieldException(iJ2);
                }
                bool2 = (Boolean) cVarC.f(f412706c, 2, C43407i.f412866a, bool2);
                i12 |= 4;
            }
        }
        cVarC.d(f412706c);
        return new OptionsUpdate(i12, bool, num, bool2, (P0) null);
    }

    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
    @k
    /* renamed from: getDescriptor */
    public SerialDescriptor getF412706c() {
        return descriptor;
    }

    @Override // kotlinx.serialization.x
    public void serialize(@k Encoder encoder, @k OptionsUpdate value) {
        SerialDescriptor f412706c = getF412706c();
        d dVarC = encoder.c(f412706c);
        OptionsUpdate.Companion companion = OptionsUpdate.INSTANCE;
        boolean zU2 = dVarC.u();
        Boolean bool = value.f333336a;
        if (zU2 || bool != null) {
            dVarC.p(f412706c, 0, C43407i.f412866a, bool);
        }
        boolean zU3 = dVarC.u();
        Integer num = value.f333337b;
        if (zU3 || num != null) {
            dVarC.p(f412706c, 1, Y.f412835a, num);
        }
        boolean zU4 = dVarC.u();
        Boolean bool2 = value.f333338c;
        if (zU4 || bool2 != null) {
            dVarC.p(f412706c, 2, C43407i.f412866a, bool2);
        }
        dVarC.d(f412706c);
    }

    @Override // kotlinx.serialization.internal.N
    @k
    public KSerializer<?>[] typeParametersSerializers() {
        return G0.f412773a;
    }
}
