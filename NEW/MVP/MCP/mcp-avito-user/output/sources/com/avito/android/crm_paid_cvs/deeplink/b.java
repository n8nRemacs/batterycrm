package com.avito.android.crm_paid_cvs.deeplink;

import Y61.k;
import android.os.Bundle;
import bv.C25719a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40161a;
import gt.InterfaceC40729a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CrmPaidCvsDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/crm_paid_cvs/deeplink/b;", "Lev/a;", "Lcom/avito/android/crm_paid_cvs/deeplink/CrmPaidCvsDeeplink;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b extends AbstractC40161a<CrmPaidCvsDeeplink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final InterfaceC40729a f130283f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f130284g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final C25719a f130285h;

    @Inject
    public b(@k InterfaceC40729a interfaceC40729a, @k a.InterfaceC4053a interfaceC4053a, @k C25719a c25719a) {
        this.f130283f = interfaceC40729a;
        this.f130284g = interfaceC4053a;
        this.f130285h = c25719a;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        a aVar = new a(this);
        this.f130285h.b((CrmPaidCvsDeeplink) deepLink, this, null, aVar);
    }
}
