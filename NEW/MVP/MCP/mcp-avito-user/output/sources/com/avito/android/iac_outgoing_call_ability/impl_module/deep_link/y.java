package com.avito.android.iac_outgoing_call_ability.impl_module.deep_link;

import Ku.AbstractC14350a;
import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.PhoneLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.iac_outgoing_call_ability.public_module.deep_link.IacMakeSupportCallLink;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: IacMakeSupportCallLinkParser.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/iac_outgoing_call_ability/impl_module/deep_link/y;", "LKu/a;", "Lcom/avito/android/iac_outgoing_call_ability/public_module/deep_link/IacMakeSupportCallLink;", "<init>", "()V", "_avito_iac-outgoing-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class y extends AbstractC14350a<IacMakeSupportCallLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, com.avito.android.deep_linking.x xVar) throws DeeplinkParsingError.WrongParameterValue {
        String queryParameter = uri.getQueryParameter("supportPhone");
        PhoneLink.Call call = queryParameter != null ? new PhoneLink.Call(queryParameter, null, 2, null) : null;
        w wVar = new w(uri);
        try {
            Type type = new x().getType();
            String queryParameter2 = uri.getQueryParameter("extraInfo");
            Object objE = queryParameter2 != null ? gson.e(queryParameter2, type) : null;
            if (objE != null) {
                return new IacMakeSupportCallLink((Map) objE, call);
            }
            wVar.invoke(new IllegalArgumentException("Parameter extraInfo is null!"));
            throw null;
        } catch (JsonParseException e12) {
            wVar.invoke(e12);
            throw null;
        }
    }
}
