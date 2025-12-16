package defpackage;

import android.view.View;

/* loaded from: classes2.dex */
public final /* synthetic */ class o8 implements em6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yeb b;

    public /* synthetic */ o8(int i, yeb yebVar) {
        this.a = i;
        this.b = yebVar;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        boolean z;
        switch (this.a) {
            case 0:
                View view = (View) obj;
                if (view instanceof u6g) {
                    npi.a(view, this.b);
                    z = false;
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                npi.a((View) obj, this.b);
                return qqg.a;
            case 2:
                return Integer.valueOf(this.b.getIcon().h);
            default:
                return Integer.valueOf(this.b.b().m);
        }
    }
}
