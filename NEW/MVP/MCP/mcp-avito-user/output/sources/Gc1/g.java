package gc1;

import X41.n;
import Y61.k;
import Y61.l;
import androidx.camera.camera2.internal.G;
import androidx.compose.runtime.internal.P;
import androidx.media3.common.C23088b;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.G0;
import kotlinx.serialization.internal.N;
import kotlinx.serialization.internal.P0;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.V0;
import kotlinx.serialization.v;
import kotlinx.serialization.w;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0081\b\u0018\u0000 \u00192\u00020\u0001:\u0002\u0015\u0013B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bBK\b\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u000e\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u000e\u0012\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0013\u0010\u0010R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u000e\u0012\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0015\u0010\u0010R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u000e\u0012\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0017\u0010\u0010¨\u0006\u001a"}, d2 = {"Lgc1/g;", "", "", "webLink", "openIn", "clientId", "partnerColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/P0;)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "getWebLink$annotations", "()V", "b", "getOpenIn$annotations", "a", "getClientId$annotations", "c", "getPartnerColor$annotations", "Companion", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@w
/* loaded from: classes9.dex */
public final /* data */ class g {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @com.google.gson.annotations.c("clientId")
    @l
    private final String clientId;

    @com.google.gson.annotations.c("openIn")
    @l
    private final String openIn;

    @com.google.gson.annotations.c("partnerColor")
    @l
    private final String partnerColor;

    @com.google.gson.annotations.c("webLink")
    @l
    private final String webLink;

    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"sberid/sdk/ui/models/root/SSOModel.$serializer", "Lkotlinx/serialization/internal/N;", "Lgc1/g;", "<init>", "()V", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @InterfaceC42830m
    public static final class a implements N<g> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f396639a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ PluginGeneratedSerialDescriptor f396640b;

        static {
            a aVar = new a();
            f396639a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("sberid.sdk.ui.models.root.SSOModel", aVar, 4);
            pluginGeneratedSerialDescriptor.j("webLink", true);
            pluginGeneratedSerialDescriptor.j("openIn", true);
            pluginGeneratedSerialDescriptor.j("clientId", true);
            pluginGeneratedSerialDescriptor.j("partnerColor", true);
            f396640b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.internal.N
        @k
        public final KSerializer<?>[] childSerializers() {
            V0 v02 = V0.f412822a;
            return new KSerializer[]{L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02)};
        }

        @Override // kotlinx.serialization.InterfaceC43386e
        public final Object deserialize(Decoder decoder) {
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f396640b;
            kotlinx.serialization.encoding.c cVarC = decoder.c(pluginGeneratedSerialDescriptor);
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            int i12 = 0;
            boolean z12 = true;
            while (z12) {
                int iJ2 = cVarC.j(pluginGeneratedSerialDescriptor);
                if (iJ2 == -1) {
                    z12 = false;
                } else if (iJ2 == 0) {
                    str = (String) cVarC.f(pluginGeneratedSerialDescriptor, 0, V0.f412822a, str);
                    i12 |= 1;
                } else if (iJ2 == 1) {
                    str2 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 1, V0.f412822a, str2);
                    i12 |= 2;
                } else if (iJ2 == 2) {
                    str3 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 2, V0.f412822a, str3);
                    i12 |= 4;
                } else {
                    if (iJ2 != 3) {
                        throw new UnknownFieldException(iJ2);
                    }
                    str4 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 3, V0.f412822a, str4);
                    i12 |= 8;
                }
            }
            cVarC.d(pluginGeneratedSerialDescriptor);
            return new g(i12, str, str2, str3, str4, (P0) null);
        }

        @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
        @k
        /* renamed from: getDescriptor */
        public final SerialDescriptor getF412706c() {
            return f396640b;
        }

        @Override // kotlinx.serialization.x
        public final void serialize(Encoder encoder, Object obj) {
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f396640b;
            kotlinx.serialization.encoding.d dVarC = encoder.c(pluginGeneratedSerialDescriptor);
            g.e((g) obj, dVarC, pluginGeneratedSerialDescriptor);
            dVarC.d(pluginGeneratedSerialDescriptor);
        }

        @Override // kotlinx.serialization.internal.N
        @k
        public final KSerializer<?>[] typeParametersSerializers() {
            return G0.f412773a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lgc1/g$b;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lgc1/g;", "serializer", "()Lkotlinx/serialization/KSerializer;", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gc1.g$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        @k
        public final KSerializer<g> serializer() {
            return a.f396639a;
        }

        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }
    }

    public g() {
        this((String) null, (String) null, (String) null, (String) null, 15, (C42822w) null);
    }

    @n
    public static final /* synthetic */ void e(g gVar, kotlinx.serialization.encoding.d dVar, PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
        if (dVar.u() || gVar.webLink != null) {
            dVar.p(pluginGeneratedSerialDescriptor, 0, V0.f412822a, gVar.webLink);
        }
        if (dVar.u() || gVar.openIn != null) {
            dVar.p(pluginGeneratedSerialDescriptor, 1, V0.f412822a, gVar.openIn);
        }
        if (dVar.u() || gVar.clientId != null) {
            dVar.p(pluginGeneratedSerialDescriptor, 2, V0.f412822a, gVar.clientId);
        }
        if (!dVar.u() && gVar.partnerColor == null) {
            return;
        }
        dVar.p(pluginGeneratedSerialDescriptor, 3, V0.f412822a, gVar.partnerColor);
    }

    @l
    /* renamed from: a, reason: from getter */
    public final String getClientId() {
        return this.clientId;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getOpenIn() {
        return this.openIn;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getPartnerColor() {
        return this.partnerColor;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getWebLink() {
        return this.webLink;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return L.f(this.webLink, gVar.webLink) && L.f(this.openIn, gVar.openIn) && L.f(this.clientId, gVar.clientId) && L.f(this.partnerColor, gVar.partnerColor);
    }

    public final int hashCode() {
        String str = this.webLink;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.openIn;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.clientId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.partnerColor;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @k
    public final String toString() {
        String str = this.webLink;
        String str2 = this.openIn;
        return G.h(C23088b.b("SSOModel(webLink=", str, ", openIn=", str2, ", clientId="), this.clientId, ", partnerColor=", this.partnerColor, ")");
    }

    @InterfaceC42830m
    public /* synthetic */ g(int i12, @v String str, @v String str2, @v String str3, @v String str4, P0 p02) {
        if ((i12 & 1) == 0) {
            this.webLink = null;
        } else {
            this.webLink = str;
        }
        if ((i12 & 2) == 0) {
            this.openIn = null;
        } else {
            this.openIn = str2;
        }
        if ((i12 & 4) == 0) {
            this.clientId = null;
        } else {
            this.clientId = str3;
        }
        if ((i12 & 8) == 0) {
            this.partnerColor = null;
        } else {
            this.partnerColor = str4;
        }
    }

    public g(@l String str, @l String str2, @l String str3, @l String str4) {
        this.webLink = str;
        this.openIn = str2;
        this.clientId = str3;
        this.partnerColor = str4;
    }

    public /* synthetic */ g(String str, String str2, String str3, String str4, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? null : str4);
    }
}
