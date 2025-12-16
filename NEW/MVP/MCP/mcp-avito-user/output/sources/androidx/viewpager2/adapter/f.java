package androidx.viewpager2.adapter;

import androidx.viewpager2.adapter.b;
import androidx.viewpager2.widget.ViewPager2;

/* compiled from: FragmentStateAdapter.java */
/* loaded from: classes10.dex */
class f extends ViewPager2.i {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b.c f55090d;

    public f(b.c cVar) {
        this.f55090d = cVar;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.i
    public final void onPageScrollStateChanged(int i12) {
        this.f55090d.b(false);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.i
    public final void onPageSelected(int i12) {
        this.f55090d.b(false);
    }
}
