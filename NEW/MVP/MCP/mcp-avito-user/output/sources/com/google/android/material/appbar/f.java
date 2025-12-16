package com.google.android.material.appbar;

import android.view.View;
import j.N;

/* compiled from: AppBarLayout.java */
/* loaded from: classes6.dex */
class f implements androidx.core.view.accessibility.i {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f355818b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f355819c;

    public f(AppBarLayout appBarLayout, boolean z12) {
        this.f355818b = appBarLayout;
        this.f355819c = z12;
    }

    @Override // androidx.core.view.accessibility.i
    public final boolean c(@N View view) {
        this.f355818b.setExpanded(this.f355819c);
        return true;
    }
}
