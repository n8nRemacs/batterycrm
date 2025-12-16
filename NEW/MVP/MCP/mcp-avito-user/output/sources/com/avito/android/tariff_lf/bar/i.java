package com.avito.android.tariff_lf.bar;

import Y61.l;
import com.avito.android.paid_services.routing.ProgressState;
import com.avito.android.paid_services.routing.TariffCountStatus;
import com.avito.android.tariff.remote.model.bar.BarDescriptionState;
import com.avito.android.tariff.remote.model.bar.BarProgressState;
import kotlin.Metadata;

/* compiled from: TariffBarConverter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_lf/bar/i;", "", "_avito_tariff-lf_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface i {
    @Y61.k
    TariffCountStatus a(@l BarDescriptionState barDescriptionState);

    @Y61.k
    ProgressState b(@l BarProgressState barProgressState);
}
