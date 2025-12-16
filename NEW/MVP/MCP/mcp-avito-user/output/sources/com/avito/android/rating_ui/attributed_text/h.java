package com.avito.android.rating_ui.attributed_text;

import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: RatingAttributedTextItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_ui/attributed_text/h;", "Lcom/avito/android/rating_ui/attributed_text/e;", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h implements e {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final l41.g<b> f249947b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f249948c = new io.reactivex.rxjava3.disposables.c();

    @Inject
    public h(@Y61.k l41.g<b> gVar) {
        this.f249947b = gVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        j jVar = (j) eVar;
        a aVar2 = (a) aVar;
        this.f249948c.b(aVar2.n2().linkClicksV3().t0(new f(this)));
        aVar2.n2().setOnUrlClickListener(new com.avito.android.auction.details.i(this, 13));
        jVar.d(new g(this));
        jVar.m0(aVar2.n2());
        jVar.E(aVar2.c());
    }
}
