package defpackage;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: classes2.dex */
public final class cyd extends qj0 {
    public final uxa a;
    public final TextView b;
    public final TextView c;

    public cyd(Context context) {
        super(context);
        float f = 24;
        setPadding(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(20 * vw4.d().getDisplayMetrics().density), kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density));
        uxa uxaVar = new uxa(context);
        float f2 = 72;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f2 * vw4.d().getDisplayMetrics().density));
        layoutParams.gravity = 1;
        uxaVar.setLayoutParams(layoutParams);
        this.a = uxaVar;
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 1;
        layoutParams2.topMargin = kti.d(12 * vw4.d().getDisplayMetrics().density);
        textView.setLayoutParams(layoutParams2);
        textView.setTextAlignment(4);
        dpg.g.b(textView, t75.b);
        this.b = textView;
        TextView textView2 = new TextView(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 1;
        layoutParams3.topMargin = kti.d(8 * vw4.d().getDisplayMetrics().density);
        textView2.setLayoutParams(layoutParams3);
        dpg.o.b(textView2, t75.b);
        textView2.setTextAlignment(4);
        textView2.setGravity(17);
        this.c = textView2;
        addView(uxaVar);
        addView(textView);
        addView(textView2);
        onThemeChanged(a93.s0.x(context).k());
    }

    @Override // defpackage.qj0, defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        super.onThemeChanged(yebVar);
        this.b.setTextColor(yebVar.getText().e);
        this.c.setTextColor(yebVar.getText().h);
    }

    public final void setState(ud5 ud5Var) {
        this.a.setAvatarUrl(ud5Var.a);
        this.b.setText(ud5Var.b.d(this));
        this.c.setText(ud5Var.c.d(this));
    }
}
