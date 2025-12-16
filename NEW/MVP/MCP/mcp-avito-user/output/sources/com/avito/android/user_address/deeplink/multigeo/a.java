package com.avito.android.user_address.deeplink.multigeo;

import Y61.k;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.UserAddressLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.user_address.deeplink.o;
import javax.inject.Inject;
import kotlin.Metadata;
import l41.r;
import rv.C47918a;
import sv.C48421d;

/* compiled from: MultiGeoMapDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_address/deeplink/multigeo/a;", "Lcom/avito/android/user_address/deeplink/o;", "Lcom/avito/android/deep_linking/links/UserAddressLink$MultiGeoMap;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a extends o<UserAddressLink.MultiGeoMap> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.b f307244f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final com.avito.android.user_address.deeplink.k f307245g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f307246h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f307247i = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: MultiGeoMapDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.user_address.deeplink.multigeo.a$a, reason: collision with other inner class name */
    public static final class C9440a<T> implements r {
        public C9440a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(a.this);
        }
    }

    /* compiled from: MultiGeoMapDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "screenResult", "Lkotlin/G0;", "accept", "(Lrv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            a.this.j(o.k((C47918a) obj));
        }
    }

    @Inject
    public a(@k a.b bVar, @k com.avito.android.user_address.deeplink.k kVar, @k a.InterfaceC4053a interfaceC4053a) {
        this.f307244f = bVar;
        this.f307245g = kVar;
        this.f307246h = interfaceC4053a;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        UserAddressLink.MultiGeoMap multiGeoMap = (UserAddressLink.MultiGeoMap) deepLink;
        this.f307246h.J(this.f307245g.e(multiGeoMap.f133793b, multiGeoMap.f133794c, multiGeoMap.f133795d, multiGeoMap.f133796e, multiGeoMap.f133797f, multiGeoMap.f133798g, multiGeoMap.f133799h), C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f307247i.b(this.f307244f.Q().N(new C9440a()).t0(new b()));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f307247i.e();
    }
}
