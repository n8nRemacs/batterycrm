package com.avito.android.str_booking.ui.user_info.payload;

import Y61.k;
import Y61.l;
import com.avito.android.str_booking.ui.user_info.c;
import dy0.InterfaceC39829c;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: StrBookingUserInfoPayloadProvider.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_booking/ui/user_info/payload/a;", "Ldy0/c;", "<init>", "()V", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a implements InterfaceC39829c {
    @Inject
    public a() {
    }

    @Override // dy0.InterfaceC39829c
    @l
    public final Boolean a(@k TV0.a aVar, @k TV0.a aVar2) {
        if (!(aVar instanceof c) || !(aVar2 instanceof c)) {
            return null;
        }
        boolean z12 = ((c) aVar).f286180c;
        boolean z13 = ((c) aVar2).f286180c;
        if (z12 != z13) {
            return Boolean.valueOf(z13);
        }
        return null;
    }
}
