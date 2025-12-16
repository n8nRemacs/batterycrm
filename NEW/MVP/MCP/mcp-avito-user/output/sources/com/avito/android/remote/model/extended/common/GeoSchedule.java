package com.avito.android.remote.model.extended.common;

import Y61.k;
import Y61.l;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;

/* compiled from: GeoSchedule.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0002\r\u000eB!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/avito/android/remote/model/extended/common/GeoSchedule;", "", "days", "Lcom/avito/android/remote/model/extended/common/GeoSchedule$Days;", "workHours", "Lcom/avito/android/remote/model/extended/common/GeoSchedule$TimeRange;", "breakHours", "(Lcom/avito/android/remote/model/extended/common/GeoSchedule$Days;Lcom/avito/android/remote/model/extended/common/GeoSchedule$TimeRange;Lcom/avito/android/remote/model/extended/common/GeoSchedule$TimeRange;)V", "getBreakHours", "()Lcom/avito/android/remote/model/extended/common/GeoSchedule$TimeRange;", "getDays", "()Lcom/avito/android/remote/model/extended/common/GeoSchedule$Days;", "getWorkHours", "Days", "TimeRange", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class GeoSchedule {

    @c("breakHours")
    @l
    private final TimeRange breakHours;

    @c("days")
    @k
    private final Days days;

    @c("workHours")
    @l
    private final TimeRange workHours;

    /* compiled from: GeoSchedule.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\u0018\u00002\u00020\u0001BK\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000f\u0010\fR\u001a\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0010\u0010\fR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0011\u0010\fR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0012\u0010\fR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0013\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/avito/android/remote/model/extended/common/GeoSchedule$Days;", "", "monday", "", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getFriday", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMonday", "getSaturday", "getSunday", "getThursday", "getTuesday", "getWednesday", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Days {

        @c("friday")
        @l
        private final Boolean friday;

        @c("monday")
        @l
        private final Boolean monday;

        @c("saturday")
        @l
        private final Boolean saturday;

        @c("sunday")
        @l
        private final Boolean sunday;

        @c("thursday")
        @l
        private final Boolean thursday;

        @c("tuesday")
        @l
        private final Boolean tuesday;

        @c("wednesday")
        @l
        private final Boolean wednesday;

        public Days(@l Boolean bool, @l Boolean bool2, @l Boolean bool3, @l Boolean bool4, @l Boolean bool5, @l Boolean bool6, @l Boolean bool7) {
            this.monday = bool;
            this.tuesday = bool2;
            this.wednesday = bool3;
            this.thursday = bool4;
            this.friday = bool5;
            this.saturday = bool6;
            this.sunday = bool7;
        }

        @l
        public final Boolean getFriday() {
            return this.friday;
        }

        @l
        public final Boolean getMonday() {
            return this.monday;
        }

        @l
        public final Boolean getSaturday() {
            return this.saturday;
        }

        @l
        public final Boolean getSunday() {
            return this.sunday;
        }

        @l
        public final Boolean getThursday() {
            return this.thursday;
        }

        @l
        public final Boolean getTuesday() {
            return this.tuesday;
        }

        @l
        public final Boolean getWednesday() {
            return this.wednesday;
        }
    }

    /* compiled from: GeoSchedule.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007R\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/avito/android/remote/model/extended/common/GeoSchedule$TimeRange;", "", "minutes", "", "", "allDay", "", "(Ljava/util/List;Ljava/lang/Boolean;)V", "getAllDay", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMinutes", "()Ljava/util/List;", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TimeRange {

        @c("allDay")
        @l
        private final Boolean allDay;

        @c("minutes")
        @l
        private final List<Integer> minutes;

        public TimeRange(@l List<Integer> list, @l Boolean bool) {
            this.minutes = list;
            this.allDay = bool;
        }

        @l
        public final Boolean getAllDay() {
            return this.allDay;
        }

        @l
        public final List<Integer> getMinutes() {
            return this.minutes;
        }
    }

    public GeoSchedule(@k Days days, @l TimeRange timeRange, @l TimeRange timeRange2) {
        this.days = days;
        this.workHours = timeRange;
        this.breakHours = timeRange2;
    }

    @l
    public final TimeRange getBreakHours() {
        return this.breakHours;
    }

    @k
    public final Days getDays() {
        return this.days;
    }

    @l
    public final TimeRange getWorkHours() {
        return this.workHours;
    }
}
