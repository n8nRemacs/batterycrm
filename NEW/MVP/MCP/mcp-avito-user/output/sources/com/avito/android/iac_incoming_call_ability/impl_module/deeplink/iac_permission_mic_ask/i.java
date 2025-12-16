package com.avito.android.iac_incoming_call_ability.impl_module.deeplink.iac_permission_mic_ask;

import Ku.AbstractC14350a;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.avito.android.iac_incoming_call_ability.public_module.deeplink.iac_permission_mic_ask.IacPermissionMicAskLink;
import com.google.gson.Gson;
import kotlin.Metadata;

/* compiled from: IacPermissionMicAskLinkParser.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/iac_incoming_call_ability/impl_module/deeplink/iac_permission_mic_ask/i;", "LKu/a;", "Lcom/avito/android/iac_incoming_call_ability/public_module/deeplink/iac_permission_mic_ask/IacPermissionMicAskLink;", "<init>", "()V", "_avito_iac-incoming-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class i extends AbstractC14350a<IacPermissionMicAskLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) {
        boolean z12 = Boolean.parseBoolean(uri.getQueryParameter("redirectToSettings"));
        String queryParameter = uri.getQueryParameter("scenario");
        if (queryParameter == null) {
            queryParameter = "";
        }
        return new IacPermissionMicAskLink(z12, queryParameter);
    }
}
