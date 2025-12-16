package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class z22 extends sk0 {
    public long A0;
    public final oh4 w0;
    public final qyg x0;
    public long y0;
    public y22 z0;

    public z22() {
        super(6);
        this.w0 = new oh4(1);
        this.x0 = new qyg(2, false);
    }

    @Override // defpackage.sk0, defpackage.t4c
    public final void a(int i, Object obj) {
        if (i == 8) {
            this.z0 = (y22) obj;
        }
    }

    @Override // defpackage.sk0
    public final String f() {
        return "CameraMotionRenderer";
    }

    @Override // defpackage.sk0
    public final boolean h() {
        return g();
    }

    @Override // defpackage.sk0
    public final boolean i() {
        return true;
    }

    @Override // defpackage.sk0
    public final void j() {
        y22 y22Var = this.z0;
        if (y22Var != null) {
            y22Var.c();
        }
    }

    @Override // defpackage.sk0
    public final void l(long j, boolean z) {
        this.A0 = Long.MIN_VALUE;
        y22 y22Var = this.z0;
        if (y22Var != null) {
            y22Var.c();
        }
    }

    @Override // defpackage.sk0
    public final void p(gf6[] gf6VarArr, long j, long j2) {
        this.y0 = j2;
    }

    @Override // defpackage.sk0
    public final void t(long j, long j2) {
        float[] fArr;
        while (!g() && this.A0 < 100000 + j) {
            oh4 oh4Var = this.w0;
            oh4Var.w();
            i5i i5iVar = this.b;
            i5iVar.f();
            if (q(i5iVar, oh4Var, 0) != -4 || oh4Var.j(4)) {
                return;
            }
            this.A0 = oh4Var.X;
            if (this.z0 != null && !oh4Var.j(Integer.MIN_VALUE)) {
                oh4Var.z();
                ByteBuffer byteBuffer = oh4Var.d;
                int i = xxg.a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] bArrArray = byteBuffer.array();
                    int iLimit = byteBuffer.limit();
                    qyg qygVar = this.x0;
                    qygVar.C(iLimit, bArrArray);
                    qygVar.E(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i2 = 0; i2 < 3; i2++) {
                        fArr2[i2] = Float.intBitsToFloat(qygVar.h());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.z0.b(this.A0 - this.y0, fArr);
                }
            }
        }
    }

    @Override // defpackage.sk0
    public final int x(gf6 gf6Var) {
        return "application/x-camera-motion".equals(gf6Var.v0) ? sk0.b(4, 0, 0) : sk0.b(0, 0, 0);
    }
}
