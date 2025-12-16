package defpackage;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class tra implements vta, py4 {
    public final vta a;
    public final boolean b;
    public py4 c;
    public long d;
    public boolean o;

    public tra(vta vtaVar, boolean z) {
        this.a = vtaVar;
        this.b = z;
    }

    @Override // defpackage.vta
    public final void b() {
        if (this.o) {
            return;
        }
        this.o = true;
        boolean z = this.b;
        vta vtaVar = this.a;
        if (z) {
            vtaVar.onError(new NoSuchElementException());
        } else {
            vtaVar.b();
        }
    }

    @Override // defpackage.vta
    public final void c(py4 py4Var) {
        if (ty4.i(this.c, py4Var)) {
            this.c = py4Var;
            this.a.c(this);
        }
    }

    @Override // defpackage.py4
    public final void dispose() {
        this.c.dispose();
    }

    @Override // defpackage.py4
    public final boolean e() {
        return this.c.e();
    }

    @Override // defpackage.vta
    public final void f(Object obj) {
        if (this.o) {
            return;
        }
        long j = this.d;
        if (j != 0) {
            this.d = j + 1;
            return;
        }
        this.o = true;
        this.c.dispose();
        vta vtaVar = this.a;
        vtaVar.f(obj);
        vtaVar.b();
    }

    @Override // defpackage.vta
    public final void onError(Throwable th) {
        if (this.o) {
            t8j.a(th);
        } else {
            this.o = true;
            this.a.onError(th);
        }
    }
}
