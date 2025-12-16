package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes2.dex */
public final class g08 extends TabLayout implements u6g {
    public final Object i1;

    public g08(Context context) {
        super(context, null);
        this.i1 = ipi.b(3, new i77(28));
        setSelectedTabIndicator(getIndicatorDrawable());
        v1a v1aVar = a93.s0;
        setSelectedTabIndicatorColor(v1aVar.y(this).b().a.h);
        setTabIndicatorFullWidth(false);
        mgb.a(this, new ue(29, this, this));
        setTabIndicatorAnimationMode(1);
        setTabTextColors(TabLayout.f(v1aVar.y(this).getText().e, v1aVar.y(this).getText().g));
        setBackgroundColor(0);
        setTabRippleColor(null);
        setClipToPadding(false);
        int iD = kti.d(2 * vw4.d().getDisplayMetrics().density);
        z7j.c(vid.a(TabLayout.class), this, "tabPaddingStart", Integer.valueOf(iD));
        z7j.c(vid.a(TabLayout.class), this, "tabPaddingEnd", Integer.valueOf(iD));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final GradientDrawable getIndicatorDrawable() {
        return (GradientDrawable) this.i1.getValue();
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        setSelectedTabIndicatorColor(yebVar.b().a.h);
        v1a v1aVar = a93.s0;
        setTabTextColors(TabLayout.f(v1aVar.y(this).getText().e, v1aVar.y(this).getText().g));
        a93.h(v1aVar.x(getContext()), this);
    }
}
