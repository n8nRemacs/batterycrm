package defpackage;

import java.util.function.UnaryOperator;

/* loaded from: classes.dex */
public final /* synthetic */ class dp2 implements UnaryOperator {
    public final /* synthetic */ int a;
    public final /* synthetic */ q19 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ dp2(Object obj, q19 q19Var, Object obj2, int i) {
        this.a = i;
        this.c = obj;
        this.b = q19Var;
        this.d = obj2;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                yq2 yq2Var = (yq2) this.c;
                q19 q19Var = this.b;
                si9 si9Var = (si9) this.d;
                if (yq2.w(yq2Var, q19Var)) {
                    return q19Var;
                }
                long j = si9Var.b;
                return new q19(j, j, yq2Var.O0, yq2Var.b);
            default:
                h49 h49Var = (h49) this.c;
                q19 q19Var2 = this.b;
                q19 q19Var3 = (q19) this.d;
                if (q19Var2 != null) {
                    by0 by0Var = h49Var.n;
                    if (by0Var != null && by0Var.c == q19Var2.d && fni.a(q19Var2.c, h49.A)) {
                        return q19Var2;
                    }
                } else {
                    h49Var.getClass();
                }
                return q19Var3;
        }
    }
}
