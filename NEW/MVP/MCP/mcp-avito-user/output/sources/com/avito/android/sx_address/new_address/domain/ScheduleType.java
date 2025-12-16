package com.avito.android.sx_address.new_address.domain;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ScheduleType.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/new_address/domain/ScheduleType;", "", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ScheduleType {

    /* renamed from: b, reason: collision with root package name */
    public static final ScheduleType f293617b;

    /* renamed from: c, reason: collision with root package name */
    public static final ScheduleType f293618c;

    /* renamed from: d, reason: collision with root package name */
    public static final ScheduleType f293619d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ ScheduleType[] f293620e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f293621f;

    static {
        ScheduleType scheduleType = new ScheduleType("STANDARD", 0);
        f293617b = scheduleType;
        ScheduleType scheduleType2 = new ScheduleType("CUSTOM", 1);
        f293618c = scheduleType2;
        ScheduleType scheduleType3 = new ScheduleType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 2);
        f293619d = scheduleType3;
        ScheduleType[] scheduleTypeArr = {scheduleType, scheduleType2, scheduleType3};
        f293620e = scheduleTypeArr;
        f293621f = kotlin.enums.c.a(scheduleTypeArr);
    }

    public ScheduleType() {
        throw null;
    }

    public static ScheduleType valueOf(String str) {
        return (ScheduleType) Enum.valueOf(ScheduleType.class, str);
    }

    public static ScheduleType[] values() {
        return (ScheduleType[]) f293620e.clone();
    }
}
