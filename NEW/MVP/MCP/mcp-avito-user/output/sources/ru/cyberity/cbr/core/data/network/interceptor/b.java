package ru.cyberity.cbr.core.data.network.interceptor;

import Y61.k;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.text.C43059p;
import okhttp3.Interceptor;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;

/* compiled from: CustomHttpLoggingInterceptor.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/cyberity/cbr/core/data/network/interceptor/b;", "Lokhttp3/Interceptor;", "Lokhttp3/logging/HttpLoggingInterceptor;", "wrap", "", "Lkotlin/text/p;", "skipRequestMask", "<init>", "(Lokhttp3/logging/HttpLoggingInterceptor;Ljava/util/List;)V", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "a", "Lokhttp3/logging/HttpLoggingInterceptor;", "b", "Ljava/util/List;", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class b implements Interceptor {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @k
    private final HttpLoggingInterceptor wrap;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @k
    private final List<C43059p> skipRequestMask;

    public b(@k HttpLoggingInterceptor httpLoggingInterceptor, @k List<C43059p> list) {
        this.wrap = httpLoggingInterceptor;
        this.skipRequestMask = list;
    }

    @Override // okhttp3.Interceptor
    @k
    public Response intercept(@k Interceptor.Chain chain) throws Exception {
        String url = chain.request().url().getUrl();
        if (this.wrap.getLevel() == HttpLoggingInterceptor.Level.BODY) {
            List<C43059p> list = this.skipRequestMask;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (((C43059p) it.next()).a(url)) {
                        this.wrap.level(HttpLoggingInterceptor.Level.HEADERS);
                        Response responseIntercept = this.wrap.intercept(chain);
                        this.wrap.level(HttpLoggingInterceptor.Level.BODY);
                        return responseIntercept;
                    }
                }
            }
        }
        return this.wrap.intercept(chain);
    }
}
