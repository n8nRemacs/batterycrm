package com.yandex.metrica.impl.ob;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.rm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39108rm<K, V> {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap<K, Collection<V>> f381807a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f381808b;

    public C39108rm() {
        this(false);
    }

    @j.P
    public Collection<V> a(@j.P K k12) {
        return this.f381807a.get(k12);
    }

    public boolean b() {
        return this.f381807a.isEmpty();
    }

    public int c() {
        Iterator<Collection<V>> it = this.f381807a.values().iterator();
        int size = 0;
        while (it.hasNext()) {
            size += it.next().size();
        }
        return size;
    }

    public String toString() {
        return this.f381807a.toString();
    }

    public C39108rm(boolean z12) {
        this.f381807a = new HashMap<>();
        this.f381808b = z12;
    }

    @j.P
    public Collection<V> a(@j.P K k12, @j.P V v12) {
        Collection<V> collection = this.f381807a.get(k12);
        ArrayList arrayList = collection == null ? new ArrayList() : new ArrayList(collection);
        arrayList.add(v12);
        return this.f381807a.put(k12, arrayList);
    }

    @j.P
    public Collection<V> b(@j.P K k12) {
        return this.f381807a.remove(k12);
    }

    @j.P
    public Collection<V> b(@j.P K k12, @j.P V v12) {
        Collection<V> collection = this.f381807a.get(k12);
        if (collection == null || !collection.remove(v12)) {
            return null;
        }
        if (collection.isEmpty() && this.f381808b) {
            this.f381807a.remove(k12);
        }
        return new ArrayList(collection);
    }

    @j.N
    public Set<? extends Map.Entry<K, ? extends Collection<V>>> a() {
        return this.f381807a.entrySet();
    }
}
