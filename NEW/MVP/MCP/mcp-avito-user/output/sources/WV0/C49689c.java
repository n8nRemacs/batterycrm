package wv0;

import X41.n;
import Y61.k;
import com.avito.android.services_seller_subscription_payment.ServicesSellerSubscriptionPaymentResultLink;
import com.avito.android.services_seller_subscription_payment.deeplinks.g;
import dagger.internal.h;
import kotlin.Metadata;
import kotlin.jvm.internal.m0;
import kotlin.reflect.d;
import lv.C43834a;

/* compiled from: ServicesSellerSubscriptionPaymentDeepLinkModule_ProvideServicesSellerSubscriptionPaymentResultLinkMappingFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lwv0/c;", "Ldagger/internal/h;", "Llv/a;", "<init>", "()V", "_avito_services-seller-subscription-payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: wv0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C49689c implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final C49689c f441857a = new C49689c();

    @n
    @k
    public static final C49689c a() {
        return f441857a;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C49687a.f441854a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        d dVarB = m0.f406844a.b(ServicesSellerSubscriptionPaymentResultLink.class);
        g gVar = new g();
        c11807a.getClass();
        return C43834a.C11807a.a(dVarB, gVar);
    }
}
