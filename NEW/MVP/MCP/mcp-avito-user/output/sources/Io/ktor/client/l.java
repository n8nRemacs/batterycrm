package io.ktor.client;

import io.ktor.util.k0;
import kotlin.Metadata;
import kotlinx.coroutines.N0;

/* compiled from: HttpClient.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-client-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class l {
    /* JADX WARN: Type inference failed for: r3v1, types: [Y41.l, kotlin.jvm.internal.N] */
    @k0
    @Y61.k
    public static final a a(@Y61.k io.ktor.client.engine.okhttp.a aVar, @Y61.k U51.g gVar) {
        d dVar = new d();
        gVar.invoke(dVar);
        ?? r32 = dVar.f398841d;
        aVar.getClass();
        io.ktor.client.engine.okhttp.e eVar = new io.ktor.client.engine.okhttp.e();
        r32.invoke(eVar);
        io.ktor.client.engine.okhttp.g gVar2 = new io.ktor.client.engine.okhttp.g(eVar);
        a aVar2 = new a(gVar2, dVar);
        aVar2.f398776c = true;
        ((N0) aVar2.f398778e.get(N0.f410716u2)).k(new k(gVar2));
        return aVar2;
    }
}
