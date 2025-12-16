package com.avito.android.cart.deep_link;

import Y61.k;
import android.os.Bundle;
import bv.C25719a;
import com.avito.android.authorization.AuthSource;
import com.avito.android.deep_linking.links.CartLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import l41.g;
import l41.r;
import rv.C47918a;
import sv.C48421d;

/* compiled from: CartLinkHandler.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cart/deep_link/a;", "Lev/a;", "Lcom/avito/android/deep_linking/links/CartLink;", "a", "_avito_cart_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a extends AbstractC40161a<CartLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.b f115292f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f115293g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final C25719a f115294h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final Hm.c f115295i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f115296j = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: CartLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/cart/deep_link/a$a;", "", "<init>", "()V", "", "BEDUIN_V2_CART_PAGE_PATH", "Ljava/lang/String;", "_avito_cart_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.cart.deep_link.a$a, reason: collision with other inner class name */
    public static final class C3359a {
        public /* synthetic */ C3359a(C42822w c42822w) {
            this();
        }

        public C3359a() {
        }
    }

    /* compiled from: CartLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements r {
        public b() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(a.this);
        }
    }

    /* compiled from: CartLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "Lkotlin/G0;", "accept", "(Lrv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements g {
        public c() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            a.this.j(CartLink.b.a.f133089b);
        }
    }

    static {
        new C3359a(null);
    }

    @Inject
    public a(@k a.b bVar, @k a.InterfaceC4053a interfaceC4053a, @k C25719a c25719a, @k Hm.c cVar) {
        this.f115292f = bVar;
        this.f115293g = interfaceC4053a;
        this.f115294h = c25719a;
        this.f115295i = cVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        CartLink cartLink = (CartLink) deepLink;
        this.f115294h.a(cartLink, this, AuthSource.f92733w, new com.avito.android.cart.deep_link.b(this, cartLink));
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f115296j.b(this.f115292f.Q().N(new b()).t0(new c()));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f115296j.e();
    }
}
