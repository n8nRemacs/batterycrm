package com.avito.android.favorites;

import android.view.MenuItem;
import androidx.appcompat.widget.ActionMenuView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class j1 implements SwipeRefreshLayout.f, ActionMenuView.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x1 f157375b;

    public /* synthetic */ j1(x1 x1Var) {
        this.f157375b = x1Var;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
    public void j0() {
        this.f157375b.f157600d.b2();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.e
    public boolean onMenuItemClick(MenuItem menuItem) {
        this.f157375b.c(menuItem);
        return true;
    }
}
