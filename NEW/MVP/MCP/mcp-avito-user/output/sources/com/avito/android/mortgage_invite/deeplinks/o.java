package com.avito.android.mortgage_invite.deeplinks;

import Ku.AbstractC14350a;
import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.avito.android.mortgage_invite.deeplink.MortgageApplicationLeadLink;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.google.gson.Gson;
import kotlin.Metadata;

/* compiled from: MortgageApplicationLeadLinkParser.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mortgage_invite/deeplinks/o;", "LKu/a;", "Lcom/avito/android/mortgage_invite/deeplink/MortgageApplicationLeadLink;", "<init>", "()V", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class o extends AbstractC14350a<MortgageApplicationLeadLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) {
        return new MortgageApplicationLeadLink(uri.getQueryParameter(SearchParamsConverterKt.SOURCE), uri.getQueryParameter("utm_source"));
    }
}
