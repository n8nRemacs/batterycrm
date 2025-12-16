package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* compiled from: LazyField.java */
/* renamed from: androidx.datastore.preferences.protobuf.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C22922p0 extends C22924q0 {

    /* compiled from: LazyField.java */
    /* renamed from: androidx.datastore.preferences.protobuf.p0$b */
    public static class b<K> implements Map.Entry<K, Object> {

        /* renamed from: b, reason: collision with root package name */
        public final Map.Entry<K, C22922p0> f45909b;

        public b() {
            throw null;
        }

        public b(Map.Entry entry, a aVar) {
            this.f45909b = entry;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f45909b.getKey();
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            C22922p0 value = this.f45909b.getValue();
            if (value == null) {
                return null;
            }
            return value.a(null);
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            if (!(obj instanceof F0)) {
                throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
            }
            C22922p0 value = this.f45909b.getValue();
            F0 f02 = value.f45912a;
            value.f45913b = null;
            value.f45912a = (F0) obj;
            return f02;
        }
    }

    /* compiled from: LazyField.java */
    /* renamed from: androidx.datastore.preferences.protobuf.p0$c */
    public static class c<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: b, reason: collision with root package name */
        public final Iterator<Map.Entry<K, Object>> f45910b;

        public c(Iterator<Map.Entry<K, Object>> it) {
            this.f45910b = it;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f45910b.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            Map.Entry<K, Object> next = this.f45910b.next();
            return next.getValue() instanceof C22922p0 ? new b(next, null) : next;
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.f45910b.remove();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.C22924q0
    public final boolean equals(Object obj) {
        return a(null).equals(obj);
    }

    @Override // androidx.datastore.preferences.protobuf.C22924q0
    public final int hashCode() {
        return a(null).hashCode();
    }

    public final String toString() {
        return a(null).toString();
    }
}
