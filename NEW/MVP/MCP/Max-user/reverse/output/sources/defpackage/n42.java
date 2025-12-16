package defpackage;

import io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class n42 extends AtomicReference implements py4, rk3 {
    public final /* synthetic */ int a;

    public /* synthetic */ n42(int i) {
        this.a = i;
    }

    @Override // defpackage.rk3, defpackage.bs8
    public void b() {
        lazySet(ty4.a);
    }

    @Override // defpackage.rk3, defpackage.bs8
    public void c(py4 py4Var) {
        ty4.h(this, py4Var);
    }

    @Override // defpackage.py4
    public final void dispose() {
        i42 i42Var;
        switch (this.a) {
            case 0:
                if (get() != null && (i42Var = (i42) getAndSet(null)) != null) {
                    try {
                        i42Var.cancel();
                        break;
                    } catch (Throwable th) {
                        raj.c(th);
                        t8j.a(th);
                        return;
                    }
                }
                break;
            case 1:
                ty4.a(this);
                break;
            default:
                ty4.a(this);
                break;
        }
    }

    @Override // defpackage.py4
    public final boolean e() {
        switch (this.a) {
            case 0:
                return get() == null;
            case 1:
                return get() == ty4.a;
            default:
                return ty4.c((py4) get());
        }
    }

    @Override // defpackage.rk3, defpackage.bs8
    public void onError(Throwable th) {
        lazySet(ty4.a);
        t8j.a(new OnErrorNotImplementedException(th));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n42(Object obj) {
        super(obj);
        this.a = 0;
    }

    public n42(n42 n42Var) {
        this.a = 2;
        lazySet(n42Var);
    }
}
