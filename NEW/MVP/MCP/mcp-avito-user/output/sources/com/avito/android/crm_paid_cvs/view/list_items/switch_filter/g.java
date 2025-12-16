package com.avito.android.crm_paid_cvs.view.list_items.switch_filter;

import Y41.l;
import Y61.k;
import com.avito.android.crm_paid_cvs.dto.FilterItem;
import com.avito.android.crm_paid_cvs.dto.OptionItem;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: SwitchFilterPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_paid_cvs/view/list_items/switch_filter/g;", "Lcom/avito/android/crm_paid_cvs/view/list_items/switch_filter/e;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g implements e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<String, G0> f131036b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public g(@k @Named("SWITCH_TOGGLE") l<? super String, G0> lVar) {
        this.f131036b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        i iVar = (i) eVar;
        FilterItem filterItem = (FilterItem) aVar;
        OptionItem optionItem = (OptionItem) C42745f0.G(filterItem.f130360e);
        Boolean boolValueOf = optionItem != null ? Boolean.valueOf(optionItem.f130371c) : null;
        if (boolValueOf == null) {
            iVar.setVisible(false);
            return;
        }
        iVar.setVisible(true);
        iVar.setTitle(filterItem.f130359d);
        iVar.setSelected(boolValueOf.booleanValue());
        iVar.A0(new f(this, filterItem));
    }
}
