package defpackage;

import android.content.Context;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import one.me.profile.ProfileScreen;

/* loaded from: classes2.dex */
public final class du2 extends LinearLayout implements e88, ab3 {
    public cu2 a;
    public final h88 b;
    public final TextView c;

    public du2(Context context) {
        super(context, null);
        bb3 bb3Var = new bb3(context, this);
        h88 h88Var = new h88(this, new hk1(13, this), 4);
        this.b = h88Var;
        TextView textView = new TextView(context);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        dpg.h.b(textView, t75.b);
        textView.setMovementMethod(bb3Var);
        textView.setTransformationMethod(h88Var);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        tqi.c(new x9(3, null, 5), textView);
        textView.setGravity(16);
        this.c = textView;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setOrientation(1);
        float f = 12;
        setPaddingRelative(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density));
        addView(textView);
    }

    @Override // defpackage.e88
    public final void b(String str, i88 i88Var, ClickableSpan clickableSpan) {
        cu2 cu2Var = this.a;
        if (cu2Var != null) {
            ProfileScreen profileScreen = (ProfileScreen) ((amc) ((ukd) ((a3b) cu2Var).b).b).o;
            profileScreen.D0().C(1, str, i88Var);
            profileScreen.D0().z(str, i88Var);
        }
    }

    public final cu2 getListener() {
        return this.a;
    }

    @Override // defpackage.ab3
    public final boolean k(ClickableSpan clickableSpan, int i, int i2, String str, i88 i88Var, MotionEvent motionEvent) {
        cu2 cu2Var = this.a;
        if (cu2Var == null) {
            return false;
        }
        ((ProfileScreen) ((amc) ((ukd) ((a3b) cu2Var).b).b).o).E0(str, i88Var, motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        CharSequence text = this.c.getText();
        Spannable spannable = text instanceof Spannable ? (Spannable) text : null;
        if (spannable == null) {
            return;
        }
        this.b.c(spannable);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CharSequence text = this.c.getText();
        Spannable spannable = text instanceof Spannable ? (Spannable) text : null;
        if (spannable == null) {
            return;
        }
        this.b.getClass();
        h88.a(spannable);
    }

    public final void setDescription(CharSequence charSequence) {
        TextView textView = this.c;
        CharSequence text = textView.getText();
        Spannable spannable = text instanceof Spannable ? (Spannable) text : null;
        h88 h88Var = this.b;
        if (spannable != null) {
            h88Var.getClass();
            h88.a(spannable);
        }
        textView.setText(charSequence);
        textView.setTransformationMethod(h88Var);
        CharSequence text2 = textView.getText();
        Spannable spannable2 = text2 instanceof Spannable ? (Spannable) text2 : null;
        if (spannable2 == null) {
            return;
        }
        h88Var.c(spannable2);
    }

    public final void setListener(cu2 cu2Var) {
        this.a = cu2Var;
    }
}
