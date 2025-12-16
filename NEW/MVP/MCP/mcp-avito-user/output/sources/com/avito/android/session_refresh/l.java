package com.avito.android.session_refresh;

import Kv0.C14354a;
import Mv0.C14535a;
import android.os.Bundle;
import android.text.TextUtils;
import com.avito.android.C29270c0;
import com.avito.android.H0;
import com.avito.android.account.G;
import com.avito.android.account.M;
import com.avito.android.account.O;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.di.module.T9;
import com.avito.android.remote.model.Session;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.A4;
import com.avito.android.util.C5;
import com.avito.android.util.R1;
import com.avito.android.util.V2;
import com.google.gson.Gson;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* compiled from: SessionRefresher.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/session_refresh/l;", "", "a", "_avito_session-refresher_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface l {

    /* compiled from: SessionRefresher.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/session_refresh/l$a;", "Lcom/avito/android/session_refresh/l;", "_avito_session-refresher_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements l {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final G f280714a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final O f280715b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final Gson f280716c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final InterfaceC28373a f280717d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final H0 f280718e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final C29270c0 f280719f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final HttpUrl f280720g;

        @Inject
        public a(@Y61.k G g12, @Y61.k O o12, @Y61.k @T9 Gson gson, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k H0 h02, @Y61.k C29270c0 c29270c0) {
            this.f280714a = g12;
            this.f280715b = o12;
            this.f280716c = gson;
            this.f280717d = interfaceC28373a;
            this.f280718e = h02;
            this.f280719f = c29270c0;
            HttpUrl httpUrl = HttpUrl.INSTANCE.parse(C5.c(h02.a()));
            if (httpUrl != null) {
                this.f280720g = httpUrl;
            } else {
                throw new IllegalArgumentException(("Invalid api url: " + h02.a()).toString());
            }
        }

        public static void c(a aVar, String str, Integer num, int i12) {
            if ((i12 & 1) != 0) {
                str = null;
            }
            if ((i12 & 2) != 0) {
                num = null;
            }
            aVar.getClass();
            aVar.f280717d.c(new C14354a(str, num));
        }

        @Override // com.avito.android.session_refresh.l
        public final boolean a(@Y61.k Y41.l lVar, @Y61.l String str, @Y61.l String str2) {
            boolean zB2;
            C29270c0 c29270c0 = this.f280719f;
            c29270c0.getClass();
            kotlin.reflect.n<Object> nVar = C29270c0.f113263t[2];
            if (((Boolean) c29270c0.f113266d.a().invoke()).booleanValue()) {
                return ((Boolean) C43259k.e(EmptyCoroutineContext.INSTANCE, new k(this, str, lVar, str2, null))).booleanValue();
            }
            synchronized (c.f280696a) {
                zB2 = b(lVar, str, str2);
            }
            return zB2;
        }

        public final boolean b(Y41.l lVar, String str, String str2) throws IOException {
            ResponseBody responseBodyBody;
            G g12 = this.f280714a;
            boolean z12 = true;
            if (!TextUtils.equals(g12.i().c(), str)) {
                return true;
            }
            M m12 = g12.i().f68044a;
            if (!m12.b()) {
                c(this, "no_session", null, 2);
                return false;
            }
            String refreshToken = m12.p().getRefreshToken();
            if (refreshToken == null) {
                c(this, "no_token", null, 2);
                return false;
            }
            if (str == null || str.length() == 0) {
                c(this, "no_session", null, 2);
                return false;
            }
            HttpUrl httpUrlBuild = this.f280720g.newBuilder().addEncodedPathSegment("3").addEncodedPathSegment("refresh").build();
            Bundle bundle = new Bundle();
            bundle.putString("refreshToken", refreshToken);
            bundle.putString("accessToken", str);
            RequestBody.Companion companion = RequestBody.INSTANCE;
            A4.f318516a.getClass();
            try {
                Response response = (Response) lVar.invoke(new Request.Builder().url(httpUrlBuild).post(companion.create(A4.d(bundle), f.f280700a)).tag(b.class, b.f280695a).build());
                boolean zIsSuccessful = response.isSuccessful();
                O o12 = this.f280715b;
                if (zIsSuccessful) {
                    try {
                        responseBodyBody = response.body();
                    } catch (Throwable th2) {
                        c(this, "network_client", null, 2);
                        V2.f318762a.a("DEFAULT_TAG", "Cannot refresh user session", th2);
                    }
                    if (responseBodyBody == null) {
                        throw new IllegalArgumentException("empty refresh response body");
                    }
                    String strString = responseBodyBody.string();
                    Gson gson = this.f280716c;
                    Type type = new j().getType();
                    TypedResult typedResult = (TypedResult) gson.e(strString, ((type instanceof ParameterizedType) && R1.a((ParameterizedType) type)) ? ((ParameterizedType) type).getRawType() : R1.b(type));
                    if (!(typedResult instanceof TypedResult.Success)) {
                        throw new IllegalArgumentException("is not success");
                    }
                    C14535a c14535a = (C14535a) ((TypedResult.Success) typedResult).getResult();
                    kotlinx.coroutines.sync.d dVar = m.f280721a;
                    o12.b(str, new Session(c14535a.getAccessToken(), c14535a.getRefreshToken(), null), str2).i();
                    return z12;
                }
                if (response.code() == 403 || response.code() == 401) {
                    c(this, "forbidden", null, 2);
                    o12.a(str2, false).i();
                } else {
                    c(this, null, Integer.valueOf(response.code()), 1);
                }
                z12 = false;
                return z12;
            } catch (IOException e12) {
                c(this, "network", null, 2);
                throw e12;
            }
        }
    }

    boolean a(@Y61.k Y41.l lVar, @Y61.l String str, @Y61.l String str2);
}
