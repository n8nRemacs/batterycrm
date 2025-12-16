package com.avito.android.extended_profile;

import android.app.Application;
import android.content.Intent;
import com.avito.android.CalledFrom;
import com.avito.android.bottom_navigation.NavigationTab;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.extended_profile_tabs.ExtendedProfileTabsArguments;
import com.avito.android.remote.model.FloatingBuyBlock;
import com.avito.android.remote.model.SearchParams;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ExtendedProfileIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile/o;", "Lcom/avito/android/extended_profile/n;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.extended_profile.o, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30477o implements InterfaceC30476n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Application f150438a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.L f150439b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.extended_profile_tabs.e f150440c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.navigation.a f150441d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final gD.f f150442e;

    @Inject
    public C30477o(@Y61.k Application application, @Y61.k com.avito.android.L l12, @Y61.k com.avito.android.extended_profile_tabs.e eVar, @Y61.k com.avito.android.navigation.a aVar, @Y61.k gD.f fVar) {
        this.f150438a = application;
        this.f150439b = l12;
        this.f150440c = eVar;
        this.f150441d = aVar;
        this.f150442e = fVar;
    }

    @Override // com.avito.android.extended_profile.InterfaceC30476n
    @Y61.k
    public final Intent a(@Y61.k String str, @Y61.l String str2, @Y61.l SearchParams searchParams, @Y61.l CalledFrom calledFrom, @Y61.l FloatingBuyBlock floatingBuyBlock) {
        NavigationTabSetItem navigationTabSetItemA = this.f150441d.a();
        if (navigationTabSetItemA == null && calledFrom != null && calledFrom.c()) {
            navigationTabSetItemA = NavigationTab.f106970f;
        }
        gD.f fVar = this.f150442e;
        fVar.getClass();
        kotlin.reflect.n<Object> nVar = gD.f.f396389r[6];
        if (((Boolean) fVar.f396395g.a().invoke()).booleanValue()) {
            return this.f150440c.a(new ExtendedProfileTabsArguments(new ExtendedProfileTabsArguments.ExtendedProfileTab.Profile(str, str2, searchParams, floatingBuyBlock)), calledFrom);
        }
        ExtendedProfileArguments extendedProfileArguments = new ExtendedProfileArguments(floatingBuyBlock, searchParams, str, str2, false);
        if (navigationTabSetItemA == null) {
            return new Intent(this.f150438a, (Class<?>) ExtendedProfileActivity.class).putExtra("extra_args", extendedProfileArguments);
        }
        return this.f150439b.d(new ExtendedProfileFragmentData(extendedProfileArguments, navigationTabSetItemA));
    }
}
