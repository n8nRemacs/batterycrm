package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class lqc extends snf {
    public static final kqc[] c = new kqc[0];
    public static final kqc[] d = new kqc[0];
    public final AtomicReference a = new AtomicReference(d);
    public Throwable b;

    @Override // defpackage.vta
    public final void b() {
        AtomicReference atomicReference = this.a;
        Object obj = atomicReference.get();
        Object obj2 = c;
        if (obj == obj2) {
            return;
        }
        kqc[] kqcVarArr = (kqc[]) atomicReference.getAndSet(obj2);
        for (kqc kqcVar : kqcVarArr) {
            if (!kqcVar.get()) {
                kqcVar.a.b();
            }
        }
    }

    @Override // defpackage.vta
    public final void c(py4 py4Var) {
        if (this.a.get() == c) {
            py4Var.dispose();
        }
    }

    @Override // defpackage.vta
    public final void f(Object obj) {
        bj5.b(obj, "onNext called with a null value.");
        for (kqc kqcVar : (kqc[]) this.a.get()) {
            if (!kqcVar.get()) {
                kqcVar.a.f(obj);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vqa
    public final void o(vta vtaVar) {
        kqc kqcVar = new kqc(vtaVar, this);
        vtaVar.c(kqcVar);
        while (true) {
            AtomicReference atomicReference = this.a;
            kqc[] kqcVarArr = (kqc[]) atomicReference.get();
            if (kqcVarArr == c) {
                Throwable th = this.b;
                if (th != null) {
                    vtaVar.onError(th);
                    return;
                } else {
                    vtaVar.b();
                    return;
                }
            }
            int length = kqcVarArr.length;
            kqc[] kqcVarArr2 = new kqc[length + 1];
            System.arraycopy(kqcVarArr, 0, kqcVarArr2, 0, length);
            kqcVarArr2[length] = kqcVar;
            while (!atomicReference.compareAndSet(kqcVarArr, kqcVarArr2)) {
                if (atomicReference.get() != kqcVarArr) {
                    break;
                }
            }
            if (kqcVar.get()) {
                t(kqcVar);
                return;
            }
            return;
        }
    }

    @Override // defpackage.vta
    public final void onError(Throwable th) {
        bj5.b(th, "onError called with a null Throwable.");
        AtomicReference atomicReference = this.a;
        Object obj = atomicReference.get();
        Object obj2 = c;
        if (obj == obj2) {
            t8j.a(th);
            return;
        }
        this.b = th;
        kqc[] kqcVarArr = (kqc[]) atomicReference.getAndSet(obj2);
        for (kqc kqcVar : kqcVarArr) {
            if (kqcVar.get()) {
                t8j.a(th);
            } else {
                kqcVar.a.onError(th);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void t(kqc kqcVar) {
        kqc[] kqcVarArr;
        while (true) {
            AtomicReference atomicReference = this.a;
            kqc[] kqcVarArr2 = (kqc[]) atomicReference.get();
            if (kqcVarArr2 == c || kqcVarArr2 == (kqcVarArr = d)) {
                return;
            }
            int length = kqcVarArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (kqcVarArr2[i] == kqcVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length != 1) {
                kqcVarArr = new kqc[length - 1];
                System.arraycopy(kqcVarArr2, 0, kqcVarArr, 0, i);
                System.arraycopy(kqcVarArr2, i + 1, kqcVarArr, i, (length - i) - 1);
            }
            while (!atomicReference.compareAndSet(kqcVarArr2, kqcVarArr)) {
                if (atomicReference.get() != kqcVarArr2) {
                    break;
                }
            }
            return;
        }
    }
}
