package com.avito.android.spare_parts.bottom_sheet;

import android.app.Application;
import android.content.Intent;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SparePartsBottomSheetIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/spare_parts/bottom_sheet/j;", "Lcom/avito/android/spare_parts/bottom_sheet/i;", "_avito_spare-parts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Application f284792a;

    @Inject
    public j(@Y61.k Application application) {
        this.f284792a = application;
    }

    @Override // com.avito.android.spare_parts.bottom_sheet.i
    @Y61.k
    public final Intent a(@Y61.k SparePartsBottomSheetParams sparePartsBottomSheetParams) {
        return new Intent(this.f284792a, (Class<?>) SparePartsBottomSheetActivity.class).putExtra("key_spare_parts_params", sparePartsBottomSheetParams);
    }
}
