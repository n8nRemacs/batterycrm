package io.ktor.client.call;

import Y61.k;
import Y61.l;
import io.ktor.client.request.c0;
import io.ktor.http.C41519f0;
import io.ktor.http.T;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: HttpClientCall.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lio/ktor/client/call/NoTransformationFoundException;", "Ljava/lang/UnsupportedOperationException;", "Lkotlin/UnsupportedOperationException;", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class NoTransformationFoundException extends UnsupportedOperationException {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f398801b;

    public NoTransformationFoundException(@k io.ktor.client.statement.d dVar, @k kotlin.reflect.d<?> dVar2, @k kotlin.reflect.d<?> dVar3) {
        StringBuilder sb2 = new StringBuilder("\n        Expected response body of the type '");
        sb2.append(dVar3);
        sb2.append("' but was '");
        sb2.append(dVar2);
        sb2.append("'\n        In response from `");
        c0 c0Var = dVar.getF399772b().f398805c;
        sb2.append((c0Var == null ? null : c0Var).getF399112c());
        sb2.append("`\n        Response status `");
        sb2.append(dVar.getF398822c());
        sb2.append("`\n        Response header `ContentType: ");
        T tB2 = dVar.getF399115f();
        C41519f0.f400005a.getClass();
        sb2.append(tB2.get(C41519f0.f400014j));
        sb2.append("` \n        Request header `Accept: ");
        c0 c0Var2 = dVar.getF399772b().f398805c;
        sb2.append((c0Var2 != null ? c0Var2 : null).getF399115f().get(C41519f0.f400006b));
        sb2.append("`\n        \n        You can read how to resolve NoTransformationFoundException at FAQ: \n        https://ktor.io/docs/faq.html#no-transformation-found-exception\n    ");
        this.f398801b = C43066x.E0(sb2.toString());
    }

    @Override // java.lang.Throwable
    @l
    public final String getMessage() {
        return this.f398801b;
    }
}
