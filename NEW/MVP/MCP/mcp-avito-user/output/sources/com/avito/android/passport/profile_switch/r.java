package com.avito.android.passport.profile_switch;

import Ku.AbstractC14350a;
import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.PassportSwitchProfileLink;
import com.avito.android.deep_linking.links.ProfileLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PassportSwitchProfileAsyncLinkHandler.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profile_switch/r;", "LKu/a;", "Lcom/avito/android/deep_linking/links/PassportSwitchProfileLink;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class r extends AbstractC14350a<PassportSwitchProfileLink> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f213719a;

    public r(@Y61.k InterfaceC28373a interfaceC28373a) {
        this.f213719a = interfaceC28373a;
    }

    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.WrongParameterValue {
        DeepLink profileLink;
        String strN = Ku.i.n(uri, "profileId");
        String queryParameter = uri.getQueryParameter("then");
        if (queryParameter == null || (profileLink = xVar.b(queryParameter)) == null) {
            profileLink = new ProfileLink(false, 1, null);
            this.f213719a.c(new t());
        }
        return new PassportSwitchProfileLink(strN, profileLink);
    }
}
