package com.avito.android.user_address.deeplink;

import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.UserAddressLink;
import com.avito.android.deeplink_handler.view.a;
import javax.inject.Inject;
import kotlin.Metadata;
import rv.C47918a;
import sv.C48421d;

/* compiled from: UserAddressListDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_address/deeplink/z;", "Lcom/avito/android/user_address/deeplink/o;", "Lcom/avito/android/deep_linking/links/UserAddressLink$List;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class z extends o<UserAddressLink.List> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final a.b f307291f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final k f307292g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f307293h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f307294i = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: UserAddressListDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.r {
        public a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(z.this);
        }
    }

    /* compiled from: UserAddressListDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "screenResult", "Lkotlin/G0;", "accept", "(Lrv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            z.this.j(o.k((C47918a) obj));
        }
    }

    @Inject
    public z(@Y61.k a.b bVar, @Y61.k k kVar, @Y61.k a.InterfaceC4053a interfaceC4053a) {
        this.f307291f = bVar;
        this.f307292g = kVar;
        this.f307293h = interfaceC4053a;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        UserAddressLink.List list = (UserAddressLink.List) deepLink;
        String str2 = list.f133782b;
        this.f307293h.J(this.f307292g.d(list.f133785e, list.f133784d, str2, list.f133783c), C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f307294i.b(this.f307291f.Q().N(new a()).t0(new b()));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f307294i.e();
    }
}
