package com.avito.android.lib.design.tab_group.layout;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.avito.android.lib.design.tab_group.TabGroup;
import kotlin.Metadata;

/* compiled from: TabGroupLayoutViewPagerExt.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/tab_group/layout/f;", "Landroid/view/View$OnAttachStateChangeListener;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f implements View.OnAttachStateChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewPager f180804b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f180805c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TabGroup f180806d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n f180807e;

    public f(ViewPager viewPager, h hVar, TabGroup tabGroup, n nVar) {
        this.f180804b = viewPager;
        this.f180805c = hVar;
        this.f180806d = tabGroup;
        this.f180807e = nVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(@Y61.k View view) {
        this.f180804b.u(this.f180805c);
        n nVar = this.f180807e;
        TabGroup tabGroup = this.f180806d;
        tabGroup.m(nVar);
        tabGroup.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(@Y61.k View view) {
    }
}
