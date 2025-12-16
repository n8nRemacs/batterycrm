package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.security.MessageDigest;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.zip.Inflater;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.protocol.HTTP;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public final class xbd implements l0i {
    public static final List x = Collections.singletonList(epc.HTTP_1_1);
    public final String a;
    public mbd b;
    public vbd c;
    public m0i d;
    public n0i e;
    public final y2g f;
    public String g;
    public pbd h;
    public long k;
    public boolean l;
    public String n;
    public boolean o;
    public int p;
    public boolean q;
    public final zmd r;
    public final w7c s;
    public final Random t;
    public final long u;
    public final long w;
    public k0i v = null;
    public final ArrayDeque i = new ArrayDeque();
    public final ArrayDeque j = new ArrayDeque();
    public int m = -1;

    public xbd(b3g b3gVar, zmd zmdVar, w7c w7cVar, Random random, long j, long j2) {
        this.r = zmdVar;
        this.s = w7cVar;
        this.t = random;
        this.u = j;
        this.w = j2;
        this.f = b3gVar.e();
        String str = zmdVar.c;
        if (!HttpGet.METHOD_NAME.equals(str)) {
            throw new IllegalArgumentException(wy1.h("Request must be GET: ", str).toString());
        }
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        this.a = r8j.m(bArr).a();
    }

    public final void a(ood oodVar, gge ggeVar) {
        j17 j17Var = oodVar.X;
        int i = oodVar.d;
        if (i != 101) {
            StringBuilder sb = new StringBuilder("Expected HTTP 101 response but was '");
            sb.append(i);
            sb.append(' ');
            throw new ProtocolException(u45.l(sb, oodVar.c, '\''));
        }
        String strA = j17Var.a(HTTP.CONN_DIRECTIVE);
        if (strA == null) {
            strA = null;
        }
        if (!"Upgrade".equalsIgnoreCase(strA)) {
            throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + strA + '\'');
        }
        String strA2 = j17Var.a("Upgrade");
        if (strA2 == null) {
            strA2 = null;
        }
        if (!"websocket".equalsIgnoreCase(strA2)) {
            throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + strA2 + '\'');
        }
        String strA3 = j17Var.a("Sec-WebSocket-Accept");
        String str = strA3 != null ? strA3 : null;
        String strA4 = new xx0(MessageDigest.getInstance("SHA-1").digest(ho7.l(new StringBuilder(), this.a, "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").getBytes(lb2.a))).a();
        if (fni.a(strA4, str)) {
            if (ggeVar == null) {
                throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
            }
            return;
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + strA4 + "' but was '" + str + '\'');
    }

    public final boolean b(int i, String str) {
        String str2;
        synchronized (this) {
            xx0 xx0Var = null;
            try {
                if (i < 1000 || i >= 5000) {
                    str2 = "Code must be in range [1000,5000): " + i;
                } else if ((1004 > i || 1006 < i) && (1015 > i || 2999 < i)) {
                    str2 = null;
                } else {
                    str2 = "Code " + i + " is reserved and may not be used.";
                }
                if (str2 != null) {
                    throw new IllegalArgumentException(str2.toString());
                }
                if (str != null) {
                    xx0Var = new xx0(str.getBytes(lb2.a));
                    xx0Var.b = str;
                    if (r1.length > 123) {
                        throw new IllegalArgumentException("reason.size() > 123: ".concat(str).toString());
                    }
                }
                if (!this.o && !this.l) {
                    this.l = true;
                    this.j.add(new tbd(i, xx0Var));
                    f();
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    public final void c(Exception exc) {
        synchronized (this) {
            if (this.o) {
                return;
            }
            this.o = true;
            pbd pbdVar = this.h;
            this.h = null;
            m0i m0iVar = this.d;
            this.d = null;
            n0i n0iVar = this.e;
            this.e = null;
            this.f.e();
            try {
                xpb xpbVar = (xpb) this.s.a;
                q0f.access$handleSocketFailure((q0f) xpbVar.b, ((jt) xpbVar.c).b, exc);
            } finally {
                if (pbdVar != null) {
                    yxg.c(pbdVar);
                }
                if (m0iVar != null) {
                    yxg.c(m0iVar);
                }
                if (n0iVar != null) {
                    yxg.c(n0iVar);
                }
            }
        }
    }

    public final void d(String str, pbd pbdVar) {
        k0i k0iVar = this.v;
        synchronized (this) {
            try {
                this.g = str;
                this.h = pbdVar;
                this.e = new n0i(pbdVar.b, this.t, k0iVar.a, k0iVar.c, this.w);
                this.c = new vbd(this);
                long j = this.u;
                if (j != 0) {
                    long nanos = TimeUnit.MILLISECONDS.toNanos(j);
                    this.f.c(new wbd(str.concat(" ping"), nanos, this), nanos);
                }
                if (!this.j.isEmpty()) {
                    f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.d = new m0i(pbdVar.a, this, k0iVar.a, k0iVar.e);
    }

    public final void e() {
        while (this.m == -1) {
            m0i m0iVar = this.d;
            m0iVar.w();
            if (!m0iVar.o) {
                l0i l0iVar = m0iVar.v0;
                qu0 qu0Var = m0iVar.Z;
                int i = m0iVar.b;
                if (i != 1 && i != 2) {
                    byte[] bArr = yxg.a;
                    throw new ProtocolException("Unknown opcode: ".concat(Integer.toHexString(i)));
                }
                while (!m0iVar.a) {
                    long j = m0iVar.c;
                    if (j > 0) {
                        m0iVar.u0.O(qu0Var, j);
                    }
                    if (m0iVar.d) {
                        if (m0iVar.X) {
                            ti9 ti9Var = m0iVar.s0;
                            if (ti9Var == null) {
                                ti9Var = new ti9(m0iVar.x0, 1);
                                m0iVar.s0 = ti9Var;
                            }
                            Inflater inflater = (Inflater) ti9Var.d;
                            qu0 qu0Var2 = ti9Var.b;
                            if (qu0Var2.b != 0) {
                                throw new IllegalArgumentException("Failed requirement.");
                            }
                            if (ti9Var.c) {
                                inflater.reset();
                            }
                            qu0Var2.p0(qu0Var);
                            qu0Var2.t0(65535);
                            long bytesRead = inflater.getBytesRead() + qu0Var2.b;
                            do {
                                ((zj7) ti9Var.o).c(qu0Var, BuildConfig.MAX_TIME_TO_UPLOAD);
                            } while (inflater.getBytesRead() < bytesRead);
                        }
                        if (i == 1) {
                            q0f.access$handleSocketMessage((q0f) ((xpb) ((xbd) l0iVar).s.a).b, qu0Var.k0());
                        } else {
                            qu0Var.e(qu0Var.b);
                            w7c w7cVar = ((xbd) l0iVar).s;
                        }
                    } else {
                        while (!m0iVar.a) {
                            m0iVar.w();
                            if (!m0iVar.o) {
                                break;
                            } else {
                                m0iVar.l();
                            }
                        }
                        if (m0iVar.b != 0) {
                            int i2 = m0iVar.b;
                            byte[] bArr2 = yxg.a;
                            throw new ProtocolException("Expected continuation opcode. Got: ".concat(Integer.toHexString(i2)));
                        }
                    }
                }
                throw new IOException("closed");
            }
            m0iVar.l();
        }
    }

    public final void f() {
        byte[] bArr = yxg.a;
        vbd vbdVar = this.c;
        if (vbdVar != null) {
            this.f.c(vbdVar, 0L);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0090 A[Catch: all -> 0x008d, TryCatch #2 {all -> 0x008d, blocks: (B:32:0x0088, B:35:0x0090, B:38:0x0096, B:39:0x00a0, B:41:0x00ac, B:44:0x00b0, B:45:0x00b1, B:46:0x00b2, B:47:0x00b9, B:48:0x00ba, B:51:0x00c0, B:65:0x00e3, B:68:0x0107, B:70:0x0111, B:71:0x0118, B:74:0x0123, B:76:0x0127, B:85:0x0145, B:86:0x0147, B:87:0x0148, B:88:0x0151, B:66:0x00f7, B:89:0x0152, B:90:0x0159, B:91:0x015a, B:92:0x015f, B:73:0x0120, B:40:0x00a1), top: B:105:0x0084, inners: #0, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0136 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x013b A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0140 A[DONT_GENERATE] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v6, types: [n0i] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xbd.g():boolean");
    }
}
