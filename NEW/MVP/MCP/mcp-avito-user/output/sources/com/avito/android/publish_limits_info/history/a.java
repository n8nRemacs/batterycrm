package com.avito.android.publish_limits_info.history;

import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.avito.android.R;
import com.avito.android.publish_limits_info.history.tab.HistoryTabItem;
import com.google.android.material.tabs.TabLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PublishAdvertsHistoryHostView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish_limits_info/history/a;", "Landroidx/viewpager/widget/ViewPager$i;", "_avito_publish-limits-info_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements ViewPager.i {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.deprecated_design.tab.adapter.k<HistoryTabItem> f245811b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TabLayout f245812c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ViewPager f245813d;

    public a(@Y61.k View view, @Y61.k FragmentManager fragmentManager) {
        com.avito.android.lib.deprecated_design.tab.adapter.k<HistoryTabItem> kVar = new com.avito.android.lib.deprecated_design.tab.adapter.k<>();
        this.f245811b = kVar;
        View viewFindViewById = view.findViewById(R.id.tabs);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.tabs.TabLayout");
        }
        TabLayout tabLayout = (TabLayout) viewFindViewById;
        this.f245812c = tabLayout;
        View viewFindViewById2 = view.findViewById(R.id.pager);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.viewpager.widget.ViewPager");
        }
        ViewPager viewPager = (ViewPager) viewFindViewById2;
        this.f245813d = viewPager;
        q qVar = new q(fragmentManager, kVar);
        com.avito.android.lib.deprecated_design.tab.l.e(tabLayout, new com.avito.android.lib.deprecated_design.tab.c(kVar, view.getContext(), R.layout.tab_shortcut_with_static_counter));
        viewPager.setAdapter(qVar);
        viewPager.c(this);
        tabLayout.setupWithViewPager(viewPager);
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public final void b(int i12) {
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public final void c(int i12) {
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public final void h(int i12, float f12, int i13) {
    }
}
