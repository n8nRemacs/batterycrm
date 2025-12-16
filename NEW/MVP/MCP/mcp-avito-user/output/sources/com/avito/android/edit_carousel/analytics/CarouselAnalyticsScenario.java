package com.avito.android.edit_carousel.analytics;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CarouselAnalyticsScenario.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_carousel/analytics/CarouselAnalyticsScenario;", "", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CarouselAnalyticsScenario {

    /* renamed from: c, reason: collision with root package name */
    public static final CarouselAnalyticsScenario f146321c;

    /* renamed from: d, reason: collision with root package name */
    public static final CarouselAnalyticsScenario f146322d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ CarouselAnalyticsScenario[] f146323e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f146324f;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f146325b;

    static {
        CarouselAnalyticsScenario carouselAnalyticsScenario = new CarouselAnalyticsScenario("ADD", 0, "add");
        f146321c = carouselAnalyticsScenario;
        CarouselAnalyticsScenario carouselAnalyticsScenario2 = new CarouselAnalyticsScenario("EDIT", 1, "edit");
        f146322d = carouselAnalyticsScenario2;
        CarouselAnalyticsScenario[] carouselAnalyticsScenarioArr = {carouselAnalyticsScenario, carouselAnalyticsScenario2};
        f146323e = carouselAnalyticsScenarioArr;
        f146324f = c.a(carouselAnalyticsScenarioArr);
    }

    public CarouselAnalyticsScenario(String str, int i12, String str2) {
        this.f146325b = str2;
    }

    public static CarouselAnalyticsScenario valueOf(String str) {
        return (CarouselAnalyticsScenario) Enum.valueOf(CarouselAnalyticsScenario.class, str);
    }

    public static CarouselAnalyticsScenario[] values() {
        return (CarouselAnalyticsScenario[]) f146323e.clone();
    }
}
