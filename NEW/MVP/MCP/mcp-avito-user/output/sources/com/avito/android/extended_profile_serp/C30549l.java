package com.avito.android.extended_profile_serp;

import android.content.Context;
import android.content.Intent;
import com.avito.android.CalledFrom;
import com.avito.android.bottom_navigation.NavigationTab;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.extended_profile_tabs.ExtendedProfileTabsArguments;
import com.avito.android.remote.model.SearchParam;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ExtendedProfileSerpIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_serp/l;", "Lcom/avito/android/extended_profile_serp/k;", "_avito_extended-profile-serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.extended_profile_serp.l, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30549l implements InterfaceC30548k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f152888a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.L f152889b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.extended_profile_tabs.e f152890c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.navigation.a f152891d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final gD.f f152892e;

    @Inject
    public C30549l(@Y61.k Context context, @Y61.k com.avito.android.L l12, @Y61.k com.avito.android.extended_profile_tabs.e eVar, @Y61.k com.avito.android.navigation.a aVar, @Y61.k gD.f fVar) {
        this.f152888a = context;
        this.f152889b = l12;
        this.f152890c = eVar;
        this.f152891d = aVar;
        this.f152892e = fVar;
    }

    @Override // com.avito.android.extended_profile_serp.InterfaceC30548k
    @Y61.k
    public final Intent a(@Y61.k ExtendedProfileSerpConfig extendedProfileSerpConfig, @Y61.l CalledFrom calledFrom) {
        NavigationTabSetItem navigationTabSetItemA = this.f152891d.a();
        if (navigationTabSetItemA == null) {
            navigationTabSetItemA = (calledFrom == null || !calledFrom.c()) ? null : NavigationTab.f106970f;
        }
        gD.f fVar = this.f152892e;
        fVar.getClass();
        kotlin.reflect.n<Object> nVar = gD.f.f396389r[6];
        if (((Boolean) fVar.f396395g.a().invoke()).booleanValue()) {
            Map<String, SearchParam<?>> params = extendedProfileSerpConfig.f152444d.getParams();
            if ((params != null ? params.get("166812") : null) == null) {
                return this.f152890c.a(new ExtendedProfileTabsArguments(new ExtendedProfileTabsArguments.ExtendedProfileTab.Search(extendedProfileSerpConfig.f152442b, extendedProfileSerpConfig.f152443c, extendedProfileSerpConfig.f152444d, extendedProfileSerpConfig.f152445e, extendedProfileSerpConfig.f152446f, extendedProfileSerpConfig.f152447g)), calledFrom);
            }
        }
        if (navigationTabSetItemA == null) {
            return new Intent(this.f152888a, (Class<?>) ExtendedProfileSerpActivity.class).putExtra("extra_args", extendedProfileSerpConfig);
        }
        return this.f152889b.d(new ExtendedProfileSerpFragmentData(extendedProfileSerpConfig, navigationTabSetItemA));
    }
}
