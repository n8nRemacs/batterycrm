package com.avito.android.crm_paid_cvs.view.list_items.chips_filter;

import Y41.p;
import com.avito.android.crm_paid_cvs.dto.FilterItem;
import com.avito.android.crm_paid_cvs.dto.OptionItem;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ChipsFilterPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_paid_cvs/view/list_items/chips_filter/g;", "Lcom/avito/android/crm_paid_cvs/view/list_items/chips_filter/e;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g implements e {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final p<String, OptionItem, G0> f130821b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public g(@Y61.k p<? super String, ? super OptionItem, G0> pVar) {
        this.f130821b = pVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        i iVar = (i) eVar;
        FilterItem filterItem = (FilterItem) aVar;
        iVar.setTitle(filterItem.f130359d);
        iVar.L3(new f(this, filterItem), filterItem.f130360e);
    }
}
