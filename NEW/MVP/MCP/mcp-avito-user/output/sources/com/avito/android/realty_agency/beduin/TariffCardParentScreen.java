package com.avito.android.realty_agency.beduin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TariffCardDeeplinkFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/realty_agency/beduin/TariffCardParentScreen;", "", "_avito_realty-agency_shared_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class TariffCardParentScreen {

    /* renamed from: c, reason: collision with root package name */
    public static final TariffCardParentScreen f250866c;

    /* renamed from: d, reason: collision with root package name */
    public static final TariffCardParentScreen f250867d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ TariffCardParentScreen[] f250868e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f250869f;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f250870b;

    static {
        TariffCardParentScreen tariffCardParentScreen = new TariffCardParentScreen("DEAL_CABINET", 0, "agent_cabinet_widget");
        f250866c = tariffCardParentScreen;
        TariffCardParentScreen tariffCardParentScreen2 = new TariffCardParentScreen("AGENCY_SEARCH", 1, "prof_search");
        f250867d = tariffCardParentScreen2;
        TariffCardParentScreen[] tariffCardParentScreenArr = {tariffCardParentScreen, tariffCardParentScreen2};
        f250868e = tariffCardParentScreenArr;
        f250869f = kotlin.enums.c.a(tariffCardParentScreenArr);
    }

    public TariffCardParentScreen(String str, int i12, String str2) {
        this.f250870b = str2;
    }

    public static TariffCardParentScreen valueOf(String str) {
        return (TariffCardParentScreen) Enum.valueOf(TariffCardParentScreen.class, str);
    }

    public static TariffCardParentScreen[] values() {
        return (TariffCardParentScreen[]) f250868e.clone();
    }
}
