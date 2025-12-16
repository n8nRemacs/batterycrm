package X51;

import kotlin.jvm.internal.L;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.G0;
import kotlinx.serialization.internal.N;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes8.dex */
public final class n implements N {

    /* renamed from: a, reason: collision with root package name */
    public static final n f18637a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f18638b;

    static {
        n nVar = new n();
        f18637a = nVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("sberid.sdk.config.domain.models.VersionSdkData", nVar, 1);
        pluginGeneratedSerialDescriptor.j("sdk_android_check", true);
        f18638b = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.N
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{a.f18597a};
    }

    @Override // kotlinx.serialization.InterfaceC43386e
    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f18638b;
        kotlinx.serialization.encoding.c cVarC = decoder.c(pluginGeneratedSerialDescriptor);
        c cVar = null;
        boolean z12 = true;
        int i12 = 0;
        while (z12) {
            int iJ2 = cVarC.j(pluginGeneratedSerialDescriptor);
            if (iJ2 == -1) {
                z12 = false;
            } else {
                if (iJ2 != 0) {
                    throw new UnknownFieldException(iJ2);
                }
                cVar = (c) cVarC.v(pluginGeneratedSerialDescriptor, 0, a.f18597a, cVar);
                i12 = 1;
            }
        }
        cVarC.d(pluginGeneratedSerialDescriptor);
        return new p(i12, cVar);
    }

    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
    /* renamed from: getDescriptor */
    public final SerialDescriptor getF412706c() {
        return f18638b;
    }

    @Override // kotlinx.serialization.x
    public final void serialize(Encoder encoder, Object obj) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f18638b;
        kotlinx.serialization.encoding.d dVarC = encoder.c(pluginGeneratedSerialDescriptor);
        boolean zU2 = dVarC.u();
        c cVar = ((p) obj).f18639a;
        if (zU2 || !L.f(cVar, new c())) {
            dVarC.F(pluginGeneratedSerialDescriptor, 0, a.f18597a, cVar);
        }
        dVarC.d(pluginGeneratedSerialDescriptor);
    }

    @Override // kotlinx.serialization.internal.N
    public final KSerializer[] typeParametersSerializers() {
        return G0.f412773a;
    }
}
