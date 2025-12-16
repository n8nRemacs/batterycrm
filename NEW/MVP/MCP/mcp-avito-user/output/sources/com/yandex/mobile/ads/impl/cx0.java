package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.cz;
import com.yandex.mobile.ads.impl.ki;
import com.yandex.mobile.ads.impl.sv0;
import com.yandex.mobile.ads.impl.ts0;
import com.yandex.mobile.ads.impl.u00;
import java.io.IOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownServiceException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import kotlin.text.C43066x;
import okhttp3.internal.connection.RealConnection;
import okio.InterfaceC44803m;
import okio.InterfaceC44804n;

/* loaded from: classes8.dex */
public final class cx0 extends u00.c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final w01 f384469b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    private Socket f384470c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    private Socket f384471d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    private cz f384472e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    private sv0 f384473f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    private u00 f384474g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    private InterfaceC44804n f384475h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    private InterfaceC44803m f384476i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f384477j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f384478k;

    /* renamed from: l, reason: collision with root package name */
    private int f384479l;

    /* renamed from: m, reason: collision with root package name */
    private int f384480m;

    /* renamed from: n, reason: collision with root package name */
    private int f384481n;

    /* renamed from: o, reason: collision with root package name */
    private int f384482o = 1;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    private final ArrayList f384483p = new ArrayList();

    /* renamed from: q, reason: collision with root package name */
    private long f384484q = Long.MAX_VALUE;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f384485a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            iArr[Proxy.Type.HTTP.ordinal()] = 2;
            f384485a = iArr;
        }
    }

    public cx0(@Y61.k gx0 gx0Var, @Y61.k w01 w01Var) {
        this.f384469b = w01Var;
    }

    private final void n() throws SocketException {
        Socket socket = this.f384471d;
        InterfaceC44804n interfaceC44804n = this.f384475h;
        InterfaceC44803m interfaceC44803m = this.f384476i;
        socket.setSoTimeout(0);
        u00 u00VarA = new u00.a(o81.f388458h).a(socket, this.f384469b.a().k().g(), interfaceC44804n, interfaceC44803m).a(this).k().a();
        this.f384474g = u00VarA;
        int i12 = u00.f390350D;
        this.f384482o = u00.b.a().c();
        u00.l(u00VarA);
    }

    @Y61.k
    public final ArrayList b() {
        return this.f384483p;
    }

    public final long c() {
        return this.f384484q;
    }

    public final boolean d() {
        return this.f384477j;
    }

    public final int e() {
        return this.f384479l;
    }

    @Y61.l
    public final cz f() {
        return this.f384472e;
    }

    public final synchronized void g() {
        this.f384480m++;
    }

    public final boolean h() {
        return this.f384474g != null;
    }

    public final synchronized void i() {
        this.f384478k = true;
    }

    public final synchronized void j() {
        this.f384477j = true;
    }

    @Y61.k
    public final w01 k() {
        return this.f384469b;
    }

    public final void l() {
        this.f384477j = true;
    }

    @Y61.k
    public final Socket m() {
        return this.f384471d;
    }

    @Y61.k
    public final String toString() {
        Object objA;
        StringBuilder sbA = Cif.a("Connection{");
        sbA.append(this.f384469b.a().k().g());
        sbA.append(':');
        sbA.append(this.f384469b.a().k().i());
        sbA.append(", proxy=");
        sbA.append(this.f384469b.b());
        sbA.append(" hostAddress=");
        sbA.append(this.f384469b.d());
        sbA.append(" cipherSuite=");
        cz czVar = this.f384472e;
        if (czVar == null || (objA = czVar.a()) == null) {
            objA = "none";
        }
        sbA.append(objA);
        sbA.append(" protocol=");
        sbA.append(this.f384473f);
        sbA.append('}');
        return sbA.toString();
    }

    public final void a(long j12) {
        this.f384484q = j12;
    }

    public final void a(int i12, int i13, int i14, boolean z12, @Y61.k bx0 bx0Var, @Y61.k zs zsVar) throws Throwable {
        if (this.f384473f == null) {
            List<il> listB = this.f384469b.a().b();
            jl jlVar = new jl(listB);
            if (this.f384469b.a().j() == null) {
                if (listB.contains(il.f386511f)) {
                    String strG = this.f384469b.a().k().g();
                    int i15 = ts0.f390303c;
                    if (!ts0.a.b().a(strG)) {
                        throw new y01(new UnknownServiceException(AK.c.k("CLEARTEXT communication to ", strG, " not permitted by network security policy")));
                    }
                } else {
                    throw new y01(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
                }
            } else if (this.f384469b.a().e().contains(sv0.f390037f)) {
                throw new y01(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
            }
            y01 y01Var = null;
            do {
                try {
                    if (this.f384469b.c()) {
                        a(i12, i13, i14, bx0Var, zsVar);
                        if (this.f384470c == null) {
                        }
                        if (!this.f384469b.c() && this.f384470c == null) {
                            throw new y01(new ProtocolException("Too many tunnel connections attempted: 21"));
                        }
                        this.f384484q = System.nanoTime();
                        return;
                    }
                    a(i12, i13, bx0Var, zsVar);
                    a(jlVar, bx0Var, zsVar);
                    zs.a(bx0Var, this.f384469b.d(), this.f384469b.b());
                    if (!this.f384469b.c()) {
                    }
                    this.f384484q = System.nanoTime();
                    return;
                } catch (IOException e12) {
                    Socket socket = this.f384471d;
                    if (socket != null) {
                        qc1.a(socket);
                    }
                    Socket socket2 = this.f384470c;
                    if (socket2 != null) {
                        qc1.a(socket2);
                    }
                    this.f384471d = null;
                    this.f384470c = null;
                    this.f384475h = null;
                    this.f384476i = null;
                    this.f384472e = null;
                    this.f384473f = null;
                    this.f384474g = null;
                    this.f384482o = 1;
                    zs.a(bx0Var, this.f384469b.d(), this.f384469b.b(), e12);
                    if (y01Var == null) {
                        y01Var = new y01(e12);
                    } else {
                        y01Var.a(e12);
                    }
                    if (!z12) {
                        throw y01Var;
                    }
                }
            } while (jlVar.a(e12));
            throw y01Var;
        }
        throw new IllegalStateException("already connected");
    }

    private final void a(int i12, int i13, bx0 bx0Var, zs zsVar) throws IOException {
        Socket socketCreateSocket;
        Proxy proxyB = this.f384469b.b();
        r7 r7VarA = this.f384469b.a();
        Proxy.Type type = proxyB.type();
        int i14 = type == null ? -1 : a.f384485a[type.ordinal()];
        if (i14 != 1 && i14 != 2) {
            socketCreateSocket = new Socket(proxyB);
        } else {
            socketCreateSocket = r7VarA.i().createSocket();
        }
        this.f384470c = socketCreateSocket;
        InetSocketAddress inetSocketAddressD = this.f384469b.d();
        zsVar.getClass();
        zs.b(bx0Var, inetSocketAddressD, proxyB);
        socketCreateSocket.setSoTimeout(i13);
        try {
            int i15 = ts0.f390303c;
            ts0.a.b().a(socketCreateSocket, this.f384469b.d(), i12);
            try {
                this.f384475h = new okio.Y(okio.M.h(socketCreateSocket));
                this.f384476i = new okio.X(okio.M.d(socketCreateSocket));
            } catch (NullPointerException e12) {
                if (kotlin.jvm.internal.L.f(e12.getMessage(), "throw with null exception")) {
                    throw new IOException(e12);
                }
            }
        } catch (ConnectException e13) {
            StringBuilder sbA = Cif.a("Failed to connect to ");
            sbA.append(this.f384469b.d());
            ConnectException connectException = new ConnectException(sbA.toString());
            connectException.initCause(e13);
            throw connectException;
        }
    }

    private final void a(jl jlVar, bx0 bx0Var, zs zsVar) throws Throwable {
        SSLSocket sSLSocket;
        if (this.f384469b.a().j() == null) {
            List<sv0> listE = this.f384469b.a().e();
            sv0 sv0Var = sv0.f390037f;
            if (listE.contains(sv0Var)) {
                this.f384471d = this.f384470c;
                this.f384473f = sv0Var;
                n();
                return;
            } else {
                this.f384471d = this.f384470c;
                this.f384473f = sv0.f390034c;
                return;
            }
        }
        zsVar.getClass();
        zs.h(bx0Var);
        r7 r7VarA = this.f384469b.a();
        SSLSocket sSLSocket2 = null;
        String strB = null;
        try {
            sSLSocket = (SSLSocket) r7VarA.j().createSocket(this.f384470c, r7VarA.k().g(), r7VarA.k().i(), true);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            il ilVarA = jlVar.a(sSLSocket);
            if (ilVarA.b()) {
                int i12 = ts0.f390303c;
                ts0.a.b().a(sSLSocket, r7VarA.k().g(), r7VarA.e());
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            cz czVarA = cz.a.a(session);
            if (!r7VarA.d().verify(r7VarA.k().g(), session)) {
                List<Certificate> listC = czVarA.c();
                if (!listC.isEmpty()) {
                    X509Certificate x509Certificate = (X509Certificate) listC.get(0);
                    StringBuilder sb2 = new StringBuilder("\n              |Hostname ");
                    sb2.append(r7VarA.k().g());
                    sb2.append(" not verified:\n              |    certificate: ");
                    ki kiVar = ki.f387161c;
                    sb2.append(ki.b.a(x509Certificate));
                    sb2.append("\n              |    DN: ");
                    sb2.append(x509Certificate.getSubjectDN().getName());
                    sb2.append("\n              |    subjectAltNames: ");
                    sb2.append(aq0.a(x509Certificate));
                    sb2.append("\n              ");
                    throw new SSLPeerUnverifiedException(C43066x.F0(sb2.toString()));
                }
                throw new SSLPeerUnverifiedException("Hostname " + r7VarA.k().g() + " not verified (no certificates)");
            }
            ki kiVarA = r7VarA.a();
            this.f384472e = new cz(czVarA.d(), czVarA.a(), czVarA.b(), new dx0(kiVarA, czVarA, r7VarA));
            kiVarA.a(r7VarA.k().g(), new ex0(this));
            if (ilVarA.b()) {
                int i13 = ts0.f390303c;
                strB = ts0.a.b().b(sSLSocket);
            }
            this.f384471d = sSLSocket;
            this.f384475h = new okio.Y(okio.M.h(sSLSocket));
            this.f384476i = new okio.X(okio.M.d(sSLSocket));
            this.f384473f = strB != null ? sv0.a.a(strB) : sv0.f390034c;
            int i14 = ts0.f390303c;
            ts0.a.b().a(sSLSocket);
            zs.g(bx0Var);
            if (this.f384473f == sv0.f390036e) {
                n();
            }
        } catch (Throwable th3) {
            th = th3;
            sSLSocket2 = sSLSocket;
            if (sSLSocket2 != null) {
                int i15 = ts0.f390303c;
                ts0.a.b().a(sSLSocket2);
            }
            if (sSLSocket2 != null) {
                qc1.a((Socket) sSLSocket2);
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x015a, code lost:
    
        if (r3 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x015d, code lost:
    
        r6 = r16.f384470c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x015f, code lost:
    
        if (r6 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0161, code lost:
    
        com.yandex.mobile.ads.impl.qc1.a(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0164, code lost:
    
        r16.f384470c = null;
        r16.f384476i = null;
        r16.f384475h = null;
        com.yandex.mobile.ads.impl.zs.a(r20, r16.f384469b.d(), r16.f384469b.b());
        r9 = r9 + 1;
        r5 = null;
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void a(int r17, int r18, int r19, com.yandex.mobile.ads.impl.bx0 r20, com.yandex.mobile.ads.impl.zs r21) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.cx0.a(int, int, int, com.yandex.mobile.ads.impl.bx0, com.yandex.mobile.ads.impl.zs):void");
    }

    @Y61.k
    public final et a(@Y61.k bq0 bq0Var, @Y61.k hx0 hx0Var) throws SocketException {
        Socket socket = this.f384471d;
        InterfaceC44804n interfaceC44804n = this.f384475h;
        InterfaceC44803m interfaceC44803m = this.f384476i;
        u00 u00Var = this.f384474g;
        if (u00Var != null) {
            return new z00(bq0Var, this, hx0Var, u00Var);
        }
        socket.setSoTimeout(hx0Var.h());
        okio.i0 i0VarTimeout = interfaceC44804n.getF420025c();
        long jE2 = hx0Var.e();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        i0VarTimeout.timeout(jE2, timeUnit);
        interfaceC44803m.getF420032c().timeout(hx0Var.g(), timeUnit);
        return new s00(bq0Var, this, interfaceC44804n, interfaceC44803m);
    }

    public final void a() {
        Socket socket = this.f384470c;
        if (socket != null) {
            qc1.a(socket);
        }
    }

    @Override // com.yandex.mobile.ads.impl.u00.c
    public final void a(@Y61.k b10 b10Var) {
        b10Var.a(xs.f391803f, (IOException) null);
    }

    @Override // com.yandex.mobile.ads.impl.u00.c
    public final synchronized void a(@Y61.k u00 u00Var, @Y61.k m31 m31Var) {
        this.f384482o = m31Var.c();
    }

    public final synchronized void a(@Y61.k bx0 bx0Var, @Y61.l IOException iOException) {
        try {
            if (iOException instanceof f71) {
                xs xsVar = ((f71) iOException).f385214a;
                if (xsVar == xs.f391803f) {
                    int i12 = this.f384481n + 1;
                    this.f384481n = i12;
                    if (i12 > 1) {
                        this.f384477j = true;
                        this.f384479l++;
                    }
                } else if (xsVar != xs.f391804g || !bx0Var.j()) {
                    this.f384477j = true;
                    this.f384479l++;
                }
            } else if (!h() || (iOException instanceof hl)) {
                this.f384477j = true;
                if (this.f384480m == 0) {
                    if (iOException != null) {
                        bq0 bq0VarC = bx0Var.c();
                        w01 w01Var = this.f384469b;
                        if (w01Var.b().type() != Proxy.Type.DIRECT) {
                            r7 r7VarA = w01Var.a();
                            r7VarA.h().connectFailed(r7VarA.k().m(), w01Var.b().address(), iOException);
                        }
                        bq0VarC.n().b(w01Var);
                    }
                    this.f384479l++;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x012e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(@Y61.k com.yandex.mobile.ads.impl.r7 r8, @Y61.l java.util.List<com.yandex.mobile.ads.impl.w01> r9) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.cx0.a(com.yandex.mobile.ads.impl.r7, java.util.List):boolean");
    }

    public final boolean a(boolean z12) {
        long j12;
        if (qc1.f389148f && Thread.holdsLock(this)) {
            StringBuilder sbA = Cif.a("Thread ");
            sbA.append(Thread.currentThread().getName());
            sbA.append(" MUST NOT hold lock on ");
            sbA.append(this);
            throw new AssertionError(sbA.toString());
        }
        long jNanoTime = System.nanoTime();
        Socket socket = this.f384470c;
        Socket socket2 = this.f384471d;
        InterfaceC44804n interfaceC44804n = this.f384475h;
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        u00 u00Var = this.f384474g;
        if (u00Var != null) {
            return u00Var.a(jNanoTime);
        }
        synchronized (this) {
            j12 = jNanoTime - this.f384484q;
        }
        if (j12 < RealConnection.IDLE_CONNECTION_HEALTHY_NS || !z12) {
            return true;
        }
        return qc1.a(socket2, interfaceC44804n);
    }
}
