package ru.avito.messenger.internal;

import com.avito.android.util.V2;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import io.reactivex.rxjava3.internal.operators.single.M;
import io.reactivex.rxjava3.internal.operators.single.U;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import ru.avito.messenger.C0;
import ru.avito.messenger.D0;
import ru.avito.messenger.InterfaceC47829l;
import ru.avito.messenger.MessengerUserType;
import ru.avito.messenger.l0;
import ru.avito.messenger.y0;
import ru.avito.websocket.y;

/* compiled from: MessengerRequestProvider.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/avito/messenger/internal/F;", "Lru/avito/websocket/l;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class F implements ru.avito.websocket.l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C0 f431179a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f431180b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f431181c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47829l f431182d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final D0 f431183e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final y0 f431184f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final String f431185g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final Headers f431186h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final Map<String, String> f431187i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f431188j;

    /* compiled from: MessengerRequestProvider.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0018\u00010\u0000j\u0004\u0018\u0001`\b0\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "session", "Lokhttp3/HttpUrl;", "endpoint", "Lru/avito/messenger/l0;", "connectionParams", "Lkotlin/Q;", "Lokhttp3/Request;", "Lru/avito/websocket/RequestIdHeader;", "apply", "(Ljava/lang/String;Lokhttp3/HttpUrl;Lru/avito/messenger/l0;)Lkotlin/Q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T1, T2, T3, R> implements l41.h {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f431190b;

        public a(String str) {
            this.f431190b = str;
        }

        @Override // l41.h
        public final Object a(Object obj, Object obj2, Object obj3) {
            y.b bVar;
            String str = (String) obj;
            HttpUrl httpUrl = (HttpUrl) obj2;
            l0 l0Var = (l0) obj3;
            F f12 = F.this;
            String strA = f12.f431184f.a();
            V2 v22 = V2.f318762a;
            StringBuilder sb2 = new StringBuilder("building upgrade request: endpoint=");
            sb2.append(httpUrl);
            sb2.append(", origin=");
            String str2 = f12.f431185g;
            sb2.append(str2);
            sb2.append(", session=");
            sb2.append(str);
            sb2.append(' ');
            String str3 = f12.f431181c;
            boolean z12 = f12.f431180b;
            sb2.append(z12 ? androidx.camera.camera2.internal.G.f(", sessionParameter=", str3) : "");
            v22.c("Messenger", sb2.toString(), null);
            StringBuilder sb3 = new StringBuilder("extra headers: ");
            Headers headers = f12.f431186h;
            sb3.append(headers);
            v22.c("Messenger", sb3.toString(), null);
            StringBuilder sb4 = new StringBuilder("params: ");
            Map<String, String> map = f12.f431187i;
            sb4.append(map);
            v22.c("Messenger", sb4.toString(), null);
            StringBuilder sb5 = new StringBuilder("sequenceId: ");
            String str4 = this.f431190b;
            sb5.append(str4);
            v22.c("Messenger", sb5.toString(), null);
            v22.c("Messenger", "requestId: ".concat(strA), null);
            Request.Builder builder = new Request.Builder();
            Request.Builder builderAddHeader = (z12 ? builder.addHeader("Cookie", str3 + '=' + str) : builder.addHeader("X-Session", str)).addHeader("Origin", str2).addHeader("X-Request-Id", strA);
            if (f12.f431188j) {
                String f431824b = l0Var.getF431824b();
                MessengerUserType messengerUserTypeE = l0Var.e();
                if (messengerUserTypeE instanceof MessengerUserType.Default) {
                    bVar = y.b.a.f431967a;
                } else if (messengerUserTypeE instanceof MessengerUserType.Employee.Company) {
                    bVar = y.b.C12412b.f431968a;
                } else {
                    if (!(messengerUserTypeE instanceof MessengerUserType.Employee.Personal)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar = y.b.c.f431969a;
                }
                builderAddHeader = builderAddHeader.tag(ru.avito.websocket.y.class, new ru.avito.websocket.y(f431824b, bVar));
            }
            Map<String, List<String>> multimap = headers != null ? headers.toMultimap() : null;
            if (multimap == null) {
                multimap = P0.c();
            }
            for (Map.Entry<String, List<String>> entry : multimap.entrySet()) {
                String key = entry.getKey();
                Iterator<T> it = entry.getValue().iterator();
                while (it.hasNext()) {
                    builderAddHeader.addHeader(key, (String) it.next());
                }
            }
            HttpUrl.Builder builderNewBuilder = httpUrl.newBuilder();
            for (Map.Entry<String, String> entry2 : map.entrySet()) {
                builderNewBuilder.setQueryParameter(entry2.getKey(), entry2.getValue());
            }
            if (L.f(map.get("use_seq"), "true") && str4 != null) {
                builderNewBuilder.setQueryParameter("seq", str4);
            }
            builderNewBuilder.setQueryParameter("id_version", "v2");
            builderNewBuilder.setQueryParameter("my_hash_id", l0Var.getF431824b());
            if (l0Var instanceof l0.d) {
                l0.d dVar = (l0.d) l0Var;
                builderNewBuilder.setQueryParameter("employee_id", dVar.f431821d);
                builderNewBuilder.setQueryParameter("private_company_session_id", dVar.f431820c);
            } else if (l0Var instanceof l0.e) {
                builderNewBuilder.setQueryParameter(HiAnalyticsConstant.BI_KEY_APP_ID, "pro_employee");
            } else {
                boolean z13 = l0Var instanceof l0.b;
            }
            return new Q(builderAddHeader.url(builderNewBuilder.build()).get().build(), strA);
        }
    }

    public F(@Y61.k C0 c02, boolean z12, @Y61.k String str, @Y61.k InterfaceC47829l interfaceC47829l, @Y61.k D0 d02, @Y61.k y0 y0Var, @Y61.k String str2, @Y61.l Headers headers, @Y61.k Map<String, String> map, boolean z13) {
        this.f431179a = c02;
        this.f431180b = z12;
        this.f431181c = str;
        this.f431182d = interfaceC47829l;
        this.f431183e = d02;
        this.f431184f = y0Var;
        this.f431185g = str2;
        this.f431186h = headers;
        this.f431187i = map;
        this.f431188j = z13;
    }

    @Override // ru.avito.websocket.l
    @Y61.k
    public final io.reactivex.rxjava3.core.I<Q<Request, String>> a(@Y61.l String str) {
        U uD2 = this.f431179a.d();
        M mA2 = this.f431182d.a();
        io.reactivex.rxjava3.core.z<l0> zVarA = this.f431183e.a();
        l0.f431814O2.getClass();
        return io.reactivex.rxjava3.core.I.I(io.reactivex.rxjava3.internal.functions.a.n(new a(str)), uD2, mA2, zVarA.P(l0.a.f431816b));
    }

    public /* synthetic */ F(C0 c02, boolean z12, String str, InterfaceC47829l interfaceC47829l, D0 d02, y0 y0Var, String str2, Headers headers, Map map, boolean z13, int i12, C42822w c42822w) {
        this(c02, z12, str, interfaceC47829l, d02, y0Var, str2, (i12 & 128) != 0 ? null : headers, (i12 & 256) != 0 ? P0.c() : map, z13);
    }
}
