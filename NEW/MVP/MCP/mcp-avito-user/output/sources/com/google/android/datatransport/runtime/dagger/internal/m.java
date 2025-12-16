package com.google.android.datatransport.runtime.dagger.internal;

import com.google.android.datatransport.runtime.dagger.internal.a;
import java.util.Map;
import javax.inject.Provider;

/* compiled from: MapProviderFactory.java */
/* loaded from: classes10.dex */
public final class m<K, V> extends com.google.android.datatransport.runtime.dagger.internal.a<K, V, Provider<V>> implements AX0.e<Map<K, Provider<V>>> {

    /* compiled from: MapProviderFactory.java */
    public static final class b<K, V> extends a.AbstractC10564a<K, V, Provider<V>> {
        public b(int i12, a aVar) {
            super(i12);
        }
    }

    public m() {
        throw null;
    }

    public m(Map map, a aVar) {
        super(map);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return this.f343129a;
    }
}
