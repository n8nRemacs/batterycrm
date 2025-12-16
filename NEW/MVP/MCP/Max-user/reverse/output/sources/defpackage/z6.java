package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class z6 extends AtomicReference implements py4 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z6(int i, Object obj) {
        super(obj);
        this.a = i;
    }

    @Override // defpackage.py4
    public final void dispose() {
        Object andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        switch (this.a) {
            case 0:
                try {
                    ((p6) andSet).run();
                    return;
                } catch (Throwable th) {
                    throw bj5.d(th);
                }
            default:
                ((Runnable) andSet).run();
                return;
        }
    }

    @Override // defpackage.py4
    public final boolean e() {
        return get() == null;
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        switch (this.a) {
            case 0:
                return "ActionDisposable(disposed=" + e() + ", " + get() + ")";
            default:
                return "RunnableDisposable(disposed=" + e() + ", " + get() + ")";
        }
    }
}
