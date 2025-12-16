package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.Symbol;

/* loaded from: classes.dex */
public final class le0 extends du7 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater o = AtomicReferenceFieldUpdater.newUpdater(le0.class, Object.class, "_disposer$volatile");
    private volatile /* synthetic */ Object _disposer$volatile;
    public final l42 b;
    public sy4 c;
    public final /* synthetic */ ne0 d;

    public le0(ne0 ne0Var, l42 l42Var) {
        this.d = ne0Var;
        this.b = l42Var;
    }

    @Override // defpackage.du7
    public final boolean c() {
        return false;
    }

    @Override // defpackage.du7
    public final void d(Throwable th) {
        l42 l42Var = this.b;
        if (th != null) {
            l42Var.getClass();
            Symbol symbolY = l42Var.y(new zk3(th, false), null);
            if (symbolY != null) {
                l42Var.m(symbolY);
                me0 me0Var = (me0) o.get(this);
                if (me0Var != null) {
                    me0Var.a();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = ne0.b;
        ne0 ne0Var = this.d;
        if (atomicIntegerFieldUpdater.decrementAndGet(ne0Var) == 0) {
            bs4[] bs4VarArr = ne0Var.a;
            ArrayList arrayList = new ArrayList(bs4VarArr.length);
            for (bs4 bs4Var : bs4VarArr) {
                arrayList.add(bs4Var.l());
            }
            l42Var.resumeWith(arrayList);
        }
    }
}
