package com.avito.android.rating_form;

import java.util.LinkedHashMap;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: RatingFormStorageProvider.kt */
@Singleton
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/z;", "Lcom/avito/android/rating_form/y;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class z implements y {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.rating_form.item.photo_picker.r f249775a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f249776b = new LinkedHashMap();

    @Inject
    public z(@Y61.k com.avito.android.rating_form.item.photo_picker.r rVar, @Y61.k com.avito.android.rating_form.features.a aVar) {
        this.f249775a = rVar;
    }

    @Override // com.avito.android.rating_form.y
    public final void a(int i12) {
        this.f249776b.remove(Integer.valueOf(i12));
    }

    @Override // com.avito.android.rating_form.y
    @Y61.k
    public final m b(int i12) {
        LinkedHashMap linkedHashMap = this.f249776b;
        m mVar = (m) linkedHashMap.get(Integer.valueOf(i12));
        if (mVar != null) {
            return mVar;
        }
        n nVar = new n(i12, this.f249775a);
        linkedHashMap.put(Integer.valueOf(i12), nVar);
        return nVar;
    }
}
