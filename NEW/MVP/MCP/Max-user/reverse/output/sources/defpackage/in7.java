package defpackage;

import android.animation.ValueAnimator;
import android.text.Layout;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import one.me.login.inputphone.InputPhoneScreen;

/* loaded from: classes2.dex */
public final class in7 extends ClickableSpan {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ in7(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Layout layout;
        Layout layout2;
        switch (this.a) {
            case 0:
                InputPhoneScreen inputPhoneScreen = (InputPhoneScreen) this.b;
                ((dd) inputPhoneScreen.Y.getValue()).f("MESSAGE_LINK_OPEN", "text");
                InputPhoneScreen.y0(inputPhoneScreen, z7.e(inputPhoneScreen.getContext(), mvd.R0));
                break;
            case 1:
                InputPhoneScreen inputPhoneScreen2 = (InputPhoneScreen) this.b;
                ((dd) inputPhoneScreen2.Y.getValue()).f("MESSAGE_LINK_OPEN", "text");
                InputPhoneScreen.y0(inputPhoneScreen2, z7.e(inputPhoneScreen2.getContext(), mvd.S0));
                break;
            default:
                fn5 fn5Var = (fn5) this.b;
                if (!fn5Var.x0) {
                    fn5Var.y0 = true;
                    fn5Var.t0 = fn5Var.v0;
                    fn5Var.requestLayout();
                    break;
                } else if (!fn5Var.y0 && (layout = fn5Var.v0) != null && (layout2 = fn5Var.u0) != null) {
                    fn5Var.y0 = true;
                    ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(layout2.getHeight(), layout.getHeight());
                    valueAnimatorOfInt.setInterpolator(new yq5());
                    valueAnimatorOfInt.setDuration(200L);
                    valueAnimatorOfInt.addUpdateListener(new q00(12, fn5Var));
                    valueAnimatorOfInt.addListener(new pf(fn5Var, 1, layout));
                    valueAnimatorOfInt.addListener(new qe(5, fn5Var));
                    valueAnimatorOfInt.start();
                    break;
                }
                break;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.a) {
            case 0:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                break;
            case 1:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                break;
            default:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                textPaint.setColor(a93.s0.y((fn5) this.b).getText().j);
                break;
        }
    }
}
