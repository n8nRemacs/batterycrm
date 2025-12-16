package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.Symbol;

/* loaded from: classes.dex */
public final class mbe implements z32, nbe, ojh {
    public static final /* synthetic */ AtomicReferenceFieldUpdater X = AtomicReferenceFieldUpdater.newUpdater(mbe.class, Object.class, "state$volatile");
    public final x74 a;
    public Object c;
    private volatile /* synthetic */ Object state$volatile = pbe.a;
    public ArrayList b = new ArrayList(2);
    public int d = -1;
    public Object o = pbe.d;

    public mbe(x74 x74Var) {
        this.a = x74Var;
    }

    @Override // defpackage.ojh
    public final void a(Segment segment, int i) {
        this.c = segment;
        this.d = i;
    }

    @Override // defpackage.z32
    public final void b(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = X;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == pbe.b) {
                return;
            }
            Symbol symbol = pbe.c;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, symbol)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            ArrayList arrayList = this.b;
            if (arrayList == null) {
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((kbe) it.next()).a();
            }
            this.o = pbe.d;
            this.b = null;
            return;
        }
    }

    public final Object c(q44 q44Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = X;
        kbe kbeVar = (kbe) atomicReferenceFieldUpdater.get(this);
        Object obj = this.o;
        ArrayList arrayList = this.b;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                kbe kbeVar2 = (kbe) it.next();
                if (kbeVar2 != kbeVar) {
                    kbeVar2.a();
                }
            }
            atomicReferenceFieldUpdater.set(this, pbe.b);
            this.o = pbe.d;
            this.b = null;
        }
        um6 um6Var = kbeVar.c;
        Object obj2 = kbeVar.d;
        Object objInvoke = um6Var.invoke(kbeVar.a, obj2, obj);
        xm6 xm6Var = kbeVar.e;
        return obj2 == pbe.e ? ((em6) xm6Var).invoke(q44Var) : ((sm6) xm6Var).invoke(objInvoke, q44Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.q44 r11) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mbe.d(q44):java.lang.Object");
    }

    public final kbe e(Object obj) {
        ArrayList arrayList = this.b;
        Object obj2 = null;
        if (arrayList == null) {
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((kbe) next).a == obj) {
                obj2 = next;
                break;
            }
        }
        kbe kbeVar = (kbe) obj2;
        if (kbeVar != null) {
            return kbeVar;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    public final void f(kbe kbeVar, boolean z) {
        ArrayList arrayList;
        Object obj = kbeVar.a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = X;
        if (atomicReferenceFieldUpdater.get(this) instanceof kbe) {
            return;
        }
        if (!z && ((arrayList = this.b) == null || !arrayList.isEmpty())) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((kbe) it.next()).a == obj) {
                    throw new IllegalStateException(("Cannot use select clauses on the same object: " + obj).toString());
                }
            }
        }
        kbeVar.b.invoke(obj, this, kbeVar.d);
        if (this.o != pbe.d) {
            atomicReferenceFieldUpdater.set(this, kbeVar);
            return;
        }
        if (!z) {
            this.b.add(kbeVar);
        }
        kbeVar.g = this.c;
        kbeVar.h = this.d;
        this.c = null;
        this.d = -1;
    }

    public final boolean g(Object obj, Object obj2) {
        return h(obj, obj2) == 0;
    }

    public final int h(Object obj, Object obj2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = X;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof k42)) {
                if (fni.a(obj3, pbe.b) || (obj3 instanceof kbe)) {
                    return 3;
                }
                if (fni.a(obj3, pbe.c)) {
                    return 2;
                }
                if (fni.a(obj3, pbe.a)) {
                    List listSingletonList = Collections.singletonList(obj);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, listSingletonList)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj3) {
                            break;
                        }
                    }
                    return 1;
                }
                if (!(obj3 instanceof List)) {
                    throw new IllegalStateException(("Unexpected state: " + obj3).toString());
                }
                ArrayList arrayListU = ue3.U((Collection) obj3, obj);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, arrayListU)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj3) {
                        break;
                    }
                }
                return 1;
            }
            kbe kbeVarE = e(obj);
            if (kbeVarE != null) {
                um6 um6Var = kbeVarE.f;
                um6 um6Var2 = um6Var != null ? (um6) um6Var.invoke(this, kbeVarE.d, obj2) : null;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, kbeVarE)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj3) {
                        break;
                    }
                }
                k42 k42Var = (k42) obj3;
                this.o = obj2;
                Symbol symbol = pbe.a;
                Symbol symbolJ = k42Var.j(qqg.a, um6Var2);
                if (symbolJ == null) {
                    this.o = pbe.d;
                    return 2;
                }
                k42Var.m(symbolJ);
                return 0;
            }
            continue;
        }
    }
}
