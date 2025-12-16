package com.avito.android.services_seller_subscription_payment.deeplinks;

import Y61.k;
import com.avito.android.C36167y1;
import com.avito.android.InterfaceC36134w1;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import dagger.internal.h;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ServicesSellerSubscriptionPaymentDeepLinkHandler_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/services_seller_subscription_payment/deeplinks/b;", "Ldagger/internal/h;", "Lcom/avito/android/services_seller_subscription_payment/deeplinks/a;", "a", "_avito_services-seller-subscription-payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements h<com.avito.android.services_seller_subscription_payment.deeplinks.a> {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f280464e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final dv.b f280465a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C36167y1 f280466b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final dv.b f280467c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Provider<R0> f280468d;

    /* compiled from: ServicesSellerSubscriptionPaymentDeepLinkHandler_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/services_seller_subscription_payment/deeplinks/b$a;", "", "<init>", "()V", "_avito_services-seller-subscription-payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public b(@k dv.b bVar, @k C36167y1 c36167y1, @k dv.b bVar2, @k Provider provider) {
        this.f280465a = bVar;
        this.f280466b = c36167y1;
        this.f280467c = bVar2;
        this.f280468d = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a.b bVar = (a.b) this.f280465a.get();
        InterfaceC36134w1 interfaceC36134w1 = (InterfaceC36134w1) this.f280466b.get();
        a.InterfaceC4053a interfaceC4053a = (a.InterfaceC4053a) this.f280467c.get();
        R0 r02 = this.f280468d.get();
        f280464e.getClass();
        return new com.avito.android.services_seller_subscription_payment.deeplinks.a(bVar, interfaceC36134w1, interfaceC4053a, r02);
    }
}
