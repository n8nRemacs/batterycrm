package com.avito.android.lib.design.tab_bar;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.view.J0;
import com.avito.android.util.C35835l0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: View.kt */
@s0
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "androidx/core/view/t0", "core-ktx_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e implements View.OnLayoutChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f180711b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TabBarLayout f180712c;

    public e(Context context, TabBarLayout tabBarLayout) {
        this.f180711b = context;
        this.f180712c = tabBarLayout;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        Window window;
        View decorView;
        view.removeOnLayoutChangeListener(this);
        Activity activityA = C35835l0.a(this.f180711b);
        if (activityA == null || (window = activityA.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        int height = decorView.getHeight() - J0.s(null, decorView.getRootWindowInsets()).e(7).f44778d;
        TabBarLayout tabBarLayout = this.f180712c;
        int measuredHeight = height - tabBarLayout.getMeasuredHeight();
        ViewGroup.LayoutParams layoutParams = tabBarLayout.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        tabBarLayout.locationInWindowY = measuredHeight - (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0);
    }
}
