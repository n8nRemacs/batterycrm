package com.avito.android.tariff_lf_constructor.configure.setting.items.tariff_package;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.spinner.Spinner;
import com.avito.android.tariff_lf_constructor.configure.common.ui.PriceDotsView;
import com.avito.android.tariff_lf_constructor.configure.setting.items.model.ConfigureAttributeModel;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ConstructorSettingPackageItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/setting/items/tariff_package/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/tariff_lf_constructor/configure/setting/items/tariff_package/h;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f300119b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f300120c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ImageView f300121d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f300122e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f300123f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final PriceDotsView f300124g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final PriceDotsView f300125h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final Spinner f300126i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final View f300127j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public Y41.a<G0> f300128k;

    public i(@k View view) {
        super(view);
        this.f300119b = (TextView) view.findViewById(R.id.tv_category);
        this.f300120c = (TextView) view.findViewById(R.id.tv_locations);
        ImageView imageView = (ImageView) view.findViewById(R.id.iv_remove_package);
        this.f300121d = imageView;
        this.f300122e = (TextView) view.findViewById(R.id.tv_size);
        this.f300123f = (TextView) view.findViewById(R.id.tv_subcategories);
        this.f300124g = (PriceDotsView) view.findViewById(R.id.discount_view);
        this.f300125h = (PriceDotsView) view.findViewById(R.id.price_view);
        this.f300126i = (Spinner) view.findViewById(R.id.progress_bar);
        this.f300127j = view.findViewById(R.id.progress_shadow_view);
        imageView.setOnClickListener(new com.avito.android.tariff_lf.edit_info.item.button.i(this, 12));
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.setting.items.tariff_package.h
    public final void F6(@l ConfigureAttributeModel configureAttributeModel) {
        String str = configureAttributeModel != null ? configureAttributeModel.f300086b : null;
        PriceDotsView priceDotsView = this.f300124g;
        priceDotsView.setTitle(str);
        priceDotsView.setValue(configureAttributeModel != null ? configureAttributeModel.f300087c : null);
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.setting.items.tariff_package.h
    public final void GD(@l String str) {
        I5.a(this.f300123f, str, false);
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.setting.items.tariff_package.h
    public final void JR(@k String str) {
        this.f300119b.setText(str);
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.setting.items.tariff_package.h
    public final void Rz(@l ConfigureAttributeModel configureAttributeModel) {
        String str = configureAttributeModel != null ? configureAttributeModel.f300086b : null;
        PriceDotsView priceDotsView = this.f300125h;
        priceDotsView.setTitle(str);
        priceDotsView.setValue(configureAttributeModel != null ? configureAttributeModel.f300087c : null);
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.setting.items.tariff_package.h
    public final void SR(@k String str) {
        I5.a(this.f300120c, str, false);
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.setting.items.tariff_package.h
    public final void kx(@k Y41.a<G0> aVar) {
        this.f300128k = aVar;
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.setting.items.tariff_package.h
    public final void setLoading(boolean z12) {
        D6.G(this.f300121d, !z12);
        D6.G(this.f300126i, z12);
        D6.G(this.f300127j, z12);
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.setting.items.tariff_package.h
    public final void v6(@k String str) {
        I5.a(this.f300122e, str, false);
    }
}
