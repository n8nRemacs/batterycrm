package io.ktor.client.plugins;

import io.ktor.client.network.sockets.ConnectTimeoutException;
import io.ktor.client.network.sockets.SocketTimeoutException;
import io.ktor.client.plugins.U;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;

/* compiled from: HttpRequestRetry.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lio/ktor/client/plugins/U$f;", "Lio/ktor/client/request/d0;", "<anonymous parameter 0>", "", "cause", "", "invoke", "(Lio/ktor/client/plugins/U$f;Lio/ktor/client/request/d0;Ljava/lang/Throwable;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes8.dex */
final class Z extends kotlin.jvm.internal.N implements Y41.q<U.f, io.ktor.client.request.d0, Throwable, Boolean> {
    @Override // Y41.q
    public final Boolean invoke(U.f fVar, io.ktor.client.request.d0 d0Var, Throwable th2) {
        Throwable th3 = th2;
        org.slf4j.a aVar = d0.f399406a;
        Throwable thA = io.ktor.client.utils.o.a(th3);
        boolean z12 = false;
        if (!(thA instanceof HttpRequestTimeoutException) && !(thA instanceof ConnectTimeoutException) && !(thA instanceof SocketTimeoutException) && !(th3 instanceof CancellationException)) {
            z12 = true;
        }
        return Boolean.valueOf(z12);
    }
}
