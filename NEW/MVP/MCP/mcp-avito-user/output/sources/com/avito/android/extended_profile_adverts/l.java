package com.avito.android.extended_profile_adverts;

import androidx.fragment.app.Fragment;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.extended_profile_adverts.ProfileAdvertsFragment;
import com.avito.android.extended_profile_adverts.di.n;
import com.avito.android.public_profile.ui.tab.TabItem;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.util.C35966w1;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ProfileAdvertsTabBlueprint.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile_adverts/l;", "Lcom/avito/android/lib/deprecated_design/tab/b;", "Lcom/avito/android/public_profile/ui/tab/TabItem;", "_avito_extended-profile-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class l implements com.avito.android.lib.deprecated_design.tab.b<TabItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f150878a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Screen f150879b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f150880c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f150881d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final SearchParams f150882e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ProfileAdvertsFragment.a f150883f = new ProfileAdvertsFragment.a();

    @Inject
    public l(@n.i @Y61.k String str, @Y61.k @k Screen screen, @k boolean z12, @Y61.l @n.c String str2, @n.a @Y61.l SearchParams searchParams) {
        this.f150878a = str;
        this.f150879b = screen;
        this.f150880c = z12;
        this.f150881d = str2;
        this.f150882e = searchParams;
    }

    @Override // com.avito.android.lib.deprecated_design.tab.b
    @Y61.l
    public final Fragment a(@Y61.k com.avito.android.lib.deprecated_design.tab.a aVar) {
        TabItem tabItem = (TabItem) aVar;
        this.f150883f.getClass();
        ProfileAdvertsFragment profileAdvertsFragment = new ProfileAdvertsFragment();
        C35966w1.a(profileAdvertsFragment, 10, new a(this.f150878a, tabItem.f231826g, tabItem.f231827h, tabItem.f231825f, this.f150879b, this.f150880c, this.f150881d, tabItem.f231828i, tabItem.f231829j, this.f150882e));
        return profileAdvertsFragment;
    }

    @Override // com.avito.android.lib.deprecated_design.tab.b
    public final boolean b(@Y61.k com.avito.android.lib.deprecated_design.tab.a aVar) {
        return aVar instanceof TabItem;
    }
}
