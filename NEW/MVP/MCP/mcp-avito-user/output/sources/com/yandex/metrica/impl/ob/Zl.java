package com.yandex.metrica.impl.ob;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes7.dex */
public class Zl<K, V> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Map<K, V> f380018a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final V f380019b;

    public Zl(@j.N V v12) {
        this(new HashMap(), v12);
    }

    public void a(@j.P K k12, @j.P V v12) {
        this.f380018a.put(k12, v12);
    }

    @j.k0
    public Zl(@j.N Map<K, V> map, @j.N V v12) {
        this.f380018a = map;
        this.f380019b = v12;
    }

    @j.N
    public V a(@j.P K k12) {
        V v12 = this.f380018a.get(k12);
        return v12 == null ? this.f380019b : v12;
    }

    @j.N
    public Set<K> a() {
        return this.f380018a.keySet();
    }
}
