package com.avito.android.details_sheet;

import android.app.Application;
import android.content.Intent;
import android.os.Parcelable;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.deep_linking.links.DetailsSheetLinkBody;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DetailsSheetIntentFactoryImpl.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/details_sheet/i;", "Lcom/avito/android/details_sheet/h;", "_avito_details-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Application f135955a;

    @Inject
    public i(@Y61.k Application application) {
        this.f135955a = application;
    }

    @Override // com.avito.android.details_sheet.h
    @Y61.k
    public final Intent a(@Y61.k DetailsSheetLinkBody detailsSheetLinkBody, @Y61.l ParametrizedClickStreamEvent parametrizedClickStreamEvent) {
        return new Intent(this.f135955a, (Class<?>) DetailsSheetActivity.class).putExtra("DETAILS_SHEET_ACTIVITY_EXTRA_BODY", detailsSheetLinkBody).putExtra("DETAILS_SHEET_ACTIVITY_EXTRA_CLICK_EVENT", (Parcelable) null).putExtra("DETAILS_SHEET_ACTIVITY_EXTRA_DISPLAY_EVENT", parametrizedClickStreamEvent);
    }
}
