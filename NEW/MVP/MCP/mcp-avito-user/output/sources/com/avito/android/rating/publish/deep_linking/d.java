package com.avito.android.rating.publish.deep_linking;

import Lg0.InterfaceC14394a;
import Y61.k;
import android.os.Bundle;
import com.avito.android.deep_linking.RatingPublishLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.messenger.blacklist.mvi.C31684n;
import com.avito.android.util.InterfaceC35745a5;
import ev.AbstractC40161a;
import io.reactivex.rxjava3.internal.operators.single.C42023v;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: RatingPublishLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating/publish/deep_linking/d;", "Lev/a;", "Lcom/avito/android/deep_linking/RatingPublishLink;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d extends AbstractC40161a<RatingPublishLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final InterfaceC14394a f247627f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f247628g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.g f247629h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f247630i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f247631j = new io.reactivex.rxjava3.disposables.c();

    @Inject
    public d(@k InterfaceC14394a interfaceC14394a, @k InterfaceC35745a5 interfaceC35745a5, @k a.g gVar, @k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f247627f = interfaceC14394a;
        this.f247628g = interfaceC35745a5;
        this.f247629h = gVar;
        this.f247630i = aVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        this.f247631j.b(new C42023v(this.f247627f.a(((RatingPublishLink) deepLink).f132859b).s(this.f247628g.e()).j(new a(this)), new C31684n(this, 14)).x(new b(this), new c(this)));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f247631j.e();
    }
}
