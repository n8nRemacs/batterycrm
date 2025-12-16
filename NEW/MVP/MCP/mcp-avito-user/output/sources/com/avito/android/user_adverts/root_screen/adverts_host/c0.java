package com.avito.android.user_adverts.root_screen.adverts_host;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewpager.widget.ViewPager;
import kotlin.Metadata;

/* compiled from: UserAdvertsHostView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/c0;", "Landroidx/viewpager/widget/ViewPager$i;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c0 implements ViewPager.i {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SwipeRefreshLayout f312530b;

    public c0(SwipeRefreshLayout swipeRefreshLayout) {
        this.f312530b = swipeRefreshLayout;
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public final void c(int i12) {
        SwipeRefreshLayout swipeRefreshLayout = this.f312530b;
        if (swipeRefreshLayout.f54568d) {
            return;
        }
        swipeRefreshLayout.setEnabled(i12 == 0);
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public final void b(int i12) {
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public final void h(int i12, float f12, int i13) {
    }
}
