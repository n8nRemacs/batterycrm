package defpackage;

import android.content.Context;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.util.Pair;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil$GlException;
import androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class pr4 implements c4h {
    public final boolean a;
    public final xo8 b;
    public final ExecutorService c;
    public final uu6 d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public pr4(boolean z, xo8 xo8Var, ExecutorService executorService, uu6 uu6Var, int i, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = xo8Var;
        this.c = executorService;
        this.d = uu6Var;
        this.e = i;
        this.f = z2;
        this.g = z3;
        this.h = z4;
    }

    @Override // defpackage.c4h
    public final /* bridge */ /* synthetic */ e4h a(Context context, uy0 uy0Var, gf3 gf3Var, boolean z, v32 v32Var) {
        return c(context, uy0Var, gf3Var, z, dx4.a, v32Var);
    }

    public final DefaultVideoFrameProcessor$Factory$Builder b() {
        DefaultVideoFrameProcessor$Factory$Builder defaultVideoFrameProcessor$Factory$Builder = new DefaultVideoFrameProcessor$Factory$Builder();
        defaultVideoFrameProcessor$Factory$Builder.a = this.c;
        defaultVideoFrameProcessor$Factory$Builder.b = this.b;
        defaultVideoFrameProcessor$Factory$Builder.c = this.d;
        defaultVideoFrameProcessor$Factory$Builder.d = this.e;
        defaultVideoFrameProcessor$Factory$Builder.e = this.f;
        defaultVideoFrameProcessor$Factory$Builder.f = !this.a;
        defaultVideoFrameProcessor$Factory$Builder.g = this.g;
        defaultVideoFrameProcessor$Factory$Builder.h = this.h;
        return defaultVideoFrameProcessor$Factory$Builder;
    }

    public final rr4 c(final Context context, final uy0 uy0Var, final gf3 gf3Var, final boolean z, final Executor executor, final d4h d4hVar) throws VideoFrameProcessingException {
        ExecutorService executorServiceNewSingleThreadExecutor;
        ExecutorService executorService = this.c;
        if (executorService == null) {
            String str = zxg.a;
            executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new nn3(2, "Effect:DefaultVideoFrameProcessor:GlThread"));
        } else {
            executorServiceNewSingleThreadExecutor = executorService;
        }
        final iy1 iy1Var = new iy1(executorServiceNewSingleThreadExecutor, executorService == null, new jr4(d4hVar, 1));
        xo8 xo8Var = this.b;
        final boolean z2 = xo8Var == null || executorService == null;
        if (xo8Var == null) {
            xo8Var = new xo8(15, (byte) 0);
        }
        final xo8 xo8Var2 = xo8Var;
        try {
            return (rr4) executorServiceNewSingleThreadExecutor.submit(new Callable() { // from class: or4
                @Override // java.util.concurrent.Callable
                public final Object call() throws GlUtil$GlException {
                    Pair pairCreate;
                    xo8 xo8Var3 = xo8Var2;
                    pr4 pr4Var = this.a;
                    boolean z3 = pr4Var.f;
                    uu6 uu6Var = pr4Var.d;
                    int i = pr4Var.e;
                    boolean z4 = pr4Var.a;
                    boolean z5 = pr4Var.g;
                    boolean z6 = pr4Var.h;
                    int i2 = rr4.y;
                    EGLDisplay eGLDisplayO = guf.o();
                    gf3 gf3Var2 = gf3Var;
                    boolean zH = gf3.h(gf3Var2);
                    int[] iArr = zH ? guf.b : guf.a;
                    try {
                        EGLContext eGLContextV = xo8Var3.v(eGLDisplayO, 3, iArr);
                        pairCreate = Pair.create(eGLContextV, xo8Var3.x(eGLContextV, eGLDisplayO));
                    } catch (GlUtil$GlException unused) {
                        EGLContext eGLContextV2 = xo8Var3.v(eGLDisplayO, 2, iArr);
                        pairCreate = Pair.create(eGLContextV2, xo8Var3.x(eGLContextV2, eGLDisplayO));
                    }
                    ef3 ef3VarA = gf3Var2.a();
                    ef3VarA.c = 1;
                    ef3VarA.d = null;
                    gf3 gf3Var3 = new gf3(ef3VarA.a, ef3VarA.b, ef3VarA.c, ef3VarA.e, ef3VarA.f, ef3VarA.d);
                    if (!zH) {
                        gf3Var3 = gf3Var2;
                    }
                    d4h d4hVar2 = d4hVar;
                    jr4 jr4Var = new jr4(d4hVar2, 0);
                    Pair pair = pairCreate;
                    Context context2 = context;
                    iy1 iy1Var2 = iy1Var;
                    Executor executor2 = executor;
                    x20 x20Var = new x20(context2, gf3Var3, xo8Var3, iy1Var2, executor2, jr4Var, z4, z5, z6);
                    EGLContext eGLContext = (EGLContext) pair.first;
                    EGLSurface eGLSurface = (EGLSurface) pair.second;
                    boolean z7 = z;
                    return new rr4(context2, xo8Var3, z2, eGLDisplayO, x20Var, iy1Var2, d4hVar2, executor2, new rz5(context2, eGLDisplayO, eGLContext, eGLSurface, gf3Var2, iy1Var2, executor2, d4hVar2, uu6Var, i, z7), z7, gf3Var2, uy0Var, z3 ? new emd(context2, zH) : null);
                }
            }).get();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new VideoFrameProcessingException(e);
        } catch (ExecutionException e2) {
            throw new VideoFrameProcessingException(e2);
        }
    }
}
