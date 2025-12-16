package com.avito.android.str_calendar.booking_calendar.mvi;

import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.str_calendar.booking_calendar.mvi.entity.StrBookingCalendarInternalAction;
import com.avito.android.str_calendar.booking_calendar.mvi.entity.StrBookingCalendarState;
import com.avito.android.str_calendar.common.models.SelectedDateRange;
import java.util.Date;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import py0.InterfaceC47164a;

/* compiled from: StrBookingCalendarActor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/str_calendar/booking_calendar/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "Lpy0/a;", "Lcom/avito/android/str_calendar/booking_calendar/mvi/entity/StrBookingCalendarInternalAction;", "Lcom/avito/android/str_calendar/booking_calendar/mvi/entity/StrBookingCalendarState;", "a", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.str_calendar.booking_calendar.mvi.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35082a implements com.avito.android.arch.mvi.a<InterfaceC47164a, StrBookingCalendarInternalAction, StrBookingCalendarState> {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f286386c = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final p f286387a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.str_calendar.booking_calendar.h f286388b;

    /* compiled from: StrBookingCalendarActor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/str_calendar/booking_calendar/mvi/a$a;", "", "<init>", "()V", "", "EMPTY_SELECTED_RANGE_ERROR", "Ljava/lang/String;", "a", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.str_calendar.booking_calendar.mvi.a$a, reason: collision with other inner class name */
    public static final class C8577a {

        /* compiled from: StrBookingCalendarActor.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/str_calendar/booking_calendar/mvi/a$a$a;", "", "a", "b", "c", "Lcom/avito/android/str_calendar/booking_calendar/mvi/a$a$a$a;", "Lcom/avito/android/str_calendar/booking_calendar/mvi/a$a$a$b;", "Lcom/avito/android/str_calendar/booking_calendar/mvi/a$a$a$c;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.str_calendar.booking_calendar.mvi.a$a$a, reason: collision with other inner class name */
        public interface InterfaceC8578a {

            /* compiled from: StrBookingCalendarActor.kt */
            @P
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/booking_calendar/mvi/a$a$a$a;", "Lcom/avito/android/str_calendar/booking_calendar/mvi/a$a$a;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.str_calendar.booking_calendar.mvi.a$a$a$a, reason: collision with other inner class name */
            public static final /* data */ class C8579a implements InterfaceC8578a {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public final PrintableText f286389a;

                public C8579a(@Y61.k PrintableText printableText) {
                    this.f286389a = printableText;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C8579a) && L.f(this.f286389a, ((C8579a) obj).f286389a);
                }

                public final int hashCode() {
                    return this.f286389a.hashCode();
                }

                @Y61.k
                public final String toString() {
                    return AK.c.m(new StringBuilder("EmptyRange(errorText="), this.f286389a, ')');
                }
            }

            /* compiled from: StrBookingCalendarActor.kt */
            @P
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/booking_calendar/mvi/a$a$a$b;", "Lcom/avito/android/str_calendar/booking_calendar/mvi/a$a$a;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.str_calendar.booking_calendar.mvi.a$a$a$b */
            public static final /* data */ class b implements InterfaceC8578a {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public final String f286390a;

                public b(@Y61.k String str) {
                    this.f286390a = str;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof b) && L.f(this.f286390a, ((b) obj).f286390a);
                }

                public final int hashCode() {
                    return this.f286390a.hashCode();
                }

                @Y61.k
                public final String toString() {
                    return C22026a.c(new StringBuilder("Error(errorText="), this.f286390a, ')');
                }
            }

            /* compiled from: StrBookingCalendarActor.kt */
            @P
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/booking_calendar/mvi/a$a$a$c;", "Lcom/avito/android/str_calendar/booking_calendar/mvi/a$a$a;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.str_calendar.booking_calendar.mvi.a$a$a$c */
            public static final /* data */ class c implements InterfaceC8578a {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public final SelectedDateRange f286391a;

                public c(@Y61.k SelectedDateRange selectedDateRange) {
                    this.f286391a = selectedDateRange;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof c) && L.f(this.f286391a, ((c) obj).f286391a);
                }

                public final int hashCode() {
                    return this.f286391a.hashCode();
                }

                @Y61.k
                public final String toString() {
                    return "Success(selectedRange=" + this.f286391a + ')';
                }
            }
        }

        public /* synthetic */ C8577a(C42822w c42822w) {
            this();
        }

        public C8577a() {
        }
    }

    static {
        new C8577a(null);
    }

    @Inject
    public C35082a(@Y61.k p pVar, @Y61.k com.avito.android.str_calendar.booking_calendar.h hVar) {
        this.f286387a = pVar;
        this.f286388b = hVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<StrBookingCalendarInternalAction> b(InterfaceC47164a interfaceC47164a, StrBookingCalendarState strBookingCalendarState) {
        InterfaceC47164a interfaceC47164a2 = interfaceC47164a;
        StrBookingCalendarState strBookingCalendarState2 = strBookingCalendarState;
        if (interfaceC47164a2 instanceof InterfaceC47164a.c) {
            return C43175k.G(new C35083b(strBookingCalendarState2, (InterfaceC47164a.c) interfaceC47164a2, this, null));
        }
        if (interfaceC47164a2 instanceof InterfaceC47164a.C12297a) {
            return C43175k.G(new C35084c(2, null));
        }
        if (interfaceC47164a2 instanceof InterfaceC47164a.b) {
            return new C43210w(StrBookingCalendarInternalAction.CloseScreen.f286407b);
        }
        if (!(interfaceC47164a2 instanceof InterfaceC47164a.d)) {
            if (interfaceC47164a2 instanceof InterfaceC47164a.e) {
                return C43175k.G(new C35085d(this, strBookingCalendarState2, null));
            }
            throw new NoWhenBranchMatchedException();
        }
        Date date = strBookingCalendarState2.f286429g;
        p pVar = this.f286387a;
        Date date2 = strBookingCalendarState2.f286428f;
        SelectedDateRange selectedDateRange = strBookingCalendarState2.f286427e;
        String str = strBookingCalendarState2.f286424b;
        return (str == null || str.length() == 0) ? pVar.a(selectedDateRange, date2, date, strBookingCalendarState2.f286430h) : pVar.b(str, selectedDateRange, date2, date);
    }
}
