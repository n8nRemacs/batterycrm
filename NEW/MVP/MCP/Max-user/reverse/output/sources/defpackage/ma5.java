package defpackage;

import java.util.function.IntPredicate;

/* loaded from: classes2.dex */
public final /* synthetic */ class ma5 implements IntPredicate {
    public final /* synthetic */ int a;

    @Override // java.util.function.IntPredicate
    public final boolean test(int i) {
        boolean zC;
        switch (this.a) {
            case 0:
                zC = na5.c(i);
                break;
            case 1:
                zC = na5.c(i);
                break;
            default:
                return na5.a(i) || i == 8205 || i == 8419;
        }
        return !zC;
    }
}
