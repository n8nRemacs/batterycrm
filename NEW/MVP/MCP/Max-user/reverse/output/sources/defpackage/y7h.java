package defpackage;

import android.view.Surface;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class y7h implements ju3 {
    public final fsf a;
    public final /* synthetic */ a8h b;

    public y7h(a8h a8hVar, fsf fsfVar) {
        this.b = a8hVar;
        this.a = fsfVar;
    }

    @Override // defpackage.ju3
    public final void accept(Object obj) {
        sb0 sb0Var = (sb0) obj;
        String str = this.b.a;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                sb0Var.getClass();
                l6bVar.c(lg8Var, str, "onOutputSurface close event=0", null);
            }
        }
        this.b.b();
        this.a.close();
        Surface surface = (Surface) this.b.Y.remove(this.a);
        if (surface != null) {
            r8h r8hVar = this.b.t0;
            if (r8hVar == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            ho6.d((AtomicBoolean) r8hVar.c, true);
            ho6.c((Thread) r8hVar.e);
            r8hVar.s(surface, true);
        }
    }
}
