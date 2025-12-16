package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.internal.connection.RouteException;
import org.apache.http.auth.AUTH;
import org.apache.http.protocol.HTTP;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public final class qbd extends f87 {
    public Socket b;
    public Socket c;
    public f07 d;
    public epc e;
    public m87 f;
    public jbd g;
    public ibd h;
    public boolean i;
    public boolean j;
    public int k;
    public int l;
    public int m;
    public int n = 1;
    public final ArrayList o = new ArrayList();
    public long p = BuildConfig.MAX_TIME_TO_UPLOAD;
    public final wtd q;

    public qbd(wtd wtdVar) {
        this.q = wtdVar;
    }

    public static void d(sua suaVar, wtd wtdVar, IOException iOException) {
        if (wtdVar.b.type() != Proxy.Type.DIRECT) {
            aa aaVar = wtdVar.a;
            aaVar.j.connectFailed(aaVar.a.i(), wtdVar.b.address(), iOException);
        }
        zid zidVar = suaVar.J0;
        synchronized (zidVar) {
            ((LinkedHashSet) zidVar.a).add(wtdVar);
        }
    }

    @Override // defpackage.f87
    public final synchronized void a(yme ymeVar) {
        this.n = (ymeVar.a & 16) != 0 ? ymeVar.b[4] : Integer.MAX_VALUE;
    }

    @Override // defpackage.f87
    public final void b(t87 t87Var) {
        t87Var.c(8, null);
    }

    public final void c(int i, int i2, int i3, boolean z, mbd mbdVar) throws Throwable {
        wtd wtdVar;
        if (this.e != null) {
            throw new IllegalStateException("already connected");
        }
        aa aaVar = this.q.a;
        List list = aaVar.c;
        hs3 hs3Var = new hs3(list);
        if (aaVar.f == null) {
            if (!list.contains(gs3.f)) {
                throw new RouteException(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.q.a.a.e;
            p2c p2cVar = p2c.a;
            if (!p2c.a.h(str)) {
                throw new RouteException(new UnknownServiceException(ho7.i("CLEARTEXT communication to ", str, " not permitted by network security policy")));
            }
        } else if (aaVar.b.contains(epc.H2_PRIOR_KNOWLEDGE)) {
            throw new RouteException(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        RouteException routeException = null;
        do {
            try {
                wtd wtdVar2 = this.q;
                if (wtdVar2.a.f != null && wtdVar2.b.type() == Proxy.Type.HTTP) {
                    f(i, i2, i3);
                    if (this.b == null) {
                    }
                    wtdVar = this.q;
                    if (wtdVar.a.f == null && wtdVar.b.type() == Proxy.Type.HTTP && this.b == null) {
                        throw new RouteException(new ProtocolException("Too many tunnel connections attempted: 21"));
                    }
                    this.p = System.nanoTime();
                    return;
                }
                e(i, i2);
                g(hs3Var);
                InetSocketAddress inetSocketAddress = this.q.c;
                wtdVar = this.q;
                if (wtdVar.a.f == null) {
                }
                this.p = System.nanoTime();
                return;
            } catch (IOException e) {
                Socket socket = this.c;
                if (socket != null) {
                    yxg.d(socket);
                }
                Socket socket2 = this.b;
                if (socket2 != null) {
                    yxg.d(socket2);
                }
                this.c = null;
                this.b = null;
                this.g = null;
                this.h = null;
                this.d = null;
                this.e = null;
                this.f = null;
                this.n = 1;
                InetSocketAddress inetSocketAddress2 = this.q.c;
                if (routeException == null) {
                    routeException = new RouteException(e);
                } else {
                    saj.a(routeException.b, e);
                    routeException.a = e;
                }
                if (!z) {
                    throw routeException;
                }
                hs3Var.c = true;
                if (!hs3Var.b) {
                    throw routeException;
                }
                if (e instanceof ProtocolException) {
                    throw routeException;
                }
                if (e instanceof InterruptedIOException) {
                    throw routeException;
                }
                if ((e instanceof SSLHandshakeException) && (e.getCause() instanceof CertificateException)) {
                    throw routeException;
                }
                if (e instanceof SSLPeerUnverifiedException) {
                    throw routeException;
                }
            }
        } while (e instanceof SSLException);
        throw routeException;
    }

    public final void e(int i, int i2) throws IOException {
        int i3;
        wtd wtdVar = this.q;
        Proxy proxy = wtdVar.b;
        aa aaVar = wtdVar.a;
        Proxy.Type type = proxy.type();
        int i4 = 2;
        int i5 = 1;
        Socket socketCreateSocket = (type != null && ((i3 = nbd.$EnumSwitchMapping$0[type.ordinal()]) == 1 || i3 == 2)) ? aaVar.e.createSocket() : new Socket(proxy);
        this.b = socketCreateSocket;
        InetSocketAddress inetSocketAddress = this.q.c;
        socketCreateSocket.setSoTimeout(i2);
        try {
            p2c p2cVar = p2c.a;
            p2c.a.e(socketCreateSocket, this.q.c, i);
            try {
                Logger logger = yua.a;
                s87 s87Var = new s87(i4, socketCreateSocket);
                int i6 = 0;
                this.g = new jbd(new vx(s87Var, i6, new vx(socketCreateSocket.getInputStream(), i5, s87Var)));
                s87 s87Var2 = new s87(i4, socketCreateSocket);
                this.h = new ibd(new ux(s87Var2, i6, new ux(socketCreateSocket.getOutputStream(), i5, s87Var2)));
            } catch (NullPointerException e) {
                if (fni.a(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.q.c);
            connectException.initCause(e2);
            throw connectException;
        }
    }

    public final void f(int i, int i2, int i3) throws IOException {
        kw6 kw6Var = new kw6();
        wtd wtdVar = this.q;
        kw6Var.a = wtdVar.a.a;
        kw6Var.e("CONNECT", null);
        aa aaVar = wtdVar.a;
        ((i17) kw6Var.c).h(HTTP.TARGET_HOST, yxg.v(aaVar.a, true));
        ((i17) kw6Var.c).h("Proxy-Connection", HTTP.CONN_KEEP_ALIVE);
        ((i17) kw6Var.c).h(HTTP.USER_AGENT, "okhttp/4.9.2");
        zmd zmdVarA = kw6Var.a();
        i17 i17Var = new i17();
        i17Var.h(AUTH.PROXY_AUTH, "OkHttp-Preemptive");
        i17Var.c();
        aaVar.i.getClass();
        ga7 ga7Var = zmdVarA.b;
        e(i, i2);
        String str = "CONNECT " + yxg.v(ga7Var, true) + " HTTP/1.1";
        jbd jbdVar = this.g;
        ibd ibdVar = this.h;
        a9 a9Var = new a9(null, this, jbdVar, ibdVar);
        u9g u9gVarM = jbdVar.c.m();
        long j = i2;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        u9gVarM.g(j, timeUnit);
        ibdVar.c.m().g(i3, timeUnit);
        a9Var.K(zmdVarA.d, str);
        a9Var.b();
        nod nodVarE = a9Var.e(false);
        nodVarE.a = zmdVarA;
        ood oodVarA = nodVarE.a();
        int i4 = oodVarA.d;
        long j2 = yxg.j(oodVarA);
        if (j2 != -1) {
            b87 b87VarW = a9Var.w(j2);
            yxg.t(b87VarW, Integer.MAX_VALUE);
            b87VarW.close();
        }
        if (i4 != 200) {
            if (i4 != 407) {
                throw new IOException(ho7.f(i4, "Unexpected response code for CONNECT: "));
            }
            aaVar.i.getClass();
            throw new IOException("Failed to authenticate with proxy");
        }
        if (!jbdVar.a.P() || !ibdVar.a.P()) {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    public final void g(hs3 hs3Var) throws Throwable {
        SSLSocket sSLSocket;
        String strF;
        epc epcVar = epc.HTTP_2;
        epc epcVar2 = epc.HTTP_1_1;
        epc epcVar3 = epc.H2_PRIOR_KNOWLEDGE;
        aa aaVar = this.q.a;
        SSLSocketFactory sSLSocketFactory = aaVar.f;
        if (sSLSocketFactory == null) {
            if (!aaVar.b.contains(epcVar3)) {
                this.c = this.b;
                this.e = epcVar2;
                return;
            } else {
                this.c = this.b;
                this.e = epcVar3;
                l();
                return;
            }
        }
        try {
            Socket socket = this.b;
            ga7 ga7Var = aaVar.a;
            int i = 1;
            Socket socketCreateSocket = sSLSocketFactory.createSocket(socket, ga7Var.e, ga7Var.f, true);
            if (socketCreateSocket == null) {
                throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            }
            SSLSocket sSLSocket2 = (SSLSocket) socketCreateSocket;
            try {
                gs3 gs3VarA = hs3Var.a(sSLSocket2);
                if (gs3VarA.b) {
                    p2c p2cVar = p2c.a;
                    p2c.a.d(sSLSocket2, aaVar.a.e, aaVar.b);
                }
                sSLSocket2.startHandshake();
                SSLSession session = sSLSocket2.getSession();
                f07 f07VarB = l8g.b(session);
                int i2 = 2;
                if (!aaVar.g.verify(aaVar.a.e, session)) {
                    List listA = f07VarB.a();
                    if (listA.isEmpty()) {
                        throw new SSLPeerUnverifiedException("Hostname " + aaVar.a.e + " not verified (no certificates)");
                    }
                    Object obj = listA.get(0);
                    if (obj == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                    }
                    X509Certificate x509Certificate = (X509Certificate) obj;
                    StringBuilder sb = new StringBuilder("\n              |Hostname ");
                    sb.append(aaVar.a.e);
                    sb.append(" not verified:\n              |    certificate: ");
                    g72 g72Var = g72.c;
                    sb.append("sha256/" + r8j.m(x509Certificate.getPublicKey().getEncoded()).c("SHA-256").a());
                    sb.append("\n              |    DN: ");
                    sb.append(x509Certificate.getSubjectDN().getName());
                    sb.append("\n              |    subjectAltNames: ");
                    sb.append(ue3.T(qua.a(x509Certificate, 7), qua.a(x509Certificate, 2)));
                    sb.append("\n              ");
                    throw new SSLPeerUnverifiedException(wmf.e(sb.toString()));
                }
                g72 g72Var2 = aaVar.h;
                this.d = new f07(f07VarB.b, f07VarB.c, f07VarB.d, new obd(g72Var2, f07VarB, aaVar));
                String str = aaVar.a.e;
                Iterator it = g72Var2.a.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
                if (gs3VarA.b) {
                    p2c p2cVar2 = p2c.a;
                    strF = p2c.a.f(sSLSocket2);
                } else {
                    strF = null;
                }
                this.c = sSLSocket2;
                Logger logger = yua.a;
                s87 s87Var = new s87(i2, sSLSocket2);
                this.g = new jbd(new vx(s87Var, 0, new vx(sSLSocket2.getInputStream(), i, s87Var)));
                s87 s87Var2 = new s87(i2, sSLSocket2);
                this.h = new ibd(new ux(s87Var2, 0, new ux(sSLSocket2.getOutputStream(), i, s87Var2)));
                if (strF != null) {
                    epc epcVar4 = epc.HTTP_1_0;
                    if (strF.equals("http/1.0")) {
                        epcVar2 = epcVar4;
                    } else if (!strF.equals("http/1.1")) {
                        if (strF.equals("h2_prior_knowledge")) {
                            epcVar2 = epcVar3;
                        } else if (strF.equals("h2")) {
                            epcVar2 = epcVar;
                        } else {
                            epcVar2 = epc.SPDY_3;
                            if (!strF.equals("spdy/3.1")) {
                                epcVar2 = epc.QUIC;
                                if (!strF.equals("quic")) {
                                    throw new IOException("Unexpected protocol: ".concat(strF));
                                }
                            }
                        }
                    }
                }
                this.e = epcVar2;
                p2c p2cVar3 = p2c.a;
                p2c.a.a(sSLSocket2);
                if (this.e == epcVar) {
                    l();
                }
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    p2c p2cVar4 = p2c.a;
                    p2c.a.a(sSLSocket);
                }
                if (sSLSocket != null) {
                    yxg.d(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            sSLSocket = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(defpackage.aa r8, java.util.List r9) {
        /*
            r7 = this;
            ga7 r0 = r8.a
            byte[] r1 = defpackage.yxg.a
            java.util.ArrayList r1 = r7.o
            int r1 = r1.size()
            int r2 = r7.n
            r3 = 0
            if (r1 >= r2) goto Ld7
            boolean r1 = r7.i
            if (r1 == 0) goto L15
            goto Ld7
        L15:
            wtd r1 = r7.q
            aa r2 = r1.a
            aa r4 = r1.a
            boolean r2 = r2.a(r8)
            if (r2 != 0) goto L23
            goto Ld7
        L23:
            java.lang.String r2 = r0.e
            ga7 r5 = r4.a
            java.lang.String r5 = r5.e
            boolean r2 = defpackage.fni.a(r2, r5)
            if (r2 == 0) goto L31
            goto Lc0
        L31:
            m87 r2 = r7.f
            if (r2 != 0) goto L37
            goto Ld7
        L37:
            if (r9 == 0) goto Ld7
            boolean r2 = r9.isEmpty()
            if (r2 == 0) goto L41
            goto Ld7
        L41:
            java.util.Iterator r9 = r9.iterator()
        L45:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto Ld7
            java.lang.Object r2 = r9.next()
            wtd r2 = (defpackage.wtd) r2
            java.net.Proxy r5 = r2.b
            java.net.Proxy$Type r5 = r5.type()
            java.net.Proxy$Type r6 = java.net.Proxy.Type.DIRECT
            if (r5 != r6) goto L45
            java.net.Proxy r5 = r1.b
            java.net.Proxy$Type r5 = r5.type()
            if (r5 != r6) goto L45
            java.net.InetSocketAddress r5 = r1.c
            java.net.InetSocketAddress r2 = r2.c
            boolean r2 = defpackage.fni.a(r5, r2)
            if (r2 == 0) goto L45
            javax.net.ssl.HostnameVerifier r9 = r8.g
            qua r1 = defpackage.qua.a
            if (r9 == r1) goto L74
            goto Ld7
        L74:
            byte[] r9 = defpackage.yxg.a
            ga7 r9 = r4.a
            int r1 = r0.f
            java.lang.String r0 = r0.e
            int r2 = r9.f
            if (r1 == r2) goto L81
            goto Ld7
        L81:
            java.lang.String r9 = r9.e
            boolean r9 = defpackage.fni.a(r0, r9)
            if (r9 == 0) goto L8a
            goto Laa
        L8a:
            boolean r9 = r7.j
            if (r9 != 0) goto Ld7
            f07 r9 = r7.d
            if (r9 == 0) goto Ld7
            java.util.List r9 = r9.a()
            boolean r1 = r9.isEmpty()
            if (r1 != 0) goto Ld7
            java.lang.Object r9 = r9.get(r3)
            if (r9 == 0) goto Lcf
            java.security.cert.X509Certificate r9 = (java.security.cert.X509Certificate) r9
            boolean r9 = defpackage.qua.c(r0, r9)
            if (r9 == 0) goto Ld7
        Laa:
            g72 r8 = r8.h     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld7
            f07 r9 = r7.d     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld7
            r9.a()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld7
            r8.getClass()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld7
            java.util.Set r8 = r8.a     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld7
            java.util.Iterator r8 = r8.iterator()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld7
            boolean r9 = r8.hasNext()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld7
            if (r9 != 0) goto Lc2
        Lc0:
            r8 = 1
            return r8
        Lc2:
            java.lang.Object r8 = r8.next()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld7
            r8.getClass()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld7
            java.lang.ClassCastException r8 = new java.lang.ClassCastException     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld7
            r8.<init>()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld7
            throw r8     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld7
        Lcf:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException
            java.lang.String r9 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            r8.<init>(r9)
            throw r8
        Ld7:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qbd.h(aa, java.util.List):boolean");
    }

    public final boolean i(boolean z) throws SocketException {
        long j;
        byte[] bArr = yxg.a;
        long jNanoTime = System.nanoTime();
        Socket socket = this.b;
        Socket socket2 = this.c;
        jbd jbdVar = this.g;
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        m87 m87Var = this.f;
        if (m87Var != null) {
            synchronized (m87Var) {
                if (m87Var.X) {
                    return false;
                }
                if (m87Var.x0 < m87Var.w0) {
                    if (jNanoTime >= m87Var.y0) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j = jNanoTime - this.p;
        }
        if (j < 10000000000L || !z) {
            return true;
        }
        try {
            int soTimeout = socket2.getSoTimeout();
            try {
                socket2.setSoTimeout(1);
                return !jbdVar.l();
            } finally {
                socket2.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public final fj5 j(sua suaVar, rbd rbdVar) throws SocketException {
        int i = rbdVar.d;
        Socket socket = this.c;
        jbd jbdVar = this.g;
        ibd ibdVar = this.h;
        m87 m87Var = this.f;
        if (m87Var != null) {
            return new n87(suaVar, this, rbdVar, m87Var);
        }
        socket.setSoTimeout(i);
        u9g u9gVarM = jbdVar.c.m();
        long j = i;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        u9gVarM.g(j, timeUnit);
        ibdVar.c.m().g(rbdVar.e, timeUnit);
        return new a9(suaVar, this, jbdVar, ibdVar);
    }

    public final synchronized void k() {
        this.i = true;
    }

    public final void l() throws SocketException {
        Socket socket = this.c;
        jbd jbdVar = this.g;
        ibd ibdVar = this.h;
        socket.setSoTimeout(0);
        b3g b3gVar = b3g.h;
        goh gohVar = new goh();
        gohVar.f = b3gVar;
        gohVar.e = f87.a;
        String str = this.q.a.a.e;
        gohVar.b = socket;
        gohVar.a = yxg.g + ' ' + str;
        gohVar.c = jbdVar;
        gohVar.d = ibdVar;
        gohVar.e = this;
        m87 m87Var = new m87(gohVar);
        this.f = m87Var;
        yme ymeVar = m87.J0;
        this.n = (ymeVar.a & 16) != 0 ? ymeVar.b[4] : Integer.MAX_VALUE;
        u87 u87Var = m87Var.G0;
        synchronized (u87Var) {
            try {
                if (u87Var.c) {
                    throw new IOException("closed");
                }
                Logger logger = u87.X;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(yxg.h(">> CONNECTION " + d87.a.e(), new Object[0]));
                }
                u87Var.o.K(d87.a);
                u87Var.o.flush();
            } finally {
            }
        }
        u87 u87Var2 = m87Var.G0;
        yme ymeVar2 = m87Var.z0;
        synchronized (u87Var2) {
            try {
                if (u87Var2.c) {
                    throw new IOException("closed");
                }
                u87Var2.i(0, Integer.bitCount(ymeVar2.a) * 6, 4, 0);
                int i = 0;
                while (i < 10) {
                    boolean z = true;
                    if (((1 << i) & ymeVar2.a) == 0) {
                        z = false;
                    }
                    if (z) {
                        u87Var2.o.writeShort(i != 4 ? i != 7 ? i : 4 : 3);
                        u87Var2.o.writeInt(ymeVar2.b[i]);
                    }
                    i++;
                }
                u87Var2.o.flush();
            } finally {
            }
        }
        if (m87Var.z0.a() != 65535) {
            m87Var.G0.Q(0, r1 - 65535);
        }
        b3gVar.e().c(new k87(2, m87Var.H0, m87Var.c), 0L);
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        wtd wtdVar = this.q;
        sb.append(wtdVar.a.a.e);
        sb.append(':');
        sb.append(wtdVar.a.a.f);
        sb.append(", proxy=");
        sb.append(wtdVar.b);
        sb.append(" hostAddress=");
        sb.append(wtdVar.c);
        sb.append(" cipherSuite=");
        f07 f07Var = this.d;
        if (f07Var == null || (obj = f07Var.c) == null) {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.e);
        sb.append('}');
        return sb.toString();
    }
}
