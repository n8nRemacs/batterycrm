package defpackage;

import java.nio.ByteBuffer;
import java.util.stream.Collectors;

/* loaded from: classes3.dex */
public final class i7i extends vj8 {
    @Override // defpackage.btc
    public final int a(ysc yscVar, bj bjVar) {
        return 2;
    }

    @Override // defpackage.btc
    public final hf5 l() {
        return hf5.b;
    }

    @Override // defpackage.btc
    public final m5c n() {
        return m5c.c;
    }

    @Override // defpackage.vj8
    public final String toString() {
        char cCharAt = "ZeroRTT".charAt(0);
        long j = this.b;
        String strValueOf = j >= 0 ? Long.valueOf(j) : ".";
        int i = this.d;
        return "Packet " + cCharAt + "|" + strValueOf + "|Z|" + (i >= 0 ? Integer.valueOf(i) : ".") + "|" + this.c.size() + "  " + ((String) this.c.stream().map(new xga(21)).collect(Collectors.joining(" ")));
    }

    @Override // defpackage.vj8
    public final int w() {
        return 0;
    }

    @Override // defpackage.vj8
    public final void x(ByteBuffer byteBuffer) {
    }

    @Override // defpackage.vj8
    public final byte y() {
        return (byte) (this.a.b() ? 2 : 1);
    }

    @Override // defpackage.vj8
    public final void z(ByteBuffer byteBuffer) {
    }
}
