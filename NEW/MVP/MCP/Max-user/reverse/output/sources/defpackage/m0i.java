package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class m0i implements Closeable {
    public boolean X;
    public boolean a;
    public int b;
    public long c;
    public boolean d;
    public boolean o;
    public ti9 s0;
    public final wv0 u0;
    public final l0i v0;
    public final boolean w0;
    public final boolean x0;
    public final qu0 Y = new qu0();
    public final qu0 Z = new qu0();
    public final byte[] t0 = null;

    public m0i(wv0 wv0Var, xbd xbdVar, boolean z, boolean z2) {
        this.u0 = wv0Var;
        this.v0 = xbdVar;
        this.w0 = z;
        this.x0 = z2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        ti9 ti9Var = this.s0;
        if (ti9Var != null) {
            ti9Var.close();
        }
    }

    public final void l() throws IOException {
        String strK0;
        short s;
        m0i m0iVar;
        n0i n0iVar;
        long j = this.c;
        if (j > 0) {
            this.u0.O(this.Y, j);
        }
        switch (this.b) {
            case 8:
                qu0 qu0Var = this.Y;
                long j2 = qu0Var.b;
                if (j2 == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                pbd pbdVar = null;
                if (j2 != 0) {
                    s = qu0Var.readShort();
                    strK0 = this.Y.k0();
                    String strF = (s < 1000 || s >= 5000) ? ho7.f(s, "Code must be in range [1000,5000): ") : ((1004 > s || 1006 < s) && (1015 > s || 2999 < s)) ? null : wy1.e(s, "Code ", " is reserved and may not be used.");
                    if (strF != null) {
                        throw new ProtocolException(strF);
                    }
                } else {
                    strK0 = "";
                    s = 1005;
                }
                xbd xbdVar = (xbd) this.v0;
                xbdVar.getClass();
                if (s == -1) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                synchronized (xbdVar) {
                    if (xbdVar.m != -1) {
                        throw new IllegalStateException("already closed");
                    }
                    xbdVar.m = s;
                    xbdVar.n = strK0;
                    if (xbdVar.l && xbdVar.j.isEmpty()) {
                        pbd pbdVar2 = xbdVar.h;
                        xbdVar.h = null;
                        m0iVar = xbdVar.d;
                        xbdVar.d = null;
                        n0iVar = xbdVar.e;
                        xbdVar.e = null;
                        xbdVar.f.e();
                        pbdVar = pbdVar2;
                    } else {
                        m0iVar = null;
                        n0iVar = null;
                    }
                }
                try {
                    w7c w7cVar = xbdVar.s;
                    if (pbdVar != null) {
                        ((q0f) ((xpb) w7cVar.a).b).a(strK0);
                    }
                    this.a = true;
                    return;
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
            case 9:
                l0i l0iVar = this.v0;
                qu0 qu0Var2 = this.Y;
                xx0 xx0VarE = qu0Var2.e(qu0Var2.b);
                xbd xbdVar2 = (xbd) l0iVar;
                synchronized (xbdVar2) {
                    try {
                        if (!xbdVar2.o && (!xbdVar2.l || !xbdVar2.j.isEmpty())) {
                            xbdVar2.i.add(xx0VarE);
                            xbdVar2.f();
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            case 10:
                l0i l0iVar2 = this.v0;
                qu0 qu0Var3 = this.Y;
                qu0Var3.e(qu0Var3.b);
                xbd xbdVar3 = (xbd) l0iVar2;
                synchronized (xbdVar3) {
                    xbdVar3.q = false;
                }
                return;
            default:
                int i = this.b;
                byte[] bArr = yxg.a;
                throw new ProtocolException("Unknown control opcode: ".concat(Integer.toHexString(i)));
        }
    }

    public final void w() throws IOException {
        boolean z;
        if (this.a) {
            throw new IOException("closed");
        }
        wv0 wv0Var = this.u0;
        long jH = wv0Var.m().h();
        wv0Var.m().b();
        try {
            byte b = wv0Var.readByte();
            byte[] bArr = yxg.a;
            wv0Var.m().g(jH, TimeUnit.NANOSECONDS);
            int i = b & 15;
            this.b = i;
            boolean z2 = (b & 128) != 0;
            this.d = z2;
            boolean z3 = (b & 8) != 0;
            this.o = z3;
            if (z3 && !z2) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z4 = (b & 64) != 0;
            if (i == 1 || i == 2) {
                if (!z4) {
                    z = false;
                } else {
                    if (!this.w0) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    z = true;
                }
                this.X = z;
            } else if (z4) {
                throw new ProtocolException("Unexpected rsv1 flag");
            }
            if ((b & 32) != 0) {
                throw new ProtocolException("Unexpected rsv2 flag");
            }
            if ((b & 16) != 0) {
                throw new ProtocolException("Unexpected rsv3 flag");
            }
            byte b2 = wv0Var.readByte();
            boolean z5 = (b2 & 128) != 0;
            if (z5) {
                throw new ProtocolException("Server-sent frames must not be masked.");
            }
            long j = b2 & 127;
            this.c = j;
            if (j == 126) {
                this.c = wv0Var.readShort() & 65535;
            } else if (j == 127) {
                long j2 = wv0Var.readLong();
                this.c = j2;
                if (j2 < 0) {
                    throw new ProtocolException("Frame length 0x" + Long.toHexString(this.c) + " > 0x7FFFFFFFFFFFFFFF");
                }
            }
            if (this.o && this.c > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (z5) {
                wv0Var.readFully(this.t0);
            }
        } catch (Throwable th) {
            wv0Var.m().g(jH, TimeUnit.NANOSECONDS);
            throw th;
        }
    }
}
