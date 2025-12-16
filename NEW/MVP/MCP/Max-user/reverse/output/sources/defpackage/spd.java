package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class spd extends atc {
    public int a;

    @Override // defpackage.atc
    public final void a(ysc yscVar, btc btcVar, bj bjVar) {
        rr3 rr3Var = yscVar.Q0;
        byte[] bArrK = btcVar.k();
        rr3Var.getClass();
        if (this.a > ((Integer) rr3Var.e.a.keySet().stream().max(new ov5(28)).get()).intValue()) {
            rr3Var.d.accept(10, "invalid connection ID sequence number");
            return;
        }
        int i = this.a;
        if (Arrays.equals(((or3) rr3Var.e.a.get(Integer.valueOf(i))).b, bArrK)) {
            rr3Var.d.accept(10, "cannot retire current connection ID");
        } else if (rr3Var.e.c(i) != null) {
            rr3Var.b.getClass();
            if (rr3Var.e.b().size() < rr3Var.i) {
                rr3Var.a();
            }
        }
    }

    @Override // defpackage.atc
    public final int c() {
        return epi.a(this.a) + 1;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof spd) && ((spd) obj).a == this.a;
    }

    @Override // defpackage.atc
    public final void g(ByteBuffer byteBuffer) {
        byteBuffer.put((byte) 25);
        epi.b(this.a, byteBuffer);
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return wy1.e(this.a, "RetireConnectionIdFrame[", "]");
    }
}
