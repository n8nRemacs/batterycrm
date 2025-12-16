package com.avito.android.user_adverts.root_screen.adverts_host;

import androidx.core.os.C22777e;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.avito.android.analytics.screens.UserAdvertsScreen;
import com.avito.android.user_adverts.space.UserAdvertsSpace;
import com.avito.android.user_adverts.tab_screens.UserAdvertsListData;
import com.avito.android.user_adverts.tab_screens.adverts.UserAdvertsListMviFragment;
import kotlin.Metadata;

/* compiled from: TabPagerAdapter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/a;", "Landroidx/fragment/app/F;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35563a extends androidx.fragment.app.F {

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.deprecated_design.tab.adapter.j<TabItem> f312362j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final UserAdvertsSpace f312363k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public Fragment f312364l;

    public C35563a(@Y61.k FragmentManager fragmentManager, @Y61.k com.avito.android.lib.deprecated_design.tab.adapter.j<TabItem> jVar, @Y61.k UserAdvertsSpace userAdvertsSpace) {
        super(fragmentManager, 1);
        this.f312362j = jVar;
        this.f312363k = userAdvertsSpace;
    }

    @Override // androidx.viewpager.widget.a
    public final int c() {
        return this.f312362j.getCount();
    }

    @Override // androidx.viewpager.widget.a
    @Y61.l
    public final CharSequence e(int i12) {
        return this.f312362j.getItem(i12).f312285b;
    }

    @Override // androidx.fragment.app.F, androidx.viewpager.widget.a
    public final void l(@Y61.k ViewPager viewPager, int i12, @Y61.k Object obj) {
        super.l(viewPager, i12, obj);
        this.f312364l = (Fragment) obj;
    }

    @Override // androidx.fragment.app.F
    @Y61.k
    public final Fragment o(int i12) {
        TabItem item = this.f312362j.getItem(i12);
        String str = item.f312286c;
        Integer num = item.f312287d;
        UserAdvertsListData userAdvertsListData = new UserAdvertsListData(str, i12, num != null ? num.intValue() : 0, this.f312363k, item.f312288e, UserAdvertsScreen.f90543d, true);
        UserAdvertsListMviFragment.f314828R0.getClass();
        UserAdvertsListMviFragment userAdvertsListMviFragment = new UserAdvertsListMviFragment();
        userAdvertsListMviFragment.setArguments(C22777e.b(new kotlin.Q("key_user_adverts_list_data", userAdvertsListData)));
        return userAdvertsListMviFragment;
    }
}
