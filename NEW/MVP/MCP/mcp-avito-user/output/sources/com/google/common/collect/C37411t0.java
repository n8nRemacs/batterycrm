package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: FilteredKeySetMultimap.java */
@XY0.b
@InterfaceC37329f0
/* renamed from: com.google.common.collect.t0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C37411t0<K, V> extends C37406s0<K, V> implements InterfaceC37426w0<K, V> {

    /* compiled from: FilteredKeySetMultimap.java */
    /* renamed from: com.google.common.collect.t0$a */
    public class a extends C37406s0<K, V>.c implements Set<Map.Entry<K, V>> {
        @Override // java.util.Collection, java.util.Set
        public final boolean equals(@I41.a Object obj) {
            return W3.b(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public final int hashCode() {
            return W3.e(this);
        }
    }

    @Override // com.google.common.collect.C37406s0, com.google.common.collect.R2, com.google.common.collect.T3
    public final Collection a(@I41.a Object obj) {
        return (Set) super.a(obj);
    }

    @Override // com.google.common.collect.AbstractC37346i, com.google.common.collect.R2, com.google.common.collect.T3
    public final Collection b() {
        return (Set) super.b();
    }

    @Override // com.google.common.collect.C37406s0, com.google.common.collect.AbstractC37346i
    public final Collection d() {
        return new a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.C37406s0, com.google.common.collect.R2, com.google.common.collect.T3, com.google.common.collect.InterfaceC37363k4
    public final Collection get(@InterfaceC37434x3 Object obj) {
        return (Set) super.get((C37411t0<K, V>) obj);
    }

    @Override // com.google.common.collect.C37406s0, com.google.common.collect.InterfaceC37416u0
    public final /* bridge */ /* synthetic */ R2 h() {
        return null;
    }

    @Override // com.google.common.collect.C37406s0, com.google.common.collect.R2, com.google.common.collect.T3
    public final Set<V> a(@I41.a Object obj) {
        return (Set) super.a(obj);
    }

    @Override // com.google.common.collect.AbstractC37346i, com.google.common.collect.R2, com.google.common.collect.T3
    public final Set<Map.Entry<K, V>> b() {
        return (Set) super.b();
    }

    @Override // com.google.common.collect.C37406s0, com.google.common.collect.R2, com.google.common.collect.T3, com.google.common.collect.InterfaceC37363k4
    public final Set<V> get(@InterfaceC37434x3 K k12) {
        return (Set) super.get((C37411t0<K, V>) k12);
    }
}
