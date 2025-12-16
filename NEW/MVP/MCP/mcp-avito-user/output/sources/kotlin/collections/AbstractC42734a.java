package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import kotlin.InterfaceC42733c0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42821v;

/* compiled from: AbstractCollection.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0003\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/collections/a;", "E", "", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42733c0
/* renamed from: kotlin.collections.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC42734a<E> implements Collection<E>, Z41.a {

    /* compiled from: AbstractCollection.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002 \u00012\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "E", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.collections.a$a, reason: collision with other inner class name */
    public static final class C11628a extends kotlin.jvm.internal.N implements Y41.l<E, CharSequence> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ AbstractC42734a<E> f406656l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C11628a(AbstractC42734a<? extends E> abstractC42734a) {
            super(1);
            this.f406656l = abstractC42734a;
        }

        @Override // Y41.l
        public final CharSequence invoke(Object obj) {
            return obj == this.f406656l ? "(this Collection)" : String.valueOf(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean add(E e12) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean contains(E e12) {
        if (isEmpty()) {
            return false;
        }
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.L.f(it.next(), e12)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.List
    public boolean containsAll(@Y61.k Collection<? extends Object> collection) {
        Collection<? extends Object> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: getSize */
    public abstract int getF38291e();

    @Override // java.util.Collection
    public boolean isEmpty() {
        return getF38291e() == 0;
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return getF38291e();
    }

    @Override // java.util.Collection
    @Y61.k
    public Object[] toArray() {
        return C42821v.a(this);
    }

    @Y61.k
    public final String toString() {
        return C42745f0.O(this, ", ", "[", "]", new C11628a(this), 24);
    }

    @Override // java.util.Collection
    @Y61.k
    public <T> T[] toArray(@Y61.k T[] tArr) {
        return (T[]) C42821v.b(this, tArr);
    }
}
