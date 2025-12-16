package com.google.common.collect;

import aZ0.InterfaceC19845a;
import com.google.j2objc.annotations.Weak;
import java.util.AbstractCollection;
import java.util.AbstractQueue;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* compiled from: MinMaxPriorityQueue.java */
@XY0.b
@InterfaceC37329f0
/* loaded from: classes6.dex */
public final class Q2<E> extends AbstractQueue<E> {

    /* renamed from: b, reason: collision with root package name */
    public final Q2<E>.c f359546b;

    /* renamed from: c, reason: collision with root package name */
    public final Q2<E>.c f359547c;

    /* renamed from: d, reason: collision with root package name */
    @XY0.e
    public final int f359548d;

    /* renamed from: e, reason: collision with root package name */
    public Object[] f359549e;

    /* renamed from: f, reason: collision with root package name */
    public int f359550f;

    /* renamed from: g, reason: collision with root package name */
    public int f359551g;

    /* compiled from: MinMaxPriorityQueue.java */
    public static final class b<B> {

        /* renamed from: a, reason: collision with root package name */
        public final Comparator<B> f359552a;

        /* renamed from: b, reason: collision with root package name */
        public final int f359553b;

        public b() {
            throw null;
        }

        public b(Comparator comparator, a aVar) {
            this.f359553b = Integer.MAX_VALUE;
            comparator.getClass();
            this.f359552a = comparator;
        }
    }

    /* compiled from: MinMaxPriorityQueue.java */
    public class c {

        /* renamed from: a, reason: collision with root package name */
        public final AbstractC37429w3<E> f359554a;

        /* renamed from: b, reason: collision with root package name */
        @Weak
        public Q2<E>.c f359555b;

        public c(AbstractC37429w3<E> abstractC37429w3) {
            this.f359554a = abstractC37429w3;
        }

        public static int d(int i12) {
            return (i12 - 1) / 2;
        }

        @InterfaceC19845a
        public final int a(int i12, E e12) {
            Q2 q22;
            while (true) {
                q22 = Q2.this;
                if (i12 <= 2) {
                    break;
                }
                int iD2 = d(d(i12));
                Object objA = q22.a(iD2);
                if (this.f359554a.compare(objA, e12) <= 0) {
                    break;
                }
                q22.f359549e[i12] = objA;
                i12 = iD2;
            }
            q22.f359549e[i12] = e12;
            return i12;
        }

        public final int b(int i12, E e12) {
            int iD2;
            Q2 q22 = Q2.this;
            if (i12 == 0) {
                q22.f359549e[0] = e12;
                return 0;
            }
            int iD3 = d(i12);
            Object objA = q22.a(iD3);
            AbstractC37429w3<E> abstractC37429w3 = this.f359554a;
            if (iD3 != 0 && (iD2 = (d(iD3) * 2) + 2) != iD3 && (iD2 * 2) + 1 >= q22.f359550f) {
                Object objA2 = q22.a(iD2);
                if (abstractC37429w3.compare(objA2, objA) < 0) {
                    iD3 = iD2;
                    objA = objA2;
                }
            }
            if (abstractC37429w3.compare(objA, e12) >= 0) {
                q22.f359549e[i12] = e12;
                return i12;
            }
            Object[] objArr = q22.f359549e;
            objArr[i12] = objA;
            objArr[iD3] = e12;
            return iD3;
        }

        public final int c(int i12, int i13) {
            Q2 q22 = Q2.this;
            if (i12 >= q22.f359550f) {
                return -1;
            }
            com.google.common.base.M.q(i12 > 0);
            int iMin = Math.min(i12, q22.f359550f - i13) + i13;
            for (int i14 = i12 + 1; i14 < iMin; i14++) {
                if (this.f359554a.compare(q22.a(i14), q22.a(i12)) < 0) {
                    i12 = i14;
                }
            }
            return i12;
        }
    }

    /* compiled from: MinMaxPriorityQueue.java */
    public static class d<E> {

        /* renamed from: a, reason: collision with root package name */
        public final E f359557a;

        /* renamed from: b, reason: collision with root package name */
        public final E f359558b;

        public d(E e12, E e13) {
            this.f359557a = e12;
            this.f359558b = e13;
        }
    }

    /* compiled from: MinMaxPriorityQueue.java */
    public class e implements Iterator<E> {

        /* renamed from: b, reason: collision with root package name */
        public int f359559b = -1;

        /* renamed from: c, reason: collision with root package name */
        public int f359560c = -1;

        /* renamed from: d, reason: collision with root package name */
        public int f359561d;

        /* renamed from: e, reason: collision with root package name */
        @I41.a
        public ArrayDeque f359562e;

        /* renamed from: f, reason: collision with root package name */
        @I41.a
        public ArrayList f359563f;

        /* renamed from: g, reason: collision with root package name */
        @I41.a
        public E f359564g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f359565h;

        public e(a aVar) {
            this.f359561d = Q2.this.f359551g;
        }

        public static boolean a(AbstractCollection abstractCollection, Object obj) {
            Iterator it = abstractCollection.iterator();
            while (it.hasNext()) {
                if (it.next() == obj) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }

        public final void b(int i12) {
            if (this.f359560c < i12) {
                if (this.f359563f != null) {
                    while (true) {
                        Q2 q22 = Q2.this;
                        if (i12 >= q22.f359550f || !a(this.f359563f, q22.a(i12))) {
                            break;
                        } else {
                            i12++;
                        }
                    }
                }
                this.f359560c = i12;
            }
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            Q2 q22 = Q2.this;
            if (q22.f359551g != this.f359561d) {
                throw new ConcurrentModificationException();
            }
            b(this.f359559b + 1);
            if (this.f359560c < q22.f359550f) {
                return true;
            }
            ArrayDeque arrayDeque = this.f359562e;
            return (arrayDeque == null || arrayDeque.isEmpty()) ? false : true;
        }

        @Override // java.util.Iterator
        public final E next() {
            Q2 q22 = Q2.this;
            if (q22.f359551g != this.f359561d) {
                throw new ConcurrentModificationException();
            }
            b(this.f359559b + 1);
            int i12 = this.f359560c;
            int i13 = q22.f359550f;
            if (i12 < i13) {
                this.f359559b = i12;
                this.f359565h = true;
                return (E) q22.a(i12);
            }
            ArrayDeque arrayDeque = this.f359562e;
            if (arrayDeque != null) {
                this.f359559b = i13;
                E e12 = (E) arrayDeque.poll();
                this.f359564g = e12;
                if (e12 != null) {
                    this.f359565h = true;
                    return e12;
                }
            }
            throw new NoSuchElementException("iterator moved past last element in queue.");
        }

        @Override // java.util.Iterator
        public final void remove() {
            F.e(this.f359565h);
            Q2 q22 = Q2.this;
            int i12 = q22.f359551g;
            int i13 = this.f359561d;
            if (i12 != i13) {
                throw new ConcurrentModificationException();
            }
            boolean z12 = false;
            this.f359565h = false;
            this.f359561d = i13 + 1;
            int i14 = this.f359559b;
            if (i14 >= q22.f359550f) {
                E e12 = this.f359564g;
                Objects.requireNonNull(e12);
                int i15 = 0;
                while (true) {
                    if (i15 >= q22.f359550f) {
                        break;
                    }
                    if (q22.f359549e[i15] == e12) {
                        q22.d(i15);
                        z12 = true;
                        break;
                    }
                    i15++;
                }
                com.google.common.base.M.q(z12);
                this.f359564g = null;
                return;
            }
            d<E> dVarD = q22.d(i14);
            if (dVarD != null) {
                if (this.f359562e == null || this.f359563f == null) {
                    this.f359562e = new ArrayDeque();
                    this.f359563f = new ArrayList(3);
                }
                ArrayList arrayList = this.f359563f;
                E e13 = dVarD.f359557a;
                if (!a(arrayList, e13)) {
                    this.f359562e.add(e13);
                }
                ArrayDeque arrayDeque = this.f359562e;
                E e14 = dVarD.f359558b;
                if (!a(arrayDeque, e14)) {
                    this.f359563f.add(e14);
                }
            }
            this.f359559b--;
            this.f359560c--;
        }
    }

    public final E a(int i12) {
        E e12 = (E) this.f359549e[i12];
        Objects.requireNonNull(e12);
        return e12;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue
    @InterfaceC19845a
    public final boolean add(E e12) {
        offer(e12);
        return true;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    @InterfaceC19845a
    public final boolean addAll(Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        boolean z12 = false;
        while (it.hasNext()) {
            offer(it.next());
            z12 = true;
        }
        return z12;
    }

    public final Q2<E>.c b(int i12) {
        int i13 = ~(~(i12 + 1));
        com.google.common.base.M.n("negative index", i13 > 0);
        return (1431655765 & i13) > (i13 & (-1431655766)) ? this.f359546b : this.f359547c;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        for (int i12 = 0; i12 < this.f359550f; i12++) {
            this.f359549e[i12] = null;
        }
        this.f359550f = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b6  */
    @I41.a
    @aZ0.InterfaceC19845a
    @XY0.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.common.collect.Q2.d<E> d(int r11) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.Q2.d(int):com.google.common.collect.Q2$d");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        return new e(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0082  */
    @Override // java.util.Queue
    @aZ0.InterfaceC19845a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean offer(E r12) {
        /*
            r11 = this;
            r12.getClass()
            int r0 = r11.f359551g
            r1 = 1
            int r0 = r0 + r1
            r11.f359551g = r0
            int r0 = r11.f359550f
            int r2 = r0 + 1
            r11.f359550f = r2
            java.lang.Object[] r3 = r11.f359549e
            int r4 = r3.length
            int r5 = r11.f359548d
            r6 = 2
            r7 = 0
            if (r2 <= r4) goto L4b
            int r2 = r3.length
            r3 = 64
            if (r2 >= r3) goto L20
            int r2 = r2 + r1
            int r2 = r2 * r6
            goto L2c
        L20:
            int r2 = r2 / r6
            long r3 = (long) r2
            r8 = 3
            long r8 = (long) r8
            long r3 = r3 * r8
            int r8 = (int) r3
            long r9 = (long) r8
            int r3 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r3 != 0) goto L3d
            r2 = r8
        L2c:
            int r2 = r2 - r1
            int r2 = java.lang.Math.min(r2, r5)
            int r2 = r2 + r1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Object[] r3 = r11.f359549e
            int r4 = r3.length
            java.lang.System.arraycopy(r3, r7, r2, r7, r4)
            r11.f359549e = r2
            goto L4b
        L3d:
            java.lang.ArithmeticException r12 = new java.lang.ArithmeticException
            java.lang.String r0 = "overflow: checkedMultiply("
            java.lang.String r1 = ", 3)"
            java.lang.String r0 = androidx.camera.camera2.internal.G.e(r2, r0, r1)
            r12.<init>(r0)
            throw r12
        L4b:
            com.google.common.collect.Q2$c r2 = r11.b(r0)
            int r3 = r2.b(r0, r12)
            if (r3 != r0) goto L56
            goto L59
        L56:
            com.google.common.collect.Q2<E>$c r2 = r2.f359555b
            r0 = r3
        L59:
            r2.a(r0, r12)
            int r0 = r11.f359550f
            if (r0 <= r5) goto L90
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L68
            r0 = 0
            goto L8c
        L68:
            int r0 = r11.f359550f
            if (r0 == r1) goto L84
            if (r0 == r6) goto L82
            com.google.common.collect.Q2<E>$c r0 = r11.f359547c
            com.google.common.collect.Q2 r2 = com.google.common.collect.Q2.this
            java.lang.Object r3 = r2.a(r1)
            java.lang.Object r2 = r2.a(r6)
            com.google.common.collect.w3<E> r0 = r0.f359554a
            int r0 = r0.compare(r3, r2)
            if (r0 > 0) goto L85
        L82:
            r6 = r1
            goto L85
        L84:
            r6 = r7
        L85:
            java.lang.Object r0 = r11.a(r6)
            r11.d(r6)
        L8c:
            if (r0 == r12) goto L8f
            goto L90
        L8f:
            r1 = r7
        L90:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.Q2.offer(java.lang.Object):boolean");
    }

    @Override // java.util.Queue
    @I41.a
    public final E peek() {
        if (isEmpty()) {
            return null;
        }
        return a(0);
    }

    @Override // java.util.Queue
    @I41.a
    @InterfaceC19845a
    public final E poll() {
        if (isEmpty()) {
            return null;
        }
        E eA2 = a(0);
        d(0);
        return eA2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f359550f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @XY0.d
    public final Object[] toArray() {
        int i12 = this.f359550f;
        Object[] objArr = new Object[i12];
        System.arraycopy(this.f359549e, 0, objArr, 0, i12);
        return objArr;
    }

    public Q2(b<? super E> bVar, int i12) {
        AbstractC37429w3 abstractC37429w3B = AbstractC37429w3.b(bVar.f359552a);
        Q2<E>.c cVar = new c(abstractC37429w3B);
        this.f359546b = cVar;
        Q2<E>.c cVar2 = new c(abstractC37429w3B.h());
        this.f359547c = cVar2;
        cVar.f359555b = cVar2;
        cVar2.f359555b = cVar;
        this.f359548d = bVar.f359553b;
        this.f359549e = new Object[i12];
    }
}
