package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class emf extends atc {
    public boolean a;
    public long b;

    @Override // defpackage.atc
    public final void a(ysc yscVar, btc btcVar, bj bjVar) {
        yscVar.c.warn("Received " + this);
    }

    @Override // defpackage.atc
    public final int c() {
        return epi.a(this.b) + 1;
    }

    @Override // defpackage.atc
    public final void g(ByteBuffer byteBuffer) {
        byteBuffer.put(this.a ? (byte) 22 : (byte) 23);
        epi.c(this.b, byteBuffer);
    }

    public final void h(ByteBuffer byteBuffer) {
        this.a = byteBuffer.get() == 22;
        this.b = epi.i(byteBuffer);
    }

    public final String toString() {
        StringBuilder sbQ = xrf.q("StreamsBlockedFrame[", this.b, this.a ? "B" : "U", "|");
        sbQ.append("]");
        return sbQ.toString();
    }
}
