package ru.cyberity.cbr.core.data.network.interceptor;

import X41.n;
import Y61.k;
import Y61.l;
import android.util.Base64;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.m0;
import kotlin.text.C43047d;
import kotlin.text.C43066x;
import kotlinx.serialization.C;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.d;
import kotlinx.serialization.internal.G0;
import kotlinx.serialization.internal.N;
import kotlinx.serialization.internal.P0;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.V0;
import kotlinx.serialization.json.AbstractC43443a;
import kotlinx.serialization.v;
import kotlinx.serialization.w;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import ru.cyberity.cbr.core.common.g0;
import ru.cyberity.log.logger.Logger;

/* compiled from: TokenInterceptor.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0002\u0004\rB%\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000bR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lru/cyberity/cbr/core/data/network/interceptor/c;", "Lokhttp3/Interceptor;", "Lokhttp3/Request;", "request", "a", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "Lru/cyberity/cbr/core/c;", "", "Lru/cyberity/cbr/core/c;", "tokenProvider", "b", "urlProvider", "", "c", "I", "attempts", "<init>", "(Lru/cyberity/cbr/core/c;Lru/cyberity/cbr/core/c;)V", "d", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class c implements Interceptor {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @k
    private final ru.cyberity.cbr.core.c<String> tokenProvider;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @k
    private final ru.cyberity.cbr.core.c<String> urlProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int attempts;

    /* compiled from: TokenInterceptor.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0003\u0018\u0000 \u001b2\u00020\u0001:\u0002\u0012\u0018B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B3\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u0014\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0015R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u0014\u0012\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u0019\u0010\u0015¨\u0006\u001c"}, d2 = {"Lru/cyberity/cbr/core/data/network/interceptor/c$b;", "", "", "accessToken", "redirectUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/P0;)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "a", "(Lru/cyberity/cbr/core/data/network/interceptor/c$b;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "()Ljava/lang/String;", "getAccessToken$annotations", "()V", "b", "c", "getRedirectUrl$annotations", "Companion", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    @w
    public static final class b {

        /* renamed from: Companion, reason: from kotlin metadata */
        @k
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @l
        private final String accessToken;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @l
        private final String redirectUrl;

        /* compiled from: TokenInterceptor.kt */
        @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/network/interceptor/TokenInterceptor.JWTPayload.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/network/interceptor/c$b;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/network/interceptor/c$b;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/network/interceptor/c$b;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
        @InterfaceC42830m
        public static final class a implements N<b> {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final a f433423a;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ SerialDescriptor f433424b;

            static {
                a aVar = new a();
                f433423a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.core.data.network.interceptor.TokenInterceptor.JWTPayload", aVar, 2);
                pluginGeneratedSerialDescriptor.j("jti", true);
                pluginGeneratedSerialDescriptor.j(ContextActionHandler.Link.URL, true);
                f433424b = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // kotlinx.serialization.InterfaceC43386e
            @k
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public b deserialize(@k Decoder decoder) {
                SerialDescriptor f412706c = getF332717a();
                kotlinx.serialization.encoding.c cVarC = decoder.c(f412706c);
                P0 p02 = null;
                boolean z12 = true;
                int i12 = 0;
                Object objF = null;
                Object objF2 = null;
                while (z12) {
                    int iJ2 = cVarC.j(f412706c);
                    if (iJ2 == -1) {
                        z12 = false;
                    } else if (iJ2 == 0) {
                        objF = cVarC.f(f412706c, 0, V0.f412822a, objF);
                        i12 |= 1;
                    } else {
                        if (iJ2 != 1) {
                            throw new UnknownFieldException(iJ2);
                        }
                        objF2 = cVarC.f(f412706c, 1, V0.f412822a, objF2);
                        i12 |= 2;
                    }
                }
                cVarC.d(f412706c);
                return new b(i12, (String) objF, (String) objF2, p02);
            }

            @Override // kotlinx.serialization.internal.N
            @k
            public KSerializer<?>[] childSerializers() {
                V0 v02 = V0.f412822a;
                return new KSerializer[]{L51.a.a(v02), L51.a.a(v02)};
            }

            @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
            @k
            /* renamed from: getDescriptor */
            public SerialDescriptor getF332717a() {
                return f433424b;
            }

            @Override // kotlinx.serialization.internal.N
            @k
            public KSerializer<?>[] typeParametersSerializers() {
                return G0.f412773a;
            }

            @Override // kotlinx.serialization.x
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void serialize(@k Encoder encoder, @k b value) {
                SerialDescriptor f412706c = getF332717a();
                d dVarC = encoder.c(f412706c);
                b.a(value, dVarC, f412706c);
                dVarC.d(f412706c);
            }
        }

        /* compiled from: TokenInterceptor.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/network/interceptor/c$b$b;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/network/interceptor/c$b;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
        /* renamed from: ru.cyberity.cbr.core.data.network.interceptor.c$b$b, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(C42822w c42822w) {
                this();
            }

            @k
            public final KSerializer<b> serializer() {
                return a.f433423a;
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b() {
            this((String) null, (String) (0 == true ? 1 : 0), 3, (C42822w) (0 == true ? 1 : 0));
        }

        @n
        public static final void a(@k b self, @k d output, @k SerialDescriptor serialDesc) {
            if (output.u() || self.accessToken != null) {
                output.p(serialDesc, 0, V0.f412822a, self.accessToken);
            }
            if (!output.u() && self.redirectUrl == null) {
                return;
            }
            output.p(serialDesc, 1, V0.f412822a, self.redirectUrl);
        }

        @l
        /* renamed from: c, reason: from getter */
        public final String getRedirectUrl() {
            return this.redirectUrl;
        }

        @InterfaceC42830m
        public /* synthetic */ b(int i12, @v String str, @v String str2, P0 p02) {
            if ((i12 & 1) == 0) {
                this.accessToken = null;
            } else {
                this.accessToken = str;
            }
            if ((i12 & 2) == 0) {
                this.redirectUrl = null;
            } else {
                this.redirectUrl = str2;
            }
        }

        @l
        /* renamed from: a, reason: from getter */
        public final String getAccessToken() {
            return this.accessToken;
        }

        public b(@l String str, @l String str2) {
            this.accessToken = str;
            this.redirectUrl = str2;
        }

        public /* synthetic */ b(String str, String str2, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2);
        }
    }

    public c(@k ru.cyberity.cbr.core.c<String> cVar, @k ru.cyberity.cbr.core.c<String> cVar2) {
        this.tokenProvider = cVar;
        this.urlProvider = cVar2;
    }

    private final Request a(Request request) {
        String redirectUrl;
        String accessToken;
        String strScheme;
        String strHost;
        Request.Builder builderRemoveHeader = request.newBuilder().removeHeader("X-Access-Token");
        String str = this.tokenProvider.getOverrideUrl();
        if (C43066x.h0(str, "_act-jwt-", false) || C43066x.h0(str, "_act-sbx-jwt-", false)) {
            try {
                List listF0 = C43066x.f0(C43066x.U("_act-sbx-jwt-", C43066x.U("_act-jwt-", str)), new String[]{"."}, 0, 6);
                String str2 = (String) listF0.get(0);
                String str3 = (String) listF0.get(1);
                byte[] bArrDecode = Base64.decode(URLDecoder.decode(str2, "utf-8"), 2);
                Charset charset = C43047d.f410589b;
                String str4 = new String(bArrDecode, charset);
                String str5 = new String(Base64.decode(URLDecoder.decode(str3, "utf-8"), 2), charset);
                Logger.d$default(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(this), "JWT: header=" + str4 + " payload=" + str5, null, 4, null);
                AbstractC43443a abstractC43443aA = g0.a(false, 1, null);
                b bVar = (b) abstractC43443aA.d(str5, C.e(abstractC43443aA.f412956b, m0.b(b.class)));
                if (bVar != null && (accessToken = bVar.getAccessToken()) != null) {
                    this.tokenProvider.put(accessToken);
                    builderRemoveHeader.addHeader("X-Access-Token", accessToken);
                }
                if (bVar != null && (redirectUrl = bVar.getRedirectUrl()) != null) {
                    this.urlProvider.put(redirectUrl);
                }
            } catch (Exception unused) {
                builderRemoveHeader.addHeader("X-Access-Token", str);
            }
        } else {
            builderRemoveHeader.addHeader("X-Access-Token", str);
        }
        String str6 = this.urlProvider.getOverrideUrl();
        if (str6 != null) {
            HttpUrl httpUrl = HttpUrl.INSTANCE.parse(str6);
            HttpUrl httpUrlUrl = request.url();
            HttpUrl.Builder builderNewBuilder = httpUrlUrl.newBuilder();
            if (httpUrl == null || (strScheme = httpUrl.scheme()) == null) {
                strScheme = httpUrlUrl.scheme();
            }
            HttpUrl.Builder builderScheme = builderNewBuilder.scheme(strScheme);
            if (httpUrl == null || (strHost = httpUrl.host()) == null) {
                strHost = httpUrlUrl.host();
            }
            HttpUrl httpUrlBuild = builderScheme.host(strHost).build();
            Logger.d$default(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(this), "Substitute url: " + httpUrlUrl + " -> " + httpUrlBuild, null, 4, null);
            builderRemoveHeader.url(httpUrlBuild);
        }
        return builderRemoveHeader.build();
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00df A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[LOOP:0: B:50:0x0070->B:56:?, LOOP_END, SYNTHETIC] */
    @Override // okhttp3.Interceptor
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized okhttp3.Response intercept(@Y61.k okhttp3.Interceptor.Chain r22) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.data.network.interceptor.c.intercept(okhttp3.Interceptor$Chain):okhttp3.Response");
    }
}
