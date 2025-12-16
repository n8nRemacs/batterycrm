package com.avito.android.advert_core.equipments.redesign.bottom_sheet.item.gap;

import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;

/* compiled from: DialogOptionGapItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_core/equipments/redesign/bottom_sheet/item/gap/f;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert_core/equipments/redesign/bottom_sheet/item/gap/e;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class f extends com.avito.konveyor.adapter.b implements e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f83503b;

    public f(@k View view) {
        super(view);
        this.f83503b = view;
    }

    @Override // com.avito.android.advert_core.equipments.redesign.bottom_sheet.item.gap.e
    public final void N(int i12) {
        View view = this.f83503b;
        if (view.getHeight() != i12) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = i12;
            view.setLayoutParams(layoutParams);
        }
    }
}
