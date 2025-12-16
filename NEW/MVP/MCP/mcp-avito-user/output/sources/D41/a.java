package D41;

import X51.h;
import X51.j;
import X51.k;
import X51.m;
import X51.n;
import X51.p;
import java.util.Map;
import java.util.Set;
import kotlin.collections.B0;
import kotlin.jvm.internal.L;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.d;
import kotlinx.serialization.internal.C43412k0;
import kotlinx.serialization.internal.G0;
import kotlinx.serialization.internal.N;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.V0;
import kotlinx.serialization.internal.Y;
import sberid.sdk.global.models.StandName;

/* loaded from: classes8.dex */
public final class a implements N {

    /* renamed from: a, reason: collision with root package name */
    public static final a f2912a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f2913b;

    static {
        a aVar = new a();
        f2912a = aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("sberid.sdk.config.data.models.ConfigEntity", aVar, 13);
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
        pluginGeneratedSerialDescriptor.j("cacheTime", true);
        pluginGeneratedSerialDescriptor.j("stand", true);
        f2913b = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.N
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = c.f2915o;
        KSerializer kSerializer = kSerializerArr[0];
        V0 v02 = V0.f412822a;
        return new KSerializer[]{kSerializer, L51.a.a(v02), L51.a.a(kSerializerArr[2]), L51.a.a(k.f18630a), n.f18637a, v02, h.f18627a, kSerializerArr[7], kSerializerArr[8], L51.a.a(Y.f412835a), L51.a.a(kSerializerArr[10]), C43412k0.f412877a, kSerializerArr[12]};
    }

    @Override // kotlinx.serialization.InterfaceC43386e
    public final Object deserialize(Decoder decoder) {
        Set set;
        KSerializer[] kSerializerArr;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f2913b;
        kotlinx.serialization.encoding.c cVarC = decoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr2 = c.f2915o;
        j jVar = null;
        StandName standName = null;
        Map map = null;
        Integer num = null;
        Set set2 = null;
        String str = null;
        Map map2 = null;
        m mVar = null;
        p pVar = null;
        String strS = null;
        long jP2 = 0;
        int i12 = 0;
        boolean z12 = true;
        Set set3 = null;
        Set set4 = null;
        while (z12) {
            String str2 = strS;
            int iJ2 = cVarC.j(pluginGeneratedSerialDescriptor);
            switch (iJ2) {
                case -1:
                    kSerializerArr = kSerializerArr2;
                    z12 = false;
                    strS = str2;
                    set2 = set2;
                    kSerializerArr2 = kSerializerArr;
                case 0:
                    kSerializerArr = kSerializerArr2;
                    i12 |= 1;
                    set2 = (Set) cVarC.v(pluginGeneratedSerialDescriptor, 0, kSerializerArr2[0], set2);
                    strS = str2;
                    kSerializerArr2 = kSerializerArr;
                case 1:
                    set = set2;
                    str = (String) cVarC.f(pluginGeneratedSerialDescriptor, 1, V0.f412822a, str);
                    i12 |= 2;
                    strS = str2;
                    set2 = set;
                case 2:
                    set = set2;
                    map2 = (Map) cVarC.f(pluginGeneratedSerialDescriptor, 2, kSerializerArr2[2], map2);
                    i12 |= 4;
                    strS = str2;
                    set2 = set;
                case 3:
                    set = set2;
                    mVar = (m) cVarC.f(pluginGeneratedSerialDescriptor, 3, k.f18630a, mVar);
                    i12 |= 8;
                    strS = str2;
                    set2 = set;
                case 4:
                    set = set2;
                    pVar = (p) cVarC.v(pluginGeneratedSerialDescriptor, 4, n.f18637a, pVar);
                    i12 |= 16;
                    strS = str2;
                    set2 = set;
                case 5:
                    set = set2;
                    strS = cVarC.s(pluginGeneratedSerialDescriptor, 5);
                    i12 |= 32;
                    set2 = set;
                case 6:
                    set = set2;
                    jVar = (j) cVarC.v(pluginGeneratedSerialDescriptor, 6, h.f18627a, jVar);
                    i12 |= 64;
                    strS = str2;
                    set2 = set;
                case 7:
                    set = set2;
                    set3 = (Set) cVarC.v(pluginGeneratedSerialDescriptor, 7, kSerializerArr2[7], set3);
                    i12 |= 128;
                    strS = str2;
                    set2 = set;
                case 8:
                    set = set2;
                    set4 = (Set) cVarC.v(pluginGeneratedSerialDescriptor, 8, kSerializerArr2[8], set4);
                    i12 |= 256;
                    strS = str2;
                    set2 = set;
                case 9:
                    set = set2;
                    num = (Integer) cVarC.f(pluginGeneratedSerialDescriptor, 9, Y.f412835a, num);
                    i12 |= 512;
                    strS = str2;
                    set2 = set;
                case 10:
                    set = set2;
                    map = (Map) cVarC.f(pluginGeneratedSerialDescriptor, 10, kSerializerArr2[10], map);
                    i12 |= 1024;
                    strS = str2;
                    set2 = set;
                case 11:
                    set = set2;
                    jP2 = cVarC.p(pluginGeneratedSerialDescriptor, 11);
                    i12 |= 2048;
                    strS = str2;
                    set2 = set;
                case 12:
                    set = set2;
                    standName = (StandName) cVarC.v(pluginGeneratedSerialDescriptor, 12, kSerializerArr2[12], standName);
                    i12 |= 4096;
                    strS = str2;
                    set2 = set;
                default:
                    throw new UnknownFieldException(iJ2);
            }
        }
        cVarC.d(pluginGeneratedSerialDescriptor);
        return new c(i12, set2, str, map2, mVar, pVar, strS, jVar, set3, set4, num, map, jP2, standName);
    }

    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
    /* renamed from: getDescriptor */
    public final SerialDescriptor getF332717a() {
        return f2913b;
    }

    @Override // kotlinx.serialization.x
    public final void serialize(Encoder encoder, Object obj) {
        c cVar = (c) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f2913b;
        d dVarC = encoder.c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = c.f2915o;
        dVarC.F(pluginGeneratedSerialDescriptor, 0, kSerializerArr[0], cVar.f2916a);
        boolean zU2 = dVarC.u();
        String str = cVar.f2917b;
        if (zU2 || str != null) {
            dVarC.p(pluginGeneratedSerialDescriptor, 1, V0.f412822a, str);
        }
        boolean zU3 = dVarC.u();
        Map map = cVar.f2918c;
        if (zU3 || map != null) {
            dVarC.p(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2], map);
        }
        boolean zU4 = dVarC.u();
        m mVar = cVar.f2919d;
        if (zU4 || mVar != null) {
            dVarC.p(pluginGeneratedSerialDescriptor, 3, k.f18630a, mVar);
        }
        dVarC.F(pluginGeneratedSerialDescriptor, 4, n.f18637a, cVar.f2920e);
        boolean zU5 = dVarC.u();
        String str2 = cVar.f2921f;
        if (zU5 || !L.f(str2, "browser")) {
            dVarC.l(pluginGeneratedSerialDescriptor, 5, str2);
        }
        boolean zU6 = dVarC.u();
        j jVar = cVar.f2922g;
        if (zU6 || !L.f(jVar, new j(str2))) {
            dVarC.F(pluginGeneratedSerialDescriptor, 6, h.f18627a, jVar);
        }
        dVarC.F(pluginGeneratedSerialDescriptor, 7, kSerializerArr[7], cVar.f2923h);
        boolean zU7 = dVarC.u();
        Set set = cVar.f2924i;
        if (zU7 || !L.f(set, B0.f406639b)) {
            dVarC.F(pluginGeneratedSerialDescriptor, 8, kSerializerArr[8], set);
        }
        dVarC.p(pluginGeneratedSerialDescriptor, 9, Y.f412835a, cVar.f2925j);
        dVarC.p(pluginGeneratedSerialDescriptor, 10, kSerializerArr[10], cVar.f2926k);
        boolean zU8 = dVarC.u();
        long j12 = cVar.f2927l;
        if (zU8 || j12 != -1) {
            dVarC.o(pluginGeneratedSerialDescriptor, 11, j12);
        }
        boolean zU9 = dVarC.u();
        StandName standName = cVar.f2928m;
        if (zU9 || standName != StandName.f437764e) {
            dVarC.F(pluginGeneratedSerialDescriptor, 12, kSerializerArr[12], standName);
        }
        dVarC.d(pluginGeneratedSerialDescriptor);
    }

    @Override // kotlinx.serialization.internal.N
    public final KSerializer[] typeParametersSerializers() {
        return G0.f412773a;
    }
}
