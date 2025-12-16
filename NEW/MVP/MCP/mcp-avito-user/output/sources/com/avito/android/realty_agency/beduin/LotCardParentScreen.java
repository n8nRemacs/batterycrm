package com.avito.android.realty_agency.beduin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LotCardDeeplinkFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/realty_agency/beduin/LotCardParentScreen;", "", "_avito_realty-agency_shared_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class LotCardParentScreen {

    /* renamed from: c, reason: collision with root package name */
    public static final LotCardParentScreen f250850c;

    /* renamed from: d, reason: collision with root package name */
    public static final LotCardParentScreen f250851d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ LotCardParentScreen[] f250852e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f250853f;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f250854b;

    static {
        LotCardParentScreen lotCardParentScreen = new LotCardParentScreen("AGENCY_SEARCH", 0, "prof_search_flats");
        f250850c = lotCardParentScreen;
        LotCardParentScreen lotCardParentScreen2 = new LotCardParentScreen("CHECKERBOARD", 1, "checkerboard");
        f250851d = lotCardParentScreen2;
        LotCardParentScreen[] lotCardParentScreenArr = {lotCardParentScreen, lotCardParentScreen2};
        f250852e = lotCardParentScreenArr;
        f250853f = kotlin.enums.c.a(lotCardParentScreenArr);
    }

    public LotCardParentScreen(String str, int i12, String str2) {
        this.f250854b = str2;
    }

    public static LotCardParentScreen valueOf(String str) {
        return (LotCardParentScreen) Enum.valueOf(LotCardParentScreen.class, str);
    }

    public static LotCardParentScreen[] values() {
        return (LotCardParentScreen[]) f250852e.clone();
    }
}
