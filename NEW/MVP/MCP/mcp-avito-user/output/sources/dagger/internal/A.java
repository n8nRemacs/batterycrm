package dagger.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: SetFactory.java */
/* loaded from: classes8.dex */
public final class A<T> implements h<Set<T>> {

    /* renamed from: a, reason: collision with root package name */
    public final List<u<T>> f393935a;

    /* renamed from: b, reason: collision with root package name */
    public final List<u<Collection<T>>> f393936b;

    /* compiled from: SetFactory.java */
    public static final class b<T> {

        /* renamed from: a, reason: collision with root package name */
        public final List<u<T>> f393937a;

        /* renamed from: b, reason: collision with root package name */
        public final List<u<Collection<T>>> f393938b;

        public b(int i12, int i13, a aVar) {
            this.f393937a = i12 == 0 ? Collections.emptyList() : new ArrayList(i12);
            this.f393938b = i13 == 0 ? Collections.emptyList() : new ArrayList<>(i13);
        }

        public final void a(u uVar) {
            this.f393937a.add(uVar);
        }

        public final A<T> b() {
            return new A<>(this.f393937a, this.f393938b, null);
        }
    }

    static {
        l.a(Collections.emptySet());
    }

    public A() {
        throw null;
    }

    public A(List list, List list2, a aVar) {
        this.f393935a = list;
        this.f393936b = list2;
    }

    public static <T> b<T> a(int i12, int i13) {
        return new b<>(i12, i13, null);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        List<u<T>> list = this.f393935a;
        int size = list.size();
        List<u<Collection<T>>> list2 = this.f393936b;
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
