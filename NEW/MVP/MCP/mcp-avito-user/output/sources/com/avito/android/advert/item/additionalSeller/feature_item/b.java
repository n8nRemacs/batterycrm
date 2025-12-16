package com.avito.android.advert.item.additionalSeller.feature_item;

import TV0.g;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: FeatureItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/additionalSeller/feature_item/b;", "LTV0/b;", "Lcom/avito/android/advert/item/additionalSeller/feature_item/f;", "Lcom/avito/android/advert/item/additionalSeller/feature_item/FeatureItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b implements TV0.b<f, FeatureItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e f72574a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<g> f72575b = new g.a<>(R.layout.advert_details_additional_seller_feature_item, a.f72573l);

    public b(@k e eVar) {
        this.f72574a = eVar;
    }

    @Override // TV0.b
    @k
    public final TV0.d<f, FeatureItem> a() {
        return this.f72574a;
    }

    @Override // TV0.b
    @k
    public final g.a<g> b() {
        return this.f72575b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof FeatureItem;
    }
}
