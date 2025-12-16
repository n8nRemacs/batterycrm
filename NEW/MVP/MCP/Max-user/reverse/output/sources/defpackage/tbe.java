package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.concurrent.ExecutorService;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* loaded from: classes2.dex */
public final class tbe extends y0f {
    public final ExecutorService X;
    public final u4e o;

    public tbe(u4e u4eVar, ExecutorService executorService) {
        super(executorService);
        this.o = u4eVar;
        this.X = executorService;
    }

    @Override // defpackage.y0f
    /* renamed from: H */
    public final void r(d2f d2fVar, int i) throws NumberFormatException {
        ((sbe) d2fVar).z((wo6) ((t98) C(i)));
    }

    @Override // defpackage.y0f, defpackage.phd
    public final void r(mid midVar, int i) throws NumberFormatException {
        ((sbe) midVar).z((wo6) ((t98) C(i)));
    }

    @Override // defpackage.phd
    public final mid t(ViewGroup viewGroup, int i) {
        int i2 = sbe.I0;
        Context context = viewGroup.getContext();
        OneMeDraweeView oneMeDraweeView = new OneMeDraweeView(context);
        float f = 44;
        oneMeDraweeView.setLayoutParams(new LinearLayout.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density)));
        oneMeDraweeView.setOutlineProvider(new u74(vw4.d().getDisplayMetrics().density * 8.0f));
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
        dpg.h.b(appCompatTextView, t75.b);
        appCompatTextView.setPadding(kti.d(8 * vw4.d().getDisplayMetrics().density), appCompatTextView.getPaddingTop(), appCompatTextView.getPaddingRight(), appCompatTextView.getPaddingBottom());
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        linearLayout.setVerticalGravity(16);
        float f2 = 12;
        float f3 = 6;
        linearLayout.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(f2 * vw4.d().getDisplayMetrics().density), kti.d(f3 * vw4.d().getDisplayMetrics().density));
        linearLayout.addView(oneMeDraweeView);
        linearLayout.addView(appCompatTextView);
        return new sbe(this.o, oneMeDraweeView, appCompatTextView, linearLayout);
    }
}
