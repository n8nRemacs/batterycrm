package X51;

import java.util.Map;
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
import kotlinx.serialization.internal.Y;

/* loaded from: classes8.dex */
public final class e implements N {

    /* renamed from: a, reason: collision with root package name */
    public static final e f18612a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f18613b;

    static {
        e eVar = new e();
        f18612a = eVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("sberid.sdk.config.domain.models.ConfigResponse", eVar, 11);
        pluginGeneratedSerialDescriptor.j("blackList", false);
        pluginGeneratedSerialDescriptor.j("sberIDOidcWebUrl", true);
        pluginGeneratedSerialDescriptor.j("oidcUrlMap", true);
        pluginGeneratedSerialDescriptor.j("toggles", true);
        pluginGeneratedSerialDescriptor.j("versions", false);
        pluginGeneratedSerialDescriptor.j("ssoOpenIn", true);
        pluginGeneratedSerialDescriptor.j("defaults", true);
        pluginGeneratedSerialDescriptor.j("hostWhiteList", false);
        pluginGeneratedSerialDescriptor.j("app2appDialogList", true);
        pluginGeneratedSerialDescriptor.j("updateTimeAppToken", false);
        pluginGeneratedSerialDescriptor.j("updateTimeAppTokenMap", false);
        f18613b = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.N
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = g.f18615m;
        KSerializer kSerializer = kSerializerArr[0];
        V0 v02 = V0.f412822a;
        return new KSerializer[]{kSerializer, L51.a.a(v02), L51.a.a(kSerializerArr[2]), L51.a.a(k.f18630a), n.f18637a, v02, h.f18627a, kSerializerArr[7], kSerializerArr[8], L51.a.a(Y.f412835a), L51.a.a(kSerializerArr[10])};
    }

    @Override // kotlinx.serialization.InterfaceC43386e
    public final Object deserialize(Decoder decoder) {
        String str;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f18613b;
        kotlinx.serialization.encoding.c cVarC = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = g.f18615m;
        Set set = null;
        Map map = null;
        Integer num = null;
        Set set2 = null;
        String str2 = null;
        Map map2 = null;
        m mVar = null;
        p pVar = null;
        String strS = null;
        j jVar = null;
        Set set3 = null;
        int i12 = 0;
        boolean z12 = true;
        while (z12) {
            int iJ2 = cVarC.j(pluginGeneratedSerialDescriptor);
            switch (iJ2) {
                case -1:
                    z12 = false;
                    continue;
                case 0:
                    str = strS;
                    set2 = (Set) cVarC.v(pluginGeneratedSerialDescriptor, 0, kSerializerArr[0], set2);
                    i12 |= 1;
                    break;
                case 1:
                    str = strS;
                    str2 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 1, V0.f412822a, str2);
                    i12 |= 2;
                    break;
                case 2:
                    str = strS;
                    map2 = (Map) cVarC.f(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2], map2);
                    i12 |= 4;
                    break;
                case 3:
                    str = strS;
                    mVar = (m) cVarC.f(pluginGeneratedSerialDescriptor, 3, k.f18630a, mVar);
                    i12 |= 8;
                    break;
                case 4:
                    str = strS;
                    pVar = (p) cVarC.v(pluginGeneratedSerialDescriptor, 4, n.f18637a, pVar);
                    i12 |= 16;
                    break;
                case 5:
                    strS = cVarC.s(pluginGeneratedSerialDescriptor, 5);
                    i12 |= 32;
                    continue;
                case 6:
                    str = strS;
                    jVar = (j) cVarC.v(pluginGeneratedSerialDescriptor, 6, h.f18627a, jVar);
                    i12 |= 64;
                    break;
                case 7:
                    str = strS;
                    set3 = (Set) cVarC.v(pluginGeneratedSerialDescriptor, 7, kSerializerArr[7], set3);
                    i12 |= 128;
                    break;
                case 8:
                    str = strS;
                    set = (Set) cVarC.v(pluginGeneratedSerialDescriptor, 8, kSerializerArr[8], set);
                    i12 |= 256;
                    break;
                case 9:
                    str = strS;
                    num = (Integer) cVarC.f(pluginGeneratedSerialDescriptor, 9, Y.f412835a, num);
                    i12 |= 512;
                    break;
                case 10:
                    str = strS;
                    map = (Map) cVarC.f(pluginGeneratedSerialDescriptor, 10, kSerializerArr[10], map);
                    i12 |= 1024;
                    break;
                default:
                    throw new UnknownFieldException(iJ2);
            }
            strS = str;
        }
        cVarC.d(pluginGeneratedSerialDescriptor);
        return new g(i12, set2, str2, map2, mVar, pVar, strS, jVar, set3, set, num, map);
    }

    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
    /* renamed from: getDescriptor */
    public final SerialDescriptor getF332717a() {
        return f18613b;
    }

    @Override // kotlinx.serialization.x
    public final void serialize(Encoder encoder, Object obj) {
        g gVar = (g) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f18613b;
        kotlinx.serialization.encoding.d dVarC = encoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = g.f18615m;
        dVarC.F(pluginGeneratedSerialDescriptor, 0, kSerializerArr[0], gVar.f18616a);
        boolean zU2 = dVarC.u();
        String str = gVar.f18617b;
        if (zU2 || str != null) {
            dVarC.p(pluginGeneratedSerialDescriptor, 1, V0.f412822a, str);
        }
        boolean zU3 = dVarC.u();
        Map map = gVar.f18618c;
        if (zU3 || map != null) {
            dVarC.p(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2], map);
        }
        boolean zU4 = dVarC.u();
        m mVar = gVar.f18619d;
        if (zU4 || mVar != null) {
            dVarC.p(pluginGeneratedSerialDescriptor, 3, k.f18630a, mVar);
        }
        dVarC.F(pluginGeneratedSerialDescriptor, 4, n.f18637a, gVar.f18620e);
        boolean zU5 = dVarC.u();
        String str2 = gVar.f18621f;
        if (zU5 || !L.f(str2, "browser")) {
            dVarC.l(pluginGeneratedSerialDescriptor, 5, str2);
        }
        boolean zU6 = dVarC.u();
        j jVar = gVar.f18622g;
        if (zU6 || !L.f(jVar, new j(str2))) {
            dVarC.F(pluginGeneratedSerialDescriptor, 6, h.f18627a, jVar);
        }
        dVarC.F(pluginGeneratedSerialDescriptor, 7, kSerializerArr[7], gVar.f18623h);
        boolean zU7 = dVarC.u();
        Set set = gVar.f18624i;
        if (zU7 || !L.f(set, B0.f406639b)) {
            dVarC.F(pluginGeneratedSerialDescriptor, 8, kSerializerArr[8], set);
        }
        dVarC.p(pluginGeneratedSerialDescriptor, 9, Y.f412835a, gVar.f18625j);
        dVarC.p(pluginGeneratedSerialDescriptor, 10, kSerializerArr[10], gVar.f18626k);
        dVarC.d(pluginGeneratedSerialDescriptor);
    }

    @Override // kotlinx.serialization.internal.N
    public final KSerializer[] typeParametersSerializers() {
        return G0.f412773a;
    }
}
