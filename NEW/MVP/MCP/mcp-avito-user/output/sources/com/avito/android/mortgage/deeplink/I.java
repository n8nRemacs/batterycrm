package com.avito.android.mortgage.deeplink;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.mortgage.person_form.model.PersonFormArguments;
import ev.AbstractC40162b;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import t00.InterfaceC48454a;

/* compiled from: MortgageFormDeeplinkHandler.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/deeplink/I;", "Lev/b;", "Lcom/avito/android/mortgage/deeplink/MortgageFormLink;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class I extends AbstractC40162b<MortgageFormLink> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f198688d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC48454a f198689e;

    @Inject
    public I(@Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k InterfaceC48454a interfaceC48454a) {
        this.f198688d = interfaceC4053a;
        this.f198689e = interfaceC48454a;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        MortgageFormLink mortgageFormLink = (MortgageFormLink) deepLink;
        List<String> list = mortgageFormLink.f198714f;
        this.f198688d.R(this.f198689e.e(new PersonFormArguments(mortgageFormLink.f198713e, list, list.indexOf(mortgageFormLink.f198715g), mortgageFormLink.f198711c, mortgageFormLink.f198710b, mortgageFormLink.f198716h, mortgageFormLink.f198712d)), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
