package defpackage;

import android.graphics.Bitmap;
import android.graphics.Gainmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.Build;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil$GlException;
import java.util.LinkedHashMap;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes.dex */
public final class up0 extends j3 {
    public final boolean X;
    public jp4 Y;
    public tu6 Z;
    public final LinkedBlockingQueue d;
    public final xo8 o;
    public int s0;
    public boolean t0;
    public boolean u0;

    public up0(xo8 xo8Var, iy1 iy1Var, boolean z) {
        super(iy1Var);
        this.o = xo8Var;
        this.d = new LinkedBlockingQueue();
        this.X = z;
    }

    @Override // defpackage.j3
    public final void f() throws VideoFrameProcessingException {
        this.d.clear();
        this.u0 = false;
        this.t0 = false;
        this.s0 = 0;
        tu6 tu6Var = this.Z;
        if (tu6Var != null) {
            try {
                tu6Var.a();
                this.Z = null;
            } catch (GlUtil$GlException e) {
                throw VideoFrameProcessingException.a(e);
            }
        }
        super.f();
    }

    @Override // defpackage.j3
    public final int h() {
        return 0;
    }

    @Override // defpackage.j3
    public final void k(final Bitmap bitmap, final yj6 yj6Var, final ct3 ct3Var) {
        ((iy1) this.a).g(new a4h() { // from class: rp0
            @Override // defpackage.a4h
            public final void run() {
                ct3 ct3Var2 = ct3Var;
                hsi.a("Bitmap queued but no timestamps provided.", ct3Var2.b());
                up0 up0Var = this.a;
                up0Var.d.add(new tp0(bitmap, yj6Var, ct3Var2));
                up0Var.z();
                up0Var.t0 = false;
            }
        }, true);
    }

    @Override // defpackage.qu6
    public final void m() {
        ((iy1) this.a).g(new sp0(this, 1), true);
    }

    @Override // defpackage.j3
    public final void q() {
        ((iy1) this.a).g(new sp0(this, 2), true);
    }

    @Override // defpackage.j3
    public final void w(jp4 jp4Var) {
        this.s0 = 0;
        this.Y = jp4Var;
    }

    @Override // defpackage.j3
    public final void x() {
        ((iy1) this.a).g(new sp0(this, 0), true);
    }

    public final void z() {
        if (this.d.isEmpty() || this.s0 == 0) {
            return;
        }
        tp0 tp0Var = (tp0) this.d.element();
        yj6 yj6Var = tp0Var.b;
        ct3 ct3Var = tp0Var.c;
        hsi.g(ct3Var.b());
        long j = tp0Var.b.b;
        hsi.g(ct3Var.b());
        int i = ct3Var.e;
        ct3Var.e = i + 1;
        long jRound = Math.round(ct3Var.b * i);
        hsi.g(jRound >= 0);
        long j2 = jRound + j;
        if (!this.u0) {
            this.u0 = true;
            Bitmap bitmap = tp0Var.a;
            try {
                tu6 tu6Var = this.Z;
                if (tu6Var != null) {
                    tu6Var.a();
                }
                int[] iArr = new int[1];
                GLES20.glGenTextures(1, iArr, 0);
                guf.d();
                int i2 = iArr[0];
                guf.a(bitmap.getWidth(), bitmap.getHeight());
                guf.b(3553, i2, 9729);
                GLUtils.texImage2D(3553, 0, bitmap, 0);
                guf.d();
                hf6 hf6Var = yj6Var.a;
                this.Z = new tu6(i2, -1, hf6Var.u, hf6Var.v);
                if (Build.VERSION.SDK_INT >= 34 && bitmap.hasGainmap()) {
                    jp4 jp4Var = this.Y;
                    jp4Var.getClass();
                    Gainmap gainmap = bitmap.getGainmap();
                    gainmap.getClass();
                    jp4Var.n(qp0.f(gainmap));
                }
                if (this.X) {
                    jp4 jp4Var2 = this.Y;
                    jp4Var2.getClass();
                    hsi.g(jp4Var2.a.b == 1);
                    jp4Var2.u = true;
                    jp4Var2.v = false;
                }
            } catch (GlUtil$GlException e) {
                throw VideoFrameProcessingException.a(e);
            }
        }
        this.s0--;
        jp4 jp4Var3 = this.Y;
        jp4Var3.getClass();
        xo8 xo8Var = this.o;
        tu6 tu6Var2 = this.Z;
        tu6Var2.getClass();
        jp4Var3.d(xo8Var, tu6Var2, j2);
        hf6 hf6Var2 = yj6Var.a;
        int i3 = hf6Var2.u;
        int i4 = hf6Var2.v;
        LinkedHashMap linkedHashMap = ah4.a;
        synchronized (ah4.class) {
        }
        if (tp0Var.c.b()) {
            return;
        }
        this.u0 = false;
        ((tp0) this.d.remove()).a.recycle();
        if (this.d.isEmpty() && this.t0) {
            jp4 jp4Var4 = this.Y;
            jp4Var4.getClass();
            jp4Var4.c();
            ah4.a();
            this.t0 = false;
        }
    }
}
