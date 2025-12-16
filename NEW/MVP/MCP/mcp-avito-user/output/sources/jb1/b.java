package Jb1;

import Lb1.d;
import X41.f;
import X41.n;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.google.gson.annotations.c;
import java.util.Collections;
import java.util.List;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.C43401f;
import kotlinx.serialization.internal.E0;
import kotlinx.serialization.internal.G0;
import kotlinx.serialization.internal.N;
import kotlinx.serialization.internal.P0;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.V0;
import kotlinx.serialization.v;
import kotlinx.serialization.w;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0001\u0018\u0000 #2\u00020\u0001:\u0002$%BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fBi\b\u0017\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0012\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0012\u0012\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0017\u0010\u0014R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0012\u0012\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u0019\u0010\u0014R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u0012\u0012\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001b\u0010\u0014R \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u0012\u0012\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001d\u0010\u0014R&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u001f\u0012\u0004\b\"\u0010\u0016\u001a\u0004\b \u0010!¨\u0006&"}, d2 = {"LJb1/b;", "", "", "subjectToken", "resource", "resourceClientId", "subjectTokenType", "grantType", "", "LLb1/d;", "scope", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/P0;)V", "Ljava/lang/String;", "getSubjectToken", "()Ljava/lang/String;", "getSubjectToken$annotations", "()V", "getResource", "getResource$annotations", "getResourceClientId", "getResourceClientId$annotations", "getSubjectTokenType", "getSubjectTokenType$annotations", "getGrantType", "getGrantType$annotations", "Ljava/util/List;", "getScope", "()Ljava/util/List;", "getScope$annotations", "Companion", "a", "b", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@w
/* loaded from: classes9.dex */
public final class b {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    @f
    @k
    public static final KSerializer<Object>[] f9046a = {null, null, null, null, null, new C43401f(d.a.f10016a)};

    @c("grant_type")
    @k
    private final String grantType;

    @c("resource")
    @k
    private final String resource;

    @c("resource_client_id")
    @k
    private final String resourceClientId;

    @c("scope")
    @k
    private final List<d> scope;

    @c("subject_token")
    @k
    private final String subjectToken;

    @c("subject_token_type")
    @k
    private final String subjectTokenType;

    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"sberid/sdk/app_token/data/models/requests/ExchangeTokenRequest.$serializer", "Lkotlinx/serialization/internal/N;", "LJb1/b;", "<init>", "()V", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @InterfaceC42830m
    public static final class a implements N<b> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f9047a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ PluginGeneratedSerialDescriptor f9048b;

        static {
            a aVar = new a();
            f9047a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("sberid.sdk.app_token.data.models.requests.ExchangeTokenRequest", aVar, 6);
            pluginGeneratedSerialDescriptor.j("subject_token", false);
            pluginGeneratedSerialDescriptor.j("resource", false);
            pluginGeneratedSerialDescriptor.j("resource_client_id", false);
            pluginGeneratedSerialDescriptor.j("subject_token_type", true);
            pluginGeneratedSerialDescriptor.j("grant_type", true);
            pluginGeneratedSerialDescriptor.j("scope", true);
            f9048b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.internal.N
        @k
        public final KSerializer<?>[] childSerializers() {
            KSerializer<?> kSerializer = b.f9046a[5];
            V0 v02 = V0.f412822a;
            return new KSerializer[]{v02, v02, v02, v02, v02, kSerializer};
        }

        @Override // kotlinx.serialization.InterfaceC43386e
        public final Object deserialize(Decoder decoder) {
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f9048b;
            kotlinx.serialization.encoding.c cVarC = decoder.c(pluginGeneratedSerialDescriptor);
            KSerializer<Object>[] kSerializerArr = b.f9046a;
            int i12 = 0;
            String strS = null;
            String strS2 = null;
            String strS3 = null;
            String strS4 = null;
            String strS5 = null;
            List list = null;
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
                        list = (List) cVarC.v(pluginGeneratedSerialDescriptor, 5, kSerializerArr[5], list);
                        i12 |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iJ2);
                }
            }
            cVarC.d(pluginGeneratedSerialDescriptor);
            return new b(i12, strS, strS2, strS3, strS4, strS5, list, (P0) null);
        }

        @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
        @k
        /* renamed from: getDescriptor */
        public final SerialDescriptor getF412706c() {
            return f9048b;
        }

        @Override // kotlinx.serialization.x
        public final void serialize(Encoder encoder, Object obj) {
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f9048b;
            kotlinx.serialization.encoding.d dVarC = encoder.c(pluginGeneratedSerialDescriptor);
            b.a((b) obj, dVarC, pluginGeneratedSerialDescriptor);
            dVarC.d(pluginGeneratedSerialDescriptor);
        }

        @Override // kotlinx.serialization.internal.N
        @k
        public final KSerializer<?>[] typeParametersSerializers() {
            return G0.f412773a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LJb1/b$b;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "LJb1/b;", "serializer", "()Lkotlinx/serialization/KSerializer;", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Jb1.b$b, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        @k
        public final KSerializer<b> serializer() {
            return a.f9047a;
        }

        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }
    }

    @InterfaceC42830m
    public b(int i12, @v String str, @v String str2, @v String str3, @v String str4, @v String str5, @v List list, P0 p02) {
        if (7 != (i12 & 7)) {
            a.f9047a.getClass();
            E0.b(i12, 7, a.f9048b);
            throw null;
        }
        this.subjectToken = str;
        this.resource = str2;
        this.resourceClientId = str3;
        if ((i12 & 8) == 0) {
            this.subjectTokenType = "SBERID_APP_TOKEN";
        } else {
            this.subjectTokenType = str4;
        }
        if ((i12 & 16) == 0) {
            this.grantType = "urn:ietf:params:oauth:grant-type:token-exchange";
        } else {
            this.grantType = str5;
        }
        if ((i12 & 32) == 0) {
            this.scope = Collections.singletonList(new d("openid"));
        } else {
            this.scope = list;
        }
    }

    @n
    public static final void a(b bVar, kotlinx.serialization.encoding.d dVar, PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
        dVar.l(pluginGeneratedSerialDescriptor, 0, bVar.subjectToken);
        dVar.l(pluginGeneratedSerialDescriptor, 1, bVar.resource);
        dVar.l(pluginGeneratedSerialDescriptor, 2, bVar.resourceClientId);
        if (dVar.u() || !L.f(bVar.subjectTokenType, "SBERID_APP_TOKEN")) {
            dVar.l(pluginGeneratedSerialDescriptor, 3, bVar.subjectTokenType);
        }
        if (dVar.u() || !L.f(bVar.grantType, "urn:ietf:params:oauth:grant-type:token-exchange")) {
            dVar.l(pluginGeneratedSerialDescriptor, 4, bVar.grantType);
        }
        if (!dVar.u() && L.f(bVar.scope, Collections.singletonList(new d("openid")))) {
            return;
        }
        dVar.F(pluginGeneratedSerialDescriptor, 5, f9046a[5], bVar.scope);
    }

    public b(@k String str, @k String str2, @k String str3, @k String str4, @k String str5, @k List<d> list) {
        this.subjectToken = str;
        this.resource = str2;
        this.resourceClientId = str3;
        this.subjectTokenType = str4;
        this.grantType = str5;
        this.scope = list;
    }

    public b(String str, String str2, String str3, String str4, String str5, List list, int i12, C42822w c42822w) {
        this(str, str2, str3, (i12 & 8) != 0 ? "SBERID_APP_TOKEN" : str4, (i12 & 16) != 0 ? "urn:ietf:params:oauth:grant-type:token-exchange" : str5, (i12 & 32) != 0 ? Collections.singletonList(new d("openid")) : list);
    }
}
