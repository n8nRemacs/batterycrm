package defpackage;

import android.view.View;

/* loaded from: classes2.dex */
public final class t0b implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ cm6 b;

    public /* synthetic */ t0b(int i, cm6 cm6Var) {
        this.a = i;
        this.b = cm6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.invoke();
                break;
            default:
                this.b.invoke();
                break;
        }
    }
}
