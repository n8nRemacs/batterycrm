package com.avito.android.short_term_rent.bookingform.promocode.deeplink;

import Ku.AbstractC14350a;
import Ku.i;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.avito.android.short_term_rent.deeplink.BookingFormPromoCodeDialogDeeplink;
import com.google.gson.Gson;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BookingFormPromoCodeDialogDeeplinkParser.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/promocode/deeplink/d;", "LKu/a;", "Lcom/avito/android/short_term_rent/deeplink/BookingFormPromoCodeDialogDeeplink;", "<init>", "()V", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d extends AbstractC14350a<BookingFormPromoCodeDialogDeeplink> {
    @Inject
    public d() {
    }

    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.WrongParameterValue {
        return new BookingFormPromoCodeDialogDeeplink((List) gson.e(uri.getQueryParameter("promoCodes"), new c().getType()), i.m(uri, "itemId"), i.p(uri, "title"), i.p(uri, "buttonTitle"), uri.getQueryParameter("inputHint"), uri.getQueryParameter("bookingContext"));
    }
}
