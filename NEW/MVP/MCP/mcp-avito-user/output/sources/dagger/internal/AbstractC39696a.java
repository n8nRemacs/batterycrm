package dagger.internal;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AbstractMapFactory.java */
/* renamed from: dagger.internal.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC39696a<K, V, V2> implements h<Map<K, V2>> {

    /* renamed from: a, reason: collision with root package name */
    public final Map<K, u<V>> f393942a;

    /* compiled from: AbstractMapFactory.java */
    /* renamed from: dagger.internal.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC11030a<K, V, V2> {

        /* renamed from: a, reason: collision with root package name */
        public final LinkedHashMap<K, u<V>> f393943a;

        public AbstractC11030a(int i12) {
            this.f393943a = new LinkedHashMap<>(i12 < 3 ? i12 + 1 : i12 < 1073741824 ? (int) ((i12 / 0.75f) + 1.0f) : Integer.MAX_VALUE);
        }

        public final void a(Object obj, u uVar) {
            LinkedHashMap<K, u<V>> linkedHashMap = this.f393943a;
            t.b(obj, "key");
            t.b(uVar, "provider");
            linkedHashMap.put(obj, uVar);
        }
    }

    public AbstractC39696a(Map<K, u<V>> map) {
        this.f393942a = Collections.unmodifiableMap(map);
    }
}
