package com.avito.android.search_view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.avito.android.util.D6;
import kotlin.Metadata;

/* compiled from: Toolbar23SearchView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search_view/q;", "Landroid/animation/AnimatorListenerAdapter;", "_avito_search-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class q extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f264587a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Toolbar23SearchView f264588b;

    public q(View view, Toolbar23SearchView toolbar23SearchView) {
        this.f264587a = view;
        this.f264588b = toolbar23SearchView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(@Y61.k Animator animator) {
        D6.G(this.f264587a, true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(@Y61.k Animator animator) {
        View view = this.f264587a;
        view.animate().setListener(null);
        if (view.getAlpha() == 0.0f) {
            D6.w(view);
            this.f264588b.f264458U.accept(Boolean.FALSE);
        }
    }
}
