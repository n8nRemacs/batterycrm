package com.avito.android.tariff_lf.edit_info.item.add_category;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AddCategoryItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_lf/edit_info/item/add_category/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/tariff_lf/edit_info/item/add_category/h;", "_avito_tariff-lf_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f298884b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public Y41.a<G0> f298885c;

    public i(@k View view) {
        super(view);
        this.f298884b = view;
        view.setOnClickListener(new com.avito.android.services_transportation_widget.dialog.h(this, 29));
    }

    @Override // com.avito.android.tariff_lf.edit_info.item.add_category.h
    public final void a(@k Y41.a<G0> aVar) {
        this.f298885c = aVar;
    }

    @Override // com.avito.android.tariff_lf.edit_info.item.add_category.h
    public final void setTitle(@k String str) {
        ((TextView) this.f298884b).setText((CharSequence) null);
    }
}
