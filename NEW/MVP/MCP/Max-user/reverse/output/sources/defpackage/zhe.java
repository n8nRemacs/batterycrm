package defpackage;

import android.os.StrictMode;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import javax.net.ssl.SSLHandshakeException;
import one.me.sdk.net.client.api.AddressUnreachableException;
import one.me.sdk.net.client.api.ConnectingCanceledException;
import ru.ok.android.externcalls.sdk.ml.config.KwsFeaturesConfigProviderImpl;
import ru.ok.tamtam.api.SessionSendLimitException;

/* loaded from: classes2.dex */
public class zhe {
    public static final AtomicInteger I = new AtomicInteger(0);
    public static final AtomicInteger J = new AtomicInteger(0);
    public final oqc A;
    public final int C;
    public boolean D;
    public final tya E;
    public final vda F;
    public final vya G;
    public final rje H;
    public final String a;
    public final int l;
    public final cb3 o;
    public final k4e p;
    public final hya q;
    public Socket r;
    public DataOutputStream s;
    public DataInputStream t;
    public final oje u;
    public final qja v;
    public final ArrayList x;
    public final oqc z;
    public final AtomicInteger b = new AtomicInteger(0);
    public final AtomicInteger c = new AtomicInteger(0);
    public Long d = null;
    public final AtomicLong e = new AtomicLong(0);
    public final AtomicBoolean f = new AtomicBoolean(false);
    public final AtomicBoolean g = new AtomicBoolean();
    public final AtomicBoolean h = new AtomicBoolean(false);
    public final AtomicInteger i = new AtomicInteger(0);
    public final AtomicLong j = new AtomicLong(0);
    public final AtomicBoolean k = new AtomicBoolean(false);
    public final AtomicLong m = new AtomicLong(Long.MIN_VALUE);
    public final AtomicBoolean n = new AtomicBoolean(false);
    public final ConcurrentHashMap w = new ConcurrentHashMap();
    public final Object y = new Object();
    public final AtomicInteger B = new AtomicInteger();

    public zhe(q28 q28Var, String str) {
        J.incrementAndGet();
        int iIncrementAndGet = I.incrementAndGet();
        this.l = iIncrementAndGet;
        this.p = q28Var.c;
        this.q = q28Var.f;
        String str2 = (str == null ? "TTSession#" : str) + iIncrementAndGet;
        this.a = str2;
        this.o = q28Var.a;
        this.u = q28Var.e;
        this.v = q28Var.d;
        this.E = q28Var.g;
        this.F = q28Var.h;
        this.G = q28Var.i;
        int iMax = Math.max(0, q28Var.j);
        this.C = iMax;
        wqi.c(str2, "init, sendLimitIfNoSession=%d", Integer.valueOf(iMax));
        this.z = new oqc();
        this.A = new oqc();
        rje rjeVar = q28Var.b;
        this.H = rjeVar;
        zhe zheVar = q28Var.k;
        if (zheVar != null) {
            l6b l6bVar = wqi.a;
            if (l6bVar != null) {
                lg8 lg8Var = lg8.d;
                if (l6bVar.b(lg8Var)) {
                    l6bVar.c(lg8Var, str2, "init, has parent_session=" + zheVar + ", take its sender_tasks ...", null);
                }
            }
            synchronized (zheVar.y) {
                this.x = zheVar.x;
                zheVar.x = new ArrayList();
            }
        } else {
            this.x = new ArrayList();
        }
        rjeVar.a(new vhe(this), "session-conn-handler").start();
        l6b l6bVar2 = wqi.a;
        if (l6bVar2 == null) {
            return;
        }
        lg8 lg8Var2 = lg8.d;
        if (l6bVar2.b(lg8Var2)) {
            l6bVar2.c(lg8Var2, str2, "init, completed=" + this, null);
        }
    }

    public static long D() {
        return TimeUnit.MILLISECONDS.convert(System.nanoTime(), TimeUnit.NANOSECONDS);
    }

    public static void a(zhe zheVar) {
        if (!zheVar.n.get() || zheVar.g.get()) {
            return;
        }
        wqi.o(zheVar.a, null, "closeSessionIfMarkedToDestroy, closing " + zheVar, Arrays.copyOf(new Object[0], 0));
        zheVar.f(true);
    }

    public static boolean b(zhe zheVar, slb slbVar, Class cls) {
        rlb rlbVar = slbVar.b;
        if (rlbVar == null || !cls.isInstance(rlbVar.a)) {
            throw new IllegalStateException("wrong usage of method 'containsInPacketReader'");
        }
        Iterator it = zheVar.w.entrySet().iterator();
        while (it.hasNext()) {
            rlb rlbVar2 = ((qlb) ((Map.Entry) it.next()).getValue()).b.b;
            if (rlbVar2 != null && cls.isInstance(rlbVar2.a)) {
                return true;
            }
        }
        return false;
    }

    public static void c(zhe zheVar, nlb nlbVar) {
        synchronized (zheVar.y) {
            ArrayList arrayList = zheVar.x;
            int i = az7.a;
            int i2 = s65.d;
            arrayList.add(new slb(2, null, v9j.i(System.currentTimeMillis(), y65.MILLISECONDS), nlbVar));
        }
        zheVar.A.a();
    }

    public static void d(zhe zheVar) {
        wqi.c(zheVar.a, zheVar + ", " + Thread.currentThread().getName() + " finished", new Object[0]);
    }

    public static String m(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "<UNKNOWN>" : "LOGGED_IN" : "CONNECTED" : "DISCONNECTED";
    }

    public void A() {
        String str = this.a;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, "startPacketReader", null);
            }
        }
        this.H.a(new whe(this, 0), "session-reader-packet").start();
    }

    public final void B() {
        String str = this.a;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, "startTimeoutHandler", null);
            }
        }
        this.H.a(new whe(this, 2), "session-timeout-handler").start();
    }

    public final void C(Exception exc) {
        long jH;
        AtomicLong atomicLong = this.j;
        AtomicInteger atomicInteger = this.i;
        String str = this.a;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                Locale locale = Locale.US;
                StringBuilder sbM = u45.m(this.i.get(), this.j.get(), "updateConnTimeoutAfterFail, curr_conn_errors=", ", curr_next_conn_epoch=");
                sbM.append("ms");
                l6bVar.c(lg8Var, str, sbM.toString(), null);
            }
        }
        AtomicInteger atomicInteger2 = this.B;
        atomicInteger2.incrementAndGet();
        AtomicBoolean atomicBoolean = this.f;
        if (!atomicBoolean.get() || atomicInteger2.get() >= 10) {
            atomicInteger.incrementAndGet();
            jH = this.o.h(atomicInteger.get());
        } else {
            jH = 1000;
        }
        atomicLong.set(D() + jH);
        wqi.g(str, exc, "updateConnTimeoutAfterFail, try_to_connect=%b, fa=%d, conn_errors=%d, next_conn_epoch=%d, delay=%dms", Boolean.valueOf(atomicBoolean.get()), Integer.valueOf(atomicInteger2.get()), Integer.valueOf(atomicInteger.get()), Long.valueOf(atomicLong.get()), Long.valueOf(jH));
    }

    public final void e(long j) {
        wqi.c(this.a, "cancel: %d", Long.valueOf(j));
        synchronized (this.y) {
            try {
                Iterator it = this.x.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    slb slbVar = (slb) it.next();
                    rlb rlbVar = slbVar.b;
                    if (rlbVar != null && rlbVar.c.k() == j) {
                        this.x.remove(slbVar);
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (Map.Entry entry : this.w.entrySet()) {
            if (((qlb) entry.getValue()).a.k() == j) {
                this.w.remove(entry.getKey());
                return;
            }
        }
    }

    public final void f(boolean z) {
        if (!this.g.compareAndSet(false, true)) {
            wqi.o(this.a, null, "close, " + this + " has ALREADY been CLOSED, skip re-closing", Arrays.copyOf(new Object[0], 0));
            return;
        }
        String str = this.a;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, "close, closing the " + this, null);
            }
        }
        z(false);
        this.z.a();
        this.A.a();
        if (g()) {
            i(true, z);
        }
        this.o.close();
        J.decrementAndGet();
        wqi.c(this.a, "close, " + this + " closed", new Object[0]);
    }

    public boolean g() throws IOException {
        Socket socket = this.r;
        if (socket == null || socket.isClosed()) {
            return false;
        }
        String str = this.a;
        wqi.c(str, "closeSocket", new Object[0]);
        try {
            this.r.close();
        } catch (Exception e) {
            wqi.e(str, "failed to close socket", e);
            u(e, false);
        }
        try {
            this.o.c(this.r);
        } catch (Exception e2) {
            wqi.e(str, "failed to remove traffic stat from closed socket", e2);
        }
        DataInputStream dataInputStream = this.t;
        if (dataInputStream != null) {
            try {
                dataInputStream.close();
            } catch (SocketException unused) {
            } catch (Throwable th) {
                wqi.p(str, "fail to close " + dataInputStream, th);
            }
        }
        DataOutputStream dataOutputStream = this.s;
        if (dataOutputStream == null) {
            return true;
        }
        try {
            dataOutputStream.close();
            return true;
        } catch (SocketException unused2) {
            return true;
        } catch (Throwable th2) {
            wqi.p(str, "fail to close " + dataOutputStream, th2);
            return true;
        }
    }

    public boolean h(int i) {
        boolean z;
        cb3 cb3Var = this.o;
        String str = this.a;
        if (n()) {
            AtomicBoolean atomicBoolean = this.n;
            if (!atomicBoolean.get()) {
                long jD = D();
                AtomicLong atomicLong = this.m;
                atomicLong.set(jD);
                boolean z2 = true;
                try {
                    wqi.c(str, "Connect", new Object[0]);
                    r();
                    g();
                    this.r = cb3Var.connect();
                    atomicLong.set(Long.MIN_VALUE);
                    if (atomicBoolean.get()) {
                        g();
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        return false;
                    }
                    this.s = new DataOutputStream(this.r.getOutputStream());
                    this.t = new DataInputStream(this.r.getInputStream());
                    y(1);
                    this.e.set(System.currentTimeMillis());
                    s(i);
                    this.i.set(0);
                    this.j.set(0L);
                    wqi.c(str, "Connect success, time: %s, host: %s, port: %s", Long.valueOf(D() - jD), cb3Var.i(), Integer.valueOf(cb3Var.d()));
                    return true;
                } catch (Exception e) {
                    if (atomicBoolean.get()) {
                        g();
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        return false;
                    }
                    wqi.e(str, "connectToSocket failure!", e);
                    if ((e instanceof ConnectException) && this.E != null) {
                        wqi.h("TTSession", "disableConnProblems", null);
                        gmf gmfVar = gmf.a;
                        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                    }
                    y(0);
                    t();
                    if (!(e instanceof ConnectingCanceledException)) {
                        u(e, false);
                        C(e);
                    }
                    return false;
                } finally {
                    atomicLong.set(Long.MIN_VALUE);
                }
            }
        }
        return false;
    }

    public final void i(boolean z, boolean z2) {
        ArrayList arrayList;
        wqi.c(this.a, "disconnect: clearSenderTasks %b", Boolean.valueOf(z));
        y(0);
        if (!this.n.get()) {
            t();
        }
        hzf hzfVar = new hzf();
        Iterator it = this.w.entrySet().iterator();
        while (it.hasNext()) {
            ((qlb) ((Map.Entry) it.next()).getValue()).a.e(hzfVar);
        }
        this.w.clear();
        if (z) {
            if (z2) {
                synchronized (this.y) {
                    this.x.clear();
                }
                return;
            }
            synchronized (this.y) {
                try {
                    Iterator it2 = this.x.iterator();
                    arrayList = null;
                    while (it2.hasNext()) {
                        slb slbVar = (slb) it2.next();
                        if (slbVar.b != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList(1);
                            }
                            arrayList.add(slbVar);
                        }
                    }
                    this.x.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (arrayList != null) {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    ((slb) it3.next()).b.c.e(hzfVar);
                }
            }
        }
    }

    public void j() {
        i(true, false);
    }

    public final void k(n2 n2Var, boolean z, long j, ezf ezfVar) {
        n2 n2Var2;
        if (n2Var instanceof oi8) {
            this.w.clear();
            synchronized (this.y) {
                this.x.clear();
            }
        }
        ArrayList arrayList = null;
        if (n2Var.z()) {
            synchronized (this.y) {
                try {
                    Iterator it = this.x.iterator();
                    while (it.hasNext()) {
                        slb slbVar = (slb) it.next();
                        rlb rlbVar = slbVar.b;
                        if (rlbVar != null && (n2Var2 = rlbVar.a) != null && n2Var2.P() == n2Var.P() && slbVar.b.a.Q() == n2Var.Q()) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(Long.valueOf(slbVar.b.c.k()));
                            String str = this.a;
                            short sP = slbVar.b.a.P();
                            xhb.c.getClass();
                            wqi.c(str, "cancel duplicated task: %s", qha.f(sP));
                        }
                    }
                    if (arrayList != null) {
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            e(((Long) it2.next()).longValue());
                        }
                    }
                } finally {
                }
            }
        } else if (n2Var.A()) {
            synchronized (this.y) {
                int iQ = n2Var.Q();
                Iterator it3 = this.x.iterator();
                while (it3.hasNext()) {
                    slb slbVar2 = (slb) it3.next();
                    rlb rlbVar2 = slbVar2.b;
                    if (rlbVar2 != null && rlbVar2.a.P() == n2Var.P() && slbVar2.b.a.Q() == iQ) {
                        String str2 = this.a;
                        l6b l6bVar = wqi.a;
                        if (l6bVar != null) {
                            lg8 lg8Var = lg8.d;
                            if (l6bVar.b(lg8Var)) {
                                Locale locale = Locale.US;
                                short sP2 = n2Var.P();
                                xhb.c.getClass();
                                l6bVar.c(lg8Var, str2, String.format(locale, "ignore duplicated request: %s, params: %s", qha.f(sP2), n2Var), null);
                            }
                        }
                        ezfVar.e(new pzf("client.task.ignored", "client.task.ignored", null));
                        return;
                    }
                }
            }
        }
        p(ag8.X, ezfVar.k(), (short) 0, n2Var.P(), true, n2Var.toString());
        rlb rlbVar3 = new rlb(n2Var, z, ezfVar);
        int i = s65.d;
        slb slbVar3 = new slb(1, rlbVar3, v9j.i(j, y65.MILLISECONDS), null);
        synchronized (this.y) {
            this.x.add(slbVar3);
        }
        this.A.a();
    }

    public long l() {
        long j = this.j.get();
        if (j > 0) {
            return Math.max(0L, j - D());
        }
        return 0L;
    }

    public final boolean n() {
        return this.c.get() == 0;
    }

    public final boolean o() {
        return (this.g.get() || this.n.get()) ? false : true;
    }

    public final void p(ag8 ag8Var, long j, short s, short s2, boolean z, String str) {
        q(ag8Var, j, s, s2, z, str, null, 0);
    }

    public final void q(ag8 ag8Var, long j, short s, short s2, boolean z, String str, String str2, int i) {
        xhb.c.getClass();
        String str3 = (String) xhb.o.get(Short.valueOf(s2));
        if (str3 == null) {
            str3 = qha.f(s2) + "(0x" + Integer.toHexString(65535 & s2) + ")";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(z ? "->" : "<-");
        sb.append(' ');
        sb.append(ag8Var.a);
        sb.append(' ');
        sb.append(str3);
        if (i != 0) {
            sb.append('/');
            sb.append(i);
            sb.append("B ");
        }
        sb.append('{');
        sb.append(j);
        sb.append(',');
        sb.append((int) s);
        sb.append("} ");
        if (str == null) {
            str = "";
        }
        sb.append(str);
        String string = sb.toString();
        boolean zEquals = false;
        wqi.k(ag8Var.b, this.a, string, new Object[0]);
        if (ag8Var == ag8.Y) {
            IllegalStateException illegalStateException = new IllegalStateException(u45.k(str3, ": ", string));
            if (str2 != null) {
                if (s2 == 64) {
                    zEquals = "attachment.not.ready".equals(str2);
                } else if (s2 == 89) {
                    zEquals = "link.not.found".equals(str2);
                } else if (s2 == 46) {
                    zEquals = "contact.not.found".equals(str2);
                }
            }
            u(illegalStateException, zEquals);
        }
    }

    public final void r() {
        if (o()) {
            oje ojeVar = this.u;
            String string = Integer.toString(this.l);
            String str = ojeVar.c;
            l6b l6bVar = wqi.a;
            if (l6bVar != null) {
                lg8 lg8Var = lg8.d;
                if (l6bVar.b(lg8Var)) {
                    l6bVar.c(lg8Var, str, "onConnectStarted for sessionId=".concat(string), null);
                }
            }
            if (ojeVar.h.isEmpty()) {
                di8 di8Var = ojeVar.b;
                di8 di8Var2 = di8.g;
                di8Var.r(null);
            }
            ojeVar.h.add(string);
        }
    }

    public final void s(int i) {
        if (o()) {
            oje ojeVar = this.u;
            String string = Integer.toString(this.l);
            yq3 yq3VarK = this.o.k();
            yq3VarK.c = i + 1;
            zq3 zq3VarA = yq3VarK.a();
            String str = ojeVar.c;
            l6b l6bVar = wqi.a;
            if (l6bVar != null) {
                lg8 lg8Var = lg8.d;
                if (l6bVar.b(lg8Var)) {
                    l6bVar.c(lg8Var, str, "onConnected for sessionId=" + string + ", connectStat=" + zq3VarA, null);
                }
            }
            ojeVar.l = 1;
            ojeVar.b();
            di8 di8Var = ojeVar.b;
            long j = zq3VarA.c;
            long j2 = zq3VarA.d;
            long j3 = zq3VarA.e;
            String str2 = zq3VarA.f;
            int i2 = zq3VarA.g;
            di8Var.getClass();
            String str3 = di8.h;
            ceg cegVar = str3 != null ? new ceg(str3) : null;
            String str4 = cegVar != null ? cegVar.a : null;
            if (str4 == null) {
                String str5 = di8.g.b;
                l6b l6bVar2 = wqi.a;
                if (l6bVar2 == null) {
                    return;
                }
                lg8 lg8Var2 = lg8.X;
                if (l6bVar2.b(lg8Var2)) {
                    l6bVar2.c(lg8Var2, str5, "Invoked 'onSocketConnected', but traceId is null or empty!", null);
                    return;
                }
                return;
            }
            if (j == 0) {
                di8 di8Var2 = di8.g;
                imb imbVar = new imb("tcp_handshake", Long.valueOf(j2));
                imb imbVar2 = new imb("tls_handshake", Long.valueOf(j3));
                Object[] objArr = rqa.a;
                w8a w8aVar = new w8a(2);
                w8aVar.b(imbVar);
                w8aVar.b(imbVar2);
                String strE = xc0.e(i2, str2, ":");
                c9a c9aVar = new c9a(2);
                c9aVar.i("cached_dns", 1);
                c9aVar.i(KwsFeaturesConfigProviderImpl.URL_KEY, strE);
                yqb.b(di8Var2, str4, w8aVar, c9aVar);
            } else {
                di8 di8Var3 = di8.g;
                imb imbVar3 = new imb("dns_resolve", Long.valueOf(j));
                imb imbVar4 = new imb("tcp_handshake", Long.valueOf(j2));
                imb imbVar5 = new imb("tls_handshake", Long.valueOf(j3));
                Object[] objArr2 = rqa.a;
                w8a w8aVar2 = new w8a(3);
                w8aVar2.b(imbVar3);
                w8aVar2.b(imbVar4);
                w8aVar2.b(imbVar5);
                String strE2 = xc0.e(i2, str2, ":");
                long[] jArr = fzd.a;
                c9a c9aVar2 = new c9a();
                c9aVar2.i(KwsFeaturesConfigProviderImpl.URL_KEY, strE2);
                yqb.b(di8Var3, str4, w8aVar2, c9aVar2);
            }
            yqb.c(di8.g, "session_established", 4, str4, 56);
        }
    }

    public final void t() {
        if (o()) {
            oje ojeVar = this.u;
            String string = Integer.toString(this.l);
            bi8 bi8Var = bi8.SOCKET_CLOSED;
            String str = ojeVar.c;
            l6b l6bVar = wqi.a;
            if (l6bVar != null) {
                lg8 lg8Var = lg8.d;
                if (l6bVar.b(lg8Var)) {
                    l6bVar.c(lg8Var, str, "onDisconnected for sessionId=".concat(string), null);
                }
            }
            if (ojeVar.l == 1 || ojeVar.l == 2) {
                ojeVar.b.getClass();
                di8.o(bi8Var);
                ojeVar.h.clear();
            } else {
                if (ojeVar.h.size() == 1) {
                    ojeVar.b.getClass();
                    di8.o(bi8Var);
                }
                ojeVar.h.remove(string);
            }
            ojeVar.l = 0;
            ojeVar.b();
        }
    }

    public final String toString() {
        int size = this.x.size();
        StringBuilder sb = new StringBuilder(96);
        sb.append("Session@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append("(");
        sb.append(J.get());
        sb.append('|');
        sb.append(this.g.get() ? "CLOSED" : "OPEN");
        sb.append('|');
        sb.append(m(this.c.get()));
        long j = this.m.get();
        long jMax = j != Long.MIN_VALUE ? Math.max(D() - j, 0L) : Long.MIN_VALUE;
        if (jMax != Long.MIN_VALUE) {
            az1.r(jMax, "|connecting~", "ms", sb);
        }
        sb.append("|destroy=");
        sb.append(this.n.get());
        sb.append("|send_tasks=");
        sb.append(size);
        sb.append(')');
        return sb.toString();
    }

    public final void u(Exception exc, boolean z) {
        String message;
        if (o()) {
            Integer.toString(this.l);
            oje ojeVar = this.u;
            yi5 yi5Var = ojeVar.a;
            k18 k18Var = ojeVar.d;
            if ((exc instanceof SessionSendLimitException) || (exc instanceof AddressUnreachableException)) {
                ((y3b) yi5Var).a(exc);
                return;
            }
            if (!(exc instanceof SSLHandshakeException)) {
                if ((exc instanceof IOException) || (exc instanceof SecurityException)) {
                    return;
                }
                if (!z) {
                    ((y3b) yi5Var).a(exc);
                }
                ((lv4) k18Var.getValue()).getClass();
                return;
            }
            if (!((lv4) k18Var.getValue()).d() || (message = exc.getMessage()) == null) {
                return;
            }
            if ((vmf.s(message, "current time", false) && vmf.s(message, "validation time", false)) || vmf.s(message, "not valid until", false)) {
                ((lv4) k18Var.getValue()).getClass();
            }
        }
    }

    public int v(int i, byte[] bArr, int i2) {
        return this.t.read(bArr, i, i2);
    }

    public byte[] w() throws IOException {
        byte[] bArr = new byte[10];
        this.t.readFully(bArr, 0, 10);
        return bArr;
    }

    public void x(byte[] bArr) throws IOException {
        this.s.write(bArr, 0, bArr.length);
    }

    public void y(int i) {
        int andSet = this.c.getAndSet(i);
        if (i == 0) {
            this.h.set(false);
        }
        String str = this.a;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, wy1.i("setConnectionsStatus, status=", m(i), ", old=", m(andSet)), null);
            }
        }
        this.z.a();
        if (andSet == i || n()) {
            return;
        }
        this.A.a();
    }

    public void z(boolean z) {
        Object[] objArr = {Boolean.valueOf(z)};
        String str = this.a;
        wqi.c(str, "setTryToConnect, tryToConnect=%b", objArr);
        AtomicBoolean atomicBoolean = this.f;
        if (atomicBoolean.compareAndSet(!z, z) && z) {
            this.B.set(0);
            wqi.c(str, "setTryToConnect, reset counter of failed attempts to connect", new Object[0]);
        }
        atomicBoolean.set(z);
        this.o.g(z);
        this.z.a();
    }
}
