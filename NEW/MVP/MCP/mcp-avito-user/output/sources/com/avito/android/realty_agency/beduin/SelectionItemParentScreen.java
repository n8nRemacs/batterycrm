package com.avito.android.realty_agency.beduin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SelectionItemDeeplinkFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/realty_agency/beduin/SelectionItemParentScreen;", "", "_avito_realty-agency_shared_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class SelectionItemParentScreen {

    /* renamed from: c, reason: collision with root package name */
    public static final SelectionItemParentScreen f250859c;

    /* renamed from: d, reason: collision with root package name */
    public static final SelectionItemParentScreen f250860d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ SelectionItemParentScreen[] f250861e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f250862f;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f250863b;

    static {
        SelectionItemParentScreen selectionItemParentScreen = new SelectionItemParentScreen("AGENCY_SEARCH", 0, "prof_search");
        f250859c = selectionItemParentScreen;
        SelectionItemParentScreen selectionItemParentScreen2 = new SelectionItemParentScreen("DEAL_ROOM", 1, "deals");
        f250860d = selectionItemParentScreen2;
        SelectionItemParentScreen[] selectionItemParentScreenArr = {selectionItemParentScreen, selectionItemParentScreen2, new SelectionItemParentScreen("LOT_ITEM_CARD", 2, "flat_card")};
        f250861e = selectionItemParentScreenArr;
        f250862f = kotlin.enums.c.a(selectionItemParentScreenArr);
    }

    public SelectionItemParentScreen(String str, int i12, String str2) {
        this.f250863b = str2;
    }

    public static SelectionItemParentScreen valueOf(String str) {
        return (SelectionItemParentScreen) Enum.valueOf(SelectionItemParentScreen.class, str);
    }

    public static SelectionItemParentScreen[] values() {
        return (SelectionItemParentScreen[]) f250861e.clone();
    }
}
