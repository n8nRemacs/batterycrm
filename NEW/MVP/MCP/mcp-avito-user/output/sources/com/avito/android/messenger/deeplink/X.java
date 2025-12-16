package com.avito.android.messenger.deeplink;

import Ku.AbstractC14350a;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.google.gson.Gson;
import kotlin.Metadata;

/* compiled from: IacSellerChannelCallLinkParser.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/messenger/deeplink/X;", "LKu/a;", "Lcom/avito/android/messenger/deeplink/IacSellerChannelCallLinkV1;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class X extends AbstractC14350a<IacSellerChannelCallLinkV1> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, com.avito.android.deep_linking.x xVar) {
        return new IacSellerChannelCallLinkV1(Boolean.parseBoolean(uri.getQueryParameter("isIacOnly")));
    }
}
