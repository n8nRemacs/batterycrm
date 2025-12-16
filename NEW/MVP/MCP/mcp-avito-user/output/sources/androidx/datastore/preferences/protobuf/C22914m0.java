package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC22940z;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
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
/* renamed from: androidx.datastore.preferences.protobuf.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22914m0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f45874a = Charset.forName(Constants.ENCODING);

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f45875b;

    /* renamed from: c, reason: collision with root package name */
    public static final ByteBuffer f45876c;

    /* compiled from: Internal.java */
    /* renamed from: androidx.datastore.preferences.protobuf.m0$a */
    public interface a extends k<Boolean> {
    }

    /* compiled from: Internal.java */
    /* renamed from: androidx.datastore.preferences.protobuf.m0$b */
    public interface b extends k<Double> {
    }

    /* compiled from: Internal.java */
    /* renamed from: androidx.datastore.preferences.protobuf.m0$c */
    public interface c {
        int getNumber();
    }

    /* compiled from: Internal.java */
    /* renamed from: androidx.datastore.preferences.protobuf.m0$d */
    public interface d<T extends c> {
    }

    /* compiled from: Internal.java */
    /* renamed from: androidx.datastore.preferences.protobuf.m0$e */
    public interface e {
        boolean isInRange(int i12);
    }

    /* compiled from: Internal.java */
    /* renamed from: androidx.datastore.preferences.protobuf.m0$f */
    public interface f extends k<Float> {
    }

    /* compiled from: Internal.java */
    /* renamed from: androidx.datastore.preferences.protobuf.m0$g */
    public interface g extends k<Integer> {
    }

    /* compiled from: Internal.java */
    /* renamed from: androidx.datastore.preferences.protobuf.m0$h */
    public static class h<F, T> extends AbstractList<T> {

        /* compiled from: Internal.java */
        /* renamed from: androidx.datastore.preferences.protobuf.m0$h$a */
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
    /* renamed from: androidx.datastore.preferences.protobuf.m0$i */
    public interface i extends k<Long> {
    }

    /* compiled from: Internal.java */
    /* renamed from: androidx.datastore.preferences.protobuf.m0$j */
    public static class j<K, V, RealValue> extends AbstractMap<K, V> {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int f45877b = 0;

        /* compiled from: Internal.java */
        /* renamed from: androidx.datastore.preferences.protobuf.m0$j$a */
        public interface a<A, B> {
        }

        /* compiled from: Internal.java */
        /* renamed from: androidx.datastore.preferences.protobuf.m0$j$b */
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
                int i12 = j.f45877b;
                throw null;
            }

            @Override // java.util.Map.Entry
            public final int hashCode() {
                throw null;
            }

            @Override // java.util.Map.Entry
            public final V setValue(V v12) {
                int i12 = j.f45877b;
                throw null;
            }
        }

        /* compiled from: Internal.java */
        /* renamed from: androidx.datastore.preferences.protobuf.m0$j$c */
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
        /* renamed from: androidx.datastore.preferences.protobuf.m0$j$d */
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
    /* renamed from: androidx.datastore.preferences.protobuf.m0$k */
    public interface k<E> extends List<E>, RandomAccess {
        boolean isModifiable();

        void makeImmutable();

        k<E> mutableCopyWithCapacity(int i12);
    }

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f45875b = bArr;
        f45876c = ByteBuffer.wrap(bArr);
        try {
            new AbstractC22940z.b(bArr, 0, 0, false, null).h(0);
        } catch (InvalidProtocolBufferException e12) {
            throw new IllegalArgumentException(e12);
        }
    }

    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int b(long j12) {
        return (int) (j12 ^ (j12 >>> 32));
    }

    public static F0 c(Object obj, Object obj2) {
        GeneratedMessageLite.b builder = ((F0) obj).toBuilder();
        F0 f02 = (F0) obj2;
        if (!builder.f45667b.getClass().isInstance(f02)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        builder.getClass();
        builder.k();
        GeneratedMessageLite.b.l(builder.f45668c, (GeneratedMessageLite) ((AbstractC22877a) f02));
        return builder.buildPartial();
    }
}
