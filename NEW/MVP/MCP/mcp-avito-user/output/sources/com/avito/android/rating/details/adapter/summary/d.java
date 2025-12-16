package com.avito.android.rating.details.adapter.summary;

import Y41.l;
import Y61.k;
import com.avito.android.adapter.RatingDetailsItem;
import com.avito.android.rating.details.adapter.summary.SummaryItem;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SummaryPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/adapter/summary/d;", "Lcom/avito/android/rating/details/adapter/summary/c;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<RatingDetailsItem, G0> f246558b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public d(@k l<? super RatingDetailsItem, G0> lVar) {
        this.f246558b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        SummaryItem summaryItem = (SummaryItem) aVar;
        fVar.E(summaryItem.f246544g);
        fVar.jK();
        for (SummaryItem.SummaryScore summaryScore : summaryItem.f246540c) {
            fVar.fC(summaryScore.f246545b, summaryScore.f246546c);
        }
        fVar.i60(summaryItem.f246542e);
        fVar.Sn(new com.avito.android.publish.slots.delivery_addresses.f(9, this, summaryItem));
    }
}
