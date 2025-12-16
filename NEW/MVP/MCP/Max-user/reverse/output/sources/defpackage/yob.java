package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class yob extends atc {
    public byte[] a;

    @Override // defpackage.atc
    public final void a(ysc yscVar, btc btcVar, bj bjVar) {
    }

    @Override // defpackage.atc
    public final int c() {
        return 9;
    }

    @Override // defpackage.atc
    public final void g(ByteBuffer byteBuffer) {
        byteBuffer.put((byte) 27);
        byteBuffer.put(this.a);
    }

    public final void h(ByteBuffer byteBuffer) {
        byteBuffer.get();
        byte[] bArr = new byte[8];
        this.a = bArr;
        byteBuffer.get(bArr);
    }

    public final String toString() {
        return ho7.i("PathResponseFrame[", uwi.a(this.a), "]");
    }
}
