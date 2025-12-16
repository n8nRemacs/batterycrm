package Zs0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.FormattedDateDisplayingType;
import com.avito.android.service_booking_calendar.data.model.Day;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ServiceBookingFlexibleCalendarOverviewResult.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0011\u0014B3\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0002¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\u0016\u0010\u000f¨\u0006\u0017"}, d2 = {"LZs0/b;", "", "", "LZs0/c;", "toolbarActions", "LZs0/b$a;", FormattedDateDisplayingType.TYPE_CALENDAR, "", "todayButton", "LZs0/b$b;", "tooltips", "<init>", "(Ljava/util/List;LZs0/b$a;Ljava/lang/String;Ljava/util/List;)V", "Ljava/util/List;", "c", "()Ljava/util/List;", "LZs0/b$a;", "a", "()LZs0/b$a;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "d", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class b {

    @com.google.gson.annotations.c(FormattedDateDisplayingType.TYPE_CALENDAR)
    @k
    private final a calendar;

    @com.google.gson.annotations.c("todayButton")
    @k
    private final String todayButton;

    @com.google.gson.annotations.c("barButtonActions")
    @k
    private final List<c> toolbarActions;

    @com.google.gson.annotations.c("tooltips")
    @k
    private final List<C1466b> tooltips;

    /* compiled from: ServiceBookingFlexibleCalendarOverviewResult.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LZs0/b$a;", "", "", "Lcom/avito/android/service_booking_calendar/data/model/Day;", "days", "<init>", "(Ljava/util/List;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        @com.google.gson.annotations.c("days")
        @k
        private final List<Day> days;

        public a(@k List<Day> list) {
            this.days = list;
        }

        @k
        public final List<Day> a() {
            return this.days;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.days, ((a) obj).days);
        }

        public final int hashCode() {
            return this.days.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("Calendar(days="), this.days, ')');
        }
    }

    /* compiled from: ServiceBookingFlexibleCalendarOverviewResult.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, d2 = {"LZs0/b$b;", "", "", "iconType", "title", "text", "buttonTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "d", "c", "a", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Zs0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C1466b {

        @com.google.gson.annotations.c("buttonTitle")
        @l
        private final String buttonTitle;

        @com.google.gson.annotations.c("iconType")
        @k
        private final String iconType;

        @com.google.gson.annotations.c("text")
        @k
        private final String text;

        @com.google.gson.annotations.c("title")
        @k
        private final String title;

        public C1466b(@k String str, @k String str2, @k String str3, @l String str4) {
            this.iconType = str;
            this.title = str2;
            this.text = str3;
            this.buttonTitle = str4;
        }

        @l
        /* renamed from: a, reason: from getter */
        public final String getButtonTitle() {
            return this.buttonTitle;
        }

        @k
        /* renamed from: b, reason: from getter */
        public final String getIconType() {
            return this.iconType;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @k
        /* renamed from: d, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1466b)) {
                return false;
            }
            C1466b c1466b = (C1466b) obj;
            return L.f(this.iconType, c1466b.iconType) && L.f(this.title, c1466b.title) && L.f(this.text, c1466b.text) && L.f(this.buttonTitle, c1466b.buttonTitle);
        }

        public final int hashCode() {
            int iD2 = H.d(H.d(this.iconType.hashCode() * 31, 31, this.title), 31, this.text);
            String str = this.buttonTitle;
            return iD2 + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("TooltipModel(iconType=");
            sb2.append(this.iconType);
            sb2.append(", title=");
            sb2.append(this.title);
            sb2.append(", text=");
            sb2.append(this.text);
            sb2.append(", buttonTitle=");
            return C22026a.c(sb2, this.buttonTitle, ')');
        }
    }

    public b(@k List<c> list, @k a aVar, @k String str, @k List<C1466b> list2) {
        this.toolbarActions = list;
        this.calendar = aVar;
        this.todayButton = str;
        this.tooltips = list2;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final a getCalendar() {
        return this.calendar;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getTodayButton() {
        return this.todayButton;
    }

    @k
    public final List<c> c() {
        return this.toolbarActions;
    }

    @k
    public final List<C1466b> d() {
        return this.tooltips;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.toolbarActions, bVar.toolbarActions) && L.f(this.calendar, bVar.calendar) && L.f(this.todayButton, bVar.todayButton) && L.f(this.tooltips, bVar.tooltips);
    }

    public final int hashCode() {
        return this.tooltips.hashCode() + H.d((this.calendar.hashCode() + (this.toolbarActions.hashCode() * 31)) * 31, 31, this.todayButton);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ServiceBookingFlexibleCalendarOverviewResult(toolbarActions=");
        sb2.append(this.toolbarActions);
        sb2.append(", calendar=");
        sb2.append(this.calendar);
        sb2.append(", todayButton=");
        sb2.append(this.todayButton);
        sb2.append(", tooltips=");
        return H.p(sb2, this.tooltips, ')');
    }
}
