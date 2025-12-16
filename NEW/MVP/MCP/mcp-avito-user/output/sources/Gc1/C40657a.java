package gc1;

import X41.n;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import androidx.media3.common.C23088b;
import gc1.g;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.C43407i;
import kotlinx.serialization.internal.G0;
import kotlinx.serialization.internal.N;
import kotlinx.serialization.internal.P0;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.V0;
import kotlinx.serialization.v;
import kotlinx.serialization.w;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0081\b\u0018\u0000 \"2\u00020\u0001:\u0002#\u0012BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBW\b\u0017\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0011\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0011\u0012\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0016\u0010\u0013R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0011\u0012\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0018\u0010\u0013R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u001a\u0012\u0004\b\u001d\u0010\u0015\u001a\u0004\b\u001b\u0010\u001cR\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\u001e\u0012\u0004\b!\u0010\u0015\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lgc1/a;", "", "", "browserUrl", "deeplinkUrl", "nativeUrl", "Lgc1/g;", "sso", "", "isAdaptive", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgc1/g;Ljava/lang/Boolean;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgc1/g;Ljava/lang/Boolean;Lkotlinx/serialization/internal/P0;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "getBrowserUrl$annotations", "()V", "c", "getDeeplinkUrl$annotations", "d", "getNativeUrl$annotations", "Lgc1/g;", "e", "()Lgc1/g;", "getSso$annotations", "Ljava/lang/Boolean;", "f", "()Ljava/lang/Boolean;", "isAdaptive$annotations", "Companion", "a", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@w
/* renamed from: gc1.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* data */ class C40657a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @com.google.gson.annotations.c("browserUrl")
    @l
    private final String browserUrl;

    @com.google.gson.annotations.c("deeplinkUrl")
    @l
    private final String deeplinkUrl;

    @com.google.gson.annotations.c("isAdaptive")
    @l
    private final Boolean isAdaptive;

    @com.google.gson.annotations.c("nativeUrl")
    @l
    private final String nativeUrl;

    @com.google.gson.annotations.c("sso")
    @l
    private final g sso;

    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"sberid/sdk/ui/models/root/Click.$serializer", "Lkotlinx/serialization/internal/N;", "Lgc1/a;", "<init>", "()V", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @InterfaceC42830m
    /* renamed from: gc1.a$a, reason: collision with other inner class name */
    public static final class C11211a implements N<C40657a> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C11211a f396500a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ PluginGeneratedSerialDescriptor f396501b;

        static {
            C11211a c11211a = new C11211a();
            f396500a = c11211a;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("sberid.sdk.ui.models.root.Click", c11211a, 5);
            pluginGeneratedSerialDescriptor.j("browserUrl", true);
            pluginGeneratedSerialDescriptor.j("deeplinkUrl", true);
            pluginGeneratedSerialDescriptor.j("nativeUrl", true);
            pluginGeneratedSerialDescriptor.j("sso", true);
            pluginGeneratedSerialDescriptor.j("isAdaptive", true);
            f396501b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.internal.N
        @k
        public final KSerializer<?>[] childSerializers() {
            V0 v02 = V0.f412822a;
            return new KSerializer[]{L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(g.a.f396639a), L51.a.a(C43407i.f412866a)};
        }

        @Override // kotlinx.serialization.InterfaceC43386e
        public final Object deserialize(Decoder decoder) {
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f396501b;
            kotlinx.serialization.encoding.c cVarC = decoder.c(pluginGeneratedSerialDescriptor);
            int i12 = 0;
            String str = null;
            String str2 = null;
            String str3 = null;
            g gVar = null;
            Boolean bool = null;
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
                } else if (iJ2 == 3) {
                    gVar = (g) cVarC.f(pluginGeneratedSerialDescriptor, 3, g.a.f396639a, gVar);
                    i12 |= 8;
                } else {
                    if (iJ2 != 4) {
                        throw new UnknownFieldException(iJ2);
                    }
                    bool = (Boolean) cVarC.f(pluginGeneratedSerialDescriptor, 4, C43407i.f412866a, bool);
                    i12 |= 16;
                }
            }
            cVarC.d(pluginGeneratedSerialDescriptor);
            return new C40657a(i12, str, str2, str3, gVar, bool, (P0) null);
        }

        @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
        @k
        /* renamed from: getDescriptor */
        public final SerialDescriptor getF332717a() {
            return f396501b;
        }

        @Override // kotlinx.serialization.x
        public final void serialize(Encoder encoder, Object obj) {
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f396501b;
            kotlinx.serialization.encoding.d dVarC = encoder.c(pluginGeneratedSerialDescriptor);
            C40657a.g((C40657a) obj, dVarC, pluginGeneratedSerialDescriptor);
            dVarC.d(pluginGeneratedSerialDescriptor);
        }

        @Override // kotlinx.serialization.internal.N
        @k
        public final KSerializer<?>[] typeParametersSerializers() {
            return G0.f412773a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lgc1/a$b;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lgc1/a;", "serializer", "()Lkotlinx/serialization/KSerializer;", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gc1.a$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        @k
        public final KSerializer<C40657a> serializer() {
            return C11211a.f396500a;
        }

        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }
    }

    public C40657a() {
        this((String) null, (String) null, (String) null, (g) null, (Boolean) null, 31, (C42822w) null);
    }

    public static C40657a a(C40657a c40657a, Boolean bool) {
        String str = c40657a.browserUrl;
        String str2 = c40657a.deeplinkUrl;
        String str3 = c40657a.nativeUrl;
        g gVar = c40657a.sso;
        c40657a.getClass();
        return new C40657a(str, str2, str3, gVar, bool);
    }

    @n
    public static final /* synthetic */ void g(C40657a c40657a, kotlinx.serialization.encoding.d dVar, PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
        if (dVar.u() || c40657a.browserUrl != null) {
            dVar.p(pluginGeneratedSerialDescriptor, 0, V0.f412822a, c40657a.browserUrl);
        }
        if (dVar.u() || c40657a.deeplinkUrl != null) {
            dVar.p(pluginGeneratedSerialDescriptor, 1, V0.f412822a, c40657a.deeplinkUrl);
        }
        if (dVar.u() || c40657a.nativeUrl != null) {
            dVar.p(pluginGeneratedSerialDescriptor, 2, V0.f412822a, c40657a.nativeUrl);
        }
        if (dVar.u() || c40657a.sso != null) {
            dVar.p(pluginGeneratedSerialDescriptor, 3, g.a.f396639a, c40657a.sso);
        }
        if (!dVar.u() && c40657a.isAdaptive == null) {
            return;
        }
        dVar.p(pluginGeneratedSerialDescriptor, 4, C43407i.f412866a, c40657a.isAdaptive);
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getBrowserUrl() {
        return this.browserUrl;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getDeeplinkUrl() {
        return this.deeplinkUrl;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getNativeUrl() {
        return this.nativeUrl;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final g getSso() {
        return this.sso;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40657a)) {
            return false;
        }
        C40657a c40657a = (C40657a) obj;
        return L.f(this.browserUrl, c40657a.browserUrl) && L.f(this.deeplinkUrl, c40657a.deeplinkUrl) && L.f(this.nativeUrl, c40657a.nativeUrl) && L.f(this.sso, c40657a.sso) && L.f(this.isAdaptive, c40657a.isAdaptive);
    }

    @l
    /* renamed from: f, reason: from getter */
    public final Boolean getIsAdaptive() {
        return this.isAdaptive;
    }

    public final int hashCode() {
        String str = this.browserUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.deeplinkUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.nativeUrl;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        g gVar = this.sso;
        int iHashCode4 = (iHashCode3 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        Boolean bool = this.isAdaptive;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    @k
    public final String toString() {
        String str = this.browserUrl;
        String str2 = this.deeplinkUrl;
        String str3 = this.nativeUrl;
        g gVar = this.sso;
        Boolean bool = this.isAdaptive;
        StringBuilder sbB = C23088b.b("Click(browserUrl=", str, ", deeplinkUrl=", str2, ", nativeUrl=");
        sbB.append(str3);
        sbB.append(", sso=");
        sbB.append(gVar);
        sbB.append(", isAdaptive=");
        sbB.append(bool);
        sbB.append(")");
        return sbB.toString();
    }

    @InterfaceC42830m
    public /* synthetic */ C40657a(int i12, @v String str, @v String str2, @v String str3, @v g gVar, @v Boolean bool, P0 p02) {
        if ((i12 & 1) == 0) {
            this.browserUrl = null;
        } else {
            this.browserUrl = str;
        }
        if ((i12 & 2) == 0) {
            this.deeplinkUrl = null;
        } else {
            this.deeplinkUrl = str2;
        }
        if ((i12 & 4) == 0) {
            this.nativeUrl = null;
        } else {
            this.nativeUrl = str3;
        }
        if ((i12 & 8) == 0) {
            this.sso = null;
        } else {
            this.sso = gVar;
        }
        if ((i12 & 16) == 0) {
            this.isAdaptive = null;
        } else {
            this.isAdaptive = bool;
        }
    }

    public C40657a(@l String str, @l String str2, @l String str3, @l g gVar, @l Boolean bool) {
        this.browserUrl = str;
        this.deeplinkUrl = str2;
        this.nativeUrl = str3;
        this.sso = gVar;
        this.isAdaptive = bool;
    }

    public /* synthetic */ C40657a(String str, String str2, String str3, g gVar, Boolean bool, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? null : gVar, (i12 & 16) != 0 ? null : bool);
    }
}
