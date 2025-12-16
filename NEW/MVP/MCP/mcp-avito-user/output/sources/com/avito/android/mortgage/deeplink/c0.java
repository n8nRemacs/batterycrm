package com.avito.android.mortgage.deeplink;

import Ku.AbstractC14350a;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.google.gson.Gson;
import kotlin.Metadata;

/* compiled from: MortgageSignParser.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mortgage/deeplink/c0;", "LKu/a;", "Lcom/avito/android/mortgage/deeplink/MortgageSignLink;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c0 extends AbstractC14350a<MortgageSignLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, com.avito.android.deep_linking.x xVar) throws DeeplinkParsingError.WrongParameterValue {
        return new MortgageSignLink(Ku.i.p(uri, "title"), Ku.i.p(uri, "packageId"), Ku.i.p(uri, "documentId"), Ku.i.p(uri, "applicantId"), uri.getQueryParameter("applicantType"), uri.getQueryParameter("applicationId"), uri.getQueryParameter("error"));
    }
}
