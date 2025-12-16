package com.avito.android.user_adverts.root_screen.adverts_host.scroll_proxy_view;

import QI0.a;
import Y61.k;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import kotlin.Metadata;

/* compiled from: ScrollProxyBehavior.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\f\b\u0000\u0010\u0003*\u00020\u0001*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/scroll_proxy_view/ScrollProxyBehavior;", "Landroid/view/View;", "LQI0/a;", "V", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$c;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ScrollProxyBehavior<V extends View & a> extends CoordinatorLayout.c<V> {
    public ScrollProxyBehavior(@k Context context, @k AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void o(@k CoordinatorLayout coordinatorLayout, @k V v12, @k View view, int i12, int i13, int i14, int i15, int i16, @k int[] iArr) {
        if (i15 < 0) {
            v12.a(1);
        } else if (i15 > 0) {
            v12.a(-1);
        } else {
            v12.a(0);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean s(@k CoordinatorLayout coordinatorLayout, @k V v12, @k View view, @k View view2, int i12, int i13) {
        v12.a(0);
        return i12 == 2;
    }
}
