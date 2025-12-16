package com.avito.android.developments_agency_search.adapter.commission_promo_banner.analytics;

import Y61.k;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: CommissionPromoBannerAnalyticsEvents.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_developments-agency-search_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final InterfaceC42726C f136233a = C42727D.c(C4118a.f136234l);

    /* compiled from: CommissionPromoBannerAnalyticsEvents.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.developments_agency_search.adapter.commission_promo_banner.analytics.a$a, reason: collision with other inner class name */
    public static final class C4118a extends N implements Y41.a<String> {

        /* renamed from: l, reason: collision with root package name */
        public static final C4118a f136234l = new C4118a();

        public C4118a() {
            super(0);
        }

        @Override // Y41.a
        public final String invoke() {
            com.google.gson.k kVar = new com.google.gson.k();
            kVar.y("banner_name", "1000");
            return kVar.toString();
        }
    }
}
