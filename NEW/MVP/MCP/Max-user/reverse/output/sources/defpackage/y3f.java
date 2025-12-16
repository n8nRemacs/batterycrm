package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class y3f extends AtomicInteger implements py4 {
    public final v2f a;
    public final ukd b;
    public final z3f[] c;
    public Object[] d;

    public y3f(v2f v2fVar, int i, ukd ukdVar) {
        super(i);
        this.a = v2fVar;
        this.b = ukdVar;
        z3f[] z3fVarArr = new z3f[i];
        for (int i2 = 0; i2 < i; i2++) {
            z3fVarArr[i2] = new z3f(this, i2);
        }
        this.c = z3fVarArr;
        this.d = new Object[i];
    }

    public final void a(int i, Throwable th) {
        if (getAndSet(0) <= 0) {
            t8j.a(th);
            return;
        }
        z3f[] z3fVarArr = this.c;
        int length = z3fVarArr.length;
        for (int i2 = 0; i2 < i; i2++) {
            z3f z3fVar = z3fVarArr[i2];
            z3fVar.getClass();
            ty4.a(z3fVar);
        }
        while (true) {
            i++;
            if (i >= length) {
                this.d = null;
                this.a.onError(th);
                return;
            } else {
                z3f z3fVar2 = z3fVarArr[i];
                z3fVar2.getClass();
                ty4.a(z3fVar2);
            }
        }
    }

    @Override // defpackage.py4
    public final void dispose() {
        if (getAndSet(0) > 0) {
            for (z3f z3fVar : this.c) {
                z3fVar.getClass();
                ty4.a(z3fVar);
            }
            this.d = null;
        }
    }

    @Override // defpackage.py4
    public final boolean e() {
        return get() <= 0;
    }
}
