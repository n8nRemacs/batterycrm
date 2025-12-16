package com.google.android.datatransport.runtime.dagger.internal;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Provider;

/* compiled from: AbstractMapFactory.java */
/* loaded from: classes10.dex */
abstract class a<K, V, V2> implements g<Map<K, V2>> {

    /* renamed from: a, reason: collision with root package name */
    public final Map<K, Provider<V>> f343129a;

    /* compiled from: AbstractMapFactory.java */
    /* renamed from: com.google.android.datatransport.runtime.dagger.internal.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC10564a<K, V, V2> {
        public AbstractC10564a(int i12) {
            new LinkedHashMap(i12 < 3 ? i12 + 1 : i12 < 1073741824 ? (int) ((i12 / 0.75f) + 1.0f) : Integer.MAX_VALUE);
        }
    }

    public a(Map<K, Provider<V>> map) {
        this.f343129a = Collections.unmodifiableMap(map);
    }
}
