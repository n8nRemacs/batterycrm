package androidx.fragment.app;

import android.util.Log;
import androidx.view.M0;
import androidx.view.P0;
import androidx.view.S0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: FragmentManagerViewModel.java */
/* renamed from: androidx.fragment.app.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22967z extends M0 {

    /* renamed from: O, reason: collision with root package name */
    public static final P0.c f46609O = new a();

    /* renamed from: L, reason: collision with root package name */
    public final boolean f46613L;

    /* renamed from: E, reason: collision with root package name */
    public final HashMap<String, Fragment> f46610E = new HashMap<>();

    /* renamed from: J, reason: collision with root package name */
    public final HashMap<String, C22967z> f46611J = new HashMap<>();

    /* renamed from: K, reason: collision with root package name */
    public final HashMap<String, S0> f46612K = new HashMap<>();

    /* renamed from: M, reason: collision with root package name */
    public boolean f46614M = false;

    /* renamed from: N, reason: collision with root package name */
    public boolean f46615N = false;

    /* compiled from: FragmentManagerViewModel.java */
    /* renamed from: androidx.fragment.app.z$a */
    public class a implements P0.c {
        @Override // androidx.lifecycle.P0.c
        @j.N
        public final <T extends M0> T create(@j.N Class<T> cls) {
            return new C22967z(true);
        }
    }

    public C22967z(boolean z12) {
        this.f46613L = z12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C22967z.class != obj.getClass()) {
            return false;
        }
        C22967z c22967z = (C22967z) obj;
        return this.f46610E.equals(c22967z.f46610E) && this.f46611J.equals(c22967z.f46611J) && this.f46612K.equals(c22967z.f46612K);
    }

    public final int hashCode() {
        return this.f46612K.hashCode() + ((this.f46611J.hashCode() + (this.f46610E.hashCode() * 31)) * 31);
    }

    public final void ke(@j.N Fragment fragment) {
        if (this.f46615N) {
            Log.isLoggable("FragmentManager", 2);
            return;
        }
        HashMap<String, Fragment> map = this.f46610E;
        if (map.containsKey(fragment.mWho)) {
            return;
        }
        map.put(fragment.mWho, fragment);
        if (Log.isLoggable("FragmentManager", 2)) {
            fragment.toString();
        }
    }

    public final void le(@j.N String str, boolean z12) {
        Log.isLoggable("FragmentManager", 3);
        me(str, z12);
    }

    public final void me(@j.N String str, boolean z12) {
        HashMap<String, C22967z> map = this.f46611J;
        C22967z c22967z = map.get(str);
        if (c22967z != null) {
            if (z12) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(c22967z.f46611J.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    c22967z.le((String) it.next(), true);
                }
            }
            c22967z.onCleared();
            map.remove(str);
        }
        HashMap<String, S0> map2 = this.f46612K;
        S0 s02 = map2.get(str);
        if (s02 != null) {
            s02.a();
            map2.remove(str);
        }
    }

    public final void ne(@j.N Fragment fragment) {
        if (this.f46615N) {
            Log.isLoggable("FragmentManager", 2);
        } else {
            if (this.f46610E.remove(fragment.mWho) == null || !Log.isLoggable("FragmentManager", 2)) {
                return;
            }
            fragment.toString();
        }
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        if (Log.isLoggable("FragmentManager", 3)) {
            toString();
        }
        this.f46614M = true;
    }

    @j.N
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator<Fragment> it = this.f46610E.values().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") Child Non Config (");
        Iterator<String> it2 = this.f46611J.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append(it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator<String> it3 = this.f46612K.keySet().iterator();
        while (it3.hasNext()) {
            sb2.append(it3.next());
            if (it3.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        return sb2.toString();
    }
}
