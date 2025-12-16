package com.akita.compose.component.date_picker.utils;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DisableDatesOption.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/akita/compose/component/date_picker/utils/DisableDatesOption;", "", "date-picker_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DisableDatesOption {

    /* renamed from: b, reason: collision with root package name */
    public static final DisableDatesOption f61406b;

    /* renamed from: c, reason: collision with root package name */
    public static final DisableDatesOption f61407c;

    /* renamed from: d, reason: collision with root package name */
    public static final DisableDatesOption f61408d;

    /* renamed from: e, reason: collision with root package name */
    public static final DisableDatesOption f61409e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ DisableDatesOption[] f61410f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f61411g;

    static {
        DisableDatesOption disableDatesOption = new DisableDatesOption("DependsOnRange", 0);
        f61406b = disableDatesOption;
        DisableDatesOption disableDatesOption2 = new DisableDatesOption("DependsOnRangeWithPastDisabled", 1);
        f61407c = disableDatesOption2;
        DisableDatesOption disableDatesOption3 = new DisableDatesOption("DependsOnRangeWithFutureDisabled", 2);
        f61408d = disableDatesOption3;
        DisableDatesOption disableDatesOption4 = new DisableDatesOption("DependsOnRangeWithPastAndFutureDisabled", 3);
        f61409e = disableDatesOption4;
        DisableDatesOption[] disableDatesOptionArr = {disableDatesOption, disableDatesOption2, disableDatesOption3, disableDatesOption4};
        f61410f = disableDatesOptionArr;
        f61411g = kotlin.enums.c.a(disableDatesOptionArr);
    }

    public DisableDatesOption() {
        throw null;
    }

    public static DisableDatesOption valueOf(String str) {
        return (DisableDatesOption) Enum.valueOf(DisableDatesOption.class, str);
    }

    public static DisableDatesOption[] values() {
        return (DisableDatesOption[]) f61410f.clone();
    }
}
