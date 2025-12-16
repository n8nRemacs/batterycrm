package com.avito.android.checkout.deeplink.handlers;

import Ju.InterfaceC14249c;
import android.annotation.SuppressLint;
import android.os.Bundle;
import com.avito.android.checkout.deeplink.CheckoutDeepLink;
import com.avito.android.deep_linking.links.DeepLink;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import sv.C48421d;

/* compiled from: CheckoutDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/checkout/deeplink/handlers/a;", "Lev/a;", "Lcom/avito/android/checkout/deeplink/CheckoutDeepLink;", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"MissingDeeplinkHandlerResult"})
/* loaded from: classes12.dex */
public final class a extends AbstractC40161a<CheckoutDeepLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.paid_services.a f118197f;

    /* compiled from: CheckoutDeeplinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.checkout.deeplink.handlers.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C3442a extends H implements Y41.l<InterfaceC14249c.b, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC14249c.b bVar) {
            ((a) this.receiver).j(bVar);
            return G0.f406611a;
        }
    }

    @Inject
    public a(@Y61.k com.avito.android.paid_services.a aVar) {
        this.f118197f = aVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        int iA2 = C48421d.a(this);
        this.f118197f.a((CheckoutDeepLink) deepLink, iA2, bundle, null);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f118197f.b(C48421d.a(this), new C3442a(1, this, a.class, "setTerminalResult", "setTerminalResult(Lcom/avito/android/deep_linking/links/result/DeeplinkResult$Terminal;)V", 0));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f118197f.e();
    }
}
