package com.google.common.cache;

import com.google.common.util.concurrent.C37568u0;
import com.google.common.util.concurrent.D0;
import java.io.Serializable;

@XY0.b
@h
/* loaded from: classes6.dex */
public abstract class CacheLoader<K, V> {

    public static final class InvalidCacheLoadException extends RuntimeException {
    }

    public static final class UnsupportedLoadingOperationException extends UnsupportedOperationException {
    }

    public static final class a<K, V> extends CacheLoader<K, V> implements Serializable {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.cache.CacheLoader
        public final V a(K k12) {
            k12.getClass();
            throw null;
        }
    }

    public static final class b<V> extends CacheLoader<Object, V> implements Serializable {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.cache.CacheLoader
        public final V a(Object obj) {
            obj.getClass();
            throw null;
        }
    }

    public abstract V a(K k12);

    @XY0.c
    public D0<V> b(K k12, V v12) {
        k12.getClass();
        return C37568u0.d(a(k12));
    }
}
