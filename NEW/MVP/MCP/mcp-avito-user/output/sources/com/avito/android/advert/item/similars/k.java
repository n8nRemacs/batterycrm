package com.avito.android.advert.item.similars;

import android.content.res.Resources;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.ab_tests.configs.GridLayoutWithTwoColumnsAbTestGroup;
import javax.inject.Inject;
import kotlin.Metadata;
import s3.C47983s;

/* compiled from: AdvertSimilarPresenterResourceProvider.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/similars/k;", "Lcom/avito/android/advert/item/similars/j;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public class k implements j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Resources f80290a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final u3.l<GridLayoutWithTwoColumnsAbTestGroup> f80291b;

    @Inject
    public k(@Y61.k Resources resources, @Y61.k u3.l<GridLayoutWithTwoColumnsAbTestGroup> lVar) {
        this.f80290a = resources;
        this.f80291b = lVar;
    }

    @Override // com.avito.android.advert.item.similars.j
    public final int a() throws Resources.NotFoundException {
        return C47983s.a(this.f80291b, this.f80290a.getInteger(R.integer.similar_adverts_columns));
    }

    @Override // com.avito.android.advert.item.similars.j
    public final int getSpanCount() throws Resources.NotFoundException {
        return C47983s.a(this.f80291b, this.f80290a.getInteger(R.integer.serp_columns));
    }
}
