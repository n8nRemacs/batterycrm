package com.avito.android.serp_core.timer;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Counter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp_core/timer/CounterFormat;", "", "_avito-discouraged_avito-libs_serp-core_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CounterFormat {

    /* renamed from: b, reason: collision with root package name */
    public static final CounterFormat f273988b;

    /* renamed from: c, reason: collision with root package name */
    public static final CounterFormat f273989c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ CounterFormat[] f273990d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a f273991e;

    static {
        CounterFormat counterFormat = new CounterFormat("WITH_DAYS", 0);
        f273988b = counterFormat;
        CounterFormat counterFormat2 = new CounterFormat("TOTAL_HOURS", 1);
        f273989c = counterFormat2;
        CounterFormat[] counterFormatArr = {counterFormat, counterFormat2};
        f273990d = counterFormatArr;
        f273991e = c.a(counterFormatArr);
    }

    public CounterFormat() {
        throw null;
    }

    public static CounterFormat valueOf(String str) {
        return (CounterFormat) Enum.valueOf(CounterFormat.class, str);
    }

    public static CounterFormat[] values() {
        return (CounterFormat[]) f273990d.clone();
    }
}
