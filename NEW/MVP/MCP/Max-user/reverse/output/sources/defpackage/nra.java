package defpackage;

import java.util.Collection;
import java.util.Objects;

/* loaded from: classes.dex */
public final class nra extends wl0 {
    public final Collection X;
    public final tm6 Y;

    public nra(vta vtaVar, tm6 tm6Var, Collection collection) {
        super(vtaVar);
        this.Y = tm6Var;
        this.X = collection;
    }

    @Override // defpackage.wl0, defpackage.vta
    public final void b() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.X.clear();
        this.a.b();
    }

    @Override // defpackage.wl0, defpackage.o1f
    public final void clear() {
        this.X.clear();
        super.clear();
    }

    @Override // defpackage.vta
    public final void f(Object obj) {
        if (this.d) {
            return;
        }
        int i = this.o;
        vta vtaVar = this.a;
        if (i != 0) {
            vtaVar.f(null);
            return;
        }
        try {
            Object objApply = this.Y.apply(obj);
            Objects.requireNonNull(objApply, "The keySelector returned a null key");
            if (this.X.add(objApply)) {
                vtaVar.f(obj);
            }
        } catch (Throwable th) {
            raj.c(th);
            this.b.dispose();
            onError(th);
        }
    }

    @Override // defpackage.wl0, defpackage.vta
    public final void onError(Throwable th) {
        if (this.d) {
            t8j.a(th);
            return;
        }
        this.d = true;
        this.X.clear();
        this.a.onError(th);
    }

    @Override // defpackage.o1f
    public final Object poll() {
        Object objPoll;
        Object objApply;
        do {
            objPoll = this.c.poll();
            if (objPoll == null) {
                break;
            }
            objApply = this.Y.apply(objPoll);
            Objects.requireNonNull(objApply, "The keySelector returned a null key");
        } while (!this.X.add(objApply));
        return objPoll;
    }
}
