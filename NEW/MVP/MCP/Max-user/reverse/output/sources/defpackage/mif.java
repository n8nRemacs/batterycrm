package defpackage;

import android.content.Context;
import android.view.View;

/* loaded from: classes2.dex */
public final class mif extends d2f implements j8e {
    public h8e E0;

    public mif(Context context) {
        super(new roe(context, 0));
    }

    @Override // defpackage.j8e
    public final void b(qif qifVar) {
        View view = this.a;
        if (qifVar != null) {
            f8j.d(view, 300L, new wfe(this, 14, qifVar));
        } else {
            ((roe) view).setOnClickListener(null);
        }
    }

    @Override // defpackage.d2f
    public final void z(t98 t98Var) {
        if (t98Var instanceof g8e) {
            this.E0 = (h8e) t98Var;
            ((roe) this.a).setModelItem(((g8e) t98Var).a);
        }
    }
}
