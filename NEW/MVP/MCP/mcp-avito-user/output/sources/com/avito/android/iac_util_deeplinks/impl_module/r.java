package com.avito.android.iac_util_deeplinks.impl_module;

import Ku.AbstractC14350a;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.iac_util_deeplinks.public_module.OpenSystemSettingsLink;
import com.avito.android.remote.model.ParametrizedEvent;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.jvm.internal.s0;

/* compiled from: OpenSystemSettingsLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_util_deeplinks/impl_module/r;", "LKu/a;", "Lcom/avito/android/iac_util_deeplinks/public_module/OpenSystemSettingsLink;", "_avito_iac-util-deeplinks_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class r extends AbstractC14350a<OpenSystemSettingsLink> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deep_linking.x f169205a;

    @Inject
    public r(@Y61.k com.avito.android.deep_linking.x xVar) {
        this.f169205a = xVar;
    }

    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, com.avito.android.deep_linking.x xVar) throws DeeplinkParsingError.WrongParameterValue {
        DeepLink deepLink;
        String queryParameter = uri.getQueryParameter("nextLink");
        if (queryParameter != null) {
            Object objC = this.f169205a.c(queryParameter);
            int i12 = Z.f406624c;
            if (objC instanceof Z.b) {
                objC = null;
            }
            deepLink = (DeepLink) objC;
        } else {
            deepLink = null;
        }
        try {
            Type type = new C30966q().getType();
            String queryParameter2 = uri.getQueryParameter("openSettingsEvent");
            return new OpenSystemSettingsLink(deepLink, (ParametrizedEvent) (queryParameter2 != null ? gson.e(queryParameter2, type) : null));
        } catch (JsonParseException e12) {
            throw new DeeplinkParsingError.WrongParameterValue(uri.toString(), "openSettingsEvent", DeeplinkParsingError.FieldConstraint.Json.f133986b, e12);
        }
    }
}
