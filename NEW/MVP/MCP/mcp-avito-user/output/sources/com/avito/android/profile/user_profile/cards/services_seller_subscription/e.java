package com.avito.android.profile.user_profile.cards.services_seller_subscription;

import Ua0.InterfaceC15503a;
import Y41.l;
import Y61.k;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.profile.user_profile.cards.CardItem;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import m90.C43932b;

/* compiled from: ServicesSellerSubscriptionCardPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/services_seller_subscription/e;", "Lcom/avito/android/profile/user_profile/cards/services_seller_subscription/c;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC15503a, G0> f225498b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC28373a f225499c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f225500d;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@k l<? super InterfaceC15503a, G0> lVar, @k InterfaceC28373a interfaceC28373a) {
        this.f225498b = lVar;
        this.f225499c = interfaceC28373a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        CardItem.ServicesSellerSubscriptionCardItem servicesSellerSubscriptionCardItem = (CardItem.ServicesSellerSubscriptionCardItem) aVar;
        if (!this.f225500d) {
            this.f225499c.c(new C43932b(null, servicesSellerSubscriptionCardItem.f224570g, 1, 0 == true ? 1 : 0));
            this.f225500d = true;
        }
        gVar.O0(servicesSellerSubscriptionCardItem.f224567d, servicesSellerSubscriptionCardItem.f224569f);
        gVar.f(servicesSellerSubscriptionCardItem.f224568e);
        gVar.w2(servicesSellerSubscriptionCardItem.f224571h.getTitle());
        gVar.a(new d(this, servicesSellerSubscriptionCardItem));
    }
}
