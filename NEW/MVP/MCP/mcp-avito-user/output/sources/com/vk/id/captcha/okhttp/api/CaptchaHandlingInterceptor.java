package com.vk.id.captcha.okhttp.api;

import Y61.k;
import com.vk.id.captcha.okhttp.a.a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import okhttp3.Interceptor;
import okhttp3.Response;

/* compiled from: CaptchaHandlingInterceptor.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0097\u0001¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lcom/vk/id/captcha/okhttp/api/CaptchaHandlingInterceptor;", "Lokhttp3/Interceptor;", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "", "", "domains", "Ljava/util/Set;", "<init>", "(Ljava/util/Set;)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CaptchaHandlingInterceptor implements Interceptor {
    private final /* synthetic */ a $$delegate_0;

    @k
    private final Set<String> domains;

    public CaptchaHandlingInterceptor() {
        this(null, 1, null);
    }

    @Override // okhttp3.Interceptor
    @k
    public final Response intercept(@k Interceptor.Chain chain) {
        return this.$$delegate_0.intercept(chain);
    }

    public CaptchaHandlingInterceptor(@k Set<String> set) {
        this.domains = set;
        this.$$delegate_0 = new a(C42745f0.U(new Error14HandlingInterceptor(set), new HitmanChallengeHandlingInterceptor(set)));
    }

    public CaptchaHandlingInterceptor(Set set, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? B0.f406639b : set);
    }
}
