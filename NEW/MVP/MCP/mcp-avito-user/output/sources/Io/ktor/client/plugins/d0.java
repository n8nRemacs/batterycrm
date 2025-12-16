package io.ktor.client.plugins;

import io.ktor.client.plugins.U;
import io.ktor.util.C41586b;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: HttpRequestRetry.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-client-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final org.slf4j.a f399406a = org.slf4j.b.e("io.ktor.client.plugins.HttpRequestRetry");

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final C41586b<Integer> f399407b = new C41586b<>("MaxRetriesPerRequestAttributeKey");

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final C41586b<Y41.q<U.f, io.ktor.client.request.c0, io.ktor.client.statement.d, Boolean>> f399408c = new C41586b<>("ShouldRetryPerRequestAttributeKey");

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final C41586b<Y41.q<U.f, io.ktor.client.request.d0, Throwable, Boolean>> f399409d = new C41586b<>("ShouldRetryOnExceptionPerRequestAttributeKey");

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final C41586b<Y41.p<U.c, io.ktor.client.request.d0, G0>> f399410e = new C41586b<>("ModifyRequestPerRequestAttributeKey");

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final C41586b<Y41.p<U.b, Integer, Long>> f399411f = new C41586b<>("RetryDelayPerRequestAttributeKey");
}
