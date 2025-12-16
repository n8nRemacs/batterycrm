package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import one.me.profile.ProfileScreen;

/* loaded from: classes2.dex */
public final class l04 extends LinearLayout implements e88, ab3 {
    public k04 a;
    public final bb3 b;
    public final h88 c;
    public final TextView d;
    public final fn5 o;

    public l04(Context context) {
        super(context, null);
        this.b = new bb3(context, this);
        this.c = new h88(this, new hk1(25, this), 4);
        TextView textView = new TextView(context);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        dpg.l.b(textView, t75.b);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        tqi.c(new x9(3, null, 10), textView);
        textView.setGravity(8388627);
        textView.setSingleLine(true);
        this.d = textView;
        fn5 fn5Var = new fn5(context);
        fn5Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setGravity(16);
        fn5Var.setTypography(dpg.I);
        fn5Var.setCollapsedLines(5);
        fn5Var.setExpandWithAnimation(true);
        fn5Var.setOnTouchListener(new fi1(fn5Var, 1, this));
        this.o = fn5Var;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setOrientation(1);
        float f = 12;
        float f2 = 8;
        setPaddingRelative(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f * vw4.d().getDisplayMetrics().density), kti.d(f2 * vw4.d().getDisplayMetrics().density));
        addView(textView);
        addView(fn5Var);
        ViewGroup.LayoutParams layoutParams = fn5Var.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = kti.d(2 * vw4.d().getDisplayMetrics().density);
        fn5Var.setLayoutParams(marginLayoutParams);
    }

    @Override // defpackage.e88
    public final void b(String str, i88 i88Var, ClickableSpan clickableSpan) {
        k04 k04Var = this.a;
        if (k04Var != null) {
            ProfileScreen profileScreen = (ProfileScreen) ((amc) ((ukd) ((r5j) k04Var).b).b).o;
            profileScreen.D0().C(1, str, i88Var);
            profileScreen.D0().z(str, i88Var);
        }
    }

    public final k04 getListener() {
        return this.a;
    }

    @Override // defpackage.ab3
    public final boolean k(ClickableSpan clickableSpan, int i, int i2, String str, i88 i88Var, MotionEvent motionEvent) {
        k04 k04Var = this.a;
        if (k04Var == null) {
            return false;
        }
        ((ProfileScreen) ((amc) ((ukd) ((r5j) k04Var).b).b).o).E0(str, i88Var, motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        SpannableString text = this.o.getText();
        if (text == null) {
            text = null;
        }
        if (text == null) {
            return;
        }
        this.c.c(text);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        SpannableString text = this.o.getText();
        if (text == null) {
            text = null;
        }
        if (text == null) {
            return;
        }
        this.c.getClass();
        h88.a(text);
    }

    public final void setDescription(CharSequence charSequence) {
        fn5 fn5Var = this.o;
        SpannableString text = fn5Var.getText();
        if (text == null) {
            text = null;
        }
        h88 h88Var = this.c;
        if (text != null) {
            h88Var.getClass();
            h88.a(text);
        }
        fn5Var.setText(h88Var.getTransformation(charSequence, fn5Var));
        SpannableString text2 = fn5Var.getText();
        SpannableString spannableString = text2 != null ? text2 : null;
        if (spannableString == null) {
            return;
        }
        h88Var.c(spannableString);
    }

    public final void setListener(k04 k04Var) {
        this.a = k04Var;
    }

    public final void setTitle(CharSequence charSequence) {
        this.d.setText(charSequence);
    }
}
