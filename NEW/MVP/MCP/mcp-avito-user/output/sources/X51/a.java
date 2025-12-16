package X51;

import com.avito.android.remote.model.category_parameters.ConstraintKt;
import java.util.Set;
import kotlin.collections.B0;
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
public final class a implements N {

    /* renamed from: a, reason: collision with root package name */
    public static final a f18597a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f18598b;

    static {
        a aVar = new a();
        f18597a = aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("sberid.sdk.config.domain.models.AndroidVersionSdkData", aVar, 3);
        pluginGeneratedSerialDescriptor.j("current", true);
        pluginGeneratedSerialDescriptor.j(ConstraintKt.WARNING, true);
        pluginGeneratedSerialDescriptor.j("error", true);
        f18598b = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.N
    public final KSerializer[] childSerializers() {
        KSerializer kSerializer = c.f18599d[2];
        V0 v02 = V0.f412822a;
        return new KSerializer[]{v02, v02, kSerializer};
    }

    @Override // kotlinx.serialization.InterfaceC43386e
    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f18598b;
        kotlinx.serialization.encoding.c cVarC = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = c.f18599d;
        String strS = null;
        boolean z12 = true;
        int i12 = 0;
        String strS2 = null;
        Set set = null;
        while (z12) {
            int iJ2 = cVarC.j(pluginGeneratedSerialDescriptor);
            if (iJ2 == -1) {
                z12 = false;
            } else if (iJ2 == 0) {
                strS = cVarC.s(pluginGeneratedSerialDescriptor, 0);
                i12 |= 1;
            } else if (iJ2 == 1) {
                strS2 = cVarC.s(pluginGeneratedSerialDescriptor, 1);
                i12 |= 2;
            } else {
                if (iJ2 != 2) {
                    throw new UnknownFieldException(iJ2);
                }
                set = (Set) cVarC.v(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2], set);
                i12 |= 4;
            }
        }
        cVarC.d(pluginGeneratedSerialDescriptor);
        return new c(i12, strS, strS2, set);
    }

    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
    /* renamed from: getDescriptor */
    public final SerialDescriptor getF412706c() {
        return f18598b;
    }

    @Override // kotlinx.serialization.x
    public final void serialize(Encoder encoder, Object obj) {
        c cVar = (c) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f18598b;
        kotlinx.serialization.encoding.d dVarC = encoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = c.f18599d;
        boolean zU2 = dVarC.u();
        String str = cVar.f18600a;
        if (zU2 || !L.f(str, "")) {
            dVarC.l(pluginGeneratedSerialDescriptor, 0, str);
        }
        boolean zU3 = dVarC.u();
        String str2 = cVar.f18601b;
        if (zU3 || !L.f(str2, "")) {
            dVarC.l(pluginGeneratedSerialDescriptor, 1, str2);
        }
        boolean zU4 = dVarC.u();
        Set set = cVar.f18602c;
        if (zU4 || !L.f(set, B0.f406639b)) {
            dVarC.F(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2], set);
        }
        dVarC.d(pluginGeneratedSerialDescriptor);
    }

    @Override // kotlinx.serialization.internal.N
    public final KSerializer[] typeParametersSerializers() {
        return G0.f412773a;
    }
}
