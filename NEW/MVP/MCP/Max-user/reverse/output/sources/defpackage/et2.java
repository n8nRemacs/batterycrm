package defpackage;

import android.widget.TextView;

/* loaded from: classes2.dex */
public final class et2 extends jkf implements u6g {
    public final TextView d;

    public et2(TextView textView) {
        super(textView);
        this.d = textView;
        textView.setLayoutParams(new xhd(-1, -2));
        float f = 16;
        float f2 = 7;
        textView.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f * vw4.d().getDisplayMetrics().density), kti.d(f2 * vw4.d().getDisplayMetrics().density));
        dpg.k.b(textView, t75.b);
        onThemeChanged(a93.s0.y(textView));
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        int i = yebVar.getText().i;
        TextView textView = this.d;
        textView.setTextColor(i);
        textView.setBackgroundColor(yebVar.b().k);
    }
}
