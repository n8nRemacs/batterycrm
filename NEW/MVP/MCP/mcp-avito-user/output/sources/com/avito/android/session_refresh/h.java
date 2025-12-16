package com.avito.android.session_refresh;

import com.avito.android.account.G;
import com.avito.android.remote.interceptor.J0;
import com.avito.android.util.V2;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;

/* compiled from: SessionInterceptorImpl.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/session_refresh/h;", "Lcom/avito/android/remote/interceptor/J0;", "_avito_session-refresher_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h implements J0 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final G f280701b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final l f280702c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ArrayList f280703d;

    public h(@Y61.k G g12, @Y61.k l lVar, @Y61.k ArrayList arrayList) {
        this.f280701b = g12;
        this.f280702c = lVar;
        this.f280703d = arrayList;
    }

    @Override // okhttp3.Interceptor
    @Y61.k
    public final Response intercept(@Y61.k Interceptor.Chain chain) {
        String strC;
        Request request = chain.request();
        ArrayList arrayList = this.f280703d;
        MediaType mediaType = f.f280700a;
        if (!arrayList.contains(request.url().host())) {
            V2.f318762a.i("SessionInterceptor", "Skipping request: " + request.url(), null);
            return chain.proceed(request);
        }
        G g12 = this.f280701b;
        String strC2 = g12.i().c();
        if (strC2 != null && strC2.length() != 0) {
            request = request.newBuilder().header("X-Session", strC2).build();
        }
        Response responseProceed = chain.proceed(request);
        if (responseProceed.code() != 401 || request.tag(b.class) != null) {
            return responseProceed;
        }
        Response responseBuild = responseProceed.newBuilder().body(responseProceed.peekBody(Long.MAX_VALUE)).build();
        responseProceed.close();
        if (!this.f280702c.a(new g(1, chain, Interceptor.Chain.class, "proceed", "proceed(Lokhttp3/Request;)Lokhttp3/Response;", 0), request.header("X-Session"), request.url().encodedPath()) || (strC = g12.i().c()) == null) {
            return responseBuild;
        }
        if (strC.length() != 0) {
            request = request.newBuilder().header("X-Session", strC).build();
        }
        return chain.proceed(request);
    }
}
