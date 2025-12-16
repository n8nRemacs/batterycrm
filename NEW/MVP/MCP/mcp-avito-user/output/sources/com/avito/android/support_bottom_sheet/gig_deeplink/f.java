package com.avito.android.support_bottom_sheet.gig_deeplink;

import Ku.AbstractC14350a;
import Ku.i;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.avito.android.support_bottom_sheet.GigSupportDialogDeeplink;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: GigSupportDialogDeeplinkParser.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/support_bottom_sheet/gig_deeplink/f;", "LKu/a;", "Lcom/avito/android/support_bottom_sheet/GigSupportDialogDeeplink;", "<init>", "()V", "_avito_gig_support-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f extends AbstractC14350a<GigSupportDialogDeeplink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.WrongParameterValue {
        String queryParameter = uri.getQueryParameter("supportPhone");
        String strP = i.p(uri, "screenTag");
        String strP2 = i.p(uri, "chatActionTitle");
        String queryParameter2 = uri.getQueryParameter("chatActionSubtitle");
        String queryParameter3 = uri.getQueryParameter("phoneActionTitle");
        String queryParameter4 = uri.getQueryParameter("phoneActionSubtitle");
        String queryParameter5 = uri.getQueryParameter("slotId");
        return new GigSupportDialogDeeplink(queryParameter, queryParameter5 != null ? C43066x.z0(queryParameter5) : null, strP, strP2, queryParameter2, queryParameter3, queryParameter4);
    }
}
