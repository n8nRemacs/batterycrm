package lW0;

import Y61.k;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import okhttp3.Interceptor;
import okhttp3.Response;

/* compiled from: ChuckerInterceptor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LlW0/c;", "Lokhttp3/Interceptor;", "a", "com.github.ChuckerTeam.Chucker.library-no-op"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: lW0.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C43696c implements Interceptor {

    /* compiled from: ChuckerInterceptor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LlW0/c$a;", "", "com.github.ChuckerTeam.Chucker.library-no-op"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: lW0.c$a */
    public static final class a {
    }

    public C43696c(Context context, Object obj, Object obj2, Object obj3, Object obj4, int i12, C42822w c42822w) {
    }

    @Override // okhttp3.Interceptor
    @k
    public final Response intercept(@k Interceptor.Chain chain) {
        return chain.proceed(chain.request());
    }
}
