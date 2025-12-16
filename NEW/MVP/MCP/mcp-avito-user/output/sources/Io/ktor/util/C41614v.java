package io.ktor.util;

import io.ktor.util.S;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C42821v;

/* compiled from: CaseInsensitiveSet.kt */
@InterfaceC41603j0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lio/ktor/util/v;", "", "", "<init>", "()V", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: io.ktor.util.v, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41614v implements Set<String>, Z41.h {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C41613u<Boolean> f400551b = new C41613u<>();

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        String str = (String) obj;
        C41613u<Boolean> c41613u = this.f400551b;
        if (c41613u.containsKey(str)) {
            return false;
        }
        c41613u.put(str, Boolean.TRUE);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(@Y61.k Collection<? extends String> collection) {
        boolean z12 = false;
        for (String str : collection) {
            C41613u<Boolean> c41613u = this.f400551b;
            if (!c41613u.containsKey(str)) {
                c41613u.put(str, Boolean.TRUE);
                z12 = true;
            }
        }
        return z12;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f400551b.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return this.f400551b.containsKey((String) obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(@Y61.k Collection<? extends Object> collection) {
        return ((S) this.f400551b.keySet()).containsAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f400551b.f400550b.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    @Y61.k
    public final Iterator<String> iterator() {
        return new S.a((S) this.f400551b.keySet());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return kotlin.jvm.internal.L.f(this.f400551b.remove((String) obj), Boolean.TRUE);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(@Y61.k Collection<? extends Object> collection) {
        return ((S) this.f400551b.keySet()).removeAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(@Y61.k Collection<? extends Object> collection) {
        return ((S) this.f400551b.keySet()).retainAll(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f400551b.f400550b.size();
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
