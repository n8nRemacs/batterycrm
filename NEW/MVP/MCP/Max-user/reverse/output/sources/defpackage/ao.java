package defpackage;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class ao {
    public static OnBackInvokedDispatcher a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback b(Object obj, ho hoVar) {
        Objects.requireNonNull(hoVar);
        zn znVar = new zn(0, hoVar);
        e5.n(obj).registerOnBackInvokedCallback(1000000, znVar);
        return znVar;
    }

    public static void c(Object obj, Object obj2) {
        e5.n(obj).unregisterOnBackInvokedCallback(e5.j(obj2));
    }
}
