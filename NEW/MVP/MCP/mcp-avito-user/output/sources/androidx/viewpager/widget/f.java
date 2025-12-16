package androidx.viewpager.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.core.view.C22823h0;
import androidx.core.view.J0;
import androidx.core.view.M;

/* compiled from: ViewPager.java */
/* loaded from: classes10.dex */
class f implements M {

    /* renamed from: b, reason: collision with root package name */
    public final Rect f55063b = new Rect();

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewPager f55064c;

    public f(ViewPager viewPager) {
        this.f55064c = viewPager;
    }

    @Override // androidx.core.view.M
    public final J0 h(View view, J0 j02) {
        J0 j0V = C22823h0.v(view, j02);
        if (j0V.o()) {
            return j0V;
        }
        int i12 = j0V.i();
        Rect rect = this.f55063b;
        rect.left = i12;
        rect.top = j0V.k();
        rect.right = j0V.j();
        rect.bottom = j0V.h();
        ViewPager viewPager = this.f55064c;
        int childCount = viewPager.getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            J0 j0C = C22823h0.c(viewPager.getChildAt(i13), j0V);
            rect.left = Math.min(j0C.i(), rect.left);
            rect.top = Math.min(j0C.k(), rect.top);
            rect.right = Math.min(j0C.j(), rect.right);
            rect.bottom = Math.min(j0C.h(), rect.bottom);
        }
        return j0V.q(rect.left, rect.top, rect.right, rect.bottom);
    }
}
