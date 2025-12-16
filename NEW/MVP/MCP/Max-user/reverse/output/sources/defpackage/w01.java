package defpackage;

import android.content.res.Resources;
import android.view.View;

/* loaded from: classes.dex */
public final /* synthetic */ class w01 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ w01(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, k18] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Resources.NotFoundException {
        switch (this.a) {
            case 0:
                x01 x01Var = (x01) this.b;
                mc5 mc5Var = (mc5) this.c;
                b21 b21Var = (b21) this.d;
                roe roeVar = (roe) x01Var.a;
                ?? r2 = roeVar.Q0;
                boolean z = !(!r2.e() ? false : ((jeb) r2.getValue()).isChecked());
                roeVar.setEndView(new doe(z, true));
                mc5Var.x(b21Var.d, z);
                break;
            case 1:
                bq5 bq5Var = (bq5) this.b;
                jx0 jx0Var = (jx0) this.c;
                jx0 jx0Var2 = (jx0) this.d;
                long j = bq5Var.a;
                if (!bq5Var.Y) {
                    jx0Var2.invoke(Long.valueOf(j));
                    break;
                } else {
                    jx0Var.invoke(Long.valueOf(j));
                    break;
                }
            default:
                bgb.d((bgb) this.b, (em6) this.c, (vfb) this.d);
                break;
        }
    }
}
