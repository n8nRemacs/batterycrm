package com.avito.android.buy_contact.deeplink;

import Ku.AbstractC14350a;
import android.net.Uri;
import com.avito.android.buy_contact_link.link.JobBuyContactLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.google.gson.Gson;
import kotlin.Metadata;

/* compiled from: BuyContactDeeplinkParser.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/buy_contact/deeplink/j;", "LKu/a;", "Lcom/avito/android/buy_contact_link/link/JobBuyContactLink;", "<init>", "()V", "_avito_job_buy-contact-link_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class j extends AbstractC14350a<JobBuyContactLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) {
        return new JobBuyContactLink(Ku.i.p(uri, "itemId"), Ku.i.p(uri, SearchParamsConverterKt.SOURCE));
    }
}
