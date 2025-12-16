package com.google.common.collect;

import com.google.common.collect.W2;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: MultimapBuilder.java */
/* loaded from: classes6.dex */
class U2 extends W2.g<Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Comparator f359578a;

    public U2(Comparator comparator) {
        this.f359578a = comparator;
    }

    @Override // com.google.common.collect.W2.g
    public final <K, V> Map<K, Collection<V>> b() {
        return new TreeMap(this.f359578a);
    }
}
