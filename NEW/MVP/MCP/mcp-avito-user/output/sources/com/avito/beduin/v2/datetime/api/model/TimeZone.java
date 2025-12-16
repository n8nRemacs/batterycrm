package com.avito.beduin.v2.datetime.api.model;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TimeZone.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/datetime/api/model/TimeZone;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TimeZone {

    /* renamed from: b, reason: collision with root package name */
    public static final TimeZone f336386b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ TimeZone[] f336387c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a f336388d;

    static {
        TimeZone timeZone = new TimeZone("System", 0);
        f336386b = timeZone;
        TimeZone[] timeZoneArr = {timeZone, new TimeZone("UTC", 1)};
        f336387c = timeZoneArr;
        f336388d = c.a(timeZoneArr);
    }

    public TimeZone() {
        throw null;
    }

    public static TimeZone valueOf(String str) {
        return (TimeZone) Enum.valueOf(TimeZone.class, str);
    }

    public static TimeZone[] values() {
        return (TimeZone[]) f336387c.clone();
    }
}
