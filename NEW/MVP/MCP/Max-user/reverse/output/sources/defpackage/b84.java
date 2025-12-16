package defpackage;

import java.util.function.BinaryOperator;

/* loaded from: classes2.dex */
public final /* synthetic */ class b84 implements BinaryOperator {
    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        qt7 qt7Var = (qt7) obj;
        qt7 qt7Var2 = (qt7) obj2;
        if (qt7Var != null) {
            qt7Var.cancel(null);
        }
        return qt7Var2;
    }
}
