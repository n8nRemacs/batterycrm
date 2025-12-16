package com.avito.android.rubricator.items.service;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.consultation.C;
import com.avito.android.rubricator.items.RubricatorRefinedItem;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SerpRubricatorServiceItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rubricator/items/service/e;", "Lcom/avito/android/rubricator/items/service/d;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class e implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.rubricator.e f255821b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.serp.analytics.widgets_tracker.g f255822c;

    @Inject
    public e(@k com.avito.android.rubricator.e eVar, @k com.avito.android.serp.analytics.widgets_tracker.g gVar) {
        this.f255821b = eVar;
        this.f255822c = gVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        RubricatorRefinedItem.SerpRubricatorGridServiceItem serpRubricatorGridServiceItem = (RubricatorRefinedItem.SerpRubricatorGridServiceItem) aVar;
        gVar.zT(serpRubricatorGridServiceItem);
        gVar.x0(new C(this, serpRubricatorGridServiceItem, i12, 11));
    }
}
