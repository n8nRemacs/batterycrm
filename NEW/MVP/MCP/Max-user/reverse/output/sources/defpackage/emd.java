package defpackage;

import android.content.Context;
import android.opengl.GLES20;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil$GlException;
import java.io.IOException;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class emd extends tj0 {
    public final dy h;
    public final h9g[] i;
    public int j;

    public emd(Context context, boolean z) throws VideoFrameProcessingException {
        super(z, 2);
        try {
            dy dyVar = new dy(context, "shaders/vertex_shader_transformation_es2.glsl", "shaders/fragment_shader_transformation_es2.glsl");
            this.h = dyVar;
            float[] fArrG = guf.g();
            dyVar.z("uTexTransformationMatrix", fArrG);
            dyVar.z("uTransformationMatrix", fArrG);
            dyVar.z("uRgbMatrix", fArrG);
            dyVar.x(guf.q());
            this.i = new h9g[2];
        } catch (GlUtil$GlException | IOException e) {
            throw VideoFrameProcessingException.a(e);
        }
    }

    @Override // defpackage.tj0
    public final c4f a(int i, int i2) {
        return new c4f(i, i2);
    }

    @Override // defpackage.tj0
    public final void b(int i, long j) throws VideoFrameProcessingException {
        dy dyVar = this.h;
        try {
            GLES20.glUseProgram(dyVar.b);
            guf.d();
            dyVar.C(i, 0, "uTexSampler");
            dyVar.q();
            GLES20.glDrawArrays(5, 0, 4);
        } catch (GlUtil$GlException e) {
            throw VideoFrameProcessingException.a(e);
        }
    }

    @Override // defpackage.tj0, defpackage.su6
    public final void c() {
        for (int i = 0; i < this.j; i++) {
            super.e(this.i[i].a);
        }
        this.j = 0;
        super.c();
    }

    @Override // defpackage.tj0, defpackage.su6
    public final void d(xo8 xo8Var, tu6 tu6Var, long j) {
        hsi.g(this.j < 2);
        super.d(xo8Var, tu6Var, j);
        int i = this.j;
        this.j = i + 1;
        ArrayDeque arrayDeque = (ArrayDeque) this.a.e;
        tu6 tu6Var2 = arrayDeque.isEmpty() ? null : (tu6) arrayDeque.getLast();
        tu6Var2.getClass();
        this.i[i] = new h9g(tu6Var2, j);
    }

    @Override // defpackage.tj0, defpackage.su6
    public final void e(tu6 tu6Var) {
    }

    @Override // defpackage.tj0, defpackage.su6
    public final void flush() {
        this.j = 0;
        super.flush();
    }

    public final void j(long j) {
        int i = this.j;
        if (i >= 2) {
            h9g[] h9gVarArr = this.i;
            h9g h9gVar = h9gVarArr[1];
            if (j < h9gVar.b) {
                return;
            }
            h9g h9gVar2 = h9gVarArr[0];
            h9gVarArr[0] = h9gVar;
            this.j = i - 1;
            super.e(h9gVar2.a);
        }
    }

    @Override // defpackage.su6
    public final void release() throws VideoFrameProcessingException {
        try {
            this.a.h();
            try {
                GLES20.glDeleteProgram(this.h.b);
                guf.d();
            } catch (GlUtil$GlException e) {
                throw new VideoFrameProcessingException(e);
            }
        } catch (GlUtil$GlException e2) {
            throw new VideoFrameProcessingException(e2);
        }
    }
}
