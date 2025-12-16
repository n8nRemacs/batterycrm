package com.avito.android.tariff_lf_constructor.configure.category.items.content;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ConfigureCategoryItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/category/items/content/i;", "Lcom/avito/android/tariff_lf_constructor/configure/category/items/content/h;", "Lcom/avito/konveyor/adapter/b;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f299406b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f299407c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f299408d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public Y41.a<G0> f299409e;

    public i(@k View view) {
        super(view);
        this.f299406b = view;
        this.f299407c = (TextView) view.findViewById(R.id.tv_title);
        this.f299408d = (TextView) view.findViewById(R.id.tv_subtitle);
        view.setOnClickListener(new com.avito.android.tariff_lf.edit_info.item.button.i(this, 8));
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.category.items.content.h
    public final void n0(@l String str) {
        I5.a(this.f299408d, str, false);
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.category.items.content.h
    public final void p3(@k Y41.a<G0> aVar) {
        this.f299409e = aVar;
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.category.items.content.h
    public final void setEnabled(boolean z12) {
        int iD2 = C35835l0.d(z12 ? R.attr.black : R.attr.gray36, this.f299406b.getContext());
        this.f299407c.setTextColor(iD2);
        this.f299408d.setTextColor(iD2);
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.category.items.content.h
    public final void setTitle(@k String str) {
        this.f299407c.setText(str);
    }
}
