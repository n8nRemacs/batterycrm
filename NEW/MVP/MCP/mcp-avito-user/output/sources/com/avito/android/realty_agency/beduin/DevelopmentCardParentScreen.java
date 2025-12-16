package com.avito.android.realty_agency.beduin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DevelopmentCardDeeplinkFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/realty_agency/beduin/DevelopmentCardParentScreen;", "", "_avito_realty-agency_shared_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class DevelopmentCardParentScreen {

    /* renamed from: c, reason: collision with root package name */
    public static final DevelopmentCardParentScreen f250844c;

    /* renamed from: d, reason: collision with root package name */
    public static final DevelopmentCardParentScreen f250845d;

    /* renamed from: e, reason: collision with root package name */
    public static final DevelopmentCardParentScreen f250846e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ DevelopmentCardParentScreen[] f250847f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f250848g;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f250849b;

    static {
        DevelopmentCardParentScreen developmentCardParentScreen = new DevelopmentCardParentScreen("AGENCY_SEARCH_SNIPPET", 0, "prof_search_jk");
        f250844c = developmentCardParentScreen;
        DevelopmentCardParentScreen developmentCardParentScreen2 = new DevelopmentCardParentScreen("AGENCY_SEARCH_MAP_TOOLTIP", 1, "map_tooltip");
        f250845d = developmentCardParentScreen2;
        DevelopmentCardParentScreen developmentCardParentScreen3 = new DevelopmentCardParentScreen("DEAL_ROOM_DEVELOPMENT_SCREEN_NAME", 2, "deal_development");
        f250846e = developmentCardParentScreen3;
        DevelopmentCardParentScreen[] developmentCardParentScreenArr = {developmentCardParentScreen, developmentCardParentScreen2, developmentCardParentScreen3};
        f250847f = developmentCardParentScreenArr;
        f250848g = kotlin.enums.c.a(developmentCardParentScreenArr);
    }

    public DevelopmentCardParentScreen(String str, int i12, String str2) {
        this.f250849b = str2;
    }

    public static DevelopmentCardParentScreen valueOf(String str) {
        return (DevelopmentCardParentScreen) Enum.valueOf(DevelopmentCardParentScreen.class, str);
    }

    public static DevelopmentCardParentScreen[] values() {
        return (DevelopmentCardParentScreen[]) f250847f.clone();
    }
}
