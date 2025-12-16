package com.avito.android.messenger.deeplink;

import Ku.AbstractC14350a;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.google.gson.Gson;
import kotlin.Metadata;

/* compiled from: ChannelIacCallLinkParser.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/messenger/deeplink/u;", "LKu/a;", "Lcom/avito/android/messenger/deeplink/ChannelIacCallLink;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.deeplink.u, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32409u extends AbstractC14350a<ChannelIacCallLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, com.avito.android.deep_linking.x xVar) throws DeeplinkParsingError.WrongParameterValue {
        String strP = Ku.i.p(uri, "scenario");
        String queryParameter = uri.getQueryParameter("redirectLink");
        return new ChannelIacCallLink(strP, Boolean.parseBoolean(uri.getQueryParameter("skipCallOptions")), queryParameter != null ? xVar.b(queryParameter) : null);
    }
}
