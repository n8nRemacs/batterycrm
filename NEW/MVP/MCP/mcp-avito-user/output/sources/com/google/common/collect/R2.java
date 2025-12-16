package com.google.common.collect;

import aZ0.InterfaceC19845a;
import aZ0.InterfaceC19847c;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: Multimap.java */
@XY0.b
@InterfaceC37329f0
@aZ0.f
/* loaded from: classes6.dex */
public interface R2<K, V> {
    InterfaceC37338g3<K> Q();

    boolean R(@I41.a @InterfaceC19847c Object obj, @I41.a @InterfaceC19847c Object obj2);

    Map<K, Collection<V>> V();

    @InterfaceC19845a
    Collection<V> a(@I41.a @InterfaceC19847c Object obj);

    Collection<Map.Entry<K, V>> b();

    void clear();

    boolean containsKey(@I41.a @InterfaceC19847c Object obj);

    boolean containsValue(@I41.a @InterfaceC19847c Object obj);

    boolean equals(@I41.a Object obj);

    Collection<V> get(@InterfaceC37434x3 K k12);

    int hashCode();

    boolean isEmpty();

    Set<K> keySet();

    @InterfaceC19845a
    boolean put(@InterfaceC37434x3 K k12, @InterfaceC37434x3 V v12);

    @InterfaceC19845a
    boolean remove(@I41.a @InterfaceC19847c Object obj, @I41.a @InterfaceC19847c Object obj2);

    int size();

    Collection<V> values();
}
