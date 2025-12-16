package com.avito.android.tariff_lf_constructor.configure.setting.items.placing;

import Y61.k;
import Y61.l;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ConstructorSettingPlacingButtonItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/setting/items/placing/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/tariff_lf_constructor/configure/setting/items/placing/h;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: b, reason: collision with root package name */
    @l
    public Y41.a<G0> f300099b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Button f300100c;

    public i(@k View view) {
        super(view);
        this.f300100c = (Button) view.findViewById(R.id.btn_placing_order);
        view.setOnClickListener(new com.avito.android.tariff_lf.edit_info.item.button.i(this, 11));
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.setting.items.placing.h
    public final void a(@k Y41.a<G0> aVar) {
        this.f300099b = aVar;
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.setting.items.placing.h
    public final void setTitle(@k String str) {
        this.f300100c.setText(str);
    }
}
