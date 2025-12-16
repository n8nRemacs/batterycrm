package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class qob extends atc {
    public byte[] a;

    @Override // defpackage.atc
    public final void a(ysc yscVar, btc btcVar, bj bjVar) {
        Object obj = yscVar.a.b;
        byte[] bArr = this.a;
        yob yobVar = new yob();
        if (bArr.length != 8) {
            throw new IllegalArgumentException("Path Response Frame must contain 8 bytes data");
        }
        yobVar.a = bArr;
        yscVar.k(yobVar, new sb3(4), false);
    }

    @Override // defpackage.atc
    public final int c() {
        return 9;
    }

    @Override // defpackage.atc
    public final void g(ByteBuffer byteBuffer) {
        byteBuffer.put((byte) 26);
        byteBuffer.put(this.a);
    }

    public final void h(ByteBuffer byteBuffer) {
        if (byteBuffer.get() != 26) {
            throw new RuntimeException();
        }
        byte[] bArr = new byte[8];
        this.a = bArr;
        byteBuffer.get(bArr);
    }

    public final String toString() {
        return ho7.i("PathChallengeFrame[", uwi.a(this.a), "]");
    }
}
