package com.avito.android.advert.item.additionalSeller.feature_item;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: FeatureItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/additionalSeller/feature_item/e;", "LTV0/d;", "Lcom/avito/android/advert/item/additionalSeller/feature_item/f;", "Lcom/avito/android/advert/item/additionalSeller/feature_item/FeatureItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e implements TV0.d<f, FeatureItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<Integer, G0> f72578b;

    /* JADX WARN: Multi-variable type inference failed */
    public e(@k l<? super Integer, G0> lVar) {
        this.f72578b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        FeatureItem featureItem = (FeatureItem) aVar;
        fVar.setTitle(featureItem.f72571c);
        fVar.l(featureItem.f72572d);
        fVar.c(new d(this, i12));
    }
}
