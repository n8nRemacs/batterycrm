package defpackage;

import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes2.dex */
public final class z28 extends jkf implements u6g {
    public final AppCompatTextView d;

    public z28(AppCompatTextView appCompatTextView) {
        super(appCompatTextView);
        this.d = appCompatTextView;
        xhd xhdVar = new xhd(-1, kti.d(28 * vw4.d().getDisplayMetrics().density));
        ((ViewGroup.MarginLayoutParams) xhdVar).topMargin = (int) (vw4.d().getDisplayMetrics().density * 20.5f);
        appCompatTextView.setLayoutParams(xhdVar);
        appCompatTextView.setGravity(16);
        float f = 12;
        appCompatTextView.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f), 0, kti.d(f * vw4.d().getDisplayMetrics().density), 0);
        onThemeChanged(a93.s0.y(appCompatTextView));
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        t5g t5gVar = dpg.k;
        AppCompatTextView appCompatTextView = this.d;
        t5gVar.b(appCompatTextView, t75.b);
        appCompatTextView.setTextColor(yebVar.getText().i);
        appCompatTextView.setBackgroundColor(yebVar.b().l);
    }
}
