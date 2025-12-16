package defpackage;

import android.view.View;

/* loaded from: classes2.dex */
public final /* synthetic */ class o0b implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ em6 b;

    public /* synthetic */ o0b(int i, em6 em6Var) {
        this.a = i;
        this.b = em6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.invoke(Boolean.FALSE);
                break;
            case 1:
                this.b.invoke(Boolean.TRUE);
                break;
            case 2:
                this.b.invoke(Boolean.FALSE);
                break;
            default:
                this.b.invoke(Boolean.TRUE);
                break;
        }
    }
}
