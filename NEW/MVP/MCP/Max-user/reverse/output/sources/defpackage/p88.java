package defpackage;

import android.content.Context;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.method.MovementMethod;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.coroutines.Continuation;
import one.me.profile.ProfileScreen;

/* loaded from: classes2.dex */
public final class p88 extends TextView implements e88, ab3 {
    public final zlc a;
    public final h88 b;

    public p88(Context context, zlc zlcVar) {
        super(context);
        this.a = zlcVar;
        MovementMethod bb3Var = new bb3(context, this);
        h88 h88Var = new h88(this, new fr7(5, this), 4);
        this.b = h88Var;
        setId(v8b.X);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = kti.d(20 * vw4.d().getDisplayMetrics().density);
        setLayoutParams(layoutParams);
        setGravity(1);
        dpg.j.b(this, t75.b);
        setMovementMethod(bb3Var);
        setTransformationMethod(h88Var);
        tqi.c(new ld0(3, (Continuation) null, 20), this);
        setEllipsize(TextUtils.TruncateAt.END);
        setMaxLines(1);
    }

    @Override // defpackage.e88
    public final void b(String str, i88 i88Var, ClickableSpan clickableSpan) {
        ProfileScreen profileScreen = (ProfileScreen) this.a;
        profileScreen.D0().C(1, str, i88Var);
        profileScreen.D0().z(str, i88Var);
    }

    @Override // defpackage.ab3
    public final boolean k(ClickableSpan clickableSpan, int i, int i2, String str, i88 i88Var, MotionEvent motionEvent) {
        ((ProfileScreen) this.a).E0(str, i88Var, motionEvent);
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        CharSequence text = getText();
        Spannable spannable = text instanceof Spannable ? (Spannable) text : null;
        if (spannable == null) {
            return;
        }
        this.b.c(spannable);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CharSequence text = getText();
        Spannable spannable = text instanceof Spannable ? (Spannable) text : null;
        if (spannable == null) {
            return;
        }
        this.b.getClass();
        h88.a(spannable);
    }
}
