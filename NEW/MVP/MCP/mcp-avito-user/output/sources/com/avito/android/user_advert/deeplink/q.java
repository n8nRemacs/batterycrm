package com.avito.android.user_advert.deeplink;

import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.MyAdvertLink;
import com.avito.android.user_advert.advert.InterfaceC35391g;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MyAdvertDeletionLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_advert/deeplink/q;", "Lev/a;", "Lcom/avito/android/deep_linking/links/MyAdvertLink$Delete;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class q extends AbstractC40161a<MyAdvertLink.Delete> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35391g f310754f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f310755g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f310756h = new io.reactivex.rxjava3.disposables.c();

    @Inject
    public q(@Y61.k InterfaceC35391g interfaceC35391g, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f310754f = interfaceC35391g;
        this.f310755g = interfaceC35745a5;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        this.f310756h.b(this.f310754f.a(((MyAdvertLink.Delete) deepLink).f133486c).r0(P2.c.f318721a).j0(this.f310755g.e()).t0(new p(this)));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f310756h.e();
    }
}
