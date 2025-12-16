package com.avito.android.deeplink_factory.legacy;

import android.net.Uri;
import com.avito.android.deep_linking.links.CalendarLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import kotlin.Metadata;

/* compiled from: LegacyDeepLinkFactory.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/deep_linking/links/CalendarLink;", TooltipAttribute.PARAM_DEEP_LINK, "Landroid/net/Uri;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class r extends kotlin.jvm.internal.N implements Y41.l<Uri, CalendarLink> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ E2 f134330l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(E2 e22) {
        super(1);
        this.f134330l = e22;
    }

    @Override // Y41.l
    public final CalendarLink invoke(Uri uri) throws DeeplinkParsingError.WrongParameterValue {
        Uri uri2 = uri;
        Gson gson = this.f134330l.f134215d;
        try {
            Type type = new C29703b().getType();
            String queryParameter = uri2.getQueryParameter("data");
            CalendarLink.CalendarData calendarData = (CalendarLink.CalendarData) (queryParameter != null ? gson.e(queryParameter, type) : null);
            if (calendarData == null) {
                calendarData = new CalendarLink.CalendarData(null, null, null, null, 15, null);
            }
            return new CalendarLink(calendarData);
        } catch (JsonParseException e12) {
            throw new DeeplinkParsingError.WrongParameterValue(uri2.toString(), "data", DeeplinkParsingError.FieldConstraint.Json.f133986b, e12);
        }
    }
}
