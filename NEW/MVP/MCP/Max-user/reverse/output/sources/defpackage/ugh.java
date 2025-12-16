package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class ugh implements yhd {
    @Override // defpackage.yhd
    public final void b(View view) {
    }

    @Override // defpackage.yhd
    public final void d(View view) {
        xhd xhdVar = (xhd) view.getLayoutParams();
        if (((ViewGroup.MarginLayoutParams) xhdVar).width != -1 || ((ViewGroup.MarginLayoutParams) xhdVar).height != -1) {
            throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
        }
    }
}
