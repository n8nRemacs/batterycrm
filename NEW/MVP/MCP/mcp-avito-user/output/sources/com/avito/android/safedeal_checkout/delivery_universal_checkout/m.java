package com.avito.android.safedeal_checkout.delivery_universal_checkout;

import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.DeliveryUniversalCheckoutPvzDeepLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import l41.r;
import rv.C47918a;
import sv.C48421d;
import xv.C50005c;

/* compiled from: DeliveryUniversalCheckoutPvzDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/safedeal_checkout/delivery_universal_checkout/m;", "Lev/a;", "Lcom/avito/android/deep_linking/links/DeliveryUniversalCheckoutPvzDeepLink;", "_avito_safedeal-checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class m extends AbstractC40161a<DeliveryUniversalCheckoutPvzDeepLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final a.b f257062f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final i f257063g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f257064h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f257065i = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: DeliveryUniversalCheckoutPvzDeepLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "result", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements r {
        public a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(m.this);
        }
    }

    /* compiled from: DeliveryUniversalCheckoutPvzDeepLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "screenResult", "Lkotlin/G0;", "accept", "(Lrv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            m.this.j(new C50005c(xv.f.a(((C47918a) obj).f437157c)));
        }
    }

    @Inject
    public m(@Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k a.b bVar, @Y61.k i iVar) {
        this.f257062f = bVar;
        this.f257063g = iVar;
        this.f257064h = interfaceC4053a;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        DeliveryUniversalCheckoutPvzDeepLink deliveryUniversalCheckoutPvzDeepLink = (DeliveryUniversalCheckoutPvzDeepLink) deepLink;
        this.f257064h.J(this.f257063g.c(deliveryUniversalCheckoutPvzDeepLink.f133216b, deliveryUniversalCheckoutPvzDeepLink.f133217c, deliveryUniversalCheckoutPvzDeepLink.f133218d, deliveryUniversalCheckoutPvzDeepLink.f133219e, deliveryUniversalCheckoutPvzDeepLink.f133220f, deliveryUniversalCheckoutPvzDeepLink.f133221g, deliveryUniversalCheckoutPvzDeepLink.f133222h, deliveryUniversalCheckoutPvzDeepLink.f133223i, deliveryUniversalCheckoutPvzDeepLink.f133224j, deliveryUniversalCheckoutPvzDeepLink.f133225k, deliveryUniversalCheckoutPvzDeepLink.f133226l), C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f257065i.b(this.f257062f.Q().N(new a()).t0(new b()));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f257065i.e();
    }
}
