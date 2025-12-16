package com.avito.android.guests_selector.deeplink;

import Ku.AbstractC14350a;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.avito.android.guests_selector.GuestsSelectorDeeplink;
import com.avito.android.guests_selector.io.GuestsSelectorInput;
import com.avito.android.util.R1;
import com.google.gson.Gson;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: GuestsSelectorDeeplinkParser.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/guests_selector/deeplink/f;", "LKu/a;", "Lcom/avito/android/guests_selector/GuestsSelectorDeeplink;", "<init>", "()V", "_avito_guests-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class f extends AbstractC14350a<GuestsSelectorDeeplink> {
    @Inject
    public f() {
    }

    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) {
        Object objE;
        String queryParameter = uri.getQueryParameter("data");
        if (queryParameter == null) {
            queryParameter = "";
        }
        try {
            Type type = new e().getType();
            objE = gson.e(queryParameter, ((type instanceof ParameterizedType) && R1.a((ParameterizedType) type)) ? ((ParameterizedType) type).getRawType() : R1.b(type));
        } catch (Throwable unused) {
            objE = null;
        }
        return new GuestsSelectorDeeplink((GuestsSelectorInput) objE);
    }
}
