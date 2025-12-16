package com.avito.android.iac_outgoing_call_ability.impl_module.deep_link.launch_dialer;

import Ku.AbstractC14350a;
import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.avito.android.iac_outgoing_call_ability.public_module.deep_link.launch_dialer.IacStartRecallFromSystemApiLink;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: IacStartRecallFromSystemApiLinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/iac_outgoing_call_ability/impl_module/deep_link/launch_dialer/m;", "LKu/a;", "Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/launch_dialer/IacStartRecallFromSystemApiLink;", "<init>", "()V", "_avito_iac-outgoing-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class m extends AbstractC14350a<IacStartRecallFromSystemApiLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) {
        return new IacStartRecallFromSystemApiLink(Ku.i.n(uri, "prevCallId"), Ku.i.n(uri, "scenario"), L.f(uri.getQueryParameter("isVideo"), "true") || L.f(uri.getQueryParameter("isVideo"), "1"));
    }
}
