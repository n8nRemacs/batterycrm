package io.ktor.client.statement;

import io.ktor.client.request.c0;
import io.ktor.http.C41533m0;
import io.ktor.http.C41535n0;
import io.ktor.http.InterfaceC41523h0;
import io.ktor.utils.io.W0;
import kotlin.Metadata;
import kotlinx.coroutines.T;

/* compiled from: HttpResponse.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lio/ktor/client/statement/d;", "Lio/ktor/http/h0;", "Lkotlinx/coroutines/T;", "<init>", "()V", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class d implements InterfaceC41523h0, T {
    @Y61.k
    public abstract W0 c();

    @Y61.k
    public abstract Q31.b e();

    @Y61.k
    public abstract Q31.b f();

    @Y61.k
    public abstract C41535n0 g();

    @Y61.k
    public abstract io.ktor.client.call.b getCall();

    @Y61.k
    public abstract C41533m0 h();

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HttpResponse[");
        c0 c0Var = getCall().f398805c;
        if (c0Var == null) {
            c0Var = null;
        }
        sb2.append(c0Var.getUrl());
        sb2.append(", ");
        sb2.append(g());
        sb2.append(']');
        return sb2.toString();
    }
}
