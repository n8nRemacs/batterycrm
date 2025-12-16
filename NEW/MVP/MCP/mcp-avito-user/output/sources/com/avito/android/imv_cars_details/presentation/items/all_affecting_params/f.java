package com.avito.android.imv_cars_details.presentation.items.all_affecting_params;

import Y61.k;
import android.view.View;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.imv_cars_details.models.AffectingParams;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ImvCarsAllAffectingParamsView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/imv_cars_details/presentation/items/all_affecting_params/f;", "Lcom/avito/android/imv_cars_details/presentation/items/all_affecting_params/e;", "Lcom/avito/konveyor/adapter/b;", "_avito_imv-cars-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f extends com.avito.konveyor.adapter.b implements e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f170054b;

    public f(@k View view) {
        super(view);
        this.f170054b = view;
    }

    @Override // com.avito.android.imv_cars_details.presentation.items.all_affecting_params.e
    public final void yH(@k AffectingParams affectingParams) {
        Button button = (Button) this.f170054b;
        button.setText(affectingParams.getButtonText());
        button.setOnClickListener(new com.avito.android.extended_profile_ui_components.c(25, this, affectingParams));
    }
}
