package defpackage;

import android.view.View;

/* loaded from: classes2.dex */
public final /* synthetic */ class ta6 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ em6 b;
    public final /* synthetic */ fxg c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ta6(hn6 hn6Var, fxg fxgVar, int i) {
        this.a = i;
        this.b = (em6) hn6Var;
        this.c = fxgVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.invoke(this.c);
                break;
            default:
                this.b.invoke(this.c);
                break;
        }
    }
}
