package com.avito.android.str_booking.domain;

import com.avito.android.str_booking.mvi.entity.StrBookingInternalAction;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C0;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: StrBookingInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_booking/domain/f;", "", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface f {

    /* compiled from: StrBookingInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @Y61.k
    InterfaceC43160i<StrBookingInternalAction> a(@Y61.k String str, @Y61.k Map<String, String> map);

    @Y61.k
    C0 b(@Y61.k String str);

    @Y61.k
    InterfaceC43160i<StrBookingInternalAction> c(@Y61.k String str);

    @Y61.k
    InterfaceC43160i<StrBookingInternalAction> d(@Y61.k String str, @Y61.l String str2);
}
