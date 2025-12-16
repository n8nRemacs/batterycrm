package com.avito.android.iac_util_deeplinks.impl_module.permission_request;

import Ku.AbstractC14350a;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.iac_util_deeplinks.public_module.permission_request.PermissionRequestSystemPopupLink;
import com.google.gson.Gson;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PermissionRequestSystemPopupLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/iac_util_deeplinks/impl_module/permission_request/x;", "LKu/a;", "Lcom/avito/android/iac_util_deeplinks/public_module/permission_request/PermissionRequestSystemPopupLink;", "<init>", "()V", "_avito_iac-util-deeplinks_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class x extends AbstractC14350a<PermissionRequestSystemPopupLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, com.avito.android.deep_linking.x xVar) throws DeeplinkParsingError.WrongParameterValue {
        o oVar = o.f169188a;
        String strN = Ku.i.n(uri, "permission");
        oVar.getClass();
        List listA = o.a(strN);
        String queryParameter = uri.getQueryParameter("onAlreadyGranted");
        DeepLink deepLinkB = queryParameter != null ? xVar.b(queryParameter) : null;
        String queryParameter2 = uri.getQueryParameter("onAlreadyForeverDenied");
        DeepLink deepLinkB2 = queryParameter2 != null ? xVar.b(queryParameter2) : null;
        String queryParameter3 = uri.getQueryParameter("onRequestedAndGranted");
        DeepLink deepLinkB3 = queryParameter3 != null ? xVar.b(queryParameter3) : null;
        String queryParameter4 = uri.getQueryParameter("onRequestedAndDenied");
        DeepLink deepLinkB4 = queryParameter4 != null ? xVar.b(queryParameter4) : null;
        String queryParameter5 = uri.getQueryParameter("onRequestedAndForeverDenied");
        return new PermissionRequestSystemPopupLink(listA, deepLinkB, deepLinkB2, deepLinkB3, deepLinkB4, queryParameter5 != null ? xVar.b(queryParameter5) : null);
    }
}
