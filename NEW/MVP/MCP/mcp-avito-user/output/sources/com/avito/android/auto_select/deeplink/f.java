package com.avito.android.auto_select.deeplink;

import Ku.AbstractC14350a;
import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.AutoSelectBookingCompletionLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.links.models.AutoSelectConfirmationDialogContentDto;
import com.avito.android.deep_linking.x;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import lD.C43617a;

/* compiled from: AutoSelectBookingCompletionLinkParser.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/auto_select/deeplink/f;", "LKu/a;", "Lcom/avito/android/deep_linking/links/AutoSelectBookingCompletionLink;", "_avito_auto-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f extends AbstractC14350a<AutoSelectBookingCompletionLink> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C43617a f96045a;

    @Inject
    public f(@Y61.k C43617a c43617a) {
        this.f96045a = c43617a;
    }

    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.WrongParameterValue, DeeplinkParsingError.FeatureToggleDisabled {
        C43617a c43617a = this.f96045a;
        c43617a.getClass();
        kotlin.reflect.n<Object> nVar = C43617a.f413588V[20];
        Ku.i.k(uri, c43617a.f413630v.a());
        String queryParameter = uri.getQueryParameter("itemId");
        if (queryParameter == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        d dVar = new d(uri);
        try {
            Type type = new e().getType();
            String queryParameter2 = uri.getQueryParameter("content");
            Object objE = queryParameter2 != null ? gson.e(queryParameter2, type) : null;
            if (objE != null) {
                return new AutoSelectBookingCompletionLink(queryParameter, (AutoSelectConfirmationDialogContentDto) objE);
            }
            dVar.invoke(new IllegalArgumentException("Parameter content is null!"));
            throw null;
        } catch (JsonParseException e12) {
            dVar.invoke(e12);
            throw null;
        }
    }
}
