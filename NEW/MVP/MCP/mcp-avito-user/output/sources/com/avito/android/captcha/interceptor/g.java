package com.avito.android.captcha.interceptor;

import Pj0.C14794a;
import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.compose.runtime.C22026a;
import androidx.core.os.C22777e;
import com.avito.android.D;
import com.avito.android.H0;
import com.avito.android.captcha.p;
import com.avito.android.captcha.u;
import com.avito.android.captcha.w;
import com.avito.android.captcha.y;
import com.avito.android.captcha.z;
import com.avito.android.di.module.T9;
import com.avito.android.remote.captcha.generated.api.get_v_3__api.GetV3ApiResponse;
import com.avito.android.remote.captcha.model.CaptchaData;
import com.avito.android.remote.interceptor.T0;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.A4;
import com.avito.android.util.C5;
import com.avito.android.util.R0;
import com.avito.android.util.R1;
import com.google.gson.Gson;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import zm.InterfaceC50587a;

/* compiled from: TooManyRequestsInterceptorImpl.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/captcha/interceptor/g;", "Lcom/avito/android/remote/interceptor/T0;", "a", "b", "c", "_avito-discouraged_avito-libs_captcha"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g implements T0 {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final w f115059b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final D f115060c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final H0 f115061d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final h31.e<Gson> f115062e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final h31.e<Gson> f115063f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final InterfaceC50587a f115064g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final com.avito.android.captcha.analytics.b f115065h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final R0 f115066i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final com.avito.android.captcha.interceptor.a f115067j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final Object f115068k = new Object();

    /* compiled from: TooManyRequestsInterceptorImpl.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/captcha/interceptor/g$a;", "", "a", "b", "c", "d", "e", "f", "Lcom/avito/android/captcha/interceptor/g$a$a;", "Lcom/avito/android/captcha/interceptor/g$a$b;", "Lcom/avito/android/captcha/interceptor/g$a$c;", "Lcom/avito/android/captcha/interceptor/g$a$d;", "Lcom/avito/android/captcha/interceptor/g$a$e;", "Lcom/avito/android/captcha/interceptor/g$a$f;", "_avito-discouraged_avito-libs_captcha"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {

        /* compiled from: TooManyRequestsInterceptorImpl.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/captcha/interceptor/g$a$a;", "Lcom/avito/android/captcha/interceptor/g$a;", "<init>", "()V", "_avito-discouraged_avito-libs_captcha"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.captcha.interceptor.g$a$a, reason: collision with other inner class name */
        public static final /* data */ class C3354a implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C3354a f115069a = new C3354a();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C3354a);
            }

            public final int hashCode() {
                return -176648125;
            }

            @k
            public final String toString() {
                return "CaptchaInitFailed";
            }
        }

        /* compiled from: TooManyRequestsInterceptorImpl.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/captcha/interceptor/g$a$b;", "Lcom/avito/android/captcha/interceptor/g$a;", "<init>", "()V", "_avito-discouraged_avito-libs_captcha"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final b f115070a = new b();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -355361837;
            }

            @k
            public final String toString() {
                return "CaptchaIsTurnedOff";
            }
        }

        /* compiled from: TooManyRequestsInterceptorImpl.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/captcha/interceptor/g$a$c;", "Lcom/avito/android/captcha/interceptor/g$a;", "_avito-discouraged_avito-libs_captcha"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final z f115071a;

            public c(@k z zVar) {
                this.f115071a = zVar;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && L.f(this.f115071a, ((c) obj).f115071a);
            }

            public final int hashCode() {
                return this.f115071a.hashCode();
            }

            @k
            public final String toString() {
                return "Failed(error=" + this.f115071a + ')';
            }
        }

        /* compiled from: TooManyRequestsInterceptorImpl.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/captcha/interceptor/g$a$d;", "Lcom/avito/android/captcha/interceptor/g$a;", "<init>", "()V", "_avito-discouraged_avito-libs_captcha"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class d implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final d f115072a = new d();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return -342289410;
            }

            @k
            public final String toString() {
                return "Interrupted";
            }
        }

        /* compiled from: TooManyRequestsInterceptorImpl.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/captcha/interceptor/g$a$e;", "Lcom/avito/android/captcha/interceptor/g$a;", "_avito-discouraged_avito-libs_captcha"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class e implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final y f115073a;

            public e(@k y yVar) {
                this.f115073a = yVar;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && L.f(this.f115073a, ((e) obj).f115073a);
            }

            public final int hashCode() {
                return this.f115073a.hashCode();
            }

            @k
            public final String toString() {
                return "Success(token=" + this.f115073a + ')';
            }
        }

        /* compiled from: TooManyRequestsInterceptorImpl.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/captcha/interceptor/g$a$f;", "Lcom/avito/android/captcha/interceptor/g$a;", "<init>", "()V", "_avito-discouraged_avito-libs_captcha"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class f implements a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final f f115074a = new f();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof f);
            }

            public final int hashCode() {
                return 309543194;
            }

            @k
            public final String toString() {
                return "UpdateCode";
            }
        }
    }

    /* compiled from: TooManyRequestsInterceptorImpl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/captcha/interceptor/g$b;", "", "_avito-discouraged_avito-libs_captcha"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final p f115075a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f115076b;

        public b() {
            this(null, null, 3, null);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f115075a, bVar.f115075a) && L.f(this.f115076b, bVar.f115076b);
        }

        public final int hashCode() {
            p pVar = this.f115075a;
            int iHashCode = (pVar == null ? 0 : pVar.hashCode()) * 31;
            String str = this.f115076b;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CaptchaResult(captcha=");
            sb2.append(this.f115075a);
            sb2.append(", errorMessage=");
            return C22026a.c(sb2, this.f115076b, ')');
        }

        public b(p pVar, String str, int i12, C42822w c42822w) {
            pVar = (i12 & 1) != 0 ? null : pVar;
            str = (i12 & 2) != 0 ? null : str;
            this.f115075a = pVar;
            this.f115076b = str;
        }
    }

    /* compiled from: TooManyRequestsInterceptorImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/captcha/interceptor/g$c;", "", "<init>", "()V", "", "REFRESH_AVITO_CAPTCHA_PARAM", "Ljava/lang/String;", "_avito-discouraged_avito-libs_captcha"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        public c() {
        }
    }

    /* compiled from: Gsons.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"com/avito/android/util/GsonsKt$gsonTypeToken$1", "Lcom/google/gson/reflect/a;", "com/avito/android/util/O1", "_common_gson_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d extends com.google.gson.reflect.a<TypedResult<GetV3ApiResponse>> {
    }

    /* compiled from: Gsons.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"com/avito/android/util/GsonsKt$gsonTypeToken$1", "Lcom/google/gson/reflect/a;", "com/avito/android/util/O1", "_common_gson_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e extends com.google.gson.reflect.a<TypedResult<C14794a>> {
    }

    /* compiled from: TooManyRequestsInterceptorImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/captcha/generated/api/get_v_3__api/GetV3ApiResponse;", "getCaptchaResult", "Lcom/avito/android/captcha/interceptor/g$b;", "invoke", "(Lcom/avito/android/remote/captcha/generated/api/get_v_3__api/GetV3ApiResponse;)Lcom/avito/android/captcha/interceptor/g$b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<GetV3ApiResponse, b> {

        /* renamed from: l, reason: collision with root package name */
        public static final f f115077l = new f();

        public f() {
            super(1);
        }

        @Override // Y41.l
        public final b invoke(GetV3ApiResponse getV3ApiResponse) {
            Object captcha = getV3ApiResponse.getResult().getCaptcha();
            Map map = captcha instanceof Map ? (Map) captcha : null;
            u.f115136a.getClass();
            return new b(u.b(map, true), null, 2, null);
        }
    }

    /* compiled from: TooManyRequestsInterceptorImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lcom/avito/android/captcha/interceptor/g$b;", "invoke", "(Ljava/lang/String;)Lcom/avito/android/captcha/interceptor/g$b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.captcha.interceptor.g$g, reason: collision with other inner class name */
    public static final class C3355g extends N implements Y41.l<String, b> {

        /* renamed from: l, reason: collision with root package name */
        public static final C3355g f115078l = new C3355g();

        public C3355g() {
            super(1);
        }

        @Override // Y41.l
        public final b invoke(String str) {
            return new b(null, str, 1, null);
        }
    }

    /* compiled from: TooManyRequestsInterceptorImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LPj0/a;", "getCaptchaResult", "Lcom/avito/android/captcha/interceptor/g$b;", "invoke", "(LPj0/a;)Lcom/avito/android/captcha/interceptor/g$b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.l<C14794a, b> {

        /* renamed from: l, reason: collision with root package name */
        public static final h f115079l = new h();

        public h() {
            super(1);
        }

        @Override // Y41.l
        public final b invoke(C14794a c14794a) {
            u uVar = u.f115136a;
            CaptchaData captcha = c14794a.getCaptcha();
            uVar.getClass();
            return new b(u.a(captcha, true), null, 2, null);
        }
    }

    /* compiled from: TooManyRequestsInterceptorImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lcom/avito/android/captcha/interceptor/g$b;", "invoke", "(Ljava/lang/String;)Lcom/avito/android/captcha/interceptor/g$b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.l<String, b> {

        /* renamed from: l, reason: collision with root package name */
        public static final i f115080l = new i();

        public i() {
            super(1);
        }

        @Override // Y41.l
        public final b invoke(String str) {
            return new b(null, str, 1, null);
        }
    }

    static {
        new c(null);
    }

    @Inject
    public g(@k w wVar, @k D d12, @k H0 h02, @k h31.e<Gson> eVar, @k @T9 h31.e<Gson> eVar2, @k InterfaceC50587a interfaceC50587a, @k com.avito.android.captcha.analytics.b bVar, @k R0 r02, @k com.avito.android.captcha.interceptor.a aVar) {
        this.f115059b = wVar;
        this.f115060c = d12;
        this.f115061d = h02;
        this.f115062e = eVar;
        this.f115063f = eVar2;
        this.f115064g = interfaceC50587a;
        this.f115065h = bVar;
        this.f115066i = r02;
        this.f115067j = aVar;
    }

    public static /* synthetic */ Response c(g gVar, Response response, Request request, Interceptor.Chain chain, p pVar, int i12) {
        if ((i12 & 8) != 0) {
            pVar = null;
        }
        return gVar.b(response, request, chain, pVar, false);
    }

    public final b a(Interceptor.Chain chain, boolean z12) {
        Object objE;
        Object objE2;
        HttpUrl.Companion companion = HttpUrl.INSTANCE;
        H0 h02 = this.f115061d;
        HttpUrl httpUrl = companion.parse(C5.c(h02.a()));
        if (httpUrl == null) {
            throw new IllegalArgumentException(("Invalid api url: " + h02.a()).toString());
        }
        D d12 = this.f115060c;
        HttpUrl httpUrlBuild = httpUrl.newBuilder().addEncodedPathSegment(String.valueOf(d12.v().invoke().booleanValue() ? 3 : 1)).addEncodedPathSegment("firewallCaptcha").addEncodedPathSegment("get").build();
        Bundle bundleB = C22777e.b(new Q("refreshAvitoCaptcha", Boolean.valueOf(z12)));
        RequestBody.Companion companion2 = RequestBody.INSTANCE;
        A4.f318516a.getClass();
        Response responseProceed = chain.proceed(new Request.Builder().url(httpUrlBuild).post(companion2.create(A4.d(bundleB), MediaType.INSTANCE.parse("application/x-www-form-urlencoded;charset=UTF-8"))).build());
        ResponseBody responseBodyBody = responseProceed.body();
        String strString = responseBodyBody != null ? responseBodyBody.string() : null;
        if (strString == null) {
            throw new IllegalArgumentException("empty captcha response body");
        }
        responseProceed.close();
        if (d12.v().invoke().booleanValue()) {
            Gson gson = this.f115063f.get();
            try {
                Type type = new d().getType();
                objE2 = gson.e(strString, ((type instanceof ParameterizedType) && R1.a((ParameterizedType) type)) ? ((ParameterizedType) type).getRawType() : R1.b(type));
            } catch (Throwable unused) {
                objE2 = null;
            }
            TypedResult typedResult = (TypedResult) objE2;
            if (typedResult != null) {
                return (b) com.avito.android.error.z.r(typedResult, f.f115077l, C3355g.f115078l, null, null, 60);
            }
            return null;
        }
        Gson gson2 = this.f115062e.get();
        try {
            Type type2 = new e().getType();
            objE = gson2.e(strString, ((type2 instanceof ParameterizedType) && R1.a((ParameterizedType) type2)) ? ((ParameterizedType) type2).getRawType() : R1.b(type2));
        } catch (Throwable unused2) {
            objE = null;
        }
        TypedResult typedResult2 = (TypedResult) objE;
        if (typedResult2 != null) {
            return (b) com.avito.android.error.z.r(typedResult2, h.f115079l, i.f115080l, null, null, 60);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x005e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final okhttp3.Response b(okhttp3.Response r8, okhttp3.Request r9, okhttp3.Interceptor.Chain r10, com.avito.android.captcha.p r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.captcha.interceptor.g.b(okhttp3.Response, okhttp3.Request, okhttp3.Interceptor$Chain, com.avito.android.captcha.p, boolean):okhttp3.Response");
    }

    @Override // okhttp3.Interceptor
    @k
    public final Response intercept(@k Interceptor.Chain chain) {
        String strString;
        Request request = chain.request();
        Response responseProceed = chain.proceed(request);
        D d12 = this.f115060c;
        d12.getClass();
        n<Object> nVar = D.f67247d[0];
        if (((Boolean) d12.f67248b.a().invoke()).booleanValue() && responseProceed.code() == 429) {
            synchronized (this.f115068k) {
                try {
                    if (this.f115064g.b()) {
                        this.f115064g.c(false);
                        ResponseBody responseBodyBody = responseProceed.newBuilder().body(responseProceed.peekBody(Long.MAX_VALUE)).build().body();
                        if (responseBodyBody == null || (strString = responseBodyBody.string()) == null) {
                            strString = "";
                        }
                        return strString.length() == 0 ? responseProceed : c(this, responseProceed, request, chain, null, 24);
                    }
                    if (this.f115064g.d()) {
                        responseProceed.close();
                        return chain.proceed(request);
                    }
                    G0 g02 = G0.f406611a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return responseProceed;
    }
}
