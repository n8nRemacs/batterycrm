package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class nr8 extends atc {
    public long a;
    public boolean b;

    public nr8(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    @Override // defpackage.atc
    public final void a(ysc yscVar, btc btcVar, bj bjVar) {
        llf llfVar = yscVar.O0;
        llfVar.getClass();
        if (this.b) {
            if (this.a > llfVar.j.longValue()) {
                int iLongValue = (int) (this.a - llfVar.j.longValue());
                llfVar.e.debug("increased max bidirectional streams with " + iLongValue + " to " + this.a);
                llfVar.j = Long.valueOf(this.a);
                llfVar.l.release(iLongValue);
                return;
            }
            return;
        }
        if (this.a > llfVar.k.longValue()) {
            int iLongValue2 = (int) (this.a - llfVar.k.longValue());
            llfVar.e.debug("increased max unidirectional streams with " + iLongValue2 + " to " + this.a);
            llfVar.k = Long.valueOf(this.a);
            llfVar.m.release(iLongValue2);
        }
    }

    @Override // defpackage.atc
    public final int c() {
        return epi.a(this.a) + 1;
    }

    @Override // defpackage.atc
    public final void g(ByteBuffer byteBuffer) {
        byteBuffer.put((byte) (this.b ? 18 : 19));
        epi.c(this.a, byteBuffer);
    }

    public final void h(ByteBuffer byteBuffer) {
        byte b = byteBuffer.get();
        if (b != 18 && b != 19) {
            throw new RuntimeException();
        }
        this.b = b == 18;
        this.a = epi.i(byteBuffer);
    }

    public final String toString() {
        StringBuilder sbQ = xrf.q("MaxStreamsFrame[", this.a, this.b ? "B" : "U", ",");
        sbQ.append("]");
        return sbQ.toString();
    }
}
