package com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi;

import Qz0.C14953a;
import Uz0.b;
import com.avito.android.str_seller_orders_calendar.analytics.OpenSellerCalendarSource;
import com.avito.android.str_seller_orders_calendar.analytics.ScreenOrientationChangeEvent;
import com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.StrOrdersCalendarInternalAction;
import com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.StrOrdersCalendarState;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: StrOrdersCalendarActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LUz0/b;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarInternalAction;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/StrOrdersCalendarState;", "a", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35130a implements com.avito.android.arch.mvi.a<Uz0.b, StrOrdersCalendarInternalAction, StrOrdersCalendarState> {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f290982e = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.interactor.a f290983a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f290984b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.a f290985c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.str_seller_orders_calendar.analytics.a f290986d;

    /* compiled from: StrOrdersCalendarActor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/a$a;", "", "<init>", "()V", "", "DEFAULT_LEFT_LOAD_MONTHS", "I", "DEFAULT_RIGHT_LOAD_MONTHS", "MAX_LOADED_DAYS_ALLOWED", "PAGINATION_MONTH_TO_LOAD", "a", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.a$a, reason: collision with other inner class name */
    public static final class C8803a {

        /* compiled from: StrOrdersCalendarActor.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/a$a$a;", "", "a", "b", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/a$a$a$a;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/a$a$a$b;", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.a$a$a, reason: collision with other inner class name */
        public interface InterfaceC8804a {

            /* compiled from: StrOrdersCalendarActor.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/a$a$a$a;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/a$a$a;", "<init>", "()V", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.a$a$a$a, reason: collision with other inner class name */
            public static final /* data */ class C8805a implements InterfaceC8804a {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public static final C8805a f290987a = new C8805a();

                public final boolean equals(@Y61.l Object obj) {
                    return this == obj || (obj instanceof C8805a);
                }

                public final int hashCode() {
                    return 1016147922;
                }

                @Y61.k
                public final String toString() {
                    return "Default";
                }
            }

            /* compiled from: StrOrdersCalendarActor.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/a$a$a$b;", "Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/a$a$a;", "<init>", "()V", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.a$a$a$b */
            public static final /* data */ class b implements InterfaceC8804a {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public static final b f290988a = new b();

                public final boolean equals(@Y61.l Object obj) {
                    return this == obj || (obj instanceof b);
                }

                public final int hashCode() {
                    return -1366519126;
                }

                @Y61.k
                public final String toString() {
                    return "Sync";
                }
            }
        }

        public /* synthetic */ C8803a(C42822w c42822w) {
            this();
        }

        public C8803a() {
        }
    }

    static {
        new C8803a(null);
    }

    @Inject
    public C35130a(@Y61.k com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.interactor.a aVar, @Y61.k R0 r02, @Y61.k com.avito.android.str_seller_orders_calendar.strorderscalendar.domain.a aVar2, @Y61.k com.avito.android.str_seller_orders_calendar.analytics.a aVar3) {
        this.f290983a = aVar;
        this.f290984b = r02;
        this.f290985c = aVar2;
        this.f290986d = aVar3;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.C(new p(this, aVar, null), com.avito.android.arch.mvi.utils.h.a(c43197r1, o.f291124l));
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<StrOrdersCalendarInternalAction> b(@Y61.k Uz0.b bVar, @Y61.k StrOrdersCalendarState strOrdersCalendarState) {
        C43210w c43210w;
        if (bVar instanceof b.a) {
            return new C43210w(StrOrdersCalendarInternalAction.CloseScreen.f291010b);
        }
        ScreenOrientationChangeEvent.Companion.TargetOrientation targetOrientation = null;
        if (bVar instanceof b.o) {
            return C43175k.G(new i(strOrdersCalendarState, null));
        }
        if (bVar instanceof b.i) {
            return C43175k.G(new C35133d(strOrdersCalendarState, null));
        }
        if (bVar instanceof b.u) {
            c43210w = new C43210w(new StrOrdersCalendarInternalAction.OpenDeeplink(((b.u) bVar).f16838a));
        } else {
            boolean z12 = bVar instanceof b.e;
            com.avito.android.str_seller_orders_calendar.analytics.a aVar = this.f290986d;
            if (z12) {
                b.e eVar = (b.e) bVar;
                if (strOrdersCalendarState.f291054m) {
                    return new C43210w(new StrOrdersCalendarInternalAction.ToggleFlatRecyclerCollapse(false));
                }
                OpenSellerCalendarSource openSellerCalendarSource = OpenSellerCalendarSource.f290360c;
                String str = eVar.f16822b;
                String strA = aVar.f290372b.a();
                aVar.f290371a.c(new Hz0.b(strA != null ? strA : "", str, openSellerCalendarSource));
                c43210w = new C43210w(new StrOrdersCalendarInternalAction.OpenSellerCalendar(str));
            } else if (bVar instanceof b.f) {
                c43210w = new C43210w(new StrOrdersCalendarInternalAction.AddTooltipShowedItemId(((b.f) bVar).f16823a));
            } else {
                if (bVar instanceof b.h) {
                    return new C43210w(StrOrdersCalendarInternalAction.ToggleShowDates.f291036b);
                }
                boolean z13 = bVar instanceof b.q;
                R0 r02 = this.f290984b;
                if (z13) {
                    return C43175k.I(r02.c(), C43175k.G(new k(this, strOrdersCalendarState, null)));
                }
                if (bVar instanceof b.r) {
                    return C43175k.I(r02.c(), C43175k.G(new l(this, strOrdersCalendarState, null)));
                }
                if (bVar instanceof b.p) {
                    return C43175k.I(r02.c(), C43175k.G(new j(strOrdersCalendarState, (b.p) bVar, null)));
                }
                if (bVar instanceof b.j) {
                    return C43175k.G(new C35134e(strOrdersCalendarState, this, (b.j) bVar, null));
                }
                if (bVar instanceof b.v) {
                    return C43175k.G(new n(this, strOrdersCalendarState, null));
                }
                if (bVar instanceof b.n) {
                    return new C43210w(StrOrdersCalendarInternalAction.RotateScreen.f291030b);
                }
                if (bVar instanceof b.g) {
                    return new C43210w(new StrOrdersCalendarInternalAction.ToggleFlatRecyclerCollapse(true));
                }
                if (bVar instanceof b.d) {
                    return C43175k.G(new C35132c(this, strOrdersCalendarState, (b.d) bVar, null));
                }
                if (bVar instanceof b.t) {
                    return C43175k.G(new m((b.t) bVar, strOrdersCalendarState, this, null));
                }
                if (bVar instanceof b.c) {
                    BF0.a aVar2 = strOrdersCalendarState.f291056o;
                    String str2 = aVar2 != null ? aVar2.f1261a : null;
                    if (str2 != null) {
                        aVar.f290371a.c(new C14953a(String.valueOf(aVar.f290372b.a()), str2));
                    }
                    return new C43210w(StrOrdersCalendarInternalAction.CloseBanner.f291009b);
                }
                if (bVar instanceof b.C1157b) {
                    return C43175k.G(new C35131b(strOrdersCalendarState, null));
                }
                if (bVar instanceof b.s) {
                    return new C43210w(new StrOrdersCalendarInternalAction.UpdateSelectedDateRange(null, true));
                }
                if (bVar instanceof b.l ? true : bVar instanceof b.m) {
                    return C43175k.G(new h(this, strOrdersCalendarState, null));
                }
                if (!(bVar instanceof b.k)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar.getClass();
                Integer num = strOrdersCalendarState.f291055n;
                int i12 = ((b.k) bVar).f16828a;
                if (num != null && num.intValue() != i12) {
                    com.avito.android.account.E e12 = aVar.f290372b;
                    if (e12.b()) {
                        String strA2 = e12.a();
                        String str3 = strA2 != null ? strA2 : "";
                        if (i12 == 1) {
                            targetOrientation = ScreenOrientationChangeEvent.Companion.TargetOrientation.f290366c;
                        } else if (i12 == 2) {
                            targetOrientation = ScreenOrientationChangeEvent.Companion.TargetOrientation.f290367d;
                        }
                        aVar.f290371a.c(new ScreenOrientationChangeEvent(str3, targetOrientation));
                    }
                }
                c43210w = new C43210w(new StrOrdersCalendarInternalAction.ChangeOrientation(i12));
            }
        }
        return c43210w;
    }
}
