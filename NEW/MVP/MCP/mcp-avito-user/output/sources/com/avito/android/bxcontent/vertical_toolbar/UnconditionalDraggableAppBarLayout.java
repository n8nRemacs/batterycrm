package com.avito.android.bxcontent.vertical_toolbar;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.util.AttributeSet;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: UnconditionalDraggableAppBarLayout.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001J\u0015\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/bxcontent/vertical_toolbar/UnconditionalDraggableAppBarLayout;", "Lcom/google/android/material/appbar/AppBarLayout;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$c;", "getBehavior", "()Landroidx/coordinatorlayout/widget/CoordinatorLayout$c;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class UnconditionalDraggableAppBarLayout extends AppBarLayout {

    /* compiled from: UnconditionalDraggableAppBarLayout.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/bxcontent/vertical_toolbar/UnconditionalDraggableAppBarLayout$a", "Lcom/google/android/material/appbar/AppBarLayout$Behavior$a;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends AppBarLayout.Behavior.a {
        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior.b
        public final boolean a() {
            return true;
        }
    }

    @j
    public UnconditionalDraggableAppBarLayout(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // com.google.android.material.appbar.AppBarLayout, androidx.coordinatorlayout.widget.CoordinatorLayout.b
    @k
    public CoordinatorLayout.c<AppBarLayout> getBehavior() {
        a aVar = new a();
        AppBarLayout.Behavior behavior = new AppBarLayout.Behavior();
        behavior.f355745o = aVar;
        return behavior;
    }

    public UnconditionalDraggableAppBarLayout(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
    }
}
