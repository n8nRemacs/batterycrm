package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class cta extends AtomicReference implements vta, py4 {
    public static final zsa[] X = new zsa[0];
    public static final zsa[] Y = new zsa[0];
    public final bta a;
    public boolean b;
    public final AtomicReference c = new AtomicReference(X);
    public final AtomicBoolean d = new AtomicBoolean();
    public final AtomicReference o;

    public cta(bta btaVar, AtomicReference atomicReference) {
        this.a = btaVar;
        this.o = atomicReference;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(zsa zsaVar) {
        zsa[] zsaVarArr;
        while (true) {
            AtomicReference atomicReference = this.c;
            zsa[] zsaVarArr2 = (zsa[]) atomicReference.get();
            int length = zsaVarArr2.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (zsaVarArr2[i].equals(zsaVar)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                zsaVarArr = X;
            } else {
                zsa[] zsaVarArr3 = new zsa[length - 1];
                System.arraycopy(zsaVarArr2, 0, zsaVarArr3, 0, i);
                System.arraycopy(zsaVarArr2, i + 1, zsaVarArr3, i, (length - i) - 1);
                zsaVarArr = zsaVarArr3;
            }
            while (!atomicReference.compareAndSet(zsaVarArr2, zsaVarArr)) {
                if (atomicReference.get() != zsaVarArr2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // defpackage.vta
    public final void b() {
        if (this.b) {
            return;
        }
        this.b = true;
        bta btaVar = this.a;
        btaVar.a();
        for (zsa zsaVar : (zsa[]) this.c.getAndSet(Y)) {
            btaVar.c(zsaVar);
        }
    }

    @Override // defpackage.vta
    public final void c(py4 py4Var) {
        if (ty4.h(this, py4Var)) {
            for (zsa zsaVar : (zsa[]) this.c.get()) {
                this.a.c(zsaVar);
            }
        }
    }

    @Override // defpackage.py4
    public final void dispose() {
        AtomicReference atomicReference;
        this.c.set(Y);
        do {
            atomicReference = this.o;
            if (atomicReference.compareAndSet(this, null)) {
                break;
            }
        } while (atomicReference.get() == this);
        ty4.a(this);
    }

    @Override // defpackage.py4
    public final boolean e() {
        return this.c.get() == Y;
    }

    @Override // defpackage.vta
    public final void f(Object obj) {
        if (this.b) {
            return;
        }
        bta btaVar = this.a;
        btaVar.b(obj);
        for (zsa zsaVar : (zsa[]) this.c.get()) {
            btaVar.c(zsaVar);
        }
    }

    @Override // defpackage.vta
    public final void onError(Throwable th) {
        if (this.b) {
            t8j.a(th);
            return;
        }
        this.b = true;
        bta btaVar = this.a;
        btaVar.d(th);
        for (zsa zsaVar : (zsa[]) this.c.getAndSet(Y)) {
            btaVar.c(zsaVar);
        }
    }
}
