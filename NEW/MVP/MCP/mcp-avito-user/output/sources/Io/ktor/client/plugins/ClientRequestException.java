package io.ktor.client.plugins;

import androidx.compose.runtime.C22026a;
import kotlin.Metadata;

/* compiled from: DefaultResponseValidation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/client/plugins/ClientRequestException;", "Lio/ktor/client/plugins/ResponseException;", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ClientRequestException extends ResponseException {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f399004b;

    public ClientRequestException(@Y61.k io.ktor.client.statement.d dVar, @Y61.k String str) {
        super(dVar, str);
        StringBuilder sb2 = new StringBuilder("Client request(");
        io.ktor.client.request.c0 c0Var = dVar.getF399772b().f398805c;
        sb2.append((c0Var == null ? null : c0Var).getF399702c().f400057a);
        sb2.append(' ');
        io.ktor.client.request.c0 c0Var2 = dVar.getF399772b().f398805c;
        sb2.append((c0Var2 != null ? c0Var2 : null).getF399703d());
        sb2.append(") invalid: ");
        sb2.append(dVar.getF399278b());
        sb2.append(". Text: \"");
        this.f399004b = C22026a.c(sb2, str, '\"');
    }

    @Override // java.lang.Throwable
    @Y61.k
    public final String getMessage() {
        return this.f399004b;
    }
}
