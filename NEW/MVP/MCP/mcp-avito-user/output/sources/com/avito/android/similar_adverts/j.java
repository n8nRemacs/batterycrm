package com.avito.android.similar_adverts;

import android.content.res.Resources;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SimilarAdvertsResourceProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/similar_adverts/j;", "Lcom/avito/android/similar_adverts/i;", "_avito_similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Resources f283935a;

    @Inject
    public j(@Y61.k Resources resources) {
        this.f283935a = resources;
    }

    @Override // com.avito.android.similar_adverts.i
    public final int a() {
        return this.f283935a.getInteger(R.integer.similar_adverts_columns);
    }
}
