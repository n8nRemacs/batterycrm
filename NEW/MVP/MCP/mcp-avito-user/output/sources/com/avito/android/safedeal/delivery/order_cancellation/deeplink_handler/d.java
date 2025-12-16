package com.avito.android.safedeal.delivery.order_cancellation.deeplink_handler;

import Ju.AbstractC14250d;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.DeliveryOrderCancelLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.remote.B;
import com.avito.android.util.InterfaceC35745a5;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import l41.r;
import rv.C47918a;
import sv.C48421d;
import zn0.InterfaceC50594a;

/* compiled from: DeliveryOrderCancelDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/safedeal/delivery/order_cancellation/deeplink_handler/d;", "Lev/a;", "Lcom/avito/android/deep_linking/links/DeliveryOrderCancelLink;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d extends AbstractC40161a<DeliveryOrderCancelLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Context f256111f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f256112g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final a.d f256113h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final a.g f256114i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final a.b f256115j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final B f256116k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f256117l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.error.f f256118m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final InterfaceC50594a f256119n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final o f256120o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f256121p = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: DeliveryOrderCancelDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "activityResult", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements r {
        public a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(d.this);
        }
    }

    /* compiled from: DeliveryOrderCancelDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "activityResult", "Lkotlin/G0;", "accept", "(Lrv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            C47918a c47918a = (C47918a) obj;
            int i12 = c47918a.f437156b;
            d dVar = d.this;
            if (i12 == -1) {
                dVar.j(AbstractC14250d.c.f9171c);
                return;
            }
            a.d dVar2 = dVar.f256113h;
            Context context = dVar.f256111f;
            if (i12 != 0) {
                dVar2.u1((7 & 1) != 0 ? 0 : R.style.Theme_DesignSystem_Re23, (7 & 4) == 0 ? R.style.Re23_Modal_Default : 0, new f(dVar, context.getString(R.string.unknown_error)));
                dVar.j(AbstractC14250d.b.f9170c);
                return;
            }
            Intent intent = c47918a.f437157c;
            String stringExtra = intent != null ? intent.getStringExtra("EXTRA_ORDER_ID") : null;
            if (stringExtra == null) {
                dVar.j(AbstractC14250d.b.f9170c);
                return;
            }
            g gVar = new g(dVar);
            h hVar = new h(dVar, stringExtra);
            dVar.f256120o.getClass();
            dVar2.u1((7 & 1) != 0 ? 0 : R.style.Theme_DesignSystem_Re23, (7 & 4) == 0 ? R.style.Re23_Modal_Default : 0, new n(context, hVar, gVar));
        }
    }

    @Inject
    public d(@Y61.k Context context, @Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k a.d dVar, @Y61.k a.g gVar, @Y61.k a.b bVar, @Y61.k B b12, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.remote.error.f fVar, @Y61.k InterfaceC50594a interfaceC50594a, @Y61.k o oVar) {
        this.f256111f = context;
        this.f256112g = interfaceC4053a;
        this.f256113h = dVar;
        this.f256114i = gVar;
        this.f256115j = bVar;
        this.f256116k = b12;
        this.f256117l = interfaceC35745a5;
        this.f256118m = fVar;
        this.f256119n = interfaceC50594a;
        this.f256120o = oVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        this.f256112g.J(this.f256119n.a(((DeliveryOrderCancelLink) deepLink).f133186b), C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f256121p.b(this.f256115j.Q().N(new a()).t0(new b()));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f256121p.e();
    }
}
