package androidx.compose.runtime.collection;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.X;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42821v;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: MutableVector.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00060\u0002j\u0002`\u0003:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/runtime/collection/e;", "T", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "a", "b", "c", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e<T> implements RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @k
    public T[] f38260b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public List<T> f38261c;

    /* renamed from: d, reason: collision with root package name */
    public int f38262d;

    /* compiled from: MutableVector.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/collection/e$a;", "T", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a<T> implements List<T>, Z41.e {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final e<T> f38263b;

        public a(@k e<T> eVar) {
            this.f38263b = eVar;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean add(T t12) {
            this.f38263b.b(t12);
            return true;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(@k Collection<? extends T> collection) {
            e<T> eVar = this.f38263b;
            return eVar.e(eVar.f38262d, collection);
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            this.f38263b.g();
        }

        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            return this.f38263b.h(obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(@k Collection<? extends Object> collection) {
            e<T> eVar = this.f38263b;
            eVar.getClass();
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!eVar.h(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public final T get(int i12) {
            f.a(i12, this);
            return this.f38263b.f38260b[i12];
        }

        @Override // java.util.List
        public final int indexOf(Object obj) {
            return this.f38263b.i(obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return this.f38263b.f38262d == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        @k
        public final Iterator<T> iterator() {
            return new c(this, 0);
        }

        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            e<T> eVar = this.f38263b;
            T[] tArr = eVar.f38260b;
            for (int i12 = eVar.f38262d - 1; i12 >= 0; i12--) {
                if (L.f(obj, tArr[i12])) {
                    return i12;
                }
            }
            return -1;
        }

        @Override // java.util.List
        @k
        public final ListIterator<T> listIterator() {
            return new c(this, 0);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            return this.f38263b.j(obj);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(@k Collection<? extends Object> collection) {
            e<T> eVar = this.f38263b;
            eVar.getClass();
            if (collection.isEmpty()) {
                return false;
            }
            int i12 = eVar.f38262d;
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                eVar.j(it.next());
            }
            return i12 != eVar.f38262d;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(@k Collection<? extends Object> collection) {
            e<T> eVar = this.f38263b;
            int i12 = eVar.f38262d;
            for (int i13 = i12 - 1; -1 < i13; i13--) {
                if (!collection.contains(eVar.f38260b[i13])) {
                    eVar.k(i13);
                }
            }
            return i12 != eVar.f38262d;
        }

        @Override // java.util.List
        public final T set(int i12, T t12) {
            f.a(i12, this);
            T[] tArr = this.f38263b.f38260b;
            T t13 = tArr[i12];
            tArr[i12] = t12;
            return t13;
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.f38263b.f38262d;
        }

        @Override // java.util.List
        @k
        public final List<T> subList(int i12, int i13) {
            f.b(i12, i13, this);
            return new b(i12, i13, this);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return C42821v.a(this);
        }

        @Override // java.util.List
        public final void add(int i12, T t12) {
            this.f38263b.a(i12, t12);
        }

        @Override // java.util.List
        @k
        public final ListIterator<T> listIterator(int i12) {
            return new c(this, i12);
        }

        @Override // java.util.List
        public final T remove(int i12) {
            f.a(i12, this);
            return this.f38263b.k(i12);
        }

        @Override // java.util.List, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) C42821v.b(this, tArr);
        }

        @Override // java.util.List
        public final boolean addAll(int i12, @k Collection<? extends T> collection) {
            return this.f38263b.e(i12, collection);
        }
    }

    /* compiled from: MutableVector.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/collection/e$b;", "T", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b<T> implements List<T>, Z41.e {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Object f38264b;

        /* renamed from: c, reason: collision with root package name */
        public final int f38265c;

        /* renamed from: d, reason: collision with root package name */
        public int f38266d;

        public b(int i12, int i13, @k List list) {
            this.f38264b = list;
            this.f38265c = i12;
            this.f38266d = i13;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List, java.util.Collection
        public final boolean add(T t12) {
            int i12 = this.f38266d;
            this.f38266d = i12 + 1;
            this.f38264b.add(i12, t12);
            return true;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final boolean addAll(int i12, @k Collection<? extends T> collection) {
            this.f38264b.addAll(i12 + this.f38265c, collection);
            int size = collection.size();
            this.f38266d += size;
            return size > 0;
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List, java.util.Collection
        public final void clear() {
            int i12 = this.f38266d - 1;
            int i13 = this.f38265c;
            if (i13 <= i12) {
                while (true) {
                    this.f38264b.remove(i12);
                    if (i12 == i13) {
                        break;
                    } else {
                        i12--;
                    }
                }
            }
            this.f38266d = i13;
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List, java.util.Collection
        public final boolean contains(Object obj) {
            int i12 = this.f38266d;
            for (int i13 = this.f38265c; i13 < i12; i13++) {
                if (L.f(this.f38264b.get(i13), obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(@k Collection<? extends Object> collection) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final T get(int i12) {
            f.a(i12, this);
            return (T) this.f38264b.get(i12 + this.f38265c);
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final int indexOf(Object obj) {
            int i12 = this.f38266d;
            int i13 = this.f38265c;
            for (int i14 = i13; i14 < i12; i14++) {
                if (L.f(this.f38264b.get(i14), obj)) {
                    return i14 - i13;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return this.f38266d == this.f38265c;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        @k
        public final Iterator<T> iterator() {
            return new c(this, 0);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final int lastIndexOf(Object obj) {
            int i12 = this.f38266d - 1;
            int i13 = this.f38265c;
            if (i13 > i12) {
                return -1;
            }
            while (!L.f(this.f38264b.get(i12), obj)) {
                if (i12 == i13) {
                    return -1;
                }
                i12--;
            }
            return i12 - i13;
        }

        @Override // java.util.List
        @k
        public final ListIterator<T> listIterator() {
            return new c(this, 0);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List, java.util.Collection
        public final boolean remove(Object obj) {
            int i12 = this.f38266d;
            for (int i13 = this.f38265c; i13 < i12; i13++) {
                ?? r22 = this.f38264b;
                if (L.f(r22.get(i13), obj)) {
                    r22.remove(i13);
                    this.f38266d--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(@k Collection<? extends Object> collection) {
            int i12 = this.f38266d;
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i12 != this.f38266d;
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(@k Collection<? extends Object> collection) {
            int i12 = this.f38266d;
            int i13 = i12 - 1;
            int i14 = this.f38265c;
            if (i14 <= i13) {
                while (true) {
                    ?? r32 = this.f38264b;
                    if (!collection.contains(r32.get(i13))) {
                        r32.remove(i13);
                        this.f38266d--;
                    }
                    if (i13 == i14) {
                        break;
                    }
                    i13--;
                }
            }
            return i12 != this.f38266d;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final T set(int i12, T t12) {
            f.a(i12, this);
            return (T) this.f38264b.set(i12 + this.f38265c, t12);
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.f38266d - this.f38265c;
        }

        @Override // java.util.List
        @k
        public final List<T> subList(int i12, int i13) {
            f.b(i12, i13, this);
            return new b(i12, i13, this);
        }

        @Override // java.util.List, java.util.Collection
        public final Object[] toArray() {
            return C42821v.a(this);
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final void add(int i12, T t12) {
            this.f38264b.add(i12 + this.f38265c, t12);
            this.f38266d++;
        }

        @Override // java.util.List
        @k
        public final ListIterator<T> listIterator(int i12) {
            return new c(this, i12);
        }

        @Override // java.util.List, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) C42821v.b(this, tArr);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List, java.util.Collection
        public final boolean addAll(@k Collection<? extends T> collection) {
            this.f38264b.addAll(this.f38266d, collection);
            int size = collection.size();
            this.f38266d += size;
            return size > 0;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.List
        public final T remove(int i12) {
            f.a(i12, this);
            this.f38266d--;
            return (T) this.f38264b.remove(i12 + this.f38265c);
        }
    }

    /* compiled from: MutableVector.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/collection/e$c;", "T", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c<T> implements ListIterator<T>, Z41.f {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Object f38267b;

        /* renamed from: c, reason: collision with root package name */
        public int f38268c;

        public c(@k List<T> list, int i12) {
            this.f38267b = list;
            this.f38268c = i12;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator
        public final void add(T t12) {
            this.f38267b.add(this.f38268c, t12);
            this.f38268c++;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f38268c < this.f38267b.size();
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f38268c > 0;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator, java.util.Iterator
        public final T next() {
            int i12 = this.f38268c;
            this.f38268c = i12 + 1;
            return (T) this.f38267b.get(i12);
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f38268c;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator
        public final T previous() {
            int i12 = this.f38268c - 1;
            this.f38268c = i12;
            return (T) this.f38267b.get(i12);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f38268c - 1;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            int i12 = this.f38268c - 1;
            this.f38268c = i12;
            this.f38267b.remove(i12);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
        @Override // java.util.ListIterator
        public final void set(T t12) {
            this.f38267b.set(this.f38268c, t12);
        }
    }

    @X
    public e(@k T[] tArr, int i12) {
        this.f38260b = tArr;
        this.f38262d = i12;
    }

    public final void a(int i12, T t12) {
        int i13 = this.f38262d + 1;
        if (this.f38260b.length < i13) {
            m(i13);
        }
        T[] tArr = this.f38260b;
        int i14 = this.f38262d;
        if (i12 != i14) {
            System.arraycopy(tArr, i12, tArr, i12 + 1, i14 - i12);
        }
        tArr[i12] = t12;
        this.f38262d++;
    }

    public final void b(Object obj) {
        int i12 = this.f38262d + 1;
        if (this.f38260b.length < i12) {
            m(i12);
        }
        Object[] objArr = (T[]) this.f38260b;
        int i13 = this.f38262d;
        objArr[i13] = obj;
        this.f38262d = i13 + 1;
    }

    public final void c(int i12, @k e eVar) {
        int i13 = eVar.f38262d;
        if (i13 == 0) {
            return;
        }
        int i14 = this.f38262d + i13;
        if (this.f38260b.length < i14) {
            m(i14);
        }
        T[] tArr = this.f38260b;
        int i15 = this.f38262d;
        if (i12 != i15) {
            System.arraycopy(tArr, i12, tArr, i12 + i13, i15 - i12);
        }
        System.arraycopy(eVar.f38260b, 0, tArr, i12, i13);
        this.f38262d += i13;
    }

    public final void d(int i12, @k List list) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        int i13 = this.f38262d + size;
        if (this.f38260b.length < i13) {
            m(i13);
        }
        Object[] objArr = (T[]) this.f38260b;
        int i14 = this.f38262d;
        if (i12 != i14) {
            System.arraycopy(objArr, i12, objArr, i12 + size, i14 - i12);
        }
        int size2 = list.size();
        for (int i15 = 0; i15 < size2; i15++) {
            objArr[i12 + i15] = list.get(i15);
        }
        this.f38262d += size;
    }

    public final boolean e(int i12, @k Collection<? extends T> collection) {
        int i13 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i14 = this.f38262d + size;
        if (this.f38260b.length < i14) {
            m(i14);
        }
        T[] tArr = this.f38260b;
        int i15 = this.f38262d;
        if (i12 != i15) {
            System.arraycopy(tArr, i12, tArr, i12 + size, i15 - i12);
        }
        for (T t12 : collection) {
            int i16 = i13 + 1;
            if (i13 < 0) {
                C42745f0.H0();
                throw null;
            }
            tArr[i13 + i12] = t12;
            i13 = i16;
        }
        this.f38262d += size;
        return true;
    }

    @k
    public final List<T> f() {
        List<T> list = this.f38261c;
        if (list != null) {
            return list;
        }
        a aVar = new a(this);
        this.f38261c = aVar;
        return aVar;
    }

    public final void g() {
        T[] tArr = this.f38260b;
        int i12 = this.f38262d;
        for (int i13 = 0; i13 < i12; i13++) {
            tArr[i13] = null;
        }
        this.f38262d = 0;
    }

    public final boolean h(T t12) {
        int i12 = this.f38262d - 1;
        if (i12 >= 0) {
            for (int i13 = 0; !L.f(this.f38260b[i13], t12); i13++) {
                if (i13 != i12) {
                }
            }
            return true;
        }
        return false;
    }

    public final int i(T t12) {
        T[] tArr = this.f38260b;
        int i12 = this.f38262d;
        for (int i13 = 0; i13 < i12; i13++) {
            if (L.f(t12, tArr[i13])) {
                return i13;
            }
        }
        return -1;
    }

    public final boolean j(T t12) {
        int i12 = i(t12);
        if (i12 < 0) {
            return false;
        }
        k(i12);
        return true;
    }

    public final T k(int i12) {
        T[] tArr = this.f38260b;
        T t12 = tArr[i12];
        int i13 = this.f38262d;
        if (i12 != i13 - 1) {
            int i14 = i12 + 1;
            System.arraycopy(tArr, i14, tArr, i12, i13 - i14);
        }
        int i15 = this.f38262d - 1;
        this.f38262d = i15;
        tArr[i15] = null;
        return t12;
    }

    public final void l(int i12, int i13) {
        if (i13 > i12) {
            int i14 = this.f38262d;
            if (i13 < i14) {
                T[] tArr = this.f38260b;
                System.arraycopy(tArr, i13, tArr, i12, i14 - i13);
            }
            int i15 = this.f38262d;
            int i16 = i15 - (i13 - i12);
            int i17 = i15 - 1;
            if (i16 <= i17) {
                int i18 = i16;
                while (true) {
                    this.f38260b[i18] = null;
                    if (i18 == i17) {
                        break;
                    } else {
                        i18++;
                    }
                }
            }
            this.f38262d = i16;
        }
    }

    @X
    public final void m(int i12) {
        T[] tArr = this.f38260b;
        int length = tArr.length;
        T[] tArr2 = (T[]) new Object[Math.max(i12, length * 2)];
        System.arraycopy(tArr, 0, tArr2, 0, length);
        this.f38260b = tArr2;
    }

    public final void n(@k Comparator<T> comparator) {
        Arrays.sort(this.f38260b, 0, this.f38262d, comparator);
    }
}
