package com.avito.android.lib.design.tab_group.layout;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.avito.android.lib.design.tab_group.TabGroup;
import kotlin.Metadata;

/* compiled from: TabGroupLayoutViewPagerExt.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/tab_group/layout/g;", "Landroid/view/View$OnAttachStateChangeListener;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g implements View.OnAttachStateChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewPager2 f180808b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f180809c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TabGroup f180810d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n f180811e;

    public g(ViewPager2 viewPager2, j jVar, TabGroup tabGroup, n nVar) {
        this.f180808b = viewPager2;
        this.f180809c = jVar;
        this.f180810d = tabGroup;
        this.f180811e = nVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(@Y61.k View view) {
        this.f180808b.i(this.f180809c);
        n nVar = this.f180811e;
        TabGroup tabGroup = this.f180810d;
        tabGroup.m(nVar);
        tabGroup.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(@Y61.k View view) {
    }
}
