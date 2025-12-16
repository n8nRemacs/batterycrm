package io.ktor.client.plugins;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import io.ktor.client.network.sockets.ConnectTimeoutException;
import io.ktor.client.network.sockets.SocketTimeoutException;
import io.ktor.client.plugins.i0;
import io.ktor.util.InterfaceC41603j0;
import kotlin.Metadata;

/* compiled from: HttpTimeout.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-client-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final org.slf4j.a f399483a = org.slf4j.b.e("io.ktor.client.plugins.HttpTimeout");

    @Y61.k
    public static final ConnectTimeoutException a(@Y61.k io.ktor.client.request.e0 e0Var, @Y61.l Throwable th2) {
        Object obj;
        StringBuilder sb2 = new StringBuilder("Connect timeout has expired [url=");
        sb2.append(e0Var.f399714a);
        sb2.append(", connect_timeout=");
        i0.a aVar = (i0.a) e0Var.a(i0.f399440d);
        if (aVar == null || (obj = aVar.f399446b) == null) {
            obj = "unknown";
        }
        return new ConnectTimeoutException(androidx.appcompat.app.r.o(obj, " ms]", sb2), th2);
    }

    @Y61.k
    public static final SocketTimeoutException b(@Y61.k io.ktor.client.request.e0 e0Var, @Y61.l Throwable th2) {
        Object obj;
        StringBuilder sb2 = new StringBuilder("Socket timeout has expired [url=");
        sb2.append(e0Var.f399714a);
        sb2.append(", socket_timeout=");
        i0.a aVar = (i0.a) e0Var.a(i0.f399440d);
        if (aVar == null || (obj = aVar.f399447c) == null) {
            obj = "unknown";
        }
        return new SocketTimeoutException(androidx.appcompat.app.r.o(obj, "] ms", sb2), th2);
    }

    @InterfaceC41603j0
    public static final int c(long j12) {
        if (j12 == Long.MAX_VALUE) {
            return 0;
        }
        if (j12 < -2147483648L) {
            return BeduinInputModel.MIN_TEXT_VERSION;
        }
        if (j12 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) j12;
    }
}
