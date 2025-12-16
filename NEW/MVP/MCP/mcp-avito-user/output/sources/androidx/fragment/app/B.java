package androidx.fragment.app;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;

/* compiled from: FragmentPagerAdapter.java */
@Deprecated
/* loaded from: classes.dex */
public abstract class B extends androidx.viewpager.widget.a {

    /* renamed from: c, reason: collision with root package name */
    public final FragmentManager f46266c;

    /* renamed from: d, reason: collision with root package name */
    public H f46267d = null;

    /* renamed from: e, reason: collision with root package name */
    public Fragment f46268e = null;

    /* renamed from: f, reason: collision with root package name */
    public boolean f46269f;

    @Deprecated
    public B(@j.N FragmentManager fragmentManager) {
        this.f46266c = fragmentManager;
    }

    @Override // androidx.viewpager.widget.a
    public final void a(@j.N ViewPager viewPager, int i12, @j.N Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f46267d == null) {
            FragmentManager fragmentManager = this.f46266c;
            fragmentManager.getClass();
            this.f46267d = new C22943a(fragmentManager);
        }
        this.f46267d.i(fragment);
        if (fragment.equals(this.f46268e)) {
            this.f46268e = null;
        }
    }

    @Override // androidx.viewpager.widget.a
    public final void b() {
        H h12 = this.f46267d;
        if (h12 != null) {
            if (!this.f46269f) {
                try {
                    this.f46269f = true;
                    h12.h();
                } finally {
                    this.f46269f = false;
                }
            }
            this.f46267d = null;
        }
    }

    @Override // androidx.viewpager.widget.a
    @j.N
    public final Object f(@j.N ViewGroup viewGroup, int i12) {
        H h12 = this.f46267d;
        FragmentManager fragmentManager = this.f46266c;
        if (h12 == null) {
            fragmentManager.getClass();
            this.f46267d = new C22943a(fragmentManager);
        }
        long j12 = i12;
        Fragment fragmentH = fragmentManager.H("android:switcher:" + viewGroup.getId() + ":" + j12);
        if (fragmentH != null) {
            this.f46267d.d(fragmentH);
        } else {
            fragmentH = o(i12);
            this.f46267d.j(viewGroup.getId(), fragmentH, "android:switcher:" + viewGroup.getId() + ":" + j12, 1);
        }
        if (fragmentH != this.f46268e) {
            fragmentH.setMenuVisibility(false);
            fragmentH.setUserVisibleHint(false);
        }
        return fragmentH;
    }

    @Override // androidx.viewpager.widget.a
    public final boolean g(@j.N View view, @j.N Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    @Override // androidx.viewpager.widget.a
    @j.P
    public final Parcelable k() {
        return null;
    }

    @Override // androidx.viewpager.widget.a
    public final void l(@j.N ViewPager viewPager, int i12, @j.N Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f46268e;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                this.f46268e.setUserVisibleHint(false);
            }
            fragment.setMenuVisibility(true);
            fragment.setUserVisibleHint(true);
            this.f46268e = fragment;
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

    @Override // androidx.viewpager.widget.a
    public final void j(@j.P Parcelable parcelable, @j.P ClassLoader classLoader) {
    }
}
