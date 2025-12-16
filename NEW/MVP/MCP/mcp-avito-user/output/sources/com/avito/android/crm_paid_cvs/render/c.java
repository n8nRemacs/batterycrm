package com.avito.android.crm_paid_cvs.render;

import androidx.recyclerview.widget.C23424o;
import com.avito.android.crm_paid_cvs.dto.FilterItem;
import com.avito.android.crm_paid_cvs.dto.OptionItem;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: FiltersDiffUtil.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/crm_paid_cvs/render/c;", "Landroidx/recyclerview/widget/o$f;", "LTV0/a;", "<init>", "()V", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c extends C23424o.f<TV0.a> {
    @Override // androidx.recyclerview.widget.C23424o.f
    public final boolean a(TV0.a aVar, TV0.a aVar2) {
        FilterItem.FilterType filterType;
        TV0.a aVar3 = aVar;
        TV0.a aVar4 = aVar2;
        if ((aVar3 instanceof FilterItem) && (aVar4 instanceof FilterItem) && ((FilterItem) aVar3).f130358c == (filterType = FilterItem.FilterType.f130365f)) {
            FilterItem filterItem = (FilterItem) aVar4;
            if (filterItem.f130358c == filterType) {
                OptionItem optionItem = (OptionItem) C42745f0.G(filterItem.f130360e);
                return (optionItem != null ? optionItem.f130374f : null) != null;
            }
        }
        return aVar3.equals(aVar4);
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final boolean b(TV0.a aVar, TV0.a aVar2) {
        TV0.a aVar3 = aVar;
        TV0.a aVar4 = aVar2;
        return aVar3.getF80137b() == aVar4.getF80137b() && aVar3.getClass().equals(aVar4.getClass());
    }
}
