package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class ulb extends atc {
    public int a;

    public ulb(int i) {
        this.a = i;
    }

    @Override // defpackage.atc
    public final void a(ysc yscVar, btc btcVar, bj bjVar) {
    }

    @Override // defpackage.atc
    public final int c() {
        return this.a;
    }

    @Override // defpackage.atc
    public final boolean d() {
        return false;
    }

    @Override // defpackage.atc
    public final void g(ByteBuffer byteBuffer) {
        byteBuffer.put(new byte[this.a]);
    }

    public final void h(ByteBuffer byteBuffer) {
        byte b = 0;
        while (byteBuffer.position() < byteBuffer.limit() && (b = byteBuffer.get()) == 0) {
            this.a++;
        }
        if (b != 0) {
        }
    }

    public final String toString() {
        return wy1.e(this.a, "Padding(", ")");
    }
}
