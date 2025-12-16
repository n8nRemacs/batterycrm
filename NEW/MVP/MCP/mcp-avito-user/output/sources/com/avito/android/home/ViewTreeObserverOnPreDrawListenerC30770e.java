package com.avito.android.home;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import kotlin.Metadata;

/* compiled from: HomeActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/home/e;", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.home.e, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class ViewTreeObserverOnPreDrawListenerC30770e implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f162415b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ HomeActivity f162416c;

    public ViewTreeObserverOnPreDrawListenerC30770e(View view, HomeActivity homeActivity) {
        this.f162415b = view;
        this.f162416c = homeActivity;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.f162415b.getViewTreeObserver().removeOnPreDrawListener(this);
        HomeActivity homeActivity = this.f162416c;
        int i12 = com.avito.android.ui.activity.a.f304536l;
        com.avito.android.lib.util.z zVar = com.avito.android.lib.util.z.f181429a;
        Window window = homeActivity.getWindow();
        zVar.getClass();
        com.avito.android.lib.util.z.a(window, homeActivity, null);
        return true;
    }
}
