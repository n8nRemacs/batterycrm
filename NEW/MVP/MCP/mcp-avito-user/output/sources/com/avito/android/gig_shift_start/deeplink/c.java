package com.avito.android.gig_shift_start.deeplink;

import Ku.AbstractC14350a;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.avito.android.gig_shift_start.GigShiftFinishDeeplink;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: GigShiftStartDeeplinkParser.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/gig_shift_start/deeplink/c;", "LKu/a;", "Lcom/avito/android/gig_shift_start/GigShiftFinishDeeplink;", "<init>", "()V", "_avito_gig_start-shift-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class c extends AbstractC14350a<GigShiftFinishDeeplink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) {
        String queryParameter = uri.getQueryParameter("slotId");
        Long lZ02 = queryParameter != null ? C43066x.z0(queryParameter) : null;
        String queryParameter2 = uri.getQueryParameter("withoutQR");
        return new GigShiftFinishDeeplink(lZ02, queryParameter2 != null ? C43066x.v0(queryParameter2) : null);
    }
}
