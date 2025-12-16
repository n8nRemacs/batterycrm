package com.avito.android.auto_evidence_request.deepLink;

import Ku.AbstractC14350a;
import Ku.i;
import android.net.Uri;
import com.avito.android.auto_evidence_request_public.AutoEvidenceRequestDeepLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.google.gson.Gson;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AutoEvidenceRequestDeeplinkParser.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/auto_evidence_request/deepLink/e;", "LKu/a;", "Lcom/avito/android/auto_evidence_request_public/AutoEvidenceRequestDeepLink;", "<init>", "()V", "_avito_auto-evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e extends AbstractC14350a<AutoEvidenceRequestDeepLink> {
    @Inject
    public e() {
    }

    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) {
        return new AutoEvidenceRequestDeepLink(i.n(uri, "appealId"), uri.getQueryParameter("appealUrl"), i.n(uri, "itemId"), i.n(uri, "proofType"));
    }
}
