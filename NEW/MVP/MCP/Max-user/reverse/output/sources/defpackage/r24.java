package defpackage;

import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes2.dex */
public final class r24 extends jkf implements u6g {
    public final AppCompatTextView d;

    public r24(AppCompatTextView appCompatTextView) {
        super(appCompatTextView);
        this.d = appCompatTextView;
        appCompatTextView.setLayoutParams(new xhd(-1, kti.d(40 * vw4.d().getDisplayMetrics().density)));
        appCompatTextView.setGravity(16);
        float f = 12;
        appCompatTextView.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f), 0, kti.d(f * vw4.d().getDisplayMetrics().density), 0);
        onThemeChanged(a93.s0.y(appCompatTextView));
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        t5g t5gVar = dpg.n;
        AppCompatTextView appCompatTextView = this.d;
        t5gVar.b(appCompatTextView, t75.b);
        appCompatTextView.setTextColor(yebVar.getText().i);
        appCompatTextView.setBackgroundColor(yebVar.b().l);
    }
}
