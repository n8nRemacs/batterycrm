package com.avito.android.deep_linking.links;

import Ku.AbstractC14350a;
import android.net.Uri;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.google.gson.Gson;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ShowBarcodeLink.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deep_linking/links/c;", "LKu/a;", "Lcom/avito/android/deep_linking/links/ShowBarcodeLink;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.deep_linking.links.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29677c extends AbstractC14350a<ShowBarcodeLink> {
    @Inject
    public C29677c() {
    }

    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, com.avito.android.deep_linking.x xVar) throws DeeplinkParsingError.WrongParameterValue {
        return new ShowBarcodeLink(Ku.i.n(uri, "code"), Ku.i.n(uri, "type"), uri.getQueryParameter("text"), uri.getQueryParameter("providerLabel"));
    }
}
