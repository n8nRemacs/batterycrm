package com.avito.android.passport.profile_add.merge.deeplinking;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.PassportMergeAccountsProfilesListLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.passport.profile_add.merge.domain.MergeFlow;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PassportMergeAccountsProfilesListSyncDeepLinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/deeplinking/u;", "Lev/b;", "Lcom/avito/android/deep_linking/links/PassportMergeAccountsProfilesListLink;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class u extends AbstractC40162b<PassportMergeAccountsProfilesListLink> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final E50.a f212972d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f212973e;

    @Inject
    public u(@Y61.k E50.a aVar, @Y61.k a.InterfaceC4053a interfaceC4053a) {
        this.f212972d = aVar;
        this.f212973e = interfaceC4053a;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        this.f212973e.R(this.f212972d.g(((PassportMergeAccountsProfilesListLink) deepLink).f133545b ? MergeFlow.f212987d : MergeFlow.f212986c), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
