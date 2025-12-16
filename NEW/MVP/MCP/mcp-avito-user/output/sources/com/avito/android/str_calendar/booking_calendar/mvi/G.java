package com.avito.android.str_calendar.booking_calendar.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.J0;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.str_calendar.booking_calendar.items.day.StrBookingCalendarDayState;
import com.avito.android.str_calendar.booking_calendar.mvi.entity.StrBookingCalendarState;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: StrBookingCalendarViewStateBuilder.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/booking_calendar/mvi/G;", "Lcom/avito/android/str_calendar/booking_calendar/mvi/F;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class G implements F {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.str_calendar.booking_calendar.h f286382a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final J0 f286383b;

    /* compiled from: StrBookingCalendarViewStateBuilder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[StrBookingCalendarState.Companion.LoadingState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                StrBookingCalendarState.Companion.LoadingState loadingState = StrBookingCalendarState.Companion.LoadingState.f286440b;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                StrBookingCalendarState.Companion.LoadingState loadingState2 = StrBookingCalendarState.Companion.LoadingState.f286440b;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[StrBookingCalendarDayState.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                StrBookingCalendarDayState strBookingCalendarDayState = StrBookingCalendarDayState.f286292b;
                iArr2[3] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                StrBookingCalendarDayState strBookingCalendarDayState2 = StrBookingCalendarDayState.f286292b;
                iArr2[4] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                StrBookingCalendarDayState strBookingCalendarDayState3 = StrBookingCalendarDayState.f286292b;
                iArr2[5] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                StrBookingCalendarDayState strBookingCalendarDayState4 = StrBookingCalendarDayState.f286292b;
                iArr2[6] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                StrBookingCalendarDayState strBookingCalendarDayState5 = StrBookingCalendarDayState.f286292b;
                iArr2[2] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                StrBookingCalendarDayState strBookingCalendarDayState6 = StrBookingCalendarDayState.f286292b;
                iArr2[1] = 7;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    @Inject
    public G(@Y61.k com.avito.android.str_calendar.booking_calendar.h hVar, @Y61.k J0 j02) {
        this.f286382a = hVar;
        this.f286383b = j02;
    }

    public static PrintableText c(StrBookingCalendarState strBookingCalendarState) {
        String str = strBookingCalendarState.f286435m;
        if (str == null) {
            return null;
        }
        if (str.length() <= 0) {
            str = null;
        }
        if (str != null) {
            return com.avito.android.printable_text.b.f(str);
        }
        return null;
    }

    @Override // com.avito.android.str_calendar.booking_calendar.mvi.F
    @Y61.k
    public final StrBookingCalendarState a(@Y61.k Y41.a<StrBookingCalendarState> aVar) {
        return b(aVar.invoke());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008f  */
    @Override // com.avito.android.str_calendar.booking_calendar.mvi.F
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.str_calendar.booking_calendar.mvi.entity.StrBookingCalendarState b(@Y61.k com.avito.android.str_calendar.booking_calendar.mvi.entity.StrBookingCalendarState r35) {
        /*
            Method dump skipped, instructions count: 1222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_calendar.booking_calendar.mvi.G.b(com.avito.android.str_calendar.booking_calendar.mvi.entity.StrBookingCalendarState):com.avito.android.str_calendar.booking_calendar.mvi.entity.StrBookingCalendarState");
    }
}
