package androidx.coordinatorlayout.widget;

import androidx.annotation.RestrictTo;
import androidx.collection.o1;
import androidx.core.util.y;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: DirectedAcyclicGraph.java */
@RestrictTo
/* loaded from: classes.dex */
public final class a<T> {

    /* renamed from: a, reason: collision with root package name */
    public final y.b f44464a = new y.b(10);

    /* renamed from: b, reason: collision with root package name */
    public final o1<T, ArrayList<T>> f44465b = new o1<>();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList<T> f44466c = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    public final HashSet<T> f44467d = new HashSet<>();

    public final void a(T t12, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t12)) {
            return;
        }
        if (hashSet.contains(t12)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(t12);
        ArrayList<T> arrayList2 = this.f44465b.get(t12);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i12 = 0; i12 < size; i12++) {
                a(arrayList2.get(i12), arrayList, hashSet);
            }
        }
        hashSet.remove(t12);
        arrayList.add(t12);
    }
}
