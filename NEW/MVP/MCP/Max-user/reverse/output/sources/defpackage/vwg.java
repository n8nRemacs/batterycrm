package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class vwg {
    public final hie a;
    public final xwg b;
    public final ob0 c;
    public final List d;
    public boolean e = false;
    public boolean f = false;

    public vwg(hie hieVar, xwg xwgVar, ob0 ob0Var, List list) {
        this.a = hieVar;
        this.b = xwgVar;
        this.c = ob0Var;
        this.d = list;
    }

    public final String toString() {
        return "UseCaseAttachInfo{mSessionConfig=" + this.a + ", mUseCaseConfig=" + this.b + ", mStreamSpec=" + this.c + ", mCaptureTypes=" + this.d + ", mAttached=" + this.e + ", mActive=" + this.f + '}';
    }
}
