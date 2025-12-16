package com.avito.android.advert_core.equipments.redesign.bottom_sheet.item.title;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import kotlin.Metadata;

/* compiled from: DialogOptionTitleItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_core/equipments/redesign/bottom_sheet/item/title/f;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert_core/equipments/redesign/bottom_sheet/item/title/e;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class f extends com.avito.konveyor.adapter.b implements e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f83519b;

    public f(@k View view) {
        super(view);
        this.f83519b = (TextView) view;
    }

    @Override // com.avito.android.advert_core.equipments.redesign.bottom_sheet.item.title.e
    public final void setTitle(@k String str) {
        this.f83519b.setText(str);
    }
}
