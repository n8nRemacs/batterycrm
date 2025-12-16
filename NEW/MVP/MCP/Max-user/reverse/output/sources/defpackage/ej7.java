package defpackage;

import android.content.Context;
import org.apache.http.HttpStatus;

/* loaded from: classes2.dex */
public final class ej7 extends ugc {
    public final toe E0;

    public ej7(Context context) {
        super(new roe(context, 0));
        this.E0 = new toe(64, 0, s5g.b, null, null, null, yne.a, null, new n5g(u8b.d0), 56);
    }

    @Override // defpackage.d2f
    public final void z(t98 t98Var) {
        ((roe) this.a).setModelItem(toe.l(this.E0, ((dj7) t98Var).a, null, HttpStatus.SC_INSUFFICIENT_STORAGE));
    }
}
