package com.avito.android.iac_outgoing_call_ability.impl_module.deep_link.launch_dialer;

import Ku.AbstractC14350a;
import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.avito.android.iac_outgoing_call_ability.public_module.deep_link.launch_dialer.IacStartNewCallLink;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.google.gson.Gson;
import com.huawei.hms.api.FailedBinderCallBack;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: IacStartNewCallLinkHandler.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/iac_outgoing_call_ability/impl_module/deep_link/launch_dialer/g;", "LKu/a;", "Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/launch_dialer/IacStartNewCallLink;", "<init>", "()V", "_avito_iac-outgoing-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g extends AbstractC14350a<IacStartNewCallLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.WrongParameterValue {
        String queryParameter = uri.getQueryParameter(FailedBinderCallBack.CALLER_ID);
        String str = (queryParameter == null || C43066x.K(queryParameter)) ? null : queryParameter;
        String strN = Ku.i.n(uri, InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME);
        String strN2 = Ku.i.n(uri, InlineFilterValue.InlineFilterDateRangeValue.TO_PARAM_NAME);
        String strN3 = Ku.i.n(uri, "scenario");
        boolean z12 = Boolean.parseBoolean(Ku.i.n(uri, "isVideo"));
        String queryParameter2 = uri.getQueryParameter("itemId");
        return new IacStartNewCallLink(str, strN, z12, strN2, strN3, queryParameter2 != null ? C43066x.z0(queryParameter2) : null, (Map) gson.e(uri.getQueryParameter("extraInfo"), new f().getType()), (Map) gson.e(uri.getQueryParameter("analyticsExtraParams"), new f().getType()));
    }
}
