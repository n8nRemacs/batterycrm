package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class em0 extends oh4 {
    public long s0;
    public int t0;
    public int u0;

    public final boolean A(oh4 oh4Var) {
        ByteBuffer byteBuffer;
        fsi.b(!oh4Var.j(1073741824));
        fsi.b(!oh4Var.j(268435456));
        fsi.b(!oh4Var.j(4));
        int i = this.t0;
        if (i > 0) {
            if (i >= this.u0 || oh4Var.j(Integer.MIN_VALUE) != j(Integer.MIN_VALUE)) {
                return false;
            }
            ByteBuffer byteBuffer2 = oh4Var.d;
            if (byteBuffer2 != null && (byteBuffer = this.d) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i2 = this.t0;
        this.t0 = i2 + 1;
        if (i2 == 0) {
            this.X = oh4Var.X;
            if (oh4Var.j(1)) {
                this.b = 1;
            }
        }
        if (oh4Var.j(Integer.MIN_VALUE)) {
            this.b = Integer.MIN_VALUE;
        }
        ByteBuffer byteBuffer3 = oh4Var.d;
        if (byteBuffer3 != null) {
            y(byteBuffer3.remaining());
            this.d.put(byteBuffer3);
        }
        this.s0 = oh4Var.X;
        return true;
    }

    @Override // defpackage.oh4
    public final void w() {
        super.w();
        this.t0 = 0;
    }
}
