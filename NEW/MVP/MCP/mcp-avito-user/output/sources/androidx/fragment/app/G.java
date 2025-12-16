package androidx.fragment.app;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: FragmentStore.java */
/* loaded from: classes.dex */
class G {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<Fragment> f46438a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap<String, E> f46439b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap<String, Bundle> f46440c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    public C22967z f46441d;

    public final void a(@j.N Fragment fragment) {
        if (this.f46438a.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.f46438a) {
            this.f46438a.add(fragment);
        }
        fragment.mAdded = true;
    }

    @j.P
    public final Fragment b(@j.N String str) {
        E e12 = this.f46439b.get(str);
        if (e12 != null) {
            return e12.f46294c;
        }
        return null;
    }

    @j.P
    public final Fragment c(@j.N String str) {
        Fragment fragmentFindFragmentByWho;
        for (E e12 : this.f46439b.values()) {
            if (e12 != null && (fragmentFindFragmentByWho = e12.f46294c.findFragmentByWho(str)) != null) {
                return fragmentFindFragmentByWho;
            }
        }
        return null;
    }

    @j.N
    public final ArrayList d() {
        ArrayList arrayList = new ArrayList();
        for (E e12 : this.f46439b.values()) {
            if (e12 != null) {
                arrayList.add(e12);
            }
        }
        return arrayList;
    }

    @j.N
    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        for (E e12 : this.f46439b.values()) {
            if (e12 != null) {
                arrayList.add(e12.f46294c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    @j.N
    public final List<Fragment> f() {
        ArrayList arrayList;
        if (this.f46438a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f46438a) {
            arrayList = new ArrayList(this.f46438a);
        }
        return arrayList;
    }

    public final void g(@j.N E e12) {
        Fragment fragment = e12.f46294c;
        String str = fragment.mWho;
        HashMap<String, E> map = this.f46439b;
        if (map.get(str) != null) {
            return;
        }
        map.put(fragment.mWho, e12);
        if (fragment.mRetainInstanceChangedWhileDetached) {
            if (fragment.mRetainInstance) {
                this.f46441d.ke(fragment);
            } else {
                this.f46441d.ne(fragment);
            }
            fragment.mRetainInstanceChangedWhileDetached = false;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            fragment.toString();
        }
    }

    public final void h(@j.N E e12) {
        Fragment fragment = e12.f46294c;
        if (fragment.mRetainInstance) {
            this.f46441d.ne(fragment);
        }
        HashMap<String, E> map = this.f46439b;
        if (map.get(fragment.mWho) == e12 && map.put(fragment.mWho, null) != null && Log.isLoggable("FragmentManager", 2)) {
            fragment.toString();
        }
    }

    @j.P
    public final Bundle i(@j.P Bundle bundle, @j.N String str) {
        HashMap<String, Bundle> map = this.f46440c;
        return bundle != null ? map.put(str, bundle) : map.remove(str);
    }
}
