package com.avito.android.bxcontent.vertical_toolbar.category_filter_toolbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.avito.android.util.D6;
import kotlin.Metadata;

/* compiled from: VerticalCategoryFilterToolbarView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/vertical_toolbar/category_filter_toolbar/o;", "Landroid/animation/AnimatorListenerAdapter;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class o extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f113092a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f113093b;

    public o(boolean z12, p pVar) {
        this.f113092a = z12;
        this.f113093b = pVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(@Y61.k Animator animator) {
        if (this.f113092a) {
            return;
        }
        D6.w(this.f113093b.f113097d);
    }
}
