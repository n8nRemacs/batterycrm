package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes2.dex */
public final class c62 extends d2f {
    public final cm6 E0;
    public final FrameLayout F0;
    public final AppCompatTextView G0;
    public final bwf H0;

    public c62(Context context, cm6 cm6Var) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        frameLayout.setMinimumHeight(kti.d(30 * vw4.d().getDisplayMetrics().density));
        super(frameLayout);
        this.E0 = cm6Var;
        this.F0 = frameLayout;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
        appCompatTextView.setId(w5b.m);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388627;
        appCompatTextView.setLayoutParams(layoutParams);
        dpg.k.b(appCompatTextView, t75.b);
        tqi.c(new b62(3, null, 0), appCompatTextView);
        this.G0 = appCompatTextView;
        this.H0 = new bwf(new o40(context, 29));
        frameLayout.addView(appCompatTextView);
    }

    @Override // defpackage.d2f
    public final void z(t98 t98Var) {
        if (t98Var instanceof g62) {
            g62 g62Var = (g62) t98Var;
            s5g name = g62Var.getName();
            AppCompatTextView appCompatTextView = this.G0;
            appCompatTextView.setText(name.b(appCompatTextView.getContext()));
            boolean zS = g62Var.s();
            bwf bwfVar = this.H0;
            if (zS) {
                fqi.c(this.F0, (View) bwfVar.getValue(), -1);
                ((View) bwfVar.getValue()).setVisibility(0);
                f8j.d((View) bwfVar.getValue(), 300L, new j6(10, this));
                return;
            }
            if (bwfVar.e()) {
                AppCompatImageView appCompatImageView = (AppCompatImageView) bwfVar.getValue();
                appCompatImageView.setVisibility(8);
                appCompatImageView.setOnClickListener(null);
            }
        }
    }
}
