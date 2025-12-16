package defpackage;

import android.widget.TextView;

/* loaded from: classes2.dex */
public final class a73 extends jkf implements u6g {
    public final TextView d;

    public a73(TextView textView) {
        super(textView);
        this.d = textView;
        textView.setLayoutParams(new xhd(-1, kti.d(40 * vw4.d().getDisplayMetrics().density)));
        textView.setGravity(16);
        float f = 12;
        textView.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f), 0, kti.d(f * vw4.d().getDisplayMetrics().density), 0);
        onThemeChanged(a93.s0.y(textView));
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        t5g t5gVar = dpg.n;
        TextView textView = this.d;
        t5gVar.b(textView, t75.b);
        textView.setTextColor(yebVar.getText().i);
        textView.setBackgroundColor(yebVar.b().l);
    }
}
