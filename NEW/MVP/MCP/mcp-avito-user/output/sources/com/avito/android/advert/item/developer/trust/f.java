package com.avito.android.advert.item.developer.trust;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.DeveloperCard;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: DeveloperTrustView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/developer/trust/f;", "LTV0/e;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface f extends TV0.e {

    /* compiled from: DeveloperTrustView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void cW(@l Image image, @l AttributedText attributedText);

    void q(@l AttributedText attributedText);

    void sM(@k DeveloperCard developerCard, @k DeveloperCard developerCard2);

    void u50(@l DeveloperCard developerCard);

    void uw(@l DeveloperCard developerCard, boolean z12);
}
