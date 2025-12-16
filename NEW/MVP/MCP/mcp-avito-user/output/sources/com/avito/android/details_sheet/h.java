package com.avito.android.details_sheet;

import android.content.Intent;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.deep_linking.links.DetailsSheetLinkBody;
import kotlin.Metadata;

/* compiled from: DetailsSheetIntentFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/details_sheet/h;", "", "_avito_details-sheet_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface h {

    /* compiled from: DetailsSheetIntentFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @Y61.k
    Intent a(@Y61.k DetailsSheetLinkBody detailsSheetLinkBody, @Y61.l ParametrizedClickStreamEvent parametrizedClickStreamEvent);
}
