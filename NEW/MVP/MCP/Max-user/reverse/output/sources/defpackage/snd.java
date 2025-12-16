package defpackage;

import java.nio.ByteBuffer;
import tech.kwik.core.impl.TransportError;

/* loaded from: classes.dex */
public final class snd extends atc {
    public int a;
    public long b;
    public long c;

    @Override // defpackage.atc
    public final void a(ysc yscVar, btc btcVar, bj bjVar) {
        try {
            llf llfVar = yscVar.O0;
            ctc ctcVar = (ctc) llfVar.a.get(Integer.valueOf(this.a));
            if (ctcVar != null) {
                llfVar.y = ctcVar.e.Q(this.c) + llfVar.y;
            }
        } catch (TransportError e) {
            yscVar.f(utb.e(e.a), null, 1);
        }
    }

    @Override // defpackage.atc
    public final int c() {
        return epi.a(this.c) + epi.a(this.b) + epi.a(this.a) + 1;
    }

    @Override // defpackage.atc
    public final void g(ByteBuffer byteBuffer) {
        byteBuffer.put((byte) 4);
        epi.b(this.a, byteBuffer);
        epi.c(this.b, byteBuffer);
        epi.c(this.c, byteBuffer);
    }

    public final void h(ByteBuffer byteBuffer) {
        byteBuffer.get();
        this.a = atc.e(byteBuffer);
        this.b = epi.i(byteBuffer);
        this.c = epi.i(byteBuffer);
    }

    public final String toString() {
        return u45.i(this.c, "|", "]", u45.m(this.a, this.b, "ResetStreamFrame[", "|"));
    }
}
