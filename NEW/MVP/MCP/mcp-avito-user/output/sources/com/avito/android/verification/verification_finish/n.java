package com.avito.android.verification.verification_finish;

import android.annotation.SuppressLint;
import android.content.Intent;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.VerificationFinishLink;
import com.avito.android.deeplink_handler.view.a;
import javax.inject.Inject;
import kotlin.Metadata;
import vM0.InterfaceC49236c;

/* compiled from: VerificationFinishLinkAsyncHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/verification/verification_finish/n;", "Lcom/avito/android/verification/common/c;", "Lcom/avito/android/deep_linking/links/VerificationFinishLink;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"MissingDeeplinkHandlerResult"})
/* loaded from: classes5.dex */
public final class n extends com.avito.android.verification.common.c<VerificationFinishLink> {

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC49236c f325306j;

    @Inject
    public n(@Y61.k InterfaceC49236c interfaceC49236c, @Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k a.b bVar, @Y61.k a.i iVar) {
        super(bVar, interfaceC4053a, iVar);
        this.f325306j = interfaceC49236c;
    }

    @Override // com.avito.android.verification.common.c
    public final Intent k(DeepLink deepLink) {
        return this.f325306j.i((VerificationFinishLink) deepLink);
    }
}
