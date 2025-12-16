package com.avito.android.profile_phones.deep_linking;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import android.os.Bundle;
import com.avito.android.N1;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.auth.PhoneVerificationLinkContext;
import com.avito.android.deep_linking.links.auth.PhoneVerificationStatusLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PhoneVerificationStatusSyncLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_phones/deep_linking/i;", "Lev/b;", "Lcom/avito/android/deep_linking/links/auth/PhoneVerificationStatusLink;", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class i extends AbstractC40162b<PhoneVerificationStatusLink> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final N1 f227144d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f227145e;

    @Inject
    public i(@Y61.k N1 n12, @Y61.k a.InterfaceC4053a interfaceC4053a) {
        this.f227144d = n12;
        this.f227145e = interfaceC4053a;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        PhoneVerificationLinkContext phoneVerificationLinkContext = ((PhoneVerificationStatusLink) deepLink).f133951b;
        Integer callId = phoneVerificationLinkContext.getCallId();
        this.f227145e.R(this.f227144d.c(callId != null ? callId.intValue() : 0, phoneVerificationLinkContext.getTitle(), phoneVerificationLinkContext.getSubtitle(), phoneVerificationLinkContext.getDescription(), "", true), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
