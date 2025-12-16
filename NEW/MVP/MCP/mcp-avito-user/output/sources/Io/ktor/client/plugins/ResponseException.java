package io.ktor.client.plugins;

import kotlin.Metadata;

/* compiled from: DefaultResponseValidation.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lio/ktor/client/plugins/ResponseException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public class ResponseException extends IllegalStateException {
    public ResponseException(@Y61.k io.ktor.client.statement.d dVar, @Y61.k String str) {
        super("Bad response: " + dVar + ". Text: \"" + str + '\"');
    }
}
