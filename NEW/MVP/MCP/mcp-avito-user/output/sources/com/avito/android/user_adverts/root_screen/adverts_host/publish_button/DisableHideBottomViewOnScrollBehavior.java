package com.avito.android.user_adverts.root_screen.adverts_host.publish_button;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DisableHideBottomViewOnScrollBehavior.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\b\u0007\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/publish_button/DisableHideBottomViewOnScrollBehavior;", "Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DisableHideBottomViewOnScrollBehavior extends HideBottomViewOnScrollBehavior<View> {

    /* renamed from: l, reason: collision with root package name */
    public boolean f313789l;

    /* JADX WARN: Multi-variable type inference failed */
    @j
    public DisableHideBottomViewOnScrollBehavior() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean s(@k CoordinatorLayout coordinatorLayout, @k View view, @k View view2, @k View view3, int i12, int i13) {
        return this.f313789l && super.s(coordinatorLayout, view, view2, view3, i12, i13);
    }

    public /* synthetic */ DisableHideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : context, (i12 & 2) != 0 ? null : attributeSet);
    }

    @j
    public DisableHideBottomViewOnScrollBehavior(@l Context context, @l AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f313789l = true;
    }
}
