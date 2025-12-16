package androidx.viewpager2.widget;

import android.view.View;
import androidx.appcompat.app.r;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Locale;

/* compiled from: PageTransformerAdapter.java */
/* loaded from: classes10.dex */
final class g extends ViewPager2.i {

    /* renamed from: d, reason: collision with root package name */
    public final LinearLayoutManager f55143d;

    /* renamed from: e, reason: collision with root package name */
    public ViewPager2.l f55144e;

    public g(LinearLayoutManager linearLayoutManager) {
        this.f55143d = linearLayoutManager;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.i
    public final void onPageScrolled(int i12, float f12, int i13) {
        if (this.f55144e == null) {
            return;
        }
        float f13 = -f12;
        int i14 = 0;
        while (true) {
            LinearLayoutManager linearLayoutManager = this.f55143d;
            if (i14 >= linearLayoutManager.e0()) {
                return;
            }
            View viewD0 = linearLayoutManager.d0(i14);
            if (viewD0 == null) {
                Locale locale = Locale.US;
                throw new IllegalStateException(r.l(i14, linearLayoutManager.e0(), "LayoutManager returned a null child at pos ", "/", " while transforming pages"));
            }
            this.f55144e.a(viewD0, (RecyclerView.m.t0(viewD0) - i12) + f13);
            i14++;
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.i
    public final void onPageScrollStateChanged(int i12) {
    }

    @Override // androidx.viewpager2.widget.ViewPager2.i
    public final void onPageSelected(int i12) {
    }
}
