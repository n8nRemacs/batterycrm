package com.avito.android.tariff_lf.edit_info.item.info;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: InfoItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_lf/edit_info/item/info/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/tariff_lf/edit_info/item/info/g;", "_avito_tariff-lf_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f299008b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f299009c;

    public h(@k View view) {
        super(view);
        this.f299008b = (TextView) view.findViewById(R.id.title);
        this.f299009c = (TextView) view.findViewById(R.id.description);
    }

    @Override // com.avito.android.tariff_lf.edit_info.item.info.g
    public final void h(@k String str) {
        this.f299009c.setText(str);
    }

    @Override // com.avito.android.tariff_lf.edit_info.item.info.g
    public final void setTitle(@k String str) {
        this.f299008b.setText(str);
    }
}
