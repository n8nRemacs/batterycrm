package com.vk.id.internal.captcha;

import Y61.k;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.text.C43066x;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Protocol;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* compiled from: HitmanChallengeInterceptor.kt */
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/vk/id/internal/captcha/HitmanChallengeInterceptor;", "Lokhttp3/Interceptor;", "<init>", "()V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HitmanChallengeInterceptor implements Interceptor {
    @Override // okhttp3.Interceptor
    @k
    public Response intercept(@k Interceptor.Chain chain) {
        String strHeader = chain.request().header("X-Challenge-Solution");
        return (strHeader == null || C43066x.K(strHeader)) ? new Response.Builder().code(200).request(chain.request()).protocol(Protocol.HTTP_2).message("OK").body(ResponseBody.INSTANCE.create("", MediaType.INSTANCE.parse("application/json; charset=utf-8"))).header("X-Challenge", "required").header("X-Challenge-Url", "/challenge.html").build() : chain.proceed(chain.request());
    }
}
