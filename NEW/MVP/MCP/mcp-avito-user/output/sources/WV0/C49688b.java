package wv0;

import X41.n;
import Y61.k;
import com.avito.android.services_seller_subscription_payment.ServicesSellerSubscriptionPaymentLink;
import dagger.internal.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import lv.C43834a;

/* compiled from: ServicesSellerSubscriptionPaymentDeepLinkModule_ProvideServicesSellerSubscriptionPaymentLinkMappingFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lwv0/b;", "Ldagger/internal/h;", "Llv/a;", "a", "_avito_services-seller-subscription-payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: wv0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C49688b implements h<C43834a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f441855b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.services_seller_subscription_payment.deeplinks.b f441856a;

    /* compiled from: ServicesSellerSubscriptionPaymentDeepLinkModule_ProvideServicesSellerSubscriptionPaymentLinkMappingFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwv0/b$a;", "", "<init>", "()V", "_avito_services-seller-subscription-payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wv0.b$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @n
        @k
        public static C43834a a(@k com.avito.android.services_seller_subscription_payment.deeplinks.b bVar) {
            C49687a.f441854a.getClass();
            C43834a.C11807a c11807a = C43834a.f414235d;
            return new C43834a(ServicesSellerSubscriptionPaymentLink.class, new com.avito.android.services_seller_subscription_payment.deeplinks.c(), new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(ServicesSellerSubscriptionPaymentLink.class), bVar));
        }

        public a() {
        }
    }

    public C49688b(@k com.avito.android.services_seller_subscription_payment.deeplinks.b bVar) {
        this.f441856a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.services_seller_subscription_payment.deeplinks.b bVar = this.f441856a;
        f441855b.getClass();
        return a.a(bVar);
    }
}
