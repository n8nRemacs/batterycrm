package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class mbd implements Cloneable {
    public final boolean A0;
    public qbd X;
    public boolean Y;
    public gge Z;
    public final z95 a;
    public final s87 b;
    public final AtomicBoolean c;
    public Object d;
    public gj5 o;
    public boolean s0;
    public boolean t0;
    public boolean u0;
    public volatile boolean v0;
    public volatile gge w0;
    public volatile qbd x0;
    public final sua y0;
    public final zmd z0;

    public mbd(sua suaVar, zmd zmdVar, boolean z) {
        this.y0 = suaVar;
        this.z0 = zmdVar;
        this.A0 = z;
        this.a = (z95) suaVar.b.b;
        suaVar.o.getClass();
        s87 s87Var = new s87(1, this);
        s87Var.g(0, TimeUnit.MILLISECONDS);
        this.b = s87Var;
        this.c = new AtomicBoolean();
        this.u0 = true;
    }

    public static final String a(mbd mbdVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(mbdVar.v0 ? "canceled " : "");
        sb.append(mbdVar.A0 ? "web socket" : "call");
        sb.append(" to ");
        sb.append(mbdVar.z0.b.h());
        return sb.toString();
    }

    public final void b(qbd qbdVar) {
        byte[] bArr = yxg.a;
        if (this.X != null) {
            throw new IllegalStateException("Check failed.");
        }
        this.X = qbdVar;
        qbdVar.o.add(new lbd(this, this.d));
    }

    public final IOException c(IOException iOException) throws IOException {
        Socket socketK;
        byte[] bArr = yxg.a;
        qbd qbdVar = this.X;
        if (qbdVar != null) {
            synchronized (qbdVar) {
                socketK = k();
            }
            if (this.X == null) {
                if (socketK != null) {
                    yxg.d(socketK);
                }
            } else if (socketK != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (this.Y || !this.b.j()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final Object clone() {
        return new mbd(this.y0, this.z0, this.A0);
    }

    public final void d() {
        Socket socket;
        if (this.v0) {
            return;
        }
        this.v0 = true;
        gge ggeVar = this.w0;
        if (ggeVar != null) {
            ((fj5) ggeVar.o).cancel();
        }
        qbd qbdVar = this.x0;
        if (qbdVar == null || (socket = qbdVar.b) == null) {
            return;
        }
        yxg.d(socket);
    }

    public final void e(ou1 ou1Var) {
        kbd kbdVar;
        if (!this.c.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        p2c p2cVar = p2c.a;
        this.d = p2c.a.g();
        fa6 fa6Var = this.y0.a;
        kbd kbdVar2 = new kbd(this, ou1Var);
        synchronized (fa6Var) {
            ((ArrayDeque) fa6Var.b).add(kbdVar2);
            if (!this.A0) {
                String str = this.z0.b.e;
                Iterator it = ((ArrayDeque) fa6Var.c).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        Iterator it2 = ((ArrayDeque) fa6Var.b).iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                kbdVar = null;
                                break;
                            } else {
                                kbdVar = (kbd) it2.next();
                                if (fni.a(kbdVar.c.z0.b.e, str)) {
                                    break;
                                }
                            }
                        }
                    } else {
                        kbdVar = (kbd) it.next();
                        if (fni.a(kbdVar.c.z0.b.e, str)) {
                            break;
                        }
                    }
                }
                if (kbdVar != null) {
                    kbdVar2.a = kbdVar.a;
                }
            }
        }
        fa6Var.A();
    }

    public final ood f() {
        if (!this.c.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        this.b.i();
        p2c p2cVar = p2c.a;
        this.d = p2c.a.g();
        try {
            fa6 fa6Var = this.y0.a;
            synchronized (fa6Var) {
                ((ArrayDeque) fa6Var.d).add(this);
            }
            return h();
        } finally {
            fa6 fa6Var2 = this.y0.a;
            fa6Var2.t((ArrayDeque) fa6Var2.d, this);
        }
    }

    public final void g(boolean z) {
        gge ggeVar;
        synchronized (this) {
            if (!this.u0) {
                throw new IllegalStateException("released");
            }
        }
        if (z && (ggeVar = this.w0) != null) {
            ((fj5) ggeVar.o).cancel();
            ((mbd) ggeVar.c).i(ggeVar, true, true, null);
        }
        this.Z = null;
    }

    public final ood h() {
        ArrayList arrayList = new ArrayList();
        af3.v(arrayList, this.y0.c);
        arrayList.add(new mt0(2, this.y0));
        arrayList.add(new mt0(0, this.y0.t0));
        arrayList.add(new qy0(0));
        arrayList.add(qy0.b);
        if (!this.A0) {
            af3.v(arrayList, this.y0.d);
        }
        arrayList.add(new xo1(this.A0));
        zmd zmdVar = this.z0;
        sua suaVar = this.y0;
        try {
            try {
                ood oodVarD = new rbd(this, arrayList, 0, null, zmdVar, suaVar.F0, suaVar.G0, suaVar.H0).d(zmdVar);
                if (this.v0) {
                    yxg.c(oodVarD);
                    throw new IOException("Canceled");
                }
                j(null);
                return oodVarD;
            } catch (IOException e) {
                IOException iOExceptionJ = j(e);
                if (iOExceptionJ == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
                }
                throw iOExceptionJ;
            }
        } catch (Throwable th) {
            if (0 == 0) {
                j(null);
            }
            throw th;
        }
    }

    public final IOException i(gge ggeVar, boolean z, boolean z2, IOException iOException) {
        boolean z3;
        boolean z4;
        if (ggeVar.equals(this.w0)) {
            synchronized (this) {
                z3 = false;
                if (z) {
                    try {
                        if (!this.s0) {
                            if (z2 || !this.t0) {
                                z4 = false;
                            }
                        }
                        if (z) {
                            this.s0 = false;
                        }
                        if (z2) {
                            this.t0 = false;
                        }
                        boolean z5 = this.s0;
                        boolean z6 = (z5 || this.t0) ? false : true;
                        if (!z5 && !this.t0) {
                            if (!this.u0) {
                                z3 = true;
                            }
                        }
                        z4 = z3;
                        z3 = z6;
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    if (z2) {
                    }
                    z4 = false;
                }
            }
            if (z3) {
                this.w0 = null;
                qbd qbdVar = this.X;
                if (qbdVar != null) {
                    synchronized (qbdVar) {
                        qbdVar.l++;
                    }
                }
            }
            if (z4) {
                return c(iOException);
            }
        }
        return iOException;
    }

    public final IOException j(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.u0) {
                this.u0 = false;
                if (!this.s0) {
                    if (!this.t0) {
                        z = true;
                    }
                }
            }
        }
        return z ? c(iOException) : iOException;
    }

    public final Socket k() {
        qbd qbdVar = this.X;
        byte[] bArr = yxg.a;
        ArrayList arrayList = qbdVar.o;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (fni.a((mbd) ((Reference) it.next()).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            throw new IllegalStateException("Check failed.");
        }
        arrayList.remove(i);
        this.X = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        qbdVar.p = System.nanoTime();
        z95 z95Var = this.a;
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) z95Var.d;
        y2g y2gVar = (y2g) z95Var.b;
        byte[] bArr2 = yxg.a;
        if (!qbdVar.i) {
            y2gVar.c((k87) z95Var.c, 0L);
            return null;
        }
        qbdVar.i = true;
        concurrentLinkedQueue.remove(qbdVar);
        if (concurrentLinkedQueue.isEmpty()) {
            y2gVar.a();
        }
        return qbdVar.c;
    }
}
