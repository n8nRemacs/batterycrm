package com.avito.android.rating_form.item.photo_picker;

import java.util.LinkedHashMap;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: RatingModelFormPhotoCategoryStorage.kt */
@Singleton
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating_form/item/photo_picker/n;", "Lcom/avito/android/rating_form/item/photo_picker/m;", "<init>", "()V", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class n implements m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f248552a = new LinkedHashMap();

    @Inject
    public n() {
    }

    @Override // com.avito.android.rating_form.item.photo_picker.m
    public final void a(@Y61.k String str, @Y61.k String str2) {
        this.f248552a.put(str, str2);
    }

    @Override // com.avito.android.rating_form.item.photo_picker.m
    @Y61.l
    public final String b(@Y61.k String str) {
        return (String) this.f248552a.get(str);
    }
}
