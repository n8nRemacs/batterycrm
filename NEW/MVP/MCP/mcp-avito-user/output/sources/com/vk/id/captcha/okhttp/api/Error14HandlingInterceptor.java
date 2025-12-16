package com.vk.id.captcha.okhttp.api;

import Y61.k;
import com.avito.konveyor.item_visibility_tracker.c;
import com.vk.id.captcha.api.VKCaptcha;
import com.vk.id.captcha.api.data.VKCaptchaResult;
import com.vk.id.captcha.api.listener.VKCaptchaResultListener;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Z;
import kotlin.collections.B0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Error14HandlingInterceptor.kt */
@s0
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001'B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\tJ \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0012\u001a\u00020\u0010*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0003*\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0018\u001a\u00020\u0017*\u00020\u0010H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001b\u001a\u00020\u001a*\u00020\u0014H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u0010*\u00020\u0010H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u001fH\u0017¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010#R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030$8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010&\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lcom/vk/id/captcha/okhttp/api/Error14HandlingInterceptor;", "Lokhttp3/Interceptor;", "", "", "domains", "<init>", "(Ljava/util/Set;)V", "redirectUri", "passCaptchaAndGetToken", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/vk/id/captcha/api/data/VKCaptchaResult;", "result", "Lkotlin/Z;", "wrapResult-IoAF18A", "(Lcom/vk/id/captcha/api/data/VKCaptchaResult;)Ljava/lang/Object;", "wrapResult", "Lokhttp3/Request;", "token", "withSuccessToken", "(Lokhttp3/Request;Ljava/lang/String;)Lokhttp3/Request;", "Lokhttp3/Response;", "getRedirectUri", "(Lokhttp3/Response;)Ljava/lang/String;", "", "shouldSkipCaptcha", "(Lokhttp3/Request;)Z", "Lkotlin/G0;", "parseCookie", "(Lokhttp3/Response;)V", "withCookie", "(Lokhttp3/Request;)Lokhttp3/Request;", "Lokhttp3/Interceptor$Chain;", "chain", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "Ljava/util/Set;", "Ljava/util/concurrent/atomic/AtomicReference;", "cookie", "Ljava/util/concurrent/atomic/AtomicReference;", "Companion"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Error14HandlingInterceptor implements Interceptor {

    @k
    private static final Companion Companion = new Companion(null);
    private static final ExecutorService executor = Executors.newSingleThreadExecutor();

    @k
    private final AtomicReference<String> cookie;

    @k
    private final Set<String> domains;

    /* compiled from: Error14HandlingInterceptor.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0018\u0010\u0006\u001a\u0006*\u00020\u00050\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/vk/id/captcha/okhttp/api/Error14HandlingInterceptor$Companion;", "", "", "CAPTCHA_ERROR_CODE", "I", "Ljava/util/concurrent/ExecutorService;", "executor", "Ljava/util/concurrent/ExecutorService;", "<init>", "()V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }
    }

    public Error14HandlingInterceptor() {
        this(null, 1, null);
    }

    private final String getRedirectUri(Response response) throws JSONException {
        JSONObject jSONObject = new JSONObject(response.peekBody(Long.MAX_VALUE).string());
        if (jSONObject.has("error")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("error");
            if (jSONObject2.getInt("error_code") == 14) {
                return jSONObject2.getString("redirect_uri");
            }
        }
        return null;
    }

    private final void parseCookie(Response response) {
        Object next;
        Iterator<T> it = response.headers("Set-Cookie").iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (C43066x.q((String) next, "remixstlid", false)) {
                    break;
                }
            }
        }
        String str = (String) next;
        if (str != null) {
            this.cookie.set(str);
        }
    }

    private final String passCaptchaAndGetToken(String redirectUri) {
        String str;
        synchronized (this) {
            int i12 = Z.f406624c;
            AtomicReference atomicReference = new AtomicReference(Z.a(new Z.b(new Exception("No result"))));
            executor.submit(new c(redirectUri, atomicReference, this, 5));
            synchronized (atomicReference) {
                try {
                    Object obj = ((Z) atomicReference.get()).f406625b;
                    if (obj instanceof Z.b) {
                        obj = null;
                    }
                    if (obj == null) {
                        atomicReference.wait();
                    }
                    Object obj2 = ((Z) atomicReference.get()).f406625b;
                    C42729a0.b(obj2);
                    str = (String) obj2;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void passCaptchaAndGetToken$lambda$3$lambda$1(String str, final AtomicReference atomicReference, final Error14HandlingInterceptor error14HandlingInterceptor) {
        VKCaptcha vKCaptcha = VKCaptcha.INSTANCE;
        HttpUrl httpUrl = HttpUrl.INSTANCE.get(str);
        vKCaptcha.openCaptcha(httpUrl.scheme() + "://" + httpUrl.host(), str, new VKCaptchaResultListener() { // from class: com.vk.id.captcha.okhttp.api.Error14HandlingInterceptor$passCaptchaAndGetToken$1$1$2
            @Override // com.vk.id.captcha.api.listener.VKCaptchaResultListener
            public final void onResult(@k VKCaptchaResult result) {
                AtomicReference<Z<String>> atomicReference2 = atomicReference;
                Error14HandlingInterceptor error14HandlingInterceptor2 = error14HandlingInterceptor;
                synchronized (atomicReference2) {
                    atomicReference2.set(Z.a(error14HandlingInterceptor2.m114wrapResultIoAF18A(result)));
                    atomicReference2.notifyAll();
                    G0 g02 = G0.f406611a;
                }
            }
        });
    }

    private final boolean shouldSkipCaptcha(Request request) {
        return (this.domains.contains(request.url().url().getHost()) || this.domains.isEmpty()) ? false : true;
    }

    private final Request withCookie(Request request) {
        Request.Builder builderNewBuilder = request.newBuilder();
        String str = this.cookie.get();
        if (str != null) {
            builderNewBuilder.addHeader("Cookie", str);
        }
        return builderNewBuilder.build();
    }

    private final Request withSuccessToken(Request request, String str) {
        return request.newBuilder().url(request.url().newBuilder().addQueryParameter("success_token", str).build()).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wrapResult-IoAF18A, reason: not valid java name */
    public final Object m114wrapResultIoAF18A(VKCaptchaResult result) {
        if (result instanceof VKCaptchaResult.Error) {
            int i12 = Z.f406624c;
            VKCaptchaResult.Error error = (VKCaptchaResult.Error) result;
            return new Z.b(new Exception(error.getError().getMessage(), error.getError().getError()));
        }
        if (!(result instanceof VKCaptchaResult.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        int i13 = Z.f406624c;
        return ((VKCaptchaResult.Success) result).getToken();
    }

    @Override // okhttp3.Interceptor
    @k
    public final Response intercept(@k Interceptor.Chain chain) {
        String redirectUri;
        Request requestWithCookie = withCookie(chain.request());
        Response responseProceed = chain.proceed(requestWithCookie);
        parseCookie(responseProceed);
        return (shouldSkipCaptcha(requestWithCookie) || (redirectUri = getRedirectUri(responseProceed)) == null) ? responseProceed : chain.proceed(withSuccessToken(withCookie(chain.request()), passCaptchaAndGetToken(redirectUri)));
    }

    public Error14HandlingInterceptor(@k Set<String> set) {
        this.domains = set;
        this.cookie = new AtomicReference<>(null);
    }

    public Error14HandlingInterceptor(Set set, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? B0.f406639b : set);
    }
}
