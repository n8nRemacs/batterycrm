package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: LazyField.java */
/* loaded from: classes8.dex */
public class j extends k {

    /* compiled from: LazyField.java */
    public static class b<K> implements Map.Entry<K, Object> {

        /* renamed from: b, reason: collision with root package name */
        public final Map.Entry<K, j> f409375b;

        public b() {
            throw null;
        }

        public b(Map.Entry entry, a aVar) {
            this.f409375b = entry;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f409375b.getKey();
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            j value = this.f409375b.getValue();
            if (value == null) {
                return null;
            }
            return value.a();
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            if (!(obj instanceof o)) {
                throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
            }
            j value = this.f409375b.getValue();
            o oVar = value.f409377a;
            value.f409377a = (o) obj;
            return oVar;
        }
    }

    /* compiled from: LazyField.java */
    public static class c<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: b, reason: collision with root package name */
        public Iterator<Map.Entry<K, Object>> f409376b;

        public c() {
            throw null;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f409376b.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            Map.Entry<K, Object> next = this.f409376b.next();
            return next.getValue() instanceof j ? new b(next, null) : next;
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.f409376b.remove();
        }
    }

    public final o a() {
        if (this.f409377a == null) {
            synchronized (this) {
                if (this.f409377a == null) {
                    try {
                        this.f409377a = null;
                    } catch (IOException unused) {
                    }
                }
            }
        }
        return this.f409377a;
    }

    public final boolean equals(Object obj) {
        return a().equals(obj);
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a().toString();
    }
}
