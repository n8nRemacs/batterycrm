package Lb1;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
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

@P
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \f2\u00020\u0001:\u0002\r\u000eB?\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"LLb1/a;", "", "", "seen1", "", "code", VoiceInfo.STATE, "token", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/P0;)V", "Companion", "a", "b", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@w
/* loaded from: classes9.dex */
public final /* data */ class a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f9999a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f10000b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f10001c;

    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"sberid/sdk/app_token/domain/models/network/AppTokenData.$serializer", "Lkotlinx/serialization/internal/N;", "LLb1/a;", "<init>", "()V", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @InterfaceC42830m
    /* renamed from: Lb1.a$a, reason: collision with other inner class name */
    public static final class C0618a implements N<a> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0618a f10002a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ PluginGeneratedSerialDescriptor f10003b;

        static {
            C0618a c0618a = new C0618a();
            f10002a = c0618a;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("sberid.sdk.app_token.domain.models.network.AppTokenData", c0618a, 3);
            pluginGeneratedSerialDescriptor.j("code", true);
            pluginGeneratedSerialDescriptor.j(VoiceInfo.STATE, true);
            pluginGeneratedSerialDescriptor.j("token", true);
            f10003b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.internal.N
        @k
        public final KSerializer<?>[] childSerializers() {
            V0 v02 = V0.f412822a;
            return new KSerializer[]{L51.a.a(v02), L51.a.a(v02), L51.a.a(v02)};
        }

        @Override // kotlinx.serialization.InterfaceC43386e
        public final Object deserialize(Decoder decoder) {
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f10003b;
            kotlinx.serialization.encoding.c cVarC = decoder.c(pluginGeneratedSerialDescriptor);
            String str = null;
            String str2 = null;
            String str3 = null;
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
                } else {
                    if (iJ2 != 2) {
                        throw new UnknownFieldException(iJ2);
                    }
                    str3 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 2, V0.f412822a, str3);
                    i12 |= 4;
                }
            }
            cVarC.d(pluginGeneratedSerialDescriptor);
            return new a(i12, str, str2, str3, (P0) null);
        }

        @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
        @k
        /* renamed from: getDescriptor */
        public final SerialDescriptor getF332717a() {
            return f10003b;
        }

        @Override // kotlinx.serialization.x
        public final void serialize(Encoder encoder, Object obj) {
            a aVar = (a) obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f10003b;
            kotlinx.serialization.encoding.d dVarC = encoder.c(pluginGeneratedSerialDescriptor);
            Companion companion = a.INSTANCE;
            boolean zU2 = dVarC.u();
            String str = aVar.f9999a;
            if (zU2 || str != null) {
                dVarC.p(pluginGeneratedSerialDescriptor, 0, V0.f412822a, str);
            }
            boolean zU3 = dVarC.u();
            String str2 = aVar.f10000b;
            if (zU3 || str2 != null) {
                dVarC.p(pluginGeneratedSerialDescriptor, 1, V0.f412822a, str2);
            }
            boolean zU4 = dVarC.u();
            String str3 = aVar.f10001c;
            if (zU4 || str3 != null) {
                dVarC.p(pluginGeneratedSerialDescriptor, 2, V0.f412822a, str3);
            }
            dVarC.d(pluginGeneratedSerialDescriptor);
        }

        @Override // kotlinx.serialization.internal.N
        @k
        public final KSerializer<?>[] typeParametersSerializers() {
            return G0.f412773a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LLb1/a$b;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "LLb1/a;", "serializer", "()Lkotlinx/serialization/KSerializer;", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Lb1.a$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        @k
        public final KSerializer<a> serializer() {
            return C0618a.f10002a;
        }

        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }
    }

    public a() {
        this((String) null, (String) null, (String) null, 7, (C42822w) null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f9999a, aVar.f9999a) && L.f(this.f10000b, aVar.f10000b) && L.f(this.f10001c, aVar.f10001c);
    }

    public final int hashCode() {
        String str = this.f9999a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f10000b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f10001c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AppTokenData(code=");
        sb2.append(this.f9999a);
        sb2.append(", state=");
        sb2.append(this.f10000b);
        sb2.append(", token=");
        return AK.c.s(sb2, this.f10001c, ")");
    }

    @InterfaceC42830m
    public /* synthetic */ a(int i12, @v String str, @v String str2, @v String str3, P0 p02) {
        if ((i12 & 1) == 0) {
            this.f9999a = null;
        } else {
            this.f9999a = str;
        }
        if ((i12 & 2) == 0) {
            this.f10000b = null;
        } else {
            this.f10000b = str2;
        }
        if ((i12 & 4) == 0) {
            this.f10001c = null;
        } else {
            this.f10001c = str3;
        }
    }

    public a(String str, String str2, String str3, int i12, C42822w c42822w) {
        str = (i12 & 1) != 0 ? null : str;
        str2 = (i12 & 2) != 0 ? null : str2;
        str3 = (i12 & 4) != 0 ? null : str3;
        this.f9999a = str;
        this.f10000b = str2;
        this.f10001c = str3;
    }
}
