package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewParent;
import androidx.core.util.z;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import j.N;
import j.U;

/* compiled from: MarginPageTransformer.java */
/* loaded from: classes10.dex */
public final class f implements ViewPager2.l {

    /* renamed from: a, reason: collision with root package name */
    public final int f55142a;

    public f(@U int i12) {
        z.e(i12, "Margin must be non-negative");
        this.f55142a = i12;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.l
    public final void a(@N View view, float f12) {
        ViewParent parent = view.getParent();
        ViewParent parent2 = parent.getParent();
        if (!(parent instanceof RecyclerView) || !(parent2 instanceof ViewPager2)) {
            throw new IllegalStateException("Expected the page view to be managed by a ViewPager2 instance.");
        }
        ViewPager2 viewPager2 = (ViewPager2) parent2;
        float f13 = this.f55142a * f12;
        if (viewPager2.getOrientation() != 0) {
            view.setTranslationY(f13);
            return;
        }
        if (viewPager2.f55100h.q0() == 1) {
            f13 = -f13;
        }
        view.setTranslationX(f13);
    }
}
