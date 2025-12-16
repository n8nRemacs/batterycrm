package mc1;

import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
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

/* renamed from: mc1.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C44053a implements N {

    /* renamed from: a, reason: collision with root package name */
    public static final C44053a f414640a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f414641b;

    static {
        C44053a c44053a = new C44053a();
        f414640a = c44053a;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("sberid.sdk.elk.data.models.requests.WidgetRequest", c44053a, 1);
        pluginGeneratedSerialDescriptor.j(ContextActionHandler.Link.URL, false);
        f414641b = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.N
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{V0.f412822a};
    }

    @Override // kotlinx.serialization.InterfaceC43386e
    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f414641b;
        c cVarC = decoder.c(pluginGeneratedSerialDescriptor);
        boolean z12 = true;
        int i12 = 0;
        String strS = null;
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
        return new Wb1.a(i12, strS, null);
    }

    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
    /* renamed from: getDescriptor */
    public final SerialDescriptor getF412706c() {
        return f414641b;
    }

    @Override // kotlinx.serialization.x
    public final void serialize(Encoder encoder, Object obj) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f414641b;
        d dVarC = encoder.c(pluginGeneratedSerialDescriptor);
        dVarC.l(pluginGeneratedSerialDescriptor, 0, ((Wb1.a) obj).url);
        dVarC.d(pluginGeneratedSerialDescriptor);
    }

    @Override // kotlinx.serialization.internal.N
    public final KSerializer[] typeParametersSerializers() {
        return G0.f412773a;
    }
}
