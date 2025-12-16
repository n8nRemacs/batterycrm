package com.avito.android.sx_address.new_address.domain;

import com.avito.android.R;
import j.e0;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WeekDay.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/new_address/domain/WeekDay;", "", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WeekDay {

    /* renamed from: c, reason: collision with root package name */
    public static final WeekDay f293622c;

    /* renamed from: d, reason: collision with root package name */
    public static final WeekDay f293623d;

    /* renamed from: e, reason: collision with root package name */
    public static final WeekDay f293624e;

    /* renamed from: f, reason: collision with root package name */
    public static final WeekDay f293625f;

    /* renamed from: g, reason: collision with root package name */
    public static final WeekDay f293626g;

    /* renamed from: h, reason: collision with root package name */
    public static final WeekDay f293627h;

    /* renamed from: i, reason: collision with root package name */
    public static final WeekDay f293628i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ WeekDay[] f293629j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f293630k;

    /* renamed from: b, reason: collision with root package name */
    public final int f293631b;

    static {
        WeekDay weekDay = new WeekDay("MONDAY", 0, R.string.schedule_day_monday);
        f293622c = weekDay;
        WeekDay weekDay2 = new WeekDay("TUESDAY", 1, R.string.schedule_day_tuesday);
        f293623d = weekDay2;
        WeekDay weekDay3 = new WeekDay("WEDNESDAY", 2, R.string.schedule_day_wednesday);
        f293624e = weekDay3;
        WeekDay weekDay4 = new WeekDay("THURSDAY", 3, R.string.schedule_day_thursday);
        f293625f = weekDay4;
        WeekDay weekDay5 = new WeekDay("FRIDAY", 4, R.string.schedule_day_friday);
        f293626g = weekDay5;
        WeekDay weekDay6 = new WeekDay("SATURDAY", 5, R.string.schedule_day_saturday);
        f293627h = weekDay6;
        WeekDay weekDay7 = new WeekDay("SUNDAY", 6, R.string.schedule_day_sunday);
        f293628i = weekDay7;
        WeekDay[] weekDayArr = {weekDay, weekDay2, weekDay3, weekDay4, weekDay5, weekDay6, weekDay7};
        f293629j = weekDayArr;
        f293630k = kotlin.enums.c.a(weekDayArr);
    }

    public WeekDay(@e0 String str, int i12, int i13) {
        this.f293631b = i13;
    }

    public static WeekDay valueOf(String str) {
        return (WeekDay) Enum.valueOf(WeekDay.class, str);
    }

    public static WeekDay[] values() {
        return (WeekDay[]) f293629j.clone();
    }
}
