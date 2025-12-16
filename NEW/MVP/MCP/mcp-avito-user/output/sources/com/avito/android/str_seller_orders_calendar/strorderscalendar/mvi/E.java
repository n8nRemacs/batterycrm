package com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi;

import android.annotation.SuppressLint;
import com.avito.android.J0;
import com.avito.android.str_seller_orders_calendar.strorderscalendar.items.calendar_day_stub.CalendarDayStubItem;
import com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.StrOrdersCalendarState;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: StrOrdersCalendarViewStateBuilder.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/E;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/D;", "a", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class E implements D {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    @SuppressLint({"HardcodeStringDetector"})
    public static final SimpleDateFormat f290978b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    @SuppressLint({"HardcodeStringDetector"})
    public static final SimpleDateFormat f290979c;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final J0 f290980a;

    /* compiled from: StrOrdersCalendarViewStateBuilder.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0013\u001a\n \u0012*\u0004\u0018\u00010\u00110\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/E$a;", "", "<init>", "()V", "", "HAS_STUB_TAG_THRESHOLD_PERCENT", "I", "STUB_DATES_COUNT", "STUB_FLATS_COUNT", "STUB_TAGS_START_OFFSET", "Ljava/text/SimpleDateFormat;", "currentMonthAndYearFormatter", "Ljava/text/SimpleDateFormat;", "datesItemsDateFormatter", "Ljava/text/DecimalFormatSymbols;", "priceDecimalFormat", "Ljava/text/DecimalFormatSymbols;", "Ljava/util/Locale;", "kotlin.jvm.PlatformType", "ruLocale", "Ljava/util/Locale;", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: StrOrdersCalendarViewStateBuilder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[StrOrdersCalendarState.LoadingType.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                StrOrdersCalendarState.LoadingType loadingType = StrOrdersCalendarState.LoadingType.f291059b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                StrOrdersCalendarState.LoadingType loadingType2 = StrOrdersCalendarState.LoadingType.f291059b;
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                StrOrdersCalendarState.LoadingType loadingType3 = StrOrdersCalendarState.LoadingType.f291059b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        new a(null);
        Locale localeForLanguageTag = Locale.forLanguageTag("ru");
        f290978b = new SimpleDateFormat("LLLL, yyyy", localeForLanguageTag);
        f290979c = new SimpleDateFormat("EE, dd", localeForLanguageTag);
        new DecimalFormatSymbols().setGroupingSeparator(' ');
    }

    @Inject
    public E(@Y61.k J0 j02) {
        this.f290980a = j02;
    }

    public static ArrayList d() {
        kotlin.random.f.f406882b.getClass();
        kotlin.random.f fVar = kotlin.random.f.f406883c;
        int i12 = 0;
        boolean z12 = fVar.l(0, 100) > 40;
        int iL2 = fVar.l(0, 16);
        int i13 = iL2 + 1;
        int iL3 = fVar.l(i13, 20);
        ArrayList arrayList = new ArrayList();
        while (i12 < 20) {
            arrayList.add(new CalendarDayStubItem(String.valueOf(i12), !z12 ? CalendarDayStubItem.StubTagType.f290883b : iL2 == i12 ? CalendarDayStubItem.StubTagType.f290885d : (i13 > i12 || i12 >= iL3) ? i12 == iL3 ? CalendarDayStubItem.StubTagType.f290884c : CalendarDayStubItem.StubTagType.f290883b : CalendarDayStubItem.StubTagType.f290886e));
            i12++;
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008d  */
    @Override // com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.D
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.StrOrdersCalendarState a(@Y61.k com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.StrOrdersCalendarState r19) {
        /*
            r18 = this;
            r0 = r19
            com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.StrOrdersCalendarState$LoadingType r1 = r0.f291048g
            int r1 = r1.ordinal()
            r2 = 3
            r3 = 1
            if (r1 == 0) goto L4d
            if (r1 == r3) goto L4d
            r3 = 2
            if (r1 == r3) goto L3f
            if (r1 != r2) goto L39
            com.avito.android.remote.error.ApiError r1 = r0.f291049h
            boolean r1 = r1 instanceof com.avito.android.remote.error.ApiError.NetworkIOError
            if (r1 == 0) goto L28
            com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.a$c r1 = new com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.a$c
            r2 = 2130972585(0x7f040fa9, float:1.755394E38)
            r3 = 2131953631(0x7f1307df, float:1.9543738E38)
            r4 = 2131953630(0x7f1307de, float:1.9543736E38)
            r1.<init>(r2, r3, r4)
            goto L36
        L28:
            com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.a$c r1 = new com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.a$c
            r2 = 2130972595(0x7f040fb3, float:1.7553961E38)
            r3 = 2131953636(0x7f1307e4, float:1.9543749E38)
            r4 = 2131953634(0x7f1307e2, float:1.9543745E38)
            r1.<init>(r2, r3, r4)
        L36:
            r15 = r1
            goto L99
        L39:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L3f:
            com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.a$b r7 = new com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.a$b
            boolean r5 = r0.f291054m
            r6 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            r15 = r7
            goto L99
        L4d:
            java.text.SimpleDateFormat r1 = com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.E.f290978b
            java.util.Date r4 = r0.f291044c
            r5 = 0
            if (r4 == 0) goto L63
            com.avito.android.str_seller_orders_calendar.utils.a r6 = com.avito.android.str_seller_orders_calendar.utils.a.f291211a
            java.lang.String r7 = r1.format(r4)
            r6.getClass()
            java.lang.String r6 = com.avito.android.str_seller_orders_calendar.utils.a.c(r7)
            r8 = r6
            goto L64
        L63:
            r8 = r5
        L64:
            if (r4 == 0) goto L77
            com.avito.android.str_seller_orders_calendar.utils.a r5 = com.avito.android.str_seller_orders_calendar.utils.a.f291211a
            java.lang.String r1 = r1.format(r4)
            r5.getClass()
            java.lang.String r1 = com.avito.android.str_seller_orders_calendar.utils.a.c(r1)
            java.lang.String r5 = kotlin.text.C43066x.t0(r2, r1)
        L77:
            r9 = r5
            r1 = 0
            java.util.Date r2 = r0.f291043b
            if (r2 == 0) goto L8d
            if (r4 != 0) goto L80
            goto L8d
        L80:
            com.avito.android.str_seller_orders_calendar.utils.a r5 = com.avito.android.str_seller_orders_calendar.utils.a.f291211a
            r5.getClass()
            boolean r2 = com.avito.android.str_seller_orders_calendar.utils.a.h(r2, r4)
            if (r2 != 0) goto L8d
            r10 = r3
            goto L8e
        L8d:
            r10 = r1
        L8e:
            com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.a$b r1 = new com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.a$b
            boolean r11 = r0.f291054m
            BF0.a r12 = r0.f291056o
            r7 = r1
            r7.<init>(r8, r9, r10, r11, r12)
            goto L36
        L99:
            r14 = 0
            r16 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r17 = 49151(0xbfff, float:6.8875E-41)
            r0 = r19
            com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.StrOrdersCalendarState r0 = com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.StrOrdersCalendarState.a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.E.a(com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.StrOrdersCalendarState):com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.StrOrdersCalendarState");
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0125  */
    @Override // com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.D
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.StrOrdersCalendarState b(@Y61.k com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.StrOrdersCalendarState r30) {
        /*
            Method dump skipped, instructions count: 667
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.E.b(com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.StrOrdersCalendarState):com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.StrOrdersCalendarState");
    }

    @Override // com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.D
    @Y61.k
    public final StrOrdersCalendarState c(@Y61.k StrOrdersCalendarState strOrdersCalendarState) {
        return a(b(strOrdersCalendarState));
    }
}
