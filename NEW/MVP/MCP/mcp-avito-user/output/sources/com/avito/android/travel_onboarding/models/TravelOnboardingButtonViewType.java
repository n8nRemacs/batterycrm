package com.avito.android.travel_onboarding.models;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TravelOnboardingBlocksInfo.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/travel_onboarding/models/TravelOnboardingButtonViewType;", "", "_avito_travel-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelOnboardingButtonViewType {

    /* renamed from: b, reason: collision with root package name */
    public static final TravelOnboardingButtonViewType f302284b;

    /* renamed from: c, reason: collision with root package name */
    public static final TravelOnboardingButtonViewType f302285c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ TravelOnboardingButtonViewType[] f302286d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a f302287e;

    static {
        TravelOnboardingButtonViewType travelOnboardingButtonViewType = new TravelOnboardingButtonViewType("PRIMARY", 0);
        f302284b = travelOnboardingButtonViewType;
        TravelOnboardingButtonViewType travelOnboardingButtonViewType2 = new TravelOnboardingButtonViewType("SECONDARY", 1);
        f302285c = travelOnboardingButtonViewType2;
        TravelOnboardingButtonViewType[] travelOnboardingButtonViewTypeArr = {travelOnboardingButtonViewType, travelOnboardingButtonViewType2};
        f302286d = travelOnboardingButtonViewTypeArr;
        f302287e = c.a(travelOnboardingButtonViewTypeArr);
    }

    public TravelOnboardingButtonViewType() {
        throw null;
    }

    public static TravelOnboardingButtonViewType valueOf(String str) {
        return (TravelOnboardingButtonViewType) Enum.valueOf(TravelOnboardingButtonViewType.class, str);
    }

    public static TravelOnboardingButtonViewType[] values() {
        return (TravelOnboardingButtonViewType[]) f302286d.clone();
    }
}
