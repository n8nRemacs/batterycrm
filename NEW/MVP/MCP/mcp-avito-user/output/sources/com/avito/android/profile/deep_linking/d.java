package com.avito.android.profile.deep_linking;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import android.content.Intent;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.EditProfileLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.C35967w2;
import com.avito.android.util.H;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: EditProfileLinkSyncHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/deep_linking/d;", "Lev/b;", "Lcom/avito/android/deep_linking/links/EditProfileLink;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d extends AbstractC40162b<EditProfileLink> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final l90.o f221897d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f221898e;

    @Inject
    public d(@Y61.k l90.o oVar, @Y61.k a.InterfaceC4053a interfaceC4053a) {
        this.f221897d = oVar;
        this.f221898e = interfaceC4053a;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        Intent intentC = this.f221897d.c();
        C35967w2.c(intentC, bundle != null ? H.b(bundle) : null);
        this.f221898e.R(intentC, com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
