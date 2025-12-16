package com.avito.android.tariff_lf.edit_info.item.button;

import Y61.l;
import android.view.View;
import com.avito.android.lib.design.button.Button;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ButtonItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_lf/edit_info/item/button/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/tariff_lf/edit_info/item/button/h;", "_avito_tariff-lf_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f298915b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public Y41.a<G0> f298916c;

    public j(@Y61.k View view) {
        super(view);
        this.f298915b = view;
        view.setOnClickListener(new i(this, 0));
    }

    @Override // com.avito.android.tariff_lf.edit_info.item.button.h
    public final void a(@Y61.k Y41.a<G0> aVar) {
        this.f298916c = aVar;
    }

    @Override // com.avito.android.tariff_lf.edit_info.item.button.h
    public final void setTitle(@Y61.k String str) {
        ((Button) this.f298915b).setText((CharSequence) null);
    }
}
