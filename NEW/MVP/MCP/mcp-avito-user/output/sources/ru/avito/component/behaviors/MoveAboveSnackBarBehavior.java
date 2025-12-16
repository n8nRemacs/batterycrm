package ru.avito.component.behaviors;

import Y61.k;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.Snackbar;
import hw.InterfaceC41178c;
import kotlin.Metadata;

/* compiled from: MoveAboveSnackBarBehavior.kt */
@InterfaceC41178c
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0003\u0010\t¨\u0006\n"}, d2 = {"Lru/avito/component/behaviors/MoveAboveSnackBarBehavior;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$c;", "Landroid/view/View;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class MoveAboveSnackBarBehavior extends CoordinatorLayout.c<View> {
    public MoveAboveSnackBarBehavior() {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean d(@k View view, @k View view2) {
        return view2 instanceof Snackbar.SnackbarLayout;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean f(@k CoordinatorLayout coordinatorLayout, @k View view, @k View view2) {
        view.setTranslationY(Math.min(0.0f, view2.getTranslationY() - view2.getHeight()));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void g(@k CoordinatorLayout coordinatorLayout, @k View view, @k View view2) {
        view.setTranslationY(0.0f);
    }

    public MoveAboveSnackBarBehavior(@k Context context, @k AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
