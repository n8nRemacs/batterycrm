package com.avito.android.safedeal_checkout.delivery_universal_checkout.deeplink_handler;

import Y61.k;
import android.os.Bundle;
import bv.C25719a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.DeliveryUniversalCheckoutLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.safedeal_checkout.delivery_universal_checkout.i;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import l41.r;
import rv.C47918a;
import sv.C48421d;
import xv.C50005c;

/* compiled from: DeliveryUniversalCheckoutDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/safedeal_checkout/delivery_universal_checkout/deeplink_handler/b;", "Lev/a;", "Lcom/avito/android/deep_linking/links/DeliveryUniversalCheckoutLink;", "_avito_safedeal-checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b extends AbstractC40161a<DeliveryUniversalCheckoutLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.b f256970f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final i f256971g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f256972h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final C25719a f256973i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f256974j = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: DeliveryUniversalCheckoutDeepLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "result", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements r {
        public a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(b.this);
        }
    }

    /* compiled from: DeliveryUniversalCheckoutDeepLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "screenResult", "Lkotlin/G0;", "accept", "(Lrv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.safedeal_checkout.delivery_universal_checkout.deeplink_handler.b$b, reason: collision with other inner class name */
    public static final class C7708b<T> implements l41.g {
        public C7708b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            b.this.j(new C50005c(xv.f.a(((C47918a) obj).f437157c)));
        }
    }

    @Inject
    public b(@k a.b bVar, @k i iVar, @k a.InterfaceC4053a interfaceC4053a, @k C25719a c25719a) {
        this.f256970f = bVar;
        this.f256971g = iVar;
        this.f256972h = interfaceC4053a;
        this.f256973i = c25719a;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        DeliveryUniversalCheckoutLink deliveryUniversalCheckoutLink = (DeliveryUniversalCheckoutLink) deepLink;
        this.f256973i.b(deliveryUniversalCheckoutLink, this, null, new com.avito.android.safedeal_checkout.delivery_universal_checkout.deeplink_handler.a(this, deliveryUniversalCheckoutLink));
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f256974j.b(this.f256970f.Q().N(new a()).t0(new C7708b()));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f256974j.e();
    }
}
