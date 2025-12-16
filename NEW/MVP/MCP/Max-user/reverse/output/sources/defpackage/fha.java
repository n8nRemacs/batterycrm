package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class fha extends atc {
    public byte[] a;

    @Override // defpackage.atc
    public final void a(ysc yscVar, btc btcVar, bj bjVar) {
        if (this.a.length == 0) {
            yscVar.f(7, "empty token in NEW_TOKEN frame", 1);
        }
    }

    @Override // defpackage.atc
    public final int c() {
        return epi.a(this.a.length) + 1 + this.a.length;
    }

    @Override // defpackage.atc
    public final void g(ByteBuffer byteBuffer) {
        byteBuffer.put((byte) 7);
        epi.b(this.a.length, byteBuffer);
        byteBuffer.put(this.a);
    }

    public final void h(ByteBuffer byteBuffer, bh8 bh8Var) {
        byteBuffer.get();
        byte[] bArr = new byte[epi.g(byteBuffer)];
        this.a = bArr;
        byteBuffer.get(bArr);
        bh8Var.debug("Got New Token: ", this.a);
    }

    public final String toString() {
        return ho7.i("NewTokenFrame[", uwi.a(this.a), "]");
    }
}
