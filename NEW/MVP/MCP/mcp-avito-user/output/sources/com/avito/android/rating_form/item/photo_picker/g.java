package com.avito.android.rating_form.item.photo_picker;

import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: RatingFormPhotoPickerPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/item/photo_picker/g;", "Lcom/avito/android/rating_form/item/photo_picker/e;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g implements e {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.photo_list_view.s f248537b;

    @Inject
    public g(@Y61.k com.avito.android.photo_list_view.s sVar) {
        this.f248537b = sVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k kVar = (k) eVar;
        d dVar = (d) aVar;
        int i13 = dVar.f248512f;
        com.avito.android.photo_list_view.s sVar = this.f248537b;
        sVar.c(i13);
        kVar.B2(sVar);
        kVar.h(dVar.f248510d);
        kVar.m0(dVar.f248511e);
        kVar.d(new f(this));
    }
}
