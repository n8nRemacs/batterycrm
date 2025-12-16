package androidx.compose.runtime.snapshots;

import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C42821v;

/* compiled from: SnapshotStateMap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0000\b\"\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/snapshots/A;", "K", "V", "E", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
abstract class A<K, V, E> implements Set<E>, Z41.h {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final F<K, V> f38611b;

    public A(@Y61.k F<K, V> f12) {
        this.f38611b = f12;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f38611b.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f38611b.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f38611b.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return C42821v.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) C42821v.b(this, tArr);
    }
}
