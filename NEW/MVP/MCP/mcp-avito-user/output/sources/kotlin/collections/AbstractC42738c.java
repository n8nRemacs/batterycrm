package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.InterfaceC42733c0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AbstractList.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0007\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0004\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lkotlin/collections/c;", "E", "Lkotlin/collections/a;", "", "<init>", "()V", "a", "b", "c", "d", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42733c0
/* renamed from: kotlin.collections.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC42738c<E> extends AbstractC42734a<E> implements List<E>, Z41.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f406712b = new a(null);

    /* compiled from: AbstractList.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/collections/c$a;", "", "<init>", "()V", "", "maxArraySize", "I", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.collections.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public static void a(int i12, int i13) {
            if (i12 < 0 || i12 >= i13) {
                throw new IndexOutOfBoundsException(androidx.compose.foundation.H.j(i12, i13, "index: ", ", size: "));
            }
        }

        public static void b(int i12, int i13) {
            if (i12 < 0 || i12 > i13) {
                throw new IndexOutOfBoundsException(androidx.compose.foundation.H.j(i12, i13, "index: ", ", size: "));
            }
        }

        public static void c(int i12, int i13, int i14) {
            if (i12 < 0 || i13 > i14) {
                StringBuilder sbY = androidx.appcompat.app.r.y(i12, i13, "fromIndex: ", ", toIndex: ", ", size: ");
                sbY.append(i14);
                throw new IndexOutOfBoundsException(sbY.toString());
            }
            if (i12 > i13) {
                throw new IllegalArgumentException(androidx.compose.foundation.H.j(i12, i13, "fromIndex: ", " > toIndex: "));
            }
        }

        public static int d(int i12, int i13) {
            int i14 = i12 + (i12 >> 1);
            if (i14 - i13 < 0) {
                i14 = i13;
            }
            return i14 - 2147483639 > 0 ? i13 > 2147483639 ? Integer.MAX_VALUE : 2147483639 : i14;
        }

        public a() {
        }
    }

    /* compiled from: AbstractList.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0000\b\u0092\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/collections/c$b;", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.collections.c$b */
    public class b implements Iterator<E>, Z41.a {

        /* renamed from: b, reason: collision with root package name */
        public int f406713b;

        public b() {
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f406713b < AbstractC42738c.this.getF406718e();
        }

        @Override // java.util.Iterator
        public final E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i12 = this.f406713b;
            this.f406713b = i12 + 1;
            return AbstractC42738c.this.get(i12);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* compiled from: AbstractList.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010*\n\u0000\b\u0092\u0004\u0018\u00002\f0\u0001R\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/collections/c$c;", "Lkotlin/collections/c$b;", "Lkotlin/collections/c;", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.collections.c$c, reason: collision with other inner class name */
    public class C11632c extends AbstractC42738c<E>.b implements ListIterator<E>, Z41.a {
        public C11632c(int i12) {
            super();
            a aVar = AbstractC42738c.f406712b;
            int f406718e = AbstractC42738c.this.getF406718e();
            aVar.getClass();
            a.b(i12, f406718e);
            this.f406713b = i12;
        }

        @Override // java.util.ListIterator
        public final void add(E e12) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.f406713b > 0;
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f406713b;
        }

        @Override // java.util.ListIterator
        public final E previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            int i12 = this.f406713b - 1;
            this.f406713b = i12;
            return AbstractC42738c.this.get(i12);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f406713b - 1;
        }

        @Override // java.util.ListIterator
        public final void set(E e12) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* compiled from: AbstractList.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/collections/c$d;", "E", "Lkotlin/collections/c;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.collections.c$d */
    public static final class d<E> extends AbstractC42738c<E> implements RandomAccess {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final AbstractC42738c<E> f406716c;

        /* renamed from: d, reason: collision with root package name */
        public final int f406717d;

        /* renamed from: e, reason: collision with root package name */
        public final int f406718e;

        /* JADX WARN: Multi-variable type inference failed */
        public d(@Y61.k AbstractC42738c<? extends E> abstractC42738c, int i12, int i13) {
            this.f406716c = abstractC42738c;
            this.f406717d = i12;
            int f406718e = abstractC42738c.getF406718e();
            AbstractC42738c.f406712b.getClass();
            a.c(i12, i13, f406718e);
            this.f406718e = i13 - i12;
        }

        @Override // kotlin.collections.AbstractC42738c, java.util.List
        public final E get(int i12) {
            int i13 = this.f406718e;
            AbstractC42738c.f406712b.getClass();
            a.a(i12, i13);
            return this.f406716c.get(this.f406717d + i12);
        }

        @Override // kotlin.collections.AbstractC42734a
        /* renamed from: getSize, reason: from getter */
        public final int getF406718e() {
            return this.f406718e;
        }
    }

    @Override // java.util.List
    public final void add(int i12, E e12) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i12, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(@Y61.l Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Collection collection = (Collection) obj;
        f406712b.getClass();
        if (size() == collection.size()) {
            Iterator<E> it = collection.iterator();
            Iterator<E> it2 = iterator();
            while (it2.hasNext()) {
                if (!kotlin.jvm.internal.L.f(it2.next(), it.next())) {
                }
            }
            return true;
        }
        return false;
    }

    public abstract E get(int i12);

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        f406712b.getClass();
        Iterator<E> it = iterator();
        int iHashCode = 1;
        while (it.hasNext()) {
            E next = it.next();
            iHashCode = (iHashCode * 31) + (next != null ? next.hashCode() : 0);
        }
        return iHashCode;
    }

    public int indexOf(E e12) {
        Iterator<E> it = iterator();
        int i12 = 0;
        while (it.hasNext()) {
            if (kotlin.jvm.internal.L.f(it.next(), e12)) {
                return i12;
            }
            i12++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    @Y61.k
    public Iterator<E> iterator() {
        return new b();
    }

    public int lastIndexOf(E e12) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (kotlin.jvm.internal.L.f(listIterator.previous(), e12)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Y61.k
    public ListIterator<E> listIterator() {
        return new C11632c(0);
    }

    @Override // java.util.List
    public final E remove(int i12) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final E set(int i12, E e12) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Y61.k
    public List<E> subList(int i12, int i13) {
        return new d(this, i12, i13);
    }

    @Y61.k
    public ListIterator<E> listIterator(int i12) {
        return new C11632c(i12);
    }
}
