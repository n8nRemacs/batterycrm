package com.avito.android.messenger_icebreakers_dialog.deeplink;

import Ku.AbstractC14350a;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MessengerIcebreakerDialogDeeplinkParser.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/messenger_icebreakers_dialog/deeplink/v;", "LKu/a;", "Lcom/avito/android/messenger_icebreakers_dialog/deeplink/MessengerIcebreakerDialogDeeplink;", "<init>", "()V", "_avito_messenger-icebreakers-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class v extends AbstractC14350a<MessengerIcebreakerDialogDeeplink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.WrongParameterValue {
        String strP = Ku.i.p(uri, "itemId");
        String queryParameter = uri.getQueryParameter("context");
        String queryParameter2 = uri.getQueryParameter(SearchParamsConverterKt.SOURCE);
        String queryParameter3 = uri.getQueryParameter("xHash");
        String queryParameter4 = uri.getQueryParameter("phoneDeeplink");
        return new MessengerIcebreakerDialogDeeplink(strP, queryParameter, queryParameter2, queryParameter3, queryParameter4 != null ? xVar.b(queryParameter4) : null);
    }
}
