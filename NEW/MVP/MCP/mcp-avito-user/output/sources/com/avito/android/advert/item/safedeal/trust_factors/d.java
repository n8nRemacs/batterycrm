package com.avito.android.advert.item.safedeal.trust_factors;

import android.os.Bundle;
import com.avito.android.advert_core.safedeal.trust_factors.TrustFactorsComponent;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.safedeal.SafeDeal;
import kotlin.Metadata;

/* compiled from: SafeDealRouter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/safedeal/trust_factors/d;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface d {

    /* compiled from: SafeDealRouter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void c(@Y61.k DeepLink deepLink, @Y61.l Bundle bundle);

    void e(@Y61.k DeepLink deepLink);

    void i(@Y61.k String str, @Y61.k String str2, @Y61.l SafeDeal.TooltipData.Event event);

    void j(@Y61.k DeepLink deepLink);

    void t(@Y61.k TrustFactorsComponent.ExpandableListItem expandableListItem);
}
