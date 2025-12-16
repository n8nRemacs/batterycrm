package com.avito.android.str_seller_orders_calendar.monthselector.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.analytics.screens.mvi.n;
import java.util.ArrayList;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MonthSelectorInternalAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/monthselector/mvi/entity/MonthSelectorInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "CloseScreen", "Init", "PassResult", "ScrollToPosition", "Lcom/avito/android/str_seller_orders_calendar/monthselector/mvi/entity/MonthSelectorInternalAction$CloseScreen;", "Lcom/avito/android/str_seller_orders_calendar/monthselector/mvi/entity/MonthSelectorInternalAction$Init;", "Lcom/avito/android/str_seller_orders_calendar/monthselector/mvi/entity/MonthSelectorInternalAction$PassResult;", "Lcom/avito/android/str_seller_orders_calendar/monthselector/mvi/entity/MonthSelectorInternalAction$ScrollToPosition;", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface MonthSelectorInternalAction extends n {

    /* compiled from: MonthSelectorInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/monthselector/mvi/entity/MonthSelectorInternalAction$CloseScreen;", "Lcom/avito/android/str_seller_orders_calendar/monthselector/mvi/entity/MonthSelectorInternalAction;", "()V", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CloseScreen implements MonthSelectorInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseScreen f290453b = new CloseScreen();

        private CloseScreen() {
        }
    }

    /* compiled from: MonthSelectorInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/monthselector/mvi/entity/MonthSelectorInternalAction$Init;", "Lcom/avito/android/str_seller_orders_calendar/monthselector/mvi/entity/MonthSelectorInternalAction;", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Init implements MonthSelectorInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Date f290454b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f290455c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final ArrayList f290456d;

        public Init(@k Date date, @k String str, @l ArrayList arrayList) {
            this.f290454b = date;
            this.f290455c = str;
            this.f290456d = arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Init)) {
                return false;
            }
            Init init = (Init) obj;
            return this.f290454b.equals(init.f290454b) && this.f290455c.equals(init.f290455c) && L.f(this.f290456d, init.f290456d);
        }

        public final int hashCode() {
            int iD2 = H.d(this.f290454b.hashCode() * 31, 31, this.f290455c);
            ArrayList arrayList = this.f290456d;
            return iD2 + (arrayList == null ? 0 : arrayList.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Init(todayDate=");
            sb2.append(this.f290454b);
            sb2.append(", selectedMonth=");
            sb2.append(this.f290455c);
            sb2.append(", items=");
            return e.p(sb2, this.f290456d, ')');
        }
    }

    /* compiled from: MonthSelectorInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/monthselector/mvi/entity/MonthSelectorInternalAction$PassResult;", "Lcom/avito/android/str_seller_orders_calendar/monthselector/mvi/entity/MonthSelectorInternalAction;", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PassResult implements MonthSelectorInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f290457b;

        public PassResult(@k String str) {
            this.f290457b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PassResult) && L.f(this.f290457b, ((PassResult) obj).f290457b);
        }

        public final int hashCode() {
            return this.f290457b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("PassResult(monthId="), this.f290457b, ')');
        }
    }

    /* compiled from: MonthSelectorInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/monthselector/mvi/entity/MonthSelectorInternalAction$ScrollToPosition;", "Lcom/avito/android/str_seller_orders_calendar/monthselector/mvi/entity/MonthSelectorInternalAction;", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ScrollToPosition implements MonthSelectorInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f290458b;

        public ScrollToPosition(int i12) {
            this.f290458b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ScrollToPosition) && this.f290458b == ((ScrollToPosition) obj).f290458b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f290458b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("ScrollToPosition(position="), this.f290458b, ')');
        }
    }
}
