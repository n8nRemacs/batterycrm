package com.avito.android.campaigns_sale.deep_link;

import Ku.AbstractC14350a;
import Ku.i;
import android.net.Uri;
import com.avito.android.deep_linking.links.CampaignsSaleLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.google.gson.Gson;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CampaignsSaleLinkParser.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/campaigns_sale/deep_link/f;", "LKu/a;", "Lcom/avito/android/deep_linking/links/CampaignsSaleLink;", "<init>", "()V", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f extends AbstractC14350a<CampaignsSaleLink> {
    @Inject
    public f() {
    }

    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) {
        return new CampaignsSaleLink(i.p(uri, "saleId"), uri.getQueryParameter("fromPage"), uri.getQueryParameter("selectedItemId"));
    }
}
