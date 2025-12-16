package com.avito.android.mortgage.deeplink;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.mortgage.sign.model.SignArguments;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;
import t00.InterfaceC48454a;

/* compiled from: MortgageSignDeeplinkHandler.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/deeplink/a0;", "Lev/b;", "Lcom/avito/android/mortgage/deeplink/MortgageSignLink;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a0 extends AbstractC40162b<MortgageSignLink> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f198786d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC48454a f198787e;

    @Inject
    public a0(@Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k InterfaceC48454a interfaceC48454a) {
        this.f198786d = interfaceC4053a;
        this.f198787e = interfaceC48454a;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        MortgageSignLink mortgageSignLink = (MortgageSignLink) deepLink;
        this.f198786d.R(this.f198787e.g(new SignArguments(mortgageSignLink.f198748b, mortgageSignLink.f198749c, mortgageSignLink.f198750d, mortgageSignLink.f198751e, mortgageSignLink.f198752f, mortgageSignLink.f198753g, mortgageSignLink.f198754h)), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
