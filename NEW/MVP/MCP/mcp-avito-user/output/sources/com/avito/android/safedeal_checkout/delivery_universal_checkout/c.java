package com.avito.android.safedeal_checkout.delivery_universal_checkout;

import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.DeliveryUniversalCheckoutCourierDeepLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import l41.r;
import rv.C47918a;
import sv.C48421d;
import xv.C50005c;

/* compiled from: DeliveryUniversalCheckoutCourierDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/safedeal_checkout/delivery_universal_checkout/c;", "Lev/a;", "Lcom/avito/android/deep_linking/links/DeliveryUniversalCheckoutCourierDeepLink;", "_avito_safedeal-checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c extends AbstractC40161a<DeliveryUniversalCheckoutCourierDeepLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final i f256891f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f256892g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final a.b f256893h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f256894i = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: DeliveryUniversalCheckoutCourierDeepLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "result", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements r {
        public a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(c.this);
        }
    }

    /* compiled from: DeliveryUniversalCheckoutCourierDeepLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "screenResult", "Lkotlin/G0;", "accept", "(Lrv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            c.this.j(new C50005c(xv.f.a(((C47918a) obj).f437157c)));
        }
    }

    @Inject
    public c(@Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k a.b bVar, @Y61.k i iVar) {
        this.f256891f = iVar;
        this.f256892g = interfaceC4053a;
        this.f256893h = bVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        DeliveryUniversalCheckoutCourierDeepLink deliveryUniversalCheckoutCourierDeepLink = (DeliveryUniversalCheckoutCourierDeepLink) deepLink;
        this.f256892g.J(this.f256891f.a(deliveryUniversalCheckoutCourierDeepLink.f133202b, deliveryUniversalCheckoutCourierDeepLink.f133203c, deliveryUniversalCheckoutCourierDeepLink.f133204d, deliveryUniversalCheckoutCourierDeepLink.f133205e, deliveryUniversalCheckoutCourierDeepLink.f133206f, deliveryUniversalCheckoutCourierDeepLink.f133207g, deliveryUniversalCheckoutCourierDeepLink.f133208h, deliveryUniversalCheckoutCourierDeepLink.f133209i, deliveryUniversalCheckoutCourierDeepLink.f133210j, deliveryUniversalCheckoutCourierDeepLink.f133211k, deliveryUniversalCheckoutCourierDeepLink.f133212l, deliveryUniversalCheckoutCourierDeepLink.f133213m, deliveryUniversalCheckoutCourierDeepLink.f133214n), C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f256894i.b(this.f256893h.Q().N(new a()).t0(new b()));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f256894i.e();
    }
}
