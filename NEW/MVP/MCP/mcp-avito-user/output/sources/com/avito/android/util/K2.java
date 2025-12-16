package com.avito.android.util;

import android.R;
import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import com.avito.android.publish.objects.RunnableC33945f;
import kotlin.Metadata;

/* compiled from: Keyboards.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common-discouraged_utils_android"}, k = 2, mv = {1, 9, 0}, xi = 48)
@X41.i
/* loaded from: classes5.dex */
public final class K2 {
    public static H2 a(Activity activity, Y41.l lVar) {
        return new H2(lVar, activity.findViewById(R.id.content), false);
    }

    public static H2 b(View view, Y41.l lVar) {
        return new H2(lVar, view, false);
    }

    public static final void c(@Y61.k Activity activity) {
        B6.f318559a.getClass();
        View currentFocus = activity.getCurrentFocus();
        boolean zA2 = currentFocus == null ? true : B6.a(currentFocus);
        View currentFocus2 = activity.getCurrentFocus();
        if (currentFocus2 != null) {
            d(currentFocus2, zA2);
        }
    }

    @X41.j
    public static final void d(@Y61.k View view, boolean z12) {
        ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getRootView().getWindowToken(), 0);
        if (z12) {
            B6.f318559a.getClass();
            if (B6.a(view)) {
                return;
            }
            view.getRootView().clearFocus();
        }
    }

    @Y61.l
    public static final void e(@Y61.k Fragment fragment) {
        ActivityC22955m activityC22955mL1 = fragment.l1();
        if (activityC22955mL1 != null) {
            c(activityC22955mL1);
            kotlin.G0 g02 = kotlin.G0.f406611a;
        }
    }

    public static void f(View view, int i12) {
        g(view, (i12 & 1) != 0 ? 2 : 0, null, (i12 & 2) != 0 ? 5 : 10);
    }

    public static final void g(View view, int i12, InputMethodManager inputMethodManager, int i13) {
        if (inputMethodManager == null) {
            inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
        }
        if (inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), i12) || i13 <= 0) {
            return;
        }
        view.post(new RunnableC33945f(view, i12, inputMethodManager, i13));
    }

    @Y61.k
    public static final io.reactivex.rxjava3.internal.operators.observable.C h(@Y61.k Activity activity) {
        return new io.reactivex.rxjava3.internal.operators.observable.C(new E1(activity, 2));
    }

    public static void i(View view) {
        view.requestFocus();
        ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 1);
    }

    public static final void j(@Y61.k View view, int i12) {
        if (view.isFocusable() || view.isFocusableInTouchMode()) {
            InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
            if (view.requestFocus() && inputMethodManager.isActive(view) && inputMethodManager.showSoftInput(view, i12)) {
                return;
            }
            view.postDelayed(new com.avito.android.serp.adapter.gallery.q(view, i12, 1), 100L);
        }
    }

    public static void k(View view, int i12) {
        int i13 = (i12 & 2) != 0 ? 5 : 10;
        view.requestFocus();
        l(view, null, i13);
    }

    public static final void l(View view, InputMethodManager inputMethodManager, int i12) {
        if (view.isFocused()) {
            if (inputMethodManager == null) {
                inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
            }
            if (inputMethodManager.showSoftInput(view, 1) || i12 <= 0) {
                return;
            }
            view.post(new androidx.media3.exoplayer.drm.d(view, inputMethodManager, i12, 7));
        }
    }
}
