package r40;

import Y61.k;
import Y61.l;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import okhttp3.Cache;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.http.HttpMethod;
import s40.InterfaceC47995b;
import s40.InterfaceC47996c;
import x40.C49761a;
import x40.C49763c;

/* compiled from: OfflineCacheImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lr40/g;", "Lr40/f;", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class g implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h f429588b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC47996c f429589c;

    public g(@k h hVar, @k InterfaceC47996c interfaceC47996c) {
        this.f429588b = hVar;
        this.f429589c = interfaceC47996c;
    }

    @Override // r40.f
    @l
    public final Response a(@k Request request) throws IOException {
        InterfaceC47996c interfaceC47996c = this.f429589c;
        C47490d c47490dA = this.f429588b.a(interfaceC47996c.b(request));
        if (c47490dA == null) {
            return null;
        }
        C49761a c49761a = c47490dA.f429580a;
        Headers headers = c49761a.f442199g;
        String str = headers.get("Content-Type");
        String str2 = headers.get("Content-Length");
        Request.Builder builder = new Request.Builder();
        HttpUrl httpUrl = c49761a.f442193a;
        Request.Builder builderUrl = builder.url(httpUrl);
        String str3 = c49761a.f442195c;
        Request.Builder builderMethod = builderUrl.method(str3, null);
        Headers headers2 = c49761a.f442194b;
        Response responseBuild = new Response.Builder().request(builderMethod.headers(headers2).build()).protocol(c49761a.f442196d).code(c49761a.f442197e).message(c49761a.f442198f).headers(headers).body(new e(c47490dA.f429581b, str, str2)).handshake(c49761a.f442200h).sentRequestAtMillis(c49761a.f442201i).receivedResponseAtMillis(c49761a.f442202j).build();
        InterfaceC47995b interfaceC47995bA = interfaceC47996c.a(request);
        InterfaceC47995b.C12608b c12608b = interfaceC47995bA instanceof InterfaceC47995b.C12608b ? (InterfaceC47995b.C12608b) interfaceC47995bA : null;
        if (c12608b != null && L.f(interfaceC47996c.c(httpUrl, c12608b), interfaceC47996c.c(request.url(), c12608b)) && L.f(str3, request.method()) && Cache.INSTANCE.varyMatches(responseBuild, headers2, request)) {
            return responseBuild;
        }
        ResponseBody responseBodyBody = responseBuild.body();
        if (responseBodyBody != null) {
            Util.closeQuietly(responseBodyBody);
        }
        return null;
    }

    @Override // r40.f
    @l
    public final InterfaceC47489c b(@k Response response) {
        String strMethod = response.request().method();
        boolean zInvalidatesCache = HttpMethod.INSTANCE.invalidatesCache(response.request().method());
        h hVar = this.f429588b;
        InterfaceC47996c interfaceC47996c = this.f429589c;
        if (zInvalidatesCache) {
            try {
                hVar.remove(interfaceC47996c.b(response.request()));
            } catch (IOException unused) {
            }
            return null;
        }
        if (!L.f(strMethod, "GET") || C49763c.a(response.headers()).contains("*") || response.code() != 200) {
            return null;
        }
        return hVar.b(interfaceC47996c.b(response.request()), new C49761a(response));
    }

    @Override // r40.f
    public final void clear() {
        this.f429588b.clear();
    }
}
