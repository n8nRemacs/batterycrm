package com.avito.android.service_booking_calendar.data.model;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.google.gson.annotations.c;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Day.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001dBE\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u001a\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/avito/android/service_booking_calendar/data/model/Day;", "", "", "id", CrashHianalyticsData.TIME, "Lcom/avito/android/service_booking_calendar/data/model/Day$Type;", "type", "", "isToday", "isFocus", "isDayOff", "isDisabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/service_booking_calendar/data/model/Day$Type;ZZZLjava/lang/Boolean;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "Lcom/avito/android/service_booking_calendar/data/model/Day$Type;", "c", "()Lcom/avito/android/service_booking_calendar/data/model/Day$Type;", "Z", "g", "()Z", "f", "d", "Ljava/lang/Boolean;", "e", "()Ljava/lang/Boolean;", "Type", "_avito_service-booking-calendar_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Day {

    @c("id")
    @l
    private final String id;

    @c("isDayOff")
    private final boolean isDayOff;

    @c("isDisabled")
    @l
    private final Boolean isDisabled;

    @c("isFocus")
    private final boolean isFocus;

    @c("isToday")
    private final boolean isToday;

    @c(CrashHianalyticsData.TIME)
    @k
    private final String time;

    @c("type")
    @l
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Day.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/service_booking_calendar/data/model/Day$Type;", "", "(Ljava/lang/String;I)V", "WITH_ORDER", "NEED_CONFIRMATION", "COMPLETED", "_avito_service-booking-calendar_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        @c("completed")
        public static final Type COMPLETED;

        @c("needConfirmation")
        public static final Type NEED_CONFIRMATION;

        @c("withOrder")
        public static final Type WITH_ORDER;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Type[] f275249b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f275250c;

        static {
            Type type = new Type("WITH_ORDER", 0);
            WITH_ORDER = type;
            Type type2 = new Type("NEED_CONFIRMATION", 1);
            NEED_CONFIRMATION = type2;
            Type type3 = new Type("COMPLETED", 2);
            COMPLETED = type3;
            Type[] typeArr = {type, type2, type3};
            f275249b = typeArr;
            f275250c = kotlin.enums.c.a(typeArr);
        }

        private Type(String str, int i12) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f275249b.clone();
        }
    }

    public Day(@l String str, @k String str2, @l Type type, boolean z12, boolean z13, boolean z14, @l Boolean bool) {
        this.id = str;
        this.time = str2;
        this.type = type;
        this.isToday = z12;
        this.isFocus = z13;
        this.isDayOff = z14;
        this.isDisabled = bool;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getTime() {
        return this.time;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Type getType() {
        return this.type;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getIsDayOff() {
        return this.isDayOff;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final Boolean getIsDisabled() {
        return this.isDisabled;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Day)) {
            return false;
        }
        Day day = (Day) obj;
        return L.f(this.id, day.id) && L.f(this.time, day.time) && this.type == day.type && this.isToday == day.isToday && this.isFocus == day.isFocus && this.isDayOff == day.isDayOff && L.f(this.isDisabled, day.isDisabled);
    }

    /* renamed from: f, reason: from getter */
    public final boolean getIsFocus() {
        return this.isFocus;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getIsToday() {
        return this.isToday;
    }

    public final int hashCode() {
        String str = this.id;
        int iD2 = H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.time);
        Type type = this.type;
        int i12 = r.i(r.i(r.i((iD2 + (type == null ? 0 : type.hashCode())) * 31, 31, this.isToday), 31, this.isFocus), 31, this.isDayOff);
        Boolean bool = this.isDisabled;
        return i12 + (bool != null ? bool.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Day(id=");
        sb2.append(this.id);
        sb2.append(", time=");
        sb2.append(this.time);
        sb2.append(", type=");
        sb2.append(this.type);
        sb2.append(", isToday=");
        sb2.append(this.isToday);
        sb2.append(", isFocus=");
        sb2.append(this.isFocus);
        sb2.append(", isDayOff=");
        sb2.append(this.isDayOff);
        sb2.append(", isDisabled=");
        return C0.g(sb2, this.isDisabled, ')');
    }
}
