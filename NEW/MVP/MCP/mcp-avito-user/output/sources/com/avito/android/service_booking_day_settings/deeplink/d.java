package com.avito.android.service_booking_day_settings.deeplink;

import Ku.AbstractC14350a;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.avito.android.remote.model.category_parameters.SelectionType;
import com.avito.android.service_booking_day_settings.ServiceBookingDayScheduleSettingsLink;
import com.google.gson.Gson;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2Connection;
import org.threeten.bp.DateTimeException;
import org.threeten.bp.f;
import org.threeten.bp.g;
import org.threeten.bp.q;
import org.threeten.bp.temporal.ChronoUnit;

/* compiled from: ServiceBookingDayScheduleSettingsLinkParser.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/service_booking_day_settings/deeplink/d;", "LKu/a;", "Lcom/avito/android/service_booking_day_settings/ServiceBookingDayScheduleSettingsLink;", "<init>", "()V", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d extends AbstractC14350a<ServiceBookingDayScheduleSettingsLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) {
        String queryParameter = uri.getQueryParameter("openFlow");
        String queryParameter2 = uri.getQueryParameter(SelectionType.TYPE_DAY);
        if (queryParameter2 == null) {
            f fVarF = f.F();
            ChronoUnit chronoUnit = ChronoUnit.DAYS;
            g gVarW = fVarF.f421949c;
            gVarW.getClass();
            if (chronoUnit != ChronoUnit.NANOS) {
                long j12 = chronoUnit.f422171c.f421848b;
                if (j12 > 86400) {
                    throw new DateTimeException("Unit is too large to be used for truncation");
                }
                long jH2 = w81.d.h(w81.d.i(Http2Connection.DEGRADED_PONG_TIMEOUT_NS, j12), r10.f421849c);
                if (86400000000000L % jH2 != 0) {
                    throw new DateTimeException("Unit must divide into a standard day without remainder");
                }
                gVarW = g.w((gVarW.H() / jH2) * jH2);
            }
            queryParameter2 = String.valueOf(fVarF.P(fVarF.f421948b, gVarW).s(q.f422106g));
        }
        return new ServiceBookingDayScheduleSettingsLink(queryParameter2, queryParameter != null ? ServiceBookingDayScheduleSettingsLink.SbSettingsOpenFlowType.valueOf(queryParameter.toUpperCase(Locale.ROOT)) : null);
    }
}
