package com.avito.android.extended_profile_widgets.adapter.job_item_list_header;

import Y41.l;
import Y61.k;
import com.avito.android.di.B;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: JobCompanyItemListHeaderPresenter.kt */
@B
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/job_item_list_header/d;", "LTV0/d;", "Lcom/avito/android/extended_profile_widgets/adapter/job_item_list_header/f;", "Lcom/avito/android/extended_profile_widgets/adapter/job_item_list_header/JobCompanyItemListHeaderItem;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d implements TV0.d<f, JobCompanyItemListHeaderItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<oB.k, G0> f154537b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public d(@k l<? super oB.k, G0> lVar) {
        this.f154537b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        JobCompanyItemListHeaderItem jobCompanyItemListHeaderItem = (JobCompanyItemListHeaderItem) aVar;
        c cVar = new c(this, jobCompanyItemListHeaderItem);
        fVar.f154540b.setText(jobCompanyItemListHeaderItem.f154529d);
        fVar.f154541c.setOnClickListener(new com.avito.android.extended_profile_widgets.adapter.header.k(7, cVar));
    }
}
