package com.avito.android.rating_form.item.file_picker;

import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: RatingFormFilePickerPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/item/file_picker/j;", "Lcom/avito/android/rating_form/item/file_picker/h;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class j implements h {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final c f248434b;

    @Inject
    public j(@Y61.k c cVar) {
        this.f248434b = cVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        l lVar = (l) eVar;
        g gVar = (g) aVar;
        i iVar = new i(this, gVar);
        lVar.f248436b.setText(gVar.f248429d);
        a aVar2 = lVar.f248437c;
        aVar2.f248410e = iVar;
        aVar2.m(gVar.f248431f);
    }
}
