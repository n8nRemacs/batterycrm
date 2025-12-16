package com.avito.android.services_realty_sheet.link;

import Y61.k;
import android.os.Bundle;
import com.avito.android.B2;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import pv0.C47153b;
import tv0.InterfaceC48727a;

/* compiled from: ServicesRealtySheetLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/services_realty_sheet/link/e;", "Lev/a;", "Lcom/avito/android/services_realty_sheet/link/ServicesRealtySheetLink;", "_avito_services-realty-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e extends AbstractC40161a<ServicesRealtySheetLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.d f280430f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f280431g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final B2 f280432h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final InterfaceC48727a f280433i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final InterfaceC28373a f280434j;

    @Inject
    public e(@k a.d dVar, @k com.avito.android.deeplink_handler.handler.composite.a aVar, @k B2 b22, @k InterfaceC48727a interfaceC48727a, @k InterfaceC28373a interfaceC28373a) {
        this.f280430f = dVar;
        this.f280431g = aVar;
        this.f280432h = b22;
        this.f280433i = interfaceC48727a;
        this.f280434j = interfaceC28373a;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        String string;
        ServicesRealtySheetLink servicesRealtySheetLink = (ServicesRealtySheetLink) deepLink;
        B2 b22 = this.f280432h;
        b22.getClass();
        n<Object> nVar = B2.f67184X[29];
        if (((Boolean) b22.f67189E.a().invoke()).booleanValue()) {
            C47153b c47153b = (bundle == null || (string = bundle.getString("key_advert_id")) == null) ? null : new C47153b(string, String.valueOf(servicesRealtySheetLink.f280421e), bundle.getString("key_xhash"));
            if (c47153b != null) {
                this.f280434j.c(c47153b);
            }
            this.f280430f.k0(new d(this, bundle, servicesRealtySheetLink));
        }
    }
}
