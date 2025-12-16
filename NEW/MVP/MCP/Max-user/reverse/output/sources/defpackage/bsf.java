package defpackage;

import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;

/* loaded from: classes.dex */
public final /* synthetic */ class bsf implements yu {
    public final /* synthetic */ dsf a;
    public final /* synthetic */ csf b;
    public final /* synthetic */ int c;
    public final /* synthetic */ rb0 d;
    public final /* synthetic */ rb0 o;

    public /* synthetic */ bsf(dsf dsfVar, csf csfVar, int i, rb0 rb0Var, rb0 rb0Var2) {
        this.a = dsfVar;
        this.b = csfVar;
        this.c = i;
        this.d = rb0Var;
        this.o = rb0Var2;
    }

    @Override // defpackage.yu
    public final ha8 apply(Object obj) {
        csf csfVar = this.b;
        Surface surface = (Surface) obj;
        dsf dsfVar = this.a;
        dsfVar.getClass();
        surface.getClass();
        try {
            csfVar.d();
            fsf fsfVar = new fsf(surface, this.c, dsfVar.g.a, this.d, this.o);
            fsfVar.t0.b.d(new zrf(csfVar, 1), ayi.a());
            z5j.f("Consumer can only be linked once.", csfVar.r == null);
            csfVar.r = fsfVar;
            return wsf.f(fsfVar);
        } catch (DeferrableSurface$SurfaceClosedException e) {
            return new ag7(1, e);
        }
    }
}
