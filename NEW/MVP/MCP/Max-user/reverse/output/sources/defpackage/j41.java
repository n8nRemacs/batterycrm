package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class j41 extends LinearLayout {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int o;
    public final int s0;
    public final TextView t0;
    public final k41 u0;

    public j41(Context context) {
        super(context, null);
        int iD = kti.d(16 * vw4.d().getDisplayMetrics().density);
        this.a = iD;
        int iD2 = kti.d(28 * vw4.d().getDisplayMetrics().density);
        this.b = iD2;
        int iD3 = kti.d(4 * vw4.d().getDisplayMetrics().density);
        this.c = iD3;
        this.d = kti.d(44 * vw4.d().getDisplayMetrics().density);
        this.o = kti.d(72 * vw4.d().getDisplayMetrics().density);
        this.s0 = kti.d(8 * vw4.d().getDisplayMetrics().density);
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = kti.d(6 * vw4.d().getDisplayMetrics().density);
        textView.setLayoutParams(layoutParams);
        textView.setText(z7.e(context, d3d.call_change_mode_text_hint));
        textView.setGravity(17);
        textView.setTextColor(a93.s0.B(textView).c.getText().g);
        dpg.m.b(textView, t75.b);
        this.t0 = textView;
        k41 k41Var = new k41(context, 0);
        k41Var.setLayoutParams(new LinearLayout.LayoutParams(iD, iD2));
        k41Var.setPadding(iD3, iD3, iD3, iD3);
        this.u0 = k41Var;
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        setOrientation(1);
        setGravity(17);
        addView(textView);
        addView(k41Var);
    }
}
