package defpackage;

import java.lang.ref.ReferenceQueue;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class vn3 extends g3 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(vn3.class, "_size$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(vn3.class, Object.class, "core$volatile");
    private volatile /* synthetic */ int _size$volatile;
    public final ReferenceQueue a;
    private volatile /* synthetic */ Object core$volatile = new sn3(this, 16);

    public vn3(boolean z) {
        this.a = z ? new ReferenceQueue() : null;
    }

    @Override // defpackage.g3
    public final Set a() {
        return new un3(this, new cj0(11));
    }

    @Override // defpackage.g3
    public final Set b() {
        return new un3(this, new cj0(10));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Iterator it = ((un3) b()).iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final synchronized Object d(Object obj, Object obj2) {
        Object objA;
        sn3 sn3VarB = (sn3) c.get(this);
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = sn3.g;
            objA = sn3VarB.a(obj, obj2, null);
            if (objA == wn3.a) {
                sn3VarB = sn3VarB.b();
                c.set(this, sn3VarB);
            }
        }
        return objA;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        sn3 sn3Var = (sn3) c.get(this);
        sn3Var.getClass();
        int iHashCode = (obj.hashCode() * (-1640531527)) >>> sn3Var.b;
        while (true) {
            a17 a17Var = (a17) sn3Var.d.get(iHashCode);
            if (a17Var == null) {
                return null;
            }
            Object obj2 = a17Var.get();
            if (obj.equals(obj2)) {
                Object obj3 = sn3Var.e.get(iHashCode);
                return obj3 instanceof gp8 ? ((gp8) obj3).a : obj3;
            }
            if (obj2 == null) {
                sn3Var.c(iHashCode);
            }
            if (iHashCode == 0) {
                iHashCode = sn3Var.a;
            }
            iHashCode--;
        }
    }

    @Override // defpackage.g3
    public final int getSize() {
        return b.get(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        sn3 sn3Var = (sn3) c.get(this);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = sn3.g;
        Object objA = sn3Var.a(obj, obj2, null);
        if (objA == wn3.a) {
            objA = d(obj, obj2);
        }
        if (objA == null) {
            b.incrementAndGet(this);
        }
        return objA;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        if (obj == null) {
            return null;
        }
        sn3 sn3Var = (sn3) c.get(this);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = sn3.g;
        Object objA = sn3Var.a(obj, null, null);
        if (objA == wn3.a) {
            objA = d(obj, null);
        }
        if (objA != null) {
            b.decrementAndGet(this);
        }
        return objA;
    }
}
