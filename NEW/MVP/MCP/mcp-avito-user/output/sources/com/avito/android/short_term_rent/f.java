package com.avito.android.short_term_rent;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import android.os.Bundle;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.StrBookingPaymentFailureLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.printable_text.PrintableText;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: StrBookingPaymentFailureLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/short_term_rent/f;", "Lev/b;", "Lcom/avito/android/deep_linking/links/StrBookingPaymentFailureLink;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f extends AbstractC40162b<StrBookingPaymentFailureLink> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final a.i f282349d;

    @Inject
    public f(@Y61.k a.i iVar) {
        this.f282349d = iVar;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        PrintableText printableTextF = com.avito.android.printable_text.b.f(((StrBookingPaymentFailureLink) deepLink).f133687b);
        f.c.f125255c.getClass();
        a.i.C4057a.d(this.f282349d, printableTextF, null, null, f.c.a.b(), 0, null, null, null, 2030);
        return AbstractC14250d.c.f9171c;
    }
}
