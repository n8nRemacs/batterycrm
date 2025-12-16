package androidx.fragment.app;

import android.view.View;
import androidx.collection.C20199a;
import androidx.transition.C23505p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: FragmentTransition.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/fragment/app/J;", "", "<init>", "()V", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.l
    public static final O f46467a;

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.l
    public static final O f46468b;

    static {
        O o12;
        new J();
        f46467a = new K();
        try {
            o12 = (O) C23505p.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            o12 = null;
        }
        f46468b = o12;
    }

    @X41.n
    public static final void a(@Y61.k Fragment fragment, @Y61.k Fragment fragment2, boolean z12, @Y61.k C20199a c20199a) {
        if ((z12 ? fragment2.getEnterTransitionCallback() : fragment.getEnterTransitionCallback()) != null) {
            ArrayList arrayList = new ArrayList(c20199a.f25790d);
            Iterator it = c20199a.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add((View) ((Map.Entry) it.next()).getValue());
            }
            ArrayList arrayList2 = new ArrayList(c20199a.f25790d);
            Iterator it2 = c20199a.entrySet().iterator();
            while (it2.hasNext()) {
                arrayList2.add((String) ((Map.Entry) it2.next()).getKey());
            }
        }
    }

    @X41.n
    @Y61.l
    public static final String b(@Y61.k C20199a<String, String> c20199a, @Y61.k String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : c20199a.entrySet()) {
            if (kotlin.jvm.internal.L.f(entry.getValue(), str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Map.Entry) it.next()).getKey());
        }
        return (String) C42745f0.G(arrayList);
    }

    @X41.n
    public static final void c(int i12, @Y61.k ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i12);
        }
    }
}
