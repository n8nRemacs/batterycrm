package defpackage;

import android.util.SparseArray;
import android.util.SparseIntArray;
import com.facebook.imagepipeline.memory.BasePool$PoolSizeViolationException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class kk0 implements u5c {
    public boolean X;
    public final kt Y;
    public final kt Z;
    public final Class a = getClass();
    public final rf9 b;
    public final w5c c;
    public final SparseArray d;
    public final Set o;
    public final x5c s0;

    public kk0(rf9 rf9Var, w5c w5cVar, x5c x5cVar) {
        rf9Var.getClass();
        this.b = rf9Var;
        w5cVar.getClass();
        this.c = w5cVar;
        x5cVar.getClass();
        this.s0 = x5cVar;
        this.d = new SparseArray();
        o(new SparseIntArray(0));
        this.o = Collections.newSetFromMap(new IdentityHashMap());
        this.Z = new kt(1);
        this.Y = new kt(1);
    }

    @Override // defpackage.qf9
    public final void a(pf9 pf9Var) {
        ArrayList arrayList;
        int i;
        synchronized (this) {
            try {
                this.c.getClass();
                arrayList = new ArrayList(this.d.size());
                SparseIntArray sparseIntArray = new SparseIntArray();
                for (int i2 = 0; i2 < this.d.size(); i2++) {
                    fu0 fu0Var = (fu0) this.d.valueAt(i2);
                    fu0Var.getClass();
                    if (fu0Var.c.size() > 0) {
                        arrayList.add(fu0Var);
                    }
                    sparseIntArray.put(this.d.keyAt(i2), fu0Var.d);
                }
                o(sparseIntArray);
                kt ktVar = this.Z;
                ktVar.b = 0;
                ktVar.c = 0;
                p();
            } catch (Throwable th) {
                throw th;
            }
        }
        for (i = 0; i < arrayList.size(); i++) {
            fu0 fu0Var2 = (fu0) arrayList.get(i);
            while (true) {
                Object objB = fu0Var2.b();
                if (objB == null) {
                    break;
                } else {
                    g(objB);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b9  */
    @Override // defpackage.u5c, defpackage.fod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kk0.b(java.lang.Object):void");
    }

    public abstract Object e(int i);

    public final synchronized boolean f(int i) {
        w5c w5cVar = this.c;
        int i2 = w5cVar.a;
        int i3 = this.Y.c;
        if (i > i2 - i3) {
            this.s0.getClass();
            return false;
        }
        int i4 = w5cVar.b;
        if (i > i4 - (i3 + this.Z.c)) {
            r(i4 - i);
        }
        if (i <= i2 - (this.Y.c + this.Z.c)) {
            return true;
        }
        this.s0.getClass();
        return false;
    }

    public abstract void g(Object obj);

    @Override // defpackage.u5c
    public final Object get(int i) throws Throwable {
        Object objE;
        Object objL;
        synchronized (this) {
            try {
                l5j.f(!m() || this.Z.c == 0);
            } finally {
            }
        }
        int i2 = i(i);
        synchronized (this) {
            try {
                fu0 fu0VarH = h(i2);
                if (fu0VarH != null && (objL = l(fu0VarH)) != null) {
                    l5j.f(this.o.add(objL));
                    int iJ = j(objL);
                    int iK = k(iJ);
                    kt ktVar = this.Y;
                    ktVar.b++;
                    ktVar.c += iK;
                    this.Z.a(iK);
                    this.s0.getClass();
                    p();
                    if (op5.a.h(2)) {
                        op5.e(this.a, "get (reuse) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(objL)), Integer.valueOf(iJ));
                    }
                    return objL;
                }
                int iK2 = k(i2);
                if (!f(iK2)) {
                    int i3 = this.c.a;
                    int i4 = this.Y.c;
                    int i5 = this.Z.c;
                    StringBuilder sbK = wy1.k("Pool hard cap violation? Hard cap = ", i3, " Used size = ", i4, " Free size = ");
                    sbK.append(i5);
                    sbK.append(" Request size = ");
                    sbK.append(iK2);
                    throw new BasePool$PoolSizeViolationException(sbK.toString());
                }
                kt ktVar2 = this.Y;
                ktVar2.b++;
                ktVar2.c += iK2;
                if (fu0VarH != null) {
                    fu0VarH.d++;
                }
                try {
                    objE = e(i2);
                } catch (Throwable th) {
                    synchronized (this) {
                        this.Y.a(iK2);
                        fu0 fu0VarH2 = h(i2);
                        if (fu0VarH2 != null) {
                            l5j.f(fu0VarH2.d > 0);
                            fu0VarH2.d--;
                        }
                        if (Error.class.isInstance(th)) {
                            throw ((Throwable) Error.class.cast(th));
                        }
                        if (RuntimeException.class.isInstance(th)) {
                            throw ((Throwable) RuntimeException.class.cast(th));
                        }
                        objE = null;
                    }
                }
                synchronized (this) {
                    try {
                        l5j.f(this.o.add(objE));
                        synchronized (this) {
                            if (m()) {
                                r(this.c.b);
                            }
                        }
                        return objE;
                    } finally {
                    }
                }
                this.s0.getClass();
                p();
                if (op5.a.h(2)) {
                    op5.e(this.a, "get (alloc) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(objE)), Integer.valueOf(i2));
                }
                return objE;
            } finally {
            }
        }
    }

    public final synchronized fu0 h(int i) {
        try {
            fu0 fu0Var = (fu0) this.d.get(i);
            if (fu0Var == null && this.X) {
                if (op5.a.h(2)) {
                    op5.d(this.a, Integer.valueOf(i), "creating new bucket %s");
                }
                fu0 fu0VarQ = q(i);
                this.d.put(i, fu0VarQ);
                return fu0VarQ;
            }
            return fu0Var;
        } finally {
        }
    }

    public abstract int i(int i);

    public abstract int j(Object obj);

    public abstract int k(int i);

    public synchronized Object l(fu0 fu0Var) {
        Object objB;
        objB = fu0Var.b();
        if (objB != null) {
            fu0Var.d++;
        }
        return objB;
    }

    public final synchronized boolean m() {
        boolean z;
        z = this.Y.c + this.Z.c > this.c.b;
        if (z) {
            this.s0.getClass();
        }
        return z;
    }

    public boolean n(Object obj) {
        obj.getClass();
        return true;
    }

    public final synchronized void o(SparseIntArray sparseIntArray) {
        try {
            this.d.clear();
            SparseIntArray sparseIntArray2 = this.c.c;
            if (sparseIntArray2 != null) {
                for (int i = 0; i < sparseIntArray2.size(); i++) {
                    int iKeyAt = sparseIntArray2.keyAt(i);
                    int iValueAt = sparseIntArray2.valueAt(i);
                    int i2 = sparseIntArray.get(iKeyAt, 0);
                    SparseArray sparseArray = this.d;
                    int iK = k(iKeyAt);
                    this.c.getClass();
                    sparseArray.put(iKeyAt, new fu0(iK, iValueAt, i2));
                }
                this.X = false;
            } else {
                this.X = true;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void p() {
        if (op5.a.h(2)) {
            kt ktVar = this.Y;
            Integer numValueOf = Integer.valueOf(ktVar.b);
            Integer numValueOf2 = Integer.valueOf(ktVar.c);
            kt ktVar2 = this.Z;
            Integer numValueOf3 = Integer.valueOf(ktVar2.b);
            Integer numValueOf4 = Integer.valueOf(ktVar2.c);
            if (op5.a.h(2)) {
                op5.a.v(this.a.getSimpleName(), String.format(null, "Used = (%d, %d); Free = (%d, %d)", numValueOf, numValueOf2, numValueOf3, numValueOf4));
            }
        }
    }

    public fu0 q(int i) {
        int iK = k(i);
        this.c.getClass();
        return new fu0(iK, Integer.MAX_VALUE, 0);
    }

    public final synchronized void r(int i) {
        try {
            int i2 = this.Y.c;
            int i3 = this.Z.c;
            int iMin = Math.min((i2 + i3) - i, i3);
            if (iMin <= 0) {
                return;
            }
            if (op5.a.h(2)) {
                op5.f(this.a, "trimToSize: TargetSize = %d; Initial Size = %d; Bytes to free = %d", Integer.valueOf(i), Integer.valueOf(this.Y.c + this.Z.c), Integer.valueOf(iMin));
            }
            p();
            for (int i4 = 0; i4 < this.d.size() && iMin > 0; i4++) {
                fu0 fu0Var = (fu0) this.d.valueAt(i4);
                fu0Var.getClass();
                while (iMin > 0) {
                    Object objB = fu0Var.b();
                    if (objB == null) {
                        break;
                    }
                    g(objB);
                    int i5 = fu0Var.a;
                    iMin -= i5;
                    this.Z.a(i5);
                }
            }
            p();
            if (op5.a.h(2)) {
                op5.e(this.a, "trimToSize: TargetSize = %d; Final Size = %d", Integer.valueOf(i), Integer.valueOf(this.Y.c + this.Z.c));
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
