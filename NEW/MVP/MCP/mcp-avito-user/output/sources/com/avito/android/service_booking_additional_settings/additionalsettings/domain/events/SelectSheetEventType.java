package com.avito.android.service_booking_additional_settings.additionalsettings.domain.events;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SelectSheetEventType.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_additional_settings/additionalsettings/domain/events/SelectSheetEventType;", "", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SelectSheetEventType {

    /* renamed from: c, reason: collision with root package name */
    public static final SelectSheetEventType f274872c;

    /* renamed from: d, reason: collision with root package name */
    public static final SelectSheetEventType f274873d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ SelectSheetEventType[] f274874e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f274875f;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f274876b;

    static {
        SelectSheetEventType selectSheetEventType = new SelectSheetEventType("TIME_GAP", 0, "set_time_gap");
        f274872c = selectSheetEventType;
        SelectSheetEventType selectSheetEventType2 = new SelectSheetEventType("TECH_BREAK", 1, "set_tech_break");
        f274873d = selectSheetEventType2;
        SelectSheetEventType[] selectSheetEventTypeArr = {selectSheetEventType, selectSheetEventType2};
        f274874e = selectSheetEventTypeArr;
        f274875f = c.a(selectSheetEventTypeArr);
    }

    public SelectSheetEventType(String str, int i12, String str2) {
        this.f274876b = str2;
    }

    public static SelectSheetEventType valueOf(String str) {
        return (SelectSheetEventType) Enum.valueOf(SelectSheetEventType.class, str);
    }

    public static SelectSheetEventType[] values() {
        return (SelectSheetEventType[]) f274874e.clone();
    }
}
