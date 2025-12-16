package com.avito.beduin.v2.functions.datetime.model;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TimeUnit.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/functions/datetime/model/TimeUnit;", "", "date-time_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TimeUnit {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ TimeUnit[] f337156b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a f337157c;

    static {
        TimeUnit[] timeUnitArr = {new TimeUnit("Hours", 0), new TimeUnit("Minutes", 1), new TimeUnit("Seconds", 2), new TimeUnit("Millis", 3)};
        f337156b = timeUnitArr;
        f337157c = c.a(timeUnitArr);
    }

    public TimeUnit() {
        throw null;
    }

    public static TimeUnit valueOf(String str) {
        return (TimeUnit) Enum.valueOf(TimeUnit.class, str);
    }

    public static TimeUnit[] values() {
        return (TimeUnit[]) f337156b.clone();
    }
}
