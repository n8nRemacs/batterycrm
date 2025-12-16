package com.google.android.datatransport.runtime.dagger.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.inject.Provider;

/* compiled from: SetFactory.java */
/* loaded from: classes10.dex */
public final class s<T> implements g<Set<T>> {

    /* renamed from: a, reason: collision with root package name */
    public final List<Provider<T>> f343135a;

    /* renamed from: b, reason: collision with root package name */
    public final List<Provider<Collection<T>>> f343136b;

    /* compiled from: SetFactory.java */
    public static final class b<T> {

        /* renamed from: a, reason: collision with root package name */
        public final List<Provider<T>> f343137a;

        /* renamed from: b, reason: collision with root package name */
        public final List<Provider<Collection<T>>> f343138b;

        public b(int i12, int i13, a aVar) {
            this.f343137a = i12 == 0 ? Collections.emptyList() : new ArrayList(i12);
            this.f343138b = i13 == 0 ? Collections.emptyList() : new ArrayList<>(i13);
        }
    }

    static {
        Set setEmptySet = Collections.emptySet();
        if (setEmptySet == null) {
            throw new NullPointerException("instance cannot be null");
        }
        new j(setEmptySet);
    }

    public s() {
        throw null;
    }

    public s(List list, List list2, a aVar) {
        this.f343135a = list;
        this.f343136b = list2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        List<Provider<T>> list = this.f343135a;
        int size = list.size();
        List<Provider<Collection<T>>> list2 = this.f343136b;
        ArrayList arrayList = new ArrayList(list2.size());
        int size2 = list2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            Collection<T> collection = list2.get(i12).get();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet hashSet = new HashSet(size < 3 ? size + 1 : size < 1073741824 ? (int) ((size / 0.75f) + 1.0f) : Integer.MAX_VALUE);
        int size3 = list.size();
        for (int i13 = 0; i13 < size3; i13++) {
            T t12 = list.get(i13).get();
            t12.getClass();
            hashSet.add(t12);
        }
        int size4 = arrayList.size();
        for (int i14 = 0; i14 < size4; i14++) {
            for (Object obj : (Collection) arrayList.get(i14)) {
                obj.getClass();
                hashSet.add(obj);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }
}
