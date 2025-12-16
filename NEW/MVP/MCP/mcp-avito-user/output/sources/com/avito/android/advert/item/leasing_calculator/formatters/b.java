package com.avito.android.advert.item.leasing_calculator.formatters;

import android.content.res.Resources;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertLeasingInputErrorProvider.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/leasing_calculator/formatters/b;", "Lcom/avito/android/advert/item/leasing_calculator/formatters/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Resources f77386a;

    @Inject
    public b(@Y61.k Resources resources) {
        this.f77386a = resources;
    }

    @Override // com.avito.android.advert.item.leasing_calculator.formatters.a
    @Y61.l
    public final String a(@Y61.l Long l12, @Y61.l Long l13) {
        Resources resources = this.f77386a;
        if (l12 != null && l13 != null) {
            return resources.getString(R.string.advert_details_leasing_calculator_input_error, l12, l13);
        }
        if (l12 != null) {
            return resources.getString(R.string.advert_details_leasing_calculator_min_input_error, l12);
        }
        if (l13 != null) {
            return resources.getString(R.string.advert_details_leasing_calculator_max_input_error, l13);
        }
        return null;
    }
}
