package io.ktor.client.plugins.logging;

import kotlin.Metadata;

/* compiled from: Logger.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/client/plugins/logging/C;", "Lio/ktor/client/plugins/logging/f;", "<init>", "()V", "ktor-client-logging"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
final class C implements f {
    @Override // io.ktor.client.plugins.logging.f
    public final void log(@Y61.k String str) {
        System.out.println((Object) "HttpClient: ".concat(str));
    }
}
