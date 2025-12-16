package com.google.android.material.appbar;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import j.N;

/* compiled from: AppBarLayout.java */
/* loaded from: classes6.dex */
class e implements androidx.core.view.accessibility.i {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f355813b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f355814c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f355815d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f355816e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout.BaseBehavior f355817f;

    public e(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i12) {
        this.f355817f = baseBehavior;
        this.f355813b = coordinatorLayout;
        this.f355814c = appBarLayout;
        this.f355815d = view;
        this.f355816e = i12;
    }

    @Override // androidx.core.view.accessibility.i
    public final boolean c(@N View view) {
        CoordinatorLayout coordinatorLayout = this.f355813b;
        View view2 = this.f355815d;
        int i12 = this.f355816e;
        this.f355817f.n(coordinatorLayout, this.f355814c, view2, 0, i12, new int[]{0, 0}, 1);
        return true;
    }
}
