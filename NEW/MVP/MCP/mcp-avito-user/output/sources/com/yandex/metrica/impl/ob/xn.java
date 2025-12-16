package com.yandex.metrica.impl.ob;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;

/* loaded from: classes7.dex */
public class xn<T> implements Comparator<Collection<T>> {

    /* renamed from: a, reason: collision with root package name */
    private final un<T> f382209a;

    /* renamed from: b, reason: collision with root package name */
    private final Comparator<T> f382210b;

    public xn(un<T> unVar, Comparator<T> comparator) {
        this.f382209a = unVar;
        this.f382210b = comparator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        Collection collection = (Collection) obj;
        Collection collection2 = (Collection) obj2;
        if (!((collection2 == null) ^ (collection == null))) {
            if (collection == collection2) {
                return 0;
            }
            if (collection.size() == collection2.size()) {
                HashMap map = new HashMap();
                for (Object obj3 : collection) {
                    map.put(this.f382209a.a(obj3), obj3);
                }
                for (Object obj4 : collection2) {
                    Object obj5 = map.get(this.f382209a.a(obj4));
                    if (obj5 == null || this.f382210b.compare(obj5, obj4) != 0) {
                    }
                }
                return 0;
            }
        }
        return 10;
    }
}
