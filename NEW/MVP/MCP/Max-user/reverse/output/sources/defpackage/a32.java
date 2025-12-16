package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class a32 extends tk0 {
    public final ph4 C0;
    public final umb D0;
    public am5 E0;
    public long F0;

    public a32() {
        super(6);
        this.C0 = new ph4(1);
        this.D0 = new umb();
    }

    @Override // defpackage.tk0, defpackage.u4c
    public final void a(int i, Object obj) {
        if (i == 8) {
            this.E0 = (am5) obj;
        }
    }

    @Override // defpackage.tk0
    public final String h() {
        return "CameraMotionRenderer";
    }

    @Override // defpackage.tk0
    public final boolean j() {
        return i();
    }

    @Override // defpackage.tk0
    public final boolean l() {
        return true;
    }

    @Override // defpackage.tk0
    public final void m() {
        am5 am5Var = this.E0;
        if (am5Var != null) {
            am5Var.d();
        }
    }

    @Override // defpackage.tk0
    public final void o(long j, boolean z) {
        this.F0 = Long.MIN_VALUE;
        am5 am5Var = this.E0;
        if (am5Var != null) {
            am5Var.d();
        }
    }

    @Override // defpackage.tk0
    public final void w(long j, long j2) {
        float[] fArr;
        while (!i() && this.F0 < 100000 + j) {
            ph4 ph4Var = this.C0;
            ph4Var.w();
            xt4 xt4Var = this.c;
            xt4Var.clear();
            if (v(xt4Var, ph4Var, 0) != -4 || ph4Var.j(4)) {
                return;
            }
            long j3 = ph4Var.Y;
            this.F0 = j3;
            boolean z = j3 < this.v0;
            if (this.E0 != null && !z) {
                ph4Var.z();
                ByteBuffer byteBuffer = ph4Var.o;
                String str = zxg.a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] bArrArray = byteBuffer.array();
                    int iLimit = byteBuffer.limit();
                    umb umbVar = this.D0;
                    umbVar.H(iLimit, bArrArray);
                    umbVar.J(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i = 0; i < 3; i++) {
                        fArr2[i] = Float.intBitsToFloat(umbVar.l());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.E0.c();
                }
            }
        }
    }

    @Override // defpackage.tk0
    public final int z(hf6 hf6Var) {
        return "application/x-camera-motion".equals(hf6Var.n) ? tk0.b(4, 0, 0, 0) : tk0.b(0, 0, 0, 0);
    }
}
