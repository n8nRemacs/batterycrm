package androidx.compose.ui.node;

import androidx.compose.ui.v;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42821v;
import kotlin.jvm.internal.C42822w;

/* compiled from: HitTestResult.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/node/x;", "", "Landroidx/compose/ui/v$d;", "<init>", "()V", "a", "b", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.node.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22444x implements List<v.d>, Z41.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final androidx.collection.N0<Object> f40938b = new androidx.collection.N0<>(16, null);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final androidx.collection.F0 f40939c = new androidx.collection.F0(16, null);

    /* renamed from: d, reason: collision with root package name */
    public int f40940d = -1;

    /* compiled from: HitTestResult.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/node/x$b;", "", "Landroidx/compose/ui/v$d;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.node.x$b */
    public final class b implements List<v.d>, Z41.a {

        /* renamed from: b, reason: collision with root package name */
        public final int f40945b;

        /* renamed from: c, reason: collision with root package name */
        public final int f40946c;

        public b(int i12, int i13) {
            this.f40945b = i12;
            this.f40946c = i13;
        }

        @Override // java.util.List
        public final /* bridge */ /* synthetic */ void add(int i12, v.d dVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final boolean addAll(int i12, Collection<? extends v.d> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final /* bridge */ /* synthetic */ void addLast(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            return (obj instanceof v.d) && indexOf((v.d) obj) != -1;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(@Y61.k Collection<? extends Object> collection) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains((v.d) it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public final v.d get(int i12) {
            return (v.d) C22444x.this.f40938b.b(i12 + this.f40945b);
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            if (!(obj instanceof v.d)) {
                return -1;
            }
            v.d dVar = (v.d) obj;
            int i12 = this.f40945b;
            int i13 = this.f40946c;
            if (i12 > i13) {
                return -1;
            }
            int i14 = i12;
            while (!kotlin.jvm.internal.L.f(C22444x.this.f40938b.b(i14), dVar)) {
                if (i14 == i13) {
                    return -1;
                }
                i14++;
            }
            return i14 - i12;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return size() == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        @Y61.k
        public final Iterator<v.d> iterator() {
            int i12 = this.f40945b;
            return C22444x.this.new a(i12, i12, this.f40946c);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            if (!(obj instanceof v.d)) {
                return -1;
            }
            v.d dVar = (v.d) obj;
            int i12 = this.f40946c;
            int i13 = this.f40945b;
            if (i13 > i12) {
                return -1;
            }
            while (!kotlin.jvm.internal.L.f(C22444x.this.f40938b.b(i12), dVar)) {
                if (i12 == i13) {
                    return -1;
                }
                i12--;
            }
            return i12 - i13;
        }

        @Override // java.util.List
        @Y61.k
        public final ListIterator<v.d> listIterator() {
            int i12 = this.f40945b;
            return C22444x.this.new a(i12, i12, this.f40946c);
        }

        @Override // java.util.List
        public final /* bridge */ /* synthetic */ v.d remove(int i12) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final /* bridge */ /* synthetic */ Object removeFirst() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final /* bridge */ /* synthetic */ Object removeLast() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final void replaceAll(UnaryOperator<v.d> unaryOperator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        public final /* bridge */ /* synthetic */ v.d set(int i12, v.d dVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.f40946c - this.f40945b;
        }

        @Override // java.util.List
        public final void sort(Comparator<? super v.d> comparator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        @Y61.k
        public final List<v.d> subList(int i12, int i13) {
            int i14 = this.f40945b;
            return C22444x.this.new b(i12 + i14, i14 + i13);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return C42821v.a(this);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ /* synthetic */ boolean add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(Collection<? extends v.d> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List
        @Y61.k
        public final ListIterator<v.d> listIterator(int i12) {
            int i13 = this.f40945b;
            int i14 = this.f40946c;
            return C22444x.this.new a(i12 + i13, i13, i14);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.List, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) C42821v.b(this, tArr);
        }
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i12, v.d dVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i12, Collection<? extends v.d> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003e, code lost:
    
        K.f.b("Index must be between 0 and size");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long b() {
        /*
            r7 = this;
            r0 = 2139095040(0x7f800000, float:Infinity)
            r1 = 0
            long r0 = androidx.compose.ui.node.C22446y.a(r0, r1, r1)
            int r2 = r7.f40940d
            int r2 = r2 + 1
            androidx.collection.N0<java.lang.Object> r3 = r7.f40938b
            int r3 = r3.f25660b
            int r3 = r3 + (-1)
            if (r2 > r3) goto L45
        L13:
            androidx.collection.F0 r4 = r7.f40939c
            if (r2 < 0) goto L3b
            int r5 = r4.f25610b
            if (r2 >= r5) goto L3e
            long[] r4 = r4.f25609a
            r5 = r4[r2]
            int r4 = androidx.compose.ui.node.C22434s.a(r5, r0)
            if (r4 >= 0) goto L26
            r0 = r5
        L26:
            float r4 = androidx.compose.ui.node.C22434s.b(r0)
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L36
            boolean r4 = androidx.compose.ui.node.C22434s.d(r0)
            if (r4 == 0) goto L36
            return r0
        L36:
            if (r2 == r3) goto L45
            int r2 = r2 + 1
            goto L13
        L3b:
            r4.getClass()
        L3e:
            java.lang.String r0 = "Index must be between 0 and size"
            K.f.b(r0)
            r0 = 0
            throw r0
        L45:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.C22444x.b():long");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f40940d = -1;
        this.f40938b.i();
        this.f40939c.f25610b = 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return (obj instanceof v.d) && indexOf((v.d) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(@Y61.k Collection<? extends Object> collection) {
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((v.d) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void d(int i12, int i13) {
        if (i12 >= i13) {
            return;
        }
        this.f40938b.l(i12, i13);
        androidx.collection.F0 f02 = this.f40939c;
        if (i12 >= 0) {
            int i14 = f02.f25610b;
            if (i12 <= i14 && i13 >= 0 && i13 <= i14) {
                if (i13 < i12) {
                    K.f.a("The end index must be < start index");
                    throw null;
                }
                if (i13 != i12) {
                    if (i13 < i14) {
                        long[] jArr = f02.f25609a;
                        C42756l.n(jArr, jArr, i12, i13, i14);
                    }
                    f02.f25610b -= i13 - i12;
                    return;
                }
                return;
            }
        } else {
            f02.getClass();
        }
        K.f.b("Index must be between 0 and size");
        throw null;
    }

    @Override // java.util.List
    public final v.d get(int i12) {
        return (v.d) this.f40938b.b(i12);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof v.d)) {
            return -1;
        }
        v.d dVar = (v.d) obj;
        int size = size() - 1;
        if (size < 0) {
            return -1;
        }
        int i12 = 0;
        while (!kotlin.jvm.internal.L.f(this.f40938b.b(i12), dVar)) {
            if (i12 == size) {
                return -1;
            }
            i12++;
        }
        return i12;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f40938b.d();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @Y61.k
    public final Iterator<v.d> iterator() {
        return new a(this, 0, 0, 0, 7, null);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof v.d)) {
            return -1;
        }
        v.d dVar = (v.d) obj;
        for (int size = size() - 1; -1 < size; size--) {
            if (kotlin.jvm.internal.L.f(this.f40938b.b(size), dVar)) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    @Y61.k
    public final ListIterator<v.d> listIterator() {
        return new a(this, 0, 0, 0, 7, null);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ v.d remove(int i12) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator<v.d> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ v.d set(int i12, v.d dVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f40938b.f25660b;
    }

    @Override // java.util.List
    public final void sort(Comparator<? super v.d> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    @Y61.k
    public final List<v.d> subList(int i12, int i13) {
        return new b(i12, i13);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return C42821v.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends v.d> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    @Y61.k
    public final ListIterator<v.d> listIterator(int i12) {
        return new a(this, i12, 0, 0, 6, null);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) C42821v.b(this, tArr);
    }

    /* compiled from: HitTestResult.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010*\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/node/x$a;", "", "Landroidx/compose/ui/v$d;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.node.x$a */
    public final class a implements ListIterator<v.d>, Z41.a {

        /* renamed from: b, reason: collision with root package name */
        public int f40941b;

        /* renamed from: c, reason: collision with root package name */
        public final int f40942c;

        /* renamed from: d, reason: collision with root package name */
        public final int f40943d;

        public a(C22444x c22444x, int i12, int i13, int i14, int i15, C42822w c42822w) {
            this((i15 & 1) != 0 ? 0 : i12, (i15 & 2) != 0 ? 0 : i13, (i15 & 4) != 0 ? c22444x.f40938b.f25660b : i14);
        }

        @Override // java.util.ListIterator
        public final /* bridge */ /* synthetic */ void add(v.d dVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f40941b < this.f40943d;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f40941b > this.f40942c;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final Object next() {
            androidx.collection.N0<Object> n02 = C22444x.this.f40938b;
            int i12 = this.f40941b;
            this.f40941b = i12 + 1;
            return (v.d) n02.b(i12);
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f40941b - this.f40942c;
        }

        @Override // java.util.ListIterator
        public final v.d previous() {
            androidx.collection.N0<Object> n02 = C22444x.this.f40938b;
            int i12 = this.f40941b - 1;
            this.f40941b = i12;
            return (v.d) n02.b(i12);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return (this.f40941b - this.f40942c) - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public final /* bridge */ /* synthetic */ void set(v.d dVar) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public a(int i12, int i13, int i14) {
            this.f40941b = i12;
            this.f40942c = i13;
            this.f40943d = i14;
        }
    }
}
