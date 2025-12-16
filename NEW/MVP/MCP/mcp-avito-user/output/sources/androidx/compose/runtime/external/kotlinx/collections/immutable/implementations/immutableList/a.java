package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.internal.P;
import java.util.ListIterator;
import kotlin.Metadata;

/* compiled from: AbstractListIterator.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010*\n\u0000\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/a;", "E", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class a<E> implements ListIterator<E>, Z41.a {

    /* renamed from: b, reason: collision with root package name */
    public int f38292b;

    /* renamed from: c, reason: collision with root package name */
    public int f38293c;

    public a(int i12, int i13) {
        this.f38292b = i12;
        this.f38293c = i13;
    }

    @Override // java.util.ListIterator
    public void add(E e12) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f38292b < this.f38293c;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f38292b > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public E next() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f38292b;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f38292b - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(E e12) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
