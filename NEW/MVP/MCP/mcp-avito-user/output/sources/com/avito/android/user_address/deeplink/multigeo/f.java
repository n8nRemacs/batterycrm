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

/* compiled from: MultiGeoSuggestDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_address/deeplink/multigeo/f;", "Lcom/avito/android/user_address/deeplink/o;", "Lcom/avito/android/deep_linking/links/UserAddressLink$MultiGeoSuggest;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f extends o<UserAddressLink.MultiGeoSuggest> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.b f307254f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final com.avito.android.user_address.deeplink.k f307255g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f307256h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f307257i = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: MultiGeoSuggestDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements r {
        public a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(f.this);
        }
    }

    /* compiled from: MultiGeoSuggestDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "screenResult", "Lkotlin/G0;", "accept", "(Lrv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            f.this.j(o.k((C47918a) obj));
        }
    }

    @Inject
    public f(@k a.b bVar, @k com.avito.android.user_address.deeplink.k kVar, @k a.InterfaceC4053a interfaceC4053a) {
        this.f307254f = bVar;
        this.f307255g = kVar;
        this.f307256h = interfaceC4053a;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        UserAddressLink.MultiGeoSuggest multiGeoSuggest = (UserAddressLink.MultiGeoSuggest) deepLink;
        this.f307256h.J(this.f307255g.a(multiGeoSuggest.f133800b, multiGeoSuggest.f133801c, multiGeoSuggest.f133802d), C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f307257i.b(this.f307254f.Q().N(new a()).t0(new b()));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f307257i.e();
    }
}
