package com.avito.android.advert_core.short_term_rent;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.di.module.InterfaceC30174s;
import f9.C40246a;
import javax.inject.Inject;
import kotlin.Metadata;
import l90.n;

/* compiled from: AdvertStrBlockAnalyticsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/short_term_rent/e;", "Lcom/avito/android/advert_core/short_term_rent/d;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f84341a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final n f84342b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f84343c;

    @Inject
    public e(@Y61.k @InterfaceC30174s String str, @Y61.k n nVar, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f84341a = str;
        this.f84342b = nVar;
        this.f84343c = interfaceC28373a;
    }

    @Override // com.avito.android.advert_core.short_term_rent.d
    public final void a() {
        String userId = this.f84342b.e().getUserId();
        if (userId != null && userId.length() > 0) {
            this.f84343c.c(new C40246a(this.f84341a, userId));
        }
    }
}
