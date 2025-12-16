package defpackage;

import android.content.Context;
import android.opengl.GLSurfaceView;

/* loaded from: classes2.dex */
public final class use extends GLSurfaceView {
    public final tse a;

    public use(Context context) {
        super(context, null);
        setEGLContextClientVersion(2);
        tse tseVar = new tse();
        tseVar.X = System.currentTimeMillis();
        this.a = tseVar;
        setRenderer(tseVar);
    }

    public final tse getRenderer() {
        return this.a;
    }
}
