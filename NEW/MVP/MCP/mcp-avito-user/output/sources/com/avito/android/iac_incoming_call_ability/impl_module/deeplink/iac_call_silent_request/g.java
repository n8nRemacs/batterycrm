package com.avito.android.iac_incoming_call_ability.impl_module.deeplink.iac_call_silent_request;

import Ku.AbstractC14350a;
import Ku.i;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.avito.android.iac_incoming_call_ability.public_module.deeplink.iac_call_silent_request.IacCallSilentRequestDeeplink;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.google.gson.Gson;
import kotlin.Metadata;

/* compiled from: IacCallSilentRequestDeeplinkParser.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/iac_incoming_call_ability/impl_module/deeplink/iac_call_silent_request/g;", "LKu/a;", "Lcom/avito/android/iac_incoming_call_ability/public_module/deeplink/iac_call_silent_request/IacCallSilentRequestDeeplink;", "<init>", "()V", "_avito_iac-incoming-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g extends AbstractC14350a<IacCallSilentRequestDeeplink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) {
        return new IacCallSilentRequestDeeplink(i.p(uri, "itemId"), i.p(uri, ChannelContext.Item.USER_ID));
    }
}
