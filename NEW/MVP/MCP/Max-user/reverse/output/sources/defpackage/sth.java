package defpackage;

import android.view.View;
import one.me.login.inputphone.InputPhoneScreen;
import one.me.login.welcome.WelcomeScreen;
import one.me.sdk.arch.Widget;
import one.me.webapp.rootscreen.WebAppRootScreen;

/* loaded from: classes2.dex */
public final /* synthetic */ class sth implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Widget b;

    public /* synthetic */ sth(Widget widget, int i) {
        this.a = i;
        this.b = widget;
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, k18] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Widget widget = this.b;
        switch (i) {
            case 0:
                yy7[] yy7VarArr = WebAppRootScreen.R0;
                uvh uvhVarN0 = ((WebAppRootScreen) widget).N0();
                uvhVarN0.getClass();
                uvhVarN0.H0.O(uvhVarN0, uvh.o1[0], xfh.o(uvhVarN0, null, new hvh(uvhVarN0, null), 1));
                break;
            default:
                jp7 jp7Var = (jp7) ((WelcomeScreen) widget).o.getValue();
                jp7Var.getClass();
                jp7Var.b(l8j.a(new InputPhoneScreen(), null, null), "InputPhoneScreen");
                break;
        }
    }
}
