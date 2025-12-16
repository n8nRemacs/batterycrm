package com.avito.android.str_calendar.seller.calandar_parameters.domain.discounts;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.IntParameter;
import com.avito.android.remote.model.category_parameters.StrDiscountsPayload;
import com.avito.android.remote.model.category_parameters.StrDurationDiscountsParameter;
import com.avito.android.remote.model.category_parameters.StrDurationDiscountsSelect;
import com.avito.android.remote.model.category_parameters.StrPayload;
import com.avito.android.util.InterfaceC35863o4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;

/* compiled from: DurationDiscountsParameterHelper.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/domain/discounts/e;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/domain/discounts/d;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC35863o4 f286944a;

    @Inject
    public e(@k InterfaceC35863o4 interfaceC35863o4) {
        this.f286944a = interfaceC35863o4;
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.domain.discounts.d
    @k
    public final StrDurationDiscountsParameter a(@k StrDurationDiscountsParameter strDurationDiscountsParameter) {
        StrDiscountsPayload discounts;
        StrDurationDiscountsSelect emptySelectParameter;
        int i12;
        IntParameter intParameterCopy;
        IntParameter intParameterCopy2;
        String id2;
        String id3;
        StrPayload payload = strDurationDiscountsParameter.getPayload();
        if (payload == null || (discounts = payload.getDiscounts()) == null || (emptySelectParameter = discounts.getEmptySelectParameter()) == null) {
            return strDurationDiscountsParameter;
        }
        List<StrDurationDiscountsSelect> discountSelectParameters = strDurationDiscountsParameter.getDiscountSelectParameters();
        ArrayList arrayList = new ArrayList(C42745f0.q(discountSelectParameters, 10));
        int i13 = 0;
        for (Object obj : discountSelectParameters) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                C42745f0.H0();
                throw null;
            }
            StrDurationDiscountsSelect strDurationDiscountsSelect = (StrDurationDiscountsSelect) obj;
            IntParameter daysParameter = strDurationDiscountsSelect.getDaysParameter();
            if (daysParameter != null) {
                IntParameter daysParameter2 = emptySelectParameter.getDaysParameter();
                String str = (daysParameter2 == null || (id3 = daysParameter2.getId()) == null) ? null : String.format(id3, Arrays.copyOf(new Object[]{Integer.valueOf(i13)}, 1));
                i12 = 1;
                intParameterCopy = daysParameter.copy((32766 & 1) != 0 ? daysParameter.id : str == null ? "" : str, (32766 & 2) != 0 ? daysParameter.title : null, (32766 & 4) != 0 ? daysParameter.required : false, (32766 & 8) != 0 ? daysParameter.immutable : false, (32766 & 16) != 0 ? daysParameter.motivation : null, (32766 & 32) != 0 ? daysParameter.updatesForm : null, (32766 & 64) != 0 ? daysParameter.hint : null, (32766 & 128) != 0 ? daysParameter._value : null, (32766 & 256) != 0 ? daysParameter.constraints : null, (32766 & 512) != 0 ? daysParameter.displayingOptions : null, (32766 & 1024) != 0 ? daysParameter.placeholder : null, (32766 & 2048) != 0 ? daysParameter.button : null, (32766 & 4096) != 0 ? daysParameter.visible : null, (32766 & 8192) != 0 ? daysParameter.phantom : null, (32766 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? daysParameter.widget : null);
            } else {
                i12 = 1;
                intParameterCopy = null;
            }
            IntParameter percentParameter = strDurationDiscountsSelect.getPercentParameter();
            if (percentParameter != null) {
                IntParameter percentParameter2 = emptySelectParameter.getPercentParameter();
                String str2 = (percentParameter2 == null || (id2 = percentParameter2.getId()) == null) ? null : String.format(id2, Arrays.copyOf(new Object[]{Integer.valueOf(i13)}, i12));
                intParameterCopy2 = percentParameter.copy((32766 & 1) != 0 ? percentParameter.id : str2 == null ? "" : str2, (32766 & 2) != 0 ? percentParameter.title : null, (32766 & 4) != 0 ? percentParameter.required : false, (32766 & 8) != 0 ? percentParameter.immutable : false, (32766 & 16) != 0 ? percentParameter.motivation : null, (32766 & 32) != 0 ? percentParameter.updatesForm : null, (32766 & 64) != 0 ? percentParameter.hint : null, (32766 & 128) != 0 ? percentParameter._value : null, (32766 & 256) != 0 ? percentParameter.constraints : null, (32766 & 512) != 0 ? percentParameter.displayingOptions : null, (32766 & 1024) != 0 ? percentParameter.placeholder : null, (32766 & 2048) != 0 ? percentParameter.button : null, (32766 & 4096) != 0 ? percentParameter.visible : null, (32766 & 8192) != 0 ? percentParameter.phantom : null, (32766 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? percentParameter.widget : null);
            } else {
                intParameterCopy2 = null;
            }
            arrayList.add(StrDurationDiscountsSelect.copy$default(strDurationDiscountsSelect, null, C42756l.B(new IntParameter[]{intParameterCopy, intParameterCopy2}), i12, null));
            i13 = i14;
        }
        return StrDurationDiscountsParameter.copy$default(strDurationDiscountsParameter, null, null, arrayList, null, null, null, 59, null);
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.domain.discounts.d
    @k
    public final StrDurationDiscountsParameter b(@k StrDurationDiscountsParameter strDurationDiscountsParameter) {
        StrDiscountsPayload discounts;
        StrPayload payload = strDurationDiscountsParameter.getPayload();
        if (payload == null || (discounts = payload.getDiscounts()) == null) {
            return strDurationDiscountsParameter;
        }
        int size = strDurationDiscountsParameter.getDiscountSelectParameters().size();
        Integer maxItemsAllowed = discounts.getMaxItemsAllowed();
        if ((maxItemsAllowed != null ? maxItemsAllowed.intValue() : 5) <= size) {
            return a(strDurationDiscountsParameter);
        }
        String strA = this.f286944a.a();
        StrDurationDiscountsSelect emptySelectParameter = discounts.getEmptySelectParameter();
        if (emptySelectParameter == null) {
            return strDurationDiscountsParameter;
        }
        return a(StrDurationDiscountsParameter.copy$default(strDurationDiscountsParameter, null, null, C42745f0.h0(Collections.singletonList(StrDurationDiscountsSelect.copy$default(emptySelectParameter, strA, null, 2, null)), strDurationDiscountsParameter.getDiscountSelectParameters()), null, null, null, 59, null));
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.domain.discounts.d
    @k
    public final StrDurationDiscountsParameter c(@k StrDurationDiscountsParameter strDurationDiscountsParameter, @k String str) {
        List<StrDurationDiscountsSelect> discountSelectParameters = strDurationDiscountsParameter.getDiscountSelectParameters();
        ArrayList arrayList = new ArrayList();
        for (Object obj : discountSelectParameters) {
            if (!L.f(((StrDurationDiscountsSelect) obj).getId(), str)) {
                arrayList.add(obj);
            }
        }
        return a(StrDurationDiscountsParameter.copy$default(strDurationDiscountsParameter, null, null, arrayList, null, null, null, 59, null));
    }
}
