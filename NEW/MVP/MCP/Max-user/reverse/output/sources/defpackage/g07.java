package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class g07 extends atc {
    @Override // defpackage.atc
    public final void a(ysc yscVar, btc btcVar, bj bjVar) {
        synchronized (yscVar.Y) {
            try {
                if (az1.v(yscVar.X) < az1.v(5)) {
                    yscVar.X = 5;
                    yscVar.Z.forEach(new vsc(yscVar, 0));
                } else {
                    yscVar.c.debug("Handshake state cannot be set to Confirmed");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        yscVar.L0.b(m5c.b, "HandshakeDone is received");
        fs3 fs3Var = yscVar.o;
        ((boolean[]) fs3Var.j)[2] = true;
        ((hc[]) fs3Var.h)[2] = null;
        ((hc[]) fs3Var.i)[2] = null;
    }

    @Override // defpackage.atc
    public final int c() {
        return 1;
    }

    @Override // defpackage.atc
    public final void g(ByteBuffer byteBuffer) {
        byteBuffer.put((byte) 30);
    }

    public final void h(ByteBuffer byteBuffer) {
        if (byteBuffer.get() != 30) {
            throw new RuntimeException();
        }
    }

    public final String toString() {
        return "HandshakeDoneFrame[]";
    }
}
