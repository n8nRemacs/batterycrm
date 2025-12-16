package com.avito.android.das_date_picker.deeplink;

import Ku.AbstractC14350a;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.google.gson.Gson;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.Metadata;

/* compiled from: TariffCardDatePickerLinkParser.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/das_date_picker/deeplink/f;", "LKu/a;", "Lcom/avito/android/das_date_picker/deeplink/TariffCardDatePickerLink;", "<init>", "()V", "_avito_das-date-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f extends AbstractC14350a<TariffCardDatePickerLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.WrongParameterValue, ParseException {
        Date date = ((SimpleDateFormat) g.f132262a.getValue()).parse(Ku.i.p(uri, "value"));
        if (date != null) {
            return new TariffCardDatePickerLink(date);
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
