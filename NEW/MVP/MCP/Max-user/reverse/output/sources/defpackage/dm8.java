package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;
import one.me.main.MainScreen;

/* loaded from: classes2.dex */
public final class dm8 extends dtf implements sm6 {
    public final /* synthetic */ MainScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dm8(Continuation continuation, MainScreen mainScreen) {
        super(2, continuation);
        this.X = mainScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        dm8 dm8Var = (dm8) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        dm8Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        dm8 dm8Var = new dm8(continuation, this.X);
        dm8Var.o = obj;
        return dm8Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        boolean zBooleanValue = ((Boolean) this.o).booleanValue();
        rha rhaVar = MainScreen.Y;
        aza azaVarZ0 = this.X.z0();
        int i = m6b.c;
        azaVarZ0.getClass();
        int i2 = 0;
        while (true) {
            if (!(i2 < azaVarZ0.getChildCount())) {
                break;
            }
            int i3 = i2 + 1;
            View childAt = azaVarZ0.getChildAt(i2);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            Object objC = rqi.c(childAt, o0d.tag_tab_item);
            zya zyaVar = objC instanceof zya ? (zya) objC : null;
            if (zyaVar != null && zyaVar.c == i) {
                if ((childAt.getVisibility() == 0) == zBooleanValue) {
                    break;
                }
                childAt.setVisibility(zBooleanValue ? 0 : 8);
                float weightSum = azaVarZ0.getWeightSum();
                float f = 1;
                azaVarZ0.setWeightSum(zBooleanValue ? weightSum + f : weightSum - f);
            }
            i2 = i3;
        }
        return qqg.a;
    }
}
