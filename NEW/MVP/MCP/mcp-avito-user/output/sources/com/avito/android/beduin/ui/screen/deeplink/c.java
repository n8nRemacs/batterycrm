package com.avito.android.beduin.ui.screen.deeplink;

import Ku.AbstractC14350a;
import Ku.i;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.ScreenStyle;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinScreenLinkParser.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/ui/screen/deeplink/c;", "LKu/a;", "Lcom/avito/android/beduin/ui/screen/deeplink/BeduinScreenLink;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c extends AbstractC14350a<BeduinScreenLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.WrongParameterValue {
        ScreenStyle screenStyleA;
        String strN = i.n(uri, ContextActionHandler.Link.URL);
        String queryParameter = uri.getQueryParameter("presentationStyle");
        if (queryParameter != null) {
            ScreenStyle.f133646c.getClass();
            screenStyleA = ScreenStyle.a.a(queryParameter);
        } else {
            screenStyleA = null;
        }
        return new BeduinScreenLink(strN, screenStyleA);
    }
}
