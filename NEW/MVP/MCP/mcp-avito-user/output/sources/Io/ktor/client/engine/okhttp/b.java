package io.ktor.client.engine.okhttp;

import io.ktor.client.plugins.k0;
import io.ktor.client.request.e0;
import java.io.IOException;
import java.net.SocketTimeoutException;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.text.C43066x;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/* compiled from: OkUtils.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/client/engine/okhttp/b;", "Lokhttp3/Callback;", "ktor-client-okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
final class b implements Callback {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final e0 f398912b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final kotlinx.coroutines.r f398913c;

    public b(@Y61.k e0 e0Var, @Y61.k kotlinx.coroutines.r rVar) {
        this.f398912b = e0Var;
        this.f398913c = rVar;
    }

    @Override // okhttp3.Callback
    public final void onFailure(@Y61.k Call call, @Y61.k IOException iOException) {
        kotlinx.coroutines.r rVar = this.f398913c;
        if (rVar.u()) {
            return;
        }
        int i12 = Z.f406624c;
        if (iOException instanceof StreamAdapterIOException) {
            Throwable cause = iOException.getCause();
            if (cause != null) {
                iOException = cause;
            }
        } else if (iOException instanceof SocketTimeoutException) {
            String message = iOException.getMessage();
            e0 e0Var = this.f398912b;
            iOException = (message == null || !C43066x.q(message, "connect", true)) ? k0.b(e0Var, iOException) : k0.a(e0Var, iOException);
        }
        rVar.resumeWith(new Z.b(iOException));
    }

    @Override // okhttp3.Callback
    public final void onResponse(@Y61.k Call call, @Y61.k Response response) {
        if (call.getCanceled()) {
            return;
        }
        int i12 = Z.f406624c;
        this.f398913c.resumeWith(response);
    }
}
