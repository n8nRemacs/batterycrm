package com.avito.android.str_booking.deeplink.create_messenger;

import Ku.AbstractC14350a;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.google.gson.Gson;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: StrCreateMessengerDeeplinkParser.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/str_booking/deeplink/create_messenger/i;", "LKu/a;", "Lcom/avito/android/str_booking/deeplink/create_messenger/StrCreateMessengerDeeplink;", "<init>", "()V", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i extends AbstractC14350a<StrCreateMessengerDeeplink> {
    @Inject
    public i() {
    }

    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) {
        return new StrCreateMessengerDeeplink(Ku.i.m(uri, "bookingId"), Ku.i.p(uri, "intent"));
    }
}
