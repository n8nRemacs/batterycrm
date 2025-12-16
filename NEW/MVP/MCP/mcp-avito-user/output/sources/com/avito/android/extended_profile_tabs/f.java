package com.avito.android.extended_profile_tabs;

import android.app.Application;
import android.content.Intent;
import com.avito.android.CalledFrom;
import com.avito.android.L;
import com.avito.android.bottom_navigation.NavigationTab;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ExtendedProfileTabsIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_tabs/f;", "Lcom/avito/android/extended_profile_tabs/e;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Application f153199a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final L f153200b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.navigation.a f153201c;

    @Inject
    public f(@Y61.k Application application, @Y61.k L l12, @Y61.k com.avito.android.navigation.a aVar) {
        this.f153199a = application;
        this.f153200b = l12;
        this.f153201c = aVar;
    }

    @Override // com.avito.android.extended_profile_tabs.e
    @Y61.k
    public final Intent a(@Y61.k ExtendedProfileTabsArguments extendedProfileTabsArguments, @Y61.l CalledFrom calledFrom) {
        NavigationTabSetItem navigationTabSetItemA = this.f153201c.a();
        if (navigationTabSetItemA == null && calledFrom != null && calledFrom.c()) {
            navigationTabSetItemA = NavigationTab.f106970f;
        }
        if (navigationTabSetItemA == null) {
            return new Intent(this.f153199a, (Class<?>) ExtendedProfileTabsActivity.class).putExtra("extra_args", extendedProfileTabsArguments);
        }
        return this.f153200b.d(new ExtendedProfileTabsFragmentData(extendedProfileTabsArguments, navigationTabSetItemA));
    }
}
