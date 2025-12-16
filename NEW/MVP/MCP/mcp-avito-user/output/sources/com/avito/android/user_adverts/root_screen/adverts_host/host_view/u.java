package com.avito.android.user_adverts.root_screen.adverts_host.host_view;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: View.kt */
@s0
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "androidx/core/view/t0", "core-ktx_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class u implements View.OnLayoutChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f313096b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout.Behavior.a f313097c;

    public u(AppBarLayout appBarLayout, AppBarLayout.Behavior.a aVar) {
        this.f313096b = appBarLayout;
        this.f313097c = aVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        view.removeOnLayoutChangeListener(this);
        ViewGroup.LayoutParams layoutParams = this.f313096b.getLayoutParams();
        CoordinatorLayout.g gVar = layoutParams instanceof CoordinatorLayout.g ? (CoordinatorLayout.g) layoutParams : null;
        Object obj = gVar != null ? gVar.f44447a : null;
        AppBarLayout.Behavior behavior = obj instanceof AppBarLayout.Behavior ? (AppBarLayout.Behavior) obj : null;
        if (behavior != null) {
            behavior.f355745o = this.f313097c;
        }
    }
}
