package com.avito.android.autoteka.deeplinks.waitingForPayment;

import Y61.k;
import android.content.Context;
import android.os.Bundle;
import bv.C25719a;
import com.avito.android.authorization.AuthSource;
import com.avito.android.autoteka.deeplinks.AutotekaWaitingForPaymentLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AutotekaWaitingForPaymentDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/autoteka/deeplinks/waitingForPayment/b;", "Lev/a;", "Lcom/avito/android/autoteka/deeplinks/AutotekaWaitingForPaymentLink;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b extends AbstractC40161a<AutotekaWaitingForPaymentLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Context f96329f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f96330g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final C25719a f96331h;

    @Inject
    public b(@k Context context, @k C25719a c25719a, @k a.InterfaceC4053a interfaceC4053a) {
        this.f96329f = context;
        this.f96330g = interfaceC4053a;
        this.f96331h = c25719a;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        AutotekaWaitingForPaymentLink autotekaWaitingForPaymentLink = (AutotekaWaitingForPaymentLink) deepLink;
        this.f96331h.a(autotekaWaitingForPaymentLink, this, AuthSource.f92691Z, new a(this, autotekaWaitingForPaymentLink));
    }
}
