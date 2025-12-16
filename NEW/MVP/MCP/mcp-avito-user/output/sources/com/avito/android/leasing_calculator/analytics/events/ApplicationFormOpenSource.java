package com.avito.android.leasing_calculator.analytics.events;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LeasingApplicationFormOpenEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/leasing_calculator/analytics/events/ApplicationFormOpenSource;", "", "_avito_leasing-calculator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ApplicationFormOpenSource {

    /* renamed from: c, reason: collision with root package name */
    public static final ApplicationFormOpenSource f175090c;

    /* renamed from: d, reason: collision with root package name */
    public static final ApplicationFormOpenSource f175091d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ ApplicationFormOpenSource[] f175092e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f175093f;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f175094b;

    static {
        ApplicationFormOpenSource applicationFormOpenSource = new ApplicationFormOpenSource("FORM", 0, "form");
        f175090c = applicationFormOpenSource;
        ApplicationFormOpenSource applicationFormOpenSource2 = new ApplicationFormOpenSource("DETAILS", 1, "how_it_works");
        f175091d = applicationFormOpenSource2;
        ApplicationFormOpenSource[] applicationFormOpenSourceArr = {applicationFormOpenSource, applicationFormOpenSource2};
        f175092e = applicationFormOpenSourceArr;
        f175093f = c.a(applicationFormOpenSourceArr);
    }

    public ApplicationFormOpenSource(String str, int i12, String str2) {
        this.f175094b = str2;
    }

    public static ApplicationFormOpenSource valueOf(String str) {
        return (ApplicationFormOpenSource) Enum.valueOf(ApplicationFormOpenSource.class, str);
    }

    public static ApplicationFormOpenSource[] values() {
        return (ApplicationFormOpenSource[]) f175092e.clone();
    }
}
