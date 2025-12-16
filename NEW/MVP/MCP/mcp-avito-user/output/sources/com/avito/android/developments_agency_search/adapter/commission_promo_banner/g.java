package com.avito.android.developments_agency_search.adapter.commission_promo_banner;

import Y61.k;
import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;

/* compiled from: CommissionPromoBannerItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/adapter/commission_promo_banner/g;", "Lcom/avito/android/developments_agency_search/adapter/commission_promo_banner/d;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class g implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.developments_agency_search.adapter.commission_promo_banner.analytics.b f136250b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final e2 f136251c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final e2 f136252d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final e2 f136253e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final e2 f136254f;

    @Inject
    public g(@k com.avito.android.developments_agency_search.adapter.commission_promo_banner.analytics.b bVar) {
        this.f136250b = bVar;
        e2 e2VarB = f2.b(0, 1, null, 5);
        this.f136251c = e2VarB;
        this.f136252d = e2VarB;
        e2 e2VarB2 = f2.b(0, 1, null, 5);
        this.f136253e = e2VarB2;
        this.f136254f = e2VarB2;
    }

    @Override // com.avito.android.developments_agency_search.adapter.commission_promo_banner.d
    @k
    /* renamed from: G6, reason: from getter */
    public final e2 getF136252d() {
        return this.f136252d;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        i iVar = (i) eVar;
        a aVar2 = (a) aVar;
        iVar.setTitle(aVar2.f136228b);
        iVar.f(aVar2.f136229c);
        iVar.AS(new e(this));
        iVar.gJ(new f(this, aVar2));
    }

    @Override // com.avito.android.developments_agency_search.adapter.commission_promo_banner.d
    @k
    /* renamed from: o4, reason: from getter */
    public final e2 getF136254f() {
        return this.f136254f;
    }
}
