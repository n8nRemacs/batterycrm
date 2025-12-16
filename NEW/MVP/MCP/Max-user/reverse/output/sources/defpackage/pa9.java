package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import one.me.sdk.media.transformer.MediaTransformException;

/* loaded from: classes2.dex */
public final class pa9 {
    public final ha9 a;
    public final long b = System.currentTimeMillis();
    public final ArrayList c = new ArrayList();
    public volatile int d = -1;
    public volatile int e = -1;
    public final AtomicReference f = new AtomicReference();
    public final AtomicReference g = new AtomicReference();

    public pa9(ha9 ha9Var) {
        this.a = ha9Var;
    }

    public final void a(MediaTransformException mediaTransformException) {
        this.g.set(mediaTransformException);
    }

    public final String toString() {
        ha9 ha9Var = this.a;
        String strI = zk6.i(ha9Var.b);
        String strF = zk6.f(this.c);
        String str = ha9Var.c;
        String strH = zk6.h(ha9Var, "              ");
        String strG = zk6.g(ha9Var);
        StringBuilder sbL = wy1.l("\n            MediaTransformRequest(\n              in={", strI, "\n              }\n              inputMedias={", strF, "\n              }\n              out=");
        ho7.r(sbL, str, "\n              anc={", strH, "\n              }\n              request={");
        sbL.append(strG);
        sbL.append("\n              }\n            )\n        ");
        return wmf.d(sbL.toString());
    }
}
