package defpackage;

import one.me.sdk.media.transformer.MediaTransformException;

/* loaded from: classes2.dex */
public final class ma9 extends oa9 {
    public final MediaTransformException f;

    public ma9(long j, long j2, ha9 ha9Var, pa9 pa9Var, MediaTransformException mediaTransformException) {
        super(j, j2, ha9Var, pa9Var);
        this.f = mediaTransformException;
    }

    public final String toString() {
        pa9 pa9Var = this.d;
        String strI = zk6.i(pa9Var.a.b);
        String strF = zk6.f(pa9Var.c);
        ha9 ha9Var = this.c;
        String str = ha9Var.c;
        String strG = zk6.g(ha9Var);
        String strH = zk6.h(ha9Var, "                  ");
        String strD = zk6.d(this.a, this.b);
        StringBuilder sbL = wy1.l("\n            MediaTransformResult.Failure(\n              in={", strI, "\n              }\n              inputMedias={", strF, "\n              }\n              out=");
        ho7.r(sbL, str, "\n              request={", strG, "\n                  settings={");
        sbL.append(strH);
        sbL.append("\n                  }\n              }\n              took=");
        sbL.append((Object) strD);
        sbL.append(", ");
        sbL.append((r7 - r5) / 1000.0f);
        sbL.append(" s\n              error=");
        sbL.append(this.f);
        sbL.append("\n            )\n        ");
        return wmf.d(sbL.toString());
    }
}
