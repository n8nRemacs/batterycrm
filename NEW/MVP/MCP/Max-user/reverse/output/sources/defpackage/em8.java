package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;
import one.me.main.MainScreen;

/* loaded from: classes2.dex */
public final class em8 extends dtf implements sm6 {
    public final /* synthetic */ MainScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public em8(Continuation continuation, MainScreen mainScreen) {
        super(2, continuation);
        this.X = mainScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        em8 em8Var = (em8) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        em8Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        em8 em8Var = new em8(continuation, this.X);
        em8Var.o = obj;
        return em8Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        u84 u84Var = (u84) this.o;
        rha rhaVar = MainScreen.Y;
        aza azaVarZ0 = this.X.z0();
        int i = m6b.e;
        int i2 = u84Var.a;
        azaVarZ0.getClass();
        int i3 = 0;
        while (true) {
            if (!(i3 < azaVarZ0.getChildCount())) {
                return qqg.a;
            }
            int i4 = i3 + 1;
            View childAt = azaVarZ0.getChildAt(i3);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            Object objC = rqi.c(childAt, o0d.tag_tab_item);
            zya zyaVar = objC instanceof zya ? (zya) objC : null;
            if (zyaVar != null && zyaVar.c == i) {
                ((ks0) childAt).setCounter(i2);
            }
            i3 = i4;
        }
    }
}
