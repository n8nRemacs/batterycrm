package androidx.constraintlayout.widget;

import android.util.SparseIntArray;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: SharedValues.java */
/* loaded from: classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap<Integer, HashSet<WeakReference<a>>> f44431a;

    /* compiled from: SharedValues.java */
    public interface a {
    }

    public j() {
        new SparseIntArray();
        this.f44431a = new HashMap<>();
    }

    public final void a(int i12, a aVar) {
        HashMap<Integer, HashSet<WeakReference<a>>> map = this.f44431a;
        HashSet<WeakReference<a>> hashSet = map.get(Integer.valueOf(i12));
        if (hashSet == null) {
            hashSet = new HashSet<>();
            map.put(Integer.valueOf(i12), hashSet);
        }
        hashSet.add(new WeakReference<>(aVar));
    }
}
