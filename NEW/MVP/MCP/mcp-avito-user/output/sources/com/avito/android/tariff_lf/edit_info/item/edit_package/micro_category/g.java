package com.avito.android.tariff_lf.edit_info.item.edit_package.micro_category;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.I5;
import kotlin.Metadata;

/* compiled from: MicroCategoryItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_lf/edit_info/item/edit_package/micro_category/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/tariff_lf/edit_info/item/edit_package/micro_category/f;", "_avito_tariff-lf_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f298934b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f298935c;

    public g(@k View view) {
        super(view);
        this.f298934b = (TextView) view.findViewById(R.id.title);
        this.f298935c = (TextView) view.findViewById(R.id.subcategories);
    }

    @Override // com.avito.android.tariff_lf.edit_info.item.edit_package.micro_category.f
    public final void f(@l String str) {
        I5.a(this.f298935c, str, false);
    }

    @Override // com.avito.android.tariff_lf.edit_info.item.edit_package.micro_category.f
    public final void setTitle(@k String str) {
        this.f298934b.setText(str);
    }
}
