package com.vk.id.captcha.okhttp.api;

import FX0.a;
import Y61.k;
import com.vk.id.captcha.api.VKCaptcha;
import com.vk.id.captcha.api.data.VKCaptchaResult;
import com.vk.id.captcha.api.listener.VKCaptchaResultListener;
import java.net.URL;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
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
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* compiled from: HitmanChallengeHandlingInterceptor.kt */
@s0
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001#B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\t\u0010\nJ \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0013\u001a\u00020\u0011*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u0011*\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u0003*\u00020\u0011H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u001eH\u0017¢\u0006\u0004\b \u0010!R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\"\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lcom/vk/id/captcha/okhttp/api/HitmanChallengeHandlingInterceptor;", "Lokhttp3/Interceptor;", "", "", "domains", "<init>", "(Ljava/util/Set;)V", "domain", "challengeUrl", "passCaptchaAndGetToken", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lcom/vk/id/captcha/api/data/VKCaptchaResult;", "result", "Lkotlin/Z;", "wrapResult-IoAF18A", "(Lcom/vk/id/captcha/api/data/VKCaptchaResult;)Ljava/lang/Object;", "wrapResult", "Lokhttp3/Request;", "token", "withChallengeSolution", "(Lokhttp3/Request;Ljava/lang/String;)Lokhttp3/Request;", "withSavedChallengeSolution", "(Lokhttp3/Request;)Lokhttp3/Request;", "Lokhttp3/Response;", "response", "", "shouldSkipCaptcha", "(Lokhttp3/Response;Ljava/lang/String;)Z", "getDomain", "(Lokhttp3/Request;)Ljava/lang/String;", "Lokhttp3/Interceptor$Chain;", "chain", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "Ljava/util/Set;", "Companion"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HitmanChallengeHandlingInterceptor implements Interceptor {

    @k
    private static final Companion Companion = new Companion(null);
    private static final ExecutorService executor = Executors.newSingleThreadExecutor();

    @k
    private final Set<String> domains;

    /* compiled from: HitmanChallengeHandlingInterceptor.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0018\u0010\b\u001a\u0006*\u00020\u00070\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t"}, d2 = {"Lcom/vk/id/captcha/okhttp/api/HitmanChallengeHandlingInterceptor$Companion;", "", "", "HEADER_CHALLENGE", "Ljava/lang/String;", "HEADER_CHALLENGE_SOLUTION", "HEADER_CHALLENGE_URL", "Ljava/util/concurrent/ExecutorService;", "executor", "Ljava/util/concurrent/ExecutorService;", "<init>", "()V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }
    }

    public HitmanChallengeHandlingInterceptor() {
        this(null, 1, null);
    }

    private final String getDomain(Request request) {
        URL url = request.url().url();
        return new URL(url.getProtocol(), url.getHost(), url.getPort(), "").toString();
    }

    private final String passCaptchaAndGetToken(String domain, String challengeUrl) {
        String str;
        synchronized (this) {
            int i12 = Z.f406624c;
            AtomicReference atomicReference = new AtomicReference(Z.a(new Z.b(new Exception("No result"))));
            executor.submit(new a(domain, challengeUrl, atomicReference, this, 11));
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
    public static final void passCaptchaAndGetToken$lambda$2$lambda$0(String str, String str2, final AtomicReference atomicReference, final HitmanChallengeHandlingInterceptor hitmanChallengeHandlingInterceptor) {
        VKCaptcha.INSTANCE.openCaptcha(str, str.concat(str2), new VKCaptchaResultListener() { // from class: com.vk.id.captcha.okhttp.api.HitmanChallengeHandlingInterceptor$passCaptchaAndGetToken$1$1$1
            @Override // com.vk.id.captcha.api.listener.VKCaptchaResultListener
            public final void onResult(@k VKCaptchaResult result) {
                AtomicReference<Z<String>> atomicReference2 = atomicReference;
                HitmanChallengeHandlingInterceptor hitmanChallengeHandlingInterceptor2 = hitmanChallengeHandlingInterceptor;
                synchronized (atomicReference2) {
                    atomicReference2.set(Z.a(hitmanChallengeHandlingInterceptor2.m116wrapResultIoAF18A(result)));
                    atomicReference2.notifyAll();
                    G0 g02 = G0.f406611a;
                }
            }
        });
    }

    private final boolean shouldSkipCaptcha(Response response, String domain) {
        if (!this.domains.contains(domain) && !this.domains.isEmpty()) {
            return true;
        }
        List<String> listHeaders = response.headers("X-Challenge");
        if ((listHeaders instanceof Collection) && listHeaders.isEmpty()) {
            return true;
        }
        Iterator<T> it = listHeaders.iterator();
        while (it.hasNext()) {
            if (L.f((String) it.next(), "required")) {
                return false;
            }
        }
        return true;
    }

    private final Request withChallengeSolution(Request request, String str) {
        return request.newBuilder().header("X-Challenge-Solution", str).build();
    }

    private final Request withSavedChallengeSolution(Request request) {
        String token = VKCaptcha.INSTANCE.getToken(getDomain(request));
        return (request.header("X-Challenge-Solution") != null || token == null) ? request : request.newBuilder().addHeader("X-Challenge-Solution", token).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wrapResult-IoAF18A, reason: not valid java name */
    public final Object m116wrapResultIoAF18A(VKCaptchaResult result) {
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
        String str;
        String domain = getDomain(chain.request());
        Response responseProceed = chain.proceed(withSavedChallengeSolution(chain.request()));
        if (shouldSkipCaptcha(responseProceed, domain) || (str = (String) C42745f0.G(responseProceed.headers("X-Challenge-Url"))) == null) {
            return responseProceed;
        }
        String strPassCaptchaAndGetToken = passCaptchaAndGetToken(domain, str);
        responseProceed.close();
        return chain.proceed(withChallengeSolution(chain.request(), strPassCaptchaAndGetToken));
    }

    public HitmanChallengeHandlingInterceptor(@k Set<String> set) {
        this.domains = set;
    }

    public HitmanChallengeHandlingInterceptor(Set set, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? B0.f406639b : set);
    }
}
