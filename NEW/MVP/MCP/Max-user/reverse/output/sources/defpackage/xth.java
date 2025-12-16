package defpackage;

import android.app.Activity;
import android.view.Window;
import android.view.WindowManager;
import kotlin.coroutines.Continuation;
import one.me.webapp.rootscreen.WebAppRootScreen;

/* loaded from: classes2.dex */
public final class xth extends dtf implements sm6 {
    public final /* synthetic */ WebAppRootScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xth(Continuation continuation, WebAppRootScreen webAppRootScreen) {
        super(2, continuation);
        this.X = webAppRootScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        xth xthVar = (xth) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        xthVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        xth xthVar = new xth(continuation, this.X);
        xthVar.o = obj;
        return xthVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Window window;
        WindowManager.LayoutParams attributes;
        Window window2;
        WindowManager.LayoutParams attributes2;
        g8j.b(obj);
        boolean zBooleanValue = ((Boolean) this.o).booleanValue();
        WebAppRootScreen webAppRootScreen = this.X;
        if (zBooleanValue) {
            yy7[] yy7VarArr = WebAppRootScreen.R0;
            Activity activity = webAppRootScreen.getActivity();
            if (activity != null && (window2 = activity.getWindow()) != null && (attributes2 = window2.getAttributes()) != null) {
                attributes2.screenBrightness = 1.0f;
                Window window3 = activity.getWindow();
                if (window3 != null) {
                    window3.setAttributes(attributes2);
                }
            }
        } else {
            yy7[] yy7VarArr2 = WebAppRootScreen.R0;
            Activity activity2 = webAppRootScreen.getActivity();
            if (activity2 != null && (window = activity2.getWindow()) != null && (attributes = window.getAttributes()) != null) {
                attributes.screenBrightness = -1.0f;
                Window window4 = activity2.getWindow();
                if (window4 != null) {
                    window4.setAttributes(attributes);
                }
            }
        }
        return qqg.a;
    }
}
