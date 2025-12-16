package e11;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes7.dex */
public class U1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    public static final WeakHashMap<View, WeakReference<com.my.target.nativeads.b>> f394487a = new WeakHashMap<>();

    public static void a(@j.N View view, @j.N com.my.target.nativeads.b bVar) {
        com.my.target.nativeads.b bVar2;
        b(bVar);
        WeakHashMap<View, WeakReference<com.my.target.nativeads.b>> weakHashMap = f394487a;
        WeakReference<com.my.target.nativeads.b> weakReference = weakHashMap.get(view);
        if (weakReference != null && (bVar2 = weakReference.get()) != null) {
            bVar2.j();
        }
        weakHashMap.put(view, new WeakReference<>(bVar));
    }

    public static void b(@j.N com.my.target.nativeads.b bVar) {
        com.my.target.nativeads.b bVar2;
        WeakHashMap<View, WeakReference<com.my.target.nativeads.b>> weakHashMap = f394487a;
        for (Map.Entry<View, WeakReference<com.my.target.nativeads.b>> entry : weakHashMap.entrySet()) {
            View key = entry.getKey();
            WeakReference<com.my.target.nativeads.b> value = entry.getValue();
            if (value != null && ((bVar2 = value.get()) == null || bVar2 == bVar)) {
                weakHashMap.remove(key);
                return;
            }
        }
    }
}
