package com.facebook.imagepipeline.memory;

import android.annotation.SuppressLint;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.facebook.common.memory.MemoryTrimType;
import com.facebook.infer.annotation.Nullsafe;
import j.k0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import uW0.C48986a;
import uW0.C48987b;

@Nullsafe
/* loaded from: classes13.dex */
public abstract class BasePool<V> implements wW0.e<V> {

    /* renamed from: a, reason: collision with root package name */
    public final Class<?> f340413a = getClass();

    /* renamed from: b, reason: collision with root package name */
    public final wW0.c f340414b;

    /* renamed from: c, reason: collision with root package name */
    public final G f340415c;

    /* renamed from: d, reason: collision with root package name */
    @k0
    public final SparseArray<C36390h<V>> f340416d;

    /* renamed from: e, reason: collision with root package name */
    @k0
    public final Set<V> f340417e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f340418f;

    /* renamed from: g, reason: collision with root package name */
    @J41.a
    @k0
    public final a f340419g;

    /* renamed from: h, reason: collision with root package name */
    @J41.a
    @k0
    public final a f340420h;

    /* renamed from: i, reason: collision with root package name */
    public final H f340421i;

    public static class InvalidSizeException extends RuntimeException {
        public InvalidSizeException(Integer num) {
            super("Invalid size: " + num.toString());
        }
    }

    public static class InvalidValueException extends RuntimeException {
    }

    public static class PoolSizeViolationException extends RuntimeException {
    }

    public static class SizeTooLargeException extends InvalidSizeException {
    }

    @k0
    @J41.c
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f340422a;

        /* renamed from: b, reason: collision with root package name */
        public int f340423b;

        public final void a(int i12) {
            int i13;
            int i14 = this.f340423b;
            if (i14 < i12 || (i13 = this.f340422a) <= 0) {
                C48986a.m("com.facebook.imagepipeline.memory.BasePool.Counter", "Unexpected decrement of %d. Current numBytes = %d, count = %d", Integer.valueOf(i12), Integer.valueOf(this.f340423b), Integer.valueOf(this.f340422a));
            } else {
                this.f340422a = i13 - 1;
                this.f340423b = i14 - i12;
            }
        }
    }

    public BasePool(wW0.c cVar, G g12, H h12) {
        cVar.getClass();
        this.f340414b = cVar;
        g12.getClass();
        this.f340415c = g12;
        h12.getClass();
        this.f340421i = h12;
        this.f340416d = new SparseArray<>();
        n(new SparseIntArray(0));
        this.f340417e = Collections.newSetFromMap(new IdentityHashMap());
        this.f340420h = new a();
        this.f340419g = new a();
    }

    @Override // wW0.e, com.facebook.common.references.h
    public final void a(V v12) {
        C36390h<V> c36390h;
        v12.getClass();
        int i12 = i(v12);
        int iJ2 = j(i12);
        synchronized (this) {
            try {
                synchronized (this) {
                    c36390h = this.f340416d.get(i12);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!this.f340417e.remove(v12)) {
            Class<?> cls = this.f340413a;
            Object[] objArr = {Integer.valueOf(System.identityHashCode(v12)), Integer.valueOf(i12)};
            C48987b c48987b = C48986a.f440079a;
            if (c48987b.a(6)) {
                c48987b.b(6, cls.getSimpleName(), String.format(null, "release (free, value unrecognized) (object, size) = (%x, %s)", objArr));
            }
            f(v12);
            this.f340421i.getClass();
        } else if (c36390h == null || c36390h.f340468d + c36390h.f340467c.size() > c36390h.f340466b || l() || !m(v12)) {
            if (c36390h != null) {
                com.facebook.common.internal.o.d(c36390h.f340468d > 0);
                c36390h.f340468d--;
            }
            if (C48986a.f440079a.a(2)) {
                C48986a.e(this.f340413a, "release (free) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(v12)), Integer.valueOf(i12));
            }
            f(v12);
            this.f340419g.a(iJ2);
            this.f340421i.getClass();
        } else {
            int i13 = c36390h.f340468d;
            if (i13 > 0) {
                c36390h.f340468d = i13 - 1;
                c36390h.a(v12);
            } else {
                Object[] objArr2 = {v12};
                C48987b c48987b2 = C48986a.f440079a;
                if (c48987b2.a(6)) {
                    c48987b2.b(6, "BUCKET", String.format(null, "Tried to release value %s from an empty bucket!", objArr2));
                }
            }
            a aVar = this.f340420h;
            aVar.f340422a++;
            aVar.f340423b += iJ2;
            this.f340419g.a(iJ2);
            this.f340421i.getClass();
            if (C48986a.f440079a.a(2)) {
                C48986a.e(this.f340413a, "release (reuse) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(v12)), Integer.valueOf(i12));
            }
        }
        o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // wW0.b
    public final void c(MemoryTrimType memoryTrimType) {
        ArrayList arrayList;
        int i12;
        synchronized (this) {
            try {
                this.f340415c.getClass();
                arrayList = new ArrayList(this.f340416d.size());
                SparseIntArray sparseIntArray = new SparseIntArray();
                for (int i13 = 0; i13 < this.f340416d.size(); i13++) {
                    C36390h<V> c36390hValueAt = this.f340416d.valueAt(i13);
                    c36390hValueAt.getClass();
                    C36390h<V> c36390h = c36390hValueAt;
                    if (c36390h.f340467c.size() > 0) {
                        arrayList.add(c36390h);
                    }
                    sparseIntArray.put(this.f340416d.keyAt(i13), c36390h.f340468d);
                }
                n(sparseIntArray);
                a aVar = this.f340420h;
                aVar.f340422a = 0;
                aVar.f340423b = 0;
                o();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (i12 = 0; i12 < arrayList.size(); i12++) {
            C36390h c36390h2 = (C36390h) arrayList.get(i12);
            while (true) {
                Object objB = c36390h2.b();
                if (objB == null) {
                    break;
                } else {
                    f(objB);
                }
            }
        }
    }

    public abstract V d(int i12);

    @k0
    public final synchronized boolean e(int i12) {
        G g12 = this.f340415c;
        int i13 = g12.f340443a;
        int i14 = this.f340419g.f340423b;
        if (i12 > i13 - i14) {
            this.f340421i.getClass();
            return false;
        }
        int i15 = g12.f340444b;
        if (i12 > i15 - (i14 + this.f340420h.f340423b)) {
            q(i15 - i12);
        }
        if (i12 <= i13 - (this.f340419g.f340423b + this.f340420h.f340423b)) {
            return true;
        }
        this.f340421i.getClass();
        return false;
    }

    @k0
    public abstract void f(V v12);

    @k0
    @I41.h
    public final synchronized C36390h<V> g(int i12) {
        try {
            C36390h<V> c36390h = this.f340416d.get(i12);
            if (c36390h == null && this.f340418f) {
                if (C48986a.f440079a.a(2)) {
                    C48986a.g(Integer.valueOf(i12), this.f340413a, "creating new bucket %s");
                }
                C36390h<V> c36390hP = p(i12);
                this.f340416d.put(i12, c36390hP);
                return c36390hP;
            }
            return c36390h;
        } finally {
        }
    }

    @Override // wW0.e
    public final V get(int i12) throws Throwable {
        V vD2;
        V vK2;
        synchronized (this) {
            try {
                com.facebook.common.internal.o.d(!l() || this.f340420h.f340423b == 0);
            } finally {
            }
        }
        int iH2 = h(i12);
        synchronized (this) {
            try {
                C36390h<V> c36390hG = g(iH2);
                if (c36390hG != null && (vK2 = k(c36390hG)) != null) {
                    com.facebook.common.internal.o.d(this.f340417e.add(vK2));
                    int i13 = i(vK2);
                    int iJ2 = j(i13);
                    a aVar = this.f340419g;
                    aVar.f340422a++;
                    aVar.f340423b += iJ2;
                    this.f340420h.a(iJ2);
                    this.f340421i.getClass();
                    o();
                    if (C48986a.f440079a.a(2)) {
                        C48986a.e(this.f340413a, "get (reuse) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(vK2)), Integer.valueOf(i13));
                    }
                    return vK2;
                }
                int iJ3 = j(iH2);
                if (!e(iJ3)) {
                    int i14 = this.f340415c.f340443a;
                    int i15 = this.f340419g.f340423b;
                    int i16 = this.f340420h.f340423b;
                    StringBuilder sbY = androidx.appcompat.app.r.y(i14, i15, "Pool hard cap violation? Hard cap = ", " Used size = ", " Free size = ");
                    sbY.append(i16);
                    sbY.append(" Request size = ");
                    sbY.append(iJ3);
                    throw new PoolSizeViolationException(sbY.toString());
                }
                a aVar2 = this.f340419g;
                aVar2.f340422a++;
                aVar2.f340423b += iJ3;
                if (c36390hG != null) {
                    c36390hG.f340468d++;
                }
                try {
                    vD2 = d(iH2);
                } catch (Throwable th2) {
                    synchronized (this) {
                        this.f340419g.a(iJ3);
                        C36390h<V> c36390hG2 = g(iH2);
                        if (c36390hG2 != null) {
                            com.facebook.common.internal.o.d(c36390hG2.f340468d > 0);
                            c36390hG2.f340468d--;
                        }
                        if (Error.class.isInstance(th2)) {
                            throw ((Throwable) Error.class.cast(th2));
                        }
                        if (RuntimeException.class.isInstance(th2)) {
                            throw ((Throwable) RuntimeException.class.cast(th2));
                        }
                        vD2 = null;
                    }
                }
                synchronized (this) {
                    try {
                        com.facebook.common.internal.o.d(this.f340417e.add(vD2));
                        synchronized (this) {
                            if (l()) {
                                q(this.f340415c.f340444b);
                            }
                        }
                        return vD2;
                    } finally {
                    }
                }
                this.f340421i.getClass();
                o();
                if (C48986a.f440079a.a(2)) {
                    C48986a.e(this.f340413a, "get (alloc) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(vD2)), Integer.valueOf(iH2));
                }
                return vD2;
            } finally {
            }
        }
    }

    public abstract int h(int i12);

    public abstract int i(V v12);

    public abstract int j(int i12);

    @I41.h
    public synchronized V k(C36390h<V> c36390h) {
        V vB2;
        vB2 = c36390h.b();
        if (vB2 != null) {
            c36390h.f340468d++;
        }
        return vB2;
    }

    @k0
    public final synchronized boolean l() {
        boolean z12;
        z12 = this.f340419g.f340423b + this.f340420h.f340423b > this.f340415c.f340444b;
        if (z12) {
            this.f340421i.getClass();
        }
        return z12;
    }

    public boolean m(V v12) {
        v12.getClass();
        return true;
    }

    public final synchronized void n(SparseIntArray sparseIntArray) {
        try {
            this.f340416d.clear();
            SparseIntArray sparseIntArray2 = this.f340415c.f340445c;
            if (sparseIntArray2 != null) {
                for (int i12 = 0; i12 < sparseIntArray2.size(); i12++) {
                    int iKeyAt = sparseIntArray2.keyAt(i12);
                    int iValueAt = sparseIntArray2.valueAt(i12);
                    int i13 = sparseIntArray.get(iKeyAt, 0);
                    SparseArray<C36390h<V>> sparseArray = this.f340416d;
                    int iJ2 = j(iKeyAt);
                    this.f340415c.getClass();
                    sparseArray.put(iKeyAt, new C36390h<>(iJ2, iValueAt, i13));
                }
                this.f340418f = false;
            } else {
                this.f340418f = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @SuppressLint({"InvalidAccessToGuardedField"})
    public final void o() {
        if (C48986a.f440079a.a(2)) {
            a aVar = this.f340419g;
            Integer numValueOf = Integer.valueOf(aVar.f340422a);
            Integer numValueOf2 = Integer.valueOf(aVar.f340423b);
            a aVar2 = this.f340420h;
            Integer numValueOf3 = Integer.valueOf(aVar2.f340422a);
            Integer numValueOf4 = Integer.valueOf(aVar2.f340423b);
            Class<?> cls = this.f340413a;
            C48987b c48987b = C48986a.f440079a;
            if (c48987b.a(2)) {
                c48987b.b(2, cls.getSimpleName(), String.format(null, "Used = (%d, %d); Free = (%d, %d)", numValueOf, numValueOf2, numValueOf3, numValueOf4));
            }
        }
    }

    public C36390h<V> p(int i12) {
        int iJ2 = j(i12);
        this.f340415c.getClass();
        return new C36390h<>(iJ2, Integer.MAX_VALUE, 0);
    }

    @k0
    public final synchronized void q(int i12) {
        try {
            int i13 = this.f340419g.f340423b;
            int i14 = this.f340420h.f340423b;
            int iMin = Math.min((i13 + i14) - i12, i14);
            if (iMin <= 0) {
                return;
            }
            if (C48986a.f440079a.a(2)) {
                C48986a.f(this.f340413a, "trimToSize: TargetSize = %d; Initial Size = %d; Bytes to free = %d", Integer.valueOf(i12), Integer.valueOf(this.f340419g.f340423b + this.f340420h.f340423b), Integer.valueOf(iMin));
            }
            o();
            for (int i15 = 0; i15 < this.f340416d.size() && iMin > 0; i15++) {
                C36390h<V> c36390hValueAt = this.f340416d.valueAt(i15);
                c36390hValueAt.getClass();
                C36390h<V> c36390h = c36390hValueAt;
                while (iMin > 0) {
                    V vB2 = c36390h.b();
                    if (vB2 == null) {
                        break;
                    }
                    f(vB2);
                    int i16 = c36390h.f340465a;
                    iMin -= i16;
                    this.f340420h.a(i16);
                }
            }
            o();
            if (C48986a.f440079a.a(2)) {
                C48986a.e(this.f340413a, "trimToSize: TargetSize = %d; Final Size = %d", Integer.valueOf(i12), Integer.valueOf(this.f340419g.f340423b + this.f340420h.f340423b));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
