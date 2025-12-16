package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;

/* compiled from: LazyField.java */
/* renamed from: com.google.protobuf.h0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C37678h0 extends C37680i0 {

    /* compiled from: LazyField.java */
    /* renamed from: com.google.protobuf.h0$b */
    public static class b<K> implements Map.Entry<K, Object> {

        /* renamed from: b, reason: collision with root package name */
        public final Map.Entry<K, C37678h0> f362877b;

        public b() {
            throw null;
        }

        public b(Map.Entry entry, a aVar) {
            this.f362877b = entry;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f362877b.getKey();
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            C37678h0 value = this.f362877b.getValue();
            if (value == null) {
                return null;
            }
            return value.a(null);
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            if (!(obj instanceof InterfaceC37707w0)) {
                throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
            }
            C37678h0 value = this.f362877b.getValue();
            InterfaceC37707w0 interfaceC37707w0 = value.f362879a;
            value.f362880b = null;
            value.f362879a = (InterfaceC37707w0) obj;
            return interfaceC37707w0;
        }
    }

    /* compiled from: LazyField.java */
    /* renamed from: com.google.protobuf.h0$c */
    public static class c<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: b, reason: collision with root package name */
        public final Iterator<Map.Entry<K, Object>> f362878b;

        public c(Iterator<Map.Entry<K, Object>> it) {
            this.f362878b = it;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f362878b.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            Map.Entry<K, Object> next = this.f362878b.next();
            return next.getValue() instanceof C37678h0 ? new b(next, null) : next;
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.f362878b.remove();
        }
    }

    @Override // com.google.protobuf.C37680i0
    public final boolean equals(Object obj) {
        return a(null).equals(obj);
    }

    @Override // com.google.protobuf.C37680i0
    public final int hashCode() {
        return a(null).hashCode();
    }

    public final String toString() {
        return a(null).toString();
    }
}
