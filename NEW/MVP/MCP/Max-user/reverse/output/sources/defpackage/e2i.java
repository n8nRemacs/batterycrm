package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import one.me.login.welcome.WelcomeScreen;

/* loaded from: classes2.dex */
public final class e2i extends ClickableSpan {
    public final /* synthetic */ int a;
    public final /* synthetic */ WelcomeScreen b;

    public /* synthetic */ e2i(WelcomeScreen welcomeScreen, int i) {
        this.a = i;
        this.b = welcomeScreen;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                WelcomeScreen welcomeScreen = this.b;
                ((dd) welcomeScreen.c.getValue()).f("MESSAGE_LINK_OPEN", "text");
                WelcomeScreen.y0(welcomeScreen, z7.e(welcomeScreen.getContext(), mvd.R0));
                break;
            default:
                WelcomeScreen welcomeScreen2 = this.b;
                ((dd) welcomeScreen2.c.getValue()).f("MESSAGE_LINK_OPEN", "text");
                WelcomeScreen.y0(welcomeScreen2, z7.e(welcomeScreen2.getContext(), mvd.S0));
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
            default:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                break;
        }
    }
}
