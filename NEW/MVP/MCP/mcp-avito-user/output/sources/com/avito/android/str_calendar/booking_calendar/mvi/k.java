package com.avito.android.str_calendar.booking_calendar.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.util.R0;
import java.util.Date;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.C43259k;
import lE.C43624b;

/* compiled from: StrBookingCalendarDataBuilder.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/booking_calendar/mvi/k;", "Lcom/avito/android/str_calendar/booking_calendar/mvi/h;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class k implements InterfaceC35089h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final R0 f286486a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C43624b f286487b;

    @Inject
    public k(@Y61.k R0 r02, @Y61.k C43624b c43624b) {
        this.f286486a = r02;
        this.f286487b = c43624b;
    }

    @Override // com.avito.android.str_calendar.booking_calendar.mvi.InterfaceC35089h
    @Y61.l
    public final Object a(@Y61.k List list, @Y61.l Date date, @Y61.l Date date2, @Y61.k ContinuationImpl continuationImpl) {
        return C43259k.g(this.f286486a.c(), new i(this, date, date2, list, null), continuationImpl);
    }
}
