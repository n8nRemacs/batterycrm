package com.avito.android.publish.scanner;

import android.R;
import android.content.res.Resources;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.Snackbar;
import kotlin.Metadata;

/* compiled from: FloatingButtonBehavior.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/publish/scanner/FloatingButtonBehavior;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$c;", "Landroid/view/View;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class FloatingButtonBehavior extends CoordinatorLayout.c<View> {
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean d(@Y61.k View view, @Y61.k View view2) {
        return view2 instanceof Snackbar.SnackbarLayout;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean f(@Y61.k CoordinatorLayout coordinatorLayout, @Y61.k View view, @Y61.k View view2) {
        if (view.getTranslationY() > 0.0f) {
            return true;
        }
        view.setTranslationY(Math.min(0.0f, view2.getTranslationY() - view2.getHeight()));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void g(@Y61.k CoordinatorLayout coordinatorLayout, @Y61.k View view, @Y61.k View view2) throws Resources.NotFoundException {
        view.animate().translationY(0.0f).setDuration(view.getResources().getInteger(R.integer.config_shortAnimTime));
    }
}
