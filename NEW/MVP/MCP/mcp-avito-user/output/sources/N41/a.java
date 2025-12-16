package N41;

import com.avito.android.remote.model.messenger.voice.VoiceInfo;
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
    public static final a f11188a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f11189b;

    static {
        a aVar = new a();
        f11188a = aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("sberid.sdk.global.models.OIDCParams", aVar, 7);
        pluginGeneratedSerialDescriptor.j("scope", false);
        pluginGeneratedSerialDescriptor.j("clientId", false);
        pluginGeneratedSerialDescriptor.j(VoiceInfo.STATE, false);
        pluginGeneratedSerialDescriptor.j("nonce", false);
        pluginGeneratedSerialDescriptor.j("redirectUri", false);
        pluginGeneratedSerialDescriptor.j("codeChallenge", false);
        pluginGeneratedSerialDescriptor.j("codeChallengeMethod", false);
        f11189b = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.N
    public final KSerializer[] childSerializers() {
        V0 v02 = V0.f412822a;
        return new KSerializer[]{v02, v02, v02, v02, v02, L51.a.a(v02), L51.a.a(v02)};
    }

    @Override // kotlinx.serialization.InterfaceC43386e
    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f11189b;
        kotlinx.serialization.encoding.c cVarC = decoder.c(pluginGeneratedSerialDescriptor);
        int i12 = 0;
        String strS = null;
        String strS2 = null;
        String strS3 = null;
        String strS4 = null;
        String strS5 = null;
        String str = null;
        String str2 = null;
        boolean z12 = true;
        while (z12) {
            int iJ2 = cVarC.j(pluginGeneratedSerialDescriptor);
            switch (iJ2) {
                case -1:
                    z12 = false;
                    break;
                case 0:
                    strS = cVarC.s(pluginGeneratedSerialDescriptor, 0);
                    i12 |= 1;
                    break;
                case 1:
                    strS2 = cVarC.s(pluginGeneratedSerialDescriptor, 1);
                    i12 |= 2;
                    break;
                case 2:
                    strS3 = cVarC.s(pluginGeneratedSerialDescriptor, 2);
                    i12 |= 4;
                    break;
                case 3:
                    strS4 = cVarC.s(pluginGeneratedSerialDescriptor, 3);
                    i12 |= 8;
                    break;
                case 4:
                    strS5 = cVarC.s(pluginGeneratedSerialDescriptor, 4);
                    i12 |= 16;
                    break;
                case 5:
                    str = (String) cVarC.f(pluginGeneratedSerialDescriptor, 5, V0.f412822a, str);
                    i12 |= 32;
                    break;
                case 6:
                    str2 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 6, V0.f412822a, str2);
                    i12 |= 64;
                    break;
                default:
                    throw new UnknownFieldException(iJ2);
            }
        }
        cVarC.d(pluginGeneratedSerialDescriptor);
        return new Zb1.c(i12, strS, strS2, strS3, strS4, strS5, str, str2, null);
    }

    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
    /* renamed from: getDescriptor */
    public final SerialDescriptor getF412706c() {
        return f11189b;
    }

    @Override // kotlinx.serialization.x
    public final void serialize(Encoder encoder, Object obj) {
        Zb1.c cVar = (Zb1.c) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f11189b;
        kotlinx.serialization.encoding.d dVarC = encoder.c(pluginGeneratedSerialDescriptor);
        dVarC.l(pluginGeneratedSerialDescriptor, 0, cVar.f20274a);
        dVarC.l(pluginGeneratedSerialDescriptor, 1, cVar.f20275b);
        dVarC.l(pluginGeneratedSerialDescriptor, 2, cVar.f20276c);
        dVarC.l(pluginGeneratedSerialDescriptor, 3, cVar.f20277d);
        dVarC.l(pluginGeneratedSerialDescriptor, 4, cVar.f20278e);
        V0 v02 = V0.f412822a;
        dVarC.p(pluginGeneratedSerialDescriptor, 5, v02, cVar.f20279f);
        dVarC.p(pluginGeneratedSerialDescriptor, 6, v02, cVar.f20280g);
        dVarC.d(pluginGeneratedSerialDescriptor);
    }

    @Override // kotlinx.serialization.internal.N
    public final KSerializer[] typeParametersSerializers() {
        return G0.f412773a;
    }
}
