package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final /* synthetic */ class ck7 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ dk7 b;

    public /* synthetic */ ck7(dk7 dk7Var, int i) {
        this.a = i;
        this.b = dk7Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.A0.h(q54.a);
                break;
            default:
                this.b.A0.h(r54.a);
                break;
        }
    }
}
