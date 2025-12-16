package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class ne0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(ne0.class, "notCompletedCount$volatile");
    public final bs4[] a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    public ne0(bs4[] bs4VarArr) {
        this.a = bs4VarArr;
        this.notCompletedCount$volatile = bs4VarArr.length;
    }

    public final Object a(Continuation continuation) {
        l42 l42Var = new l42(1, hni.f(continuation));
        l42Var.o();
        qt7[] qt7VarArr = this.a;
        int length = qt7VarArr.length;
        le0[] le0VarArr = new le0[length];
        for (int i = 0; i < length; i++) {
            qt7 qt7Var = qt7VarArr[i];
            ((su7) qt7Var).start();
            le0 le0Var = new le0(this, l42Var);
            le0Var.c = eoi.i(qt7Var, true, le0Var);
            le0VarArr[i] = le0Var;
        }
        me0 me0Var = new me0(le0VarArr);
        for (int i2 = 0; i2 < length; i2++) {
            le0 le0Var2 = le0VarArr[i2];
            le0Var2.getClass();
            le0.o.set(le0Var2, me0Var);
        }
        if (l42.d.get(l42Var) instanceof mia) {
            nyi.b(l42Var, me0Var);
        } else {
            me0Var.a();
        }
        return l42Var.n();
    }
}
