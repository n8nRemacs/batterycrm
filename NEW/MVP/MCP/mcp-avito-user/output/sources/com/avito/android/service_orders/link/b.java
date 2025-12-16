package com.avito.android.service_orders.link;

import Hu0.InterfaceC14034a;
import Y61.k;
import android.os.Bundle;
import bv.C25719a;
import com.avito.android.authorization.AuthSource;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.service_orders.link.ShowServiceOrdersLink;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import l41.g;
import l41.r;
import rv.C47918a;
import sv.C48421d;

/* compiled from: ShowServiceOrdersLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_orders/link/b;", "Lev/a;", "Lcom/avito/android/service_orders/link/ShowServiceOrdersLink;", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b extends AbstractC40161a<ShowServiceOrdersLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f279178f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final InterfaceC14034a f279179g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.b f279180h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final C25719a f279181i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f279182j = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: ShowServiceOrdersLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "result", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements r {
        public a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(b.this);
        }
    }

    @Inject
    public b(@k a.InterfaceC4053a interfaceC4053a, @k InterfaceC14034a interfaceC14034a, @k a.b bVar, @k C25719a c25719a) {
        this.f279178f = interfaceC4053a;
        this.f279179g = interfaceC14034a;
        this.f279180h = bVar;
        this.f279181i = c25719a;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        ShowServiceOrdersLink showServiceOrdersLink = (ShowServiceOrdersLink) deepLink;
        this.f279181i.a(showServiceOrdersLink, this, AuthSource.f92670E, new com.avito.android.service_orders.link.a(this, showServiceOrdersLink));
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f279182j.b(this.f279180h.Q().N(new a()).t0(new g() { // from class: com.avito.android.service_orders.link.b.b
            @Override // l41.g
            public final void accept(Object obj) {
                b.this.j(((C47918a) obj).f437156b == -1 ? ShowServiceOrdersLink.b.C8302b.f279175b : ShowServiceOrdersLink.b.a.f279174b);
            }
        }));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f279182j.e();
    }
}
