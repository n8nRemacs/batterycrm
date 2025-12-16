package com.avito.android.passport.profile_add.merge.deeplinking;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import android.net.Uri;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.beduin.v2.page.BeduinV2BottomSheetDeepLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.PassportMergeAccountsProfilesListOnboardingLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40162b;
import javax.inject.Inject;
import k60.C42524a;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PassportMergeAccountsProfilesListOnboardingSyncDeepLinkHandler.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/deeplinking/s;", "Lev/b;", "Lcom/avito/android/deep_linking/links/PassportMergeAccountsProfilesListOnboardingLink;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class s extends AbstractC40162b<PassportMergeAccountsProfilesListOnboardingLink> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final E50.a f212962d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f212963e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f212964f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final C42524a f212965g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final r60.d f212966h;

    @Inject
    public s(@Y61.k E50.a aVar, @Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2, @Y61.k C42524a c42524a, @Y61.k r60.d dVar) {
        this.f212962d = aVar;
        this.f212963e = interfaceC4053a;
        this.f212964f = aVar2;
        this.f212965g = c42524a;
        this.f212966h = dVar;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        C42524a c42524a = this.f212965g;
        c42524a.getClass();
        kotlin.reflect.n<Object> nVar = C42524a.f406098e[1];
        if (((Boolean) c42524a.f406100c.a().invoke()).booleanValue()) {
            String str2 = this.f212966h.get();
            Uri.Builder builderPath = new Uri.Builder().path("api/1/accounts_merge/onboarding/pro");
            if (str2 != null) {
                builderPath.appendQueryParameter("mergeKey", str2);
            }
            b.a.a(this.f212964f, new BeduinV2BottomSheetDeepLink(builderPath.build().toString(), "OnboardingProScreen", "fit", false, null, null, null, null, false, 496, null), null, null, 6);
        } else {
            this.f212963e.R(this.f212962d.c(), com.avito.android.deeplink_handler.view.b.f134588l);
        }
        return AbstractC14250d.c.f9171c;
    }
}
