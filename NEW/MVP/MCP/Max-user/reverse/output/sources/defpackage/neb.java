package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes2.dex */
public final class neb extends TabLayout implements u6g {
    public final oeb i1;
    public final Object j1;

    public neb(Context context, int i) {
        super(context, null);
        this.i1 = (oeb) peb.a.getValue();
        this.j1 = ipi.b(3, new fr7(29, this));
        super.setSelectedTabIndicator(getIndicatorDrawable());
        super.setSelectedTabIndicatorColor(a93.s0.y(this).i().h);
        super.setTabIndicatorFullWidth(false);
        setBackgroundColor(0);
        setTabGravity(2);
        setTabRippleColor(null);
        setClipToPadding(false);
        post(new awa(4, this));
        z7j.c(vid.a(TabLayout.class), this, "requestedTabMinWidth", 0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final GradientDrawable getIndicatorDrawable() {
        return (GradientDrawable) this.j1.getValue();
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        super.setSelectedTabIndicatorColor(yebVar.i().h);
        a93.h(a93.s0.x(getContext()), this);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            layoutParams.height = kti.d(40 * vw4.d().getDisplayMetrics().density);
        }
        super.setLayoutParams(layoutParams);
    }
}
