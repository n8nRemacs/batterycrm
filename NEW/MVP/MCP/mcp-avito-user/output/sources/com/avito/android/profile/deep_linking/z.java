package com.avito.android.profile.deep_linking;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import android.os.Bundle;
import com.avito.android.deep_linking.RemoveProfileLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: RemoveProfileLinkSyncHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/deep_linking/z;", "Lev/b;", "Lcom/avito/android/deep_linking/RemoveProfileLink;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class z extends AbstractC40162b<RemoveProfileLink> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final l90.o f221934d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f221935e;

    @Inject
    public z(@Y61.k l90.o oVar, @Y61.k a.InterfaceC4053a interfaceC4053a) {
        this.f221934d = oVar;
        this.f221935e = interfaceC4053a;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        this.f221935e.R(this.f221934d.e(), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
