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

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0081\b\u0018\u0000 \u00182\u00020\u0001:\u0002\u000f\u0015B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bBK\b\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u000e\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u000e\u0012\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0013\u0010\u0010R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u000e\u0012\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0015\u0010\u0010R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u000e\u0012\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0006\u0010\u0010¨\u0006\u0019"}, d2 = {"Lgc1/e;", "", "", "partnerName", "themeColorLight", "themeColorDark", "isShowErrorOnMain", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/P0;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "getPartnerName$annotations", "()V", "c", "getThemeColorLight$annotations", "b", "getThemeColorDark$annotations", "isShowErrorOnMain$annotations", "Companion", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@w
/* loaded from: classes9.dex */
public final /* data */ class e {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @com.google.gson.annotations.c("isShowErrorOnMain")
    @l
    private final String isShowErrorOnMain;

    @com.google.gson.annotations.c("partnerName")
    @l
    private final String partnerName;

    @com.google.gson.annotations.c("themeColorDark")
    @l
    private final String themeColorDark;

    @com.google.gson.annotations.c("themeColorLight")
    @l
    private final String themeColorLight;

    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"sberid/sdk/ui/models/root/Property.$serializer", "Lkotlinx/serialization/internal/N;", "Lgc1/e;", "<init>", "()V", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @InterfaceC42830m
    public static final class a implements N<e> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f396634a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ PluginGeneratedSerialDescriptor f396635b;

        static {
            a aVar = new a();
            f396634a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("sberid.sdk.ui.models.root.Property", aVar, 4);
            pluginGeneratedSerialDescriptor.j("partnerName", true);
            pluginGeneratedSerialDescriptor.j("themeColorLight", true);
            pluginGeneratedSerialDescriptor.j("themeColorDark", true);
            pluginGeneratedSerialDescriptor.j("isShowErrorOnMain", true);
            f396635b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.internal.N
        @k
        public final KSerializer<?>[] childSerializers() {
            V0 v02 = V0.f412822a;
            return new KSerializer[]{L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02)};
        }

        @Override // kotlinx.serialization.InterfaceC43386e
        public final Object deserialize(Decoder decoder) {
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f396635b;
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
            return new e(i12, str, str2, str3, str4, (P0) null);
        }

        @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
        @k
        /* renamed from: getDescriptor */
        public final SerialDescriptor getF332717a() {
            return f396635b;
        }

        @Override // kotlinx.serialization.x
        public final void serialize(Encoder encoder, Object obj) {
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f396635b;
            kotlinx.serialization.encoding.d dVarC = encoder.c(pluginGeneratedSerialDescriptor);
            e.d((e) obj, dVarC, pluginGeneratedSerialDescriptor);
            dVarC.d(pluginGeneratedSerialDescriptor);
        }

        @Override // kotlinx.serialization.internal.N
        @k
        public final KSerializer<?>[] typeParametersSerializers() {
            return G0.f412773a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lgc1/e$b;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lgc1/e;", "serializer", "()Lkotlinx/serialization/KSerializer;", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gc1.e$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        @k
        public final KSerializer<e> serializer() {
            return a.f396634a;
        }

        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }
    }

    public e() {
        this((String) null, (String) null, (String) null, (String) null, 15, (C42822w) null);
    }

    @n
    public static final /* synthetic */ void d(e eVar, kotlinx.serialization.encoding.d dVar, PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
        if (dVar.u() || eVar.partnerName != null) {
            dVar.p(pluginGeneratedSerialDescriptor, 0, V0.f412822a, eVar.partnerName);
        }
        if (dVar.u() || eVar.themeColorLight != null) {
            dVar.p(pluginGeneratedSerialDescriptor, 1, V0.f412822a, eVar.themeColorLight);
        }
        if (dVar.u() || eVar.themeColorDark != null) {
            dVar.p(pluginGeneratedSerialDescriptor, 2, V0.f412822a, eVar.themeColorDark);
        }
        if (!dVar.u() && eVar.isShowErrorOnMain == null) {
            return;
        }
        dVar.p(pluginGeneratedSerialDescriptor, 3, V0.f412822a, eVar.isShowErrorOnMain);
    }

    @l
    /* renamed from: a, reason: from getter */
    public final String getPartnerName() {
        return this.partnerName;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getThemeColorDark() {
        return this.themeColorDark;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getThemeColorLight() {
        return this.themeColorLight;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.partnerName, eVar.partnerName) && L.f(this.themeColorLight, eVar.themeColorLight) && L.f(this.themeColorDark, eVar.themeColorDark) && L.f(this.isShowErrorOnMain, eVar.isShowErrorOnMain);
    }

    public final int hashCode() {
        String str = this.partnerName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.themeColorLight;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.themeColorDark;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.isShowErrorOnMain;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @k
    public final String toString() {
        String str = this.partnerName;
        String str2 = this.themeColorLight;
        return G.h(C23088b.b("Property(partnerName=", str, ", themeColorLight=", str2, ", themeColorDark="), this.themeColorDark, ", isShowErrorOnMain=", this.isShowErrorOnMain, ")");
    }

    @InterfaceC42830m
    public /* synthetic */ e(int i12, @v String str, @v String str2, @v String str3, @v String str4, P0 p02) {
        if ((i12 & 1) == 0) {
            this.partnerName = null;
        } else {
            this.partnerName = str;
        }
        if ((i12 & 2) == 0) {
            this.themeColorLight = null;
        } else {
            this.themeColorLight = str2;
        }
        if ((i12 & 4) == 0) {
            this.themeColorDark = null;
        } else {
            this.themeColorDark = str3;
        }
        if ((i12 & 8) == 0) {
            this.isShowErrorOnMain = null;
        } else {
            this.isShowErrorOnMain = str4;
        }
    }

    public e(@l String str, @l String str2, @l String str3, @l String str4) {
        this.partnerName = str;
        this.themeColorLight = str2;
        this.themeColorDark = str3;
        this.isShowErrorOnMain = str4;
    }

    public /* synthetic */ e(String str, String str2, String str3, String str4, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? null : str4);
    }
}
