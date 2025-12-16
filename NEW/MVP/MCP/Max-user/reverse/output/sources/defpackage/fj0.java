package defpackage;

import android.net.TrafficStats;
import android.os.SystemClock;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import javax.net.SocketFactory;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSocket;
import one.me.sdk.net.client.impl.internal.SocketFactoryCreateException;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes2.dex */
public abstract class fj0 implements cb3 {
    public static final Pattern i = Pattern.compile("^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5]).){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$");
    public final uda a;
    public final qs3 b;
    public final c9f c;
    public Socket d;
    public i2f e;
    public final nr3 f;
    public yq3 g = new yq3(false);
    public final ConcurrentHashMap h = new ConcurrentHashMap();

    public fj0(uda udaVar, nr3 nr3Var, c9f c9fVar, qs3 qs3Var) {
        this.a = udaVar;
        this.b = qs3Var;
        this.c = c9fVar;
        this.f = nr3Var;
    }

    public static Socket o(SocketFactory socketFactory) throws IOException {
        wqi.c("fj0", "createSocket", new Object[0]);
        Socket socketCreateSocket = null;
        try {
            socketCreateSocket = socketFactory.createSocket();
            if (socketCreateSocket != null) {
                TrafficStats.tagSocket(socketCreateSocket);
            }
            socketCreateSocket.setKeepAlive(false);
            socketCreateSocket.setTcpNoDelay(true);
            return socketCreateSocket;
        } catch (IOException e) {
            q(socketCreateSocket);
            throw e;
        } catch (Throwable th) {
            q(socketCreateSocket);
            throw new IOException("Failed to create socket", th);
        }
    }

    public static long p(int i2, boolean z) {
        if (i2 > 6) {
            i2 = 6;
        }
        double dPow = (long) (Math.pow(2.0d, i2) * 1000.0d);
        long jRandom = (long) (((dPow / 2.0d) * Math.random()) + dPow);
        if (z && jRandom > BuildConfig.SILENCE_TIME_TO_UPLOAD) {
            jRandom = 15000;
        }
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, "fj0", "getConnectionTimeout: errorsCount: " + i2 + " timeout: " + jRandom, null);
                return jRandom;
            }
        }
        return jRandom;
    }

    public static void q(Socket socket) {
        if (socket != null) {
            wqi.c("fj0", "releaseSocketSafely", new Object[0]);
            try {
                socket.close();
            } catch (Throwable th) {
                wqi.p("fj0", "failed to close socket", th);
            }
        }
    }

    @Override // defpackage.cb3
    public final void a() {
        this.h.clear();
    }

    @Override // defpackage.cb3
    public final qs3 b() {
        return this.b;
    }

    @Override // defpackage.cb3
    public final void c(Socket socket) throws SocketException {
        if (socket != null) {
            TrafficStats.untagSocket(socket);
        }
    }

    @Override // defpackage.cb3
    public Socket connect() {
        int i2;
        long j;
        wqi.c("fj0", "connect ->", new Object[0]);
        this.g = new yq3(true);
        TrafficStats.setThreadStatsTag((i() + d()).hashCode());
        String strI = i();
        int iD = d();
        try {
            SocketFactory socketFactory = (SocketFactory) this.h.computeIfAbsent(strI, new ni(2, this));
            yq3 yq3Var = this.g;
            yq3Var.g = strI;
            yq3Var.h = iD;
            Socket socketN = n(socketFactory, strI, iD);
            this.d = socketN;
            if (!(socketN instanceof SSLSocket)) {
                yq3 yq3Var2 = this.g;
                yq3Var2.getClass();
                yq3Var2.b = System.currentTimeMillis();
                return this.d;
            }
            try {
                this.c.b((SSLSocket) socketN, i.matcher(strI).matches() ? this.f.a : strI);
                yq3 yq3Var3 = this.g;
                yq3Var3.getClass();
                yq3Var3.b = System.currentTimeMillis();
                wqi.c("fj0", "ssl session is ok", new Object[0]);
                i2f i2fVar = this.e;
                if (i2fVar != null && i2fVar.e()) {
                    String str = "emitter was disposed " + strI + ":" + iD;
                    wqi.c("fj0", str, new Object[0]);
                    throw new IOException(str);
                }
                d9f d9fVar = this.c.c;
                long j2 = d9fVar.a;
                int i3 = d9fVar.c;
                long j3 = d9fVar.b;
                if (i3 > 1) {
                    j3 /= d9fVar.c;
                }
                int i4 = d9fVar.c;
                long j4 = d9fVar.d;
                if (d9fVar.f > 1) {
                    i2 = iD;
                    j = d9fVar.e / d9fVar.f;
                } else {
                    i2 = iD;
                    j = d9fVar.e;
                }
                e9f e9fVar = new e9f(j2, j3, i4, j4, j, d9fVar.f, d9fVar.g, d9fVar.i > 1 ? d9fVar.h / d9fVar.i : d9fVar.h, d9fVar.i);
                yq3 yq3Var4 = this.g;
                long j5 = e9fVar.j;
                yq3Var4.getClass();
                yq3Var4.f = Math.max(j5, 0L);
                wqi.c("fj0", "<- connect, socket connected to %s:%d, ssl_metrics=%s", strI, Integer.valueOf(i2), e9fVar.toString());
                return this.d;
            } catch (SSLException e) {
                wqi.e("fj0", "ssl handshake failed, close socket", null);
                q(this.d);
                throw e;
            }
        } catch (SocketFactoryCreateException e2) {
            throw e2.a;
        }
    }

    @Override // defpackage.cb3
    public final boolean e() {
        return true;
    }

    @Override // defpackage.cb3
    public final void f() {
        qs3 qs3Var = this.b;
        ((AtomicInteger) qs3Var.d).incrementAndGet();
        String name = qs3.class.getName();
        l6b l6bVar = wqi.a;
        if (l6bVar == null) {
            return;
        }
        lg8 lg8Var = lg8.d;
        if (l6bVar.b(lg8Var)) {
            l6bVar.c(lg8Var, name, ho7.f(((AtomicInteger) qs3Var.d).get(), "tryNextRequestTimeout "), null);
        }
    }

    @Override // defpackage.cb3
    public final long h(int i2) {
        return p(i2, this.a.a.d());
    }

    @Override // defpackage.cb3
    public final yq3 k() {
        return this.g;
    }

    public void l(Socket socket, String str, int i2, int i3) throws IOException {
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, "fj0", String.format(Locale.ROOT, "connectSocket, socket=%s, host=%s:%d, timeout=%dms", socket, str, Integer.valueOf(i2), Integer.valueOf(i3)), null);
            }
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        InetSocketAddress inetSocketAddress = new InetSocketAddress(str, i2);
        if (inetSocketAddress.getAddress() != null) {
            yq3 yq3Var = this.g;
            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
            yq3Var.getClass();
            yq3Var.d = Math.max(jElapsedRealtime2, 0L);
        }
        long jElapsedRealtime3 = SystemClock.elapsedRealtime();
        wqi.c("Socket", "socket connect", new Object[0]);
        socket.connect(inetSocketAddress, i3);
        wqi.c("Socket", "socket connected", new Object[0]);
        yq3 yq3Var2 = this.g;
        long jElapsedRealtime4 = SystemClock.elapsedRealtime() - jElapsedRealtime3;
        yq3Var2.getClass();
        yq3Var2.e = Math.max(jElapsedRealtime4, 0L);
    }

    public void m(Socket socket, String str, InetAddress inetAddress, int i2, int i3) throws IOException {
        lg8 lg8Var = lg8.d;
        l6b l6bVar = wqi.a;
        if (l6bVar != null && l6bVar.b(lg8Var)) {
            l6bVar.c(lg8Var, "fj0", String.format(Locale.ROOT, "connectSocket, address=%s:%d, timeout=%dms...", inetAddress, Integer.valueOf(i2), Integer.valueOf(i3)), null);
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        socket.connect(new InetSocketAddress(inetAddress, i2), i3);
        yq3 yq3Var = this.g;
        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
        yq3Var.getClass();
        yq3Var.e = Math.max(jElapsedRealtime2, 0L);
        l6b l6bVar2 = wqi.a;
        if (l6bVar2 != null && l6bVar2.b(lg8Var)) {
            l6bVar2.c(lg8Var, "fj0", String.format(Locale.ROOT, "connected %s", socket), null);
        }
    }

    public Socket n(SocketFactory socketFactory, String str, int i2) throws IOException {
        wqi.c("fj0", "createConnection", new Object[0]);
        Socket socketO = o(socketFactory);
        try {
            l(socketO, str, i2, j());
            return socketO;
        } catch (IOException e) {
            q(socketO);
            throw e;
        } catch (Throwable th) {
            q(socketO);
            throw new IOException("Failed to create connection", th);
        }
    }
}
