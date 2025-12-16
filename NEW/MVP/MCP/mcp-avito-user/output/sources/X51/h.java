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
import kotlinx.serialization.internal.V0;

/* loaded from: classes8.dex */
public final class h implements N {

    /* renamed from: a, reason: collision with root package name */
    public static final h f18627a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f18628b;

    static {
        h hVar = new h();
        f18627a = hVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("sberid.sdk.config.domain.models.Defaults", hVar, 1);
        pluginGeneratedSerialDescriptor.j("ssoOpenIn", true);
        f18628b = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.N
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{V0.f412822a};
    }

    @Override // kotlinx.serialization.InterfaceC43386e
    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f18628b;
        kotlinx.serialization.encoding.c cVarC = decoder.c(pluginGeneratedSerialDescriptor);
        String strS = null;
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
                strS = cVarC.s(pluginGeneratedSerialDescriptor, 0);
                i12 = 1;
            }
        }
        cVarC.d(pluginGeneratedSerialDescriptor);
        return new j(i12, strS);
    }

    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
    /* renamed from: getDescriptor */
    public final SerialDescriptor getF412706c() {
        return f18628b;
    }

    @Override // kotlinx.serialization.x
    public final void serialize(Encoder encoder, Object obj) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f18628b;
        kotlinx.serialization.encoding.d dVarC = encoder.c(pluginGeneratedSerialDescriptor);
        boolean zU2 = dVarC.u();
        String str = ((j) obj).f18629a;
        if (zU2 || !L.f(str, "browser")) {
            dVarC.l(pluginGeneratedSerialDescriptor, 0, str);
        }
        dVarC.d(pluginGeneratedSerialDescriptor);
    }

    @Override // kotlinx.serialization.internal.N
    public final KSerializer[] typeParametersSerializers() {
        return G0.f412773a;
    }
}
