package com.avito.android.developments_agency_search.adapter.commission_promo_banner.analytics;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.konveyor.item_visibility_tracker.b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CommissionPromoBannerVisibilityFilter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/adapter/commission_promo_banner/analytics/f;", "LWV0/a;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class f extends WV0.a {

    /* renamed from: e, reason: collision with root package name */
    @k
    public final b f136241e;

    @Inject
    public f(@k b bVar) {
        super(true, true, 0.001f, 1L);
        this.f136241e = bVar;
    }

    @Override // WV0.a
    public final boolean a(@k b.InterfaceC10495b interfaceC10495b) {
        return interfaceC10495b instanceof com.avito.android.developments_agency_search.adapter.commission_promo_banner.a;
    }

    @Override // WV0.a
    public final void b(int i12, @k b.InterfaceC10495b interfaceC10495b) {
        if (interfaceC10495b instanceof com.avito.android.developments_agency_search.adapter.commission_promo_banner.a) {
            b bVar = this.f136241e;
            bVar.getClass();
            bVar.f136235a.c(new e(((com.avito.android.developments_agency_search.adapter.commission_promo_banner.a) interfaceC10495b).f136231e));
        }
    }
}
