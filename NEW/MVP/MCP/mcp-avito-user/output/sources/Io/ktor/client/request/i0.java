package io.ktor.client.request;

import io.ktor.http.I0;
import io.ktor.http.N0;
import io.ktor.http.O0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: HttpRequest.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-client-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class i0 {
    public static final void a(@Y61.k d0 d0Var, @Y61.k String str) {
        N0.b(d0Var.f399707a, str);
    }

    public static void b(d0 d0Var) {
        h0 h0Var = h0.f399749l;
        I0 i02 = d0Var.f399707a;
        O0.a aVar = O0.f399884c;
        aVar.getClass();
        String strA = io.ktor.util.I0.a("ws");
        aVar.getClass();
        O0 o02 = (O0) O0.f399888g.get(strA);
        if (o02 == null) {
            o02 = new O0(strA, 0);
        }
        i02.f399862a = o02;
        h0Var.getClass();
        G0 g02 = G0.f406611a;
    }
}
