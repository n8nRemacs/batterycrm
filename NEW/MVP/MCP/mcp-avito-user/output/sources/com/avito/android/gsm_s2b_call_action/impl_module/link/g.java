package com.avito.android.gsm_s2b_call_action.impl_module.link;

import Ku.AbstractC14350a;
import Ku.i;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.jvm.internal.s0;

/* compiled from: GsmS2BCallActionLinkParser.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/gsm_s2b_call_action/impl_module/link/g;", "LKu/a;", "Lcom/avito/android/gsm_s2b_call_action/impl_module/link/GsmS2BCallActionLink;", "<init>", "()V", "_avito_gsm-s2b-call-action_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class g extends AbstractC14350a<GsmS2BCallActionLink> {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.avito.android.deep_linking.links.DeepLink] */
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.WrongParameterValue {
        String strP = i.p(uri, "buyerUserId");
        long jM2 = i.m(uri, "itemId");
        String strP2 = i.p(uri, SearchParamsConverterKt.SOURCE);
        String queryParameter = uri.getQueryParameter("onError");
        if (queryParameter != null) {
            Object objC = xVar.c(queryParameter);
            int i12 = Z.f406624c;
            obj = (DeepLink) (objC instanceof Z.b ? null : objC);
        }
        return new GsmS2BCallActionLink(jM2, obj, strP, strP2);
    }
}
