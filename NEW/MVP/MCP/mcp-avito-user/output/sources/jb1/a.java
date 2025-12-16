package Jb1;

import X41.n;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.google.gson.annotations.c;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.d;
import kotlinx.serialization.internal.E0;
import kotlinx.serialization.internal.G0;
import kotlinx.serialization.internal.N;
import kotlinx.serialization.internal.P0;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.V0;
import kotlinx.serialization.v;
import kotlinx.serialization.w;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0001\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001d\u001eB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tBK\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u000f\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u000f\u0012\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0014\u0010\u0011R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u000f\u0012\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0016\u0010\u0011R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u0018\u0012\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, d2 = {"LJb1/a;", "", "", "token", "deviceName", "osVersion", "LZb1/c;", "oidcParam", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LZb1/c;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;LZb1/c;Lkotlinx/serialization/internal/P0;)V", "Ljava/lang/String;", "getToken", "()Ljava/lang/String;", "getToken$annotations", "()V", "getDeviceName", "getDeviceName$annotations", "getOsVersion", "getOsVersion$annotations", "LZb1/c;", "getOidcParam", "()LZb1/c;", "getOidcParam$annotations", "Companion", "a", "b", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@w
/* loaded from: classes9.dex */
public final class a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @c("deviceName")
    @k
    private final String deviceName;

    @c("oidcParam")
    @k
    private final Zb1.c oidcParam;

    @c("osVersion")
    @k
    private final String osVersion;

    @c("token")
    @k
    private final String token;

    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"sberid/sdk/app_token/data/models/requests/AppTokenRequest.$serializer", "Lkotlinx/serialization/internal/N;", "LJb1/a;", "<init>", "()V", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @InterfaceC42830m
    /* renamed from: Jb1.a$a, reason: collision with other inner class name */
    public static final class C0532a implements N<a> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0532a f9044a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ PluginGeneratedSerialDescriptor f9045b;

        static {
            C0532a c0532a = new C0532a();
            f9044a = c0532a;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("sberid.sdk.app_token.data.models.requests.AppTokenRequest", c0532a, 4);
            pluginGeneratedSerialDescriptor.j("token", false);
            pluginGeneratedSerialDescriptor.j("deviceName", false);
            pluginGeneratedSerialDescriptor.j("osVersion", false);
            pluginGeneratedSerialDescriptor.j("oidcParam", false);
            f9045b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.internal.N
        @k
        public final KSerializer<?>[] childSerializers() {
            V0 v02 = V0.f412822a;
            return new KSerializer[]{v02, v02, v02, N41.a.f11188a};
        }

        @Override // kotlinx.serialization.InterfaceC43386e
        public final Object deserialize(Decoder decoder) {
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f9045b;
            kotlinx.serialization.encoding.c cVarC = decoder.c(pluginGeneratedSerialDescriptor);
            String strS = null;
            String strS2 = null;
            String strS3 = null;
            Zb1.c cVar = null;
            int i12 = 0;
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
                } else {
                    if (iJ2 != 3) {
                        throw new UnknownFieldException(iJ2);
                    }
                    cVar = (Zb1.c) cVarC.v(pluginGeneratedSerialDescriptor, 3, N41.a.f11188a, cVar);
                    i12 |= 8;
                }
            }
            cVarC.d(pluginGeneratedSerialDescriptor);
            return new a(i12, strS, strS2, strS3, cVar, null);
        }

        @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
        @k
        /* renamed from: getDescriptor */
        public final SerialDescriptor getF332717a() {
            return f9045b;
        }

        @Override // kotlinx.serialization.x
        public final void serialize(Encoder encoder, Object obj) {
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f9045b;
            d dVarC = encoder.c(pluginGeneratedSerialDescriptor);
            a.a((a) obj, dVarC, pluginGeneratedSerialDescriptor);
            dVarC.d(pluginGeneratedSerialDescriptor);
        }

        @Override // kotlinx.serialization.internal.N
        @k
        public final KSerializer<?>[] typeParametersSerializers() {
            return G0.f412773a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LJb1/a$b;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "LJb1/a;", "serializer", "()Lkotlinx/serialization/KSerializer;", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Jb1.a$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        @k
        public final KSerializer<a> serializer() {
            return C0532a.f9044a;
        }

        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }
    }

    @InterfaceC42830m
    public a(int i12, @v String str, @v String str2, @v String str3, @v Zb1.c cVar, P0 p02) {
        if (15 != (i12 & 15)) {
            C0532a.f9044a.getClass();
            E0.b(i12, 15, C0532a.f9045b);
            throw null;
        }
        this.token = str;
        this.deviceName = str2;
        this.osVersion = str3;
        this.oidcParam = cVar;
    }

    @n
    public static final /* synthetic */ void a(a aVar, d dVar, PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
        dVar.l(pluginGeneratedSerialDescriptor, 0, aVar.token);
        dVar.l(pluginGeneratedSerialDescriptor, 1, aVar.deviceName);
        dVar.l(pluginGeneratedSerialDescriptor, 2, aVar.osVersion);
        dVar.F(pluginGeneratedSerialDescriptor, 3, N41.a.f11188a, aVar.oidcParam);
    }

    public a(@k String str, @k String str2, @k String str3, @k Zb1.c cVar) {
        this.token = str;
        this.deviceName = str2;
        this.osVersion = str3;
        this.oidcParam = cVar;
    }
}
