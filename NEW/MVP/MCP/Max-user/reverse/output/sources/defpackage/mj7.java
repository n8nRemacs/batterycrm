package defpackage;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class mj7 extends r0 {
    public ArrayList h;
    public int i;
    public int j;
    public AtomicInteger k;
    public Throwable l;
    public Map m;
    public final /* synthetic */ nj7 n;

    public mj7(nj7 nj7Var) {
        this.n = nj7Var;
        if (nj7Var.b) {
            return;
        }
        o();
    }

    public static void n(mj7 mj7Var, int i, pe4 pe4Var) {
        pe4 pe4VarP;
        Throwable th;
        synchronized (mj7Var) {
            pe4VarP = pe4Var == mj7Var.r() ? null : pe4Var == mj7Var.q(i) ? mj7Var.p(i) : pe4Var;
        }
        if (pe4VarP != null) {
            pe4VarP.close();
        }
        if (i == 0) {
            r0 r0Var = (r0) pe4Var;
            mj7Var.l = r0Var.b();
            mj7Var.m = r0Var.a;
        }
        if (mj7Var.k.incrementAndGet() != mj7Var.j || (th = mj7Var.l) == null) {
            return;
        }
        mj7Var.i(th, mj7Var.m);
    }

    @Override // defpackage.r0, defpackage.pe4
    public final boolean close() {
        if (this.n.b) {
            o();
        }
        synchronized (this) {
            try {
                if (!super.close()) {
                    return false;
                }
                ArrayList arrayList = this.h;
                this.h = null;
                if (arrayList == null) {
                    return true;
                }
                for (int i = 0; i < arrayList.size(); i++) {
                    pe4 pe4Var = (pe4) arrayList.get(i);
                    if (pe4Var != null) {
                        pe4Var.close();
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.r0, defpackage.pe4
    public final synchronized Object d() {
        pe4 pe4VarR;
        try {
            if (this.n.b) {
                o();
            }
            pe4VarR = r();
        } catch (Throwable th) {
            throw th;
        }
        return pe4VarR != null ? pe4VarR.d() : null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001b  */
    @Override // defpackage.r0, defpackage.pe4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean e() {
        /*
            r1 = this;
            monitor-enter(r1)
            nj7 r0 = r1.n     // Catch: java.lang.Throwable -> Lb
            boolean r0 = r0.b     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto Ld
            r1.o()     // Catch: java.lang.Throwable -> Lb
            goto Ld
        Lb:
            r0 = move-exception
            goto L1e
        Ld:
            pe4 r0 = r1.r()     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto L1b
            boolean r0 = r0.e()     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto L1b
            r0 = 1
            goto L1c
        L1b:
            r0 = 0
        L1c:
            monitor-exit(r1)
            return r0
        L1e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mj7.e():boolean");
    }

    public final void o() {
        if (this.k != null) {
            return;
        }
        synchronized (this) {
            try {
                if (this.k == null) {
                    this.k = new AtomicInteger(0);
                    int size = this.n.a.size();
                    this.j = size;
                    this.i = size;
                    this.h = new ArrayList(size);
                    for (int i = 0; i < size; i++) {
                        pe4 pe4Var = (pe4) ((brf) this.n.a.get(i)).get();
                        this.h.add(pe4Var);
                        r0 r0Var = (r0) pe4Var;
                        r0Var.l(new lj7(this, i), yu1.a);
                        if (!r0Var.e()) {
                        }
                    }
                }
            } finally {
            }
        }
    }

    public final synchronized pe4 p(int i) {
        pe4 pe4Var;
        ArrayList arrayList = this.h;
        pe4Var = null;
        if (arrayList != null && i < arrayList.size()) {
            pe4Var = (pe4) this.h.set(i, null);
        }
        return pe4Var;
    }

    public final synchronized pe4 q(int i) {
        ArrayList arrayList;
        arrayList = this.h;
        return (arrayList == null || i >= arrayList.size()) ? null : (pe4) this.h.get(i);
    }

    public final synchronized pe4 r() {
        return q(this.i);
    }
}
