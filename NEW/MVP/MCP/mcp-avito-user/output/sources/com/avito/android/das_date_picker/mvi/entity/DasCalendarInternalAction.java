package com.avito.android.das_date_picker.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import bu.C25712a;
import bu.C25713b;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.bxcontent.mvi.entity.f;
import com.avito.android.das_date_picker.model.DasCalendarInitParameters;
import java.util.Date;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DasCalendarInternalAction.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/das_date_picker/mvi/entity/DasCalendarInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "CloseScreen", "DayClick", "Init", "PassSelectedDate", "ScrollToPosition", "ShowCalendarContent", "ShowLoading", "Lcom/avito/android/das_date_picker/mvi/entity/DasCalendarInternalAction$CloseScreen;", "Lcom/avito/android/das_date_picker/mvi/entity/DasCalendarInternalAction$DayClick;", "Lcom/avito/android/das_date_picker/mvi/entity/DasCalendarInternalAction$Init;", "Lcom/avito/android/das_date_picker/mvi/entity/DasCalendarInternalAction$PassSelectedDate;", "Lcom/avito/android/das_date_picker/mvi/entity/DasCalendarInternalAction$ScrollToPosition;", "Lcom/avito/android/das_date_picker/mvi/entity/DasCalendarInternalAction$ShowCalendarContent;", "Lcom/avito/android/das_date_picker/mvi/entity/DasCalendarInternalAction$ShowLoading;", "_avito_das-date-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface DasCalendarInternalAction extends n {

    /* compiled from: DasCalendarInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/das_date_picker/mvi/entity/DasCalendarInternalAction$CloseScreen;", "Lcom/avito/android/das_date_picker/mvi/entity/DasCalendarInternalAction;", "<init>", "()V", "_avito_das-date-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseScreen implements DasCalendarInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseScreen f132373b = new CloseScreen();

        private CloseScreen() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CloseScreen);
        }

        public final int hashCode() {
            return -167088637;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: DasCalendarInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/das_date_picker/mvi/entity/DasCalendarInternalAction$DayClick;", "Lcom/avito/android/das_date_picker/mvi/entity/DasCalendarInternalAction;", "_avito_das-date-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DayClick implements DasCalendarInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Date f132374b;

        public DayClick(@k Date date) {
            this.f132374b = date;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DayClick) && L.f(this.f132374b, ((DayClick) obj).f132374b);
        }

        public final int hashCode() {
            return this.f132374b.hashCode();
        }

        @k
        public final String toString() {
            return f.n(new StringBuilder("DayClick(date="), this.f132374b, ')');
        }
    }

    /* compiled from: DasCalendarInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/das_date_picker/mvi/entity/DasCalendarInternalAction$Init;", "Lcom/avito/android/das_date_picker/mvi/entity/DasCalendarInternalAction;", "_avito_das-date-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Init implements DasCalendarInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DasCalendarInitParameters f132375b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Date f132376c;

        public Init(@k DasCalendarInitParameters dasCalendarInitParameters, @k Date date) {
            this.f132375b = dasCalendarInitParameters;
            this.f132376c = date;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Init)) {
                return false;
            }
            Init init = (Init) obj;
            return L.f(this.f132375b, init.f132375b) && L.f(this.f132376c, init.f132376c);
        }

        public final int hashCode() {
            return this.f132376c.hashCode() + (this.f132375b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Init(initParameters=");
            sb2.append(this.f132375b);
            sb2.append(", todayDate=");
            return f.n(sb2, this.f132376c, ')');
        }
    }

    /* compiled from: DasCalendarInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/das_date_picker/mvi/entity/DasCalendarInternalAction$PassSelectedDate;", "Lcom/avito/android/das_date_picker/mvi/entity/DasCalendarInternalAction;", "_avito_das-date-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PassSelectedDate implements DasCalendarInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Date f132377b;

        public PassSelectedDate(@k Date date) {
            this.f132377b = date;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PassSelectedDate) && L.f(this.f132377b, ((PassSelectedDate) obj).f132377b);
        }

        public final int hashCode() {
            return this.f132377b.hashCode();
        }

        @k
        public final String toString() {
            return f.n(new StringBuilder("PassSelectedDate(selectedDate="), this.f132377b, ')');
        }
    }

    /* compiled from: DasCalendarInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/das_date_picker/mvi/entity/DasCalendarInternalAction$ScrollToPosition;", "Lcom/avito/android/das_date_picker/mvi/entity/DasCalendarInternalAction;", "_avito_das-date-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ScrollToPosition implements DasCalendarInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final int f132378b;

        public ScrollToPosition(int i12) {
            this.f132378b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ScrollToPosition) && this.f132378b == ((ScrollToPosition) obj).f132378b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f132378b);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("ScrollToPosition(position="), this.f132378b, ')');
        }
    }

    /* compiled from: DasCalendarInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/das_date_picker/mvi/entity/DasCalendarInternalAction$ShowCalendarContent;", "Lcom/avito/android/das_date_picker/mvi/entity/DasCalendarInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_das-date-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowCalendarContent implements DasCalendarInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C25713b f132379b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final List<C25712a> f132380c;

        public ShowCalendarContent(@k C25713b c25713b, @k List<C25712a> list) {
            this.f132379b = c25713b;
            this.f132380c = list;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF220626e() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowCalendarContent)) {
                return false;
            }
            ShowCalendarContent showCalendarContent = (ShowCalendarContent) obj;
            return L.f(this.f132379b, showCalendarContent.f132379b) && L.f(this.f132380c, showCalendarContent.f132380c);
        }

        public final int hashCode() {
            return this.f132380c.hashCode() + (this.f132379b.f57531a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowCalendarContent(strCalendarData=");
            sb2.append(this.f132379b);
            sb2.append(", calendarItems=");
            return H.p(sb2, this.f132380c, ')');
        }
    }

    /* compiled from: DasCalendarInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/das_date_picker/mvi/entity/DasCalendarInternalAction$ShowLoading;", "Lcom/avito/android/das_date_picker/mvi/entity/DasCalendarInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "_avito_das-date-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowLoading extends TrackableLoadingStarted implements DasCalendarInternalAction {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final G0 f132381d;

        public ShowLoading() {
            this(null, 1, null);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowLoading) && L.f(this.f132381d, ((ShowLoading) obj).f132381d);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableLoadingStarted
        public final int hashCode() {
            return this.f132381d.hashCode();
        }

        @k
        public final String toString() {
            return c.v(new StringBuilder("ShowLoading(stub="), this.f132381d, ')');
        }

        public ShowLoading(G0 g02, int i12, C42822w c42822w) {
            this.f132381d = (i12 & 1) != 0 ? G0.f406611a : g02;
        }
    }
}
