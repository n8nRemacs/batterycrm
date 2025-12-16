package okhttp3;

import X41.i;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.text.selection.C21030p;
import java.net.Proxy;
import java.net.ProxySelector;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Interceptor;
import okhttp3.WebSocket;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RouteDatabase;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.proxy.NullProxySelector;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.OkHostnameVerifier;
import okhttp3.internal.ws.RealWebSocket;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* compiled from: OkHttpClient.kt */
@s0
@Metadata(d1 = {"\u0000ð\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 \u0090\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0004\u0091\u0001\u0090\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0018\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u001c\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0007¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0007¢\u0006\u0004\b\"\u0010 J\u000f\u0010'\u001a\u00020$H\u0007¢\u0006\u0004\b%\u0010&J\u000f\u0010+\u001a\u00020(H\u0007¢\u0006\u0004\b)\u0010*J\u000f\u0010/\u001a\u00020,H\u0007¢\u0006\u0004\b-\u0010.J\u000f\u00101\u001a\u00020(H\u0007¢\u0006\u0004\b0\u0010*J\u000f\u00103\u001a\u00020(H\u0007¢\u0006\u0004\b2\u0010*J\u000f\u00107\u001a\u000204H\u0007¢\u0006\u0004\b5\u00106J\u0011\u0010;\u001a\u0004\u0018\u000108H\u0007¢\u0006\u0004\b9\u0010:J\u000f\u0010?\u001a\u00020<H\u0007¢\u0006\u0004\b=\u0010>J\u0011\u0010C\u001a\u0004\u0018\u00010@H\u0007¢\u0006\u0004\bA\u0010BJ\u000f\u0010G\u001a\u00020DH\u0007¢\u0006\u0004\bE\u0010FJ\u000f\u0010I\u001a\u00020,H\u0007¢\u0006\u0004\bH\u0010.J\u000f\u0010M\u001a\u00020JH\u0007¢\u0006\u0004\bK\u0010LJ\u000f\u0010Q\u001a\u00020NH\u0007¢\u0006\u0004\bO\u0010PJ\u0015\u0010T\u001a\b\u0012\u0004\u0012\u00020R0\u001dH\u0007¢\u0006\u0004\bS\u0010 J\u0015\u0010W\u001a\b\u0012\u0004\u0012\u00020U0\u001dH\u0007¢\u0006\u0004\bV\u0010 J\u000f\u0010[\u001a\u00020XH\u0007¢\u0006\u0004\bY\u0010ZJ\u000f\u0010_\u001a\u00020\\H\u0007¢\u0006\u0004\b]\u0010^J\u000f\u0010c\u001a\u00020`H\u0007¢\u0006\u0004\ba\u0010bJ\u000f\u0010e\u001a\u00020`H\u0007¢\u0006\u0004\bd\u0010bJ\u000f\u0010g\u001a\u00020`H\u0007¢\u0006\u0004\bf\u0010bJ\u000f\u0010i\u001a\u00020`H\u0007¢\u0006\u0004\bh\u0010bJ\u000f\u0010k\u001a\u00020`H\u0007¢\u0006\u0004\bj\u0010bJ\u000f\u0010m\u001a\u00020lH\u0002¢\u0006\u0004\bm\u0010\bR\u0017\u0010\u0018\u001a\u00020\u00158G¢\u0006\f\n\u0004\b\u0018\u0010n\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u001c\u001a\u00020\u00198G¢\u0006\f\n\u0004\b\u001c\u0010o\u001a\u0004\b\u001c\u0010\u001bR\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8G¢\u0006\f\n\u0004\b!\u0010p\u001a\u0004\b!\u0010 R\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8G¢\u0006\f\n\u0004\b#\u0010p\u001a\u0004\b#\u0010 R\u0017\u0010'\u001a\u00020$8G¢\u0006\f\n\u0004\b'\u0010q\u001a\u0004\b'\u0010&R\u0017\u0010+\u001a\u00020(8G¢\u0006\f\n\u0004\b+\u0010r\u001a\u0004\b+\u0010*R\u0017\u0010/\u001a\u00020,8G¢\u0006\f\n\u0004\b/\u0010s\u001a\u0004\b/\u0010.R\u0017\u00101\u001a\u00020(8G¢\u0006\f\n\u0004\b1\u0010r\u001a\u0004\b1\u0010*R\u0017\u00103\u001a\u00020(8G¢\u0006\f\n\u0004\b3\u0010r\u001a\u0004\b3\u0010*R\u0017\u00107\u001a\u0002048G¢\u0006\f\n\u0004\b7\u0010t\u001a\u0004\b7\u00106R\u0019\u0010;\u001a\u0004\u0018\u0001088G¢\u0006\f\n\u0004\b;\u0010u\u001a\u0004\b;\u0010:R\u0017\u0010?\u001a\u00020<8G¢\u0006\f\n\u0004\b?\u0010v\u001a\u0004\b?\u0010>R\u0019\u0010C\u001a\u0004\u0018\u00010@8G¢\u0006\f\n\u0004\bC\u0010w\u001a\u0004\bC\u0010BR\u0017\u0010G\u001a\u00020D8G¢\u0006\f\n\u0004\bG\u0010x\u001a\u0004\bG\u0010FR\u0017\u0010I\u001a\u00020,8G¢\u0006\f\n\u0004\bI\u0010s\u001a\u0004\bI\u0010.R\u0017\u0010M\u001a\u00020J8G¢\u0006\f\n\u0004\bM\u0010y\u001a\u0004\bM\u0010LR\u0016\u0010z\u001a\u0004\u0018\u00010N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010{R\u0019\u0010}\u001a\u0004\u0018\u00010|8G¢\u0006\f\n\u0004\b}\u0010~\u001a\u0004\b}\u0010\u007fR\u001d\u0010T\u001a\b\u0012\u0004\u0012\u00020R0\u001d8G¢\u0006\f\n\u0004\bT\u0010p\u001a\u0004\bT\u0010 R\u001d\u0010W\u001a\b\u0012\u0004\u0012\u00020U0\u001d8G¢\u0006\f\n\u0004\bW\u0010p\u001a\u0004\bW\u0010 R\u0018\u0010[\u001a\u00020X8G¢\u0006\r\n\u0005\b[\u0010\u0080\u0001\u001a\u0004\b[\u0010ZR\u0018\u0010_\u001a\u00020\\8G¢\u0006\r\n\u0005\b_\u0010\u0081\u0001\u001a\u0004\b_\u0010^R\u001f\u0010\u0083\u0001\u001a\u0005\u0018\u00010\u0082\u00018G¢\u0006\u0010\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0006\b\u0083\u0001\u0010\u0085\u0001R\u0018\u0010c\u001a\u00020`8G¢\u0006\r\n\u0005\bc\u0010\u0086\u0001\u001a\u0004\bc\u0010bR\u0018\u0010e\u001a\u00020`8G¢\u0006\r\n\u0005\be\u0010\u0086\u0001\u001a\u0004\be\u0010bR\u0018\u0010g\u001a\u00020`8G¢\u0006\r\n\u0005\bg\u0010\u0086\u0001\u001a\u0004\bg\u0010bR\u0018\u0010i\u001a\u00020`8G¢\u0006\r\n\u0005\bi\u0010\u0086\u0001\u001a\u0004\bi\u0010bR\u0018\u0010k\u001a\u00020`8G¢\u0006\r\n\u0005\bk\u0010\u0086\u0001\u001a\u0004\bk\u0010bR\u001d\u0010\u0088\u0001\u001a\u00030\u0087\u00018G¢\u0006\u0010\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0006\b\u0088\u0001\u0010\u008a\u0001R\u001d\u0010\u008c\u0001\u001a\u00030\u008b\u00018\u0006¢\u0006\u0010\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0011\u0010Q\u001a\u00020N8G¢\u0006\u0006\u001a\u0004\bQ\u0010P¨\u0006\u0092\u0001"}, d2 = {"Lokhttp3/OkHttpClient;", "", "Lokhttp3/Call$Factory;", "Lokhttp3/WebSocket$Factory;", "Lokhttp3/OkHttpClient$Builder;", "builder", "<init>", "(Lokhttp3/OkHttpClient$Builder;)V", "()V", "Lokhttp3/Request;", "request", "Lokhttp3/Call;", "newCall", "(Lokhttp3/Request;)Lokhttp3/Call;", "Lokhttp3/WebSocketListener;", "listener", "Lokhttp3/WebSocket;", "newWebSocket", "(Lokhttp3/Request;Lokhttp3/WebSocketListener;)Lokhttp3/WebSocket;", "newBuilder", "()Lokhttp3/OkHttpClient$Builder;", "Lokhttp3/Dispatcher;", "-deprecated_dispatcher", "()Lokhttp3/Dispatcher;", "dispatcher", "Lokhttp3/ConnectionPool;", "-deprecated_connectionPool", "()Lokhttp3/ConnectionPool;", "connectionPool", "", "Lokhttp3/Interceptor;", "-deprecated_interceptors", "()Ljava/util/List;", "interceptors", "-deprecated_networkInterceptors", "networkInterceptors", "Lokhttp3/EventListener$Factory;", "-deprecated_eventListenerFactory", "()Lokhttp3/EventListener$Factory;", "eventListenerFactory", "", "-deprecated_retryOnConnectionFailure", "()Z", "retryOnConnectionFailure", "Lokhttp3/Authenticator;", "-deprecated_authenticator", "()Lokhttp3/Authenticator;", "authenticator", "-deprecated_followRedirects", "followRedirects", "-deprecated_followSslRedirects", "followSslRedirects", "Lokhttp3/CookieJar;", "-deprecated_cookieJar", "()Lokhttp3/CookieJar;", "cookieJar", "Lokhttp3/Cache;", "-deprecated_cache", "()Lokhttp3/Cache;", "cache", "Lokhttp3/Dns;", "-deprecated_dns", "()Lokhttp3/Dns;", "dns", "Ljava/net/Proxy;", "-deprecated_proxy", "()Ljava/net/Proxy;", "proxy", "Ljava/net/ProxySelector;", "-deprecated_proxySelector", "()Ljava/net/ProxySelector;", "proxySelector", "-deprecated_proxyAuthenticator", "proxyAuthenticator", "Ljavax/net/SocketFactory;", "-deprecated_socketFactory", "()Ljavax/net/SocketFactory;", "socketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "-deprecated_sslSocketFactory", "()Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Lokhttp3/ConnectionSpec;", "-deprecated_connectionSpecs", "connectionSpecs", "Lokhttp3/Protocol;", "-deprecated_protocols", "protocols", "Ljavax/net/ssl/HostnameVerifier;", "-deprecated_hostnameVerifier", "()Ljavax/net/ssl/HostnameVerifier;", "hostnameVerifier", "Lokhttp3/CertificatePinner;", "-deprecated_certificatePinner", "()Lokhttp3/CertificatePinner;", "certificatePinner", "", "-deprecated_callTimeoutMillis", "()I", "callTimeoutMillis", "-deprecated_connectTimeoutMillis", "connectTimeoutMillis", "-deprecated_readTimeoutMillis", "readTimeoutMillis", "-deprecated_writeTimeoutMillis", "writeTimeoutMillis", "-deprecated_pingIntervalMillis", "pingIntervalMillis", "Lkotlin/G0;", "verifyClientState", "Lokhttp3/Dispatcher;", "Lokhttp3/ConnectionPool;", "Ljava/util/List;", "Lokhttp3/EventListener$Factory;", "Z", "Lokhttp3/Authenticator;", "Lokhttp3/CookieJar;", "Lokhttp3/Cache;", "Lokhttp3/Dns;", "Ljava/net/Proxy;", "Ljava/net/ProxySelector;", "Ljavax/net/SocketFactory;", "sslSocketFactoryOrNull", "Ljavax/net/ssl/SSLSocketFactory;", "Ljavax/net/ssl/X509TrustManager;", "x509TrustManager", "Ljavax/net/ssl/X509TrustManager;", "()Ljavax/net/ssl/X509TrustManager;", "Ljavax/net/ssl/HostnameVerifier;", "Lokhttp3/CertificatePinner;", "Lokhttp3/internal/tls/CertificateChainCleaner;", "certificateChainCleaner", "Lokhttp3/internal/tls/CertificateChainCleaner;", "()Lokhttp3/internal/tls/CertificateChainCleaner;", "I", "", "minWebSocketMessageToCompress", "J", "()J", "Lokhttp3/internal/connection/RouteDatabase;", "routeDatabase", "Lokhttp3/internal/connection/RouteDatabase;", "getRouteDatabase", "()Lokhttp3/internal/connection/RouteDatabase;", "Companion", "Builder", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public class OkHttpClient implements Cloneable, Call.Factory, WebSocket.Factory {

    @k
    private final Authenticator authenticator;

    @l
    private final Cache cache;
    private final int callTimeoutMillis;

    @l
    private final CertificateChainCleaner certificateChainCleaner;

    @k
    private final CertificatePinner certificatePinner;
    private final int connectTimeoutMillis;

    @k
    private final ConnectionPool connectionPool;

    @k
    private final List<ConnectionSpec> connectionSpecs;

    @k
    private final CookieJar cookieJar;

    @k
    private final Dispatcher dispatcher;

    @k
    private final Dns dns;

    @k
    private final EventListener.Factory eventListenerFactory;
    private final boolean followRedirects;
    private final boolean followSslRedirects;

    @k
    private final HostnameVerifier hostnameVerifier;

    @k
    private final List<Interceptor> interceptors;
    private final long minWebSocketMessageToCompress;

    @k
    private final List<Interceptor> networkInterceptors;
    private final int pingIntervalMillis;

    @k
    private final List<Protocol> protocols;

    @l
    private final Proxy proxy;

    @k
    private final Authenticator proxyAuthenticator;

    @k
    private final ProxySelector proxySelector;
    private final int readTimeoutMillis;
    private final boolean retryOnConnectionFailure;

    @k
    private final RouteDatabase routeDatabase;

    @k
    private final SocketFactory socketFactory;

    @l
    private final SSLSocketFactory sslSocketFactoryOrNull;
    private final int writeTimeoutMillis;

    @l
    private final X509TrustManager x509TrustManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @k
    private static final List<Protocol> DEFAULT_PROTOCOLS = Util.immutableListOf(Protocol.HTTP_2, Protocol.HTTP_1_1);

    @k
    private static final List<ConnectionSpec> DEFAULT_CONNECTION_SPECS = Util.immutableListOf(ConnectionSpec.MODERN_TLS, ConnectionSpec.CLEARTEXT);

    /* compiled from: OkHttpClient.kt */
    @s0
    @Metadata(d1 = {"\u0000ø\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\bg\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J8\u0010\u0012\u001a\u00020\u00002#\b\u0004\u0010\u001a\u001a\u001d\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00190\u0014H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u001d\u0010\u0010J\u0015\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u001e\u0010\u0013J8\u0010\u001e\u001a\u00020\u00002#\b\u0004\u0010\u001a\u001a\u001d\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00190\u0014H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u001cJ\u0015\u0010!\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\u00020\u00002\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\u00020\u00002\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b'\u0010(J\u0015\u0010*\u001a\u00020\u00002\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b*\u0010+J\u0015\u0010,\u001a\u00020\u00002\u0006\u0010,\u001a\u00020&¢\u0006\u0004\b,\u0010(J\u0015\u0010.\u001a\u00020\u00002\u0006\u0010-\u001a\u00020&¢\u0006\u0004\b.\u0010(J\u0015\u00100\u001a\u00020\u00002\u0006\u00100\u001a\u00020/¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\u00002\b\u00103\u001a\u0004\u0018\u000102¢\u0006\u0004\b3\u00104J\u0015\u00106\u001a\u00020\u00002\u0006\u00106\u001a\u000205¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u00020\u00002\b\u00109\u001a\u0004\u0018\u000108¢\u0006\u0004\b9\u0010:J\u0015\u0010<\u001a\u00020\u00002\u0006\u0010<\u001a\u00020;¢\u0006\u0004\b<\u0010=J\u0015\u0010>\u001a\u00020\u00002\u0006\u0010>\u001a\u00020)¢\u0006\u0004\b>\u0010+J\u0015\u0010@\u001a\u00020\u00002\u0006\u0010@\u001a\u00020?¢\u0006\u0004\b@\u0010AJ\u0017\u0010C\u001a\u00020\u00002\u0006\u0010C\u001a\u00020BH\u0007¢\u0006\u0004\bC\u0010DJ\u001d\u0010C\u001a\u00020\u00002\u0006\u0010C\u001a\u00020B2\u0006\u0010F\u001a\u00020E¢\u0006\u0004\bC\u0010GJ\u001b\u0010J\u001a\u00020\u00002\f\u0010J\u001a\b\u0012\u0004\u0012\u00020I0H¢\u0006\u0004\bJ\u0010KJ\u001b\u0010M\u001a\u00020\u00002\f\u0010M\u001a\b\u0012\u0004\u0012\u00020L0H¢\u0006\u0004\bM\u0010KJ\u0015\u0010O\u001a\u00020\u00002\u0006\u0010O\u001a\u00020N¢\u0006\u0004\bO\u0010PJ\u0015\u0010R\u001a\u00020\u00002\u0006\u0010R\u001a\u00020Q¢\u0006\u0004\bR\u0010SJ\u001d\u0010X\u001a\u00020\u00002\u0006\u0010U\u001a\u00020T2\u0006\u0010W\u001a\u00020V¢\u0006\u0004\bX\u0010YJ\u0017\u0010X\u001a\u00020\u00002\u0006\u0010[\u001a\u00020ZH\u0007¢\u0006\u0004\bX\u0010\\J\u001d\u0010]\u001a\u00020\u00002\u0006\u0010U\u001a\u00020T2\u0006\u0010W\u001a\u00020V¢\u0006\u0004\b]\u0010YJ\u0017\u0010]\u001a\u00020\u00002\u0006\u0010[\u001a\u00020ZH\u0007¢\u0006\u0004\b]\u0010\\J\u001d\u0010^\u001a\u00020\u00002\u0006\u0010U\u001a\u00020T2\u0006\u0010W\u001a\u00020V¢\u0006\u0004\b^\u0010YJ\u0017\u0010^\u001a\u00020\u00002\u0006\u0010[\u001a\u00020ZH\u0007¢\u0006\u0004\b^\u0010\\J\u001d\u0010_\u001a\u00020\u00002\u0006\u0010U\u001a\u00020T2\u0006\u0010W\u001a\u00020V¢\u0006\u0004\b_\u0010YJ\u0017\u0010_\u001a\u00020\u00002\u0006\u0010[\u001a\u00020ZH\u0007¢\u0006\u0004\b_\u0010\\J\u001d\u0010a\u001a\u00020\u00002\u0006\u0010`\u001a\u00020T2\u0006\u0010W\u001a\u00020V¢\u0006\u0004\ba\u0010YJ\u0017\u0010a\u001a\u00020\u00002\u0006\u0010[\u001a\u00020ZH\u0007¢\u0006\u0004\ba\u0010\\J\u0015\u0010c\u001a\u00020\u00002\u0006\u0010b\u001a\u00020T¢\u0006\u0004\bc\u0010dJ\r\u0010e\u001a\u00020\u0004¢\u0006\u0004\be\u0010fR\"\u0010\b\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\"\u0010\u000b\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010q\u001a\u0004\br\u0010\u0010R \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010q\u001a\u0004\bs\u0010\u0010R\"\u0010$\u001a\u00020#8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b$\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR\"\u0010'\u001a\u00020&8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010y\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R%\u0010*\u001a\u00020)8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0004\b*\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R$\u0010,\u001a\u00020&8\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\b,\u0010y\u001a\u0005\b\u0083\u0001\u0010{\"\u0005\b\u0084\u0001\u0010}R$\u0010.\u001a\u00020&8\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\b.\u0010y\u001a\u0005\b\u0085\u0001\u0010{\"\u0005\b\u0086\u0001\u0010}R'\u00100\u001a\u00020/8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b0\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001R)\u00103\u001a\u0004\u0018\u0001028\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b3\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001\"\u0006\b\u008f\u0001\u0010\u0090\u0001R'\u00106\u001a\u0002058\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b6\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u0006\b\u0094\u0001\u0010\u0095\u0001R)\u00109\u001a\u0004\u0018\u0001088\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b9\u0010\u0096\u0001\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001\"\u0006\b\u0099\u0001\u0010\u009a\u0001R)\u0010<\u001a\u0004\u0018\u00010;8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b<\u0010\u009b\u0001\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001\"\u0006\b\u009e\u0001\u0010\u009f\u0001R&\u0010>\u001a\u00020)8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0004\b>\u0010~\u001a\u0006\b \u0001\u0010\u0080\u0001\"\u0006\b¡\u0001\u0010\u0082\u0001R'\u0010@\u001a\u00020?8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b@\u0010¢\u0001\u001a\u0006\b£\u0001\u0010¤\u0001\"\u0006\b¥\u0001\u0010¦\u0001R+\u0010§\u0001\u001a\u0004\u0018\u00010B8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b§\u0001\u0010¨\u0001\u001a\u0006\b©\u0001\u0010ª\u0001\"\u0006\b«\u0001\u0010¬\u0001R+\u0010\u00ad\u0001\u001a\u0004\u0018\u00010E8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u00ad\u0001\u0010®\u0001\u001a\u0006\b¯\u0001\u0010°\u0001\"\u0006\b±\u0001\u0010²\u0001R+\u0010J\u001a\b\u0012\u0004\u0012\u00020I0H8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0004\bJ\u0010q\u001a\u0005\b³\u0001\u0010\u0010\"\u0006\b´\u0001\u0010µ\u0001R+\u0010M\u001a\b\u0012\u0004\u0012\u00020L0H8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0004\bM\u0010q\u001a\u0005\b¶\u0001\u0010\u0010\"\u0006\b·\u0001\u0010µ\u0001R'\u0010O\u001a\u00020N8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bO\u0010¸\u0001\u001a\u0006\b¹\u0001\u0010º\u0001\"\u0006\b»\u0001\u0010¼\u0001R'\u0010R\u001a\u00020Q8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bR\u0010½\u0001\u001a\u0006\b¾\u0001\u0010¿\u0001\"\u0006\bÀ\u0001\u0010Á\u0001R,\u0010Ã\u0001\u001a\u0005\u0018\u00010Â\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÃ\u0001\u0010Ä\u0001\u001a\u0006\bÅ\u0001\u0010Æ\u0001\"\u0006\bÇ\u0001\u0010È\u0001R(\u0010X\u001a\u00030É\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bX\u0010Ê\u0001\u001a\u0006\bË\u0001\u0010Ì\u0001\"\u0006\bÍ\u0001\u0010Î\u0001R(\u0010]\u001a\u00030É\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b]\u0010Ê\u0001\u001a\u0006\bÏ\u0001\u0010Ì\u0001\"\u0006\bÐ\u0001\u0010Î\u0001R(\u0010^\u001a\u00030É\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b^\u0010Ê\u0001\u001a\u0006\bÑ\u0001\u0010Ì\u0001\"\u0006\bÒ\u0001\u0010Î\u0001R(\u0010_\u001a\u00030É\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b_\u0010Ê\u0001\u001a\u0006\bÓ\u0001\u0010Ì\u0001\"\u0006\bÔ\u0001\u0010Î\u0001R(\u0010a\u001a\u00030É\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\ba\u0010Ê\u0001\u001a\u0006\bÕ\u0001\u0010Ì\u0001\"\u0006\bÖ\u0001\u0010Î\u0001R'\u0010c\u001a\u00020T8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bc\u0010×\u0001\u001a\u0006\bØ\u0001\u0010Ù\u0001\"\u0006\bÚ\u0001\u0010Û\u0001R,\u0010Ý\u0001\u001a\u0005\u0018\u00010Ü\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÝ\u0001\u0010Þ\u0001\u001a\u0006\bß\u0001\u0010à\u0001\"\u0006\bá\u0001\u0010â\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006ã\u0001"}, d2 = {"Lokhttp3/OkHttpClient$Builder;", "", "<init>", "()V", "Lokhttp3/OkHttpClient;", "okHttpClient", "(Lokhttp3/OkHttpClient;)V", "Lokhttp3/Dispatcher;", "dispatcher", "(Lokhttp3/Dispatcher;)Lokhttp3/OkHttpClient$Builder;", "Lokhttp3/ConnectionPool;", "connectionPool", "(Lokhttp3/ConnectionPool;)Lokhttp3/OkHttpClient$Builder;", "", "Lokhttp3/Interceptor;", "interceptors", "()Ljava/util/List;", "interceptor", "addInterceptor", "(Lokhttp3/Interceptor;)Lokhttp3/OkHttpClient$Builder;", "Lkotlin/Function1;", "Lokhttp3/Interceptor$Chain;", "Lkotlin/S;", "name", "chain", "Lokhttp3/Response;", "block", "-addInterceptor", "(LY41/l;)Lokhttp3/OkHttpClient$Builder;", "networkInterceptors", "addNetworkInterceptor", "-addNetworkInterceptor", "Lokhttp3/EventListener;", "eventListener", "(Lokhttp3/EventListener;)Lokhttp3/OkHttpClient$Builder;", "Lokhttp3/EventListener$Factory;", "eventListenerFactory", "(Lokhttp3/EventListener$Factory;)Lokhttp3/OkHttpClient$Builder;", "", "retryOnConnectionFailure", "(Z)Lokhttp3/OkHttpClient$Builder;", "Lokhttp3/Authenticator;", "authenticator", "(Lokhttp3/Authenticator;)Lokhttp3/OkHttpClient$Builder;", "followRedirects", "followProtocolRedirects", "followSslRedirects", "Lokhttp3/CookieJar;", "cookieJar", "(Lokhttp3/CookieJar;)Lokhttp3/OkHttpClient$Builder;", "Lokhttp3/Cache;", "cache", "(Lokhttp3/Cache;)Lokhttp3/OkHttpClient$Builder;", "Lokhttp3/Dns;", "dns", "(Lokhttp3/Dns;)Lokhttp3/OkHttpClient$Builder;", "Ljava/net/Proxy;", "proxy", "(Ljava/net/Proxy;)Lokhttp3/OkHttpClient$Builder;", "Ljava/net/ProxySelector;", "proxySelector", "(Ljava/net/ProxySelector;)Lokhttp3/OkHttpClient$Builder;", "proxyAuthenticator", "Ljavax/net/SocketFactory;", "socketFactory", "(Ljavax/net/SocketFactory;)Lokhttp3/OkHttpClient$Builder;", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "(Ljavax/net/ssl/SSLSocketFactory;)Lokhttp3/OkHttpClient$Builder;", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "(Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;)Lokhttp3/OkHttpClient$Builder;", "", "Lokhttp3/ConnectionSpec;", "connectionSpecs", "(Ljava/util/List;)Lokhttp3/OkHttpClient$Builder;", "Lokhttp3/Protocol;", "protocols", "Ljavax/net/ssl/HostnameVerifier;", "hostnameVerifier", "(Ljavax/net/ssl/HostnameVerifier;)Lokhttp3/OkHttpClient$Builder;", "Lokhttp3/CertificatePinner;", "certificatePinner", "(Lokhttp3/CertificatePinner;)Lokhttp3/OkHttpClient$Builder;", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "callTimeout", "(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;", "Ljava/time/Duration;", "duration", "(Ljava/time/Duration;)Lokhttp3/OkHttpClient$Builder;", "connectTimeout", "readTimeout", "writeTimeout", "interval", "pingInterval", "bytes", "minWebSocketMessageToCompress", "(J)Lokhttp3/OkHttpClient$Builder;", "build", "()Lokhttp3/OkHttpClient;", "Lokhttp3/Dispatcher;", "getDispatcher$okhttp", "()Lokhttp3/Dispatcher;", "setDispatcher$okhttp", "(Lokhttp3/Dispatcher;)V", "Lokhttp3/ConnectionPool;", "getConnectionPool$okhttp", "()Lokhttp3/ConnectionPool;", "setConnectionPool$okhttp", "(Lokhttp3/ConnectionPool;)V", "Ljava/util/List;", "getInterceptors$okhttp", "getNetworkInterceptors$okhttp", "Lokhttp3/EventListener$Factory;", "getEventListenerFactory$okhttp", "()Lokhttp3/EventListener$Factory;", "setEventListenerFactory$okhttp", "(Lokhttp3/EventListener$Factory;)V", "Z", "getRetryOnConnectionFailure$okhttp", "()Z", "setRetryOnConnectionFailure$okhttp", "(Z)V", "Lokhttp3/Authenticator;", "getAuthenticator$okhttp", "()Lokhttp3/Authenticator;", "setAuthenticator$okhttp", "(Lokhttp3/Authenticator;)V", "getFollowRedirects$okhttp", "setFollowRedirects$okhttp", "getFollowSslRedirects$okhttp", "setFollowSslRedirects$okhttp", "Lokhttp3/CookieJar;", "getCookieJar$okhttp", "()Lokhttp3/CookieJar;", "setCookieJar$okhttp", "(Lokhttp3/CookieJar;)V", "Lokhttp3/Cache;", "getCache$okhttp", "()Lokhttp3/Cache;", "setCache$okhttp", "(Lokhttp3/Cache;)V", "Lokhttp3/Dns;", "getDns$okhttp", "()Lokhttp3/Dns;", "setDns$okhttp", "(Lokhttp3/Dns;)V", "Ljava/net/Proxy;", "getProxy$okhttp", "()Ljava/net/Proxy;", "setProxy$okhttp", "(Ljava/net/Proxy;)V", "Ljava/net/ProxySelector;", "getProxySelector$okhttp", "()Ljava/net/ProxySelector;", "setProxySelector$okhttp", "(Ljava/net/ProxySelector;)V", "getProxyAuthenticator$okhttp", "setProxyAuthenticator$okhttp", "Ljavax/net/SocketFactory;", "getSocketFactory$okhttp", "()Ljavax/net/SocketFactory;", "setSocketFactory$okhttp", "(Ljavax/net/SocketFactory;)V", "sslSocketFactoryOrNull", "Ljavax/net/ssl/SSLSocketFactory;", "getSslSocketFactoryOrNull$okhttp", "()Ljavax/net/ssl/SSLSocketFactory;", "setSslSocketFactoryOrNull$okhttp", "(Ljavax/net/ssl/SSLSocketFactory;)V", "x509TrustManagerOrNull", "Ljavax/net/ssl/X509TrustManager;", "getX509TrustManagerOrNull$okhttp", "()Ljavax/net/ssl/X509TrustManager;", "setX509TrustManagerOrNull$okhttp", "(Ljavax/net/ssl/X509TrustManager;)V", "getConnectionSpecs$okhttp", "setConnectionSpecs$okhttp", "(Ljava/util/List;)V", "getProtocols$okhttp", "setProtocols$okhttp", "Ljavax/net/ssl/HostnameVerifier;", "getHostnameVerifier$okhttp", "()Ljavax/net/ssl/HostnameVerifier;", "setHostnameVerifier$okhttp", "(Ljavax/net/ssl/HostnameVerifier;)V", "Lokhttp3/CertificatePinner;", "getCertificatePinner$okhttp", "()Lokhttp3/CertificatePinner;", "setCertificatePinner$okhttp", "(Lokhttp3/CertificatePinner;)V", "Lokhttp3/internal/tls/CertificateChainCleaner;", "certificateChainCleaner", "Lokhttp3/internal/tls/CertificateChainCleaner;", "getCertificateChainCleaner$okhttp", "()Lokhttp3/internal/tls/CertificateChainCleaner;", "setCertificateChainCleaner$okhttp", "(Lokhttp3/internal/tls/CertificateChainCleaner;)V", "", "I", "getCallTimeout$okhttp", "()I", "setCallTimeout$okhttp", "(I)V", "getConnectTimeout$okhttp", "setConnectTimeout$okhttp", "getReadTimeout$okhttp", "setReadTimeout$okhttp", "getWriteTimeout$okhttp", "setWriteTimeout$okhttp", "getPingInterval$okhttp", "setPingInterval$okhttp", "J", "getMinWebSocketMessageToCompress$okhttp", "()J", "setMinWebSocketMessageToCompress$okhttp", "(J)V", "Lokhttp3/internal/connection/RouteDatabase;", "routeDatabase", "Lokhttp3/internal/connection/RouteDatabase;", "getRouteDatabase$okhttp", "()Lokhttp3/internal/connection/RouteDatabase;", "setRouteDatabase$okhttp", "(Lokhttp3/internal/connection/RouteDatabase;)V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {

        @k
        private Authenticator authenticator;

        @l
        private Cache cache;
        private int callTimeout;

        @l
        private CertificateChainCleaner certificateChainCleaner;

        @k
        private CertificatePinner certificatePinner;
        private int connectTimeout;

        @k
        private ConnectionPool connectionPool;

        @k
        private List<ConnectionSpec> connectionSpecs;

        @k
        private CookieJar cookieJar;

        @k
        private Dispatcher dispatcher;

        @k
        private Dns dns;

        @k
        private EventListener.Factory eventListenerFactory;
        private boolean followRedirects;
        private boolean followSslRedirects;

        @k
        private HostnameVerifier hostnameVerifier;

        @k
        private final List<Interceptor> interceptors;
        private long minWebSocketMessageToCompress;

        @k
        private final List<Interceptor> networkInterceptors;
        private int pingInterval;

        @k
        private List<? extends Protocol> protocols;

        @l
        private Proxy proxy;

        @k
        private Authenticator proxyAuthenticator;

        @l
        private ProxySelector proxySelector;
        private int readTimeout;
        private boolean retryOnConnectionFailure;

        @l
        private RouteDatabase routeDatabase;

        @k
        private SocketFactory socketFactory;

        @l
        private SSLSocketFactory sslSocketFactoryOrNull;
        private int writeTimeout;

        @l
        private X509TrustManager x509TrustManagerOrNull;

        public Builder() {
            this.dispatcher = new Dispatcher();
            this.connectionPool = new ConnectionPool();
            this.interceptors = new ArrayList();
            this.networkInterceptors = new ArrayList();
            this.eventListenerFactory = Util.asFactory(EventListener.NONE);
            this.retryOnConnectionFailure = true;
            Authenticator authenticator = Authenticator.NONE;
            this.authenticator = authenticator;
            this.followRedirects = true;
            this.followSslRedirects = true;
            this.cookieJar = CookieJar.NO_COOKIES;
            this.dns = Dns.SYSTEM;
            this.proxyAuthenticator = authenticator;
            this.socketFactory = SocketFactory.getDefault();
            Companion companion = OkHttpClient.INSTANCE;
            this.connectionSpecs = companion.getDEFAULT_CONNECTION_SPECS$okhttp();
            this.protocols = companion.getDEFAULT_PROTOCOLS$okhttp();
            this.hostnameVerifier = OkHostnameVerifier.INSTANCE;
            this.certificatePinner = CertificatePinner.DEFAULT;
            this.connectTimeout = 10000;
            this.readTimeout = 10000;
            this.writeTimeout = 10000;
            this.minWebSocketMessageToCompress = 1024L;
        }

        @i
        @k
        /* renamed from: -addInterceptor, reason: not valid java name */
        public final Builder m239addInterceptor(@k final Y41.l<? super Interceptor.Chain, Response> block) {
            return addInterceptor(new Interceptor() { // from class: okhttp3.OkHttpClient$Builder$addInterceptor$2
                @Override // okhttp3.Interceptor
                @k
                public final Response intercept(@k Interceptor.Chain chain) {
                    return block.invoke(chain);
                }
            });
        }

        @i
        @k
        /* renamed from: -addNetworkInterceptor, reason: not valid java name */
        public final Builder m240addNetworkInterceptor(@k final Y41.l<? super Interceptor.Chain, Response> block) {
            return addNetworkInterceptor(new Interceptor() { // from class: okhttp3.OkHttpClient$Builder$addNetworkInterceptor$2
                @Override // okhttp3.Interceptor
                @k
                public final Response intercept(@k Interceptor.Chain chain) {
                    return block.invoke(chain);
                }
            });
        }

        @k
        public final Builder addInterceptor(@k Interceptor interceptor) {
            this.interceptors.add(interceptor);
            return this;
        }

        @k
        public final Builder addNetworkInterceptor(@k Interceptor interceptor) {
            this.networkInterceptors.add(interceptor);
            return this;
        }

        @k
        public final Builder authenticator(@k Authenticator authenticator) {
            this.authenticator = authenticator;
            return this;
        }

        @k
        public final OkHttpClient build() {
            return new OkHttpClient(this);
        }

        @k
        public final Builder cache(@l Cache cache) {
            this.cache = cache;
            return this;
        }

        @k
        public final Builder callTimeout(long timeout, @k TimeUnit unit) {
            this.callTimeout = Util.checkDuration("timeout", timeout, unit);
            return this;
        }

        @k
        public final Builder certificatePinner(@k CertificatePinner certificatePinner) {
            if (!certificatePinner.equals(this.certificatePinner)) {
                this.routeDatabase = null;
            }
            this.certificatePinner = certificatePinner;
            return this;
        }

        @k
        public final Builder connectTimeout(long timeout, @k TimeUnit unit) {
            this.connectTimeout = Util.checkDuration("timeout", timeout, unit);
            return this;
        }

        @k
        public final Builder connectionPool(@k ConnectionPool connectionPool) {
            this.connectionPool = connectionPool;
            return this;
        }

        @k
        public final Builder connectionSpecs(@k List<ConnectionSpec> connectionSpecs) {
            if (!connectionSpecs.equals(this.connectionSpecs)) {
                this.routeDatabase = null;
            }
            this.connectionSpecs = Util.toImmutableList(connectionSpecs);
            return this;
        }

        @k
        public final Builder cookieJar(@k CookieJar cookieJar) {
            this.cookieJar = cookieJar;
            return this;
        }

        @k
        public final Builder dispatcher(@k Dispatcher dispatcher) {
            this.dispatcher = dispatcher;
            return this;
        }

        @k
        public final Builder dns(@k Dns dns) {
            if (!dns.equals(this.dns)) {
                this.routeDatabase = null;
            }
            this.dns = dns;
            return this;
        }

        @k
        public final Builder eventListener(@k EventListener eventListener) {
            this.eventListenerFactory = Util.asFactory(eventListener);
            return this;
        }

        @k
        public final Builder eventListenerFactory(@k EventListener.Factory eventListenerFactory) {
            this.eventListenerFactory = eventListenerFactory;
            return this;
        }

        @k
        public final Builder followRedirects(boolean followRedirects) {
            this.followRedirects = followRedirects;
            return this;
        }

        @k
        public final Builder followSslRedirects(boolean followProtocolRedirects) {
            this.followSslRedirects = followProtocolRedirects;
            return this;
        }

        @k
        /* renamed from: getAuthenticator$okhttp, reason: from getter */
        public final Authenticator getAuthenticator() {
            return this.authenticator;
        }

        @l
        /* renamed from: getCache$okhttp, reason: from getter */
        public final Cache getCache() {
            return this.cache;
        }

        /* renamed from: getCallTimeout$okhttp, reason: from getter */
        public final int getCallTimeout() {
            return this.callTimeout;
        }

        @l
        /* renamed from: getCertificateChainCleaner$okhttp, reason: from getter */
        public final CertificateChainCleaner getCertificateChainCleaner() {
            return this.certificateChainCleaner;
        }

        @k
        /* renamed from: getCertificatePinner$okhttp, reason: from getter */
        public final CertificatePinner getCertificatePinner() {
            return this.certificatePinner;
        }

        /* renamed from: getConnectTimeout$okhttp, reason: from getter */
        public final int getConnectTimeout() {
            return this.connectTimeout;
        }

        @k
        /* renamed from: getConnectionPool$okhttp, reason: from getter */
        public final ConnectionPool getConnectionPool() {
            return this.connectionPool;
        }

        @k
        public final List<ConnectionSpec> getConnectionSpecs$okhttp() {
            return this.connectionSpecs;
        }

        @k
        /* renamed from: getCookieJar$okhttp, reason: from getter */
        public final CookieJar getCookieJar() {
            return this.cookieJar;
        }

        @k
        /* renamed from: getDispatcher$okhttp, reason: from getter */
        public final Dispatcher getDispatcher() {
            return this.dispatcher;
        }

        @k
        /* renamed from: getDns$okhttp, reason: from getter */
        public final Dns getDns() {
            return this.dns;
        }

        @k
        /* renamed from: getEventListenerFactory$okhttp, reason: from getter */
        public final EventListener.Factory getEventListenerFactory() {
            return this.eventListenerFactory;
        }

        /* renamed from: getFollowRedirects$okhttp, reason: from getter */
        public final boolean getFollowRedirects() {
            return this.followRedirects;
        }

        /* renamed from: getFollowSslRedirects$okhttp, reason: from getter */
        public final boolean getFollowSslRedirects() {
            return this.followSslRedirects;
        }

        @k
        /* renamed from: getHostnameVerifier$okhttp, reason: from getter */
        public final HostnameVerifier getHostnameVerifier() {
            return this.hostnameVerifier;
        }

        @k
        public final List<Interceptor> getInterceptors$okhttp() {
            return this.interceptors;
        }

        /* renamed from: getMinWebSocketMessageToCompress$okhttp, reason: from getter */
        public final long getMinWebSocketMessageToCompress() {
            return this.minWebSocketMessageToCompress;
        }

        @k
        public final List<Interceptor> getNetworkInterceptors$okhttp() {
            return this.networkInterceptors;
        }

        /* renamed from: getPingInterval$okhttp, reason: from getter */
        public final int getPingInterval() {
            return this.pingInterval;
        }

        @k
        public final List<Protocol> getProtocols$okhttp() {
            return this.protocols;
        }

        @l
        /* renamed from: getProxy$okhttp, reason: from getter */
        public final Proxy getProxy() {
            return this.proxy;
        }

        @k
        /* renamed from: getProxyAuthenticator$okhttp, reason: from getter */
        public final Authenticator getProxyAuthenticator() {
            return this.proxyAuthenticator;
        }

        @l
        /* renamed from: getProxySelector$okhttp, reason: from getter */
        public final ProxySelector getProxySelector() {
            return this.proxySelector;
        }

        /* renamed from: getReadTimeout$okhttp, reason: from getter */
        public final int getReadTimeout() {
            return this.readTimeout;
        }

        /* renamed from: getRetryOnConnectionFailure$okhttp, reason: from getter */
        public final boolean getRetryOnConnectionFailure() {
            return this.retryOnConnectionFailure;
        }

        @l
        /* renamed from: getRouteDatabase$okhttp, reason: from getter */
        public final RouteDatabase getRouteDatabase() {
            return this.routeDatabase;
        }

        @k
        /* renamed from: getSocketFactory$okhttp, reason: from getter */
        public final SocketFactory getSocketFactory() {
            return this.socketFactory;
        }

        @l
        /* renamed from: getSslSocketFactoryOrNull$okhttp, reason: from getter */
        public final SSLSocketFactory getSslSocketFactoryOrNull() {
            return this.sslSocketFactoryOrNull;
        }

        /* renamed from: getWriteTimeout$okhttp, reason: from getter */
        public final int getWriteTimeout() {
            return this.writeTimeout;
        }

        @l
        /* renamed from: getX509TrustManagerOrNull$okhttp, reason: from getter */
        public final X509TrustManager getX509TrustManagerOrNull() {
            return this.x509TrustManagerOrNull;
        }

        @k
        public final Builder hostnameVerifier(@k HostnameVerifier hostnameVerifier) {
            if (!hostnameVerifier.equals(this.hostnameVerifier)) {
                this.routeDatabase = null;
            }
            this.hostnameVerifier = hostnameVerifier;
            return this;
        }

        @k
        public final List<Interceptor> interceptors() {
            return this.interceptors;
        }

        @k
        public final Builder minWebSocketMessageToCompress(long bytes) {
            if (bytes < 0) {
                throw new IllegalArgumentException(C21030p.a(bytes, "minWebSocketMessageToCompress must be positive: ").toString());
            }
            this.minWebSocketMessageToCompress = bytes;
            return this;
        }

        @k
        public final List<Interceptor> networkInterceptors() {
            return this.networkInterceptors;
        }

        @k
        public final Builder pingInterval(long interval, @k TimeUnit unit) {
            this.pingInterval = Util.checkDuration("interval", interval, unit);
            return this;
        }

        @k
        public final Builder protocols(@k List<? extends Protocol> protocols) {
            ArrayList arrayList = new ArrayList(protocols);
            Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
            if (!arrayList.contains(protocol) && !arrayList.contains(Protocol.HTTP_1_1)) {
                throw new IllegalArgumentException(("protocols must contain h2_prior_knowledge or http/1.1: " + arrayList).toString());
            }
            if (arrayList.contains(protocol) && arrayList.size() > 1) {
                throw new IllegalArgumentException(("protocols containing h2_prior_knowledge cannot use other protocols: " + arrayList).toString());
            }
            if (arrayList.contains(Protocol.HTTP_1_0)) {
                throw new IllegalArgumentException(("protocols must not contain http/1.0: " + arrayList).toString());
            }
            if (arrayList.contains(null)) {
                throw new IllegalArgumentException("protocols must not contain null");
            }
            arrayList.remove(Protocol.SPDY_3);
            if (!arrayList.equals(this.protocols)) {
                this.routeDatabase = null;
            }
            this.protocols = Collections.unmodifiableList(arrayList);
            return this;
        }

        @k
        public final Builder proxy(@l Proxy proxy) {
            if (!L.f(proxy, this.proxy)) {
                this.routeDatabase = null;
            }
            this.proxy = proxy;
            return this;
        }

        @k
        public final Builder proxyAuthenticator(@k Authenticator proxyAuthenticator) {
            if (!proxyAuthenticator.equals(this.proxyAuthenticator)) {
                this.routeDatabase = null;
            }
            this.proxyAuthenticator = proxyAuthenticator;
            return this;
        }

        @k
        public final Builder proxySelector(@k ProxySelector proxySelector) {
            if (!proxySelector.equals(this.proxySelector)) {
                this.routeDatabase = null;
            }
            this.proxySelector = proxySelector;
            return this;
        }

        @k
        public final Builder readTimeout(long timeout, @k TimeUnit unit) {
            this.readTimeout = Util.checkDuration("timeout", timeout, unit);
            return this;
        }

        @k
        public final Builder retryOnConnectionFailure(boolean retryOnConnectionFailure) {
            this.retryOnConnectionFailure = retryOnConnectionFailure;
            return this;
        }

        public final void setAuthenticator$okhttp(@k Authenticator authenticator) {
            this.authenticator = authenticator;
        }

        public final void setCache$okhttp(@l Cache cache) {
            this.cache = cache;
        }

        public final void setCallTimeout$okhttp(int i12) {
            this.callTimeout = i12;
        }

        public final void setCertificateChainCleaner$okhttp(@l CertificateChainCleaner certificateChainCleaner) {
            this.certificateChainCleaner = certificateChainCleaner;
        }

        public final void setCertificatePinner$okhttp(@k CertificatePinner certificatePinner) {
            this.certificatePinner = certificatePinner;
        }

        public final void setConnectTimeout$okhttp(int i12) {
            this.connectTimeout = i12;
        }

        public final void setConnectionPool$okhttp(@k ConnectionPool connectionPool) {
            this.connectionPool = connectionPool;
        }

        public final void setConnectionSpecs$okhttp(@k List<ConnectionSpec> list) {
            this.connectionSpecs = list;
        }

        public final void setCookieJar$okhttp(@k CookieJar cookieJar) {
            this.cookieJar = cookieJar;
        }

        public final void setDispatcher$okhttp(@k Dispatcher dispatcher) {
            this.dispatcher = dispatcher;
        }

        public final void setDns$okhttp(@k Dns dns) {
            this.dns = dns;
        }

        public final void setEventListenerFactory$okhttp(@k EventListener.Factory factory) {
            this.eventListenerFactory = factory;
        }

        public final void setFollowRedirects$okhttp(boolean z12) {
            this.followRedirects = z12;
        }

        public final void setFollowSslRedirects$okhttp(boolean z12) {
            this.followSslRedirects = z12;
        }

        public final void setHostnameVerifier$okhttp(@k HostnameVerifier hostnameVerifier) {
            this.hostnameVerifier = hostnameVerifier;
        }

        public final void setMinWebSocketMessageToCompress$okhttp(long j12) {
            this.minWebSocketMessageToCompress = j12;
        }

        public final void setPingInterval$okhttp(int i12) {
            this.pingInterval = i12;
        }

        public final void setProtocols$okhttp(@k List<? extends Protocol> list) {
            this.protocols = list;
        }

        public final void setProxy$okhttp(@l Proxy proxy) {
            this.proxy = proxy;
        }

        public final void setProxyAuthenticator$okhttp(@k Authenticator authenticator) {
            this.proxyAuthenticator = authenticator;
        }

        public final void setProxySelector$okhttp(@l ProxySelector proxySelector) {
            this.proxySelector = proxySelector;
        }

        public final void setReadTimeout$okhttp(int i12) {
            this.readTimeout = i12;
        }

        public final void setRetryOnConnectionFailure$okhttp(boolean z12) {
            this.retryOnConnectionFailure = z12;
        }

        public final void setRouteDatabase$okhttp(@l RouteDatabase routeDatabase) {
            this.routeDatabase = routeDatabase;
        }

        public final void setSocketFactory$okhttp(@k SocketFactory socketFactory) {
            this.socketFactory = socketFactory;
        }

        public final void setSslSocketFactoryOrNull$okhttp(@l SSLSocketFactory sSLSocketFactory) {
            this.sslSocketFactoryOrNull = sSLSocketFactory;
        }

        public final void setWriteTimeout$okhttp(int i12) {
            this.writeTimeout = i12;
        }

        public final void setX509TrustManagerOrNull$okhttp(@l X509TrustManager x509TrustManager) {
            this.x509TrustManagerOrNull = x509TrustManager;
        }

        @k
        public final Builder socketFactory(@k SocketFactory socketFactory) {
            if (socketFactory instanceof SSLSocketFactory) {
                throw new IllegalArgumentException("socketFactory instanceof SSLSocketFactory");
            }
            if (!socketFactory.equals(this.socketFactory)) {
                this.routeDatabase = null;
            }
            this.socketFactory = socketFactory;
            return this;
        }

        @k
        @InterfaceC42830m
        public final Builder sslSocketFactory(@k SSLSocketFactory sslSocketFactory) {
            if (!sslSocketFactory.equals(this.sslSocketFactoryOrNull)) {
                this.routeDatabase = null;
            }
            this.sslSocketFactoryOrNull = sslSocketFactory;
            Platform.Companion companion = Platform.INSTANCE;
            X509TrustManager x509TrustManagerTrustManager = companion.get().trustManager(sslSocketFactory);
            if (x509TrustManagerTrustManager != null) {
                this.x509TrustManagerOrNull = x509TrustManagerTrustManager;
                this.certificateChainCleaner = companion.get().buildCertificateChainCleaner(this.x509TrustManagerOrNull);
                return this;
            }
            throw new IllegalStateException("Unable to extract the trust manager on " + companion.get() + ", sslSocketFactory is " + sslSocketFactory.getClass());
        }

        @k
        public final Builder writeTimeout(long timeout, @k TimeUnit unit) {
            this.writeTimeout = Util.checkDuration("timeout", timeout, unit);
            return this;
        }

        @k
        @IgnoreJRERequirement
        public final Builder callTimeout(@k Duration duration) {
            callTimeout(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        @k
        @IgnoreJRERequirement
        public final Builder connectTimeout(@k Duration duration) {
            connectTimeout(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        @k
        @IgnoreJRERequirement
        public final Builder pingInterval(@k Duration duration) {
            pingInterval(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        @k
        @IgnoreJRERequirement
        public final Builder readTimeout(@k Duration duration) {
            readTimeout(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        @k
        @IgnoreJRERequirement
        public final Builder writeTimeout(@k Duration duration) {
            writeTimeout(duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        @k
        public final Builder sslSocketFactory(@k SSLSocketFactory sslSocketFactory, @k X509TrustManager trustManager) {
            if (!sslSocketFactory.equals(this.sslSocketFactoryOrNull) || !trustManager.equals(this.x509TrustManagerOrNull)) {
                this.routeDatabase = null;
            }
            this.sslSocketFactoryOrNull = sslSocketFactory;
            this.certificateChainCleaner = CertificateChainCleaner.INSTANCE.get(trustManager);
            this.x509TrustManagerOrNull = trustManager;
            return this;
        }

        public Builder(@k OkHttpClient okHttpClient) {
            this();
            this.dispatcher = okHttpClient.dispatcher();
            this.connectionPool = okHttpClient.connectionPool();
            C42745f0.h(okHttpClient.interceptors(), this.interceptors);
            C42745f0.h(okHttpClient.networkInterceptors(), this.networkInterceptors);
            this.eventListenerFactory = okHttpClient.eventListenerFactory();
            this.retryOnConnectionFailure = okHttpClient.retryOnConnectionFailure();
            this.authenticator = okHttpClient.authenticator();
            this.followRedirects = okHttpClient.followRedirects();
            this.followSslRedirects = okHttpClient.followSslRedirects();
            this.cookieJar = okHttpClient.cookieJar();
            this.cache = okHttpClient.cache();
            this.dns = okHttpClient.dns();
            this.proxy = okHttpClient.proxy();
            this.proxySelector = okHttpClient.proxySelector();
            this.proxyAuthenticator = okHttpClient.proxyAuthenticator();
            this.socketFactory = okHttpClient.socketFactory();
            this.sslSocketFactoryOrNull = okHttpClient.sslSocketFactoryOrNull;
            this.x509TrustManagerOrNull = okHttpClient.getX509TrustManager();
            this.connectionSpecs = okHttpClient.connectionSpecs();
            this.protocols = okHttpClient.protocols();
            this.hostnameVerifier = okHttpClient.hostnameVerifier();
            this.certificatePinner = okHttpClient.certificatePinner();
            this.certificateChainCleaner = okHttpClient.getCertificateChainCleaner();
            this.callTimeout = okHttpClient.callTimeoutMillis();
            this.connectTimeout = okHttpClient.connectTimeoutMillis();
            this.readTimeout = okHttpClient.readTimeoutMillis();
            this.writeTimeout = okHttpClient.writeTimeoutMillis();
            this.pingInterval = okHttpClient.pingIntervalMillis();
            this.minWebSocketMessageToCompress = okHttpClient.getMinWebSocketMessageToCompress();
            this.routeDatabase = okHttpClient.getRouteDatabase();
        }
    }

    /* compiled from: OkHttpClient.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007¨\u0006\u000b"}, d2 = {"Lokhttp3/OkHttpClient$Companion;", "", "()V", "DEFAULT_CONNECTION_SPECS", "", "Lokhttp3/ConnectionSpec;", "getDEFAULT_CONNECTION_SPECS$okhttp", "()Ljava/util/List;", "DEFAULT_PROTOCOLS", "Lokhttp3/Protocol;", "getDEFAULT_PROTOCOLS$okhttp", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final List<ConnectionSpec> getDEFAULT_CONNECTION_SPECS$okhttp() {
            return OkHttpClient.DEFAULT_CONNECTION_SPECS;
        }

        @k
        public final List<Protocol> getDEFAULT_PROTOCOLS$okhttp() {
            return OkHttpClient.DEFAULT_PROTOCOLS;
        }

        private Companion() {
        }
    }

    public OkHttpClient(@k Builder builder) {
        ProxySelector proxySelector;
        this.dispatcher = builder.getDispatcher();
        this.connectionPool = builder.getConnectionPool();
        this.interceptors = Util.toImmutableList(builder.getInterceptors$okhttp());
        this.networkInterceptors = Util.toImmutableList(builder.getNetworkInterceptors$okhttp());
        this.eventListenerFactory = builder.getEventListenerFactory();
        this.retryOnConnectionFailure = builder.getRetryOnConnectionFailure();
        this.authenticator = builder.getAuthenticator();
        this.followRedirects = builder.getFollowRedirects();
        this.followSslRedirects = builder.getFollowSslRedirects();
        this.cookieJar = builder.getCookieJar();
        this.cache = builder.getCache();
        this.dns = builder.getDns();
        this.proxy = builder.getProxy();
        if (builder.getProxy() != null) {
            proxySelector = NullProxySelector.INSTANCE;
        } else {
            proxySelector = builder.getProxySelector();
            proxySelector = proxySelector == null ? ProxySelector.getDefault() : proxySelector;
            if (proxySelector == null) {
                proxySelector = NullProxySelector.INSTANCE;
            }
        }
        this.proxySelector = proxySelector;
        this.proxyAuthenticator = builder.getProxyAuthenticator();
        this.socketFactory = builder.getSocketFactory();
        List<ConnectionSpec> connectionSpecs$okhttp = builder.getConnectionSpecs$okhttp();
        this.connectionSpecs = connectionSpecs$okhttp;
        this.protocols = builder.getProtocols$okhttp();
        this.hostnameVerifier = builder.getHostnameVerifier();
        this.callTimeoutMillis = builder.getCallTimeout();
        this.connectTimeoutMillis = builder.getConnectTimeout();
        this.readTimeoutMillis = builder.getReadTimeout();
        this.writeTimeoutMillis = builder.getWriteTimeout();
        this.pingIntervalMillis = builder.getPingInterval();
        this.minWebSocketMessageToCompress = builder.getMinWebSocketMessageToCompress();
        RouteDatabase routeDatabase = builder.getRouteDatabase();
        this.routeDatabase = routeDatabase == null ? new RouteDatabase() : routeDatabase;
        List<ConnectionSpec> list = connectionSpecs$okhttp;
        if ((list instanceof Collection) && list.isEmpty()) {
            this.sslSocketFactoryOrNull = null;
            this.certificateChainCleaner = null;
            this.x509TrustManager = null;
            this.certificatePinner = CertificatePinner.DEFAULT;
        } else {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((ConnectionSpec) it.next()).getIsTls()) {
                    if (builder.getSslSocketFactoryOrNull() != null) {
                        this.sslSocketFactoryOrNull = builder.getSslSocketFactoryOrNull();
                        CertificateChainCleaner certificateChainCleaner = builder.getCertificateChainCleaner();
                        this.certificateChainCleaner = certificateChainCleaner;
                        this.x509TrustManager = builder.getX509TrustManagerOrNull();
                        this.certificatePinner = builder.getCertificatePinner().withCertificateChainCleaner$okhttp(certificateChainCleaner);
                    } else {
                        Platform.Companion companion = Platform.INSTANCE;
                        X509TrustManager x509TrustManagerPlatformTrustManager = companion.get().platformTrustManager();
                        this.x509TrustManager = x509TrustManagerPlatformTrustManager;
                        this.sslSocketFactoryOrNull = companion.get().newSslSocketFactory(x509TrustManagerPlatformTrustManager);
                        CertificateChainCleaner certificateChainCleaner2 = CertificateChainCleaner.INSTANCE.get(x509TrustManagerPlatformTrustManager);
                        this.certificateChainCleaner = certificateChainCleaner2;
                        this.certificatePinner = builder.getCertificatePinner().withCertificateChainCleaner$okhttp(certificateChainCleaner2);
                    }
                }
            }
            this.sslSocketFactoryOrNull = null;
            this.certificateChainCleaner = null;
            this.x509TrustManager = null;
            this.certificatePinner = CertificatePinner.DEFAULT;
        }
        verifyClientState();
    }

    private final void verifyClientState() {
        if (this.interceptors.contains(null)) {
            throw new IllegalStateException(("Null interceptor: " + this.interceptors).toString());
        }
        if (this.networkInterceptors.contains(null)) {
            throw new IllegalStateException(("Null network interceptor: " + this.networkInterceptors).toString());
        }
        List<ConnectionSpec> list = this.connectionSpecs;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((ConnectionSpec) it.next()).getIsTls()) {
                    if (this.sslSocketFactoryOrNull == null) {
                        throw new IllegalStateException("sslSocketFactory == null");
                    }
                    if (this.certificateChainCleaner == null) {
                        throw new IllegalStateException("certificateChainCleaner == null");
                    }
                    if (this.x509TrustManager == null) {
                        throw new IllegalStateException("x509TrustManager == null");
                    }
                    return;
                }
            }
        }
        if (this.sslSocketFactoryOrNull != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.certificateChainCleaner != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.x509TrustManager != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (!L.f(this.certificatePinner, CertificatePinner.DEFAULT)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    @i
    @k
    @InterfaceC42830m
    /* renamed from: -deprecated_authenticator, reason: not valid java name and from getter */
    public final Authenticator getAuthenticator() {
        return this.authenticator;
    }

    @l
    @i
    @InterfaceC42830m
    /* renamed from: -deprecated_cache, reason: not valid java name and from getter */
    public final Cache getCache() {
        return this.cache;
    }

    @i
    @InterfaceC42830m
    /* renamed from: -deprecated_callTimeoutMillis, reason: not valid java name and from getter */
    public final int getCallTimeoutMillis() {
        return this.callTimeoutMillis;
    }

    @i
    @k
    @InterfaceC42830m
    /* renamed from: -deprecated_certificatePinner, reason: not valid java name and from getter */
    public final CertificatePinner getCertificatePinner() {
        return this.certificatePinner;
    }

    @i
    @InterfaceC42830m
    /* renamed from: -deprecated_connectTimeoutMillis, reason: not valid java name and from getter */
    public final int getConnectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    @i
    @k
    @InterfaceC42830m
    /* renamed from: -deprecated_connectionPool, reason: not valid java name and from getter */
    public final ConnectionPool getConnectionPool() {
        return this.connectionPool;
    }

    @i
    @k
    @InterfaceC42830m
    /* renamed from: -deprecated_connectionSpecs, reason: not valid java name */
    public final List<ConnectionSpec> m219deprecated_connectionSpecs() {
        return this.connectionSpecs;
    }

    @i
    @k
    @InterfaceC42830m
    /* renamed from: -deprecated_cookieJar, reason: not valid java name and from getter */
    public final CookieJar getCookieJar() {
        return this.cookieJar;
    }

    @i
    @k
    @InterfaceC42830m
    /* renamed from: -deprecated_dispatcher, reason: not valid java name and from getter */
    public final Dispatcher getDispatcher() {
        return this.dispatcher;
    }

    @i
    @k
    @InterfaceC42830m
    /* renamed from: -deprecated_dns, reason: not valid java name and from getter */
    public final Dns getDns() {
        return this.dns;
    }

    @i
    @k
    @InterfaceC42830m
    /* renamed from: -deprecated_eventListenerFactory, reason: not valid java name and from getter */
    public final EventListener.Factory getEventListenerFactory() {
        return this.eventListenerFactory;
    }

    @i
    @InterfaceC42830m
    /* renamed from: -deprecated_followRedirects, reason: not valid java name and from getter */
    public final boolean getFollowRedirects() {
        return this.followRedirects;
    }

    @i
    @InterfaceC42830m
    /* renamed from: -deprecated_followSslRedirects, reason: not valid java name and from getter */
    public final boolean getFollowSslRedirects() {
        return this.followSslRedirects;
    }

    @i
    @k
    @InterfaceC42830m
    /* renamed from: -deprecated_hostnameVerifier, reason: not valid java name and from getter */
    public final HostnameVerifier getHostnameVerifier() {
        return this.hostnameVerifier;
    }

    @i
    @k
    @InterfaceC42830m
    /* renamed from: -deprecated_interceptors, reason: not valid java name */
    public final List<Interceptor> m227deprecated_interceptors() {
        return this.interceptors;
    }

    @i
    @k
    @InterfaceC42830m
    /* renamed from: -deprecated_networkInterceptors, reason: not valid java name */
    public final List<Interceptor> m228deprecated_networkInterceptors() {
        return this.networkInterceptors;
    }

    @i
    @InterfaceC42830m
    /* renamed from: -deprecated_pingIntervalMillis, reason: not valid java name and from getter */
    public final int getPingIntervalMillis() {
        return this.pingIntervalMillis;
    }

    @i
    @k
    @InterfaceC42830m
    /* renamed from: -deprecated_protocols, reason: not valid java name */
    public final List<Protocol> m230deprecated_protocols() {
        return this.protocols;
    }

    @l
    @i
    @InterfaceC42830m
    /* renamed from: -deprecated_proxy, reason: not valid java name and from getter */
    public final Proxy getProxy() {
        return this.proxy;
    }

    @i
    @k
    @InterfaceC42830m
    /* renamed from: -deprecated_proxyAuthenticator, reason: not valid java name and from getter */
    public final Authenticator getProxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    @i
    @k
    @InterfaceC42830m
    /* renamed from: -deprecated_proxySelector, reason: not valid java name and from getter */
    public final ProxySelector getProxySelector() {
        return this.proxySelector;
    }

    @i
    @InterfaceC42830m
    /* renamed from: -deprecated_readTimeoutMillis, reason: not valid java name and from getter */
    public final int getReadTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    @i
    @InterfaceC42830m
    /* renamed from: -deprecated_retryOnConnectionFailure, reason: not valid java name and from getter */
    public final boolean getRetryOnConnectionFailure() {
        return this.retryOnConnectionFailure;
    }

    @i
    @k
    @InterfaceC42830m
    /* renamed from: -deprecated_socketFactory, reason: not valid java name and from getter */
    public final SocketFactory getSocketFactory() {
        return this.socketFactory;
    }

    @i
    @k
    @InterfaceC42830m
    /* renamed from: -deprecated_sslSocketFactory, reason: not valid java name */
    public final SSLSocketFactory m237deprecated_sslSocketFactory() {
        return sslSocketFactory();
    }

    @i
    @InterfaceC42830m
    /* renamed from: -deprecated_writeTimeoutMillis, reason: not valid java name and from getter */
    public final int getWriteTimeoutMillis() {
        return this.writeTimeoutMillis;
    }

    @i
    @k
    public final Authenticator authenticator() {
        return this.authenticator;
    }

    @l
    @i
    public final Cache cache() {
        return this.cache;
    }

    @i
    public final int callTimeoutMillis() {
        return this.callTimeoutMillis;
    }

    @l
    @i
    /* renamed from: certificateChainCleaner, reason: from getter */
    public final CertificateChainCleaner getCertificateChainCleaner() {
        return this.certificateChainCleaner;
    }

    @i
    @k
    public final CertificatePinner certificatePinner() {
        return this.certificatePinner;
    }

    @k
    public Object clone() {
        return super.clone();
    }

    @i
    public final int connectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    @i
    @k
    public final ConnectionPool connectionPool() {
        return this.connectionPool;
    }

    @i
    @k
    public final List<ConnectionSpec> connectionSpecs() {
        return this.connectionSpecs;
    }

    @i
    @k
    public final CookieJar cookieJar() {
        return this.cookieJar;
    }

    @i
    @k
    public final Dispatcher dispatcher() {
        return this.dispatcher;
    }

    @i
    @k
    public final Dns dns() {
        return this.dns;
    }

    @i
    @k
    public final EventListener.Factory eventListenerFactory() {
        return this.eventListenerFactory;
    }

    @i
    public final boolean followRedirects() {
        return this.followRedirects;
    }

    @i
    public final boolean followSslRedirects() {
        return this.followSslRedirects;
    }

    @k
    public final RouteDatabase getRouteDatabase() {
        return this.routeDatabase;
    }

    @i
    @k
    public final HostnameVerifier hostnameVerifier() {
        return this.hostnameVerifier;
    }

    @i
    @k
    public final List<Interceptor> interceptors() {
        return this.interceptors;
    }

    @i
    /* renamed from: minWebSocketMessageToCompress, reason: from getter */
    public final long getMinWebSocketMessageToCompress() {
        return this.minWebSocketMessageToCompress;
    }

    @i
    @k
    public final List<Interceptor> networkInterceptors() {
        return this.networkInterceptors;
    }

    @k
    public Builder newBuilder() {
        return new Builder(this);
    }

    @Override // okhttp3.Call.Factory
    @k
    public Call newCall(@k Request request) {
        return new RealCall(this, request, false);
    }

    @Override // okhttp3.WebSocket.Factory
    @k
    public WebSocket newWebSocket(@k Request request, @k WebSocketListener listener) {
        RealWebSocket realWebSocket = new RealWebSocket(TaskRunner.INSTANCE, request, listener, new Random(), this.pingIntervalMillis, null, this.minWebSocketMessageToCompress);
        realWebSocket.connect(this);
        return realWebSocket;
    }

    @i
    public final int pingIntervalMillis() {
        return this.pingIntervalMillis;
    }

    @i
    @k
    public final List<Protocol> protocols() {
        return this.protocols;
    }

    @l
    @i
    public final Proxy proxy() {
        return this.proxy;
    }

    @i
    @k
    public final Authenticator proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    @i
    @k
    public final ProxySelector proxySelector() {
        return this.proxySelector;
    }

    @i
    public final int readTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    @i
    public final boolean retryOnConnectionFailure() {
        return this.retryOnConnectionFailure;
    }

    @i
    @k
    public final SocketFactory socketFactory() {
        return this.socketFactory;
    }

    @i
    @k
    public final SSLSocketFactory sslSocketFactory() {
        SSLSocketFactory sSLSocketFactory = this.sslSocketFactoryOrNull;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    @i
    public final int writeTimeoutMillis() {
        return this.writeTimeoutMillis;
    }

    @l
    @i
    /* renamed from: x509TrustManager, reason: from getter */
    public final X509TrustManager getX509TrustManager() {
        return this.x509TrustManager;
    }

    public OkHttpClient() {
        this(new Builder());
    }
}
