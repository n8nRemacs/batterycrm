package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: classes2.dex */
public final class b94 extends LinearLayout implements u6g {
    public final TextView a;
    public final TextView b;
    public final TextView c;

    public b94(Context context) {
        super(context, null);
        TextView textView = new TextView(context);
        float f = 40;
        textView.setLayoutParams(new LinearLayout.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density)));
        textView.setGravity(17);
        this.a = textView;
        TextView textView2 = new TextView(context);
        dpg.F.b(textView2, t75.b);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, kti.d(12 * vw4.d().getDisplayMetrics().density), 0);
        layoutParams.weight = 1.0f;
        textView2.setLayoutParams(layoutParams);
        this.b = textView2;
        TextView textView3 = new TextView(context);
        dpg.J.b(textView3, t75.b);
        textView3.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.c = textView3;
        setMinimumHeight(kti.d(48 * vw4.d().getDisplayMetrics().density));
        setOrientation(0);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setGravity(16);
        setOutlineProvider(new u74(16.0f));
        setClipToOutline(true);
        addView(textView);
        addView(textView2);
        addView(textView3);
        onThemeChanged(a93.s0.y(this));
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        this.b.setTextColor(yebVar.getText().e);
        this.c.setTextColor(yebVar.getText().g);
    }

    public final void setCountryInfo(x2b x2bVar) {
        this.b.setText(x2bVar.c.b(getContext()));
        this.c.setText("+" + x2bVar.b);
        CharSequence charSequence = x2bVar.d;
        if (charSequence != null) {
            TextView textView = this.a;
            textView.setText(charSequence);
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(0, 0, kti.d(12 * vw4.d().getDisplayMetrics().density), 0);
            textView.setLayoutParams(marginLayoutParams);
        }
    }
}
