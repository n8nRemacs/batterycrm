package X51;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.C43407i;
import kotlinx.serialization.internal.G0;
import kotlinx.serialization.internal.N;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes8.dex */
public final class k implements N {

    /* renamed from: a, reason: collision with root package name */
    public static final k f18630a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ PluginGeneratedSerialDescriptor f18631b;

    static {
        k kVar = new k();
        f18630a = kVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("sberid.sdk.config.domain.models.Toggles", kVar, 5);
        pluginGeneratedSerialDescriptor.j("sberIDWebViewEnabled", true);
        pluginGeneratedSerialDescriptor.j("sberIDOIDC2AppEnabled", true);
        pluginGeneratedSerialDescriptor.j("sberIDSessionIdEnabled", true);
        pluginGeneratedSerialDescriptor.j("sberIDAppTokenEnabled", true);
        pluginGeneratedSerialDescriptor.j("app2appDialogEnabled", true);
        f18631b = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.N
    public final KSerializer[] childSerializers() {
        C43407i c43407i = C43407i.f412866a;
        return new KSerializer[]{c43407i, c43407i, c43407i, c43407i, c43407i};
    }

    @Override // kotlinx.serialization.InterfaceC43386e
    public final Object deserialize(Decoder decoder) {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f18631b;
        kotlinx.serialization.encoding.c cVarC = decoder.c(pluginGeneratedSerialDescriptor);
        boolean z12 = true;
        int i12 = 0;
        boolean zD2 = false;
        boolean zD3 = false;
        boolean zD4 = false;
        boolean zD5 = false;
        boolean zD6 = false;
        while (z12) {
            int iJ2 = cVarC.j(pluginGeneratedSerialDescriptor);
            if (iJ2 == -1) {
                z12 = false;
            } else if (iJ2 == 0) {
                zD2 = cVarC.D(pluginGeneratedSerialDescriptor, 0);
                i12 |= 1;
            } else if (iJ2 == 1) {
                zD3 = cVarC.D(pluginGeneratedSerialDescriptor, 1);
                i12 |= 2;
            } else if (iJ2 == 2) {
                zD4 = cVarC.D(pluginGeneratedSerialDescriptor, 2);
                i12 |= 4;
            } else if (iJ2 == 3) {
                zD5 = cVarC.D(pluginGeneratedSerialDescriptor, 3);
                i12 |= 8;
            } else {
                if (iJ2 != 4) {
                    throw new UnknownFieldException(iJ2);
                }
                zD6 = cVarC.D(pluginGeneratedSerialDescriptor, 4);
                i12 |= 16;
            }
        }
        cVarC.d(pluginGeneratedSerialDescriptor);
        return new m(i12, zD2, zD3, zD4, zD5, zD6);
    }

    @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
    /* renamed from: getDescriptor */
    public final SerialDescriptor getF412706c() {
        return f18631b;
    }

    @Override // kotlinx.serialization.x
    public final void serialize(Encoder encoder, Object obj) {
        m mVar = (m) obj;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f18631b;
        kotlinx.serialization.encoding.d dVarC = encoder.c(pluginGeneratedSerialDescriptor);
        boolean zU2 = dVarC.u();
        boolean z12 = mVar.f18632a;
        if (zU2 || z12) {
            dVarC.k(pluginGeneratedSerialDescriptor, 0, z12);
        }
        boolean zU3 = dVarC.u();
        boolean z13 = mVar.f18633b;
        if (zU3 || !z13) {
            dVarC.k(pluginGeneratedSerialDescriptor, 1, z13);
        }
        boolean zU4 = dVarC.u();
        boolean z14 = mVar.f18634c;
        if (zU4 || z14) {
            dVarC.k(pluginGeneratedSerialDescriptor, 2, z14);
        }
        boolean zU5 = dVarC.u();
        boolean z15 = mVar.f18635d;
        if (zU5 || !z15) {
            dVarC.k(pluginGeneratedSerialDescriptor, 3, z15);
        }
        boolean zU6 = dVarC.u();
        boolean z16 = mVar.f18636e;
        if (zU6 || z16) {
            dVarC.k(pluginGeneratedSerialDescriptor, 4, z16);
        }
        dVarC.d(pluginGeneratedSerialDescriptor);
    }

    @Override // kotlinx.serialization.internal.N
    public final KSerializer[] typeParametersSerializers() {
        return G0.f412773a;
    }
}
