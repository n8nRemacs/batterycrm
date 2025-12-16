package com.google.common.reflect;

import aZ0.InterfaceC19845a;
import com.google.common.collect.M0;
import com.google.common.collect.N0;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: MutableTypeToInstanceMap.java */
@InterfaceC37524c
/* loaded from: classes6.dex */
public final class i<B> extends M0<w<? extends B>, B> implements s<B> {

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f360452b = new HashMap();

    /* compiled from: MutableTypeToInstanceMap.java */
    public static final class a<K, V> extends N0<K, V> {

        /* renamed from: b, reason: collision with root package name */
        public final Map.Entry<K, V> f360453b;

        public a(Map.Entry<K, V> entry) {
            entry.getClass();
            this.f360453b = entry;
        }

        @Override // com.google.common.collect.N0, com.google.common.collect.S0
        public final Object X() {
            return this.f360453b;
        }

        @Override // com.google.common.collect.N0
        /* renamed from: Y */
        public final Map.Entry<K, V> X() {
            return this.f360453b;
        }

        @Override // com.google.common.collect.N0, java.util.Map.Entry
        @k
        public final V setValue(@k V v12) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.common.collect.M0, com.google.common.collect.S0
    public final Object X() {
        return this.f360452b;
    }

    @Override // com.google.common.collect.M0
    /* renamed from: Y */
    public final Map<w<? extends B>, B> X() {
        return this.f360452b;
    }

    @Override // com.google.common.collect.M0, java.util.Map
    public final Set<Map.Entry<w<? extends B>, B>> entrySet() {
        return new h(super.entrySet());
    }

    @Override // com.google.common.collect.M0, java.util.Map
    @I41.a
    @aZ0.e
    @Deprecated
    @InterfaceC19845a
    public final Object put(Object obj, @k Object obj2) {
        throw new UnsupportedOperationException("Please use putInstance() instead.");
    }

    @Override // com.google.common.collect.M0, java.util.Map
    @aZ0.e
    @Deprecated
    public final void putAll(Map<? extends w<? extends B>, ? extends B> map) {
        throw new UnsupportedOperationException("Please use putInstance() instead.");
    }
}
