package com.avito.android.passport.profile_add.merge.deeplinking;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.passport.deeplinks.PassportAccountsProfileErrorLink;
import com.avito.android.passport.network.model.PassportUserDialogWithProfile;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PassportAccountsProfileErrorSyncLinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/deeplinking/b;", "Lev/b;", "Lcom/avito/android/passport/deeplinks/PassportAccountsProfileErrorLink;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b extends AbstractC40162b<PassportAccountsProfileErrorLink> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final E50.a f212918d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f212919e;

    @Inject
    public b(@Y61.k E50.a aVar, @Y61.k a.InterfaceC4053a interfaceC4053a) {
        this.f212918d = aVar;
        this.f212919e = interfaceC4053a;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        PassportUserDialogWithProfile passportUserDialogWithProfile = ((PassportAccountsProfileErrorLink) deepLink).f211118b;
        if (passportUserDialogWithProfile == null) {
            return AbstractC14250d.b.f9170c;
        }
        this.f212919e.R(this.f212918d.e(passportUserDialogWithProfile), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
