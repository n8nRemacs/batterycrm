package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlinx.coroutines.internal.Symbol;

/* loaded from: classes.dex */
public final class sn3 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater g = AtomicIntegerFieldUpdater.newUpdater(sn3.class, "load$volatile");
    public final int a;
    public final int b;
    public final int c;
    public final /* synthetic */ AtomicReferenceArray d;
    public final /* synthetic */ AtomicReferenceArray e;
    public final /* synthetic */ vn3 f;
    private volatile /* synthetic */ int load$volatile;

    public sn3(vn3 vn3Var, int i) {
        this.f = vn3Var;
        this.a = i;
        this.b = Integer.numberOfLeadingZeros(i) + 1;
        this.c = (i * 2) / 3;
        this.d = new AtomicReferenceArray(i);
        this.e = new AtomicReferenceArray(i);
    }

    public final Object a(Object obj, Object obj2, a17 a17Var) {
        int i;
        int iHashCode = (obj.hashCode() * (-1640531527)) >>> this.b;
        boolean z = false;
        loop0: while (true) {
            AtomicReferenceArray atomicReferenceArray = this.d;
            a17 a17Var2 = (a17) atomicReferenceArray.get(iHashCode);
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = g;
            if (a17Var2 == null) {
                if (obj2 != null) {
                    if (!z) {
                        do {
                            i = atomicIntegerFieldUpdater.get(this);
                            if (i >= this.c) {
                                return wn3.a;
                            }
                        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1));
                        z = true;
                    }
                    boolean z2 = z;
                    if (a17Var == null) {
                        a17Var = new a17(obj, this.f.a);
                        obj.hashCode();
                    }
                    a17 a17Var3 = a17Var;
                    while (!atomicReferenceArray.compareAndSet(iHashCode, null, a17Var3)) {
                        if (atomicReferenceArray.get(iHashCode) != null) {
                            z = z2;
                            a17Var = a17Var3;
                        }
                    }
                    break loop0;
                }
                return null;
            }
            Object obj3 = a17Var2.get();
            if (!obj.equals(obj3)) {
                if (obj3 == null) {
                    c(iHashCode);
                }
                if (iHashCode == 0) {
                    iHashCode = this.a;
                }
                iHashCode--;
            } else if (z) {
                atomicIntegerFieldUpdater.decrementAndGet(this);
            }
        }
        while (true) {
            AtomicReferenceArray atomicReferenceArray2 = this.e;
            Object obj4 = atomicReferenceArray2.get(iHashCode);
            if (obj4 instanceof gp8) {
                return wn3.a;
            }
            while (!atomicReferenceArray2.compareAndSet(iHashCode, obj4, obj2)) {
                if (atomicReferenceArray2.get(iHashCode) != obj4) {
                    break;
                }
            }
            return obj4;
        }
    }

    public final sn3 b() {
        int i;
        Object obj;
        gp8 gp8Var;
        while (true) {
            vn3 vn3Var = this.f;
            int size = vn3Var.getSize();
            if (size < 4) {
                size = 4;
            }
            sn3 sn3Var = new sn3(vn3Var, Integer.highestOneBit(size) * 4);
            while (i < this.a) {
                a17 a17Var = (a17) this.d.get(i);
                Object obj2 = a17Var != null ? a17Var.get() : null;
                if (a17Var != null && obj2 == null) {
                    c(i);
                }
                while (true) {
                    AtomicReferenceArray atomicReferenceArray = this.e;
                    obj = atomicReferenceArray.get(i);
                    if (!(obj instanceof gp8)) {
                        if (obj == null) {
                            gp8Var = wn3.b;
                        } else {
                            Symbol symbol = wn3.a;
                            gp8Var = obj.equals(Boolean.TRUE) ? wn3.c : new gp8(obj);
                        }
                        while (!atomicReferenceArray.compareAndSet(i, obj, gp8Var)) {
                            if (atomicReferenceArray.get(i) != obj) {
                                break;
                            }
                        }
                        break;
                    }
                    obj = ((gp8) obj).a;
                    break;
                }
                i = (obj2 == null || obj == null || sn3Var.a(obj2, obj, a17Var) != wn3.a) ? i + 1 : 0;
            }
            return sn3Var;
        }
    }

    public final void c(int i) {
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.e;
            Object obj = atomicReferenceArray.get(i);
            if (obj == null || (obj instanceof gp8)) {
                return;
            }
            while (!atomicReferenceArray.compareAndSet(i, obj, null)) {
                if (atomicReferenceArray.get(i) != obj) {
                    break;
                }
            }
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = vn3.b;
            vn3 vn3Var = this.f;
            vn3Var.getClass();
            vn3.b.decrementAndGet(vn3Var);
            return;
        }
    }
}
