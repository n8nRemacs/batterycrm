package defpackage;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: classes2.dex */
public final class tr0 extends qj0 {
    public final h88 a;
    public final uxa b;
    public final zd7 c;
    public final TextView d;
    public final TextView o;

    public tr0(Context context) {
        super(context);
        h88 h88Var = new h88(null, new i6(17, this), 5);
        this.a = h88Var;
        uxa uxaVar = new uxa(context);
        float f = 72;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density));
        float f2 = 24;
        layoutParams.topMargin = kti.d(vw4.d().getDisplayMetrics().density * f2);
        layoutParams.bottomMargin = kti.d(16 * vw4.d().getDisplayMetrics().density);
        layoutParams.gravity = 1;
        uxaVar.setLayoutParams(layoutParams);
        this.b = uxaVar;
        zd7 zd7Var = new zd7(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        float f3 = 1;
        layoutParams2.setMargins(kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(f3 * vw4.d().getDisplayMetrics().density), kti.d(vw4.d().getDisplayMetrics().density * f2));
        zd7Var.setLayoutParams(layoutParams2);
        zd7Var.setOutlineProvider(new ls0(1, vw4.d().getDisplayMetrics().density * 21.0f));
        this.c = zd7Var;
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 1;
        layoutParams3.leftMargin = kti.d(vw4.d().getDisplayMetrics().density * f2);
        layoutParams3.rightMargin = kti.d(vw4.d().getDisplayMetrics().density * f2);
        textView.setLayoutParams(layoutParams3);
        textView.setGravity(1);
        textView.setTransformationMethod(h88Var);
        dpg.d.b(textView, t75.b);
        this.d = textView;
        TextView textView2 = new TextView(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 1;
        layoutParams4.leftMargin = kti.d(vw4.d().getDisplayMetrics().density * f2);
        layoutParams4.topMargin = kti.d(8 * vw4.d().getDisplayMetrics().density);
        layoutParams4.rightMargin = kti.d(vw4.d().getDisplayMetrics().density * f2);
        layoutParams4.bottomMargin = kti.d(f2 * vw4.d().getDisplayMetrics().density);
        textView2.setLayoutParams(layoutParams4);
        textView2.setGravity(1);
        if (y78.a == null) {
            y78.a = new y78();
        }
        textView2.setMovementMethod(y78.a);
        dpg.G.b(textView2, t75.b);
        this.o = textView2;
        addView(uxaVar);
        addView(zd7Var);
        addView(textView);
        addView(textView2);
        setMinimumWidth(kti.d(272 * vw4.d().getDisplayMetrics().density));
        int iD = kti.d(0 * vw4.d().getDisplayMetrics().density);
        setPadding(iD, iD, iD, iD);
        onThemeChanged(a93.s0.x(context).k());
    }

    private final void setupWithAvatar(sd5 sd5Var) {
        this.c.setVisibility(8);
        uxa uxaVar = this.b;
        uxaVar.setVisibility(0);
        String str = sd5Var.a;
        Long lValueOf = Long.valueOf(sd5Var.c);
        CharSequence charSequence = sd5Var.b;
        if (charSequence == null) {
            charSequence = "";
        }
        uxa.n(uxaVar, str, lValueOf, charSequence);
    }

    private final void setupWithCustomImage(od7 od7Var) {
        this.b.setVisibility(8);
        zd7 zd7Var = this.c;
        zd7Var.setVisibility(0);
        zd7Var.setImageAttach(od7Var);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.a = null;
    }

    @Override // defpackage.qj0, defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        super.onThemeChanged(yebVar);
        this.d.setTextColor(yebVar.getText().e);
        this.o.setTextColor(yebVar.getText().g);
    }

    public final void setLinkListener(e88 e88Var) {
        this.a.a = e88Var;
    }

    public final void setState(sd5 sd5Var) {
        s5g s5gVar = sd5Var.f;
        od7 od7Var = sd5Var.d;
        if (od7Var != null) {
            setupWithCustomImage(od7Var);
        } else {
            setupWithAvatar(sd5Var);
        }
        CharSequence charSequenceD = sd5Var.e.d(this);
        if (charSequenceD == null) {
            charSequenceD = "";
        }
        TextView textView = this.d;
        textView.setText(charSequenceD);
        CharSequence charSequenceD2 = s5gVar.d(this);
        int i = charSequenceD2 == null || charSequenceD2.length() == 0 ? 8 : 0;
        TextView textView2 = this.o;
        textView2.setVisibility(i);
        CharSequence charSequenceD3 = s5gVar.d(this);
        textView2.setText(charSequenceD3 != null ? charSequenceD3 : "");
        CharSequence text = textView.getText();
        h88 h88Var = this.a;
        h88Var.c(text);
        if (textView2.getVisibility() == 0) {
            h88Var.c(textView2.getText());
        }
    }
}
