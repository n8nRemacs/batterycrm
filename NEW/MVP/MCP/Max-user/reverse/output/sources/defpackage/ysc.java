package defpackage;

import androidx.work.WorkRequest;
import java.io.IOException;
import java.net.ConnectException;
import java.net.DatagramSocket;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

/* loaded from: classes3.dex */
public final class ysc implements plb {
    public volatile int A0;
    public final moc B0;
    public volatile ir3 C0;
    public final ScheduledExecutorService D0;
    public final ExecutorService E0;
    public final String G0;
    public final int H0;
    public final bbg I0;
    public final DatagramSocket J0;
    public final InetAddress K0;
    public final rde L0;
    public final unc M0;
    public volatile qb3 N0;
    public final llf O0;
    public volatile lig P0;
    public final rr3 Q0;
    public final zzg R0;
    public final long S0;
    public final db3 T0;
    public volatile byte[] U0;
    public final CountDownLatch V0;
    public volatile lig W0;
    public final String X0;
    public final List Y0;
    public boolean Z0;
    public final qje a;
    public final ArrayList a1;
    public final int b;
    public final t9f b1;
    public final bh8 c;
    public volatile Thread c1;
    public volatile String d1;
    public volatile hb3 e1;
    public volatile boolean f1;
    public volatile int g1;
    public final fs3 o;
    public volatile hf5 s0;
    public vc7 t0;
    public lhd w0;
    public final boolean y0;
    public volatile b36 z0;
    public int d = 1;
    public volatile int X = 1;
    public final Object Y = new Object();
    public final CopyOnWriteArrayList Z = new CopyOnWriteArrayList();
    public final ArrayList u0 = new ArrayList();
    public final ArrayList v0 = new ArrayList();
    public volatile int x0 = 3;
    public volatile int F0 = 1;

    public ysc(String str, int i, long j, db3 db3Var, zzg zzgVar, bh8 bh8Var, ArrayList arrayList, ff4 ff4Var) throws UnknownHostException {
        qje qjeVar = new qje(zzgVar);
        this.a = qjeVar;
        this.b = 1;
        this.c = bh8Var;
        this.y0 = false;
        new zsc(new hk6(new zsc(this, new zsc(this, this, this.c), 2)));
        this.o = new fs3(qjeVar, bh8Var);
        this.A0 = 1;
        moc mocVar = new moc();
        mocVar.a = 1;
        mocVar.b = 0;
        this.B0 = mocVar;
        this.D0 = Executors.newScheduledThreadPool(1, new pc4("scheduler", 0));
        this.E0 = Executors.newSingleThreadExecutor(new pc4("callback-executor", 0));
        this.s0 = hf5.a;
        this.V0 = new CountDownLatch(1);
        this.Y0 = Collections.synchronizedList(new ArrayList());
        this.g1 = 1;
        int iCharCount = 0;
        this.f1 = false;
        this.X0 = "h3";
        this.S0 = j;
        this.T0 = db3Var;
        StringBuilder sbM = utb.m(i, "Creating connection with ", str, ":", " with ");
        sbM.append(zzgVar);
        bh8Var.info(sbM.toString());
        this.R0 = zzgVar;
        this.G0 = str;
        this.H0 = i;
        if (str != null) {
            int length = str.length();
            while (iCharCount < length) {
                int iCodePointAt = str.codePointAt(iCharCount);
                if (!Character.isWhitespace(iCodePointAt)) {
                    InetAddress[] allByName = InetAddress.getAllByName(str);
                    int iV = az1.v(3);
                    InetAddress inetAddress = iV != 0 ? iV != 1 ? iV != 2 ? iV != 3 ? null : (InetAddress) Stream.of((Object[]) allByName).sorted(new ov5(5)).findFirst().orElseThrow(new yj7(3, str)) : (InetAddress) Stream.of((Object[]) allByName).sorted(new ov5(4)).findFirst().orElseThrow(new yj7(2, str)) : (InetAddress) Stream.of((Object[]) allByName).filter(new gb3(21)).findFirst().orElseThrow(new yj7(1, str)) : (InetAddress) Stream.of((Object[]) allByName).filter(new gb3(20)).findFirst().orElseThrow(new yj7(0, str));
                    this.K0 = inetAddress;
                    boolean z = inetAddress instanceof Inet4Address;
                    this.a1 = arrayList;
                    DatagramSocket datagramSocketCreateSocket = (ff4Var != null ? ff4Var : new iqa(13)).createSocket();
                    this.J0 = datagramSocketCreateSocket;
                    this.t0 = new vc7(this);
                    rde rdeVar = new rde(this.a, this.y0 ? 1200 : z ? 1252 : 1232, datagramSocketCreateSocket, new InetSocketAddress(inetAddress, i), this, bh8Var);
                    this.L0 = rdeVar;
                    pa5 pa5Var = rdeVar.k;
                    pa5Var.getClass();
                    pa5Var.c = hf5.values();
                    this.t0.f = new wsc(0, rdeVar);
                    this.b1 = rdeVar.l;
                    this.M0 = new unc(datagramSocketCreateSocket, bh8Var, new vsc(this, 3), new a6(9, this));
                    this.O0 = new llf(this, bh8Var, db3Var, this.E0);
                    this.Q0 = new rr3(rdeVar, new ov3(4, this), bh8Var);
                    this.A0 = 1;
                    this.I0 = new bbg(new xpb(this, bh8Var, false, 3), this);
                    return;
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
        }
        throw new IllegalArgumentException("hostname must be set");
    }

    public final void a(Throwable th) {
        if (this.A0 == 2) {
            this.d1 = th.toString();
        }
        this.A0 = 8;
        if (th != null) {
            this.c.error("Aborting connection because of error", th);
        }
        this.V0.countDown();
        this.L0.j();
        p();
        this.O0.a();
    }

    public final void b() {
        String str;
        synchronized (this) {
            try {
                if (this.A0 != 1) {
                    switch (this.A0) {
                        case 1:
                            str = "Created";
                            break;
                        case 2:
                            str = "Handshaking";
                            break;
                        case 3:
                            str = "Connected";
                            break;
                        case 4:
                            str = "Closing";
                            break;
                        case 5:
                            str = "Draining";
                            break;
                        case 6:
                            str = "Closed";
                            break;
                        case 7:
                            str = "Failed";
                            break;
                        case 8:
                            str = "Error";
                            break;
                        default:
                            str = "null";
                            break;
                    }
                    throw new IllegalStateException("Cannot connect a connection that is in state ".concat(str));
                }
                this.O0.g(this.T0);
                this.P0 = g();
                lig ligVar = this.P0;
                rr3 rr3Var = this.Q0;
                ligVar.n = rr3Var.g;
                List<ctc> list = Collections.EMPTY_LIST;
                this.c.info("Original destination connection id: " + uwi.a(rr3Var.h) + " (scid: " + uwi.a(this.Q0.g) + ")");
                fs3 fs3Var = this.o;
                lu4 lu4Var = this.Q0.f;
                fs3Var.b(lu4Var != null ? lu4Var.b : new byte[0]);
                ((Thread) this.M0.f).start();
                rde rdeVar = this.L0;
                rdeVar.q = this.o;
                rdeVar.o.start();
                this.c1 = new Thread(new tsc(this, 0), "receiver-loop");
                this.c1.setDaemon(true);
                this.c1.start();
                o(this.X0, !list.isEmpty());
                if (!list.isEmpty()) {
                    throw null;
                }
                try {
                    if (!this.V0.await(this.S0, TimeUnit.MILLISECONDS)) {
                        this.A0 = 7;
                        this.L0.j();
                        p();
                        throw new ConnectException("Connection timed out after " + this.S0 + " ms");
                    }
                    if (this.A0 != 3) {
                        this.A0 = 7;
                        this.L0.j();
                        p();
                        throw new ConnectException("Handshake error: " + (this.d1 != null ? this.d1 : ""));
                    }
                    if (!list.isEmpty()) {
                        if (this.g1 != 3) {
                            this.c.info("Server did not accept early data; retransmitting all data.");
                        }
                        for (ctc ctcVar : list) {
                            if (ctcVar != null) {
                                ((h85) ctcVar).g(this.g1 == 3);
                            }
                        }
                    }
                } catch (InterruptedException unused) {
                    this.A0 = 7;
                    this.L0.j();
                    p();
                    throw new RuntimeException();
                }
            } finally {
            }
        }
    }

    public final ctc c(boolean z) throws IOException {
        if (this.A0 != 3) {
            throw new IOException("not connected");
        }
        llf llfVar = this.O0;
        llfVar.getClass();
        try {
            return llfVar.f(z, WorkRequest.MIN_BACKOFF_MILLIS, TimeUnit.DAYS, new u4e(18, llfVar));
        } catch (TimeoutException unused) {
            throw new RuntimeException();
        }
    }

    public final void d(rs0 rs0Var) {
        String strConcat;
        String strH;
        ibg ibgVar;
        Long l = (Long) rs0Var.e;
        String str = rs0Var.c ? "Peer is closing " : "Closing ";
        Long l2 = (Long) rs0Var.d;
        if (l2 == null && l == null) {
            int i = rs0Var.b;
            StringBuilder sb = new StringBuilder(" (reason: ");
            sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "ConnectionLost" : "StatelessReset" : "ImmediateClose" : "IdleTimeout");
            sb.append(")");
            strH = sb.toString();
        } else {
            if (l2 != null) {
                int i2 = 0;
                if (l2.longValue() < 256 || l2.longValue() > 511) {
                    int[] iArrY = az1.y(19);
                    int length = iArrY.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            break;
                        }
                        int i4 = iArrY[i3];
                        if (utb.e(i4) == l2.longValue()) {
                            i2 = i4;
                            break;
                        }
                        i3++;
                    }
                    strConcat = "Transport error: ".concat(utb.s(i2));
                } else {
                    int iLongValue = (int) (l2.longValue() - 256);
                    ibg[] ibgVarArrValues = ibg.values();
                    int length2 = ibgVarArrValues.length;
                    while (true) {
                        if (i2 >= length2) {
                            ibgVar = null;
                            break;
                        }
                        ibgVar = ibgVarArrValues[i2];
                        if (ibgVar.a == iLongValue) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                    strConcat = "Transport error: CRYPTO_ERROR (" + ibgVar + ")";
                }
            } else if (l != null) {
                strConcat = "Application error: " + l;
            } else {
                strConcat = "No error";
            }
            strH = wy1.h(" with error ", strConcat);
        }
        this.c.info(str + this + strH);
    }

    public final db4 e(hf5 hf5Var) {
        ArrayList arrayList;
        hf5 hf5Var2;
        while (true) {
            arrayList = this.v0;
            if (arrayList.size() > hf5Var.ordinal()) {
                break;
            }
            arrayList.add(null);
        }
        if (arrayList.get(hf5Var.ordinal()) == null) {
            hf5Var2 = hf5Var;
            arrayList.set(hf5Var.ordinal(), new db4(this.a, hf5Var2, this.b, this.I0, this.c, this.L0));
        } else {
            hf5Var2 = hf5Var;
        }
        return (db4) arrayList.get(hf5Var2.ordinal());
    }

    public final void f(long j, String str, int i) {
        if (this.A0 == 4 || this.A0 == 5) {
            this.c.debug("Immediate close ignored because already closing");
            return;
        }
        d(new rs0(2, false, i == 1 ? Long.valueOf(j) : null, i == 2 ? Long.valueOf(j) : null));
        this.L0.j();
        m(j, str, i);
        this.A0 = 4;
        this.O0.a();
        if (this.s0 != hf5.a) {
            try {
                this.D0.schedule(new tsc(this, 2), this.L0.d() * 3, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException unused) {
            }
        } else {
            this.u0.add(new tsc(this, 3));
        }
        vqc qLog = this.c.getQLog();
        Instant.now();
        qLog.getClass();
    }

    public final lig g() {
        lig ligVar = new lig();
        db3 db3Var = this.T0;
        int i = db3Var.a;
        if (i <= 0) {
            throw new IllegalArgumentException("maxIdleTimeout must be set");
        }
        ligVar.b = i;
        long j = db3Var.d;
        if (j <= 0) {
            throw new IllegalArgumentException("maxConnectionBufferSize must be set");
        }
        ligVar.c = j;
        long j2 = db3Var.e;
        if (j2 <= 0) {
            throw new IllegalArgumentException("maxBidirectionalStreamBufferSize must be set");
        }
        ligVar.f = j2;
        long j3 = db3Var.f;
        if (j3 <= 0) {
            throw new IllegalArgumentException("maxBidirectionalStreamBufferSize must be set");
        }
        ligVar.d = j3;
        ligVar.e = j3;
        int i2 = db3Var.c;
        if (i2 < 0) {
            throw new IllegalArgumentException("maxOpenBidirectionalStreams must be set");
        }
        ligVar.g = i2;
        int i3 = db3Var.b;
        if (i3 < 0) {
            throw new IllegalArgumentException("maxOpenUnidirectionalStreams must be set");
        }
        ligVar.h = i3;
        int i4 = db3Var.g;
        if (i4 < 2) {
            throw new IllegalArgumentException("activeConnectionIdLimit must be set");
        }
        ligVar.m = i4;
        int i5 = db3Var.h;
        if (i5 < 1200) {
            throw new IllegalArgumentException("maxUdpPayloadSize must be set");
        }
        ligVar.p = i5;
        if (this.F0 == 2) {
            ligVar.s = 65535L;
        }
        return ligVar;
    }

    @Override // defpackage.plb
    public final void h(btc btcVar, bj bjVar) {
        if (btcVar.a(this, bjVar) == 2) {
            return;
        }
        t9f t9fVar = this.b1;
        t9fVar.getClass();
        if (btcVar.c()) {
            ((b6[]) t9fVar.b)[btcVar.n().ordinal()].d(btcVar);
        }
        vc7 vc7Var = this.t0;
        if (vc7Var.h) {
            vc7Var.g = vc7Var.a.instant();
            vc7Var.i = 1;
        }
    }

    public final void i(btc btcVar, bj bjVar) {
        Iterator it = btcVar.c.iterator();
        while (it.hasNext()) {
            ((atc) it.next()).a(this, btcVar, bjVar);
        }
    }

    public final void j() {
        sb3 sb3Var = new sb3(5);
        ArrayList arrayList = this.u0;
        arrayList.forEach(sb3Var);
        arrayList.clear();
    }

    public final void k(atc atcVar, Consumer consumer, boolean z) {
        hf5 hf5Var = hf5.d;
        rde rdeVar = this.L0;
        rdeVar.f(atcVar, hf5Var, consumer);
        if (z) {
            rdeVar.k();
        }
    }

    public final void l(Function function, int i, hf5 hf5Var, Consumer consumer, boolean z) {
        rde rdeVar = this.L0;
        rdeVar.g(function, i, hf5Var, consumer);
        if (z) {
            rdeVar.k();
        }
    }

    public final void m(long j, String str, int i) {
        hf5 hf5Var = hf5.a;
        hf5 hf5Var2 = hf5.d;
        if (i == 2 && this.s0 != hf5Var2) {
            m(12, "", 1);
            return;
        }
        Object obj = this.a.b;
        int iCharCount = 0;
        boolean z = i == 1;
        ir3 ir3Var = new ir3();
        ir3Var.c = new byte[0];
        ir3Var.d = -1;
        ir3Var.o = z ? 28 : 29;
        ir3Var.a = j;
        if (j >= 256 && j < 512) {
            ir3Var.d = (int) (j - 256);
        }
        if (str != null) {
            int length = str.length();
            while (true) {
                if (iCharCount >= length) {
                    break;
                }
                int iCodePointAt = str.codePointAt(iCharCount);
                if (!Character.isWhitespace(iCodePointAt)) {
                    ir3Var.c = str.getBytes(StandardCharsets.UTF_8);
                    break;
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
        }
        int iOrdinal = this.s0.ordinal();
        if (iOrdinal == 0) {
            this.L0.e(ir3Var, hf5Var);
        } else if (iOrdinal == 2) {
            this.L0.e(ir3Var, hf5Var);
            this.L0.e(ir3Var, hf5.c);
        } else if (iOrdinal == 3) {
            this.L0.e(ir3Var, hf5Var2);
        }
        this.C0 = ir3Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0344, code lost:
    
        if (java.util.Arrays.equals(r18.Q0.j, r18.W0.o) != false) goto L111;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(defpackage.lig r19) throws tech.kwik.core.impl.TransportError {
        /*
            Method dump skipped, instructions count: 1190
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ysc.n(lig):void");
    }

    public final void o(String str, boolean z) {
        bbg bbgVar = this.I0;
        bbgVar.g = this.G0;
        bbgVar.h.addAll(this.a1);
        if (((zzg) this.a.b).b()) {
            lig ligVar = this.P0;
            zzg zzgVar = zzg.c;
            Object[] objArr = {zzgVar, zzg.b};
            ArrayList arrayList = new ArrayList(2);
            for (int i = 0; i < 2; i++) {
                Object obj = objArr[i];
                Objects.requireNonNull(obj);
                arrayList.add(obj);
            }
            ligVar.r = new enb(zzgVar, 14, Collections.unmodifiableList(arrayList));
        }
        this.I0.k.add(new dtc((zzg) this.a.b, this.P0));
        this.I0.k.add(new bs(str));
        if (z) {
            this.I0.k.add(new g85());
        }
        try {
            Object[] objArr2 = {obg.rsa_pss_rsae_sha256, obg.rsa_pss_rsae_sha384, obg.rsa_pss_rsae_sha512, obg.ecdsa_secp256r1_sha256, obg.ecdsa_secp384r1_sha384, obg.ecdsa_secp521r1_sha512};
            ArrayList arrayList2 = new ArrayList(6);
            for (int i2 = 0; i2 < 6; i2++) {
                Object obj2 = objArr2[i2];
                Objects.requireNonNull(obj2);
                arrayList2.add(obj2);
            }
            this.I0.x(mbg.secp256r1, Collections.unmodifiableList(arrayList2));
        } catch (IOException unused) {
        }
    }

    public final void p() {
        vc7 vc7Var = this.t0;
        if (vc7Var.h) {
            vc7Var.b.shutdown();
        }
        rde rdeVar = this.L0;
        rdeVar.getClass();
        rdeVar.u = true;
        rdeVar.o.interrupt();
        this.A0 = 6;
        this.D0.shutdown();
        this.V0.countDown();
        unc uncVar = this.M0;
        uncVar.a = true;
        ((Thread) uncVar.f).interrupt();
        this.J0.close();
        if (this.c1 != null) {
            this.c1.interrupt();
        }
    }

    public final String toString() {
        String strA = uwi.a(this.Q0.h);
        String strA2 = uwi.a(this.Q0.g);
        int i = ((zzg) this.a.b).a;
        char c = i != 1 ? i == 1798521807 ? (char) 2 : (char) 0 : (char) 1;
        InetSocketAddress inetSocketAddress = new InetSocketAddress(this.K0, this.H0);
        StringBuilder sbL = wy1.l("ClientConnection[", strA, "/", strA2, "(");
        sbL.append(c != 1 ? c != 2 ? "null" : "V2" : "V1");
        sbL.append(") with ");
        sbL.append(inetSocketAddress);
        sbL.append("]");
        return sbL.toString();
    }
}
