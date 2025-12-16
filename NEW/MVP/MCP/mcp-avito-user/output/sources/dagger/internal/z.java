package dagger.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: SetBuilder.java */
/* loaded from: classes8.dex */
public final class z<T> {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f393953a;

    public z(int i12) {
        this.f393953a = new ArrayList(i12);
    }

    public final void a(Object obj) {
        ArrayList arrayList = this.f393953a;
        t.b(obj, "Set contributions cannot be null");
        arrayList.add(obj);
    }

    public final void b(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            t.b(it.next(), "Set contributions cannot be null");
        }
        this.f393953a.addAll(collection);
    }

    public final Set<T> c() {
        ArrayList arrayList = this.f393953a;
        return arrayList.isEmpty() ? Collections.emptySet() : arrayList.size() == 1 ? Collections.singleton(arrayList.get(0)) : Collections.unmodifiableSet(new HashSet(arrayList));
    }
}
