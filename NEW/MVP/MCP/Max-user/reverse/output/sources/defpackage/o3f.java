package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class o3f extends e2f implements v2f {
    public Object c;
    public Throwable d;
    public static final n3f[] o = new n3f[0];
    public static final n3f[] X = new n3f[0];
    public final AtomicBoolean b = new AtomicBoolean();
    public final AtomicReference a = new AtomicReference(o);

    @Override // defpackage.v2f
    public final void a(Object obj) {
        bj5.b(obj, "onSuccess called with a null value.");
        if (this.b.compareAndSet(false, true)) {
            this.c = obj;
            for (n3f n3fVar : (n3f[]) this.a.getAndSet(X)) {
                n3fVar.a.a(obj);
            }
        }
    }

    @Override // defpackage.v2f
    public final void c(py4 py4Var) {
        if (this.a.get() == X) {
            py4Var.dispose();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.e2f
    public final void l(v2f v2fVar) {
        n3f n3fVar = new n3f(v2fVar, this);
        v2fVar.c(n3fVar);
        while (true) {
            AtomicReference atomicReference = this.a;
            n3f[] n3fVarArr = (n3f[]) atomicReference.get();
            if (n3fVarArr == X) {
                Throwable th = this.d;
                if (th != null) {
                    v2fVar.onError(th);
                    return;
                } else {
                    v2fVar.a(this.c);
                    return;
                }
            }
            int length = n3fVarArr.length;
            n3f[] n3fVarArr2 = new n3f[length + 1];
            System.arraycopy(n3fVarArr, 0, n3fVarArr2, 0, length);
            n3fVarArr2[length] = n3fVar;
            while (!atomicReference.compareAndSet(n3fVarArr, n3fVarArr2)) {
                if (atomicReference.get() != n3fVarArr) {
                    break;
                }
            }
            if (n3fVar.e()) {
                o(n3fVar);
                return;
            }
            return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o(n3f n3fVar) {
        n3f[] n3fVarArr;
        while (true) {
            AtomicReference atomicReference = this.a;
            n3f[] n3fVarArr2 = (n3f[]) atomicReference.get();
            int length = n3fVarArr2.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (n3fVarArr2[i] == n3fVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                n3fVarArr = o;
            } else {
                n3f[] n3fVarArr3 = new n3f[length - 1];
                System.arraycopy(n3fVarArr2, 0, n3fVarArr3, 0, i);
                System.arraycopy(n3fVarArr2, i + 1, n3fVarArr3, i, (length - i) - 1);
                n3fVarArr = n3fVarArr3;
            }
            while (!atomicReference.compareAndSet(n3fVarArr2, n3fVarArr)) {
                if (atomicReference.get() != n3fVarArr2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // defpackage.v2f
    public final void onError(Throwable th) {
        bj5.b(th, "onError called with a null Throwable.");
        if (!this.b.compareAndSet(false, true)) {
            t8j.a(th);
            return;
        }
        this.d = th;
        for (n3f n3fVar : (n3f[]) this.a.getAndSet(X)) {
            n3fVar.a.onError(th);
        }
    }
}
