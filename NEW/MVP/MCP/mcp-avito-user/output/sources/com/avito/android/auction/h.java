package com.avito.android.auction;

import android.os.Bundle;
import com.avito.android.deep_linking.links.AuctionLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40161a;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import javax.inject.Inject;
import kotlin.Metadata;
import rv.C47918a;
import sv.C48421d;

/* compiled from: AuctionDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/auction/h;", "Lev/a;", "Lcom/avito/android/deep_linking/links/AuctionLink;", "_avito_auction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h extends AbstractC40161a<AuctionLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final k f92408f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f92409g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final a.b f92410h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final a.g f92411i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.observers.y f92412j;

    /* compiled from: AuctionDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.r {
        public a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(h.this);
        }
    }

    /* compiled from: AuctionDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "Lkotlin/G0;", "accept", "(Lrv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            h hVar = h.this;
            hVar.f92411i.g(hVar.d(), false);
        }
    }

    /* compiled from: AuctionDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "Lcom/avito/android/deep_linking/links/AuctionLink$b;", "apply", "(Lrv/a;)Lcom/avito/android/deep_linking/links/AuctionLink$b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final c<T, R> f92415b = new c<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return AuctionLink.f133018c;
        }
    }

    /* compiled from: AuctionDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/AuctionLink$b;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/deep_linking/links/AuctionLink$b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T> implements l41.g {
        public d() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            h.this.j((AuctionLink.b) obj);
        }
    }

    @Inject
    public h(@Y61.k k kVar, @Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k a.b bVar, @Y61.k a.g gVar) {
        this.f92408f = kVar;
        this.f92409g = interfaceC4053a;
        this.f92410h = bVar;
        this.f92411i = gVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        this.f92409g.J(this.f92408f.a(((AuctionLink) deepLink).f133019b), C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f92412j = (io.reactivex.rxjava3.internal.observers.y) this.f92410h.Q().N(new a()).K(new b()).d0(c.f92415b).t0(new d());
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        io.reactivex.rxjava3.internal.observers.y yVar = this.f92412j;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f92412j = null;
    }
}
