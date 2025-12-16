package com.avito.android.advert_details_items.flats;

import Y61.k;
import Y61.l;
import com.avito.android.advert_core.advert.AdvertDetailsFlatViewType;
import com.avito.android.remote.model.AdvertParameters;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;

/* compiled from: AdvertDetailsFlatsView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_details_items/flats/f;", "LTV0/e;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface f extends TV0.e {

    /* compiled from: AdvertDetailsFlatsView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void AZ(@l AttributedText attributedText, @k AdvertDetailsFlatViewType advertDetailsFlatViewType);

    void C4(@l AttributedText attributedText);

    void eD(@l Integer num);

    void l30(@k List<AdvertParameters.Parameter> list, @k AdvertDetailsFlatViewType advertDetailsFlatViewType);

    void w(@l AttributedText attributedText);

    void y1();
}
