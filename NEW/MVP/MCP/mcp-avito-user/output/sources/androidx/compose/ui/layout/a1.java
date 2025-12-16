package androidx.compose.ui.layout;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.jvm.internal.C42821v;
import kotlin.jvm.internal.C42822w;

/* compiled from: SubcomposeLayout.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/layout/a1;", "", "a", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface a1 {

    /* compiled from: SubcomposeLayout.kt */
    @androidx.compose.runtime.internal.P
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/a1$a;", "", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Collection<Object>, Z41.a {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final androidx.collection.P0<Object> f40438b;

        public a() {
            this(null, 1, null);
        }

        @Override // java.util.Collection
        public final boolean add(Object obj) {
            return this.f40438b.b(obj);
        }

        @Override // java.util.Collection
        public final boolean addAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public final void clear() {
            this.f40438b.d();
        }

        @Override // java.util.Collection
        public final boolean contains(@Y61.l Object obj) {
            return this.f40438b.a(obj);
        }

        @Override // java.util.Collection
        public final boolean containsAll(@Y61.k Collection<? extends Object> collection) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!this.f40438b.a(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public final boolean isEmpty() {
            return this.f40438b.f25699g == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        @Y61.k
        public final Iterator<Object> iterator() {
            return this.f40438b.c().iterator();
        }

        @Override // java.util.Collection
        public final boolean remove(@Y61.l Object obj) {
            return this.f40438b.h(obj);
        }

        @Override // java.util.Collection
        public final boolean removeAll(@Y61.k Collection<? extends Object> collection) {
            return this.f40438b.h(collection);
        }

        @Override // java.util.Collection
        public final boolean removeIf(Predicate<? super Object> predicate) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public final boolean retainAll(@Y61.k Collection<? extends Object> collection) {
            return this.f40438b.j(collection);
        }

        @Override // java.util.Collection
        public final int size() {
            return this.f40438b.f25699g;
        }

        @Override // java.util.Collection
        public final Object[] toArray() {
            return C42821v.a(this);
        }

        public a(androidx.collection.P0 p02, int i12, C42822w c42822w) {
            int i13 = 1;
            if ((i12 & 1) != 0) {
                int i14 = androidx.collection.e1.f25701a;
                p02 = new androidx.collection.P0(0, i13, null);
            }
            this.f40438b = p02;
        }

        @Override // java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) C42821v.b(this, tArr);
        }
    }

    void a(@Y61.k a aVar);

    boolean b(@Y61.l Object obj, @Y61.l Object obj2);
}
