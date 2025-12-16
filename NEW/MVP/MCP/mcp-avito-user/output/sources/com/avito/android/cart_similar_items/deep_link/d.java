package com.avito.android.cart_similar_items.deep_link;

import Ju.AbstractC14250d;
import Y41.l;
import Y61.k;
import android.os.Bundle;
import bv.C25719a;
import com.avito.android.Z0;
import com.avito.android.authorization.AuthSource;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40161a;
import io.reactivex.rxjava3.kotlin.A1;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.reflect.n;
import l41.r;
import rv.C47918a;
import sv.C48421d;

/* compiled from: CartSimilarItemsLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cart_similar_items/deep_link/d;", "Lev/a;", "Lcom/avito/android/cart_similar_items/deep_link/CartSimilarItemsLink;", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d extends AbstractC40161a<CartSimilarItemsLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.avito.android.cart_similar_items.h f115722f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f115723g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.b f115724h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final C25719a f115725i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final Z0 f115726j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f115727k = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: CartSimilarItemsLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements r {
        public a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(d.this);
        }
    }

    /* compiled from: CartSimilarItemsLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "Lkotlin/G0;", "invoke", "(Lrv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements l<C47918a, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(C47918a c47918a) {
            d.this.j(AbstractC14250d.c.f9171c);
            return G0.f406611a;
        }
    }

    @Inject
    public d(@k com.avito.android.cart_similar_items.h hVar, @k a.InterfaceC4053a interfaceC4053a, @k a.b bVar, @k C25719a c25719a, @k Z0 z02) {
        this.f115722f = hVar;
        this.f115723g = interfaceC4053a;
        this.f115724h = bVar;
        this.f115725i = c25719a;
        this.f115726j = z02;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        CartSimilarItemsLink cartSimilarItemsLink = (CartSimilarItemsLink) deepLink;
        this.f115725i.a(cartSimilarItemsLink, this, AuthSource.f92667B, new c(this, cartSimilarItemsLink));
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        Z0 z02 = this.f115726j;
        z02.getClass();
        n<Object> nVar = Z0.f67595D[9];
        if (((Boolean) z02.f67609l.a().invoke()).booleanValue()) {
            this.f115727k.b(A1.h(this.f115724h.Q().N(new a()), null, new b(), 3));
        }
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f115727k.e();
    }
}
