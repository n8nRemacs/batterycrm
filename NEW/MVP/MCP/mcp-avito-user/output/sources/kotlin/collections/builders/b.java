package kotlin.collections.builders;

import Y61.k;
import Y61.l;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.collections.AbstractC42738c;
import kotlin.collections.AbstractC42744f;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ListBuilder.kt */
@s0
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\u00060\u0006j\u0002`\u0007:\u0003\u000b\f\rJ\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lkotlin/collections/builders/b;", "E", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Lkotlin/collections/f;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "()Ljava/lang/Object;", "a", "b", "c", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class b<E> extends AbstractC42744f<E> implements List<E>, RandomAccess, Serializable, Z41.e {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final b f406666e;

    /* renamed from: b, reason: collision with root package name */
    @k
    public E[] f406667b;

    /* renamed from: c, reason: collision with root package name */
    public int f406668c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f406669d;

    /* compiled from: ListBuilder.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00010\u00052\u00060\u0006j\u0002`\u0007:\u0001\u000bJ\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lkotlin/collections/builders/b$a;", "E", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Lkotlin/collections/f;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "()Ljava/lang/Object;", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a<E> extends AbstractC42744f<E> implements List<E>, RandomAccess, Serializable, Z41.e {

        /* renamed from: b, reason: collision with root package name */
        @k
        public E[] f406670b;

        /* renamed from: c, reason: collision with root package name */
        public final int f406671c;

        /* renamed from: d, reason: collision with root package name */
        public int f406672d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final a<E> f406673e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final b<E> f406674f;

        /* compiled from: ListBuilder.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/collections/builders/b$a$a;", "E", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: kotlin.collections.builders.b$a$a, reason: collision with other inner class name */
        public static final class C11629a<E> implements ListIterator<E>, Z41.f {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final a<E> f406675b;

            /* renamed from: c, reason: collision with root package name */
            public int f406676c;

            /* renamed from: d, reason: collision with root package name */
            public int f406677d = -1;

            /* renamed from: e, reason: collision with root package name */
            public int f406678e;

            public C11629a(@k a<E> aVar, int i12) {
                this.f406675b = aVar;
                this.f406676c = i12;
                this.f406678e = ((AbstractList) aVar).modCount;
            }

            public final void a() {
                if (((AbstractList) this.f406675b.f406674f).modCount != this.f406678e) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.ListIterator
            public final void add(E e12) {
                a();
                int i12 = this.f406676c;
                this.f406676c = i12 + 1;
                a<E> aVar = this.f406675b;
                aVar.add(i12, e12);
                this.f406677d = -1;
                this.f406678e = ((AbstractList) aVar).modCount;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final boolean hasNext() {
                return this.f406676c < this.f406675b.f406672d;
            }

            @Override // java.util.ListIterator
            public final boolean hasPrevious() {
                return this.f406676c > 0;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final E next() {
                a();
                int i12 = this.f406676c;
                a<E> aVar = this.f406675b;
                if (i12 >= aVar.f406672d) {
                    throw new NoSuchElementException();
                }
                this.f406676c = i12 + 1;
                this.f406677d = i12;
                return aVar.f406670b[aVar.f406671c + i12];
            }

            @Override // java.util.ListIterator
            public final int nextIndex() {
                return this.f406676c;
            }

            @Override // java.util.ListIterator
            public final E previous() {
                a();
                int i12 = this.f406676c;
                if (i12 <= 0) {
                    throw new NoSuchElementException();
                }
                int i13 = i12 - 1;
                this.f406676c = i13;
                this.f406677d = i13;
                a<E> aVar = this.f406675b;
                return aVar.f406670b[aVar.f406671c + i13];
            }

            @Override // java.util.ListIterator
            public final int previousIndex() {
                return this.f406676c - 1;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final void remove() {
                a();
                int i12 = this.f406677d;
                if (i12 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                a<E> aVar = this.f406675b;
                aVar.a(i12);
                this.f406676c = this.f406677d;
                this.f406677d = -1;
                this.f406678e = ((AbstractList) aVar).modCount;
            }

            @Override // java.util.ListIterator
            public final void set(E e12) {
                a();
                int i12 = this.f406677d;
                if (i12 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                this.f406675b.set(i12, e12);
            }
        }

        public a(@k E[] eArr, int i12, int i13, @l a<E> aVar, @k b<E> bVar) {
            this.f406670b = eArr;
            this.f406671c = i12;
            this.f406672d = i13;
            this.f406673e = aVar;
            this.f406674f = bVar;
            ((AbstractList) this).modCount = ((AbstractList) bVar).modCount;
        }

        private final Object writeReplace() throws NotSerializableException {
            if (this.f406674f.f406669d) {
                return new h(0, this);
            }
            throw new NotSerializableException("The list cannot be serialized while it is being built.");
        }

        @Override // kotlin.collections.AbstractC42744f
        public final E a(int i12) {
            h();
            g();
            AbstractC42738c.a aVar = AbstractC42738c.f406712b;
            int i13 = this.f406672d;
            aVar.getClass();
            AbstractC42738c.a.a(i12, i13);
            return l(this.f406671c + i12);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean add(E e12) {
            h();
            g();
            e(this.f406671c + this.f406672d, e12);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean addAll(@k Collection<? extends E> collection) {
            h();
            g();
            int size = collection.size();
            d(this.f406671c + this.f406672d, collection, size);
            return size > 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final void clear() {
            h();
            g();
            r(this.f406671c, this.f406672d);
        }

        public final void d(int i12, Collection<? extends E> collection, int i13) {
            ((AbstractList) this).modCount++;
            b<E> bVar = this.f406674f;
            a<E> aVar = this.f406673e;
            if (aVar != null) {
                aVar.d(i12, collection, i13);
            } else {
                b bVar2 = b.f406666e;
                bVar.d(i12, collection, i13);
            }
            this.f406670b = bVar.f406667b;
            this.f406672d += i13;
        }

        public final void e(int i12, E e12) {
            ((AbstractList) this).modCount++;
            b<E> bVar = this.f406674f;
            a<E> aVar = this.f406673e;
            if (aVar != null) {
                aVar.e(i12, e12);
            } else {
                b bVar2 = b.f406666e;
                bVar.e(i12, e12);
            }
            this.f406670b = bVar.f406667b;
            this.f406672d++;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final boolean equals(@l Object obj) {
            g();
            if (obj != this) {
                if (obj instanceof List) {
                    if (kotlin.collections.builders.c.a(this.f406670b, this.f406671c, this.f406672d, (List) obj)) {
                    }
                }
                return false;
            }
            return true;
        }

        public final void g() {
            if (((AbstractList) this.f406674f).modCount != ((AbstractList) this).modCount) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.AbstractList, java.util.List
        public final E get(int i12) {
            g();
            AbstractC42738c.a aVar = AbstractC42738c.f406712b;
            int i13 = this.f406672d;
            aVar.getClass();
            AbstractC42738c.a.a(i12, i13);
            return this.f406670b[this.f406671c + i12];
        }

        @Override // kotlin.collections.AbstractC42744f
        /* renamed from: getSize */
        public final int getF38308i() {
            g();
            return this.f406672d;
        }

        public final void h() {
            if (this.f406674f.f406669d) {
                throw new UnsupportedOperationException();
            }
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final int hashCode() {
            g();
            E[] eArr = this.f406670b;
            int i12 = this.f406672d;
            int iHashCode = 1;
            for (int i13 = 0; i13 < i12; i13++) {
                E e12 = eArr[this.f406671c + i13];
                iHashCode = (iHashCode * 31) + (e12 != null ? e12.hashCode() : 0);
            }
            return iHashCode;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int indexOf(Object obj) {
            g();
            for (int i12 = 0; i12 < this.f406672d; i12++) {
                if (L.f(this.f406670b[this.f406671c + i12], obj)) {
                    return i12;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            g();
            return this.f406672d == 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        @k
        public final Iterator<E> iterator() {
            return listIterator(0);
        }

        public final E l(int i12) {
            E eL2;
            ((AbstractList) this).modCount++;
            a<E> aVar = this.f406673e;
            if (aVar != null) {
                eL2 = aVar.l(i12);
            } else {
                b bVar = b.f406666e;
                eL2 = this.f406674f.l(i12);
            }
            this.f406672d--;
            return eL2;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int lastIndexOf(Object obj) {
            g();
            for (int i12 = this.f406672d - 1; i12 >= 0; i12--) {
                if (L.f(this.f406670b[this.f406671c + i12], obj)) {
                    return i12;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        @k
        public final ListIterator<E> listIterator() {
            return listIterator(0);
        }

        public final void r(int i12, int i13) {
            if (i13 > 0) {
                ((AbstractList) this).modCount++;
            }
            a<E> aVar = this.f406673e;
            if (aVar != null) {
                aVar.r(i12, i13);
            } else {
                b bVar = b.f406666e;
                this.f406674f.r(i12, i13);
            }
            this.f406672d -= i13;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean remove(Object obj) {
            h();
            g();
            int iIndexOf = indexOf(obj);
            if (iIndexOf >= 0) {
                a(iIndexOf);
            }
            return iIndexOf >= 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean removeAll(@k Collection<? extends Object> collection) {
            h();
            g();
            return s(this.f406671c, this.f406672d, collection, false) > 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean retainAll(@k Collection<? extends Object> collection) {
            h();
            g();
            return s(this.f406671c, this.f406672d, collection, true) > 0;
        }

        public final int s(int i12, int i13, Collection<? extends E> collection, boolean z12) {
            int iS2;
            a<E> aVar = this.f406673e;
            if (aVar != null) {
                iS2 = aVar.s(i12, i13, collection, z12);
            } else {
                b bVar = b.f406666e;
                iS2 = this.f406674f.s(i12, i13, collection, z12);
            }
            if (iS2 > 0) {
                ((AbstractList) this).modCount++;
            }
            this.f406672d -= iS2;
            return iS2;
        }

        @Override // java.util.AbstractList, java.util.List
        public final E set(int i12, E e12) {
            h();
            g();
            AbstractC42738c.a aVar = AbstractC42738c.f406712b;
            int i13 = this.f406672d;
            aVar.getClass();
            AbstractC42738c.a.a(i12, i13);
            E[] eArr = this.f406670b;
            int i14 = this.f406671c + i12;
            E e13 = eArr[i14];
            eArr[i14] = e12;
            return e13;
        }

        @Override // java.util.AbstractList, java.util.List
        @k
        public final List<E> subList(int i12, int i13) {
            AbstractC42738c.a aVar = AbstractC42738c.f406712b;
            int i14 = this.f406672d;
            aVar.getClass();
            AbstractC42738c.a.c(i12, i13, i14);
            return new a(this.f406670b, this.f406671c + i12, i13 - i12, this, this.f406674f);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        @k
        public final <T> T[] toArray(@k T[] tArr) {
            g();
            int length = tArr.length;
            int i12 = this.f406672d;
            int i13 = this.f406671c;
            if (length < i12) {
                return (T[]) Arrays.copyOfRange(this.f406670b, i13, i12 + i13, tArr.getClass());
            }
            C42756l.o(this.f406670b, 0, tArr, i13, i12 + i13);
            int i14 = this.f406672d;
            if (i14 < tArr.length) {
                tArr[i14] = null;
            }
            return tArr;
        }

        @Override // java.util.AbstractCollection
        @k
        public final String toString() {
            g();
            return kotlin.collections.builders.c.b(this.f406670b, this.f406671c, this.f406672d, this);
        }

        @Override // java.util.AbstractList, java.util.List
        @k
        public final ListIterator<E> listIterator(int i12) {
            g();
            AbstractC42738c.a aVar = AbstractC42738c.f406712b;
            int i13 = this.f406672d;
            aVar.getClass();
            AbstractC42738c.a.b(i12, i13);
            return new C11629a(this, i12);
        }

        @Override // java.util.AbstractList, java.util.List
        public final void add(int i12, E e12) {
            h();
            g();
            AbstractC42738c.a aVar = AbstractC42738c.f406712b;
            int i13 = this.f406672d;
            aVar.getClass();
            AbstractC42738c.a.b(i12, i13);
            e(this.f406671c + i12, e12);
        }

        @Override // java.util.AbstractList, java.util.List
        public final boolean addAll(int i12, @k Collection<? extends E> collection) {
            h();
            g();
            AbstractC42738c.a aVar = AbstractC42738c.f406712b;
            int i13 = this.f406672d;
            aVar.getClass();
            AbstractC42738c.a.b(i12, i13);
            int size = collection.size();
            d(this.f406671c + i12, collection, size);
            return size > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        @k
        public final Object[] toArray() {
            g();
            E[] eArr = this.f406670b;
            int i12 = this.f406672d;
            int i13 = this.f406671c;
            return C42756l.w(i13, i12 + i13, eArr);
        }
    }

    /* compiled from: ListBuilder.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlin/collections/builders/b$b;", "", "<init>", "()V", "Lkotlin/collections/builders/b;", "", "Empty", "Lkotlin/collections/builders/b;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.collections.builders.b$b, reason: collision with other inner class name */
    public static final class C11630b {
        public /* synthetic */ C11630b(C42822w c42822w) {
            this();
        }

        public C11630b() {
        }
    }

    /* compiled from: ListBuilder.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/collections/builders/b$c;", "E", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c<E> implements ListIterator<E>, Z41.f {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final b<E> f406679b;

        /* renamed from: c, reason: collision with root package name */
        public int f406680c;

        /* renamed from: d, reason: collision with root package name */
        public int f406681d = -1;

        /* renamed from: e, reason: collision with root package name */
        public int f406682e;

        public c(@k b<E> bVar, int i12) {
            this.f406679b = bVar;
            this.f406680c = i12;
            this.f406682e = ((AbstractList) bVar).modCount;
        }

        public final void a() {
            if (((AbstractList) this.f406679b).modCount != this.f406682e) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        public final void add(E e12) {
            a();
            int i12 = this.f406680c;
            this.f406680c = i12 + 1;
            b<E> bVar = this.f406679b;
            bVar.add(i12, e12);
            this.f406681d = -1;
            this.f406682e = ((AbstractList) bVar).modCount;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.f406680c < this.f406679b.f406668c;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f406680c > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final E next() {
            a();
            int i12 = this.f406680c;
            b<E> bVar = this.f406679b;
            if (i12 >= bVar.f406668c) {
                throw new NoSuchElementException();
            }
            this.f406680c = i12 + 1;
            this.f406681d = i12;
            return bVar.f406667b[i12];
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f406680c;
        }

        @Override // java.util.ListIterator
        public final E previous() {
            a();
            int i12 = this.f406680c;
            if (i12 <= 0) {
                throw new NoSuchElementException();
            }
            int i13 = i12 - 1;
            this.f406680c = i13;
            this.f406681d = i13;
            return this.f406679b.f406667b[i13];
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f406680c - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            a();
            int i12 = this.f406681d;
            if (i12 == -1) {
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
            }
            b<E> bVar = this.f406679b;
            bVar.a(i12);
            this.f406680c = this.f406681d;
            this.f406681d = -1;
            this.f406682e = ((AbstractList) bVar).modCount;
        }

        @Override // java.util.ListIterator
        public final void set(E e12) {
            a();
            int i12 = this.f406681d;
            if (i12 == -1) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
            }
            this.f406679b.set(i12, e12);
        }
    }

    static {
        new C11630b(null);
        b bVar = new b(0);
        bVar.f406669d = true;
        f406666e = bVar;
    }

    public b() {
        this(0, 1, null);
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.f406669d) {
            return new h(0, this);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // kotlin.collections.AbstractC42744f
    public final E a(int i12) {
        g();
        AbstractC42738c.a aVar = AbstractC42738c.f406712b;
        int i13 = this.f406668c;
        aVar.getClass();
        AbstractC42738c.a.a(i12, i13);
        return l(i12);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e12) {
        g();
        int i12 = this.f406668c;
        ((AbstractList) this).modCount++;
        h(i12, 1);
        this.f406667b[i12] = e12;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(@k Collection<? extends E> collection) {
        g();
        int size = collection.size();
        d(this.f406668c, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        g();
        r(0, this.f406668c);
    }

    public final void d(int i12, Collection<? extends E> collection, int i13) {
        ((AbstractList) this).modCount++;
        h(i12, i13);
        Iterator<? extends E> it = collection.iterator();
        for (int i14 = 0; i14 < i13; i14++) {
            this.f406667b[i12 + i14] = it.next();
        }
    }

    public final void e(int i12, E e12) {
        ((AbstractList) this).modCount++;
        h(i12, 1);
        this.f406667b[i12] = e12;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(@l Object obj) {
        if (obj != this) {
            if (!(obj instanceof List)) {
                return false;
            }
            if (!kotlin.collections.builders.c.a(this.f406667b, 0, this.f406668c, (List) obj)) {
                return false;
            }
        }
        return true;
    }

    public final void g() {
        if (this.f406669d) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i12) {
        AbstractC42738c.a aVar = AbstractC42738c.f406712b;
        int i13 = this.f406668c;
        aVar.getClass();
        AbstractC42738c.a.a(i12, i13);
        return this.f406667b[i12];
    }

    @Override // kotlin.collections.AbstractC42744f
    /* renamed from: getSize, reason: from getter */
    public final int getF38308i() {
        return this.f406668c;
    }

    public final void h(int i12, int i13) {
        int i14 = this.f406668c + i13;
        if (i14 < 0) {
            throw new OutOfMemoryError();
        }
        E[] eArr = this.f406667b;
        if (i14 > eArr.length) {
            AbstractC42738c.a aVar = AbstractC42738c.f406712b;
            int length = eArr.length;
            aVar.getClass();
            this.f406667b = (E[]) Arrays.copyOf(this.f406667b, AbstractC42738c.a.d(length, i14));
        }
        E[] eArr2 = this.f406667b;
        C42756l.o(eArr2, i12 + i13, eArr2, i12, this.f406668c);
        this.f406668c += i13;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        E[] eArr = this.f406667b;
        int i12 = this.f406668c;
        int iHashCode = 1;
        for (int i13 = 0; i13 < i12; i13++) {
            E e12 = eArr[i13];
            iHashCode = (iHashCode * 31) + (e12 != null ? e12.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i12 = 0; i12 < this.f406668c; i12++) {
            if (L.f(this.f406667b[i12], obj)) {
                return i12;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f406668c == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @k
    public final Iterator<E> iterator() {
        return listIterator(0);
    }

    public final E l(int i12) {
        ((AbstractList) this).modCount++;
        E[] eArr = this.f406667b;
        E e12 = eArr[i12];
        C42756l.o(eArr, i12, eArr, i12 + 1, this.f406668c);
        E[] eArr2 = this.f406667b;
        int i13 = this.f406668c;
        eArr2[i13 - 1] = null;
        this.f406668c = i13 - 1;
        return e12;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i12 = this.f406668c - 1; i12 >= 0; i12--) {
            if (L.f(this.f406667b[i12], obj)) {
                return i12;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    @k
    public final ListIterator<E> listIterator() {
        return listIterator(0);
    }

    public final void r(int i12, int i13) {
        if (i13 > 0) {
            ((AbstractList) this).modCount++;
        }
        E[] eArr = this.f406667b;
        C42756l.o(eArr, i12, eArr, i12 + i13, this.f406668c);
        E[] eArr2 = this.f406667b;
        int i14 = this.f406668c;
        kotlin.collections.builders.c.c(i14 - i13, i14, eArr2);
        this.f406668c -= i13;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        g();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            a(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(@k Collection<? extends Object> collection) {
        g();
        return s(0, this.f406668c, collection, false) > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(@k Collection<? extends Object> collection) {
        g();
        return s(0, this.f406668c, collection, true) > 0;
    }

    public final int s(int i12, int i13, Collection<? extends E> collection, boolean z12) {
        int i14 = 0;
        int i15 = 0;
        while (i14 < i13) {
            int i16 = i12 + i14;
            if (collection.contains(this.f406667b[i16]) == z12) {
                E[] eArr = this.f406667b;
                i14++;
                eArr[i15 + i12] = eArr[i16];
                i15++;
            } else {
                i14++;
            }
        }
        int i17 = i13 - i15;
        E[] eArr2 = this.f406667b;
        C42756l.o(eArr2, i12 + i15, eArr2, i13 + i12, this.f406668c);
        E[] eArr3 = this.f406667b;
        int i18 = this.f406668c;
        kotlin.collections.builders.c.c(i18 - i17, i18, eArr3);
        if (i17 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f406668c -= i17;
        return i17;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i12, E e12) {
        g();
        AbstractC42738c.a aVar = AbstractC42738c.f406712b;
        int i13 = this.f406668c;
        aVar.getClass();
        AbstractC42738c.a.a(i12, i13);
        E[] eArr = this.f406667b;
        E e13 = eArr[i12];
        eArr[i12] = e12;
        return e13;
    }

    @Override // java.util.AbstractList, java.util.List
    @k
    public final List<E> subList(int i12, int i13) {
        AbstractC42738c.a aVar = AbstractC42738c.f406712b;
        int i14 = this.f406668c;
        aVar.getClass();
        AbstractC42738c.a.c(i12, i13, i14);
        return new a(this.f406667b, i12, i13 - i12, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @k
    public final <T> T[] toArray(@k T[] tArr) {
        int length = tArr.length;
        int i12 = this.f406668c;
        if (length < i12) {
            return (T[]) Arrays.copyOfRange(this.f406667b, 0, i12, tArr.getClass());
        }
        C42756l.o(this.f406667b, 0, tArr, 0, i12);
        int i13 = this.f406668c;
        if (i13 < tArr.length) {
            tArr[i13] = null;
        }
        return tArr;
    }

    @Override // java.util.AbstractCollection
    @k
    public final String toString() {
        return kotlin.collections.builders.c.b(this.f406667b, 0, this.f406668c, this);
    }

    public b(int i12) {
        if (i12 < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        this.f406667b = (E[]) new Object[i12];
    }

    @Override // java.util.AbstractList, java.util.List
    @k
    public final ListIterator<E> listIterator(int i12) {
        AbstractC42738c.a aVar = AbstractC42738c.f406712b;
        int i13 = this.f406668c;
        aVar.getClass();
        AbstractC42738c.a.b(i12, i13);
        return new c(this, i12);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i12, @k Collection<? extends E> collection) {
        g();
        AbstractC42738c.a aVar = AbstractC42738c.f406712b;
        int i13 = this.f406668c;
        aVar.getClass();
        AbstractC42738c.a.b(i12, i13);
        int size = collection.size();
        d(i12, collection, size);
        return size > 0;
    }

    public /* synthetic */ b(int i12, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? 10 : i12);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i12, E e12) {
        g();
        AbstractC42738c.a aVar = AbstractC42738c.f406712b;
        int i13 = this.f406668c;
        aVar.getClass();
        AbstractC42738c.a.b(i12, i13);
        ((AbstractList) this).modCount++;
        h(i12, 1);
        this.f406667b[i12] = e12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @k
    public final Object[] toArray() {
        return C42756l.w(0, this.f406668c, this.f406667b);
    }
}
