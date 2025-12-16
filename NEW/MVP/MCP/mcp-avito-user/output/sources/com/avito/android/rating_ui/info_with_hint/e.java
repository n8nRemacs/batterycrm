package com.avito.android.rating_ui.info_with_hint;

import Y41.l;
import Y61.k;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: RatingInfoWithHintItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_ui/info_with_hint/e;", "Lcom/avito/android/rating_ui/info_with_hint/c;", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<RatingInfoWithHintItem, G0> f250044b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@k l<? super RatingInfoWithHintItem, G0> lVar) {
        this.f250044b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        RatingInfoWithHintItem ratingInfoWithHintItem = (RatingInfoWithHintItem) aVar;
        gVar.E(ratingInfoWithHintItem.f250028k);
        gVar.Sd(ratingInfoWithHintItem.f250021d, ratingInfoWithHintItem.f250022e, ratingInfoWithHintItem.f250020c);
        gVar.hC(ratingInfoWithHintItem.f250024g, ratingInfoWithHintItem.f250023f);
        gVar.zl(ratingInfoWithHintItem.f250025h != null);
        gVar.sp(ratingInfoWithHintItem.f250027j);
        gVar.f00(ratingInfoWithHintItem.f250026i);
        gVar.a(new d(this, ratingInfoWithHintItem));
    }
}
