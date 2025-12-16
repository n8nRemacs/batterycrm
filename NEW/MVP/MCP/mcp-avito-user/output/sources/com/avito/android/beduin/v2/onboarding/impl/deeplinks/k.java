package com.avito.android.beduin.v2.onboarding.impl.deeplinks;

import Ku.AbstractC14350a;
import android.net.Uri;
import com.avito.android.beduin.v2.onboarding.BeduinV2OnboardingDeepLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.google.gson.Gson;
import kotlin.Metadata;

/* compiled from: BeduinV2OnboardingDeepLinkParser.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/v2/onboarding/impl/deeplinks/k;", "LKu/a;", "Lcom/avito/android/beduin/v2/onboarding/BeduinV2OnboardingDeepLink;", "<init>", "()V", "_avito_beduin-v2-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class k extends AbstractC14350a<BeduinV2OnboardingDeepLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.WrongParameterValue {
        String strN = Ku.i.n(uri, "id");
        String queryParameter = uri.getQueryParameter("eventEncoded");
        String queryParameter2 = uri.getQueryParameter("height");
        if (queryParameter2 == null) {
            queryParameter2 = "fit";
        }
        return new BeduinV2OnboardingDeepLink(strN, queryParameter, queryParameter2, uri.getQueryParameter("context"));
    }
}
