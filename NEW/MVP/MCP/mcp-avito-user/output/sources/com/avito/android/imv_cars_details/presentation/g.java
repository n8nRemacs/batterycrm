package com.avito.android.imv_cars_details.presentation;

import android.content.res.Resources;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ImvCarsDetailsResourceProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/imv_cars_details/presentation/g;", "Lcom/avito/android/imv_cars_details/presentation/f;", "_avito_imv-cars-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f170038a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String[] f170039b;

    @Inject
    public g(@Y61.k Resources resources) {
        this.f170038a = resources.getString(R.string.imv_cars_default_error_text);
        this.f170039b = resources.getStringArray(R.array.imv_cars_details_months_title);
    }

    @Override // com.avito.android.imv_cars_details.presentation.f
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final String getF170038a() {
        return this.f170038a;
    }

    @Override // com.avito.android.imv_cars_details.presentation.f
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String[] getF170039b() {
        return this.f170039b;
    }
}
