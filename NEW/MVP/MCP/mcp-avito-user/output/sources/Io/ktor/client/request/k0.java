package io.ktor.client.request;

import io.ktor.http.C41533m0;
import io.ktor.http.C41535n0;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* compiled from: HttpRequest.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/client/request/k0;", "", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C41535n0 f399757a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Q31.b f399758b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final io.ktor.http.T f399759c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C41533m0 f399760d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Object f399761e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final CoroutineContext f399762f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Q31.b f399763g = io.ktor.util.date.a.b(null);

    public k0(@Y61.k C41535n0 c41535n0, @Y61.k Q31.b bVar, @Y61.k io.ktor.http.T t12, @Y61.k C41533m0 c41533m0, @Y61.k Object obj, @Y61.k CoroutineContext coroutineContext) {
        this.f399757a = c41535n0;
        this.f399758b = bVar;
        this.f399759c = t12;
        this.f399760d = c41533m0;
        this.f399761e = obj;
        this.f399762f = coroutineContext;
    }

    @Y61.k
    public final String toString() {
        return "HttpResponseData=(statusCode=" + this.f399757a + ')';
    }
}
