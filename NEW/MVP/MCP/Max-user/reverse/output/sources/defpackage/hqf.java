package defpackage;

import android.view.View;

/* loaded from: classes2.dex */
public final /* synthetic */ class hqf implements sm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mqf b;

    public /* synthetic */ hqf(mqf mqfVar, int i) {
        this.a = i;
        this.b = mqfVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        View view = (View) obj;
        fqf fqfVar = (fqf) obj2;
        switch (this.a) {
            case 0:
                ox3 ox3Var = this.b.R0;
                if (ox3Var != null) {
                    ox3Var.invoke(view, fqfVar);
                }
                break;
            default:
                ox3 ox3Var2 = this.b.R0;
                if (ox3Var2 != null) {
                    ox3Var2.invoke(view, fqfVar);
                }
                break;
        }
        return qqg.a;
    }
}
