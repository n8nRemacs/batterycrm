package dagger.internal;

import dagger.internal.AbstractC39696a;
import java.util.Map;

/* compiled from: MapProviderFactory.java */
/* loaded from: classes8.dex */
public final class q<K, V> extends AbstractC39696a<K, V, u<V>> implements h31.e<Map<K, u<V>>> {

    /* compiled from: MapProviderFactory.java */
    public static final class b<K, V> extends AbstractC39696a.AbstractC11030a<K, V, u<V>> {
        public b(int i12, a aVar) {
            super(i12);
        }

        public final q<K, V> b() {
            return new q<>(this.f393943a, null);
        }

        public final void c(com.avito.android.deeplink_handler.handler.composite.f fVar) {
            a(com.avito.android.deeplink_handler.handler.composite.d.class, fVar);
        }
    }

    public q() {
        throw null;
    }

    public q(Map map, a aVar) {
        super(map);
    }

    public static <K, V> b<K, V> a(int i12) {
        return new b<>(i12, null);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return this.f393942a;
    }
}
