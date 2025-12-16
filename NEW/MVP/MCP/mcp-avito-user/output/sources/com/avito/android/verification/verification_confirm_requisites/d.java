package com.avito.android.verification.verification_confirm_requisites;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.VerificationConfirmRequisitesLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;
import vM0.InterfaceC49236c;

/* compiled from: VerificationConfirmRequisitesLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/verification/verification_confirm_requisites/d;", "Lev/b;", "Lcom/avito/android/deep_linking/links/VerificationConfirmRequisitesLink;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d extends AbstractC40162b<VerificationConfirmRequisitesLink> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f324938d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC49236c f324939e;

    @Inject
    public d(@Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k InterfaceC49236c interfaceC49236c) {
        this.f324938d = interfaceC4053a;
        this.f324939e = interfaceC49236c;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        this.f324938d.R(this.f324939e.h((VerificationConfirmRequisitesLink) deepLink), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
