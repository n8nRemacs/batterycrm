package lc1;

import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.C43412k0;
import kotlinx.serialization.internal.G0;
import kotlinx.serialization.internal.N;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.V0;
import sberid.sdk.app_token.domain.models.models.TypeAuth;

/* renamed from: lc1.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C43728a implements N {

    /* renamed from: a, reason: collision with root package name */
    public static final C43728a f413943a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f413944b;

    static {
        C43728a c43728a = new C43728a();
        f413943a = c43728a;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("sberid.sdk.app_token.domain.models.models.AppTokenModel", c43728a, 5);
        pluginGeneratedSerialDescriptor.j("code", false);
        pluginGeneratedSerialDescriptor.j(VoiceInfo.STATE, false);
        pluginGeneratedSerialDescriptor.j("token", false);
        pluginGeneratedSerialDescriptor.j("createTime", false);
        pluginGeneratedSerialDescriptor.j("typeAuth", false);
        f413944b = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.N
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerA = L51.a.a(Kb1.b.f9537a[4]);
        V0 v02 = V0.f412822a;
        return new KSerializer[]{v02, v02, v02, C43412k0.f412877a, kSerializerA};
    }

    @Override // kotlinx.serialization.InterfaceC43386e
    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f413944b;
        kotlinx.serialization.encoding.c cVarC = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer<Object>[] kSerializerArr = Kb1.b.f9537a;
        int i12 = 0;
        String strS = null;
        String strS2 = null;
        String strS3 = null;
        TypeAuth typeAuth = null;
        long jP2 = 0;
        boolean z12 = true;
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
            } else if (iJ2 == 2) {
                strS3 = cVarC.s(pluginGeneratedSerialDescriptor, 2);
                i12 |= 4;
            } else if (iJ2 == 3) {
                jP2 = cVarC.p(pluginGeneratedSerialDescriptor, 3);
                i12 |= 8;
            } else {
                if (iJ2 != 4) {
                    throw new UnknownFieldException(iJ2);
                }
                typeAuth = (TypeAuth) cVarC.f(pluginGeneratedSerialDescriptor, 4, kSerializerArr[4], typeAuth);
                i12 |= 16;
            }
        }
        cVarC.d(pluginGeneratedSerialDescriptor);
        return new Kb1.b(i12, strS, strS2, strS3, jP2, typeAuth, null);
    }

    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
    /* renamed from: getDescriptor */
    public final SerialDescriptor getF412706c() {
        return f413944b;
    }

    @Override // kotlinx.serialization.x
    public final void serialize(Encoder encoder, Object obj) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f413944b;
        kotlinx.serialization.encoding.d dVarC = encoder.c(pluginGeneratedSerialDescriptor);
        Kb1.b.d((Kb1.b) obj, dVarC, pluginGeneratedSerialDescriptor);
        dVarC.d(pluginGeneratedSerialDescriptor);
    }

    @Override // kotlinx.serialization.internal.N
    public final KSerializer[] typeParametersSerializers() {
        return G0.f412773a;
    }
}
