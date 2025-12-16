package defpackage;

import java.nio.ByteBuffer;
import tech.kwik.core.impl.ImplementationError;

/* loaded from: classes.dex */
public final class ef4 extends atc {
    public byte[] a;

    @Override // defpackage.atc
    public final void a(ysc yscVar, btc btcVar, bj bjVar) {
        if (yscVar.F0 == 3 || yscVar.F0 == 4) {
            yscVar.c.warn("Received datagram frame, but no handler is set");
        } else {
            yscVar.f(10, "Datagram frame received, but datagram extension is not enabled", 1);
        }
    }

    @Override // defpackage.atc
    public final int c() {
        return epi.a(this.a.length) + 1 + this.a.length;
    }

    @Override // defpackage.atc
    public final void g(ByteBuffer byteBuffer) {
        byteBuffer.put((byte) 49);
        epi.b(this.a.length, byteBuffer);
        byteBuffer.put(this.a);
    }

    public final void h(ByteBuffer byteBuffer) {
        int iG = epi.g(byteBuffer);
        if (iG == 49) {
            byte[] bArr = new byte[epi.g(byteBuffer)];
            this.a = bArr;
            byteBuffer.get(bArr);
        } else {
            if (iG != 48) {
                throw new ImplementationError();
            }
            byte[] bArr2 = new byte[byteBuffer.remaining()];
            this.a = bArr2;
            byteBuffer.get(bArr2);
        }
    }

    public final String toString() {
        return ho7.i("DatagramFrame [", uwi.a(this.a), "]");
    }
}
