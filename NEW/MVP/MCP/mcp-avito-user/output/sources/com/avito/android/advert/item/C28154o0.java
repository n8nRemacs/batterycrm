package com.avito.android.advert.item;

import com.avito.android.remote.model.AdditionalSeller;
import com.avito.android.remote.model.AdvertDetails;
import kotlin.Metadata;

/* compiled from: AdvertDetailsPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/rating_ui/badge_score/k;", "item", "Lkotlin/G0;", "accept", "(Lcom/avito/android/rating_ui/badge_score/k;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.advert.item.o0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C28154o0<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C28136i0 f77829b;

    public C28154o0(C28136i0 c28136i0) {
        this.f77829b = c28136i0;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        AdditionalSeller additionalSeller;
        com.avito.android.rating_ui.badge_score.k kVar = (com.avito.android.rating_ui.badge_score.k) obj;
        C28136i0 c28136i0 = this.f77829b;
        AdvertDetails advertDetailsN2 = c28136i0.n2();
        if (((advertDetailsN2 == null || (additionalSeller = advertDetailsN2.getAdditionalSeller()) == null) ? null : additionalSeller.getRatingPreview()) != null) {
            com.avito.android.rating_ui.badge_score.a aVar = kVar.f249973a;
            c28136i0.f76272A.C5(aVar.getF78671d() == null || kotlin.jvm.internal.L.d(aVar.getF78671d(), 0.0f));
        }
    }
}
