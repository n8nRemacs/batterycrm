package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class rx extends snf {
    public static final qx[] d = new qx[0];
    public static final qx[] o = new qx[0];
    public final AtomicReference a = new AtomicReference(d);
    public Throwable b;
    public Object c;

    @Override // defpackage.vta
    public final void b() {
        AtomicReference atomicReference = this.a;
        Object obj = atomicReference.get();
        Object obj2 = o;
        if (obj == obj2) {
            return;
        }
        Object obj3 = this.c;
        qx[] qxVarArr = (qx[]) atomicReference.getAndSet(obj2);
        int i = 0;
        if (obj3 != null) {
            int length = qxVarArr.length;
            while (i < length) {
                qxVarArr[i].d(obj3);
                i++;
            }
            return;
        }
        int length2 = qxVarArr.length;
        while (i < length2) {
            qx qxVar = qxVarArr[i];
            if (!qxVar.e()) {
                qxVar.a.b();
            }
            i++;
        }
    }

    @Override // defpackage.vta
    public final void c(py4 py4Var) {
        if (this.a.get() == o) {
            py4Var.dispose();
        }
    }

    @Override // defpackage.vta
    public final void f(Object obj) {
        bj5.b(obj, "onNext called with a null value.");
        if (this.a.get() == o) {
            return;
        }
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vqa
    public final void o(vta vtaVar) {
        qx qxVar = new qx(vtaVar, this);
        vtaVar.c(qxVar);
        while (true) {
            AtomicReference atomicReference = this.a;
            qx[] qxVarArr = (qx[]) atomicReference.get();
            if (qxVarArr != o) {
                int length = qxVarArr.length;
                qx[] qxVarArr2 = new qx[length + 1];
                System.arraycopy(qxVarArr, 0, qxVarArr2, 0, length);
                qxVarArr2[length] = qxVar;
                while (!atomicReference.compareAndSet(qxVarArr, qxVarArr2)) {
                    if (atomicReference.get() != qxVarArr) {
                        break;
                    }
                }
                if (qxVar.e()) {
                    t(qxVar);
                    return;
                }
                return;
            }
            Throwable th = this.b;
            if (th != null) {
                vtaVar.onError(th);
                return;
            }
            Object obj = this.c;
            if (obj != null) {
                qxVar.d(obj);
                return;
            } else {
                if (qxVar.e()) {
                    return;
                }
                qxVar.a.b();
                return;
            }
        }
    }

    @Override // defpackage.vta
    public final void onError(Throwable th) {
        bj5.b(th, "onError called with a null Throwable.");
        AtomicReference atomicReference = this.a;
        Object obj = atomicReference.get();
        Object obj2 = o;
        if (obj == obj2) {
            t8j.a(th);
            return;
        }
        this.c = null;
        this.b = th;
        qx[] qxVarArr = (qx[]) atomicReference.getAndSet(obj2);
        for (qx qxVar : qxVarArr) {
            if (qxVar.e()) {
                t8j.a(th);
            } else {
                qxVar.a.onError(th);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void t(qx qxVar) {
        qx[] qxVarArr;
        while (true) {
            AtomicReference atomicReference = this.a;
            qx[] qxVarArr2 = (qx[]) atomicReference.get();
            int length = qxVarArr2.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (qxVarArr2[i] == qxVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                qxVarArr = d;
            } else {
                qx[] qxVarArr3 = new qx[length - 1];
                System.arraycopy(qxVarArr2, 0, qxVarArr3, 0, i);
                System.arraycopy(qxVarArr2, i + 1, qxVarArr3, i, (length - i) - 1);
                qxVarArr = qxVarArr3;
            }
            while (!atomicReference.compareAndSet(qxVarArr2, qxVarArr)) {
                if (atomicReference.get() != qxVarArr2) {
                    break;
                }
            }
            return;
        }
    }
}
