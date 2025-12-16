package com.avito.android.referral_program.deeplinks;

import Ku.AbstractC14350a;
import Ku.i;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.avito.android.referral_program.ReferralPageDeepLink;
import com.google.gson.Gson;
import kotlin.Metadata;

/* compiled from: ReferralPageDeepLinkParser.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/referral_program/deeplinks/h;", "LKu/a;", "Lcom/avito/android/referral_program/ReferralPageDeepLink;", "<init>", "()V", "_avito_referral-program_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends AbstractC14350a<ReferralPageDeepLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) {
        return new ReferralPageDeepLink(i.n(uri, "pagePath"), i.n(uri, "screenName"), uri.getBooleanQueryParameter("scrollOnKeyboardShown", false));
    }
}
