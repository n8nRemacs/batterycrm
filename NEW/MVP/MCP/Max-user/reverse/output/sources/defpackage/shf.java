package defpackage;

import java.util.function.UnaryOperator;

/* loaded from: classes2.dex */
public final /* synthetic */ class shf implements UnaryOperator {
    public final /* synthetic */ int a;
    public final /* synthetic */ zgf b;

    public /* synthetic */ shf(zgf zgfVar, int i) {
        this.a = i;
        this.b = zgfVar;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        rhf rhfVar = (rhf) obj;
        switch (this.a) {
            case 0:
                return new rhf(rhfVar.a, this.b.b);
            default:
                return new rhf(rhfVar.a, this.b.b);
        }
    }
}
