package com.vk.id.captcha.okhttp.a;

import Y61.k;
import java.util.List;
import kotlin.Metadata;
import okhttp3.Interceptor;
import okhttp3.Response;

/* compiled from: CompositeInterceptor.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t"}, d2 = {"Lcom/vk/id/captcha/okhttp/a/a;", "Lokhttp3/Interceptor;", "Lokhttp3/Interceptor$Chain;", "p0", "Lokhttp3/Response;", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "", "a", "Ljava/util/List;", "<init>", "(Ljava/util/List;)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class a implements Interceptor {

    @k
    private final List<Interceptor> a;

    /* JADX WARN: Multi-variable type inference failed */
    public a(@k List<? extends Interceptor> list) {
        this.a = list;
    }

    @Override // okhttp3.Interceptor
    @k
    public final Response intercept(@k Interceptor.Chain p02) {
        return new b(p02.request(), p02, this.a).proceed(p02.request());
    }
}
