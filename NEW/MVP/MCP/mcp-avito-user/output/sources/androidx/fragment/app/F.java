package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.view.Lifecycle;
import androidx.viewpager.widget.ViewPager;
import java.util.ArrayList;

/* compiled from: FragmentStatePagerAdapter.java */
@Deprecated
/* loaded from: classes.dex */
public abstract class F extends androidx.viewpager.widget.a {

    /* renamed from: c, reason: collision with root package name */
    public final FragmentManager f46299c;

    /* renamed from: d, reason: collision with root package name */
    public final int f46300d;

    /* renamed from: e, reason: collision with root package name */
    public H f46301e = null;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList<Fragment.SavedState> f46302f = new ArrayList<>();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList<Fragment> f46303g = new ArrayList<>();

    /* renamed from: h, reason: collision with root package name */
    public Fragment f46304h = null;

    /* renamed from: i, reason: collision with root package name */
    public boolean f46305i;

    public F(@j.N FragmentManager fragmentManager, int i12) {
        this.f46299c = fragmentManager;
        this.f46300d = i12;
    }

    @Override // androidx.viewpager.widget.a
    public void a(@j.N ViewPager viewPager, int i12, @j.N Object obj) {
        ArrayList<Fragment.SavedState> arrayList;
        Fragment fragment = (Fragment) obj;
        H h12 = this.f46301e;
        FragmentManager fragmentManager = this.f46299c;
        if (h12 == null) {
            fragmentManager.getClass();
            this.f46301e = new C22943a(fragmentManager);
        }
        while (true) {
            arrayList = this.f46302f;
            if (arrayList.size() > i12) {
                break;
            } else {
                arrayList.add(null);
            }
        }
        arrayList.set(i12, fragment.isAdded() ? fragmentManager.l0(fragment) : null);
        this.f46303g.set(i12, null);
        this.f46301e.m(fragment);
        if (fragment.equals(this.f46304h)) {
            this.f46304h = null;
        }
    }

    @Override // androidx.viewpager.widget.a
    public final void b() {
        H h12 = this.f46301e;
        if (h12 != null) {
            if (!this.f46305i) {
                try {
                    this.f46305i = true;
                    h12.h();
                } finally {
                    this.f46305i = false;
                }
            }
            this.f46301e = null;
        }
    }

    @Override // androidx.viewpager.widget.a
    @j.N
    public Object f(@j.N ViewGroup viewGroup, int i12) {
        Fragment.SavedState savedState;
        Fragment fragment;
        ArrayList<Fragment> arrayList = this.f46303g;
        if (arrayList.size() > i12 && (fragment = arrayList.get(i12)) != null) {
            return fragment;
        }
        if (this.f46301e == null) {
            FragmentManager fragmentManager = this.f46299c;
            fragmentManager.getClass();
            this.f46301e = new C22943a(fragmentManager);
        }
        Fragment fragmentO = o(i12);
        ArrayList<Fragment.SavedState> arrayList2 = this.f46302f;
        if (arrayList2.size() > i12 && (savedState = arrayList2.get(i12)) != null) {
            fragmentO.setInitialSavedState(savedState);
        }
        while (arrayList.size() <= i12) {
            arrayList.add(null);
        }
        fragmentO.setMenuVisibility(false);
        int i13 = this.f46300d;
        if (i13 == 0) {
            fragmentO.setUserVisibleHint(false);
        }
        arrayList.set(i12, fragmentO);
        this.f46301e.j(viewGroup.getId(), fragmentO, null, 1);
        if (i13 == 1) {
            this.f46301e.p(fragmentO, Lifecycle.State.f46682e);
        }
        return fragmentO;
    }

    @Override // androidx.viewpager.widget.a
    public final boolean g(@j.N View view, @j.N Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    @Override // androidx.viewpager.widget.a
    public final void j(@j.P Parcelable parcelable, @j.P ClassLoader classLoader) throws NumberFormatException {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            ArrayList<Fragment.SavedState> arrayList = this.f46302f;
            arrayList.clear();
            ArrayList<Fragment> arrayList2 = this.f46303g;
            arrayList2.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    arrayList.add((Fragment.SavedState) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int i12 = Integer.parseInt(str.substring(1));
                    Fragment fragmentM = this.f46299c.M(bundle, str);
                    if (fragmentM != null) {
                        while (arrayList2.size() <= i12) {
                            arrayList2.add(null);
                        }
                        fragmentM.setMenuVisibility(false);
                        arrayList2.set(i12, fragmentM);
                    }
                }
            }
        }
    }

    @Override // androidx.viewpager.widget.a
    @j.P
    public Parcelable k() {
        Bundle bundle;
        ArrayList<Fragment.SavedState> arrayList = this.f46302f;
        if (arrayList.size() > 0) {
            bundle = new Bundle();
            Fragment.SavedState[] savedStateArr = new Fragment.SavedState[arrayList.size()];
            arrayList.toArray(savedStateArr);
            bundle.putParcelableArray("states", savedStateArr);
        } else {
            bundle = null;
        }
        int i12 = 0;
        while (true) {
            ArrayList<Fragment> arrayList2 = this.f46303g;
            if (i12 >= arrayList2.size()) {
                return bundle;
            }
            Fragment fragment = arrayList2.get(i12);
            if (fragment != null && fragment.isAdded()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                this.f46299c.d0(bundle, fragment, AK.c.g(i12, "f"));
            }
            i12++;
        }
    }

    @Override // androidx.viewpager.widget.a
    public void l(@j.N ViewPager viewPager, int i12, @j.N Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f46304h;
        if (fragment != fragment2) {
            FragmentManager fragmentManager = this.f46299c;
            int i13 = this.f46300d;
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (i13 == 1) {
                    if (this.f46301e == null) {
                        fragmentManager.getClass();
                        this.f46301e = new C22943a(fragmentManager);
                    }
                    this.f46301e.p(this.f46304h, Lifecycle.State.f46682e);
                } else {
                    this.f46304h.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (i13 == 1) {
                if (this.f46301e == null) {
                    fragmentManager.getClass();
                    this.f46301e = new C22943a(fragmentManager);
                }
                this.f46301e.p(fragment, Lifecycle.State.f46683f);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.f46304h = fragment;
        }
    }

    @Override // androidx.viewpager.widget.a
    public final void m(@j.N ViewPager viewPager) {
        if (viewPager.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }

    @j.N
    public abstract Fragment o(int i12);
}
