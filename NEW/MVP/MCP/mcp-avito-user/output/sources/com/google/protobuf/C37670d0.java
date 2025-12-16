package com.google.protobuf;

import com.adjust.sdk.Constants;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* compiled from: Internal.java */
/* renamed from: com.google.protobuf.d0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37670d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f362857a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f362858b;

    /* renamed from: c, reason: collision with root package name */
    public static final ByteBuffer f362859c;

    /* compiled from: Internal.java */
    /* renamed from: com.google.protobuf.d0$a */
    public interface a extends k<Boolean> {
        @Override // com.google.protobuf.C37670d0.k, com.google.protobuf.C37670d0.b
        /* renamed from: mutableCopyWithCapacity, reason: merged with bridge method [inline-methods] */
        k<Boolean> mutableCopyWithCapacity2(int i12);
    }

    /* compiled from: Internal.java */
    /* renamed from: com.google.protobuf.d0$b */
    public interface b extends k<Double> {
        @Override // com.google.protobuf.C37670d0.k, com.google.protobuf.C37670d0.b
        /* renamed from: mutableCopyWithCapacity */
        k<Double> mutableCopyWithCapacity2(int i12);
    }

    /* compiled from: Internal.java */
    /* renamed from: com.google.protobuf.d0$c */
    public interface c {
        int getNumber();
    }

    /* compiled from: Internal.java */
    /* renamed from: com.google.protobuf.d0$d */
    public interface d<T extends c> {
        T findValueByNumber(int i12);
    }

    /* compiled from: Internal.java */
    /* renamed from: com.google.protobuf.d0$e */
    public interface e {
        boolean isInRange(int i12);
    }

    /* compiled from: Internal.java */
    /* renamed from: com.google.protobuf.d0$f */
    public interface f extends k<Float> {
        @Override // com.google.protobuf.C37670d0.k, com.google.protobuf.C37670d0.b
        /* renamed from: mutableCopyWithCapacity */
        k<Float> mutableCopyWithCapacity2(int i12);
    }

    /* compiled from: Internal.java */
    /* renamed from: com.google.protobuf.d0$g */
    public interface g extends k<Integer> {
        @Override // com.google.protobuf.C37670d0.k, com.google.protobuf.C37670d0.b
        /* renamed from: mutableCopyWithCapacity */
        k<Integer> mutableCopyWithCapacity2(int i12);
    }

    /* compiled from: Internal.java */
    /* renamed from: com.google.protobuf.d0$h */
    public static class h<F, T> extends AbstractList<T> {

        /* compiled from: Internal.java */
        /* renamed from: com.google.protobuf.d0$h$a */
        public interface a<F, T> {
        }

        @Override // java.util.AbstractList, java.util.List
        public final T get(int i12) {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            throw null;
        }
    }

    /* compiled from: Internal.java */
    /* renamed from: com.google.protobuf.d0$i */
    public interface i extends k<Long> {
        @Override // com.google.protobuf.C37670d0.k, com.google.protobuf.C37670d0.b
        /* renamed from: mutableCopyWithCapacity */
        k<Long> mutableCopyWithCapacity2(int i12);
    }

    /* compiled from: Internal.java */
    /* renamed from: com.google.protobuf.d0$j */
    public static class j<K, V, RealValue> extends AbstractMap<K, V> {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int f362860b = 0;

        /* compiled from: Internal.java */
        /* renamed from: com.google.protobuf.d0$j$a */
        public interface a<A, B> {
        }

        /* compiled from: Internal.java */
        /* renamed from: com.google.protobuf.d0$j$b */
        public class b implements Map.Entry<K, V> {
            public b() {
                throw null;
            }

            @Override // java.util.Map.Entry
            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof Map.Entry) {
                    throw null;
                }
                return false;
            }

            @Override // java.util.Map.Entry
            public final K getKey() {
                throw null;
            }

            @Override // java.util.Map.Entry
            public final V getValue() {
                int i12 = j.f362860b;
                throw null;
            }

            @Override // java.util.Map.Entry
            public final int hashCode() {
                throw null;
            }

            @Override // java.util.Map.Entry
            public final V setValue(V v12) {
                int i12 = j.f362860b;
                throw null;
            }
        }

        /* compiled from: Internal.java */
        /* renamed from: com.google.protobuf.d0$j$c */
        public class c implements Iterator<Map.Entry<K, V>> {
            public c() {
                throw null;
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                throw null;
            }

            @Override // java.util.Iterator
            public final Object next() {
                throw null;
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw null;
            }
        }

        /* compiled from: Internal.java */
        /* renamed from: com.google.protobuf.d0$j$d */
        public class d extends AbstractSet<Map.Entry<K, V>> {
            public d() {
                throw null;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public final Iterator<Map.Entry<K, V>> iterator() {
                throw null;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final int size() {
                throw null;
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Set<Map.Entry<K, V>> entrySet() {
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final V get(Object obj) {
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final V put(K k12, V v12) {
            throw null;
        }
    }

    /* compiled from: Internal.java */
    /* renamed from: com.google.protobuf.d0$k */
    public interface k<E> extends List<E>, RandomAccess {
        boolean isModifiable();

        void makeImmutable();

        /* renamed from: mutableCopyWithCapacity */
        k<E> mutableCopyWithCapacity2(int i12);
    }

    static {
        Charset.forName("US-ASCII");
        f362857a = Charset.forName(Constants.ENCODING);
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f362858b = bArr;
        f362859c = ByteBuffer.wrap(bArr);
        AbstractC37708x.j(bArr, 0, 0, false);
    }

    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int b(long j12) {
        return (int) (j12 ^ (j12 >>> 32));
    }
}
