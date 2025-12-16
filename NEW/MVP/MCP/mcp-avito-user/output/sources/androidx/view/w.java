package androidx.view;

import android.view.inputmethod.InputMethodManager;
import androidx.view.InterfaceC22979L;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import j.N;
import j.X;

/* compiled from: ImmLeaksCleaner.java */
@X
/* loaded from: classes.dex */
final class w implements InterfaceC22979L {

    /* renamed from: b, reason: collision with root package name */
    public static int f21285b;

    @Override // androidx.view.InterfaceC22979L
    public final void HH(@N InterfaceC22983P interfaceC22983P, @N Lifecycle.Event event) throws SecurityException {
        if (event != Lifecycle.Event.ON_DESTROY) {
            return;
        }
        if (f21285b == 0) {
            try {
                f21285b = 2;
                InputMethodManager.class.getDeclaredField("mServedView").setAccessible(true);
                InputMethodManager.class.getDeclaredField("mNextServedView").setAccessible(true);
                InputMethodManager.class.getDeclaredField("mH").setAccessible(true);
                f21285b = 1;
            } catch (NoSuchFieldException unused) {
            }
        }
        if (f21285b == 1) {
            throw null;
        }
    }
}
