package io.ktor.client.network.sockets;

import Y61.k;
import Y61.l;
import java.net.ConnectException;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TimeoutExceptions.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/client/network/sockets/ConnectTimeoutException;", "Ljava/net/ConnectException;", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ConnectTimeoutException extends ConnectException {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Throwable f398997b;

    public /* synthetic */ ConnectTimeoutException(String str, Throwable th2, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : th2);
    }

    @Override // java.lang.Throwable
    @l
    public final Throwable getCause() {
        return this.f398997b;
    }

    public ConnectTimeoutException(@k String str, @l Throwable th2) {
        super(str);
        this.f398997b = th2;
    }
}
