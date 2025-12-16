package com.avito.android.remote.analytics;

import com.avito.android.quic.cronet.CronetException;
import com.avito.android.remote.model.AdvertStatus;
import com.avito.android.remote.model.payment.status.PaymentStateKt;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.BindException;
import java.net.ConnectException;
import java.net.HttpRetryException;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.PortUnreachableException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URISyntaxException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import javax.inject.Inject;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLKeyException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.text.C43066x;
import okhttp3.internal.connection.RouteException;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;

/* compiled from: NetworkLayerErrorNames.kt */
@h31.j
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/analytics/y;", "", "_avito_performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.quic.cronet.o f253272a;

    @Inject
    public y(@Y61.k com.avito.android.quic.cronet.o oVar) {
        this.f253272a = oVar;
    }

    @Y61.l
    public static String b(@Y61.k Throwable th2) {
        boolean z12 = th2 instanceof IOException;
        if (z12 && C43066x.C(th2.getMessage(), PaymentStateKt.PAYMENT_STATE_CANCELED, true)) {
            return PaymentStateKt.PAYMENT_STATE_CANCELED;
        }
        if (z12 && C43066x.C(th2.getMessage(), AdvertStatus.CLOSED, true)) {
            return AdvertStatus.CLOSED;
        }
        if (z12 && C43066x.C(th2.getMessage(), "stream closed", true)) {
            return "stream closed";
        }
        if (th2 instanceof InterruptedIOException) {
            return "interrupted";
        }
        if ((th2 instanceof IllegalStateException) && C43066x.C(th2.getMessage(), AdvertStatus.CLOSED, true)) {
            return AdvertStatus.CLOSED;
        }
        return null;
    }

    @Y61.l
    public final String a(@Y61.k Throwable th2) {
        String str = "no route to host";
        String str2 = null;
        String str3 = th2 instanceof UnknownHostException ? "unknown host" : th2 instanceof ProtocolException ? "protocol error" : th2 instanceof BindException ? "bind error" : th2 instanceof ConnectException ? "connect error" : th2 instanceof HttpRetryException ? "http retry" : th2 instanceof MalformedURLException ? "malformed url" : th2 instanceof NoRouteToHostException ? "no route to host" : th2 instanceof PortUnreachableException ? "port unreachable" : th2 instanceof SocketException ? "socket error" : th2 instanceof SocketTimeoutException ? "socket timeout" : th2 instanceof UnknownServiceException ? "unknown service" : th2 instanceof URISyntaxException ? "uri syntax error" : null;
        if (str3 != null) {
            return str3;
        }
        String str4 = th2 instanceof ConnectionShutdownException ? "connection shutdown" : th2 instanceof StreamResetException ? "stream reset" : th2 instanceof RouteException ? "route exception" : null;
        if (str4 != null) {
            return str4;
        }
        String str5 = th2 instanceof SSLHandshakeException ? "ssl handshake error" : th2 instanceof SSLKeyException ? "ssl key error" : th2 instanceof SSLPeerUnverifiedException ? "ssl peer unverified" : th2 instanceof SSLProtocolException ? "ssl protocol error" : th2 instanceof SSLException ? "ssl error" : null;
        if (str5 != null) {
            return str5;
        }
        String strB = b(th2);
        if (strB != null) {
            return strB;
        }
        Throwable thA = th2 instanceof CronetException ? (IOException) th2 : this.f253272a.a(th2);
        if (thA instanceof CronetException) {
            CronetException cronetException = (CronetException) thA;
            if (cronetException instanceof CronetException.HostnameNotResolved) {
                str = "unknown host";
            } else if (cronetException instanceof CronetException.InternetDisconnected) {
                str = "internet disconnected";
            } else if (cronetException instanceof CronetException.NetworkChanged) {
                str = "network changed";
            } else if (cronetException instanceof CronetException.TimedOut) {
                str = "timed out";
            } else if (cronetException instanceof CronetException.ConnectionClosed) {
                str = AdvertStatus.CLOSED;
            } else if (cronetException instanceof CronetException.ConnectionTimedOut) {
                str = "connection timed out";
            } else if (cronetException instanceof CronetException.ConnectionRefused) {
                str = "connection refused";
            } else if (cronetException instanceof CronetException.ConnectionReset) {
                str = "connection reset";
            } else if (!(cronetException instanceof CronetException.AddressUnreachable)) {
                if (cronetException instanceof CronetException.QuicProtocolFailed) {
                    str = "quic protocol failed";
                } else if (cronetException instanceof CronetException.Other) {
                    str = "cronet other";
                } else if (cronetException instanceof CronetException.FailedCronetErrorParsing) {
                    str = "failed cronet error parsing";
                } else if (cronetException instanceof CronetException.TcpReset) {
                    str = "tcp reset";
                } else {
                    if (!(cronetException instanceof CronetException.CronetHandledRetryReporting)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "cronet handled retry, should not be in clickstream";
                }
            }
            str2 = str;
        }
        return str2;
    }
}
