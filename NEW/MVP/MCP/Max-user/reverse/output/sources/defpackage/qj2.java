package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class qj2 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ w5 c;

    public /* synthetic */ qj2(Context context, w5 w5Var, int i) {
        this.a = i;
        this.b = context;
        this.c = w5Var;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        switch (this.a) {
            case 0:
                w5 w5Var = this.c;
                return new tde(this.b, w5Var.d(114), w5Var.d(530), w5Var.d(500), vz2.h, 20);
            case 1:
                w5 w5Var2 = this.c;
                return new tde(this.b, w5Var2.d(114), w5Var2.d(530), w5Var2.d(500));
            case 2:
                w5 w5Var3 = this.c;
                return new tde(this.b, w5Var3.d(114), w5Var3.d(530), w5Var3.d(500), vz2.h, 20);
            default:
                w5 w5Var4 = this.c;
                return new tde(this.b, w5Var4.d(114), w5Var4.d(530), w5Var4.d(500));
        }
    }
}
