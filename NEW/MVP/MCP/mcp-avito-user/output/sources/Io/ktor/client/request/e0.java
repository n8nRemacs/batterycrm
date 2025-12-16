package io.ktor.client.request;

import io.ktor.client.plugins.i0;
import io.ktor.http.C41531l0;
import io.ktor.http.T0;
import io.ktor.util.InterfaceC41588c;
import io.ktor.util.InterfaceC41603j0;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlinx.coroutines.N0;

/* compiled from: HttpRequest.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/client/request/e0;", "", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final T0 f399714a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C41531l0 f399715b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final io.ktor.http.V f399716c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final io.ktor.http.content.p f399717d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final N0 f399718e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC41588c f399719f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Set<io.ktor.client.engine.h<?>> f399720g;

    @InterfaceC41603j0
    public e0(@Y61.k T0 t02, @Y61.k C41531l0 c41531l0, @Y61.k io.ktor.http.V v12, @Y61.k io.ktor.http.content.p pVar, @Y61.k N0 n02, @Y61.k InterfaceC41588c interfaceC41588c) {
        Set<io.ktor.client.engine.h<?>> setKeySet;
        this.f399714a = t02;
        this.f399715b = c41531l0;
        this.f399716c = v12;
        this.f399717d = pVar;
        this.f399718e = n02;
        this.f399719f = interfaceC41588c;
        Map map = (Map) interfaceC41588c.d(io.ktor.client.engine.i.f398905a);
        this.f399720g = (map == null || (setKeySet = map.keySet()) == null) ? B0.f406639b : setKeySet;
    }

    @Y61.l
    public final Object a(@Y61.k i0.b bVar) {
        Map map = (Map) this.f399719f.d(io.ktor.client.engine.i.f398905a);
        if (map != null) {
            return map.get(bVar);
        }
        return null;
    }

    @Y61.k
    public final String toString() {
        return "HttpRequestData(url=" + this.f399714a + ", method=" + this.f399715b + ')';
    }
}
