package defpackage;

import android.opengl.EGLDisplay;
import android.opengl.GLES20;
import androidx.media3.common.util.GlUtil$GlException;

/* loaded from: classes.dex */
public final /* synthetic */ class er4 implements a4h {
    public final /* synthetic */ int a;
    public final /* synthetic */ ir4 b;

    public /* synthetic */ er4(ir4 ir4Var, int i) {
        this.a = i;
        this.b = ir4Var;
    }

    @Override // defpackage.a4h
    public final void run() throws GlUtil$GlException {
        switch (this.a) {
            case 0:
                ir4 ir4Var = this.b;
                ir4Var.getClass();
                try {
                    sa9 sa9Var = ir4Var.d;
                    sa9Var.getClass();
                    try {
                        dy dyVar = (dy) sa9Var.b;
                        if (dyVar != null) {
                            GLES20.glDeleteProgram(dyVar.b);
                            guf.d();
                        }
                    } catch (GlUtil$GlException e) {
                        a8i.h("CompositorGlProgram", "Error releasing GL Program", e);
                    }
                    ir4Var.h.h();
                    guf.m(ir4Var.m, ir4Var.n);
                    break;
                } catch (GlUtil$GlException e2) {
                    a8i.h("DefaultVideoCompositor", "Error releasing GL resources", e2);
                    return;
                }
            case 1:
                this.b.c();
                break;
            default:
                ir4 ir4Var2 = this.b;
                ir4Var2.getClass();
                EGLDisplay eGLDisplayO = guf.o();
                ir4Var2.m = eGLDisplayO;
                xo8 xo8Var = ir4Var2.c;
                ir4Var2.n = xo8Var.x(xo8Var.v(eGLDisplayO, 2, guf.a), ir4Var2.m);
                break;
        }
    }
}
