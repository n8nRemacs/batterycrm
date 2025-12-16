package com.avito.android.str_calendar.seller.calandar_parameters.domain.discounts;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.PretendErrorValue;
import com.avito.android.remote.model.PretendResult;
import com.avito.android.remote.model.category_parameters.IntParameter;
import com.avito.android.remote.model.category_parameters.StrDurationDiscountsParameter;
import com.avito.android.remote.model.category_parameters.StrDurationDiscountsSelect;
import com.avito.android.remote.model.category_parameters.StrEarlyBookingDiscountParameter;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: DiscountParametersValidator.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/domain/discounts/b;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/domain/discounts/a;", "<init>", "()V", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b implements a {
    @Inject
    public b() {
    }

    public static LinkedHashMap c(IntParameter intParameter) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (intParameter.getValue() == null) {
            linkedHashMap.put(intParameter.getId(), PretendErrorValue.WithoutMessage.INSTANCE);
        }
        return linkedHashMap;
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.domain.discounts.a
    @k
    public final PretendResult a(@k StrDurationDiscountsParameter strDurationDiscountsParameter) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (StrDurationDiscountsSelect strDurationDiscountsSelect : strDurationDiscountsParameter.getDiscountSelectParameters()) {
            IntParameter daysParameter = strDurationDiscountsSelect.getDaysParameter();
            Map mapC = daysParameter != null ? c(daysParameter) : null;
            if (mapC == null) {
                mapC = P0.c();
            }
            linkedHashMap.putAll(mapC);
            IntParameter percentParameter = strDurationDiscountsSelect.getPercentParameter();
            Map mapC2 = percentParameter != null ? c(percentParameter) : null;
            if (mapC2 == null) {
                mapC2 = P0.c();
            }
            linkedHashMap.putAll(mapC2);
        }
        return new PretendResult(linkedHashMap.isEmpty(), linkedHashMap);
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.domain.discounts.a
    @k
    public final PretendResult b(@k StrEarlyBookingDiscountParameter strEarlyBookingDiscountParameter) {
        if (!strEarlyBookingDiscountParameter.isEnabled()) {
            return new PretendResult(true, null, 2, null);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        IntParameter daysParameter = strEarlyBookingDiscountParameter.getDaysParameter();
        Map mapC = daysParameter != null ? c(daysParameter) : null;
        if (mapC == null) {
            mapC = P0.c();
        }
        linkedHashMap.putAll(mapC);
        IntParameter percentParameter = strEarlyBookingDiscountParameter.getPercentParameter();
        Map mapC2 = percentParameter != null ? c(percentParameter) : null;
        if (mapC2 == null) {
            mapC2 = P0.c();
        }
        linkedHashMap.putAll(mapC2);
        return new PretendResult(linkedHashMap.isEmpty(), linkedHashMap);
    }
}
