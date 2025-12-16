package io.ktor.client.plugins.observer;

import Y61.k;
import io.ktor.client.request.c0;
import io.ktor.utils.io.W0;
import kotlin.Metadata;

/* compiled from: DelegatedCall.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-client-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class b {
    @k
    public static final a a(@k io.ktor.client.call.b bVar, @k W0 w02) {
        a aVar = new a(bVar.f398804b);
        c0 c0Var = bVar.f398805c;
        if (c0Var == null) {
            c0Var = null;
        }
        aVar.f398805c = new c(aVar, c0Var);
        io.ktor.client.statement.d dVar = bVar.f398806d;
        aVar.f398806d = new d(aVar, w02, dVar != null ? dVar : null);
        return aVar;
    }
}
