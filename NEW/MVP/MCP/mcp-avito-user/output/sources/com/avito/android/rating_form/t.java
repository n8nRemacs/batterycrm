package com.avito.android.rating_form;

import android.content.res.Resources;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: RatingFormResourceProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/t;", "Lcom/avito/android/rating_form/s;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class t implements s {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Resources f249767a;

    @Inject
    public t(@Y61.k Resources resources) {
        this.f249767a = resources;
    }

    @Override // com.avito.android.rating_form.s
    @Y61.k
    public final String a(int i12, int i13) {
        return this.f249767a.getString(R.string.rating_form_toolbar_title, Integer.valueOf(i12), Integer.valueOf(i13));
    }
}
