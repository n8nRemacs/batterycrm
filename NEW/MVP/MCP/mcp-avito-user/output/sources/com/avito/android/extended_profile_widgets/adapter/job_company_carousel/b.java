package com.avito.android.extended_profile_widgets.adapter.job_company_carousel;

import FB.a;
import TV0.g;
import Y61.k;
import com.avito.android.R;
import com.avito.android.util.O2;
import javax.inject.Inject;
import javax.inject.Provider;
import kotlin.Metadata;

/* compiled from: JobCompanyCarouselBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/job_company_carousel/b;", "LTV0/b;", "Lcom/avito/android/extended_profile_widgets/adapter/job_company_carousel/g;", "Lcom/avito/android/extended_profile_widgets/adapter/job_company_carousel/JobCompanyCarouselItem;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements TV0.b<g, JobCompanyCarouselItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e f154491a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Provider<com.avito.konveyor.adapter.a> f154492b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final FB.d f154493c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final g.a<com.avito.konveyor.adapter.b> f154494d = new g.a<>(R.layout.extended_profile_job_company_carousel_item, new a(this));

    @Inject
    public b(@k e eVar, @a.b @k Provider provider, @a.b @k FB.d dVar) {
        this.f154491a = eVar;
        this.f154492b = provider;
        this.f154493c = dVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f154491a;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f154494d;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return (aVar instanceof JobCompanyCarouselItem) && O2.a(((JobCompanyCarouselItem) aVar).f154488e);
    }
}
