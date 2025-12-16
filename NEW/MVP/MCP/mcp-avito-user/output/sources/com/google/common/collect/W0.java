package com.google.common.collect;

import com.google.common.collect.M2;
import java.util.Comparator;
import java.util.SortedMap;

/* compiled from: ForwardingSortedMap.java */
@XY0.b
@InterfaceC37329f0
/* loaded from: classes6.dex */
public abstract class W0<K, V> extends M0<K, V> implements SortedMap<K, V> {

    /* compiled from: ForwardingSortedMap.java */
    public class a extends M2.t<K, V> {
    }

    @Override // com.google.common.collect.M0
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public abstract SortedMap<K, V> X();

    @Override // java.util.SortedMap
    @I41.a
    public final Comparator<? super K> comparator() {
        return X().comparator();
    }

    @Override // java.util.SortedMap
    @InterfaceC37434x3
    public final K firstKey() {
        return X().firstKey();
    }

    public SortedMap<K, V> headMap(@InterfaceC37434x3 K k12) {
        return X().headMap(k12);
    }

    @Override // java.util.SortedMap
    @InterfaceC37434x3
    public final K lastKey() {
        return X().lastKey();
    }

    public SortedMap<K, V> subMap(@InterfaceC37434x3 K k12, @InterfaceC37434x3 K k13) {
        return X().subMap(k12, k13);
    }

    public SortedMap<K, V> tailMap(@InterfaceC37434x3 K k12) {
        return X().tailMap(k12);
    }
}
