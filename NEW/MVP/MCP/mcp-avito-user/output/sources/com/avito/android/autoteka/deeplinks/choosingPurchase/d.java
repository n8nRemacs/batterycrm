package com.avito.android.autoteka.deeplinks.choosingPurchase;

import Ku.AbstractC14350a;
import android.net.Uri;
import com.avito.android.autoteka.deeplinks.AutotekaChoosingPurchaseLink;
import com.avito.android.autoteka.deeplinks.ChoosingPurchaseDetails;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: AutotekaChoosingPurchaseDeepLinkParser.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/autoteka/deeplinks/choosingPurchase/d;", "LKu/a;", "Lcom/avito/android/autoteka/deeplinks/AutotekaChoosingPurchaseLink;", "<init>", "()V", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d extends AbstractC14350a<AutotekaChoosingPurchaseLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) {
        String queryParameter = uri.getQueryParameter("actionType");
        String queryParameter2 = uri.getQueryParameter("searchKey");
        String queryParameter3 = uri.getQueryParameter("autotekaX");
        if (queryParameter3 == null) {
            com.avito.android.autoteka.helpers.c.f96648a.getClass();
            queryParameter3 = com.avito.android.autoteka.helpers.c.a();
        }
        String str = queryParameter3;
        String queryParameter4 = uri.getQueryParameter("fromBlock");
        return new AutotekaChoosingPurchaseLink(new ChoosingPurchaseDetails(queryParameter2, str, queryParameter4 != null ? C43066x.z0(queryParameter4) : null, queryParameter, uri.getQueryParameter("repurchase") != null));
    }
}
