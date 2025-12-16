package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class g2f extends e2f implements v2f {
    public static final f2f[] X = new f2f[0];
    public static final f2f[] Y = new f2f[0];
    public final u2f a;
    public final AtomicInteger b = new AtomicInteger();
    public final AtomicReference c = new AtomicReference(X);
    public Object d;
    public Throwable o;

    public g2f(u2f u2fVar) {
        this.a = u2fVar;
    }

    @Override // defpackage.v2f
    public final void a(Object obj) {
        this.d = obj;
        for (f2f f2fVar : (f2f[]) this.c.getAndSet(Y)) {
            if (!f2fVar.get()) {
                f2fVar.a.a(obj);
            }
        }
    }

    @Override // defpackage.v2f
    public final void c(py4 py4Var) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.e2f
    public final void l(v2f v2fVar) {
        f2f f2fVar = new f2f(v2fVar, this);
        v2fVar.c(f2fVar);
        while (true) {
            AtomicReference atomicReference = this.c;
            f2f[] f2fVarArr = (f2f[]) atomicReference.get();
            if (f2fVarArr == Y) {
                Throwable th = this.o;
                if (th != null) {
                    v2fVar.onError(th);
                    return;
                } else {
                    v2fVar.a(this.d);
                    return;
                }
            }
            int length = f2fVarArr.length;
            f2f[] f2fVarArr2 = new f2f[length + 1];
            System.arraycopy(f2fVarArr, 0, f2fVarArr2, 0, length);
            f2fVarArr2[length] = f2fVar;
            while (!atomicReference.compareAndSet(f2fVarArr, f2fVarArr2)) {
                if (atomicReference.get() != f2fVarArr) {
                    break;
                }
            }
            if (f2fVar.get()) {
                o(f2fVar);
            }
            if (this.b.getAndIncrement() == 0) {
                this.a.k(this);
                return;
            }
            return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o(f2f f2fVar) {
        f2f[] f2fVarArr;
        while (true) {
            AtomicReference atomicReference = this.c;
            f2f[] f2fVarArr2 = (f2f[]) atomicReference.get();
            int length = f2fVarArr2.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (f2fVarArr2[i] == f2fVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                f2fVarArr = X;
            } else {
                f2f[] f2fVarArr3 = new f2f[length - 1];
                System.arraycopy(f2fVarArr2, 0, f2fVarArr3, 0, i);
                System.arraycopy(f2fVarArr2, i + 1, f2fVarArr3, i, (length - i) - 1);
                f2fVarArr = f2fVarArr3;
            }
            while (!atomicReference.compareAndSet(f2fVarArr2, f2fVarArr)) {
                if (atomicReference.get() != f2fVarArr2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // defpackage.v2f
    public final void onError(Throwable th) {
        this.o = th;
        for (f2f f2fVar : (f2f[]) this.c.getAndSet(Y)) {
            if (!f2fVar.get()) {
                f2fVar.a.onError(th);
            }
        }
    }
}
