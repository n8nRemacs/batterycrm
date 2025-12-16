package io.ktor.client.request;

import io.ktor.http.C41531l0;
import io.ktor.http.InterfaceC41523h0;
import io.ktor.http.T0;
import io.ktor.util.InterfaceC41588c;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* compiled from: HttpRequest.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lio/ktor/client/request/c0;", "Lio/ktor/http/h0;", "Lkotlinx/coroutines/T;", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface c0 extends InterfaceC41523h0, kotlinx.coroutines.T {

    /* compiled from: HttpRequest.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
    }

    @Y61.k
    /* renamed from: d */
    io.ktor.http.content.p getF399704e();

    @Y61.k
    /* renamed from: getCall */
    io.ktor.client.call.b getF399701b();

    @Y61.k
    /* renamed from: getCoroutineContext */
    CoroutineContext getF114917e();

    @Y61.k
    /* renamed from: getMethod */
    C41531l0 getF399702c();

    @Y61.k
    /* renamed from: getUrl */
    T0 getF399703d();

    @Y61.k
    /* renamed from: q */
    InterfaceC41588c getF399706g();
}
