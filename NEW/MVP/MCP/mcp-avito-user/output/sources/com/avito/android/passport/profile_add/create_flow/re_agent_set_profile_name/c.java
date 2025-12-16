package com.avito.android.passport.profile_add.create_flow.re_agent_set_profile_name;

import Ku.AbstractC14350a;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.google.gson.Gson;
import kotlin.Metadata;

/* compiled from: ReAgentSetProfileNameDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/re_agent_set_profile_name/c;", "LKu/a;", "Lcom/avito/android/passport/profile_add/create_flow/re_agent_set_profile_name/ReAgentSetProfileNameDeeplink;", "<init>", "()V", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c extends AbstractC14350a<ReAgentSetProfileNameDeeplink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) {
        return new ReAgentSetProfileNameDeeplink(Ku.i.p(uri, MessageBody.SystemMessageBody.Platform.FLOW), Ku.i.l(uri, "verticalId"), Ku.i.l(uri, "specificId"));
    }
}
