package dagger.internal;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: LazyClassKeyMap.java */
/* loaded from: classes8.dex */
public final class n<V> implements Map<Class<?>, V> {

    /* compiled from: LazyClassKeyMap.java */
    public static class a<V> implements h<Map<Class<?>, V>> {
        @Override // javax.inject.Provider
        public final Object get() {
            throw null;
        }
    }

    /* compiled from: LazyClassKeyMap.java */
    public static class b<V> implements h<Map<Class<?>, u<V>>> {
        @Override // javax.inject.Provider
        public final Object get() {
            throw null;
        }
    }

    public n() {
        throw null;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof Class)) {
            throw new IllegalArgumentException("Key must be a class");
        }
        ((Class) obj).getName();
        throw null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        throw null;
    }

    @Override // java.util.Map
    public final Set<Map.Entry<Class<?>, V>> entrySet() {
        throw new UnsupportedOperationException("Maps created with @LazyClassKey do not support usage of entrySet(). Consider @ClassKey instead.");
    }

    @Override // java.util.Map
    public final V get(Object obj) {
        if (!(obj instanceof Class)) {
            throw new IllegalArgumentException("Key must be a class");
        }
        ((Class) obj).getName();
        throw null;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        throw null;
    }

    @Override // java.util.Map
    public final Set<Class<?>> keySet() {
        throw new UnsupportedOperationException("Maps created with @LazyClassKey do not support usage of keySet(). Consider @ClassKey instead.");
    }

    @Override // java.util.Map
    public final Object put(Class<?> cls, Object obj) {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends Class<?>, ? extends V> map) {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public final int size() {
        throw null;
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        throw null;
    }
}
