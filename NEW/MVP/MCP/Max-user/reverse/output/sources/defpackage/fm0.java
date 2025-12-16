package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class fm0 extends ph4 {
    public long t0;
    public int u0;
    public int v0;

    public final boolean A(ph4 ph4Var) {
        ByteBuffer byteBuffer;
        hsi.b(!ph4Var.j(1073741824));
        hsi.b(!ph4Var.j(268435456));
        hsi.b(!ph4Var.j(4));
        if (B()) {
            if (this.u0 >= this.v0) {
                return false;
            }
            ByteBuffer byteBuffer2 = ph4Var.o;
            if (byteBuffer2 != null && (byteBuffer = this.o) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i = this.u0;
        this.u0 = i + 1;
        if (i == 0) {
            this.Y = ph4Var.Y;
            if (ph4Var.j(1)) {
                this.b = 1;
            }
        }
        ByteBuffer byteBuffer3 = ph4Var.o;
        if (byteBuffer3 != null) {
            y(byteBuffer3.remaining());
            this.o.put(byteBuffer3);
        }
        this.t0 = ph4Var.Y;
        return true;
    }

    public final boolean B() {
        return this.u0 > 0;
    }

    @Override // defpackage.ph4
    public final void w() {
        super.w();
        this.u0 = 0;
    }
}
